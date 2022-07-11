package mypack;

import java.util.HashMap;
import java.util.Map;

public enum singelton{
    INSTANCE;

    private Map<Character, Character> characters = null;

    // private constructor
    singelton() {
        Map<Character, Character> aCharMap = new HashMap();
        aCharMap.put('a', 'e');
        aCharMap.put('o', 'u');
        
        characters = aCharMap;
    }

    public char getInstance(final char letter) {
        return characters.get(letter);
    }

    public boolean containsKey(char letter) {
        return characters.containsKey(letter);
    }
}