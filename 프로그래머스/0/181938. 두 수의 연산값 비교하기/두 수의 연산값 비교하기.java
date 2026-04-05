class Solution {
    public int solution(int a, int b) {
        int plus = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int multiple = 2*a*b;
        if(plus>multiple){
            return plus;
        }
        else if(plus==multiple){
            return plus;
        }
        else{
            return multiple;
        }
    }
}