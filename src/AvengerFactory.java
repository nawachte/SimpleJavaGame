public class AvengerFactory {
    public static Avenger getAvenger(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("easyavenger")){
            return new EasyAvenger();
        }
        else if (type.equalsIgnoreCase("normalavenger")){
            return new NormalAvenger();
        }
        else if (type.equalsIgnoreCase("hardavenger")){
            return new HardAvenger();
        }
        return null;
    }
}
