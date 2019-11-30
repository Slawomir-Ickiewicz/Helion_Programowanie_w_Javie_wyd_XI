package Chapter07.EX_7_14_PG_386;

public class ListOfArguments {

    public static int product (int ... numbers){

        int x = 1;

//        for (int i = 0; i <numbers.length-1 ; i++) { //solution using fori loop
//
//            x = x*numbers[i+1];
//        }
//        return x;


        for (int num:numbers   //solution using foreach loop
             ) {
            x = x*num;
        }
        return x;
    }



    public static void main(String[] args) {
        System.out.println(product(3,2,3));
    }
}
