import java.util.*;

enum Priority {
    LOW, MEDIUM, HIGH
}

class Task {
    private String name;
    private boolean isCompleted;
    private Priority priority;
    private String category;

    public Task(String name, Priority priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
        this.isCompleted = false;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " [" + category + "] - Priority: " + priority + (isCompleted ? " [Completed]" : " [Pending]");
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name, Priority priority, String category) {
        tasks.add(new Task(name, priority, category));
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // MISSING FEATURES:

    public void removeTask(String name) {
    Iterator<Task> iterator = tasks.iterator();
    while (iterator.hasNext()) {
        Task task = iterator.next();
        if (task.getName().equalsIgnoreCase(name)) {
            iterator.remove();
            System.out.println("Task \"" + name + "\" has been removed.");
            return;
        }
    }
    System.out.println("Task \"" + name + "\" not found.");
}

    // 2. Find all completed tasks
    public List<Task> getCompletedTasks() {
        // TODO: Implement logic to return completed tasks
        return new ArrayList<>();
    }

    // 3. List tasks sorted by name
    public void sortTasksByName() {
        // TODO: Implement sorting logic
    }

    // 4. Sort tasks by priority
    public void sortTasksByPriority() {
        // TODO: Implement sorting by priority logic
    }

    // 5. Filter tasks by category
    public List<Task> filterByCategory(String category) {
        // TODO: Implement filtering logic
        return new ArrayList<>();
    }

    public Task getMostUrgentTask() {
    Task mostUrgentTask = null;

    for (Task task : tasks) {
        if (!task.isCompleted()) {
            if (mostUrgentTask == null || task.getPriority().ordinal() < mostUrgentTask.getPriority().ordinal()) {
                mostUrgentTask = task;
            }
        }
    }

    return mostUrgentTask; 
}

    public Map<String, Integer> countTasksPerCategory() {
    Map<String, Integer> counts = new HashMap<>();

    for (Task task : tasks) {
        String category = task.getCategory();
        if (counts.containsKey(category)) {
            counts.put(category, counts.get(category) + 1);
        } else {
            counts.put(category, 1);
        }
    }


    return counts;
}

    public void markTaskCompleted(String name) {
    for (Task task : tasks) {
        if (task.getName().equalsIgnoreCase(name)) {
            task.complete();
            System.out.println("Task \"" + name + "\" marked as completed.");
            return;
        }
    }
   
}

    // 9. Mark all tasks in a category as completed
    public void markCategoryCompleted(String category) {
        // TODO: Implement bulk completion logic
    }
}

public class SI2025Lab1Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Write report", Priority.HIGH, "Work");
        manager.addTask("Submit assignment", Priority.MEDIUM, "School");
        manager.addTask("Buy groceries", Priority.LOW, "Personal");

        // MISSING: Calls to the new methods that will be implemented

        manager.printTasks();
    }
}
