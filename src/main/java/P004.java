public class P004 {
    public static void main(String[] args) {
        int trigger = 30;

        switch (trigger){
            case 20:
                System.out.println("20대 입니다.");
                break;
            case 30:
                System.out.println("30대 입니다");
                break;
            case 40:
                System.out.println("40대 입니다.");
                break;
            case 50:
                System.out.println("50대 입니다.");
            default:
                System.out.println("반드시 실행");
                break;
        }
    }
}
