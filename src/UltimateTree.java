public class UltimateTree {
    Integer modules;

    public UltimateTree(Integer height){
        modules = height;
    }
    public void drawTree(){
        for (Integer moduleNumber = 0; moduleNumber < modules; moduleNumber++){
            Module module = new Module(modules);
            module.drawModule(moduleNumber);
        }
        Root root = new Root(modules);
        root.drawRoot();
    }
}
