package za.co.simplitate.useradmin.util;

public final class IDGenerator {
	
	static int i;
	
	public static final int generateId() {
		return i++;
	}

}
