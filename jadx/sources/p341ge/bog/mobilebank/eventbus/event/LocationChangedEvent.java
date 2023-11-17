package p341ge.bog.mobilebank.eventbus.event;

import android.location.Location;

/* renamed from: ge.bog.mobilebank.eventbus.event.LocationChangedEvent */
public class LocationChangedEvent {
    private Location location;

    public LocationChangedEvent(Location location2) {
        this.location = location2;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location2) {
        this.location = location2;
    }
}
