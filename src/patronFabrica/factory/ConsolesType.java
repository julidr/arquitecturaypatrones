package patronFabrica.factory;

public enum ConsolesType {
	
	SWITCH, PS4, XBOXONE;
	
	public static ConsolesType fromInteger(int x){
		switch (x) {
		case 1:
			return SWITCH;
		case 2:
			return PS4;
		case 3:
			return XBOXONE;
		default:
			return null;
		}
	}

}
