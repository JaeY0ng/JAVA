package CH24;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws Exception {
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING");

		while (true) {
			Socket client = server.accept();
			System.out.println("[INFO] SERVER ACCEPTED...CLIENT IP : " + client.getInetAddress());
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			dout.writeUTF("WELCOME TO SERVER!..");
			dout.close();
			out.close();
			client.close();
		}

//		System.out.println("[INFO] SERVER EXITED.....");
//		server.close();

	}
}
