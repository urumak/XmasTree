public class DownTree {
    private Integer size;

    private void spaces(Integer i){
        for (Integer j = 0; j < size - i;j++){
            System.out.print(" ");
        }
    };
    private void stars(Integer i){
        for (Integer k = 0; k < 2*i - 1;k++){
            System.out.print("*");
        }
    };
    private void drawModule(Integer i){
        spaces(i);
        stars(i);
        System.out.println("");
    }

    public DownTree(Integer height){
        size = height;
    }
    public void drawTree(){
        for (Integer i = size; i > 0; i--){
            drawModule(i);
        }
    }
}
