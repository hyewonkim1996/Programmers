#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// common_len은 배열 common의 길이입니다.
int solution(int common[], size_t common_len) {
    int answer = 0;
    int gap = 0;
    for(int i=2; i<common_len; i++){
        for(int j=i-1; j<i; j++){
            if(common[i]-common[j] == common[i-1]-common[j-1]){
                gap = common[i]-common[j];
                answer = common[common_len-1] + gap;
                break;
            }else if(common[i]/common[j] == common[i-1]/common[j-1]){
                gap = common[i]/common[j];
                answer = common[common_len-1] * gap;
                break;
            }
        }
    }
    return answer;
}