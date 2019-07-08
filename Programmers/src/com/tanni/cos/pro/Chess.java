package com.tanni.cos.pro;
import java.util.*;

public class Chess {
	public int solution(String pos) {
        // 여기에 코드를 작성해주세요.
    	int answer = 0;
    	int[] dx = {1, -1, 2, -2, 1, -1, 2, -2};
    	int[] dy = {2, -2, 1, -1, -2, 2, -1, 1};
    	
    	int ci = pos.charAt(0) - 'A';
    	int cj = pos.charAt(1) - 1;
    	
    	for(int i = 0; i<8; i++) {
    		int nx = ci + dx[i];
    		int ny = cj + dy[i];
    		if(0<=ci && ci<8 && 0<=cj && cj<8) {
    			answer++;
    		}
    	}
    	return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Chess sol = new Chess();
        String pos = "A7";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
