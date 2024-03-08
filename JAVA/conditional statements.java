public class conditionalstatements {
    //conditional statements :
//program 1:
//if else statement :
public class new5 {
    public static void main(String[]args){
        boolean attendance = true;
        if(attendance == true){
            System.out.println("attended");
        }
        else{
            System.out.println(" did not attend");
        }
    }
}

//if elseif else statements :
//program 2:
public  class new5{
    public static void main(String[] args) {
        char attendance ='O';
        if(attendance == 'P'){
            System.out.println("attended");
        }
        else if(attendance == 'O'){
            System.out.println("on-duty");
        }
        else{
            System.out.println(" did not attend");
        }
       System.out.println("program ends ");

    }
}

//Nested -if statements :
//program 3:
public class new5 {
    public static void main(String[]args){
        char attendance = 'P';
        int total = 40 ;
        if(attendance == 'P')
        {
            if (total >= 50)
            {
                System.out.println("attended");
            }
        }
        else
        {
            System.out.println(" did not attend");
        }
        System.out.println("prgrm ends");
    }
}

    
}
