package p341ge.bog.mobilebank.model.map;

import g91.C32312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: ge.bog.mobilebank.model.map.MapObjectWrapper */
public class MapObjectWrapper {
    private HashMap<String, ArrayList<MapObject>> mapObjectByObjectType = new HashMap<>();
    private List<MapObject> mapObjects;

    public void addMapObjectsByType(String str, ArrayList<MapObject> arrayList) {
        this.mapObjectByObjectType.put(str, arrayList);
    }

    public MapObject getMapObjectByKey(String str) {
        if (getMapObjects() == null) {
            return null;
        }
        for (MapObject next : getMapObjects()) {
            if (str.equals(next.getObjectKey())) {
                return next;
            }
        }
        return null;
    }

    public List<MapObject> getMapObjects() {
        return this.mapObjects;
    }

    public ArrayList<MapObject> getMapObjectsByType(String str) {
        HashMap<String, ArrayList<MapObject>> hashMap = this.mapObjectByObjectType;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mapObjectByObjectType.get(str);
    }

    public void setMapObjects(List<MapObject> list) {
        this.mapObjects = list;
        if (list != null && list.size() > 0) {
            for (String str : C32312j.f79731a) {
                ArrayList arrayList = new ArrayList();
                for (MapObject next : getMapObjects()) {
                    if (next.getObjectType() != null && next.getObjectType().startsWith(str)) {
                        arrayList.add(next);
                    }
                }
                addMapObjectsByType(str, arrayList);
            }
        }
    }
}
