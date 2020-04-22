public class App {
    public static void main(String[] args) {
        System.out.println("App3");
    }
    public void doStuff(){
        System.out.println("AppDo.Stuff called featureY");
    }
    private static void featureY(){
        new App().doStuff();
    }
}
