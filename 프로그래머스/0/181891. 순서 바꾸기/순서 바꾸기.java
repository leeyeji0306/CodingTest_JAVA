class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            if(i<num_list.length-n) answer[i]=num_list[i+n];
            else answer[i]=num_list[i-(num_list.length-n)];
        }
        return answer;
    }
}