package lesson1919;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return this.storage;
    }

    @Override
    public void run() {
        while (true) {
            Task task = storage.get();
            if (task == null) {
                System.out.println(Thread.currentThread().getName() + "задач не обнаружил, завершаю раюоту");
                break;
            }
            try {
                System.out.println(Thread.currentThread().getName() + " начал выполнять задачу: " + task);
                task.execute();
                System.out.println(Thread.currentThread().getName() + " выполнил задачу: " + task);
            } catch (TaskExecutionFailedException e) {
                System.out.println(Thread.currentThread().getName() + " невозможно выполнить задачу: " + task);
                if (task.getTryCount() < 5) {
                    task.incTryCount();
                    storage.add(task);
                } else {
                    System.out.println(Thread.currentThread().getName() + " удаляем задачу: " + task);
                }
            }
        }

    }
}
