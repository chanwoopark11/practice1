package RockScissorPaper;

public class RockScissorPaper {
	public String Computer() {// ��ǻ���� ����
		String result = "";
		String scissors = "����";
		String rock = "����";
		String paper = "��";
		int computer = (int) (Math.random() * 9) + 1;// 1~9
		switch (computer) {
		case 1:
		case 4:
		case 7:
			result = scissors;// ����
			break;
		case 2:
		case 5:
		case 8:
			result = rock;// ����
			break;
		case 3:
		case 6:
		case 9:
			result = paper;// ��
			break;
		}
		return result;// ��� ����
	}

	public String whoIsWinner(String userInput, String PCInput) {
		String winner = "";
		if (userInput.equals("����")) {
			if (PCInput.equals("����"))
				winner = "���º�";
			else if (PCInput.equals("����"))
				winner = "PC";
			else if (PCInput.equals("��"))
				winner = "USER";
		} else if (userInput.equals("����")) {
			if (PCInput.equals("����"))
				winner = "USER";
			else if (PCInput.equals("����"))
				winner = "���º�";
			else if (PCInput.equals("��"))
				winner = "PC";
		} else if (userInput.equals("��")) {
			if (PCInput.equals("����"))
				winner = "PC";
			else if (PCInput.equals("����"))
				winner = "USER";
			else if (PCInput.equals("��"))
				winner = "���º�";
		}
		return winner;
	}

}
