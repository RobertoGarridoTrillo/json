/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_simple_1_1_1;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONValue;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class A04_ArrayEncodeUsingList
{

   public static void main(String[] args)
   {

      List obj = new ArrayList();
      obj.add("sonoo");
      obj.add(27);
      obj.add(6000000);
      String jsonText = JSONValue.toJSONString(obj);
      System.out.println(obj);
   }
}

