import java.util.*;
public class FlowEx5 {
    public static void main(String[] args){
        int score;
        char grade,opt='0';                 // grade는 선언, opt는 0으로 초기화.

        System.out.print("점수를 입력하시오. >> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        // { } 의 위치를 파악하여, 각각의 문장이 어느 조건문의 문장인지를 파악해야한다.
        // 조건문안의 조건문이므로, 각각의 조건 사항들을 세밀하게 확인해야한다.
        
        if (score>=90)
        {
            grade='A';                      // score >= 90 을 만족한 조건식은 grade='A'를 갖는다.
            if (score>=94) opt = '+';       // 전제 : grade='A' 이고, score>=94를 만족하면, opt='+'를 가진다.
            else opt = '-';                 // 전제 : grade='A' 이고, score>=94가 아니라면(score >=90은 포함), opt='-'를 가진다.
        }
        else if (score>=80)
        {
            grade='B';
            if (score>=84) opt='+';
            else opt = '-';
        }
        else
        {
            grade='C';                      // opt='0'이 전제이므로, C+는 없다는 가정하에, opt 값을 바꾸진 않았다.
        }
        System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
        }
}
