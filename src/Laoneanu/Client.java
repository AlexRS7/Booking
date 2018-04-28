package Laoneanu;

import java.util.Objects;

public class Client {
    private String name;
    private int code;

    public Client(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return code == client.code && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, code);
    }
}
