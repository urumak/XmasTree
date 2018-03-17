public class Module {
    final Integer moduleSize = 4;
    final Integer shift = 2;
    Integer modules;

    private void rightBalls(Integer moduleNumber, Integer i){
        for (Integer j = 0; j < moduleSize - i + modules - moduleNumber - 1; j++){
            if (moduleNumber != 0 && i == 0 && j == modules - moduleNumber) {
                System.out.print("O");
            }else{
                System.out.print(" ");
            }
        }
    }
    private void leftBalls(){
        for (Integer l = 0; l < shift; l++){
            System.out.print(" ");
        }
        System.out.print("O");
    }
    private void stars(Integer moduleNumber, Integer i){
        for (Integer k = 0; k < 2*i + 2*moduleNumber + 1; k++){
            System.out.print("*");
        }
    }
    private void drawBranch(Integer moduleNumber, Integer i){
        rightBalls(moduleNumber, i);
        stars(moduleNumber, i);
        if (moduleNumber != 0 && i == 0){
            leftBalls();
        }
        System.out.println("");
    }
    public Module(Integer height){
        modules = height;
    }
    public void drawModule(Integer moduleNumber){
        for (Integer i = 0; i < moduleSize; i++){
            drawBranch(moduleNumber, i);
        }
    }
}
