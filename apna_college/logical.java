import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        int a = 30;
        int b = 70;
        // if (a < 50 && b < 50) {
        //     System.out.println("both less than 50");
        // }
        // else {
        //     System.out.println("both are not less than 50");
        // }
    //     if (a < 50 || b < 50) {
    //         System.out.println("atlesast one less than 50");
    //     }
    //     else {
    //         System.out.println("noone are not less than 50");
    //     }
    // boolean isAdult = true;
    // if (!isAdult) {
    //     System.out.println("is adult");
        
    // }    else{
    //     System.out.println("is not adult");
    // }
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
            
        }
        else if (cash > 10 && cash < 50) {
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get both thing");
        }

}    

}
