import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            arrList.add(arr[i]);
        }
        for(int i=0; i<delete_list.length; i++){
            if(arrList.contains(delete_list[i])){
                arrList.remove(Integer.valueOf(delete_list[i]));
            }
        }
        int[] answer=new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrList.get(i);
        }

        return answer;
    }
}