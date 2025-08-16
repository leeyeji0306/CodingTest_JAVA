class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.length()>=str2.length()) {
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i)==str2.charAt(0)){
                    if(str2.length()==1){
                        answer=1;
                    }
                    else {
                        String str3="";
                        for(int j=0; j<str2.length(); j++) {
                            if(str1.length()<=i+j) break;
                            str3+=str1.charAt(i+j);
                        }
                        if(str3.equals(str2)) answer=1;
                    }
                }
            }
        }
        if(answer==0) answer=2;
        return answer;
    }
}