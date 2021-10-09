package Door;

public class DoorBuilder {
	
	public DoorModel buildDamro() {
		DoorModel model = new DoorModel();
		model.addType(new Damro());
		return model;	
	}
	
	public DoorModel buildSimpson() {
		DoorModel model = new DoorModel();
		model.addType(new SimpsonCompany());
		return model;	
	}
}
