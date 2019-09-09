package algorithms.DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private List<Vertex> neighborList;

    public Vertex(String name) {
        this.name = name;
        this.neighborList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighborList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
