import java.util.*;
public class Char_case {
    public static void main(String[] args){
        System.out.print("주민등록번호를 입력해주세요. (123456-1234567) >> ");
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();

        char gender = regNo.charAt(7);
        String birth = regNo.substring(0,2);
        
        System.out.printf("%c %n",gender);

        switch (gender){
            case '1': case '3':
                switch (gender){
                    case '1':
                        System.out.printf("19%s년생 남성입니다.",birth);
                        break;
                    case '3':
                        System.out.printf("20%s년생 남성입니다.",birth);
                        break;
                }
            case '2': case '4':
                switch (gender) {
                    case '2':
                        System.out.printf("19%s년생 여성입니다.");
                        break;
                    case '4':
                        System.out.printf("20%s년생 여성입니다.");
                }

        }


    }
}
