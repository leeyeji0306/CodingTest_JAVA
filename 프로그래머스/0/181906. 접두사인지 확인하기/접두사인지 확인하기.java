class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int cnt=0;
        if(my_string.length()>=is_prefix.length()){
        for(int i=0; i<is_prefix.length(); i++){
            if(my_string.charAt(i)==is_prefix.charAt(i)) cnt++;
            }
        }
        if(cnt==is_prefix.length()) answer=1;
        return answer;
    }
}