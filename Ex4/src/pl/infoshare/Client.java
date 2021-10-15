package pl.infoshare;

import java.util.Objects;

public class Client extends Order{
    private int telephone;

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return telephone == client.telephone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), telephone);
    }
}
