public class NewsSubscriptionService {
    public static void main(String[] args) {

        RealTimeNewsAgency newsAgency = new RealTimeNewsAgency();

        NewsSubscriber tj = new NewsSubscriber("TJ");
        NewsSubscriber lj = new NewsSubscriber("LJ");
        NewsSubscriber french = new NewsSubscriber("French");

        newsAgency.subscribe(tj);
        newsAgency.subscribe(lj);
        newsAgency.subscribe(french);

        newsAgency.publishNews("3 recent typhoons affect 1M families in 8 regions");

        newsAgency.unsubscribe(lj);

        NewsSubscriber daniel = new NewsSubscriber("Daniel");
        newsAgency.subscribe(daniel);

        newsAgency.publishNews("Heavy NLEX traffic expected on Nov. 23 due to concert in PH Arena");
    }
}