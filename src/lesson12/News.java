package lesson12;

public class News {
    private final int id;
    private final String news;
    private final String title;
    private final String category;
    private final String body;

    private News(Builder builder) {
        this.id = builder.id;
        this.news = builder.news;
        this.category = builder.category;
        this.title = builder.title;
        this.body = builder.body;
    }

    @Override
    public String toString() {
        return "News{" +
                "news='" + news + '\'' +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public class Builder {
        private int id;
        private String news;
        private String category;
        private String title;
        private String body;
        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder news(String news) {
            this.news = news;
            return this;
        }
        public Builder category(String category) {
            this.category = category;
            return this;
        }
        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public News build() {
            return new News(this);

        }
    }



}
