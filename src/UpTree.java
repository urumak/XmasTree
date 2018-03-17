public class UpTree {
    private Integer size;

    private void spaces(Integer i){
        for (Integer j = 0; j < size - i - 1;j++){
            System.out.print(" ");
        }
    };
    private void stars(Integer i){
        for (Integer k = 0; k < 2*i + 1;k++){
            System.out.print("*");
        }
    };
    private void drawBranch(Integer i){
        spaces(i);
        stars(i);
        System.out.println("");
    }
    public UpTree(Integer height){
        size = height;
    }
    public void drawTree(){
        for (Integer i = 0; i < size; i++){
            drawBranch(i);
        }
    }
}
