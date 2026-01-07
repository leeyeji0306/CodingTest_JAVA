class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int cnt=0;
        int answerindex[]=new int[numbers.length];
        for(int i=0; i<10; i++){
            cnt=0;
            for(int j=0; j<numbers.length; j++){
                if(numbers[j]==i){
                    cnt++;
                }
            }
            if(cnt==0){
                    answer+=i;
                }
        }
        return answer;
    }
}