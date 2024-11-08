package logico;

import javafx.geometry.Point2D;
import java.io.Serializable;
import java.util.Objects;

public class Stop implements Serializable {
    private String id;
    private String name;
    private Point2D location;
    private String description;

    public Stop(String id, String name, Point2D location, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Point2D getLocation() { return location; }
    public void setLocation(Point2D location) { this.location = location; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stop stop = (Stop) o;
        return Objects.equals(id, stop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}