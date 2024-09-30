package CH21;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws IOException {
		
		//URL 객체생성( Deprecated...)
		URL url = new URL("https://n.news.naver.com/mnews/article/014/0005247192");
		
		// 스트림 꺼내기
		InputStream bin = url.openStream();
		
		//보조스트림
		BufferedInputStream buffIn = new BufferedInputStream(bin); // 보조스트림, 버퍼공간 단위로 수신
		Reader in = new InputStreamReader(buffIn); // 보조스트림, byte단위 -> char단위로 변환
		
		//확인
		Writer out = new FileWriter("C:\\TEP_ID\\index.html");
		while(true) {
			int data = in.read();
			if(data==-1)
				break;
			System.out.print((char)data);
			out.write((char)data);
		}
		out.flush();
		out.close();
		in.close();
		buffIn.close();
		bin.close();
	}

}
