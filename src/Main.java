import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            List<MenuItem> menuItems = new ArrayList<>();
            menuItems.add(new MenuItem("ShakeBuger"  , 6.9 , "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("SmokeShack"  , 8.9 , "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("Cheeseburger" , 6.9 , "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
            menuItems.add(new MenuItem("Hamburger" , 5.4 , "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("[SHAKESHACK MENU]");
        for(MenuItem menu : menuItems) {
            System.out.println(menu);
        }


            System.out.println("0. 종료      | 종료");
            System.out.print("번호를 선택해주세요: ");

        int choice = scanner.nextInt();

        switch(choice) { // 조건문을 넣어 참과 거짓을 통하여 다음 선택지로 이동할수 있게 만들었다.
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.print("주문 수량: ");

            case 0:
            System.out.println("프로그램을 종료합니다."); // 0번을 눌렀을 경우에 키오스크가 종료되도록 한다.

            default:
            System.out.println("잘못선택하셨습니다. 다시 선택해주세요."); // 마지막에 else문을 넣어 거짓일 경우 SHAKESHACK MENU로 다시 이동하게 break문은 뺀다.
        }


        }
    }

