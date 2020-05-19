package json_simple_3_1;

import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E03_List_POJO_To_JSON_To_File {

   private void createJSON() {

      // create books list
    List<Book> books = Arrays.asList(
            new Book("Thinking in Java", "978-0131872486", 1998,
                    new String[]{"Bruce Eckel"}),
            new Book("Head First Java", "0596009208", 2003,
                    new String[]{"Kathy Sierra", "Bert Bates"})
    );

      // Java objects to JSON file
      try {
         BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/java/resources/books.json"));

         Jsoner.serialize(books, writer);
         writer.flush();
         writer.close();

      } catch (IOException ex) {
         System.out.println("Error");
      }

   }


   public static void main(String[] args) {

      E03_List_POJO_To_JSON_To_File jojson = 
              new E03_List_POJO_To_JSON_To_File();

      jojson.createJSON();
   }


}

