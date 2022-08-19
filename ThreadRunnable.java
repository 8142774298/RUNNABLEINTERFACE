public class ThreadRunnable implements Runnable {
	public void run(){
		System.out.println("Hello India");
	}
	public static void main(String args[]){
		{
		    ThreadRunnable r=new ThreadRunnable();
		    Thread t1=new Thread(r);
		    t1.start();
		    
		    Thread t2=new Thread(r);
		    t2.start();
		
		    Thread t3=new Thread(r);
		    t3.start();
		    Thread t4=new Thread(r);
		    t4.start();
		   
		    Thread t5=new Thread(r);
		    t5.start();
		}
	}
}
//executed on java programiz compiler
