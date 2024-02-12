package arkXacademy.Day11;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Async {
    public static void executingAsynchronously(List<Task> tasks) {
        for (Task task:tasks) {
            CompletableFuture.runAsync(() -> task.executeAsynchronously());
        }
    }

    public static void executingConcurrently(List<Task> tasks) {
        for (Task task:tasks){
            Thread thread=new Thread(()->task.executeConcurrently());
            thread.start();
        }

    }

}