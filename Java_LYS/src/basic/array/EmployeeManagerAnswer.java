package basic.array;

import java.util.Scanner;

public class EmployeeManagerAnswer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		// 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		while (true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				/*
				 * 1번문제 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성. 사번은 중복되면 안됩니다. (무한루프를 구현해서 사번 중복이
				 * 발생하면 다시 입력받기.)
				 */
				System.out.println("# 사원 정보 등록을 시작합니다.");
				String empNum = sc.next();
				// 중복을 몇번 발생 시킬지 모르니 while(true)가 필요함, for문은 시작과 끝을 알아야 몇번 할지 지정할 수 있는데
				// 사용자가 중복되지 않는 사번을 한번에 입력 할 수도 있고 2, 3, 4, 5번 중복을 일으킬 수 있기 때문에 while(true)사용.
				// 중복을 발생시키지 않았다면 끝냄.
				while (true) {
					boolean flag = false; // 중복 했다 안했다 판단하는 변수 선언
					for (int i = 0; i < count; i++) { // count말고 userNums.length로 써도 되긴 함.
						if (empNum.equals(userNums[i])) { // 입력한 사번이 이미 존재하는 경우를 뜻함 그래서 다시 입력 받아야 됨.
							System.out.println("이미 중복된 사번입니다."); // 라고 얘기를 하고,
							flag = true; // 중복이 발생했다 라는 것이 검증 되었기 떄문에 반복문을 끝내도 상관이 없지.
							break; // 그래서 break로 끝내자.

						}
					}
					// if문으로 각각 구별해주자
					if (!flag) { // !flag는 flag==false? 라고 물어보는 것임 ,이것은 중복이 발생하지 않았니? 라고 물어보는 것과 같다
									// 중복이 발생하지 않았으면 통과한다.
						userNums[count] = empNum;
						break; // 사번 중복 확인용 무한 루프 탈출. 무한 루프를 나와서 나머지 데이터를 입력 받을 것임, while(true)바깥으로 고고
					} else { // else는 flag==true? 라고 물어보는 것임, 이것은 중복이 발생했다는 것임, 중복이 발생했으면 다시 입력 받아야 됨.
						System.out.println("사번을 다시 입력 해주세요");
						empNum = sc.next();

					}
				} // 여기가 while(true) 끝

				// 입력값을 배열의 인덱스에다가 바로 꽂는 과정. 이러면 따로 변수를 선언 해 줄 필요가 없지.
				System.out.println("- 사번 : ");
				names[count] = sc.next();
				// 입력값을 배열의 인덱스에다가 바로 꽂는 과정.
				System.out.println("- 나이 : ");
				ages[count] = sc.nextInt();
				// 입력값을 배열의 인덱스에다가 바로 꽂는 과정.
				System.out.println("- 부서명 : ");
				departments[count] = sc.next();

				System.out.println(names[count] + "님의 정상 등록 되었습니다.");
				count++; // 다음 사람은 다음 인덱스에 저장해야 하니까 꼭 써줘야함.
							// 안써주면 첫번째 요소에만 저장되려하니까..

			} else if (menu == 2) {
				/*
				 * 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성(즉, 널 금지). (count) 만약 사용자가 사원 등록을 한 명도 하지
				 * 않았다면 "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				 */

				if (count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				} else {
					System.out.println("==========전체 사원 정보=========");
					for (int i = 0; i < count; i++) {
						System.out.printf("%s %s %d세 %s\n", userNums[i], names[i], ages[i], departments[i]);
					}
				}

			} else if (menu == 3) {
				// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				// 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				// while(true)도 써도되는데 스위치 써볼 것임.
				System.out.println("# 조회하실 사원의 번호를 입력하세요. ");
				System.out.print("> ");
				String empNum = sc.next();

				// 이번엔 걸려야돼. 안걸리면 정보가 없는거임. 걸러야 인덱스에 걸려 나머지 데이터까지 출력을 하지.
				// 아까 플래그 써봤으니 다른 방식으로해보자.
				// 만약 사용자가 입력한 사번이 유저넘스라는 배열에 존재했다면 저기를 true,
				// 입력받은 사번의 정보를 출력할거고, 브레이크 걸릴 것이고 브레이크 걸린 것은 i가 count보다 무조건 작다는것을 의미한다.
				// 그러나 저 if문을 만족시키지 못했다면(입력한 사번이 존재하지 않는다면 if문도 안되고 break도 안되겠지. if문 밖에 if문을
				// 사용해서 i가 count와 같아졌니? 그럼 니가 입력한 사번은 없어졌어. 라는 것을 출력도 할 것이다.
				int i; // 제어변수의 i
				for (i = 0; i < count; i++) { // i를 카운트 전까지 하나씩 올려갈거임.
					if (empNum.equals(userNums[i])) { // 여기가 트루면 사용자가 입력한 사번이 배열에 존재한다는 뜻임
						System.out.println("========== 사 원 정 보 ==========");
						System.out.printf("%s %s %d세 %s\n", userNums[i], names[i], ages[i], departments[i]);
						break;
					}
				}
				// 그러나 위 if문을 만족시키지 못했다면(입력한 사번이 존재하지 않는다면 if문도 안되고 break도 안되겠지. if문 밖에 if문을
				// 사용해서 i가 count와 같아졌니? 그럼 니가 입력한 사번은 없어졌어. 라는 것을 출력도 할 것이다.
				// 플래그 사용하지 않고 반복문의 제어변수 i를 이용해서 존재유무를 판단했다.
				if (i == count) {
					System.out.println("조회하신 사원정보는 존재 하지 않습니다.");
				}

			} else if (menu == 4) {
				// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				// 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				// 사번이 존재하지 않는다면 없다고 얘기해 주세요.

				System.out.println("# 수정하실 사원의 번호를 입력하세요.");
				System.out.println("> ");
				String empNum = sc.next();

				// boolean 이용해보자
				boolean flag = false; // 찾으면 true로 바뀔 것 이다.
				for (int i = 0; i < count; i++) {
					if (empNum.equals(userNums[i])) { // 사용자가 입력한 empNum이라는 변수의 값이 같느냐? 즉, 배열에 존재하냐?
						System.out.println("# " + names[i] + "님의 정보를 변경합니다.");
						System.out.println("[1. 나이 변경 | 2. 부서 변경 | 3. 취소");
						System.out.println(" > ");
						int sel = sc.nextInt();

						switch (sel) {
						case 1:
							System.out.println("- 변경하실 나이를 입력하세요");
							System.out.print("> ");
							ages[i] = sc.nextInt();
							System.out.printf("나이가 %d세로 정상 변경되었습니다.\n", ages[i]);
							break;
						case 2:
							System.out.println("- 변경하실 부서를 입력하세요");
							System.out.println("> ");
							departments[i] = sc.next();
							System.out.printf("부서가 %s로 정상 변경 되었습니다.\n", departments[i]);
							break;
						case 3:
							System.out.println("- 정보 수정을 취소 합니다.");
							break;
						default:
							System.out.println("- 변경 메뉴를 잘못 입력하셨습니다.");
						}
						flag = true; // 일치하면(찾으면) flag가 true로 바뀌었다. 사번이 있냐 없냐 라는 문법.
						break;
					}
				}
				// for문 밖으로 나와서 검사해준다
				if (!flag) {// 낫플래그는 false니? 라고 묻는 것, 즉 실행하지 않을 코드
					System.out.println("조회하신 사원번호는 존재하지 않습니다.");
				}

			} else if (menu == 5) {
				// 사번을 입력받아서
				// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				// y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				// 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				// 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				System.out.println("# 삭제하실 사원의 번호를 입력하세요.");
				System.out.println("> ");
				String empNum = sc.next();

				boolean flag = false;
				// 반복문 이용해서 검색해보자
				for (int i = 0; i < count; i++) {
					if (empNum.equals(userNums[i])) {
						System.out.println("삭제할 사원 이름 : " + names[i]);
						System.out.println("정말 삭제하시겠어요? [Y/N]");
						System.out.println("> ");
						String answer = sc.next();

						// 사용자가 정상적인 답을 할때까지 할꺼면 와일트루 써도됨.
						// Y가 대소문자니 스위치문 써도 베스트.
						// if(answer.equals("Y" || answer.equals("y")){ 이런거 써도됨. 스위치문을 써보자
						switch (answer) {
						case "Y":
						case "y":
						case "ㅛ":
							if (i == userNums.length - 1) { // 이 구절의 뜻은 아래 count--; 부분에 있음.
								userNums[i] = null; // 이 구절 안써도 되는데 마지막 값이 삭제가 되진 않는다.
								names[i] = null; // 무슨말이냐면, 배열4개를 이용해서 사원정보 관리하잖아. 개네 길이가 다 100이다.
													// 100명이 꽉차있다고해봐. count는 100이지?. 만약 사용자가 마지막 등록한 사원을 삭제한다고 이 메뉴를
													// 선택한거다.
													// 우린 사원 입력을 받았고 boolean=false; 아래 구절을 통해 검색을 진행 해봤더니 맨 마지막에 있다.
													// 그럼 인덱스가 99번인거잖아. 99번 회원을 삭제하시겠어요? 네 라면 count-1; 반복문이 돌아간다.
													// 하지만 저 구절은 j<count-1;이니 98이다. 근데 시작이 99니까 조건식이 처음부터 false가 된다.
													// 마지막 요소가 삭제 되지 않은채로 카운트가 99가 된다. 마지막요소는 삭제하지 않았지만 새롭게 등록된다.
								ages[i] = 0; // int배열이니 0
								departments[i] = null;
							}

							for (int j = i; j < count - 1; j++) { // y니까 삭제를 해달라는 의미다. 그래서 삭제 진행하자.
																	// 뒤에 있는 값을 한칸 땡기라 라고 했으니 반복문을 통해 땡겨주자
																	// 배열의 크기는 따로 변경 없으니 반복문만 돌려 주면 된다.
								userNums[j] = userNums[j + 1];
								names[j] = names[j + 1];
								ages[j] = ages[j + 1];
								departments[j] = departments[j + 1];
							}
							count--; // 하나 까주자, 만약 크기가 100이라고 사원이 꽉 차 있다면 인덱스는 99번까지겠지.
							// 만약 사용자가 99번째 사용자를 삭제해달라고 하면
							// 일단 찾겠지. 마지막값이 99인 것을.
							// 삭제 요청하면 for(int j=99; count-1; 이겠지.
							// 그래서 if문을 간단하게 쓰고 마지막 값은 직접 null을하고 기본값을 0으로 지정하면 된다.
							// 반복문을 돌리기 전에 물어보면되지. 위에다가 적었음.

							System.out.println("# 삭제가 정상적으로 진행 되었습니다.");
							break;
						case "N":
						case "n":
						case "ㅜ":
							System.out.println("# 삭제를 취소 합니다.");
							break;
						default:
							System.out.println("# 잘못 입력 하셨습니다.");
							System.out.println("# 메인 메뉴로 돌아갑니다.");
							break;
						}

						flag = true; // 사번이 존재 한다면, 맞으면(있다면) 플래그가 트루로 변할 것이고 브레이크가 걸릴 것이다
						break;
					}
				}

				if (!flag) {
					System.out.println("# 조회하신 사원 정보는 존재하지 않습니다.");
				}

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		} // end while true
	} // end main
}
