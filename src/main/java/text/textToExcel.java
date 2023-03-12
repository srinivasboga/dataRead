package text;

import com.aspose.cells.*;

public class textToExcel {
    public static void main(String[] args) throws Exception {
        //Create a new Workbook object
        Workbook workbook = new Workbook();
        //Get the first worksheet
        Worksheet sheet = workbook.getWorksheets().get(0);
        //Read the text file and put the contents in the sheet
        sheet.getCells().importText("input.txt", 0, 0, new TextImportOptions());
        //Save the workbook in Excel format
        workbook.save("output.xlsx", SaveFormat.XLSX);
    }
}
