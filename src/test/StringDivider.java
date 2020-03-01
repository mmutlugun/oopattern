package test;

public class StringDivider {

    public static void main(String[] args) {
        String[] arr = stringProcessor(" Ahmet merhaba.Nasislin, iyi ,misin?");
        for (String s:arr) {
            System.out.println(s);
        }
        //ArrayList.
    }

    public static String[] stringProcessor(String sentence) {
        return sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }

}
