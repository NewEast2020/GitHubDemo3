public class App {
    public static void main(String[] args) {
        System.out.println("App3");
    }
    public void doStuff(){
        System.out.println("App.doStuff called by featureZ");
    }
    private static void featureZ(){
        new App().doStuff();
    }
}
