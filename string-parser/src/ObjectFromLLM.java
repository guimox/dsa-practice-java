public class ObjectFromLLM {
    private String language;
    private String quote;
    private String category;

    public ObjectFromLLM(String language, String quote, String category) {
        this.language = language;
        this.quote = quote;
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public String getQuote() {
        return quote;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "ObjectFromLLM{" + "language='" + language + '\'' + ", quote='" + quote + '\'' + ", category='" + category + '\'' + '}';
    }
}
