package freull0;

public class Palindrome {

    public static void main(String[] args) {
        String s = "AABBAAD";
        TestStuff t = new TestStuff();
        if(t.pal(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        System.out.println(s);
    }
    private boolean pal(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){ // Changed != to ==
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
