import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp=String.valueOf(n);
        char[] temp2=temp.toCharArray();
        Arrays.sort(temp2);
        String reversed = new StringBuilder(new String(temp2)).reverse().toString();
        answer=Long.parseLong(reversed);
        return answer;
    }
}