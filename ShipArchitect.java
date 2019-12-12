package cs5800_Builder;

public class ShipArchitect {
	
	private ShipBuilder shipBuilder;
	
	public ShipArchitect(ShipBuilder shipBuilder) {
		this.shipBuilder = shipBuilder;
	}
	
	public void buildShip() {
		shipBuilder.buildHull();
		shipBuilder.buildDeck();
		shipBuilder.buildFunnel();
		shipBuilder.buildMast();
		shipBuilder.buildForecastle();
		shipBuilder.buildBridge();
		shipBuilder.getShip();
	}
}
