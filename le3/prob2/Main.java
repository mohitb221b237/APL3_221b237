public class Main {
    public static void main(String[] args) {
      
        Test test = new Test();
        test.display(); 

        
        AbsTest absTest = new AbsTest() {
            @Override
            public void display() {
                System.out.println("This is the overridden display method in anonymous subclass of AbsTest.");
            }
        };
        absTest.display(); 
    }
}