package processingFiles;

class Myclass implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Closing!...");
	}
}
public class Application4 {

	public static void main(String[] args) {
	try(MyClass var=new Myclass();){
		//works only in java 1.7 or above...
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
