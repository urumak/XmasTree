import org.omg.CORBA.INV_FLAG;

import java.util.Scanner;

public class MainMenu {
    private String type;
    private String size;
    private Info info = new Info();
    private Scanner scanner = new Scanner(System.in);
    private DataCheck dataCheck = new DataCheck();

    private void typeInput(){
        while (!dataCheck.getConfirmationStr()){
            System.out.println(info.getTypeQuestion());
            type = scanner.next();
            dataCheck.setAnswer(type);
            if (!dataCheck.getConfirmationStr()) {
                System.out.println(info.getErrorStatement());
            }
        }
    }
    private void sizeInput(){
        while (!dataCheck.getConfirmationInt()){
            System.out.println(info.getSizeQuestion());
            size = scanner.next();
            dataCheck.setAnswer(size);
            if(!dataCheck.getConfirmationInt()){
                System.out.println(info.getErrorStatement());
            }
        }
    }
    private void choose(){
        switch (type){
            case "UP":
                UpTree upTree = new UpTree(Integer.parseInt(size));
                upTree.drawTree();
                break;
            case "DOWN":
                DownTree downTree = new DownTree(Integer.parseInt(size));
                downTree.drawTree();
                break;
            case "LEFT":
                LeftTree leftTree = new LeftTree(Integer.parseInt(size));
                leftTree.drawTree();
                break;
            case "RIGHT":
                RightTree rightTree = new RightTree(Integer.parseInt(size));
                rightTree.drawTree();
                break;
            case "SUPER":
                UltimateTree ultimateTree = new UltimateTree(Integer.parseInt(size));
                ultimateTree.drawTree();
                break;
        }
    }
    public void start(){
        while (true){
            typeInput();
            if (type.contains("END")){
                return;
            }
            sizeInput();
            choose();
            System.out.println(info.getPressButton());
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
