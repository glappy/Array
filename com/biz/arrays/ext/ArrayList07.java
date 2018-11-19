package com.biz.arrays.ext;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList07 {

	public static void main(String[] args) {
		ArrayList<Integer> listNum = new ArrayList();

		for (int i = 0; i < 45; i++) {
			listNum.add(i + 1);

		}

		Collections.shuffle(listNum);
		for (int i = 0; i < 6; i++) {
			System.out.print(listNum.get(i) + "  ");

		}
	}
}
