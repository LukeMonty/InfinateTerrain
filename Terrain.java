package infinateTerrain;

import java.util.Random;

public class Terrain {

	private Tile[][] terrain = new Tile[10][10];
	

	public void setTerrain() {
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				Tile tiles = new Tile();
				terrain[j][i] = tiles;
			}

		}

		setAltitude();
		setFeatures();

	}

	public void setAltitude() {

		Random r = new Random();

		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				int newAlt = terrain[j][i].getAltitude() + (r.nextInt(3) - 1);
				terrain[j][i] = new Tile();
				terrain[j][i].setAltitude(newAlt);
				System.out.print(terrain[j][i].getAltitude() + " " + terrain[j][i].hasFeature() + " ");

			}
			System.out.println();

		}

	}

	public void setFeatures() {

		Random r = new Random();
		Random rI = new Random();
		Random rJ = new Random();

		int noOfFeatures = r.nextInt(10) + 5; // sets the minimum of 5 features, maximum of 15

		System.out.println(noOfFeatures);

		while (noOfFeatures > 0) {

			int randI = rI.nextInt(10);
			int randJ = rJ.nextInt(10);

			System.out.println(randI + " " + randJ);

			if (terrain[randJ][randI].hasFeature() == false) {
				terrain[randJ][randI].setHasFeature(true);
				noOfFeatures--;
			} else {
				break;
			}

		}
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {

				System.out.print(terrain[j][i].getAltitude() + " " + terrain[j][i].hasFeature() + " ");
			}
			System.out.println();
		}

	}

}
