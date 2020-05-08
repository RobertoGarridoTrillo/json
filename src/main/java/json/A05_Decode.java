/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class A05_Decode
{

   public static void main(String[] args)
   {
      String s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
      Object obj = JSONValue.parse(s);
      JSONObject jsono = (JSONObject) obj;

      String name = (String) jsono.get("name");
      Double salary  = (Double) jsono.get("salary");
      long age = (long) jsono.get("age");
      System.out.printf("name %s, salary %f, age %d \n", name, salary, age);
   }
}
