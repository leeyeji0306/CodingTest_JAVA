import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i; j<nums.length-2; j++){
                for(int k=j; k<nums.length-2; k++){
                    int temp=nums[i]+nums[j+1]+nums[k+2];
                    int flag=0;
                    for(int l=2; l<temp; l++){
                        if(temp%l==0){
                            flag++;
                            break;
                        }
                    }
                    if(flag==0){
                        answer++;
                    }
                }
            }    
        }

        return answer;
    }
}