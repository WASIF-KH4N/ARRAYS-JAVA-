import java.net.SocketOption;
import java.sql.SQLOutput;

class Multi_2D_Array {
    public static void main(String []args){
       /* int array[][]=new int[2][];  //JAGGED ARRAY
        array[0]= new int [3];
        array[1]= new int [2];
        //System.out.print(array[0].length);   //3
        System.out.println(array[0][1]=20);
        //System.out.print(array[1][2]=9); //ArrayIndexOutOfBoundException
        System.out.print(array[1][1]=56);
        int array[][]=new int [2][5];
        System.out.print(array[0][4]=27);*/


                                                                   // J A G G E D    |   A R R A Y
        /*int arr[][]={{1,2,3},{4,5,6,7},{8,9,10,11}};
        for( int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();*/


                                                                  // M A T R I X    |    A R R A Y
        /*int array[][]= new int [3][5];
        System.out.println(array[2][4]=100);
        System.out.println(array[2][4]=100);
        System.out.println(array[0][3]=101);
        System.out.println(array[2][1]=102);
        System.out.println(array[1][1]=103);
        System.out.println(array[0][2]=104);*/


        int array[][]={{100,101,102,103},{200,201,202,203},{300,301,302,303}};
        //System.out.print(array)  //[[I@7b23ec81
        // System.out.print(array[0]); //[I@7b23ec81
        // System.out.print(array[0][0]+" "); // 100
        //System.out.print(array[1][3]+" "); // 203
        //System.out.print(array[2][2]+" "); // 302
        //System.out.print(array[1][0]+" "); // 200

       // System.out.println(array.length);    // 3
       // System.out.println(array[0].length);   // 4
       // System.out.println(array[0][0].length);  // Compile Time Error

        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" , ");
               }
            System.out.println();

            }
        }
    }
