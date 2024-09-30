package CH21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C03FileInputStreamMain {

	public static void main(String[] args) throws Exception {

		InputStream fin = new FileInputStream("C:\\TMP_IO\\data1.exe");
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = fin.read();
			if(data==-1)
				break;
//			System.out.print((char)data);
			size++;
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime - sTime) + "ms");
		System.out.println("파일크기 : " + (size * 1.0)/(1024*1024) + "MB");
	}

}
