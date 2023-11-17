package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.MapObjectsEvent */
public class MapObjectsEvent extends RootEvent {
    private MapObjectWrapper mapObjects;

    public MapObjectWrapper getMapObjects() {
        return this.mapObjects;
    }

    public ArrayList<MapObject> getMapObjectsByType(String str) {
        return this.mapObjects.getMapObjectsByType(str);
    }

    public void setMapObjects(MapObjectWrapper mapObjectWrapper) {
        this.mapObjects = mapObjectWrapper;
    }
}
