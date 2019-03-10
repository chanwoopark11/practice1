package RockScissorPaper;

public class RockScissorPaper {
	public String Computer() {// 컴퓨터의 선택
		String result = "";
		String scissors = "가위";
		String rock = "바위";
		String paper = "보";
		int computer = (int) (Math.random() * 9) + 1;// 1~9
		switch (computer) {
		case 1:
		case 4:
		case 7:
			result = scissors;// 가위
			break;
		case 2:
		case 5:
		case 8:
			result = rock;// 바위
			break;
		case 3:
		case 6:
		case 9:
			result = paper;// 보
			break;
		}
		return result;// 결과 리턴
	}

	public String whoIsWinner(String userInput, String PCInput) {
		String winner = "";
		if (userInput.equals("가위")) {
			if (PCInput.equals("가위"))
				winner = "무승부";
			else if (PCInput.equals("바위"))
				winner = "PC";
			else if (PCInput.equals("보"))
				winner = "USER";
		} else if (userInput.equals("바위")) {
			if (PCInput.equals("가위"))
				winner = "USER";
			else if (PCInput.equals("바위"))
				winner = "무승부";
			else if (PCInput.equals("보"))
				winner = "PC";
		} else if (userInput.equals("보")) {
			if (PCInput.equals("가위"))
				winner = "PC";
			else if (PCInput.equals("바위"))
				winner = "USER";
			else if (PCInput.equals("보"))
				winner = "무승부";
		}
		return winner;
	}

}
