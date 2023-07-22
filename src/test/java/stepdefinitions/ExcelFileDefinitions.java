package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class ExcelFileDefinitions {

    @Given("user write excel file")
    public void user_write_excel_file() throws IOException {

        String filePath = "src/test/java/utilities/countries.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);




        //#  4) Let's create a new cell for cell 4
        //#  5) Let's print "Population" in the cell we created
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Population");

        //#  6) Let's print 1500000 in the 2nd line population column
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1500000 ");

        //#  7) Let's print 250000 in the 10th line population column
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("1500000 ");
        //#  8) Let's print 54000 in the 15th line population column
        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue("54000");
        workbook.getSheet("Sayfa1").getRow(14).createCell(8).setCellValue("C Done");
        workbook.getSheet("Sayfa1").getRow(14).createCell(8).setCellValue("C Done");
        workbook.getSheet("Sayfa1").getRow(15).createCell(8).setCellValue("C Done");
        workbook.getSheet("Sayfa1").getRow(16).createCell(8).setCellValue("C Done");

        //#  9) Let's save the file
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        //#  10) Close the file

    }

}
