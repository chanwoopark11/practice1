package RockScissorPaper;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RockScissorPaper rsp = new RockScissorPaper();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("������ �� �ǰ���? : ");
		String userchoice = sc1.nextLine();
		String PCchoice = rsp.Computer();//�޼ҵ� �ߺ� ��� ����
		System.out.println("PC�� " + PCchoice+ "�� �½��ϴ�!");
		if (userchoice.equals(PCchoice))
			System.out.println("�ºδ� " + rsp.whoIsWinner(userchoice, PCchoice));
		else
			System.out.println("���ڴ� " + rsp.whoIsWinner(userchoice, PCchoice));
	}
}
