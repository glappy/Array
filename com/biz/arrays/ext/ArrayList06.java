package com.biz.arrays.ext;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList06 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList() ;
		strList.add("hong") ;
		strList.add("lee") ;
		strList.add("sung") ;
		strList.add("jang") ;
		strList.add("go") ;
		
		Collections.sort(strList) ;
		System.out.println(strList);
		
		Collections.sort(strList,Collections.reverseOrder()) ;
		System.out.println();
		
		
		
		
		
		
	}
}
