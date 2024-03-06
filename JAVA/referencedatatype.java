package JAVA_OOPS_DS.JAVA;
//reference datatype
//primitive if there are two values theey will not be dependent on each otherr
//reference -> dependent on each other (2 var ) : hence if we change one value both values will be changed to same

import java.awt.*;
import java.util.Date;

public class referencedatatype {
    public static  void main(String[] args) {
        //primitive:
        int a = 10;
        int b = a;
        a = 5;
        System.out.println(a);
        System.out.println(b);

        Date today = new Date(); //new :space alocate default
        System.out.println(today);
        //reference :
        Point p1 = new Point(5,7);
        Point p2 = p1;
        System.out.println(p1);
        p1.x =7;
        System.out.println(p1);
        System.out.println(p2);

    }
}
 