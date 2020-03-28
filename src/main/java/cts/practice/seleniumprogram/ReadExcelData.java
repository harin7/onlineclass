package cts.practice.seleniumprogram;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {
	public static void main(String[]args){
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Joythirmayee\\eclipse-workspace\\onlineclass\\src\\test\\resources\\ExcelSheet\\TestData.xlsx");
		System.out.println(excel.getData(0, 0,0 ));
		System.out.println(excel.getData(0, 0, 1));
		
	}

}
//idi ok na
//ha ok done anthena output
//ha ante nuv super
//username kavli ante(0,0,0)