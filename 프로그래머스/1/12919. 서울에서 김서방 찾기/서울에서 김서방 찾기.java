import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(String str : seoul){
            list.add(str);
            if(str.equals("Kim")){
                answer+="김서방은 "+list.indexOf("Kim")+"에 있다";
            }
        }
        return answer;
    }
}