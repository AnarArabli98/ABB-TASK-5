package lesson12;

public class Practice12 {
    static void main() throws Exception{
        NewPublisher publisher = new NewPublisher();

        // 3 subscriber yaradırıq
        publisher.addSubscriber(new Subscriber(publisher, "Subscriber-1"));
        publisher.addSubscriber(new Subscriber(publisher, "Subscriber-2"));
        publisher.addSubscriber(new Subscriber(publisher, "Subscriber-3"));

        // subscriber-ləri işə salırıq
        for (Subscriber s : publisher.getSubscribers()) {
            s.start();
        }

        // Publisher hər 2 saniyədə bir yeni xəbər yaradır
        int count = 1;
        while (true) {
            publisher.publishNews("Xəbər #" + count++);
            Thread.sleep(2000);
        }
    }
    }

