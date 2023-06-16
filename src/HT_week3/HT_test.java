package HT_week3;

public class HT_test {
    public static void main(String[] args) {
        int num=12001;
        HT_PrimeNumber primeCheck=new HT_PrimeNumber();
        System.out.println(primeCheck.primeNumber(num));

        HT_ReverseNegativeNumber reverse=new HT_ReverseNegativeNumber();
        System.out.println(reverse.reverseDigits(num));

        String str="aaabbbccc";
        HT_StringFrequencyOfCharacters frequency=new HT_StringFrequencyOfCharacters();
        System.out.println(frequency.frequencyOfCharacters(str));

    }
}
