public class VairableOperation {

   static int a=10;

   static
   {
        System.out.println("static variable is:"+a);
   }
   public static void disp()
   {
        System.out.println("value:"+a);;
   }
   void addNumber()
   {
        int a1=10;
        int b=20;

   }

   void multiNUmber()
   {
        int a1=90;
        System.out.println(a1);
   }
   public static void main(String[] args) {
        

    VairableOperation operation=new VairableOperation();
    operation.addNumber();
    operation.multiNUmber();
    VairableOperation.disp();

    System.out.println("****************Static variable accessing************");
    System.out.println("static variable access directly:"+a);
    System.out.println("Static variable access with object:"+operation.a);
    System.out.println("statci variable access with classname:"+VairableOperation.a);


    }
}
