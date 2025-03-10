import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){ // 반복문
        System.out.println("[SHAKESHACK MENU]");
        System.out.println("1. ShakeBuger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");
        System.out.print("번호를 선택해주세요: ");

        int choice = scanner.nextInt();

        if (choice == 1) { // 조건문을 넣어 참과 거짓을 통하여 다음 선택지로 이동할수 있게 만들었다.
            System.out.print("주문 수량: ");
            break;
        }else if (choice == 2) {
            System.out.print("주문 수량: ");
            break;
        }else if (choice == 3) {
            System.out.print("주문 수량: ");
            break;
        }else if (choice == 4) {
            System.out.print("주문 수량: ");
            break;
        }else if (choice == 0) {
            System.out.println("프로그램을 종료합니다."); // 0번을 눌렀을 경우에 키오스크가 종료되도록 한다.
            break;
        }else
            System.out.println("잘못선택하셨습니다. 다시 선택해주세요."); // 마지막에 else문을 넣어 거짓일 경우 SHAKESHACK MENU로 다시 이동하게 break문은 뺀다.
        }


        }
    }

