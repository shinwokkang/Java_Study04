import java.util.*;
// if-if문 if-else if문 if-else문을 비교하는 코드입니다.
public class FlowEx4 {
    public static void main(String[] args){
        char grade;

        System.out.print("점수를 입력하시오 >> ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score>=90) grade='A';
        else if (score>=80) grade='B';              // = if(80 <= score && score < 90) 과 같다.
        else if (score>=70) grade ='C';             // if-if문은 앞의 문장의 참 거짓과 관련이 없지만, if-else if에서 else if문은 if문의 거짓 조건도 포함한다.
        else grade ='D';                            // 이 문장이 없으면, score<70 에서 변수 grade는 쓰레기 값을 가진다.
        System.out.println("당신의 학점은"+grade+"입니다.");



    }
}
