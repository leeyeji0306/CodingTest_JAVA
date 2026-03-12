class Solution {
    public long[] solution(long n) {
        String temp=String.valueOf(n);
        char[] arr=temp.toCharArray();
        long[] answer = new long[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[arr.length-i-1]=arr[i]-'0';
        }
        return answer;
    }
}