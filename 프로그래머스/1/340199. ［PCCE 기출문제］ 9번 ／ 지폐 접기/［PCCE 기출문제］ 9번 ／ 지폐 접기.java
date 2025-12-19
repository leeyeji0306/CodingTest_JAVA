class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int[] big, small;
        big=new int[2];
        small=new int[2];
        if(bill[0]>bill[1]) {
            big[0]=bill[0];
            small[0]=bill[1];
        }
        else{
            big[0]=bill[1];
            small[0]=bill[0];
        }
        if(wallet[0]>wallet[1]){
            big[1]=wallet[0];
            small[1]=wallet[1];
        }
        else{
            big[1]=wallet[1];
            small[1]=wallet[0];
        }
        while(small[0] > small[1] || big[0] > big[1]){
            big[0]/=2;
            answer++;
            if(big[0]<small[0]){
                int temp=big[0];
                big[0]=small[0];
                small[0]=temp;
            }
        }
        return answer;
    }
}