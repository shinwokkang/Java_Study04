import java.util.*;
public class FlowEx6 {
    public static void main(String[] args){
        System.out.print("현재 월을 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        switch (month)
        {
            case 3: case 4: case 5:                 // month가 3 4 5 일때.
                System.out.println("봄입니다.");
                break;                              // break 가 없으면, break가 나오기 전까지의 모든 것을 출력한다.
            case 6: case 7: case 8:
                System.out.println("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다.");
                break;
            default:
                System.out.println("겨울입니다.");
        }
    }
}
