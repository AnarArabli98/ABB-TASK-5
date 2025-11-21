package lesson12;

import java.util.ArrayList;
import java.util.List;

public class NewPublisher {


    private  final  List<Subscriber> subscribers = new ArrayList<>();
    private final Object lock = new Object();
    private String latestNews;

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public Object getLock(){
        return lock;
    }
    public String getLatestNews() {
        return latestNews;
    }

    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }

    public void publishNews(String news){
        synchronized(lock){
            latestNews = news;
            System.out.println("Yeni xeber yayimlandi " + latestNews);
            lock.notifyAll();
        }
    }

}
