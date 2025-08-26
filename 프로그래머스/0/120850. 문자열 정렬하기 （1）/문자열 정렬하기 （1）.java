class Solution {
    public int[] solution(String my_string) {
        int cnt=0;
        for(int i=0; i<my_string.length(); i++){
            for(char j='0'; j<='9'; j++){
                if(my_string.charAt(i)==j) cnt++;
            }
        }
        int[] answer = new int[cnt];
        cnt=0;
        for(int i=0; i<my_string.length(); i++){
            for(char j='0'; j<='9'; j++){
                if(my_string.charAt(i)==j) {
                    answer[cnt]=my_string.charAt(i)-48;
                    cnt++;
                }
            }
        }
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]) {
                    int temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                }
            }
        }
        return answer;
        //'0'=30
    }
}