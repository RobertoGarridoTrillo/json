package json_simple_3_1;

import com.github.cliftonlabs.json_simple.Jsoner;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E01_POJO_To_JSON {

   public void createJSON() {
      try {
         // create book object
         Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                 new String[]{"Bruce Eckel"});

         // convert book object to JSON
         String json = Jsoner.serialize(book);

         // prettify JSON
         json = Jsoner.prettyPrint(json);

         // print JSON
         System.out.println(json);

      } catch (Exception ex) {
      }

   }


   public static void main(String[] args) {
      
      E01_POJO_To_JSON jojson = new E01_POJO_To_JSON();
      
      jojson.createJSON();
      
   }


}

