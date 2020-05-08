/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONValue;

/**
 *
 * @author ROBEG
 */
public class A02_EncodeUsingMap
{
   public static void main(String[] args) {
   
      Map obj = new HashMap();
      obj.put("name", "sonoo");
      obj.put("age", 27);
      obj.put("salary", 6000000);
      String jsonText = JSONValue.toJSONString(obj);
      System.out.println(obj);
}
}
