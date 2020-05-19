package json_simple_3_1;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import java.io.Reader;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E04_JSON_Object_File_To_POJO {

   private void createJSON() {
      try {
         // create a reader
         Reader reader = Files.newBufferedReader(Paths.get(
                 "src/main/java/resources/book.json"));

         // read JSON from a file
         JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);

         // create a Dozer mapper
         Mapper mapper = DozerBeanMapperBuilder.buildDefault();

         // convert JsonObject to Book
         Book book = mapper.map(jsonObject, Book.class);

         // print the book
         System.out.println("\n" + book);
         System.out.println(book.getAuthors()[0] + "\n");

         // close the reader
         reader.close();

      } catch (Exception ex) {
         ex.printStackTrace();
      }

   }


   public static void main(String[] args) {

      E04_JSON_Object_File_To_POJO jojson =
              new E04_JSON_Object_File_To_POJO();

      jojson.createJSON();
   }


}

