package excel;

import com.aspose.cells.*;

public class ExcelToPdf {

    public static void main(String[] args) throws Exception {
        //Create a new Workbook object
        Workbook workbook = new Workbook("S:\\dataRead/file.xls");
        //Save the document in PDF format
        workbook.save("S:\\dataRead/toPDF.pdf", SaveFormat.PDF);
        
        
        //sheet.getCells().importText("\\\\server\\share\\input.txt", 0, 0, new TextImportOptions());

    }
}
