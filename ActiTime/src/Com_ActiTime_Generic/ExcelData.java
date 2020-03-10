package Com_ActiTime_Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getdata(String file_path,String sheetname,int rn,int cn)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path));
			String data = WorkbookFactory.create(file).getSheet(sheetname).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch(Exception e)
		{
			return " ";
		}
	}
	public static int getrowcount(String file_path,String sheetname)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path));
			int rowcount= WorkbookFactory.create(file).getSheet(sheetname).getLastRowNum();
			return rowcount;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static int getcellcount(String file_path,String sheetname,int rn)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(file_path));
			int celcount=WorkbookFactory.create(file).getSheet(sheetname).getRow(rn).getLastCellNum();
			return celcount;
		}
		catch(Exception e )
		{
			return 0;
		}
	}
	

}
