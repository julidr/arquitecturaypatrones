package patronFabricaAbstracta.factories;

public enum PizzeriaPlace {
	MARIO, LUIGI, BOO;
	
	public static PizzeriaPlace fromInteger(int x){
		switch (x) {
		case 1:
			return MARIO;
		case 2:
			return LUIGI;
		case 3:
			return BOO;
		default:
			return null;
		}
	}
}


