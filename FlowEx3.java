import java.util.*;
/* if-if 문은 조건문이 참이면 실행 아니면 무시이지만,
*  if - else 문은 둘 중 하나는 무조건 실행된다. */
public class FlowEx3 {
    public static void main(String[] args){
        System.out.println("if - if 문 ");

        System.out.print("숫자를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A==0) System.out.println("입력하신 숫자는 0입니다. ");    // if 문은 A == 0 조건만 따진다.
        System.out.println("");

        System.out.println("if - else 문");

        System.out.print("숫자를 입력하세요. >> ");
        int B = scanner.nextInt();
        if (B==0) System.out.println("입력하신 숫자는 0입니다. ");  // if - else 문은 A == 0 조건 + A != 0 조건을 따지고 둘 중 하나의 결과를 반드시 가진다.
        else System.out.println("입력하신 숫자는 0이 아닙니다. ");
    }
}
