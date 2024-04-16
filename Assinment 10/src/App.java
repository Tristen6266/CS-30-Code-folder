public class App {
    public static void main( String[] args )
	{
		Sum test = new Sum();				
		test.setNums(2,6);
		test.sum( );
		test.print();

		test.setNums(3, 6);
		test.sum();
		test.print();
		
    }
}
