public class RightTree {
    private Integer size;

    private void stars(Integer i){
        for (Integer k = 0; k < i + 1;k++){
            System.out.print("*");
        }
    };
    private void drawBranch(Integer i){
        stars(i);
        System.out.println("");
    }
    public RightTree(Integer height){
        size = height;
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
    public void drawTree(){
        draw1stHalf();
        draw2ndHalf();
    }
}
