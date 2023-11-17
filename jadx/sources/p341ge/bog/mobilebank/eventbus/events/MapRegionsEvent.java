package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.map.MapRegion;

/* renamed from: ge.bog.mobilebank.eventbus.events.MapRegionsEvent */
public class MapRegionsEvent extends RootEvent {
    private ArrayList<MapRegion> mapRegions;

    public MapRegionsEvent() {
    }

    public ArrayList<MapRegion> getMapRegions() {
        return this.mapRegions;
    }

    public void setMapRegions(ArrayList<MapRegion> arrayList) {
        this.mapRegions = arrayList;
    }

    public MapRegionsEvent(ArrayList<MapRegion> arrayList) {
        this.mapRegions = arrayList;
    }
}
