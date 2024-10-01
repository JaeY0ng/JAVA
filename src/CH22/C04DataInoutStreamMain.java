package CH22;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class C04DataInoutStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("C:\\TMP_IO\\test3.txt");
		DataOutputStream dout = new DataOutputStream(out);
		dout.writeUTF("홍길동");
		dout.writeDouble(95.5);
		dout.writeInt(100);
		dout.flush();
		dout.close();
	}

}
