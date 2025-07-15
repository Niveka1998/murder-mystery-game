public class Item {
    private String name;
    private String description;
    private boolean isRedHerring;
    private String location;

    public Item(String name, String description, boolean isRedHerring, String location) {
        this.name = name;
        this.description = description;
        this.isRedHerring = isRedHerring;
        this.location=location;
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
    public String getLocation(){
        return location;
    }
}
