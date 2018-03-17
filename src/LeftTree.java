public class LeftTree {
    private Integer size;

    private void spaces(Integer i){
        for (Integer j = 0; j < size - i;j++){
            System.out.print(" ");
        }
    };
    private void stars(Integer i){
        for (Integer k = 0; k < i + 1;k++){
            System.out.print("*");
        }
    };
    private void drawBranch(Integer i){
        spaces(i);
        stars(i);
        System.out.println("");
    }
    private void draw1stHalf(){
        for(Integer i = 0; i < size - 1; i++){
            drawBranch(i);
        }
    }
    private void draw2ndHalf(){
        for (Integer i = size - 1; i > -1; i--){
            drawBranch(i);
        }
    }
    public LeftTree(Integer height){
        size = height;
    }
    public void drawTree(){
        draw1stHalf();
        draw2ndHalf();
    }
}
