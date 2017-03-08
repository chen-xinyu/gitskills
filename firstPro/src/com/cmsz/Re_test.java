package com.cmsz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100.00";

		String regEx = "^(\\d{1,8}\\.\\d{2})|(-\\d{1,7}\\.\\d{2})$";
		
	    // 编译正则表达式
	    Pattern pattern = Pattern.compile(regEx);
	    // 忽略大小写的写法
	    // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(str);

	    boolean rs = matcher.matches();
	    System.out.println(rs);
	}

}
