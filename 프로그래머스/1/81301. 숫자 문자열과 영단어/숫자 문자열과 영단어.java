class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sample={ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++)
        {
            s=s.replaceAll(sample[i], String.valueOf(i));
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}