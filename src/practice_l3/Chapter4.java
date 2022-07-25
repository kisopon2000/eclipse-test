package practice_l3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter4 {

	public static void main(String[] args) {
		// ArrayList�𐶐�����ꍇ
		List<String> list1 = new ArrayList<String>();

		// LinkedList�𐶐�����ꍇ
		List<Integer> list2 = new LinkedList<Integer>();
		
		// �v�f��ǉ�����
		list1.add("���");
		list1.add("�݂���");
		
		// �ʒu���w�肵�ėv�f��ǉ�����
		list1.add(1, "�o�i�i");
		
		// �v�f���擾����
		String item = list1.get(0);
		
		for (String list : list1) {
		  System.out.println(list); // �k�C���A�X���A�H�c���̏��ɕ\��
		}
		
		
		// HashMap�𐶐�����ꍇ(�L�[��Integer�A�l��String)
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// TreeMap�𐶐�����ꍇ(�L�[�A�l����String)
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// �v�f��ǉ�����
		map1.put(0, "�Ԃǂ�");
		map1.put(3, "����");

		// �o�^�ς݂̃L�[�Œǉ�����Ə㏑�������
		map1.put(0, "�}�X�J�b�g");
		
		// �v�f���擾����
		map1.get(0); // �}�X�J�b�g��Ԃ�
		map1.get(1); // null��Ԃ�
		
		// �L�[�̂�
		for (Integer key : map1.keySet()) {
		  System.out.println(key); // HashMap�Ȃ̂ŏ����͕s��
		}

		// �l�̂�
		for (String name : map1.values()) {
		  System.out.println(name); // HashMap�Ȃ̂ŏ����͕s��
		}
		
		// �L�[�ƒl�̃y�A
		for (Map.Entry<Integer, String> classmate : map1.entrySet()) {
		  System.out.println(classmate.getKey() + "�Ԃ�" + classmate.getValue() + "����"); // HashMap�Ȃ̂ŏ����͕s��
		}
		
		
		// HashSet�𐶐�����ꍇ
		Set<String> set1 = new HashSet<String>();

		// LinkedHashSet�𐶐�����ꍇ
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		// �v�f��ǉ�����
		set1.add("�X�C�J");
		set1.add("������");
	}

}
