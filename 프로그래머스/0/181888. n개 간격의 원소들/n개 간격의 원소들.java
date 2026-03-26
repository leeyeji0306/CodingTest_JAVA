import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        Integer[] temp = list.toArray(new Integer[0]);
        int[] answer=new int[temp.length];
        for(int i=0; i<temp.length; i++){
            answer[i]=temp[i];
        }
        return answer;
    }
}