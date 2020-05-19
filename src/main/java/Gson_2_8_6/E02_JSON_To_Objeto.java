package Gson_2_8_6;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E02_JSON_To_Objeto {

   private void create() {
      Gson gson = new Gson();

      try {
         Reader reader = new FileReader("src/main/java/resources/staff.json");

         // Convert JSON File to Java Object
         Staff staff = gson.fromJson(reader, Staff.class);

         // print staff
         System.out.println(staff);
         
         

      } catch (IOException e) {
         e.printStackTrace();
      }

   }
   
   public static void main(String[] args) {
      E02_JSON_To_Objeto psvm = new E02_JSON_To_Objeto();
      psvm.create();
   }

}

