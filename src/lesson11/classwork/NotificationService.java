package lesson11.classwork;

public class NotificationService {
    public void notifyUser() throws InterruptedException {
        synchronized (this){
            System.out.println("trying to send notification to user");
            this.wait();
            System.out.println("notification has been sent");
        }
    }
    public void notifyAdmin(){
        System.out.println("trying to send notification to admin");
        synchronized (this){
            System.out.println("notification has been sent admin");
            this.notifyAll();
        }
    }
}
