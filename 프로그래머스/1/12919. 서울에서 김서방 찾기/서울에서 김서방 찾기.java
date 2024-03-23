class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        String answer = "김서방은 ";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
            }
        }
        return answer+x+"에 있다";
    }
}