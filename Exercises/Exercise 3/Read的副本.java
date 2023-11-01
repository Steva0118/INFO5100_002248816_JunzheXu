import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object obj = null;

        try {
            // Create file input stream
            fileInputStream = new FileInputStream(fileName);
            // Create Object input stream which use to read file in input stream
            objectInputStream = new ObjectInputStream(fileInputStream);
            // Read object
            obj = objectInputStream.readObject();
        } finally {
            // Make sure the stream will close
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return obj;
    }
}


