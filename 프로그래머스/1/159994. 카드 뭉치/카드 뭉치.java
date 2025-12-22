class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        String[] Test=new String[goal.length];
        int j=0; 
        int k=0;
        for(int i=0; i<goal.length; i++){
            for(; j<cards1.length; j++){
                if(goal[i].equals(cards1[j])){
                    Test[i]=cards1[j];
                }
                else{
                    break;
                }
            }
            for(; k<cards2.length; k++){
                if(goal[i].equals(cards2[k])){
                    Test[i]=cards2[k];
                }
                else{
                    break;
                }
            }
        }
        int cnt=0;
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(Test[i])) cnt++;
        }
        if(cnt==goal.length) answer="Yes";
        else answer="No";
        return answer;
    }
}