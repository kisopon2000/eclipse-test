package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter19_3 {
	public static void main(String[] args) {
		// try-with-resources���g�p
		try (FileOutputStream fos = new FileOutputStream("C:\\pleiades\\workspace\\test.txt")) {
			fos.write(0x41); // 16�i��41��A��\��
		} catch (FileNotFoundException e) {
			System.out.println("�t�@�C��������܂���ł���");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�G���[�ł�");
			e.printStackTrace();
		}
	}
}