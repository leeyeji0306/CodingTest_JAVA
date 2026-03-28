class Solution {
    public int solution(int order) {
        int answer=0;
        String[] splited=String.valueOf(order).split("");
        for(int i=0; i<splited.length; i++){
            int temp=Integer.parseInt(splited[i]);
            if(temp==3 || temp==6 || temp==9) answer++;
        }
        return answer;
    }
}