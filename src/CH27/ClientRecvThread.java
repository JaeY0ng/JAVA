package CH27;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientRecvThread implements Runnable{
	
	Socket server;
	Cgui cgui;
	DataInputStream din;

	public ClientRecvThread(Cgui cgui, Socket server) {
		this.cgui = cgui;
		this.server = server;
	}

	@Override
	public void run() {
		try {
			din = new DataInputStream(server.getInputStream());
			String recv = null;
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")|| recv == null)
					break;
				cgui.area.append("[CLIENT] " + recv + "\n");
			}
			System.out.println("[SERVER] 수신 종료");
			cgui.area.append("[CLIENT] 와의 연결을 종료합니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
