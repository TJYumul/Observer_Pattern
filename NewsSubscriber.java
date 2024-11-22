public class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Breaking News for " + name + ": " + news);
    }

    public String getName() {
        return name;
    }
}
