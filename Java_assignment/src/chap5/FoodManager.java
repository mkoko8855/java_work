package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodManager {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>(); /// * 타입은 스트링, 인티져 > 키값은 스트링, 밸류는 인티져 */
		Scanner sc = new Scanner(System.in);
		/* 키값은 음식이름 밸류는 음식값이 되겠지? */

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		while (true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();

			System.out.println("--------------------------------");

			if (menu == 1) {
				/*
				 * - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다. 이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.' 를 출력하시고
				 * 메인 메뉴로 돌아와 주세요. - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				System.out.print("메뉴명: "); /* 맵은 키값을 중복이 안되니 가격 입력하기 전에 if절로 물어봐야함 */
				String name = sc.next();
				if (foods.containsKey(name)) { /* 키의 존재 유무를 확인하는 메서드인 containsKey */
					System.out.println("이미 등록된 메뉴입니다.");
				} else {
					System.out.print("가격: ");
					int price = sc.nextInt(); /* 이름받고 가격 받았으니 추가하자. 리스트나 셋은 add고 map에선 put이다. */
					foods.put(name, price);
					System.out.printf("%s 음식이 등록되었습니다.\n", name);
				}
			} else if (menu == 2) {
				/*
				 * - 만약 메뉴가 하나도 등록되어 있지 않다면 '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜 주세요.
				 * 
				 * - Map의 모든 요소를 반복문을 이용하여 출력해 주세요. ex) 메뉴명 : 가격 메뉴명 : 가격 메뉴명 : 가격....
				 * 
				 * 메뉴를 모두 출력 후에 선택지를 제공하세요. (1. 수정 | 2. 삭제 | 3. 취소) - 수정: 수정할 메뉴명을 입력받아서 가격 수정을
				 * 진행하세요. 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				 * 
				 * - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요. 없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				 * 
				 * - 취소: 메인 메뉴로 이동
				 */
				if (foods.isEmpty()) {
					System.out.println("메뉴부터 먼저 등록하고 오세요!");
					/* 컨티뉴는 틀린건 아닌데 컨티뉴 없어도 위로 올라감 */
				} else {
					/*
					 * 이제 전체메뉴 출력해야지 > 키부터 얻어와야 하는데 Map한테 얘기를 해야지 > Map에 전달하는 메서드는 KeySet > Set으로 리턴
					 * 해 줄것이다.
					 */
					System.out.println("---------- 메뉴판 ----------");
					for (String m : foods.keySet()) { /* Key가 스트링이니까..Key를 받아주려면 스트링변수 m을 선언해주자 */
						System.out.println(
								m + " : " + foods.get(m)); /* 키주면서 밸류얻어주는 메서드는 get이다. > 얜 벨류주고 키를 계속 받겠다는 얘기다. */
					}
					System.out.println("---------------------------\n");

					System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
					System.out.print("> ");
					int sel = sc.nextInt();

					switch (sel) {
					case 1:
						System.out.println("수정하실 메뉴를 입력하세요");
						System.out.print("> ");
						String uMenu = sc.next();
						if (foods.containsKey(uMenu)) { /* 이번엔 존재 해야 수정을 해주겠지? */
							System.out.print("수정할 가격: ");
							int newPrice = sc.nextInt(); /* 수정 메서드도 put이다! > 기존의 존재하는 key를 통해 put을 진행하면 value가 수정된다! */
							foods.put(uMenu, newPrice);
							System.out.printf("%s 음식이 %d원으로 변경되었습니다.\n", uMenu, newPrice);
						} else {
							System.out.println("존재하지 않는 메뉴입니다.");
						}
						break;

					case 2:
						System.out.println("삭제하실 메뉴를 입력하세요.");
						System.out.print("> ");
						String del = sc.next(); /* del 변수에 메뉴가 있어야 삭제를해줄꺼잖아..없으면 삭제 못하니까. 확인하고 삭제 할지말지 판단해야겠지? */
						if (foods.containsKey(del)) {
							foods.remove(del); /* 키만 삭제하는게 아니라 밸류도 같이 삭제될거임! > 맵안에선 키와 밸류는 한 쌍이다. */
							System.out.printf("%s 음식이 삭제되었습니다.\n", del);
						} else {
							System.out.println("존재하지 않는 음식입니다.");
						}
						break;

					case 3:
						System.out.println("메인 메뉴로 돌아갑니다.");
						break;

					default:
						System.out.println("메뉴를 잘못 입력하셨습니다.");
						System.out.println("메인 메뉴로 돌아갑니다.");
					}
				}

			} else if (menu == 3) {
				/*
				 * - Y / N를 입력받아서 Y가 입력되면 프로그램 종료. 그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.println("프로그램을 종료합니다. [Y/N]");
				System.out.print("> ");
				String quit = sc.next();
				if (quit.toLowerCase().equals("y")) { /* 대문자던 소문자던 비교해서 종료하겠지~ */
					System.out.println("종료합니다.");
					sc.close();
//					break;
					System.exit(0); /* 여기엔 break;줘도 됨. 0은 예외 없이 종료했다는 것이다. */
				} else {
					System.out.println("종료를 취소합니다.");
				}

			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
	}
}
