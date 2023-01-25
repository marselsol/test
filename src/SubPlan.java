public class SubPlan {

    private String id;

    private Badge badge;

    public SubPlan() {
    }

    public SubPlan(String id, Badge badge) {
        this.id = id;
        this.badge = badge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    @Override
    public String toString() {
        return "SubPlan{" +
                "id='" + id + '\'' +
                ", badge=" + badge +
                '}';
    }
}
