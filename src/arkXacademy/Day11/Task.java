package arkXacademy.Day11;

public class Task {
    private long taskId;
    private String taskName;
    private long duration;

    public Task(String taskName, long duration) {
        this.duration= duration;
        this.taskName = taskName;

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void executeSynchronously() {
        System.out.println("Executing: " + taskName);
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName+"...Completed! (Duration : "+duration + " ms )");

    }
    public void executeAsynchronously(){
        System.out.println(taskName+" started asynchronously.");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName+" completed asynchronously! (Duration : "+duration + " ms )");
    }
    public void executeConcurrently(){
        System.out.println(taskName+" started concurrently");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName+" completed concurrently! (Duration : "+duration + " ms )");
    }



}