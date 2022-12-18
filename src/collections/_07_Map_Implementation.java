package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_Map_Implementation {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Beyza");
        map.put(1,"Malek");

        System.out.println(map);

        map.put(2,"Malek");
        System.out.println(map.size()); // 2
        System.out.println(map); //{1=Malek, 2=Malek}

        map.put(null,"Andrii");
        map.put(null,"Vlad"); // only one null key
        System.out.println(map);

        map.put(3, "Victoria");
        map.put(4,null);
        map.put(5,null);
        map.put(6,null); // allows multiple null
        System.out.println(map); // {null=Vlad, 1=Malek, 2=Malek, 3=Victoria, 4=null, 5=null, 6=null}
    }
}
