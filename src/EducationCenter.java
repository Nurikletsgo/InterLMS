import java.time.LocalDate;

public abstract class EducationCenter {
   /* EducationCenter деген абстракт класс тузунуз.
    Полелери: name, locatedCountry, LocalDate foundationYear;*/
    private String name;
    private String locatedCounty;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatedCounty, LocalDate foundationYear) {
        this.name = name;
        this.locatedCounty = locatedCounty;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCounty() {
        return locatedCounty;
    }

    public void setLocatedCounty(String locatedCounty) {
        this.locatedCounty = locatedCounty;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return " EducationCenter".toUpperCase() +
                "  name = " + name +
                ", locatedCounty = " + locatedCounty +
                ", foundationYear = " + foundationYear;
    }
}
