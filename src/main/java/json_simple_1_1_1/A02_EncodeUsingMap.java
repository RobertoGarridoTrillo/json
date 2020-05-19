package json_simple_1_1_1;

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
