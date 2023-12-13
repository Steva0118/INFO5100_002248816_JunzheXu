package resource;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonParser {

    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/resource/books.json")));
        JSONObject jsonObject = new JSONObject(content);

        JSONArray bookShelf = jsonObject.getJSONArray("BookShelf");
        for (int i = 0; i < bookShelf.length(); i++) {
            JSONObject book = bookShelf.getJSONObject(i);
            System.out.println("Title: " + book.getString("title"));
            System.out.println("Published Year: " + book.getInt("publishedYear"));
            System.out.println("Number of Pages: " + book.getInt("numberOfPages"));

            JSONArray authors = book.getJSONArray("authors");
            for (int j = 0; j < authors.length(); j++) {
                System.out.println("Author: " + authors.getString(j));
            }
            System.out.println();
        }

        // Adding a new book

        JSONObject newBook = new JSONObject();
        newBook.put("title", "New Java Book");
        newBook.put("publishedYear", 2023);
        newBook.put("numberOfPages", 400);
        JSONArray newAuthors = new JSONArray();
        newAuthors.put("New Author");
        newBook.put("authors", newAuthors);

        bookShelf.put(newBook);

        // Printing the modified JSON
        System.out.println(jsonObject.toString(4));
    }
}

