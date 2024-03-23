class Solution {
    public int solution(int n) {
        //합을 저장할 변수
        int answer = 0;
        //n값에 따라 나올 수 있는 약수의 범위
        for(int i=1; i<=n; i++){
            //n의 약수가 나오면
            if(n%i==0){
                //배열에 저장
                answer += i;
            }
        }
        return answer;
    }
}