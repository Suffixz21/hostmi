package za.co.theessentials.hostmi.host;

import java.util.Date;

public abstract class BaseClass implements Host {

    protected String name;
    protected String surname;
    protected Date date;

    public BaseClass(IBuilder builder) {
        name = builder.name;
        surname = builder.surname;
        date = builder.date;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Date getDate() {
        return date;
    }
}
