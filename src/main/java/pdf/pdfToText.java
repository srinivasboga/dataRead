package pdf;

import org.apache.poi.xwpf.usermodel.Document;

import com.aspose.pdf.SaveFormat;

public class pdfToText {
    public static void main(String[] args) throws Exception {
        // Load the PDF file
        Document pdfDocument = new Document("input.pdf");
        // Save the Text file
        pdfDocument.save("output.txt", SaveFormat.TXT);
    }
}
