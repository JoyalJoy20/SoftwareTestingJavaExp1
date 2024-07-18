package excelfilereading;

import java.io.IOException;

public class ExcelFileReadingMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s=ExcelFileReadingMeth.readStringData(1,1);
		System.out.println(s);
		String s1=ExcelFileReadingMeth.readIntData(1,0);
		System.out.println(s1);
	}

}
