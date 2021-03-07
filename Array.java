
public class Array {
   
   public static int [] a = new int[10];
   public static int pointer = 0;
   public static void main(String[] args) {
      push(2);
      push(1);
      dumpstack();
      push(3);
      push(10);
      pop();
      push(15);
      dumpstack();
      pop();
      pop();
      dumpstack();
      pop();
      pop();
      pop();
      dumpstack();
     
      
         }
   public static void pop(){
      
      if(pointer == 0){
        System.out.println("Nothing to pop");
      }else{
         pointer--;
         int popval = a[pointer];
         a[pointer] = 0;
      
         System.out.println(popval);
      }
      
   }
   public static void push(int val){
      if(pointer == a.length){
         System.out.println("Full array");
       }else{
         System.out.println("Pushed " + val);
         a[pointer] = val;
         pointer++; 
       }
      
   }
   public static void dumpstack(){
      System.out.print( "[ ");
      for(int i = pointer-1; i >= 0; i--){
         System.out.print(a[i] + " ");
         
         
      }
      System.out.println( "]");
   }
   
}
