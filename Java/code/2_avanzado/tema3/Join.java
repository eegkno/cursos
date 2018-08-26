public class Join extends Thread {
	public void run() {
		for (int i = 0; i < 8; i++)
			System.out.println("Mi hilo");
	}

 	public static void main(String [] args){
		Join t = new Join();
		t.start();
		for (int i = 0; i < 8; i++){ 
			System.out.println("Hilo de main");
			if(i == 4){
				try{
					t.join();
				}catch(Exception e){}
			}
		}
	}
}
