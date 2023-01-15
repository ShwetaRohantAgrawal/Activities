package activities;

public class Activity8 {
    public static void main(String[] args) {
    try{
        Activity8.exceptionTest("test exception");
        Activity8.exceptionTest(null);
    } catch (CustomException e) {
        System.out.println("inside catch block: "+e);
    }
    }
    static void exceptionTest(String s) throws CustomException{

            if (s== null){

                throw new CustomException("Null value passed") ;
            }
            else{
                System.out.println(s);
            }

    }
}
