package infinateTerrain;

public class Tile {
	private int altitude;
	private boolean hasFeature = false;
	
	public Tile() {
		this.hasFeature = false;
		this.altitude = 5;
		
	}
	
	public int getAltitude() {
		return altitude;
	}
	
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
	public void setHasFeature(boolean hasFeature) {
		this.hasFeature = hasFeature;
	}
	
	public boolean hasFeature() {
		return hasFeature;
	}
	
	
}
