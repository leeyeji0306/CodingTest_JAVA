class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String temp=String.valueOf(x);
        char[] temp2=temp.toCharArray();
        int sum=0;
        for(char ch : temp2){
            int num = ch-'0';
            sum+=num;
        }
        if(x%sum!=0){
            answer=false;
        }
        return answer;
    }
}