package zarko_java_tasks;


public class NewClass {


    public static void main(String[] args) {

        String str = "aaabbbccddddrrrr";
        //            aaabbbccddddrrrr --> second loop

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            char eachChar = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (eachChar == str.charAt(j)) {
                    freq++;
                }

            }

            if(result.contains(eachChar + "")){
                continue;
            }

            result += eachChar;
            result += freq;
        }
        System.out.println(result);




    }



}




/*

IQ - describe me a steps of the task FreqOFChar

String str = "aaabbbccddddrrrr";

Tell me Freq of character a3, b3, c2, d4, r4.




 */