interface EventHandler {
    void handleEvent();
}

public class EventDemo {
    public void registerEvent() {
        // Local inner class implementation
        class LocalEventHandler implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        EventHandler handler = new LocalEventHandler();
        handler.handleEvent();
    }

    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.registerEvent();

        // Anonymous inner class implementation
        EventHandler anonymousHandler = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        anonymousHandler.handleEvent();
    }
}
