package agh.po.lab4;

import java.util.HashMap;
import java.util.Map;

public class CodingBat_lab4 {

    static public Map<String, String> mapAB(Map<String, String> map)
    {
        if (map.containsKey("a") && map.containsKey("b"))
        {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }
    static public Map<String,Integer> Map_wordLen(String[] strings)
    {
        Map<String,Integer> mapka = new HashMap<>();
        for(String s : strings)
        {
            mapka.put(s,s.length());

        }
        return mapka;
    }
}
