class Solution {
    public String solution(String p) {
        StringBuilder temp= new StringBuilder();
        //폰번호 길이만큼 반복
		for (int i = 0; i < p.length(); i++) {
            //뒤 4자리가 아니면
			if(i<p.length()-4) {
				temp.append("*");
			}else {
				temp.append(p.charAt(i));	//뒤 4자리면 번호 그대로 붙이기			
			}
		}
		String answer = temp.toString();
        return answer;
    }
}