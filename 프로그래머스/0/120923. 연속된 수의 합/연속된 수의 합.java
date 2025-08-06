class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int res;
        if(total%num==0) res=(total/num)-(num/2);
        else res=(total/num)-(num/2-1);
        for(int i=0; i<num; i++){
            answer[i]=res;
            res++;
        }
        return answer;
    }
}