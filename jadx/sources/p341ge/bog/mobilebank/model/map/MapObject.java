package p341ge.bog.mobilebank.model.map;

import com.google.android.gms.maps.model.LatLng;
import n41.C37353c;
import n81.C37363a;
import p277ua.C8662a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: ge.bog.mobilebank.model.map.MapObject */
public class MapObject {
    @C8662a
    private String addressEn;
    @C8662a
    private String addressGe;
    @C8662a
    private double altitude;
    @C8662a
    private String cityEn;
    @C8662a
    private String cityGe;
    @C8662a
    private long cityId;
    private MapObjectDetail details;
    @C8662a
    private String distance;
    @C8662a
    private String isAdapted;
    @C8662a
    private double latitude;
    @C8662a
    private double longitude;
    private C37363a marker;
    @C8662a
    private String nameEn;
    @C8662a
    private String nameGe;
    @C8662a
    private String nearbyEn;
    @C8662a
    private String nearbyGe;
    @C8662a
    private String objectKey;
    @C8662a
    private String objectName;
    @C8662a
    private String objectSubType;
    @C8662a
    private String objectType;
    @C8662a
    private String time;
    @C8662a
    private String worksFullTime;

    public String getAddress() {
        if (PreferencesApiManager.getInstance().getLanguage() == C37353c.EN) {
            return this.addressEn;
        }
        return this.addressGe;
    }

    public String getCity() {
        if (PreferencesApiManager.getInstance().getLanguage() == C37353c.EN) {
            return this.cityEn;
        }
        return this.cityGe;
    }

    public long getCityId() {
        return this.cityId;
    }

    public C37363a getClusterItem() {
        return this.marker;
    }

    public MapObjectDetail getDetails() {
        return this.details;
    }

    public String getDistance() {
        return this.distance;
    }

    public LatLng getLatLng() {
        return new LatLng(this.latitude, this.longitude);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getName() {
        if (PreferencesApiManager.getInstance().getLanguage() == C37353c.EN) {
            return this.nameEn;
        }
        return this.nameGe;
    }

    public String getNearby() {
        if (PreferencesApiManager.getInstance().getLanguage() == C37353c.EN) {
            return this.nearbyEn;
        }
        return this.nearbyGe;
    }

    public String getObject() {
        return getObjectType();
    }

    public String getObjectKey() {
        return this.objectKey;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getObjectSubType() {
        return this.objectSubType;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public String getTime() {
        return this.time;
    }

    public String getType() {
        return getObjectSubType();
    }

    public boolean getWorksFullTime() {
        return "Y".equals(this.worksFullTime);
    }

    public boolean isAdapted() {
        return "Y".equals(this.isAdapted);
    }

    public boolean isEuroAtm() {
        return this.objectType.equals("ATM_EUR");
    }

    public void setClusterItem(C37363a aVar) {
        this.marker = aVar;
    }

    public void setDetails(MapObjectDetail mapObjectDetail) {
        this.details = mapObjectDetail;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
