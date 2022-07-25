package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Chapter19_4 {
	public static void main(String[] args) {
		// try-with-resources���g�p
		try (FileInputStream fis = new FileInputStream("C:\\pleiades\\workspace\\test.txt")) {
			int c;
			while ((c = fis.read()) != -1) {
				// �o�C�i���l��16�i��������ɕϊ����ďo��
				System.out.print(Integer.toHexString(c));
			}
		} catch (FileNotFoundException e) {
			System.out.println("�t�@�C��������܂���ł���");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�G���[�ł�");
			e.printStackTrace();
		}
	}
}