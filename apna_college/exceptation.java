public class exceptation {
    public static void main(String[] args) {
        int[] marks = {97,98,95};
        try {
            System.out.println(marks[5]);
        } catch(Exception exception){
            System.out.println(exception);
        }
        
        System.out.println("The namme is Aman");
    }
}
