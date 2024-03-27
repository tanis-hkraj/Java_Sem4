class A extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("Executing A");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("From B");
        }
    }
}


class Threads_17 {
    public static void main(String[] args){
        A obj1=new A();
        B obj2=new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();

        // Here A and B runs at the same time Parallely
    }
}
