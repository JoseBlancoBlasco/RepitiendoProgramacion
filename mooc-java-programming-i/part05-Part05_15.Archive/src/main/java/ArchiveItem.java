
public class ArchiveItem {

    private String identifier;
    private String name;

    public ArchiveItem(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof ArchiveItem)) {
            return false;
        }

        ArchiveItem compareItem = (ArchiveItem) compared;

        return this.identifier.equals(compareItem.identifier);
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
