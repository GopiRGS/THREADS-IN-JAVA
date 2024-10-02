class A extends Thread{
    public void run(){
        disp();
    }
    public void disp(){
        for(int i=0;i<10;i++){
            System.out.println("HI HELLO");
            // 10ms pass this function
            //plz use try catch
            try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}}
class B extends Thread{
    public void run(){
        disp();
    }
    public void disp(){
        for(int i=0;i<10;i++){
            System.out.println("OK BYE...");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
                
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
     A a1 = new A();
     B b1 = new B();
     a1.start();
     b1.start();
    }
}
