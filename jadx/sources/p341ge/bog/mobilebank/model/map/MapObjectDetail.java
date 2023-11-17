package p341ge.bog.mobilebank.model.map;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.map.MapObjectDetail */
public class MapObjectDetail {
    private long objectId;
    private String objectKey;
    private String objectName;
    private ArrayList<MapObjectSchedule> objectSchedule;
    private ArrayList<MapObjectService> services;

    public ArrayList<MapObjectSchedule> getObjectSchedule() {
        return this.objectSchedule;
    }

    public ArrayList<MapObjectService> getServices() {
        return this.services;
    }

    public void setServices(ArrayList<MapObjectService> arrayList) {
        this.services = arrayList;
    }
}
