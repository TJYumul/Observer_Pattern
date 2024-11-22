import java.util.ArrayList;
import java.util.List;

// Concrete implementation of the NewsAgency
public class RealTimeNewsAgency implements NewsAgency {
    private List<Subscriber> subscribers;
    private String news;

    public RealTimeNewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("\n" + subscriber.getName() + " has unsubscribed.\n");
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String latestNews) {
        this.news = latestNews;
        System.out.println("\nNews Agency publishes: " + latestNews);
        notifySubscribers();
    }
}