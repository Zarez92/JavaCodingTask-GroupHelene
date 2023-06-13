package Horiye_Week3;

public class Horiye_FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="AAABBCDD";
        String result=" ";


        for (int i=0;i<str.length();i++){
            int freq=0;
            char ch=str.charAt(i);

            for (int j=0;j<str.length();j++){
                if (ch==str.charAt(j)){
                    freq++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=freq;

        }
        System.out.println(result);

    }
}
