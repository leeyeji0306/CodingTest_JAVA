import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> list=new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i; j<numbers.length-1; j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = list.toArray(new Integer[0]);
        Arrays.sort(answer);
        return answer;
    }
}