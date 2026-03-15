class Solution {
    public int solution(int num) {
        int answer = 0;
        long number=num;
        while(true){
            if(answer==500){
                return -1;
            }
            if(number==1){
                return answer;
            }
            if(number%2==0){
                number/=2;
            }
            else{
                number*=3;
                number++;
            }
            answer++;
        }
    }
}