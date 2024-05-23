/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.TableModel;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.message.Message;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author harvous
 */
public class HelperApachePoi {

    private static List<Object[]> data = new ArrayList<>();

    public HelperApachePoi() {
    }

    public void fileChooser(JTable jtable, Component parentComponent) {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter xls = new FileNameExtensionFilter("Excel 97-2003 Workbook *.xls)", "xls");
        FileNameExtensionFilter xlsx = new FileNameExtensionFilter("Excel Workbook *.xlsx)", "xlsx");
        fileChooser.setFileFilter(xls);
        //fileChooser.
        fileChooser.setFileFilter(xlsx);
        fileChooser.addChoosableFileFilter(xlsx);
        //  fileChooser.setSelectedFile("Home");
        fileChooser.setSelectedFile(new File("Product_Team3"));
        int userSelection = fileChooser.showSaveDialog(parentComponent);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (new File(fileToSave.toString() + ".xls").exists() || new File(fileToSave.toString() + ".xlsx").exists()) {
                int response = JOptionPane.showConfirmDialog(null, //
                        "File already exists! Do you want to replace existing files?", //
                        "Confirm", JOptionPane.YES_NO_OPTION, //
                        JOptionPane.QUESTION_MESSAGE);
                if (response != JOptionPane.YES_OPTION) {
                    fileChooser(jtable, parentComponent);
                    return;
                }

            }
            this.exportExcel(jtable, fileToSave, fileChooser.getFileFilter().getDescription());
        }
    }
    public void fileGetter(Component parentComponent) {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter xls = new FileNameExtensionFilter("Excel 97-2003 Workbook *.xls)", "xls");
        FileNameExtensionFilter xlsx = new FileNameExtensionFilter("Excel Workbook *.xlsx)", "xlsx");
        fileChooser.setFileFilter(xls);
        //fileChooser.
        fileChooser.setFileFilter(xlsx);
        fileChooser.addChoosableFileFilter(xlsx);

        int userSelection = fileChooser.showOpenDialog(parentComponent);
        if (userSelection == JFileChooser.OPEN_DIALOG) {
            File fileRead = fileChooser.getSelectedFile();
            readExcel(fileRead);
        } else {
            return;
        }
    }

    public void readExcel(File fs) {

        try {
            data.clear();
            FileInputStream file = new FileInputStream(fs);
            XSSFWorkbook xssfWorkbook = null;
            HSSFWorkbook hssfWorkbook = null;
            System.out.println(this.getFileExtension(fs));
            if (this.getFileExtension(fs).equals(".xlsx")) {
                try {
                xssfWorkbook = new XSSFWorkbook(file);
                XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
                // Get all rows
                Iterator<Row> iterator = sheet.iterator();
                    while (iterator.hasNext()) {
                        Row row = iterator.next(); // Đọc dòng tiếp theo
                        if (row.getRowNum() == 0) {
                            continue;
                        }

                        String id = null;
                        String name = null;
                        String price = null;

                        for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {

                            Cell cell = row.getCell(i);
                            if (cell == null) {
                                continue; // Bỏ qua các ô trống
                            }

                            //print the cell value
                            // System.out.println(i + " " + cell);
                            if (cell.getCellType() == CellType.STRING && i == 0) {
                                id = cell.getStringCellValue();
                            }
                            if (cell.getCellType() == CellType.STRING && i == 1) {
                                name = cell.getStringCellValue();
                            }
                            if (cell.getCellType() == CellType.STRING && i == 2) {
                                price = cell.getStringCellValue();
                            }
                        }
                        data.add(new Object[]{false, id, name, price});
                    }
                } catch (Exception e) {
                }

            } else {
                try {
                    hssfWorkbook = new HSSFWorkbook(file);
                    HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

                    // Get all rows
                    Iterator<Row> iterator = sheet.iterator();
                    int ccount = 0;
                    while (iterator.hasNext()) {
                        Row row = iterator.next(); // Đọc dòng tiếp theo
                        if (row.getRowNum() == 0) {
                            continue;
                        }

                        String id = null;
                        String name = null;
                        String price = null;

                        for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {

                            Cell cell = row.getCell(i);
                            if (cell == null) {
                                continue; // Bỏ qua các ô trống
                            }
                            ccount++;
                            //print the cell value
                            // System.out.println(i + " " + cell);
                            if (cell.getCellType() == CellType.STRING && i == 0) {
                                id = cell.getStringCellValue();
                            }
                            if (cell.getCellType() == CellType.STRING && i == 1) {
                                name = cell.getStringCellValue();
                            }
                            if (cell.getCellType() == CellType.STRING && i == 2) {
                                price = cell.getStringCellValue();
                            }
                        }
                        data.add(new Object[]{false, id, name, price});
                    }
                    System.out.println("chao" + ccount);
                } catch (Exception e) {
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public List<Object[]> getDataReadFileExcel() {

        return data;
    }
    private String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }

    public void exportExcel(JTable table, File file, String fileChooser) {
        if (file == null) {
            return;
        }
        try {
            Workbook workbook;
            if (fileChooser.contains("xlsx")) {
                file = new File(file.getAbsolutePath() + ".xlsx");
                workbook = new XSSFWorkbook();
            } else if (fileChooser.contains("xls")) {
                file = new File(file.getAbsolutePath() + ".xls");
                workbook = new HSSFWorkbook();
            } else {
                String extension = FilenameUtils.getExtension(file.getName());
                if (extension.equals("xlsx")) {
                    workbook = new XSSFWorkbook();
                } else {
                    file = new File(file.getAbsolutePath());
                    workbook = new HSSFWorkbook();
                }
            }

            final int COLUMN_START = 1;
            final int COLUMN_SKIP = 4;
            int skip = 0;

            Sheet sheet = workbook.createSheet("Report");
            TableModel model = table.getModel();

            Row headerRow = sheet.createRow(0);
            for (int column = COLUMN_START; column < model.getColumnCount(); column++) {
                if (column == COLUMN_SKIP) {
                    skip++;
                } else {
                    headerRow.createCell(column - COLUMN_START - skip).setCellValue(model.getColumnName(column));
                }
            }

            skip = 0;
            // Write table data
            for (int rowTable = 0; rowTable < model.getRowCount(); rowTable++) {
                Row row = sheet.createRow(rowTable + 1);
                for (int columnTable = COLUMN_START; columnTable < model.getColumnCount() - 1; columnTable++) {
                    if (columnTable == COLUMN_SKIP) {
                        skip++;
                    } else {
                        Object value = model.getValueAt(rowTable, columnTable);
                        if (value != null) {
                            row.createCell(columnTable - COLUMN_START - skip).setCellValue(value.toString());
                        }
                    }

                }
            }
            try (FileOutputStream fileOut = new FileOutputStream(file)) {
                workbook.write(fileOut);
                fileOut.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
