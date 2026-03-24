import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }
        int index=0;
        int min=2147483647;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int[] answer = new int[arr.length-1];
        for(int i=0; i<arr.length; i++){
            if(min==arr[i]){
                index--;
                continue;
            }
            answer[i+index]=arr[i];
            
        }
        return answer;
    }
}