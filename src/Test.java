public class Test {
    public static void square(int number){
        System.out.println(number*number);
    }
    public static void main(String args[]){
     System.out.println("Main of Test");
     int n=Integer.parseInt(args[0]);
     square(n);
    }
    
}
