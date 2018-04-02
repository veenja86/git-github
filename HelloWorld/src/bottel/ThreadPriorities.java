package bottel;

public class ThreadPriorities extends Thread {
	public void run(){
		System.out.println("Running thread name is:"+Thread.currentThread().getName());
		System.out.println("Running thread priority is : "+Thread.currentThread().getPriority());
		if(Thread.currentThread().isDaemon())
			System.out.println("Daemon thread is working..!!");
		else
			System.out.println("User Thread is working:::");
	}
	public static void main(String[] args) {
		ThreadPriorities tp1=new ThreadPriorities();
		ThreadPriorities tp2=new ThreadPriorities();
		ThreadPriorities tp3=new ThreadPriorities();
		
		//tp1.setPriority(MAX_PRIORITY);
		//tp2.setPriority(NORM_PRIORITY);
		tp3.setDaemon(true);
		tp1.start();
		tp2.start();
		tp3.start();
		
	}

}
