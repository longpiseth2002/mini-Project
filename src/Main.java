import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import org.nocrala.tools.texttablefmt.BorderStyle;

import product.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+
                " ██████╗███████╗████████╗ █████╗ ██████╗          ██╗ █████╗ ██╗   ██╗ █████╗     \n" +
                "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗         ██║██╔══██╗██║   ██║██╔══██╗    \n" +
                "██║     ███████╗   ██║   ███████║██║  ██║         ██║███████║██║   ██║███████║    \n" +
                "██║     ╚════██║   ██║   ██╔══██║██║  ██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║    \n" +
                "╚██████╗███████║   ██║   ██║  ██║██████╔╝    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    \n" +
                " ╚═════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝      ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    \n" );
        System.out.println("~".repeat(15)+" stock management system ".toUpperCase()+"~".repeat(15)+"\n");


        Product p = new Product(1,"sss",110.3,101,"19-11-2023");
        Product p1 = new Product(2,"hhh",11.9,111,"10-01-2023");
        Product p2 = new Product(3,"rrr",19.4,1111,"10-11-2022");
        Product p3 = new Product(1,"sss",110.3,101,"19-11-2023");
        Product p4 = new Product(2,"hhh",11.9,111,"10-01-2023");
        Product p5 = new Product(3,"rrr",19.4,1111,"10-11-2022");
        ProductManager proManager = new ProductManager();
        proManager.addProduct(p);
        proManager.addProduct(p1);
        proManager.addProduct(p2);
        proManager.addProduct(p3);
        proManager.addProduct(p4);
        proManager.addProduct(p5);

        String command;
        boolean check=false;
        do{
            Table table = new Table(9, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
            table.addCell(" ".repeat(4)+"| *)Display"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| W)rite"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| R)ead"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| U)pdate"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| D)elete"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| F)irst"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"X| P)revious"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"X| N)ext"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| L)ast"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| S)earch"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"X| G)o to"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| Se)t row"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| H)elp"+" ".repeat(4));
            table.addCell(" ".repeat(4)+"| E)xit"+" ".repeat(4));
            System.out.println(table.render());
            System.out.print("\nCommand ->");
            command = scanner.next();
            System.out.println();
            switch (command){
                case "f","F" ->{
                    proManager.firstDisplay();
                }
                case "*" ->{
                    proManager.display();
                }
//                case "P","p" ->{
//                    proManager.previousDisplay();
//                }
//                case "n","N" ->{
//                    proManager.nextDisplay();
//                }
                case "w","W" ->{
                    proManager.write();
                }
                case "r","R" ->{
                    System.out.print("Read by ID : ");
                    Integer newId = scanner.nextInt();
                    proManager.read(newId);
                }
                case "u","U" ->{
                    System.out.print("Please Input ID Product : ");
                    Integer upPro = scanner.nextInt();
                    proManager.update(upPro);
                }
                case "d","D" ->{
                    System.out.print("Please Input ID Product : ");
                    Integer deletePro = scanner.nextInt();
                    proManager.delete(deletePro);
                }
                case "Se" ->{
                    System.out.print(" Numbers Row : ");
                    int numRow = scanner.nextInt();
                    proManager.setRow(numRow);
                }
                case "h","H" ->{
                    proManager.help();
                }
                case "s","S" ->{
                    System.out.print("Please Input ID Product : ");
                    Integer searchPro = scanner.nextInt();
                    proManager.search(searchPro);
                }
                case "l","L" ->{
                    proManager.lastDisplay();
                }
                case "e","E" ->{
                    check=true;
                }
                default -> {
                    System.out.println("O" + "~".repeat(94) + "O");
                    System.out.println(" ".repeat(5) + "INPUT IS INVALID !");
                    System.out.println("O" + "~".repeat(94) + "O");
                }
            }
        }while(!check);





    }
}
