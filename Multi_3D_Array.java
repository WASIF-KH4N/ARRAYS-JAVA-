class Multi_3D_Array {
    public static void main(String[] args) {
      /* int a[][][]=  {{{1,2,3,4},{4,5,6,7}},{{8,9,10,11},{12,13,14,15}}};
        //int a[][][]= {{{1,2},{3,4},{5,6},{7,8}}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }*/

       /* int arr[][][]= new int [2][][];
        arr[0]= new int[2][];
        arr[0][0]=new int[4];
        arr[0][1]=new int [3];
        arr[1]= new int [2][];
        arr[1][0]=new int [4];
        arr[1][1]= new int [7];*/

        int array[][][]={{{1,2,3},{7,4,0}},{{1,9,5},{2,3,8}}};
        //System.out.println(array);
        System.out.println(array[0]);         // [[I@7b23ec81
        System.out.println(array[0][0]);        // [I@6acbcfc0
        System.out.println(array[0][0][0]);//1
        System.out.println(array[0][1][0]);// 7
        System.out.println(array[1][0][2]);// 5
        System.out.println(array[1][1][1]);//3
        System.out.println(array.length);    //2
        System.out.println(array[1].length);  //2
        System.out.print(array[0][0].length); //3
        //System.out.print(array[0][0][0].length);  //Compile time error


    }
}
