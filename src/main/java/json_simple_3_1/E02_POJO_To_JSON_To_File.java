package json_simple_3_1;

import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E02_POJO_To_JSON_To_File {

   private void createJSON() {

      // create book object
      Book book = new Book("Thinking in Java", "978-0131872486", 1998,
              new String[]{"Bruce Eckel"});

      // Java objects to JSON file
      try {
         BufferedWriter writer = Files.newBufferedWriter(Paths.get(
                 "src/main/java/resources/book.json"));

         Jsoner.serialize(book, writer);
         writer.flush();
         writer.close();

      } catch (IOException ex) {
         System.out.println("Error");
      }

   }


   public static void main(String[] args) {

      E02_POJO_To_JSON_To_File jojson = new E02_POJO_To_JSON_To_File();

      jojson.createJSON();
   }


}

