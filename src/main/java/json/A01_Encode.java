/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import org.json.simple.JSONObject;



/**
 *
 * @author Roberto Garrido Trillo
 */
public class A01_Encode
{

   public static void main(String[] args)
   {
      JSONObject obj = new JSONObject();
      obj.put("name", "sonoo");
      obj.put("age", 27);
      obj.put("salary", 6000000);
      System.out.println(obj);
   }

}
