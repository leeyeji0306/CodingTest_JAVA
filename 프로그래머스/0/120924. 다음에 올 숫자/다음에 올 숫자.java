class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int[] differ = new int[common.length-1];
        for(int i=1; i<common.length; i++){
            differ[i-1]=common[i]-common[i-1];
        }
        if (differ[0]==differ[1]) answer=common[common.length-1]+differ[0];
        else answer=common[common.length-1]*(differ[1]/differ[0]);
        return answer;
    }
}