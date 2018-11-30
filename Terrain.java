package infinateTerrain;

import java.util.Random;

public class Terrain {
	
	Tile[][] terrain = new Tile[10][10];
	int noOfFeatures = 0;

	public void setTerrain() {
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				
				Tile tiles = new Tile();
				terrain[j][i] = tiles;
				
			}
			
		}
		setFeatures();
		
	}
	
	public void setAltitude() {
		
		Tile tiles = new Tile();
		
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				
				terrain[j][i] = tiles;
				// TODO change altitude +1 or -1 from previous index 
			}
			
		}
		
	}

	public void setFeatures() {

		Random r = new Random();
		Random rI = new Random();
		Random rJ = new Random();

		
		noOfFeatures = r.nextInt(10) + 5; // sets the minimum of 5 features, maximum of 15
		
		System.out.println(noOfFeatures);
		
		while (noOfFeatures > 0) {
			int randI = rI.nextInt(10);
			int randJ = rJ.nextInt(10);
			Tile tiles = new Tile();
			System.out.println(randI + " " + randJ);
			
			terrain[randJ][randI] = tiles;
			if (terrain[randJ][randI].hasFeature == false) {
				terrain[randJ][randI].setHasFeature(true);
				noOfFeatures--;
			}
			
		}
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				
				System.out.print(terrain[j][i].altitude + "" + terrain[j][i].hasFeature + " ");
			}
			System.out.println();
		}
		
	}

}
