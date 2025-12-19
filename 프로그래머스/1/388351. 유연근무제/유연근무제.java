class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int[] cnt = new int[schedules.length]; 
            for(int i=0; i<timelogs.length; i++){
                int startemp=startday;
                if(schedules[i]%100>49){
                    schedules[i]+=(schedules[i]%100+10-60)-(schedules[i]%100)+100;
                }
                else{
                    schedules[i]+=10;
                }
                for(int j=0; j<timelogs[i].length; j++){
                    if(startemp==8) startemp=1;
                    if(schedules[i]>=timelogs[i][j] || startemp >= 6) {
                        cnt[i]++;
                    }
                    else{
                        if(startemp<6){
                            break;
                        }
                    }
                    startemp++;
                }
            }
            for(int i=0; i<cnt.length; i++){
                if(cnt[i]==7){
                    answer++;
                }
            }
        return answer;
    }
}