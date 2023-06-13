package zarko_java_tasks;

public class Zarko_FreqOfCharacters {

    public static void main(String[] args) {

        String str = "bcccaaa";

        String res = "";


        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    freq++;

                }
            }

            if (res.contains("" + ch)) {
                continue;
            }

            res += ch;
            res += freq;

        }
        System.out.println(res);

    }


}
