package com.salesforce.marketingcloud.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.salesforce.marketingcloud.C11461g;
import java.util.List;
import p183n7.C7297b;
import p183n7.C7310h;
import p337z7.C9219c;
import p337z7.C9221d;
import p337z7.Task;

/* renamed from: com.salesforce.marketingcloud.location.d */
class C11544d implements C9221d {

    /* renamed from: e */
    static final String f33499e = C11461g.m41875a("GmsLocationProvider");

    /* renamed from: a */
    private final Context f33500a;

    /* renamed from: b */
    volatile boolean f33501b;

    /* renamed from: c */
    int f33502c;

    /* renamed from: d */
    String f33503d;

    /* renamed from: com.salesforce.marketingcloud.location.d$a */
    class C11545a implements C9219c {
        C11545a() {
        }

        public void onComplete(Task task) {
            C11461g.m41891d(C11544d.f33499e, "Location request completed.", new Object[0]);
            C11544d.this.f33501b = false;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.location.d$b */
    class C11546b implements C9219c {
        C11546b() {
        }

        public void onComplete(Task task) {
            C11461g.m41891d(C11544d.f33499e, "Add Geofences request completed.", new Object[0]);
        }
    }

    C11544d(Context context) {
        this.f33500a = context;
        C3846a q = C3846a.m14468q();
        int i = q.mo11872i(context);
        this.f33502c = i;
        this.f33503d = q.mo11871g(i);
        int i2 = this.f33502c;
        if (i2 != 0 && !q.mo11874m(i2)) {
            int i3 = this.f33502c;
            throw new C11549g(i3, q.mo11871g(i3));
        }
    }

    /* renamed from: a */
    private static C7297b m42158a(C11539b bVar) {
        int i = 1;
        if ((bVar.mo30143j() & 1) != 1) {
            i = 0;
        }
        if ((bVar.mo30143j() & 2) == 2) {
            i |= 2;
        }
        if ((bVar.mo30143j() & 4) == 4) {
            i |= 4;
        }
        return new C7297b.C7298a().mo21679d(bVar.mo30138f()).mo21677b(bVar.mo30139g(), bVar.mo30140h(), bVar.mo30142i()).mo21680e(i).mo21678c(-1).mo21676a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo30150b() {
        return this.f33503d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo30151c() {
        return this.f33502c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo30152d() {
        return this.f33502c == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo30153e() {
        synchronized (this) {
            if (this.f33501b) {
                C11461g.m41891d(f33499e, "Location request already being made.", new Object[0]);
                return;
            }
            this.f33501b = true;
            try {
                C7310h.m27978a(this.f33500a).mo13981C(LocationRequest.m17356v().mo13936f0(1).mo13938q0(100), LocationReceiver.m42135c(this.f33500a)).mo24861f(this).mo24858c(new C11545a());
            } catch (SecurityException e) {
                C11461g.m41885b(f33499e, e, "ACCESS_FINE_LOCATION needed to request location.", new Object[0]);
                this.f33501b = false;
                throw e;
            }
        }
    }

    public void onFailure(Exception exc) {
        C11461g.m41885b(f33499e, exc, "LocationServices failure", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30147a() {
        C7310h.m27979b(this.f33500a).mo21682B(LocationReceiver.m42134b(this.f33500a)).mo24861f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30148a(List<String> list) {
        if (list == null || list.size() == 0) {
            C11461g.m41891d(f33499e, "No GeofenceRegions provided", new Object[0]);
        } else {
            C7310h.m27979b(this.f33500a).mo21683C(list).mo24861f(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30149a(C11539b... bVarArr) {
        if (bVarArr == null || bVarArr.length == 0) {
            C11461g.m41891d(f33499e, "No GeofenceRegions provided", new Object[0]);
            return;
        }
        PendingIntent b = LocationReceiver.m42134b(this.f33500a);
        GeofencingRequest.C4524a c = new GeofencingRequest.C4524a().mo13921c(1);
        for (C11539b bVar : bVarArr) {
            C11461g.m41891d(f33499e, "Adding %s to geofence request", bVar.mo30138f());
            c.mo13919a(m42158a(bVar));
        }
        try {
            C7310h.m27979b(this.f33500a).mo21681A(c.mo13920b(), b).mo24861f(this).mo24858c(new C11546b());
        } catch (SecurityException e) {
            C11461g.m41885b(f33499e, e, "ACCESS_FINE_LOCATION needed to request location.", new Object[0]);
            throw e;
        }
    }
}
