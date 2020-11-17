package be.darkshark.parkshark.api.dto;

public class DivisionDto {

    private long id;

    private String name;

    private String originalName;

    private long director_id;

    private long parent_division_id;

    public DivisionDto(long id, String name, String originalName, long director_id, long parent_division_id) {
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.director_id = director_id;
        this.parent_division_id = parent_division_id;
    }

    public DivisionDto(){};

    public String getName() {
        return name;
    }

    public DivisionDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getOriginalName() {
        return originalName;
    }

    public DivisionDto setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }

    public long getDirector_id() {
        return director_id;
    }

    public DivisionDto setDirector_id(long director_id) {
        this.director_id = director_id;
        return this;
    }

    public long getParent_division_id() {
        return parent_division_id;
    }

    public DivisionDto setParent_division_id(long parent_division_id) {
        this.parent_division_id = parent_division_id;
        return this;
    }

    public long getId() {
        return id;
    }

    public DivisionDto setId(long id) {
        this.id = id;
        return this;
    }

}
