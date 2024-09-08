package org.example.switch_enhancement;

public class SwitchEnhancement {
    public static void main(String[] args) {
        System.out.println(formatter(1));
        System.out.println(formatterPatternSwitch("Foo"));
    }

    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    static String formatterPatternSwitch(String s) {
        // Option 1
//        return switch (s) {
//            case "Foo", "Bar" -> "Great";
//            default           -> "Ok";
//        };
        // Option 2
        return switch (s) {
            case "Foo", "Bar": yield "Great";
            default          : yield "Ok";
        };
    }
}