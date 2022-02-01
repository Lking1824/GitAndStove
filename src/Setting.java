// Authors: Lucas King & Mason Harless
// Assignment: C06A Git and Stove (Pair)

public enum Setting {
	
	// Create temperatures
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	
	private String setting;
	
	Setting(String setting){
		this.setting= setting;
	}
	
	@Override
	public String toString() {
		return setting;
	}
}
