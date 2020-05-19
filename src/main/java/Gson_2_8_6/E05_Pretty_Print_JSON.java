package Gson_2_8_6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class E05_Pretty_Print_JSON {

   /**
    * Without pretty
    */
   void withoutPretty() {
      // compact print
      Gson gson = new Gson();

      String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};

      String json = gson.toJson(lang);

      System.out.println("Without Pretty \n"+ json);
   }


   /**
    * With Pretty
    */
   void withPretty() {
      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};

      String json = gson.toJson(lang);

      System.out.println("With Pretty \n"+ json);
   }


   /**
    *
    * @param args
    */
   public static void main(String[] args) {

      E05_Pretty_Print_JSON psvm = new E05_Pretty_Print_JSON();

      psvm.withPretty();

      psvm.withoutPretty();
   }


}

