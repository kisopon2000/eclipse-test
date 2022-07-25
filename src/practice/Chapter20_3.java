package practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Chapter20_3 {

	public static void main(String[] args) {
		Task task = new Task();
		// 1�X���b�h�ŏ���������ExecutorService�𐶐�
		ExecutorService pool = Executors.newSingleThreadExecutor();
		try {
			// �^�X�N�����s�����Future���Ԃ����
			Future<Long> future = pool.submit(task);
			try {
				// �X���b�h�̏I����҂��A�߂�l���󂯎��
				System.out.println("���X���b�h�̏I���҂�");
				long sum = future.get();
				System.out.println("���v�Z����=" + sum);
			// �}���`�L���b�`�B�����̗�O���܂Ƃ߂ď������邱�Ƃ��ł���
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		} finally {
			// ExecutorService�̒�~(�V�K�̃^�X�N���󂯕t���Ȃ��悤�ɂ���)
			pool.shutdown();
		}
	}

	// Long�^�̒l��Ԃ�Callable
	static class Task implements Callable<Long> {
		@Override
		public Long call() throws Exception {
			long sum = 0;
			// �P����10�̍��v���Z�o
			for (int i = 0; i < 10; i++) {
				sum += (i + 1);
				// ���Ԃ̂����鏈���̑����300ms�҂�
				Thread.sleep(300);
				System.out.println("����" + (i + 1) + "���");
			}
			return sum;
		}
	}
}
