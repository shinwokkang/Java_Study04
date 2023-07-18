import java.util.*;
public class FlowEx2 {
    public static void main(String[] args){
        int input;

        System.out.print("블록을 사용할 때. %n");
        System.out.print("성적을 입력하시오 (90이상 합격) >> ");

        Scanner scanner = new Scanner(System.in);
        String score = scanner.nextLine();
        int grade = Integer.parseInt(score);

        if(90 <= grade && grade <= 100){                    /* 90이상 100 이하의 성적을 입력시, 조건문을 출력한다. */
            System.out.printf("성적은 %d입니다. %n",grade);
            System.out.printf("합격입니다. %n");
        }
        System.out.printf("%n");

        System.out.print("블록을 사용하지 않았을 때. %n");
        System.out.print("성적을 입력하시오 (90점 이상 합격) >> ");
        String score2 = scanner.nextLine();
        int grade2 = Integer.parseInt(score2);
        if(90<=grade2 && grade2 <=100)                      /* 볼록을 없앰으로서 "합격입니다"는 조건문과 관련없이 출력된다. */
            System.out.printf("성적은 %d입니다. %n",grade);
            System.out.printf("합격입니다.%n");


    }
}
