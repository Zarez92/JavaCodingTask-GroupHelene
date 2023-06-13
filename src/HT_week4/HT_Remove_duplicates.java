package HT_week4;

public class HT_Remove_duplicates {

    public static String removeDuplicates(String str) {
   String result="";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);


            }

        }
        return result;
    }

    public static void main(String[] args) {
        String str="AAABBBCCC";

        System.out.println(removeDuplicates(str));
    }
}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */