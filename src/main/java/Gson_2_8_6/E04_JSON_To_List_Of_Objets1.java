package Gson_2_8_6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E04_JSON_To_List_Of_Objets1 {

   private void create() {
      Gson gson = new Gson();

      try {
         Reader reader = new FileReader("src/main/java/resources/staff_2.json");

         // Convert JSON File to Java Objects Array
         Type staffType = new TypeToken<ArrayList<Staff>>(){}.getType();
         
         List<Staff> StaffList = gson.fromJson(reader, staffType);

         // print staff
         System.out.println("Lista de objetos");
         for (Staff obj : StaffList) {
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
      E04_JSON_To_List_Of_Objets1 psvm = new E04_JSON_To_List_Of_Objets1();
      psvm.create();
   }


}

