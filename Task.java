// This class creates Tasks for Robots.
// Each task has a description and an estimated time to complete.

public class Task {
	
	private String description;
	private long eta;
	
	public Task (String des, long eta) {
		this.description = des;
		this.eta = eta;
	}
	
	public Task doDishes() {
		return new Task("do the dishes", 1000);
	}
	
	public Task sweepHouse() {
		return new Task("sweep the house", 3000);
	}
	
	public Task doLaundry() {
		return new Task("do the laundry", 10000);
	}
	
	public Task recyclying() {
		return new Task("take out the recyclying", 4000);
	}
	
	public Task sammich() {
		return new Task("make a sammich", 7000);
	}
	
	public Task mowLawn() {
		return new Task("mow the lawn", 20000);
	}
	
	public Task rakeLeaves() {
		return new Task("rake the leaves", 18000);
	}
	
	public Task dogBath() {
		return new Task("give dog a bath", 14500);
	}
	
	public Task bakeCookies() {
		return new Task("bake some cookies", 8000);
	}
	
	public Task washCar() {
		return new Task("wash the car", 20000);
	}
}
