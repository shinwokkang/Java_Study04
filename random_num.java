import java.util.*;
public class random_num {
    public static void main(String[] args){
        System.out.print("가위(1), 바위 (2), 보(3) 중 하나를 입력하세요 >> ");
        Scanner sc=new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int)(Math.random()*3)+1;             // Math.random() = 난수 생성을 위한 함수
        switch (user){
            case 1:
                System.out.println("당신은 가위를 내셨습니다.");
                break;
            case 2:
                System.out.println("당신은 바위를 내셨습니다.");
                break;
            case 3:
                System.out.println("당신은 보를 내셨습니다.");
                break;
        }
        switch (com){
            case 1:
                System.out.println("컴퓨터는 가위를 냈습니다.");
                break;
            case 2:
                System.out.println("컴퓨터는 바위를 냈습니다.");
                break;
            case 3:
                System.out.println("컴퓨터는 보를 냈습니다.");
                break;
        }
        switch(user-com){
            case -1: case2:
                System.out.println("컴퓨터가 이겼습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            default:
                System.out.println("무승부입니다.");
        }
    }
}
