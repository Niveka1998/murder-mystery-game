public class Suspect {
    private String name;
    private String alibi;
    private boolean isGuilty;
    private String weapon;

    public Suspect(String name, String alibi, boolean isGuilty, String weapon){
        this.name= name;
        this.alibi = alibi;
        this.isGuilty = isGuilty;
        this.weapon =weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlibi() {
        return alibi;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }

    public boolean isGuilty() {
        return isGuilty;
    }

    public void setGuilty(boolean guilty) {
        isGuilty = guilty;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
