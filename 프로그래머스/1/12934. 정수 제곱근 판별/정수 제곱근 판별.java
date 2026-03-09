class Solution {
    public long solution(long n) {
        long answer = 0;
        double temp=Math.sqrt(n);
        double temp2=temp-(temp%Math.floor(temp));
        if(temp2*temp2==n){
            return (long)((temp2+1)*(temp2+1));
        }
        else return -1;
    }
}