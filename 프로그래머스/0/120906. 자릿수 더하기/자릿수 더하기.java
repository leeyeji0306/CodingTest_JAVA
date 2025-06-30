class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=n;
        int temp=1000000;
        boolean cnt=false;
        while(true){
            if(0<=n/temp && n/temp<10) break;
            temp/=10;
        }
        do{
            if(temp==1){ 
                cnt=true;
            }
            answer+=i/temp;
            i%=temp;
            temp/=10;
            if(cnt) break;
        }while(true);
        return answer;
    }
}