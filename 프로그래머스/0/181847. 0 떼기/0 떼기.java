class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i=0;
        while(n_str.charAt(i)=='0'){
            i++;
        }
        for(; i<n_str.length(); i++){
            answer+=n_str.charAt(i);
        }
        return answer;
    }
}