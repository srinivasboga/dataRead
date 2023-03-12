package pdf;

import com.aspose.cells.Workbook;
import com.aspose.cells.PdfSaveOptions;
import java.io.FileInputStream;

public class pdfToExcel {
    public static void main(String[] args) throws Exception {
        // Load the PDF file
        FileInputStream pdfInputStream = new FileInputStream("S:\\dataRead/toPDF.pdf");
        // Create a new workbook
        Workbook workbook = new Workbook(pdfInputStream);
        // Save the workbook as Excel
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setOnePagePerSheet(true);
        workbook.save("S:\\dataRead/toExcel.xlsx", pdfSaveOptions);
    }
}
