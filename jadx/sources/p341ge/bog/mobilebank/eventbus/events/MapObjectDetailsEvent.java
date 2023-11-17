package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.map.MapObject;

/* renamed from: ge.bog.mobilebank.eventbus.events.MapObjectDetailsEvent */
public class MapObjectDetailsEvent extends RootEvent {
    private MapObject mapObject;

    public MapObject getMapObject() {
        return this.mapObject;
    }

    public void setMapObject(MapObject mapObject2) {
        this.mapObject = mapObject2;
    }
}
