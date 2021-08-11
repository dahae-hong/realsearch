package dao;

import java.util.List;

import vo.MemoVO;

public class Main {
	//test main.java파일
	public static void main(String[] args) {
		List<MemoVO> list = new MemoDAO().searchlist("test");
		for(MemoVO m:list) {
			System.out.println(m);
		}
	}

}
