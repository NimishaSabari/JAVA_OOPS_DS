package JAVA_OOPS_DS.JAVA;

public class switchcase {
    //switch case :

    public static void main(String[] args) {
        char attendance = 'O';
        switch(attendance)
        {
            case 'O':
                System.out.println("on-duty");
                break;
            case 'P':
                System.out.println("attended");
                break;
            case 'A':
                System.out.println("not attended");
                break; 
            default:
                System.out.println("Invalid");
        }
    }
}

    

