import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>(); //리스트
        menuItems.add(new MenuItem("ShakeBuger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Scanner scanner = new Scanner(System.in);

        System.out.println("[SHAKESHACK MENU]");
        for (MenuItem menu : menuItems) {
            System.out.println(menu);
        }


        System.out.println("0. 종료      | 종료");
        System.out.print("번호를 선택해주세요: ");

        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.println(menuItems.get(0));
                System.out.print("수량: ");
                break;
            case 2:
                System.out.println(menuItems.get(1));
                System.out.print("수량: ");
                break;
            case 3:
                System.out.println(menuItems.get(2));
                System.out.print("수량: ");
                break;
            case 4:
                System.out.println(menuItems.get(3));
                System.out.print("수량: ");
                break;
            case 0:
                System.out.println("프로그램을 종료합니다."); // 0번을 눌렀을 경우에 키오스크가 종료되도록 한다.
                break;
            default:
                System.out.println("잘못선택하셨습니다. 다시 선택해주세요.");

        }


    }
}

