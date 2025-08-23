class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<my_string.length(); i++){
            for(char j='0'; j<='9'; j++){
                if(my_string.charAt(i)==j) answer+=(int)my_string.charAt(i)-48;
            }
        }
        return answer;
    }
}