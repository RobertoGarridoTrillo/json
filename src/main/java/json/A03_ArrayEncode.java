/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import org.json.simple.JSONArray;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class A03_ArrayEncode
{

   public static void main(String[] args)
   {
      JSONArray obj = new JSONArray();
      obj.add("sonoo");
      obj.add(27);
      obj.add(6000000);
      System.out.println(obj);
   }
}
