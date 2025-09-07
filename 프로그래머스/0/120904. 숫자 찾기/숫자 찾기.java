class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String num1=String.valueOf(num);
        for(int i=0; i<num1.length(); i++){
            if(num1.charAt(i)==(char)(k+48)){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}