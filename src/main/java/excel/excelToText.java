package excel;

import com.aspose.cells.*;
import java.io.FileWriter;

public class excelToText {
    public static void main(String[] args) throws Exception {
        Workbook workbook = new Workbook("S:\\dataRead/file.xls");
        Worksheet sheet = workbook.getWorksheets().get(0);
        Cells cells = sheet.getCells();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cells.getMaxDataRow(); i++) {
            for (int j = 0; j < cells.getMaxDataColumn(); j++) {
                Cell cell = cells.get(i, j);
                if(cell.getValue() != null && !cell.getValue().toString().isEmpty()){
                    sb.append(cell.getStringValue());
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        // Write the text to the output file
        FileWriter fileWriter = new FileWriter("S:\\dataRead/toText.txt");
        fileWriter.write(sb.toString());
        fileWriter.close();
    }
}
