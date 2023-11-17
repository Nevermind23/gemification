package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.map.MapObject;

/* renamed from: ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent */
public class MapObjectStatusEvent extends RootEvent {
    private MapObject mapObject;
    private String status;

    public MapObject getMapObject() {
        return this.mapObject;
    }

    public String getStatus() {
        return this.status;
    }

    public void setMapObject(MapObject mapObject2) {
        this.mapObject = mapObject2;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
