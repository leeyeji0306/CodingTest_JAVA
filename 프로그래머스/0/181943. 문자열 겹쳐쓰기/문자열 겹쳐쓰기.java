class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int i;
        for(i=0; i<my_string.length(); i++){
            if(i>s-1) {
                answer+=overwrite_string.charAt(i-s);
                if(i-s==overwrite_string.length()-1) break;
                continue;
            }
            answer+=my_string.charAt(i);
        }
        for(; i<my_string.length(); i++){
            if(i==my_string.length()-1) break;
            answer+=my_string.charAt(i+1);
        }
        return answer;
    }
}