public class App {
    public static void main(String[] args) throws Exception {
       
        //creating AsteriskLogger object and SpacedLogger object
        AsteriskLogger logOne = new AsteriskLogger();
        SpacedLogger spacedLogOne = new SpacedLogger();

    //testing both methods 
        logOne.Log("Hello");
        logOne.Error("Hello");
        spacedLogOne.Log("Test");
        spacedLogOne.Error("Test");
    }
}
