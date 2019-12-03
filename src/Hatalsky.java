public class Hatalsky{
    private static Hatalsky hatalsky;
    private Hatalsky(){}
    private static Hatalsky getInstance(){
        if (hatalsky == null){
            hatalsky = new Hatalsky();
        }
        return hatalsky;
    }
}