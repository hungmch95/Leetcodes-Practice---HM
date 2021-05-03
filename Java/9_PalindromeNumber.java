class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int number = x;
        int reversed = 0, remainder;
        while(x != 0){
            remainder = x%10;
            reversed = reversed*10 + remainder;
            x /= 10;
        }
        
        return number==reversed;
    }
}
