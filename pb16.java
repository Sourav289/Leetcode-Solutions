class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10; // get last digit

            if (original % digit == 0) { // check if digit divides original number
                count++;
            }

            num = num / 10; // remove last digit
        }

        return count;
    }
}
