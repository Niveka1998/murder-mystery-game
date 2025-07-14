public class Item {
    private String name;
    private String description;
    private boolean isRedHerring;

    public Item(String name, String description, boolean isRedHerring) {
        this.name = name;
        this.description = description;
        this.isRedHerring = isRedHerring;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description + (isRedHerring ? "(might be misleading)" : "");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRedHerring() {
        return isRedHerring;
    }

    public void setRedHerring(boolean redHerring) {
        isRedHerring = redHerring;
    }
}
