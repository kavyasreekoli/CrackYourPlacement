class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution s=new Solution();
        boolean result=s.isPalindrome(num);
        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public boolean isPalindrome(int x) {
        int res=reverse(x);
        if(x<0){
            return false;
        }
        if(x==res){
            return true;
        }return false;      
    }
    int reverse(int n){
        int rev=0;
        int lastDigit=0;

        while(n!=0){
            lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        
        return rev;

    }
}