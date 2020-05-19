package Gson_2_8_6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E01_Objeto_To_JSON {

   private void create() {
      // pretty print
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      
      // Creating an object of staff type
      Staff staff = createStaffObject();

      // Java objects to String
      String json = gson.toJson(staff);

      System.out.println(json);
      // Java objects to File
      try (FileWriter writer =
              new FileWriter("src/main/java/resources/staff.json")) {
         gson.toJson(staff, writer);
      } catch (IOException e) {
      }
   }


   private static Staff createStaffObject() {

      // Creting JSONObject
      Staff staff = new Staff();

      // Putting data to JSONObject
      staff.setName("mkyong");
      staff.setAge(35);

      // Creating the array
      staff.setPosition(new String[]{"Founder", "CTO", "Writer"});

      // Creating the map
      Map<String, BigDecimal> salary = new HashMap() {
         {
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
         }


      };
      staff.setSalary(salary);

      // Creating the List      
      staff.setSkills(Arrays.asList("java", "python", "node",
              "kotlin"));

      return staff;

   }


   public static void main(String[] args) {
      E01_Objeto_To_JSON psvm = new E01_Objeto_To_JSON();
      psvm.createStaffObject();
      psvm.create();
   }


}

