package cs5800_Builder;

public class Client {
	public static void main(String[] args) {
		
		ShipArchitect myArchitect = new ShipArchitect(new WarShipBuilder());
		myArchitect.buildShip();
		
		ShipArchitect myArchitect2 = new ShipArchitect(new CruiseShipBuilder());
		myArchitect2.buildShip();
		
	}
}
