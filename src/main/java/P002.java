import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("나이를 입력하세요\n");
        int age = in.nextInt();
        if(age >= 20){
            System.out.println("성인");
        }else{
            System.out.println("미성년자");
        }
    }
}
