import java.util.ArrayList;

import com.sun.jmx.snmp.tasks.Task;

// This class creates Robots.

public class Robots {
	private String botName;
	private ArrayList<Task> botTasks;
	private Type botType;

	public Robots (String name, Type type, ArrayList<Task> tasks) {
		this.botName = name;
		this.botTasks = tasks;
		this.botType = type;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String name) {
		this.botName = name;
	}

	public void addTask (Task t) {
		botTasks.add(t);
	}
	
	public void removeFinishedTask() {
		botTasks.remove(0);
	}
	
	public void clearTasks() {
		botTasks.clear();
	}
	
}
