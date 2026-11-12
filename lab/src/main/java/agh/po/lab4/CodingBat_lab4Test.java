package agh.po.lab4;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class CodingBat_lab4Test {

    @org.junit.jupiter.api.Test
    void mapABtest() {
        Map<String, String> map = new HashMap<>(Map.of("a", "Hi", "b", "There"));
        Map<String,String> result = CodingBat_lab4.mapAB(map);
        assertEquals("HiThere", result.get("ab"));
        assertEquals("Hi", result.get("a"));
        assertEquals("There", result.get("b"));
        assertEquals(3, result.size());
    }

    @org.junit.jupiter.api.Test
    void map_wordLenTest()
    {
        String[] words = {"cc", "ddd", "uuu", "a", "u", "cc"};
        Map<String,Integer> mapka_test = CodingBat_lab4.Map_wordLen(words);
        assertEquals(1, mapka_test.get("u"));
        assertEquals(5, mapka_test.size());
        assertEquals(2, mapka_test.get("cc"));
        assertEquals(3, mapka_test.get("ddd"));
    }
}