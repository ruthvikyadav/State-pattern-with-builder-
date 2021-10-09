package Door;

import java.util.ArrayList;
import java.util.List;

public class DoorModel {
	
	private List<DoorType> type = new ArrayList<DoorType>();
	
	public void addType(DoorType doorType) {
		type.add(doorType);
	}
	
	public void getWood() {
		for(DoorType doorType : type ) {
			doorType.addwood();
		}
	}
	public void getColor() {
		for(DoorType doorType : type ) {
			doorType.addcolor();
		}
	}
	public void getLock() {
		for(DoorType doorType : type ) {
			doorType.addlock();
		}
	}
	public void getMaterial() {
		for(DoorType doorType : type ) {
			doorType.addmaterial();
		}
	}
	
	public void showType() {
		for(DoorType doorType : type ) {
			System.out.println("Door Name :" +doorType.type());
			System.out.println("Wood State :" +doorType.addwood());
			System.out.println("Lock State :" +doorType.addlock());
			System.out.println("Material State :" +doorType.addmaterial());
			System.out.println("Color State :" +doorType.addcolor());
		}
	}

	
}
