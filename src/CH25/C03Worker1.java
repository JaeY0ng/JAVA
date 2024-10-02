package CH25;

public class C03Worker1 implements Runnable{

	
	C03GUI gui;
	C03Worker1(C03GUI gui){
		this.gui = gui;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			gui.area1.append("TASK01...\n");
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
