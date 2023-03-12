package text;

import com.aspose.pdf.*;

public class textToPdf {
    public static void main(String[] args) throws Exception {
        //Create a new Document object
        Document document = new Document();
        //Add a page to the document
        Page page = document.getPages().add();
        //Create a text fragment with the contents of the text file
        TextFragment text = new TextFragment("input.txt");
        //Add the text fragment to the page
        page.getParagraphs().add(text);
        //Save the document in pdf format
        document.save("output.pdf");
    }
}
