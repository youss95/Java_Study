package kh_while;

import java.util.Scanner;

public class teete {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����ϴ� �ɸ��׽�Ʈ");
		System.out.print("1. ����� ���� ���� ����� �����ϱ�? 1.��ħ(1��) 2.��(2��)\n");
		System.out.print(">>");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("2. ����� ��� �������� ����? 1.������ ũ�� ��������(1��) 2. �ſ� ��������(2��)\n");
		System.out.print(">>");
		int n2 =Integer.parseInt(sc.nextLine());
		System.out.println("3. ����� ������ ����Ҷ� �ַ� ���� �ൿ�� �մϱ�? 1.�ڽ��� ���� �� ���(1��) 2.�ڽ��� �Ӹ�ī���� ������(2��)");
		System.out.print(">>");
		int n3 =Integer.parseInt(sc.nextLine());
		System.out.println("4. ����� �ɾƼ� ���� � �ൿ�� �մϱ�? 1.�� �ٸ��� �ٸ� �ٸ��� ����(1��) 2.�ٸ��� ����(2��)");
		System.out.print(">>");
		int n4= Integer.parseInt(sc.nextLine());
		int result =n1+n2+n3+n4;
		if(result>=7) {
			System.out.println("A:7�̻�\n �ٸ� ������� ����� ���ɽ����� ���ؾ� �� ����̶��\r\n"
					+ "�����ϰ� �ִ�.");
		}
		else if(result>=6 && result <7) {
			System.out.println("B: 6~7�̸�\n ����� ģ������ ����� Ȱ������, �������� ����̸�,\r\n"
					+ "�浿���� ������ �����ڷ� �˰� �ִ�.");
		}
		else if(result>=5 && result<6) {
			System.out.println("C: 5~6�̸�\n �ٸ� ������� ����� �ż��ϰ� , ���� Ȱ���ϸ�, �ŷ����̰�,\r\n"
					+ "����ְ�, �׻� ��ſ� ������� ����� �ִ�.");
		}
		else {
			System.out.println("F: 2�̸�\n ������� ����� �ſ� �������� ����, �ұ����� �������\r\n"
					+ "�����ϸ�,�����δ��ϴٰ� ���� �� �ִ�.");
		}
	}

}
