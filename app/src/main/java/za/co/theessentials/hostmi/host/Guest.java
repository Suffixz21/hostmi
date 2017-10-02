package za.co.theessentials.hostmi.host;

import java.util.Date;

public class Guest extends BaseClass{

    public Guest(Builder builder) {
        super(builder);
    }

    public static class Builder implements IBuilder{
        private String name;
        private String surname;
        private Date date;

        @Override
        public IBuilder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public IBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        @Override
        public IBuilder date(Date date) {
            this.date = date;
            return this;
        }

        @Override
        public Host build() {
            return new Guest(this);
        }
    }
}
