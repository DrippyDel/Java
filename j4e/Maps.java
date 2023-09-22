import java.util.HashMap;

public class Maps
{
  // Maps - a collection of key, value pairs.
  public static void main(String [] args)
  {
    //      key     Value
    HashMap<String, Integer> empIds = new HashMap<>();

    // .put
    empIds.put("Delali", 12345);
    empIds.put("John", 883);
    empIds.put("Jerry", 21);

    System.out.println(empIds);

    // .get
    System.out.println(empIds.get("Delali"));

    // .containsKey
    System.out.println(empIds.containsKey("Jerry"));

    // .containsValue
    System.out.println(empIds.containsValue(21));

    // .remove
    empIds.remove("John");


  }
}
