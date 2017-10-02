package za.co.theessentials.hostmi.hostmi;

import java.util.Date;
import java.util.List;

import za.co.theessentials.hostmi.host.Guest;
import za.co.theessentials.hostmi.host.Host;
import za.co.theessentials.hostmi.host.HostImpl;

/**
 * A HostMiImpl is a lunch or diner event, hosted by any host
 */

public class HostMiImpl implements HostMi{
    private Date date;
    private List<Host> guests;


    public HostMiImpl(Builder builder) {
        date =  builder.date;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public List<Host> getGuests() {
        return guests;
    }

    public static class Builder {

        public Date date;

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public HostMiImpl build() {
            return new HostMiImpl(this);
        }
    }
}
