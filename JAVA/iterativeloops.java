public class iterativeloops {
    //iterative statement /loops:
//statement that had to print -> n times thats called iterative statements
//FOR LOOP:
public class new7 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        // for (initialization;condition;updation)
        for (int i=0;i<=n;i++)
        {
            sum =sum+=i;

        }
        System.out.println(sum);
    }
}

//WHILE LOOP:
//no.of times unknown use -> while loop://entry controlled loop:
public class new7 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 1;

        while(i<=n)
        {
            sum =sum+=i;
            i++;

        }
        System.out.println(sum);
    }
}

//DO WHILE LOOP://exit controlled loop: atleast once this will run :
public class new7 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 6;

        do{
            sum =sum+=i;
            i++;
        }while(i<=n);

        System.out.println(sum);
    }
}
    
}
