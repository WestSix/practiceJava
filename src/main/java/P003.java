public class P003 {
    public static void main(String[] args) {
        int age = 30;
        if(age >= 20){
            System.out.println("성인입니다.");
            if(age >= 30){
                System.out.println("성인이고, 30대 입니다.");
            }
        } else if(age >= 30){
            System.out.println("성인이고, 30대 입니다.");
        } else{
            System.out.println("미성년자입니다.");
        }
        System.out.println("분기종료");
    }
}
