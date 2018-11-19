package com.biz.arrays.service;

import com.biz.arrays.vo.GradeVO;

public class GradeService {

	public GradeVO gradeVO;

	public GradeService() {
		gradeVO = new GradeVO();

	}

	public void makeTotal() {
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		intSum += gradeVO.getIntSci();

		gradeVO.setIntSum(intSum);
		float floatAvg = (float) intSum / 4;
		gradeVO.setFloatAvg(floatAvg);

	}

	public void viewGrade() {
		System.out.print(gradeVO.getStrNum() + "\t");
		System.out.print(gradeVO.getIntKor() + "\t");
		System.out.print(gradeVO.getIntEng() + "\t");
		System.out.print(gradeVO.getIntMath() + "\t");
		System.out.print(gradeVO.getIntSci() + "\t");
	}

	public int makeScore() {
		return (int) (Math.random() * (100 - 50 + 1)) + 50;

	}

	public void makeScoreAll() {
		gradeVO.setIntKor(this.makeScore());
		gradeVO.setIntEng(this.makeScore());
		gradeVO.setIntMath(this.makeScore());
		gradeVO.setIntSci(this.makeScore());

	}
}
