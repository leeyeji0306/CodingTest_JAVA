#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int i=100000000;
    while(i!=0){
        answer+=(n/i);
        n%=i;
        if(i==1) i==0;
        i/=10;
    }
    return answer;
}