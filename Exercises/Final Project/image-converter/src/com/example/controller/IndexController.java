package com.example.controller;

import com.example.ImageHandlerComposition;
import com.example.model.ImageAttr;
import com.example.util.ImageUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.stream.Collectors;


public class IndexController implements Initializable {
    // photo path
    @FXML
    private Label lImageWidth;
    // photo height
    @FXML
    private Label lImageHeight;
    // Photo pixel type
    @FXML
    private Label lImageType;
    // photo path
    @FXML
    private Label lImagePath;
    // Photo preview
    @FXML
    private ImageView ivPreviewImg;
    // convertible extension
    @FXML
    private ComboBox<String> cbConvertExtension;
    // Brightness slider
    @FXML
    private Slider sLight;
    // Whether to use black and white filter
    @FXML
    private RadioButton rbBwIs, rbBwNot;
    // brightness value
    @FXML
    private Label lLightValue;


    /**
     * Upload operation
     */
    public void handleUpload() {
        try {
            // Let users choose which photos to upload
            FileChooser fileChooser = new FileChooser();
            ObservableList<FileChooser.ExtensionFilter> extensionFilters = fileChooser.getExtensionFilters();
            extensionFilters.add(new FileChooser.ExtensionFilter("Image Files", ImageUtils.SUPPORT_IMAGE_EXTENSIONS));
            File file = fileChooser.showOpenDialog(new Stage());
            if (file != null) {
                // Read photo attributes and display
                ImageAttr imageAttr = ImageUtils.getImageAttr(file);
                // Set photo path
                String absolutePath = file.getAbsolutePath();
                lImagePath.setText(absolutePath);
                // Set thumbnail
                lImageHeight.setText(imageAttr.getHeight() + "");
                lImageWidth.setText(imageAttr.getWidth() + "");
                // Setting type
                lImageType.setText(imageAttr.getType());
                ivPreviewImg.setImage(new Image(Files.newInputStream(file.toPath())));
            }
        } catch (IOException e) {
            showAlert("Failed to read photos.");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize convertible drop-down box data
        List<String> collect = ImageUtils.SUPPORT_IMAGE_EXTENSIONS.stream()
                .map(item -> item.substring(2))
                .collect(Collectors.toList());
        collect.add(0, "Original Format");
        cbConvertExtension.setItems(FXCollections.observableArrayList(collect));

        // Initialize whether to use the black and white filter radio button
        ToggleGroup bWTb = new ToggleGroup();
        rbBwIs.setToggleGroup(bWTb);
        rbBwNot.setToggleGroup(bWTb);

        // Set the brightness value change event
        sLight.valueProperty().addListener((observable, oldValue, newValue) -> {
            int value = newValue.intValue();
            lLightValue.setText(value + "");
        });
    }

    /**
     * Prompt box prompt
     *
     * @param message Prompt content
     */
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Tips");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    /**
     * Download photos
     */
    @FXML
    public void download() {
        String originalPath = lImagePath.getText();
        if (originalPath == null || originalPath.length() == 0) {
            showAlert("Please select a photo first.");
            return;
        }

        // The user selects the specified folder to be downloaded to
        DirectoryChooser chooser = new DirectoryChooser();
        File saveDir = chooser.showDialog(new Stage());
        if (saveDir != null) {

            ImageHandlerComposition imageHandlerComposition = new ImageHandlerComposition();

            // Brightness filter
            double lightRate = sLight.getValue();
            if (lightRate != 0D) {
                imageHandlerComposition.addImageHandler((image) -> ImageUtils.adjustLight(image, (int) lightRate));
            }

            // black and white filter
            if (rbBwIs.isSelected()) {
                imageHandlerComposition.addImageHandler((ImageUtils::blackWhiteFilter));
            }

            String selectedExtension = cbConvertExtension.getValue();
            try {
                BufferedImage image = ImageIO.read(new File(lImagePath.getText()));
                // Start filter processing
                BufferedImage resultImage = imageHandlerComposition.process(image);
                String resultExtension;

                // Photo format conversion
                if (!"Original Format".equals(selectedExtension) && selectedExtension != null) {
                    resultExtension = selectedExtension;
                } else {
                    resultExtension = ImageUtils.getExtension(lImagePath.getText());
                }
                // Save to user selected path
                String desktopPath = saveDir.getAbsolutePath();
                String temp = UUID.randomUUID().toString();
                ImageIO.write(resultImage, resultExtension, new File(desktopPath, temp + "." + resultExtension));
                showAlert("Download successful.");
            } catch (IOException e) {
                e.printStackTrace();
                showAlert("Download failed.");
            }
        }
    }
}
