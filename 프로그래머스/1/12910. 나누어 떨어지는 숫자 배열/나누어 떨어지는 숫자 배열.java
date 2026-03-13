import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer=new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr){
            if(i%divisor==0){
                answer.add(i);
            }
        }
        Integer[] answer1 = answer.toArray(new Integer[0]);
        int[] answer2;
        if(answer.isEmpty()){
            answer2=new int[1];
            answer2[0]=-1;
            return answer2;
        }
        else{
            answer2=new int[answer1.length];
        }
        for(int i=0; i<answer1.length; i++){
            answer2[i]=answer1[i];
        }
        return answer2;
    }
}