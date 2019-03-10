package RockScissorPaper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import RockScissorPaper.RockScissorPaper;

class RockScissorPaperTest {
	RockScissorPaper rsp = new RockScissorPaper();

	@Test
	void test1() {
		assertEquals("USER", rsp.whoIsWinner("바위", "가위"));
	}

	@Test
	void test2() {
		assertEquals("USER", rsp.whoIsWinner("바위", "보"));
	}

	@Test
	void test3() {
		assertEquals("USER", rsp.whoIsWinner("가위", "가위"));
	}

	@Test
	void test4() {
		assertEquals("USER", rsp.whoIsWinner("보", "가위"));
	}

	@Test
	void test5() {
		assertEquals("무승부", rsp.whoIsWinner("바위", "가위"));
	}

	@Test
	void test6() {
		assertEquals("무승부", rsp.whoIsWinner("보", "보"));
	}

	@Test
	void test7() {
		assertEquals("무승부", rsp.whoIsWinner("보", "가위"));
	}

	@Test
	void test8() {
		assertEquals("PC", rsp.whoIsWinner("바위", "바위"));
	}

	@Test
	void test9() {
		assertEquals("PC", rsp.whoIsWinner("가위", "바위"));
	}

	@Test
	void test10() {
		assertEquals("PC", rsp.whoIsWinner("보", "가위"));
	}

}
