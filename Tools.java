public class Tools {
    public static boolean validate(String x, int numOfChoices){
        try {
            int r = Integer.valueOf(x);
                if(r >= 1 && r <= numOfChoices){
                    return true;
                }
        } catch (Exception e) {}
        return false;
    }
}
