package com.huawei.wuqf;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author w00268347
 *vmargs:-verbose:gc -Xms20M -Xmn10M -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError
 */
public class Main {
	public static void main(String[] args)
	{
		List<Student> students=new ArrayList<>();
		
		for(int i=0;i<10000000;i++)
		{
			Student student=new Student();
			students.add(student);
		}
	}
}
