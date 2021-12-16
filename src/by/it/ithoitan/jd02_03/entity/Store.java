package by.it.ithoitan.jd02_03.entity;

public class Store {
    private final Manager manager;
    private final Queue queue;

    public Store(Manager manager, Queue queue) {
        this.manager = manager;
        this.queue = queue;
    }

    public Manager getManager() {
        return manager;
    }

    public Queue getQueue() {
        return queue;
    }
}
