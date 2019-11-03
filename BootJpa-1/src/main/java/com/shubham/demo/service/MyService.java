package com.shubham.demo.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.shubham.demo.model.EmployeeRecord;
@Service
public class MyService {
	static XSSFWorkbook result=new XSSFWorkbook();
//	
	
	
	int row_num=0;
	static HashMap<String,SortedMap<String,EmployeeRecord>> smaps=new HashMap<String,SortedMap<String,EmployeeRecord>>();
	static String[] teams=new String[]{"DE","SuperMario","Mustangs"};
	static ArrayList<String> teamList=new ArrayList<>(Arrays.asList(teams));
	
	static
	{
		for(String team:teamList)
		{
			smaps.put(team, new TreeMap<String,EmployeeRecord>());
			result.createSheet(team);
		}
	}
	public void logTime(EmployeeRecord record) throws IOException
	{
		//XSSFWorkbook workbook1=new XSSFWorkbook(tr.getFile().getInputStream());
		//XSSFSheet sheet=workbook1.getSheetAt(0);
		XSSFSheet ressheet=result.getSheet(record.getTeam());
//		for(Row row:sheet)
//		{
//			if(row.getRowNum()!=0)
//			{
//				Cell cell1=row.getCell(0);
//				Cell cell2=row.getCell(1);
//				cell1.setCellType(Cell.CELL_TYPE_STRING);
//				smaps.get(tr.getTeamName()).put(cell1.getStringCellValue()+cell2.getDateCellValue(), row);
//				row_num++;
//			}
//				
//		}
		smaps.get(record.getTeam()).put(record.getName()+record.getLogDate(), record);
		row_num=0;
//		System.out.println(record.getLogDate());
		for(EmployeeRecord rec:smaps.get(record.getTeam()).values())
		{
			Row newRow=ressheet.createRow(row_num++);
			int col=0;
//			for (Cell cell:row)
//			{
//				Cell newCell=newRow.createCell(col++);
//				if(cell.getColumnIndex()==1)
//					{
//					CellStyle cellStyle = result.createCellStyle();
//					CreationHelper createHelper = result.getCreationHelper();
//					cellStyle.setDataFormat(
//					    createHelper.createDataFormat().getFormat("dd/mm/yyyy"));
//					System.out.println(cell.getDateCellValue());
//					newCell.setCellValue(cell.getDateCellValue());
//					newCell.setCellStyle(cellStyle);
//					}
//				else {
//					cell.setCellType(Cell.CELL_TYPE_STRING);
//					newCell.setCellValue(cell.getStringCellValue());
//					//System.out.print(cell.getStringCellValue()+" ");
//				}
//			}
			//System.out.println();
			newRow.createCell(col++).setCellValue(rec.getName());;
			newRow.createCell(col++).setCellValue(rec.getLogDate());;
			newRow.createCell(col++).setCellValue(rec.getLogin());;
			newRow.createCell(col++).setCellValue(rec.getLogout());;
			newRow.createCell(col++).setCellValue(rec.getLoggedTime());
			
			
			
		}
		ressheet.autoSizeColumn(1);
		FileOutputStream fos=new FileOutputStream("F://res.xlsx");
		result.write(fos);
		//workbook1.close();
		
	}

}
