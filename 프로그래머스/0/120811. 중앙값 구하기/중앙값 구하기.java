class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp=0;
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++)
            if(array[j]<array[i]){
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        answer=array[(int)(array.length/2)];
        return answer;
    }
}