package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		// 1번문제
		// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
		// 사번은 중복되면 안됩니다.
		// (무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)

		// 2번문제
		// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
		// 만약 사용자가 사원 등록을 한 명도 하지 않았다면
		// "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

		// 3번문제
		// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
		// 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

		// 4번문제
		// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
		// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
		// 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
		// 사번이 존재하지 않는다면 없다고 얘기해 주세요.

		// 5번문제
		// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
		// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
		// y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
		// 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
		// 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

		// 사원의 정보 : 사번, 이름, 나이, 부서명
		Scanner sc = new Scanner(System.in);

		String[] userNums = new String[100]; // 사번
		String[] names = new String[100]; // 이름
		int[] ages = new int[100]; // 나이
		String[] departments = new String[100]; // 부서명

		int count = 0; // 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.

		while (true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("====================================");

			System.out.println("메뉴 입력 해주세요");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("사원 정보를 입력하세요");
				System.out.print("사번: ");
				String empNum = sc.next();

				while (true) {
					boolean flag = false;
					for (int i = 0; i < userNums.length; i++) {
						if (empNum.equals(userNums[i])) {
							System.out.println("사번이 중복 되었습니다.");
							flag = true;
							break;
						}
					}
					if (!flag) {
						userNums[count] = empNum;
						break; // 사번 중복 체크를 위한 while true를 빠져나오는 break;
					} else {
						System.out.print("사번 재입력: ");
						empNum = sc.next();
					}
				}

				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("나이: ");
				int age = sc.nextInt();
				System.out.print("부서: ");
				String department = sc.next();

				names[count] = name;
				ages[count] = age;
				departments[count] = department;
				count++;
				System.out.println("사원 등록이 완료되었습니다.");

			} else if (menu == 2) {
				if (count == 0) {
					System.out.println("조회할 사원이 없습니다. 먼저 등록부터 하세요.");
				} else {
					for (int i = 0; i < count; i++) {
						System.out.printf("사번: %s\t이름: %s\t나이: %d세\t부서: %s\n", userNums[i], names[i], ages[i],
								departments[i]);
					}
				}
			} else if (menu == 3) {
				System.out.println("사원 번호를 입력해주세요");
				String empNum = sc.next();

				boolean flag = false;

				for (int i = 0; i < userNums.length; i++) {
					if (empNum.equals(userNums[i])) {
						System.out.println(userNums[i]);
						System.out.println(names[i]);
						System.out.println(ages[i]);
						System.out.println(departments[i]);
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("등록이 안됐어요");
				}
			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.print("사번입력 > ");
                String userNum = sc.next();

                boolean flag = false;
                int i;
                
                for(i=0; i<userNums.length; i++) {
                    if(userNum.equals(userNums[i])) {
                        System.out.println("정말 삭제하시겠습니까? [Y/N]");
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.println("해당되는 사원의 정보가 없습니다.");
                } else {
                    String yesOrNo = sc.next();
                    switch(yesOrNo) {
                    case "N": case "n":
                        System.out.println("아니요를 선택하셨습니다.");
                        break;
                    case "Y": case "y":
                        for(int j=i; j<userNums.length-1; j++) {
                            userNums[j] = userNums[j + 1];
                            names[j] = names[j + 1];
                            ages[j] = ages[j + 1];
                            departments[j] = departments[j + 1];
                        }
                        count--;
                        break;
                    default :
                        System.out.println("잘못된 입력입니다.");
                    } // switch end
                } // else end

			} else if (menu == 6) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			} else {
				System.out.println("메뉴 잘못 입력 하셨어요");
			}
		}
	}
}
