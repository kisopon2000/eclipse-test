package practice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Chapter19_5 {
	public static void main(String[] args) throws IOException {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(0x41); // A
		bos.write(0x42); // B
		bos.write(0x43); // C
		byte[] data = bos.toByteArray();
		// data�́u0x41,0x42,0x43�v���������v�f��3��byte�^�z��
		for (byte b : data) {
			System.out.print(Integer.toHexString(b) + " ");
		}
	}
}
