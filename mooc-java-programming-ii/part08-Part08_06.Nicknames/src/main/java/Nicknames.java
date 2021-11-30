import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap <String, String> mapping = new HashMap<>();
        mapping.put("matthew", "matt");
        mapping.put("michael", "mix");
        mapping.put("arthur", "artie");

        System.out.println(mapping.getOrDefault("bad", "no entry of this type !"));
        System.out.println(mapping.get("matthew"));

    }

}
