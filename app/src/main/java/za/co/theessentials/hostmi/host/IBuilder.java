package za.co.theessentials.hostmi.host;

import java.util.Date;

public interface IBuilder {
    String name = null;
    String surname = null;
    Date date = null;

    IBuilder name(String name);
    IBuilder surname(String surname);
    IBuilder date(Date date);
    Host build();
}
