package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p189o0.C7357a;

/* renamed from: com.salesforce.marketingcloud.location.h */
class C11550h extends C11548f {

    /* renamed from: q */
    final C11544d f33520q;

    /* renamed from: r */
    final Set<C11547e> f33521r = new ArraySet();

    /* renamed from: s */
    private final Set<C11543c> f33522s = new ArraySet();

    /* renamed from: t */
    private MarketingCloudConfig f33523t;

    /* renamed from: u */
    private int f33524u;

    /* renamed from: v */
    private int f33525v;

    /* renamed from: w */
    private String f33526w;

    /* renamed from: x */
    private int f33527x;

    /* renamed from: y */
    private Context f33528y;

    /* renamed from: z */
    private BroadcastReceiver f33529z;

    /* renamed from: com.salesforce.marketingcloud.location.h$a */
    class C11551a extends BroadcastReceiver {
        C11551a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                r6 = 0
                if (r7 != 0) goto L_0x000d
                java.lang.String r7 = com.salesforce.marketingcloud.location.C11548f.f33510h
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r0 = "Received null intent"
                com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r7, (java.lang.String) r0, (java.lang.Object[]) r6)
                return
            L_0x000d:
                java.lang.String r0 = r7.getAction()
                if (r0 != 0) goto L_0x001d
                java.lang.String r7 = com.salesforce.marketingcloud.location.C11548f.f33510h
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r0 = "Received null action"
                com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r7, (java.lang.String) r0, (java.lang.Object[]) r6)
                return
            L_0x001d:
                int r1 = r0.hashCode()
                r2 = 1
                r3 = -1
                switch(r1) {
                    case -284548713: goto L_0x003e;
                    case 557677285: goto L_0x0033;
                    case 557783927: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                r1 = r3
                goto L_0x0048
            L_0x0028:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.GEOFENCE_EVENT"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L_0x0031
                goto L_0x0026
            L_0x0031:
                r1 = 2
                goto L_0x0048
            L_0x0033:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.GEOFENCE_ERROR"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L_0x003c
                goto L_0x0026
            L_0x003c:
                r1 = r2
                goto L_0x0048
            L_0x003e:
                java.lang.String r1 = "com.salesforce.marketingcloud.location.LOCATION_UPDATE"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L_0x0047
                goto L_0x0026
            L_0x0047:
                r1 = r6
            L_0x0048:
                java.lang.String r4 = "extra_location"
                switch(r1) {
                    case 0: goto L_0x0099;
                    case 1: goto L_0x0083;
                    case 2: goto L_0x0059;
                    default: goto L_0x004d;
                }
            L_0x004d:
                java.lang.String r7 = com.salesforce.marketingcloud.location.C11548f.f33510h
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r6] = r0
                java.lang.String r6 = "Received unknown action: %s"
                com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r7, (java.lang.String) r6, (java.lang.Object[]) r1)
                goto L_0x00ad
            L_0x0059:
                java.lang.String r0 = "extra_transition"
                int r0 = r7.getIntExtra(r0, r3)
                if (r0 != r3) goto L_0x0062
                return
            L_0x0062:
                java.lang.String r1 = com.salesforce.marketingcloud.location.C11548f.f33510h
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r2[r6] = r3
                java.lang.String r6 = "Received geofence transition %d"
                com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r1, (java.lang.String) r6, (java.lang.Object[]) r2)
                com.salesforce.marketingcloud.location.h r6 = com.salesforce.marketingcloud.location.C11550h.this
                java.lang.String r1 = "extra_fence_ids"
                java.util.ArrayList r1 = r7.getStringArrayListExtra(r1)
                android.os.Parcelable r7 = r7.getParcelableExtra(r4)
                android.location.Location r7 = (android.location.Location) r7
                r6.mo30158b(r0, r1, r7)
                goto L_0x00ad
            L_0x0083:
                java.lang.String r6 = "extra_error_code"
                int r6 = r7.getIntExtra(r6, r3)
                java.lang.String r0 = "extra_error_message"
                java.lang.String r7 = r7.getStringExtra(r0)
                if (r6 == r3) goto L_0x00ad
                if (r7 == 0) goto L_0x00ad
                com.salesforce.marketingcloud.location.h r0 = com.salesforce.marketingcloud.location.C11550h.this
                r0.mo30157b(r6, r7)
                goto L_0x00ad
            L_0x0099:
                java.lang.String r0 = com.salesforce.marketingcloud.location.C11548f.f33510h
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r1 = "Received location update."
                com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Object[]) r6)
                com.salesforce.marketingcloud.location.h r6 = com.salesforce.marketingcloud.location.C11550h.this
                android.os.Parcelable r7 = r7.getParcelableExtra(r4)
                android.location.Location r7 = (android.location.Location) r7
                r6.mo30159b((android.location.Location) r7)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.location.C11550h.C11551a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    C11550h(Context context, MarketingCloudConfig marketingCloudConfig) {
        this.f33528y = context;
        this.f33520q = new C11544d(context);
        this.f33523t = marketingCloudConfig;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        this.f33529z = new C11551a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.salesforce.marketingcloud.location.LOCATION_UPDATE");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_EVENT");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_ERROR");
        C7357a.m28044b(this.f33528y).mo21730c(this.f33529z, intentFilter);
        aVar.mo29528a(this.f33520q.mo30151c());
        aVar.mo29530a(this.f33520q.mo30150b());
        aVar.mo29533b(!this.f33520q.mo30152d());
    }

    /* renamed from: b */
    public void mo30128b() {
        this.f33520q.mo30147a();
    }

    public JSONObject componentState() {
        JSONObject a = C11548f.m42172a(this.f33523t, this.f33520q.mo30151c(), this.f33520q.mo30150b());
        try {
            a.put("locationRequests", this.f33524u);
            a.put("locationsReceived", this.f33525v);
            a.put("lastLocationRequester", this.f33526w);
            a.put("geofenceEvents", this.f33527x);
        } catch (JSONException e) {
            C11461g.m41885b(C11548f.f33510h, e, "Error creating state for RealLocationManager.", new Object[0]);
        }
        return a;
    }

    public void tearDown(boolean z) {
        C11544d dVar = this.f33520q;
        if (dVar != null && z) {
            dVar.mo30147a();
        }
        Context context = this.f33528y;
        if (context != null && this.f33529z != null) {
            C7357a.m28044b(context).mo21732e(this.f33529z);
        }
    }

    C11550h(Context context, C11544d dVar) {
        this.f33528y = context;
        this.f33520q = dVar;
    }

    /* renamed from: a */
    public void mo30124a(C11543c cVar) {
        C11461g.m41891d(C11548f.f33510h, "registerForGeofenceRegionEvents(%s)", cVar.getClass().getName());
        synchronized (this.f33522s) {
            this.f33522s.add(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30157b(int i, String str) {
        synchronized (this.f33522s) {
            if (!this.f33522s.isEmpty()) {
                for (C11543c next : this.f33522s) {
                    if (next != null) {
                        next.mo30145a(i, str);
                    }
                }
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public void mo30125a(C11547e eVar) {
        boolean z;
        if (eVar != null) {
            synchronized (this.f33521r) {
                z = this.f33521r.add(eVar) && this.f33521r.size() == 1;
            }
            if (z) {
                this.f33524u++;
                this.f33526w = eVar.getClass().getName();
                this.f33520q.mo30153e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30158b(int i, List<String> list, Location location) {
        String str = C11548f.f33510h;
        C11461g.m41891d(str, "onGeofenceRegionEvent", new Object[0]);
        if (list == null || list.isEmpty()) {
            C11461g.m41888c(str, "No fenceIds were provided.", new Object[0]);
            return;
        }
        this.f33527x++;
        synchronized (this.f33522s) {
            if (!this.f33522s.isEmpty()) {
                for (C11543c next : this.f33522s) {
                    if (next != null) {
                        for (String next2 : list) {
                            C11461g.m41880a(C11548f.f33510h, "Notifiying %s of geofence [%s] region event [d]", next.getClass().getName(), next2, Integer.valueOf(i));
                            next.mo30146a(next2, i, location);
                        }
                    }
                }
            } else {
                C11461g.m41888c(str, "Geofence region event occured with no one listening.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo30126a(List<String> list) {
        if (list == null || list.size() == 0) {
            C11461g.m41888c(C11548f.f33510h, "unmonitorGeofences - No geofenceRegionIds provided.", new Object[0]);
        } else {
            this.f33520q.mo30148a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30159b(Location location) {
        if (location != null) {
            this.f33525v++;
            synchronized (this.f33521r) {
                if (!this.f33521r.isEmpty()) {
                    for (C11547e next : this.f33521r) {
                        if (next != null) {
                            next.mo30154a(location);
                        }
                    }
                    this.f33521r.clear();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo30127a(C11539b... bVarArr) {
        if (bVarArr == null || bVarArr.length == 0) {
            C11461g.m41880a(C11548f.f33510h, "monitorGeofences - No geofenceRegions provided.", new Object[0]);
            return;
        }
        C11461g.m41891d(C11548f.f33510h, "Monitoring %s fence(s).", Integer.valueOf(bVarArr.length));
        this.f33520q.mo30149a(bVarArr);
    }

    /* renamed from: b */
    public void mo30129b(C11543c cVar) {
        if (cVar != null) {
            synchronized (this.f33522s) {
                this.f33522s.remove(cVar);
            }
        }
    }

    /* renamed from: a */
    public boolean mo30155a() {
        return this.f33520q.mo30152d();
    }

    /* renamed from: b */
    public void mo30130b(C11547e eVar) {
        synchronized (this.f33521r) {
            this.f33521r.remove(eVar);
        }
    }
}
