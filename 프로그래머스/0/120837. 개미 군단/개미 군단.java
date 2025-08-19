class Solution {
    public int solution(int hp) {
        int answer = 0;
        int i=5;
        while(true){
            answer+=(int)(hp/i);
            hp%=i;
            if(hp%i==0) break;
            i-=2;
        }
        return answer;
    }
}