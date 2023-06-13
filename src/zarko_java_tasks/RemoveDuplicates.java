package zarko_java_tasks;

public class RemoveDuplicates {

//➡️ String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex: removeDup("AAABBBCCC") ==> ABC



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

        return result;

    }






    public static void main(String[] args) {


        System.out.println(removeDuplicates("AAABBBCCC"));








        String res = "";
        Integer nums[] = {1, 1, 1, 2, 2, 5, 5, 6, 7, 7, 8, 8, 9, 9};


        for (int i = 0; i < nums.length; i++) {

            String ch = String.valueOf(nums[i]);
            if (res.contains(ch)) {
                continue;
            }
            res+= ch +", ";

        }
        System.out.println(res);


    }



}
