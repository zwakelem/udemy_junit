package za.co.simplitate.mockito.scrapbook;

public class A {
	
	private B b;
	
	public A(B b) {
		this.b = b;
	}
	
	public int usesVoidMethod() throws RuntimeException {
		try {
			b.voidMethod();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return 1;
	}

}
