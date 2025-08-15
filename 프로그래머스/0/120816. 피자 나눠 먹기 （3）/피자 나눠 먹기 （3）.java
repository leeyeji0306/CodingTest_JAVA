class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int temp=0;
        while(true){
            if(temp-n>=0) break;
            temp+=slice;
            answer++;
        }
        return answer;
    }
}