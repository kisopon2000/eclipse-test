package exception;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exception02 {

	public static void main(String[] args) {
		// try-catch-finally���̊J�n
		try {
			// try�u���b�N�F��O����������\�������鏈�����L�q
			String allData = Files.readString(Paths.get("c:\\temp\\memo.txt"));
			System.out.println(allData);
		// IOException�����������ꍇ�̗�O����
		} catch (IOException e) {
			// ��O�N���X����v����̂ŁA��O���������s�����
			System.out.println("��O������");
		} finally {
			// ��O�������Ă��A���Ȃ��Ă��A���������s
			System.out.println("�v���O�����I��");
		}
	}

}
