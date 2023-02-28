package course1.objects;

public class Author {
    private String name;
    private String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author chel = (Author) other;
        return (name.equals(chel.name)&&lastname.equals(chel.lastname));
    }

    @Override
    public int hashCode() {
        return (java.util.Objects.hash(name) + java.util.Objects.hash(lastname));
    }


}

