// This class creates Tasks for Robots.
// Each task has a description and an estimated time to complete.

public class Task {
	
	private String description;
	private long eta;
	
	public Task (String des, long eta) {
		this.description = des;
		this.eta = eta;
	}
	
}
