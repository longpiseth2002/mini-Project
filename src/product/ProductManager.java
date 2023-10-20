package product;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    private int numRowsToDisplay = 2;
    public ProductManager(Integer id, String name, Double unit, Integer price, String date) {
        super();
    }

    public ProductManager() {

    }
    public void setRow(int numRows) {
        numRowsToDisplay = numRows;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void display() {

        int totalPages = (int) Math.ceil((double) products.size() / numRowsToDisplay);

            Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
            table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
            table.setColumnWidth(1, 20, 50);
            table.setColumnWidth(2, 20, 50);
            table.setColumnWidth(3, 20, 50);
            table.setColumnWidth(4, 20, 50);
            table.addCell("ID");
            table.addCell("Name");
            table.addCell("Unit Price");
            table.addCell("Price");
            table.addCell("Date");
            int page = 1;

                int startIndex = (page-1)*numRowsToDisplay;
                int endIndex = Math.min(startIndex + numRowsToDisplay, products.size());
                for (int i = startIndex; i < endIndex; i++) {
                    Product product = products.get(i);
                    table.addCell(String.valueOf(product.getId()));
                    table.addCell(product.getName());
                    table.addCell(String.valueOf(product.getUnit()));
                    table.addCell(String.valueOf(product.getQty()));
                    table.addCell(product.getDate());
                }
                int record = 1;
                for( int i=1 ; i<products.size() ; i++ ){
                    record=i+1 ;
                }
                System.out.println(table.render());
                System.out.println("O" + "~".repeat(94) + "O");
                System.out.println(" ".repeat(3) +  " Page : " + page + " of "+totalPages + " ".repeat(60) + "Total record : " + record);
                System.out.println("O" + "~".repeat(94) + "O");

    }
    public void firstDisplay() {
        int totalPages = (int) Math.ceil((double) products.size() / numRowsToDisplay);

        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
        table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Unit Price");
        table.addCell("Price");
        table.addCell("Date");
        int numPage=0;
        for( int page=1 ; page<=totalPages ; page++ ){
            numPage=page;
            int startIndex = (page-1)*numRowsToDisplay;
            int endIndex = Math.min(startIndex + numRowsToDisplay, products.size());
            if(page==1){

                for (int i = startIndex; i < endIndex; i++) {
                    Product product = products.get(i);
                    table.addCell(String.valueOf(product.getId()));
                    table.addCell(product.getName());
                    table.addCell(String.valueOf(product.getUnit()));
                    table.addCell(String.valueOf(product.getQty()));
                    table.addCell(product.getDate());

                }
                break;
            }
        }
        int record = 1;
        for( int i=1 ; i<products.size() ; i++ ){
            record=i+1 ;
        }
        System.out.println(table.render());
        System.out.println("O" + "~".repeat(94) + "O");
        System.out.println(" ".repeat(3) +  " Page : " + numPage + " of "+totalPages + " ".repeat(60) + "Total record : " + record);
        System.out.println("O" + "~".repeat(94) + "O");

    }
//    public void nextDisplay() {
//        int numProduct=2;
//        int totalPages = (int) Math.ceil((double) products.size() / numProduct);
//
//        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
//        table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
//        table.setColumnWidth(1, 20, 50);
//        table.setColumnWidth(2, 20, 50);
//        table.setColumnWidth(3, 20, 50);
//        table.setColumnWidth(4, 20, 50);
//        table.addCell("ID");
//        table.addCell("Name");
//        table.addCell("Unit Price");
//        table.addCell("Price");
//        table.addCell("Date");
//        int numPage=0;
//        for( int page=1 ; page<=totalPages ; page++ ){
//            numPage=page;
//            int startIndex = (page-1)*numProduct;
//            int endIndex = Math.min(startIndex + numProduct, products.size());
//            if(page==1){
//
//                for (int i = startIndex; i < endIndex; i++) {
//                    Product product = products.get(i);
//                    table.addCell(String.valueOf(product.getId()));
//                    table.addCell(product.getName());
//                    table.addCell(String.valueOf(product.getUnit()));
//                    table.addCell(String.valueOf(product.getQty()));
//                    table.addCell(product.getDate());
//
//                }
//            }
//        }
//        int record = 1;
//        for( int i=1 ; i<products.size() ; i++ ){
//            record=i+1 ;
//        }
//        System.out.println(table.render());
//        System.out.println("O" + "~".repeat(94) + "O");
//        System.out.println(" ".repeat(3) +  " Page : " + numPage + " of "+totalPages + " ".repeat(60) + "Total record : " + record);
//        System.out.println("O" + "~".repeat(94) + "O");
//    }
//
//    public void previousDisplay() {
//        int numProduct=2;
//        int totalPages = (int) Math.ceil((double) products.size() / numProduct);
//
//        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
//        table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
//        table.setColumnWidth(1, 20, 50);
//        table.setColumnWidth(2, 20, 50);
//        table.setColumnWidth(3, 20, 50);
//        table.setColumnWidth(4, 20, 50);
//        table.addCell("ID");
//        table.addCell("Name");
//        table.addCell("Unit Price");
//        table.addCell("Price");
//        table.addCell("Date");
//        int numPage=0;
//        for( int j=totalPages ; j>totalPages ; j-- ){
//            numPage=j-1;
//            int startIndex = (j-1)*numProduct;
//            int endIndex = Math.min(startIndex + numProduct, products.size());
//            if(j!=totalPages){
//
//                for (int i = startIndex; i < endIndex; i++) {
//                    Product product = products.get(i);
//                    table.addCell(String.valueOf(product.getId()));
//                    table.addCell(product.getName());
//                    table.addCell(String.valueOf(product.getUnit()));
//                    table.addCell(String.valueOf(product.getQty()));
//                    table.addCell(product.getDate());
//
//                }
//                break;
//            }
//        }
//        int record = 1;
//        for( int i=1 ; i<products.size() ; i++ ){
//            record=i+1 ;
//        }
//        System.out.println(table.render());
//        System.out.println("O" + "~".repeat(94) + "O");
//        System.out.println(" ".repeat(3) +  " Page : " + numPage + " of "+totalPages + " ".repeat(60) + "Total record : " + record);
//        System.out.println("O" + "~".repeat(94) + "O");
//
//    }
    public void lastDisplay() {
        int numProduct=2;
        int totalPages = (int) Math.ceil((double) products.size() / numProduct);

        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
        table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Unit Price");
        table.addCell("Price");
        table.addCell("Date");
        int numPage=0;
        for( int page=1 ; page<=totalPages ; page++ ){
            numPage=page;
            int startIndex = (page-1)*numProduct;
            int endIndex = Math.min(startIndex + numProduct, products.size());
            if(page==totalPages){

                for (int i = startIndex; i < endIndex; i++) {
                    Product product = products.get(i);
                    table.addCell(String.valueOf(product.getId()));
                    table.addCell(product.getName());
                    table.addCell(String.valueOf(product.getUnit()));
                    table.addCell(String.valueOf(product.getQty()));
                    table.addCell(product.getDate());

                }
            }
        }

        int record = 1;
        for( int i=1 ; i<products.size() ; i++ ){
            record=i+1 ;
        }
        System.out.println(table.render());
        System.out.println("O" + "~".repeat(94) + "O");
        System.out.println(" ".repeat(3) +  " Page : " + numPage + " of "+totalPages + " ".repeat(60) + "Total record : " + record);
        System.out.println("O" + "~".repeat(94) + "O");

    }
    public void write() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        System.out.print("Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left in the buffer.

        System.out.print("Product's Name: ");
        String name = scanner.nextLine();

        System.out.print("Product's Price: ");
        double unit = scanner.nextDouble();

        System.out.print("Product's Qty : ");
        int qty = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left in the buffer.

        System.out.print("Product's Date: ");
        String date = scanner.nextLine();

        table.setColumnWidth(0, 50, 50);
        table.addCell(" ".repeat(2) + " ID" + " ".repeat(14) + ":" + id);
        table.addCell(" ".repeat(2) + " Name" + " ".repeat(12) + ":" + name);
        table.addCell(" ".repeat(2) + " Unit Price" + " ".repeat(6) + ":" + unit);
        table.addCell(" ".repeat(2) + " Qty" + " ".repeat(13) + ":" + qty);
        table.addCell(" ".repeat(2) + " Date(DD-MM-YY)" + " ".repeat(2) + ":" + date);
        System.out.println(table.render());
        System.out.print("Are you sure want to add this record ? [ Y/y ] or [N/n] : ");
        String choice = scanner.nextLine() ;

        System.out.println("~".repeat(50));
        if( (Objects.equals(choice, "Y")) || Objects.equals(choice, "y")){
            System.out.println(" ".repeat(10) + id + " was added successfully ! ");
            System.out.println("~".repeat(50));
            Product product = new Product(id, name, unit, qty, date);
            products.add(product);
        }else {
            System.out.println(" ".repeat(10) + id + " wasn't added successfully ! ");
            System.out.println("~".repeat(50));
        }

    }
    public void read(Integer newId){
        boolean readPro=true;
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        for (Product product : products) {
            if (Objects.equals(newId, product.getId())) {
                table.setColumnWidth(0, 50, 50);
                table.addCell(" ".repeat(2) + " ID" + " ".repeat(14) + ":" + product.getId());
                table.addCell(" ".repeat(2) + " Name" + " ".repeat(12) + ":" + product.getName());
                table.addCell(" ".repeat(2) + " Unit Price" + " ".repeat(6) + ":" + product.getUnit());
                table.addCell(" ".repeat(2) + " Price" + " ".repeat(12) + ":" + product.getQty());
                table.addCell(" ".repeat(2) + " Date(DD-MM-YY)" + " ".repeat(2) + ":" + product.getDate());
                System.out.println(table.render());
                readPro=true;
                break;
            }
        }
        if(!readPro) {
            System.out.println("~".repeat(50));
            System.out.println(" ".repeat(5) + " INPUT IS INVALID ! ");
            System.out.println("~".repeat(50));
        }

    }
    public void update(Integer updateId){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        for(Product product : products){
            if (Objects.equals(updateId, product.getId())){
                table.setColumnWidth(0, 50, 50);
                table.addCell(" ".repeat(2) + " ID" + " ".repeat(14) + ":" + product.getId());
                table.addCell(" ".repeat(2) + " Name" + " ".repeat(12) + ":" + product.getName());
                table.addCell(" ".repeat(2) + " Unit Price" + " ".repeat(6) + ":" + product.getUnit());
                table.addCell(" ".repeat(2) + " Price" + " ".repeat(12) + ":" + product.getQty());
                table.addCell(" ".repeat(2) + " Date(DD-MM-YY)" + " ".repeat(2) + ":" + product.getDate());
                System.out.println(table.render());

                System.out.println("\n What do you want to update ? ");
                Table table1 = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                table1.setColumnWidth(0, 20, 20);
                table1.setColumnWidth(1, 20, 20);
                table1.setColumnWidth(2, 20, 20);
                table1.setColumnWidth(3, 20, 20);
                table1.setColumnWidth(4, 20, 20);
                table1.addCell("1. All");
                table1.addCell("2. Name");
                table1.addCell("3. Quantity");
                table1.addCell("4. Unit Price");
                table1.addCell("5. Back to Menu");

                System.out.print(" Option(1-5) : ");
                int option = scanner.nextInt();

                switch (option){
                    case 1 ->{
                        System.out.print("Product's ID : ");
                        product.setId(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Product's Name ; ");
                        product.setName(scanner.nextLine());
                        System.out.print("Product's Unit : ");
                        product.setUnit(scanner.nextDouble());
                        System.out.print("Product's Qty : ");
                        product.setQty(scanner.nextInt());
                    }
                    case 2 ->{
                        scanner.nextLine();
                        System.out.print("Product's Name : ");
                        product.setName(scanner.nextLine());
                    }
                    case 3 ->{
                        System.out.print("Product's Qty : ");
                        product.setQty(scanner.nextInt());
                    }
                    case 4 ->{
                        System.out.print("Product's Unit : ");
                        product.setUnit(scanner.nextDouble());
                    }
                    default ->{
                        System.out.println("BAck to menu\n");
                    }
                }
            }
        }
    }
    public void delete(Integer deletePro){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
        for(Product product : products){
            if(Objects.equals(deletePro, product.getId())){
                table.setColumnWidth(0, 50, 50);
                table.addCell(" ".repeat(2) + " ID" + " ".repeat(14) + ":" + product.getId());
                table.addCell(" ".repeat(2) + " Name" + " ".repeat(12) + ":" + product.getName());
                table.addCell(" ".repeat(2) + " Unit Price" + " ".repeat(6) + ":" + product.getUnit());
                table.addCell(" ".repeat(2) + " Price" + " ".repeat(12) + ":" + product.getQty());
                table.addCell(" ".repeat(2) + " Date(DD-MM-YY)" + " ".repeat(2) + ":" + product.getDate());
                System.out.println(table.render());
                System.out.print("Are you sure to delete this record ? [ Y/y ] or [ N/n ] : ");
                String choice = scanner.nextLine();
                if(Objects.equals(choice, "Y") || Objects.equals(choice, "y")){
                    products.remove(product);
                    System.out.println("~".repeat(50));
                    System.out.println(" ".repeat(5) + " Product was removed ! ");
                    System.out.println("~".repeat(50));
                }else{
                    System.out.println("~".repeat(50));
                    System.out.println(" ".repeat(5) + " Product was not removed ! ");
                    System.out.println("~".repeat(50));
                }
            }
        }
    }
    public void search(Integer searchId){
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER ,ShownBorders.ALL);
        table.setColumnWidth(0, 10, 10); // Adjust column widths as needed
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Unit Price");
        table.addCell("Price");
        table.addCell("Date");
        for(Product product : products){
            if(Objects.equals(searchId,product.getId())){
                table.addCell(String.valueOf(product.getId()));
                table.addCell(product.getName());
                table.addCell(String.valueOf(product.getUnit()));
                table.addCell(String.valueOf(product.getQty()));
                table.addCell(product.getDate());
                System.out.println(table.render());
            }
        }
    }
    public void help(){
        Table table = new Table(1, BorderStyle.CLASSIC_COMPATIBLE, ShownBorders.SURROUND);
        table.addCell(" ".repeat(2) + "1." + " ".repeat(5) + "Press   * : Display all record of products ");
        table.addCell(" ".repeat(2) + "2." + " ".repeat(5) + "Press   w : Add new product");
        table.addCell(" ".repeat(9) + "Press   w -> w#proname-unitprice-qty : sortcut for add new product ");
        table.addCell(" ".repeat(2) + "3." + " ".repeat(5) + "Press   r : read Content any content ");
        table.addCell(" ".repeat(9) + "Press   r#proId : shortcut for read product by ID ");
        table.addCell(" ".repeat(2) + "4." + " ".repeat(5) + "Press   u : Update data ");
        table.addCell(" ".repeat(2) + "5." + " ".repeat(5) + "Press   d : Delete data");
        table.addCell(" ".repeat(9) + "Press   d#proId : shortcut for delete data ");
        table.addCell(" ".repeat(2) + "6." + " ".repeat(5) + "Press   f : Display First Page ");
        table.addCell(" ".repeat(2) + "7." + " ".repeat(5) + "Press   p : Display Previous Page ");
        table.addCell(" ".repeat(2) + "8." + " ".repeat(5) + "Press   n : Display Next Page ");
        table.addCell(" ".repeat(2) + "9." + " ".repeat(5) + "Press   l : Display Last Page ");
        table.addCell(" ".repeat(2) + "10." + " ".repeat(4) + "Press   s : Search product by name ");
        table.addCell(" ".repeat(2) + "11." + " ".repeat(4) + "Press   h : help ");
        System.out.println(table.render());
    }




}
