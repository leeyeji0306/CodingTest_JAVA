class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = a+"";
        String y = b+"";
        int sum1 = Integer.parseInt(x+y);
        int sum2 = Integer.parseInt(y+x);
        if(sum1>sum2){
            return sum1;
        }
        else{
            return sum2;
        }
    }
}