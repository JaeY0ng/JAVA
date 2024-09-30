package CH21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05Buffer차이확인 {

	public static void main(String[] args) throws Exception {

		InputStream fin = new FileInputStream("C:\\TMP_IO\\data.csv");
		byte[] buffer = new byte[1024];    // 1kbyte 버퍼
		
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = fin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
			
		}
	}

}
