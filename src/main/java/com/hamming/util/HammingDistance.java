package com.hamming.util;

/**
 * ����Ϣ�����У������ȳ��ַ���֮��ĺ�������
 * �������ַ�����Ӧλ���ϲ�ͬ�ַ��ĸ�����
 * ���仰˵������������ǽ�һ���ַ����滻������һ���ַ�������Ҫ�滻���ַ����ȡ�
 * ���磬1011101��1001001֮��ĺ���������2��
 * toned��roses֮��ĺ���������3.
 * �����������ַ��������ͬ�����ȵ����ַ����ĺ������룬
 * Ҳ����˵�������ַ����з����Ԫ�ظ��������ڶ������ַ�����˵������ 1 �ĸ�����
 * ���� 11101 �ĺ��������� 4��
 * ����Ĵ���չʾ����Java����μ��㺺������ͺ���������
 */
public class HammingDistance {
	
	/**
	 * calculate Hamming Distance between two strings
	 * 
	 * @author
	 * @param str1 the 1st string
	 * @param str2 the 2nd string
	 * @return Hamming Distance between str1 and str2
	 */
	public int getDistance(String str1, String str2) {
		int distance;
		if (str1.length() != str2.length()) {
			distance = -1;
		} else {
			distance = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					distance++;
				}
			}
		}
		return distance;
	}

	/**
	 * calculate Hamming weight for binary number
	 * 
	 * @author
	 * @param i the binary number
	 * @return Hamming weight of the binary number
	 */
	public int getWeight(int i) {
		int n;
		for (n = 0; i > 0; n++) {
			i &= (i - 1);
		}
		return n;
	}
}