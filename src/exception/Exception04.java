package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {

	public static void main(String[] args) {
		try {
			// readFile���\�b�h���Ăяo��
			Exception04.readFile("exception.txt");
		// �Ăяo��������O�������L�q���Ȃ��ƃR���p�C���G���[�ɂȂ�
		} catch (FileNotFoundException e) {
			// ��O���������s�����
			System.out.println("FileNotFoundException��O������");
		}
		// catch���ŗ�O���������̂ŁA���������s�����
		System.out.println("�v���O�����I��");
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("�t�@�C���̓ǂݍ��݊J�n");
		// �t�@�C�������݂��Ȃ����ߗ�O������
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "�̓ǂݍ��݊���");
	}

}
