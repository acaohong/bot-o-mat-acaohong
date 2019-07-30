import java.util.ArrayList;

// This class creates Robots.

public class Robots {
	private String botName;
	private ArrayList<Task> botTasks;
	private Type botType;

	public Robots (String name, ArrayList<Task> tasks) {
		this.botName = name;
		this.botTasks = tasks;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String name) {
		this.botName = name;
	}
}
