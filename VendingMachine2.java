package vendingMachine.study;

import java.util.Scanner;



public class VendingMachine2 {

	public static void main(String[] args) {
		int money=3000;   //ó�� ���� �ݾ�
		int coke=0;       // ������ �ݶ� ����
		int cyder=0;      // ������ ���̴� ����
		int maesil=0;     // ������ �Ž��� ����
		
		if_0 mm =new if_0();  
		
		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.println("=== ���Ǳ� �ùķ����� ===");
			System.out.println("1. �ݶ�(1000) 2. ���̴�(800) 3.�Ž���(1500) [0.����ǰȮ��]");
			System.out.println("���Ḧ �����ϼ���");
			int num = Integer.parseInt(sc.nextLine());
			if(num==1) {
				money-=1000;
				if(money<0) {
					System.out.println("���̻� ������ ���� �����");
					
					mm.machine(money);  //���� �޼ҵ�
					money=mm.plus;
					System.out.println("���� �ܾ��� "+ mm.plus +" ����� 1�� ����ϱ�� 0��" );
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						coke++;
						continue;
					}

				}

				System.out.println("�ݶ� +1");
				System.out.println("������ -1000");
				coke++;

			} else if(num==2) {
				money-=800;
				if(money<0) {
					System.out.println(" ���̻� ������ ���� �����");
					
					mm.machine(money); //���� �޼ҵ�
					money=mm.plus;
					System.out.println("���� �ܾ��� "+ mm.plus +" ����� 1 ����ϱ� 0");
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						cyder++;
						continue;
					}
				}

				System.out.println("���̴� +1");
				System.out.println("������ -800");
				cyder++;

			} else if(num==3) {
				money-=1500;
				if(money<0) {
					System.out.println("���̻� ������ ���� �����");
					
					mm.machine(money);  //���� �޼ҵ�
					money=mm.plus;
					System.out.println("���� �ܾ��� "+ mm.plus +" ����� 1�� ����ϱ� 0��" );
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						maesil++;
						continue;
					}
				} else if(money>=0) {
				System.out.println("�Ž��� +1");
				System.out.println("������ -1500");

				maesil++;
				}
			} else if(num==0) {
				System.out.println("=== ����ǰ ===");
				System.out.println("������: "+money);
				System.out.println("�ݶ�"+coke+"��");
				System.out.println("���̴�"+cyder+"��");
				System.out.println("�Ž���"+maesil+"��");

			}

		}
System.out.println("����");
	}



}