package RockScissorPaper;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RockScissorPaper rsp = new RockScissorPaper();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("무엇을 낼 건가요? : ");
		String userchoice = sc1.nextLine();
		String PCchoice = rsp.Computer();//메소드 중복 사용 방지
		System.out.println("PC는 " + PCchoice+ "를 냈습니다!");
		if (userchoice.equals(PCchoice))
			System.out.println("승부는 " + rsp.whoIsWinner(userchoice, PCchoice));
		else
			System.out.println("승자는 " + rsp.whoIsWinner(userchoice, PCchoice));
	}
}
