package cs5800_Builder;

public class WarShipBuilder implements ShipBuilder {
	private Ship ship;
	
	public WarShipBuilder() {
		this.ship = new Ship();
	}
	
	public void buildHull() {
		ship.setHull("Aluminum hull");
		System.out.println("Aluminum hull installed...");
	}
	
	public void buildDeck() {
		ship.setDeck("Silver floor");
		System.out.println("Silver floor installed...");
	}
	
	public void buildFunnel() {
		ship.setFunnel("Big funnel");
		System.out.println("Big funnel installed...");
	}
	
	public void buildMast() {
		ship.setMast("High mast");
		System.out.println("High mast installed...");
	}
	
	public void buildForecastle() {
		ship.setForecastle("Protective forecastle");
		System.out.println("Protective forecastle installed...");
	}
	
	public void buildBridge() {
		ship.setBridge("CIA navigational bridge");
		System.out.println("CIA navigational bridge installed...");
	}
	
	public void getShip() {
		System.out.println("War ship is complete.");
	}
}
