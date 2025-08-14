class Solution {
    public int solution(int[] sides) {
        int answer=0;
        int max=sides[0];
        for(int i=1; i<sides.length; i++){
            if(sides[i-1]<sides[i]){ 
                answer+=max;
                max=sides[i];
            }
            else{ 
                answer+=sides[i];
                if(i-1==0) continue;
                max=sides[i-1];
            }
        }
        if(answer<=max) answer=2;
        else answer=1;
        return answer;
    }
}