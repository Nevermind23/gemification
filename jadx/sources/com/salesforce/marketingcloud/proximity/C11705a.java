package com.salesforce.marketingcloud.proximity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.MonitorNotifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.powersave.BackgroundPowerSaver;
import p189o0.C7357a;

/* renamed from: com.salesforce.marketingcloud.proximity.a */
class C11705a implements BeaconConsumer, MonitorNotifier {

    /* renamed from: j */
    static final String f33931j = "m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24";

    /* renamed from: a */
    final Map<String, Region> f33932a = new ArrayMap();

    /* renamed from: b */
    private final BeaconManager f33933b;

    /* renamed from: c */
    private final Context f33934c;

    /* renamed from: d */
    private final List<C11709c> f33935d = new ArrayList();

    /* renamed from: e */
    final C7357a f33936e;

    /* renamed from: f */
    private boolean f33937f;

    /* renamed from: g */
    private boolean f33938g;

    /* renamed from: h */
    private BackgroundPowerSaver f33939h;

    /* renamed from: i */
    private Intent f33940i;

    /* renamed from: com.salesforce.marketingcloud.proximity.a$a */
    class C11706a implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a */
        final /* synthetic */ Intent f33941a;

        C11706a(Intent intent) {
            this.f33941a = intent;
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            C11705a.this.f33936e.mo21731d(this.f33941a);
        }
    }

    C11705a(Context context) {
        this.f33934c = context;
        this.f33936e = C7357a.m28044b(context);
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context);
        this.f33933b = instanceForApplication;
        instanceForApplication.setEnableScheduledScanJobs(true);
        instanceForApplication.getBeaconParsers().add(new BeaconParser("iBeacon").setBeaconLayout(f33931j));
        instanceForApplication.setBackgroundScanPeriod(5000);
        instanceForApplication.setBackgroundBetweenScanPeriod(10000);
        instanceForApplication.addMonitorNotifier(this);
    }

    /* renamed from: a */
    private static C11709c m42689a(Region region) {
        try {
            return new C11709c(region.getUniqueId(), region.getId1().toString(), region.getId2().toInt(), region.getId3().toInt());
        } catch (Exception e) {
            C11461g.m41885b(C11712e.f33960h, e, "Unable to convert Region to BeaconRegion", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    private void m42692b() {
        this.f33938g = true;
        this.f33933b.bind(this);
        C11461g.m41880a(C11712e.f33960h, "Waiting for BeaconService connection", new Object[0]);
    }

    /* renamed from: c */
    private void m42694c() {
        C11461g.m41891d(C11712e.f33960h, "monitorNewRegions", new Object[0]);
        List<C11709c> list = this.f33935d;
        if (list != null && !list.isEmpty()) {
            for (C11709c next : this.f33935d) {
                try {
                    if (!this.f33932a.containsKey(next.mo30993f())) {
                        Region a = m42690a(next);
                        this.f33932a.put(next.mo30993f(), a);
                        C11461g.m41891d(C11712e.f33960h, "Now monitoring [%s]", next.toString());
                        this.f33933b.startMonitoringBeaconsInRegion(a);
                    } else {
                        C11461g.m41891d(C11712e.f33960h, "Region [%s] already monitored by SDK", next);
                    }
                } catch (RemoteException e) {
                    C11461g.m41885b(C11712e.f33960h, e, "Unable to monitor region [%s]", next.toString());
                }
            }
            this.f33935d.clear();
        }
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        this.f33940i = intent;
        this.f33934c.startService(intent);
        return this.f33934c.bindService(intent, serviceConnection, i);
    }

    /* renamed from: d */
    public void mo30969d() {
        C11461g.m41880a(C11712e.f33960h, "stopMonitoring()", new Object[0]);
        synchronized (this.f33935d) {
            if (this.f33937f) {
                m42691a();
                this.f33933b.unbind(this);
                this.f33933b.removeMonitorNotifier(this);
                if (this.f33939h != null) {
                    ((Application) this.f33934c.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f33939h);
                }
                this.f33937f = false;
            } else {
                this.f33935d.clear();
            }
        }
    }

    public void didDetermineStateForRegion(int i, Region region) {
        String str = C11712e.f33960h;
        C11461g.m41891d(str, "didDetermineStateForRegion(%d, %s)", Integer.valueOf(i), region);
        if (MarketingCloudSdk.isReady() || MarketingCloudSdk.isInitializing()) {
            Intent putExtra = new Intent(i == 1 ? C11712e.f33956d : C11712e.f33957e).putExtra(C11712e.f33958f, m42689a(region));
            if (MarketingCloudSdk.isReady()) {
                this.f33936e.mo21731d(putExtra);
            } else {
                MarketingCloudSdk.requestSdk(new C11706a(putExtra));
            }
        } else {
            C11461g.m41894e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
        }
    }

    public void didEnterRegion(Region region) {
        C11461g.m41891d(C11712e.f33960h, "didEnterRegion(%s)", region);
    }

    public void didExitRegion(Region region) {
        C11461g.m41891d(C11712e.f33960h, "didExitRegion(%s)", region);
    }

    public Context getApplicationContext() {
        return this.f33934c;
    }

    public void onBeaconServiceConnect() {
        C11461g.m41880a(C11712e.f33960h, "onBeaconServiceConnect", new Object[0]);
        synchronized (this.f33935d) {
            this.f33939h = new BackgroundPowerSaver(this.f33934c);
            this.f33933b.addMonitorNotifier(this);
            this.f33937f = true;
            this.f33938g = false;
            m42694c();
        }
    }

    public void unbindService(ServiceConnection serviceConnection) {
        this.f33934c.unbindService(serviceConnection);
        this.f33934c.stopService(this.f33940i);
        this.f33937f = false;
        this.f33938g = false;
    }

    /* renamed from: a */
    static Region m42690a(C11709c cVar) {
        return new Region(cVar.mo30993f(), Identifier.fromUuid(UUID.fromString(cVar.mo30991e())), Identifier.fromInt(cVar.mo30994g()), Identifier.fromInt(cVar.mo30995h()));
    }

    /* renamed from: b */
    public void mo30967b(List<C11709c> list) {
        C11461g.m41880a(C11712e.f33960h, "unmonitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        if (!list.isEmpty()) {
            for (C11709c next : list) {
                this.f33932a.remove(next.mo30993f());
                m42693b(m42690a(next));
            }
        }
    }

    /* renamed from: a */
    private void m42691a() {
        String str = C11712e.f33960h;
        C11461g.m41891d(str, "clearAllMonitoredRegions", new Object[0]);
        if (!this.f33932a.isEmpty()) {
            C11461g.m41891d(str, "Stop monitoring %d BeaconRegions", Integer.valueOf(this.f33932a.size()));
            for (Region next : this.f33932a.values()) {
                if (next != null) {
                    m42693b(next);
                }
            }
            this.f33932a.clear();
        }
    }

    /* renamed from: b */
    private void m42693b(Region region) {
        try {
            this.f33933b.stopMonitoringBeaconsInRegion(region);
        } catch (Exception e) {
            C11461g.m41881a(C11712e.f33960h, (Throwable) e, "Failed to stop monitoring %s", region);
        }
    }

    /* renamed from: a */
    public void mo30966a(List<C11709c> list) {
        String str = C11712e.f33960h;
        C11461g.m41880a(str, "monitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        if (!list.isEmpty()) {
            synchronized (this.f33935d) {
                this.f33935d.clear();
                this.f33935d.addAll(list);
                if (this.f33937f) {
                    m42694c();
                } else {
                    C11461g.m41891d(str, "Not yet connected.  Will register Beacons once complete.", new Object[0]);
                    if (!this.f33938g) {
                        m42692b();
                    }
                }
            }
        }
    }
}
