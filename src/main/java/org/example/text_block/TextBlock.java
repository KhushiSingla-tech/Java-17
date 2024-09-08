package org.example.text_block;

public class TextBlock {
    public static void main(String[] args) {
        String textBlock = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York"
                }
                """;
        System.out.println(textBlock);

        String textBlockWithSpace = """
                    Make it right,   \s
                    Make it fast  
                """;
        System.out.println(textBlockWithSpace);
    }
}
