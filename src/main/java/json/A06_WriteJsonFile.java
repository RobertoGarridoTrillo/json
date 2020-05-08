/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class A06_WriteJsonFile

{

   public static void main(String[] args) throws FileNotFoundException
   {
      // creating JSONObject 
      JSONObject jo = new JSONObject();

      // putting data to JSONObject 
      jo.put("firstName", "John");
      jo.put("lastName", "Smith");
      jo.put("age", 25);

      // for address data, first create LinkedHashMap 
      Map m = new LinkedHashMap(4);
      m.put("streetAddress", "21 2nd Street");
      m.put("city", "New York");
      m.put("state", "NY");
      m.put("postalCode", 10021);

      // putting address to JSONObject 
      jo.put("address", m);

      // for phone numbers, first create JSONArray  
      JSONArray ja = new JSONArray();

      m = new LinkedHashMap(2);
      m.put("type", "home");
      m.put("number", "212 555-1234");

      // adding map to list 
      ja.add(m);

      m = new LinkedHashMap(2);
      m.put("type", "fax");
      m.put("number", "212 555-1234");

      // adding map to list 
      ja.add(m);

      // putting phoneNumbers to JSONObject 
      jo.put("phoneNumbers", ja);

      /* Example of try with resource */
      try (
              // writing JSON to file:"JSONExample.json" in cwd
              PrintWriter pw = new PrintWriter("JSONExample.json"))
      {
         pw.write(jo.toJSONString());

         pw.flush();
      }

   }
}
