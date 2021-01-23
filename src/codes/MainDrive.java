package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//깃허브 연동 프로젝트

		Scanner scan = new Scanner(System.in);

// 6개의 로또 숫자를 저장할 배열

		int[] myLottoNums = new int[6];

		for (int i = 0; i < myLottoNums.length; i++) {

//for - 각각의 자리에 맞게 숫자를 대입하도록 하는 역할.	
//올바른 숫자를 넣을때 까지 반복.	

			while (true) {
				System.out.print((i + 1) + "번째 로또 번호 입력 : ");

				int inputNum = scan.nextInt();

				// 입력해도 되는 숫자인지? 검사하고
				// 검사 1. 입력받은 숫자가 1 ~ 45 사이의 값인가?
				// 1 ~ 45 사이 : 1보다는 크거나 같고, 동시에 45보다는 작거나 같다.

				boolean isRangeOk = (1 <= inputNum && inputNum <= 45);

				// 그 결과가 OK일때만 배열에 저장한다.

				if (isRangeOk) {

					// 입력받은 숫자를 배열에 저장
					myLottoNums[i] = inputNum;

					// 올바른 결과가 들어갔으면 => while문을 종료.
					// 다음 자리의 숫자를 받으러 이동.
					break;
				}
			}

//입력 받은 숫자를 배열에 저장			

		}

//저장된 값을 출력을 해보자
		for (int myNum : myLottoNums) {
			System.out.println(myNum);
		}

	}
}
