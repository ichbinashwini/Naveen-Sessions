package SeleniumSessions;

public class VerificationUtility {

    public static boolean verifyContains(String actaul , String expected){

        if(actaul.equals(expected)){
            return true;
        }
        return false;
    }


}
