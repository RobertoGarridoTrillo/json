package Gson_2_8_6;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E03_JSON_To_Array_Of_Objets {

   private void create() {
      Gson gson = new Gson();

      try {
         Reader reader = new FileReader("src/main/java/resources/staff_2.json");

         // Convert JSON File to Java Objects Array
         Staff[] staffes = gson.fromJson(reader, Staff[].class);

         // print staff
         for (Staff obj : staffes) {
            System.out.println("Nombre: " + obj.getName());
            System.out.println("Edad: " + obj.getAge());
            System.out.print("Habilidades: ");

            for (String lang : obj.getSkills()) {
               System.out.print(lang + ", ");
            }
            System.out.println("");
            
            Iterator it = obj.getSalary().keySet().iterator();
            
            while (it.hasNext()) {
               String key = (String) it.next();
               System.out.println("Clave: " + key + " -> Valor: " +
                        obj.getSalary().get(key));
            }

         }

      } catch (IOException e) {
      }

   }


   public static void main(String[] args) {
      E03_JSON_To_Array_Of_Objets psvm = new E03_JSON_To_Array_Of_Objets();
      psvm.create();
   }


}

