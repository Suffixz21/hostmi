package za.co.theessentials.hostmi.hostmi;

import java.util.Date;
import java.util.List;

import za.co.theessentials.hostmi.host.Guest;
import za.co.theessentials.hostmi.host.Host;

public interface HostMi {
    Date getDate();
    List<Host> getGuests();
}
