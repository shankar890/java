package javaprogarme;

public class Remove_character_from_string {

    public static void main(String[] args) {

        String s1 = "shakar";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char oneByOne = s1.charAt(i);
            if (oneByOne != 'a') {
                sb.append(oneByOne);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
