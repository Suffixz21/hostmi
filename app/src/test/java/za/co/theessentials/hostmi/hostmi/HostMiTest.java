package za.co.theessentials.hostmi.hostmi;

import org.junit.Test;

import java.util.Date;

import za.co.theessentials.hostmi.host.HostImpl;

import static junit.framework.Assert.assertEquals;

public class HostMiTest {

    @Test
    public void shouldGetTheTimeOfHostMi() {
        HostMiImpl hostMiImpl = new HostMiImpl.Builder()
                .date(new Date(19900830L))
                .build();
        Date actual = new Date(19900830L);
        Date expected = hostMiImpl.getDate();
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnHostDetails() {
        HostMiImpl hostMi = new HostMiImpl.Builder()
                .date(new Date(20170919L))
                .build();

        HostImpl host = (HostImpl) new HostImpl.Builder()
                .name("Lehasa")
                .surname("Mikaelson")
                .date(new Date(20190910L))
                .build();

        assertEquals("Lehasa", host.getName());
    }
}
