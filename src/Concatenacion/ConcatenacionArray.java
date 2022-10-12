package Concatenacion;

public class ConcatenacionArray {
    public static void main(String[] args) {
        String[] words = {"Bienvenido", "a", "mi", "array", "concatenado"};
        StringBuilder finalText = new StringBuilder();

        // FOR EACH
        for (String word : words) {
            finalText.append(word).append(" ");
        }
        System.out.println(finalText);

        // FOR
    /*
    for (int i = 0; i < words.length; i++){
      finalText += words[i] + " ";
    }
    System.out.println(finalText);
    */
    }
}
