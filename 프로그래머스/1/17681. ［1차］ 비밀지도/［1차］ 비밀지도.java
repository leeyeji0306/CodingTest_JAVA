
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binary=new String[n];
        String[] answer = new String[n];
        for(int i=0; i<n; i++)
        {
            String temp=Integer.toBinaryString(arr1[i] | arr2[i]);
            binary[i]=" ";
            binary[i]=String.format("%" + n + "s", temp);
            answer[i]=binary[i].replace('1', '#').replace('0',' ');
        }
        return answer;
    }
}

//toBinaryString은 앞의 0은 생략한다.