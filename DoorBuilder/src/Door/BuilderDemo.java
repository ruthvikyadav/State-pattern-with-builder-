package Door;

public class BuilderDemo {
	
	public static void main(String args[]){  
		
		DoorBuilder doorBuilder = new DoorBuilder();
		DoorModel doormodel = doorBuilder.buildDamro();
		doormodel.showType();
		System.out.println("\n");
		DoorModel doormodel1= doorBuilder.buildSimpson();
		doormodel1.showType();
	}
}
