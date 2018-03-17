public class Root {
    final Integer moduleSize = 4;
    final Integer shift = 2;
    final Integer rootSize = 3;
    Integer modules;

    private void drawLeft(){
        for (Integer j = 0; j < moduleSize + modules - shift; j++){
            if (j == 0){
                System.out.print("O");
            }else{
                System.out.print(" ");
            }
        }
    }
    private void drawRight(){
        for (Integer j = 0; j < moduleSize + modules - rootSize; j++){
            System.out.print(" ");
        }
        System.out.print("O");
    }
    private void rootStars(){
        for (Integer k = 0; k < rootSize; k++){
            System.out.print("*");
        }
    }
    private void drawFirstPart(){
        drawLeft();
        rootStars();
        drawRight();
        System.out.println("");
    }
    private void rootSpaces(){
        for (Integer j = 0; j < moduleSize + modules - shift; j++){
            System.out.print(" ");
        }
    }
    public Root(Integer height){
        modules = height;
    }
    public void drawRoot(){
        drawFirstPart();
        for (Integer m = 0; m < rootSize - 1; m++){
            rootSpaces();
            rootStars();
            System.out.println("");
        }
    }
}
