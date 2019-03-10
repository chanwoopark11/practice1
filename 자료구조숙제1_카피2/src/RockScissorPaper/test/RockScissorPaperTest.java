package RockScissorPaper.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import RockScissorPaper.RockScissorPaper;

class RockScissorPaperTest {
	RockScissorPaper rsp = new RockScissorPaper();

	@Test
	void test1() {
		assertEquals("USER", rsp.whoIsWinner("����", "����"));
	}

	@Test
	void test2() {
		assertEquals("USER", rsp.whoIsWinner("����", "��"));
	}

	@Test
	void test3() {
		assertEquals("USER", rsp.whoIsWinner("����", "����"));
	}

	@Test
	void test4() {
		assertEquals("USER", rsp.whoIsWinner("��", "����"));
	}

	@Test
	void test5() {
		assertEquals("���º�", rsp.whoIsWinner("����", "����"));
	}

	@Test
	void test6() {
		assertEquals("���º�", rsp.whoIsWinner("��", "��"));
	}

	@Test
	void test7() {
		assertEquals("���º�", rsp.whoIsWinner("��", "����"));
	}

	@Test
	void test8() {
		assertEquals("PC", rsp.whoIsWinner("����", "����"));
	}

	@Test
	void test9() {
		assertEquals("PC", rsp.whoIsWinner("����", "����"));
	}

	@Test
	void test10() {
		assertEquals("PC", rsp.whoIsWinner("��", "����"));
	}

}
