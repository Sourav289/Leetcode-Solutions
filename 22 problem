class Solution {
    public int addDigits(int num) {
        
        while (num >= 10) { // Repeat until num becomes a single digit
            
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10; // Get last digit and add it
                num /= 10;       // Remove last digit
            }
            
            num = sum; // Store the sum back in num
        }
        
        return num;
    }
}
