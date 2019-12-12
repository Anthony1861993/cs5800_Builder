package cs5800_Builder;

public class CruiseShipBuilder implements ShipBuilder {
	private Ship ship;
	
	public CruiseShipBuilder() {
		this.ship = new Ship();
	}
	
	public void buildHull() {
		ship.setHull("White plastic hull");
		System.out.println("White plastic hull installed...");
	}
	
	public void buildDeck() {
		ship.setDeck("Wooden floor");
		System.out.println("Wooden floor installed...");
	}
	
	public void buildFunnel() {
		ship.setFunnel("Small funnel");
		System.out.println("Small funnel installed...");
	}
	
	public void buildMast() {
		ship.setMast("Low mast");
		System.out.println("Low mast installed...");
	}
	
	public void buildForecastle() {
		ship.setForecastle("Light forecastle");
		System.out.println("Light forecastle installed...");
	}
	
	public void buildBridge() {
		ship.setBridge("Communication bridge");
		System.out.println("Communication bridge installed...");
	}
	
	public void getShip() {
		System.out.println("Cruise ship is complete.");
	}

}
