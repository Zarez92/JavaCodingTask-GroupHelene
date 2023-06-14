package zarko_java_tasks.week_4;

public class RemoveDuplicates {

    /**
     ➡️ String -- Remove Duplicates

     Write a return method that can remove the duplicated values from String
     Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String letters){

        String result = "";
        for (int i = 0; i < letters.length(); i++) {

            char eachLetter = letters.charAt(i);

            for (int j = 0; j < letters.length(); j++) {

            }

            if (result.contains(eachLetter+"")){
                continue;

            }
            result+= eachLetter;

        }
        System.out.println(result);
        return result;

    }

}
