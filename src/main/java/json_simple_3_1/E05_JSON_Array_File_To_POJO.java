package json_simple_3_1;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E05_JSON_Array_File_To_POJO {

   private void createJSON() {
      try {
         // create a reader
         Reader reader = Files.newBufferedReader(Paths.get(
                 "src/main/java/resources/books.json"));
         
         // read JSON from a file
         JsonArray objects = Jsoner.deserializeMany(reader);

         // create a Dozer mapper
         Mapper mapper = DozerBeanMapperBuilder.buildDefault();

         // convert JsonArray to List<Book>
         JsonArray jsonArray = (JsonArray) objects.get(0);
         
         List<Book> books = jsonArray.stream()
                 .map(obj -> mapper.map(obj, Book.class))
                 .collect(Collectors.toList());

         // print all books
         books.forEach(System.out::println);

         System.out.println(books.get(0).getTitle());
         // close the reader
         reader.close();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }


   public static void main(String[] args) {

      E05_JSON_Array_File_To_POJO jojson =
              new E05_JSON_Array_File_To_POJO();

      jojson.createJSON();
   }


}

