public class arrays {
    //arrays:
public class new9 {
    public static void main(String[] args) {
        //arrays: contiguous memory allocation:
        int[]  rollno = new int[50];
        rollno[0] = 4;
        rollno[4] = 6;

        for(int i=0; i<5;i++){
            System.out.println(rollno[i]);
        }

    }
}

//2-D arrays:
public class new9 {
    public static void main(String[] args) {
        //arrays: contiguous memory allocation:
        int[][] matrix = new int[5][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[4][0] = 5;

        //nested loops:
        for(int i=0; i<=5; i++) {
            for(int j=0; j<2; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}

    
}
