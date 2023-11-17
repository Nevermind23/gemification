package p341ge.bog.mobilebank.services.datagathering;

import android.content.Context;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import androidx.concurrent.futures.C0612c;
import androidx.work.WorkerParameters;
import com.google.android.gms.location.C4527a;
import e11.C31645c;
import e11.C31646d;
import e11.C31647e;
import j91.C36773a;
import p183n7.C7310h;
import p262t8.C8421a;
import p337z7.Task;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;
import p341ge.bog.mobilebank.model.datareport.LocationDataReport;
import p341ge.bog.mobilebank.model.datareport.WifiDataReport;

/* renamed from: ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker */
public class LocationWifiDataReportWorker extends BaseDataReportWorker {

    /* renamed from: h */
    private final C4527a f83536h;

    public LocationWifiDataReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f83536h = C7310h.m27978a(context);
    }

    /* renamed from: k */
    private DeviceDataReport m101398k(Location location) {
        LocationDataReport locationDataReport;
        if (location != null) {
            locationDataReport = new LocationDataReport();
            locationDataReport.setAlt(location.getAltitude());
            locationDataReport.setLongitude(location.getLongitude());
            locationDataReport.setLat(location.getLatitude());
        } else {
            locationDataReport = null;
        }
        DeviceDataReport b = new C36773a(getApplicationContext()).mo89653g(m101399l()).mo89652f(locationDataReport).mo89651b();
        Log.d("LocationWifiDataReport", "DataReport: " + b);
        return b;
    }

    /* renamed from: l */
    private WifiDataReport m101399l() {
        try {
            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            WifiDataReport wifiDataReport = new WifiDataReport();
            try {
                wifiDataReport.setMacAddress(connectionInfo.getMacAddress());
                wifiDataReport.setNetworkId(connectionInfo.getNetworkId());
                wifiDataReport.setSsid(connectionInfo.getSSID());
            } catch (Exception unused) {
            }
            return wifiDataReport;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m101400m(C0612c.C0613a aVar, Location location) {
        mo84080e(m101398k(location), "LOCATION_WIFI_DATA_REPORT_JOB", aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m101401n(C0612c.C0613a aVar, Exception exc) {
        mo84080e(m101398k((Location) null), "LOCATION_WIFI_DATA_REPORT_JOB", aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m101402o(C0612c.C0613a aVar) {
        if (mo84079c("android.permission.ACCESS_FINE_LOCATION")) {
            Task A = this.f83536h.mo13979A();
            A.mo24864i(new C31646d(this, aVar));
            A.mo24861f(new C31647e(this, aVar));
        } else {
            mo84080e(m101398k((Location) null), "LOCATION_WIFI_DATA_REPORT_JOB", aVar);
        }
        return null;
    }

    public C8421a startWork() {
        return C0612c.m2367a(new C31645c(this));
    }
}
