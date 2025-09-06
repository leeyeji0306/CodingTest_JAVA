class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] result = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            if('A'<=my_string.charAt(i) && my_string.charAt(i)<='Z'){
                result[i]=(char)((int)my_string.charAt(i)+32);
            }
            else{
                result[i]=my_string.charAt(i);
            }
        }
        char temp=' ';
        boolean flag;
        for(int i=0; i<result.length; i++){
            flag=false;
            for(int j=i+1; j<result.length; j++){
                if(result[i]>result[j]){
                    temp=result[j];
                    result[j]=result[i];
                    result[i]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                temp=result[i];
            }
            answer+=temp;
        }
        return answer;
    }
}