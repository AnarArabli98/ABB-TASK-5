package lesson12;

public class Subscriber extends Thread {
    private String name;
    private NewPublisher newPublisher;


    public Subscriber(NewPublisher newPublisher, String name) {
        this.newPublisher = newPublisher;
        this.name = name;
    }
    public void update(String news) {
        System.out.println(name + " Yeni xeber aldi " + news);
    }

    @Override
    public void run() {
            synchronized (newPublisher.getLock()) {
                while (newPublisher.getLatestNews() != null) {
                    try {
                        newPublisher.getLock().wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
                update(newPublisher.getLatestNews());
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
        }

    }

}
