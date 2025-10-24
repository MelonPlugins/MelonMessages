package org.vanillacraft.melonmessages;

import java.util.HashMap;

public class PlaceholderMap {
    private final HashMap<String, String> placeholderValues;

    public PlaceholderMap() {
        placeholderValues = new HashMap<>();
    }

    public void add(String placeholder, String value) {
        placeholderValues.put(placeholder, value);
    }

    public String get(String placeholder) {
        return placeholderValues.get(placeholder);
    }

    public String substitute(String text) {
        for (String placeholder : placeholderValues.keySet()) {
            text = text.replace("{" + placeholder + "}", placeholderValues.get(placeholder));
        }
        return text;
    }
}
