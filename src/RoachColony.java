public class RoachColony {
    private String colonyName;
    private int population;
    private double growthRate;


    /**
     * Default Constructor
     */
    public RoachColony(){
        this.colonyName = "null";
        this.population = -1;
        this.growthRate = -1.0;
    }

    /**
     * Overloaded constructor
     * @param n = colony name
     * @param p = population
     * @param g = growth rate
     */
    public RoachColony(String n, int p, double g){
        this.colonyName = n;
        this.population = p;
        this.growthRate = g;
    }

    /**
     * Getter Method
     * @return
     */
    public String getColonyName(){
        return this.colonyName;
    }

    /**
     * Getter Method
     * @return
     */
    public double getGrowthRate() {
        return this.growthRate;
    }

    /**
     * Getter Method
     * @return
     */
    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int p){
        this.population = p;
    }

	
	public String toString() {
		return colonyName + "roach colony with a population of " + population + " and a growth rate of " + growthRate;
	}
}
