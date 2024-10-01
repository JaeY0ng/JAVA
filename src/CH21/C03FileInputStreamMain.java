package CH21;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C03FileInputStreamMain {

	public static void main(String[] args) throws Exception {

		InputStream fin = new FileInputStream("C:\\TMP_IO\\data.xlsx");
		InputStreamReader subIn = new InputStreamReader(fin);
		subIn.read();

		while (true) {
			int data = fin.read();
			if (data == -1)
				break;
			System.out.print((char) data);
		}

	}

}
