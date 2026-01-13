class Solution {
    public int solution(int[] d, int budget) {
        int sum=0;
        int answer = 0;
        for(int i=0; i<d.length-1; i++){
            for(int j=0; j<d.length-1; j++){
                if(d[j]>d[j+1]){
                    int temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
                }
            }
        }
        for(int i=0; i<d.length; i++){
            sum+=d[i];
            if(budget<sum){
                break;
            }
            else if(budget==sum){
                answer++;
                break;
            }
            else{
                answer++;
            }
        }
        return answer;
    }
}