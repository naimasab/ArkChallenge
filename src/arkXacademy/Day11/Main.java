package arkXacademy.Day11;

import java.util.ArrayList;
import java.util.List;
import static arkXacademy.Day11.Async.executingAsynchronously;
import static arkXacademy.Day11.Async.executingConcurrently;

public class Main{
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Task taskA = new Task("Task A", 2000); // takes 2 seconds
        Task taskB = new Task("Task B", 1500); // takes 3 seconds
        Task taskC = new Task("Task C", 3000);
        Task taskX = new Task("Task X", 2000);
        Task taskY = new Task("Task Y", 1500);
        Task taskZ = new Task("Task Z", 3000);
        Task taskAlpha = new Task("Task Alpha", 2000);
        Task taskBeta = new Task("Task Beta", 1500);
        Task taskGamma = new Task("Task Gamma", 1000);

        taskA.executeSynchronously();
        taskB.executeSynchronously();
        taskC.executeSynchronously();

        Task[] tk = {taskX, taskY, taskZ};
        executingAsynchronously(List.of(tk));

        Task[] task = {taskAlpha, taskBeta, taskGamma};
        executingConcurrently(List.of(task));


    }
}