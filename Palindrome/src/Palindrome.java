public class Palindrome {
    public static boolean isPalindrome(int number){
        if(number!=0 && number%10==0)return false;
        else if ((number >= -9 && number <= -1)||(number >=1 && number <= 9)) return true;
        else{
            int lastDigit;
            int reverse=0;
            if (number < 0) number = number * -1;
            int number1=number;
            while(number>0){

                lastDigit=number%10;
               reverse*=10;
                reverse+=lastDigit;
                number/=10;
            }
            if(number1==reverse)return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(11);
    }
}