package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//깃허브 연동 프로젝트
		
		Scanner scan = new Scanner(System.in);
		
// 6개의 로또 숫자를 저장할 배열
		
		int[] myLottoNums = new int[6];
		
		for(int i = 0; i < myLottoNums.length; i++) {
			System.out.print((i + 1) + "번째 로또 번호 입력 : ");
						
			int inputNum = scan.nextInt();
			
			myLottoNums[i] = inputNum;
		}
		
//저장된 값을 출력을 해보자
		for (int myNum : myLottoNums) {
			System.out.println(myNum);
		}
				
	}
}
