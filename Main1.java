class Main1
{
    public static void main(String args[]){
       OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
       printer.printMessage();   
       OuterClass outer = new OuterClass();        
       OuterClass.InnerClass inner  = outer.new InnerClass();
       inner.display();
       OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

       innerObject.display();
    }
}

   
class OuterClass{
    private static String msg = "Welcome";
    public static String msg1= "Java";
    public static class NestedStaticClass{
        public void printMessage() {
            System.out.println("Message from nested static class: " + msg1); 
        }
    }
    public class InnerClass{
        public void display(){
            System.out.println("Message from non-static nested class: "+ msg1);
        }
    }
}