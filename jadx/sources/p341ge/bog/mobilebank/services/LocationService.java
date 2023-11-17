package p341ge.bog.mobilebank.services;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C4527a;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.firebase.crashlytics.C5263a;
import d11.C31514a;
import d11.C31515b;
import g91.C32359z0;
import iu0.C36546y;
import java.util.Iterator;
import jg1.C41438c;
import p183n7.C7308g;
import p183n7.C7310h;
import p337z7.Task;
import p341ge.bog.mobilebank.eventbus.event.LocationChangedEvent;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p530nf.C16919b;

/* renamed from: ge.bog.mobilebank.services.LocationService */
public class LocationService implements C3860c.C3862b, C3860c.C3863c {

    /* renamed from: b */
    protected C3860c f83517b;

    /* renamed from: c */
    protected LocationRequest f83518c;

    /* renamed from: d */
    private C4527a f83519d;

    /* renamed from: e */
    private C7308g f83520e = new C34562a();

    /* renamed from: f */
    private Context f83521f;

    /* renamed from: g */
    protected C41438c f83522g;

    /* renamed from: h */
    protected PreferencesApiManager f83523h;

    /* renamed from: ge.bog.mobilebank.services.LocationService$a */
    class C34562a extends C7308g {
        C34562a() {
        }

        /* renamed from: b */
        public void mo21694b(LocationResult locationResult) {
            if (locationResult != null) {
                Iterator it = locationResult.mo13948x().iterator();
                if (it.hasNext()) {
                    LocationService.this.f83522g.mo96184m(new LocationChangedEvent((Location) it.next()));
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.services.LocationService$b */
    interface C34563b {
        /* renamed from: a */
        PreferencesApiManager mo32851a();

        /* renamed from: b */
        C41438c mo32852b();
    }

    public LocationService(Context context) {
        C34563b bVar = (C34563b) C16919b.m59518a(context.getApplicationContext(), C34563b.class);
        this.f83522g = bVar.mo32852b();
        this.f83523h = bVar.mo32851a();
        this.f83521f = context;
        mo84073c();
        this.f83517b.mo11951d();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m101373e(Exception exc) {
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).mo11893c(C36546y.m108285N().mo89314L(), 10014);
            } catch (Exception e) {
                C5263a.m20766a().mo17444d(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m101374f(Task task) {
        if (task.mo24869n() != null) {
            this.f83522g.mo96184m(new LocationChangedEvent((Location) task.mo24869n()));
        }
        this.f83519d.mo13982D(this.f83518c, this.f83520e, (Looper) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo84073c() {
        this.f83517b = new C3860c.C3861a(this.f83521f).mo11962b(this).mo11963c(this).mo11961a(C7310h.f21507a).mo11964d();
        mo84074d();
        if (C36546y.m108285N() != null && C36546y.m108285N().mo89314L() != null) {
            C7310h.m27980c(this.f83521f).mo21699A(new LocationSettingsRequest.C4526a().mo13950a(this.f83518c).mo13951b()).mo24859d(C36546y.m108285N().mo89314L(), new C31514a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo84074d() {
        LocationRequest locationRequest = new LocationRequest();
        this.f83518c = locationRequest;
        locationRequest.mo13934R(5000);
        this.f83518c.mo13942x(2500);
        this.f83518c.mo13938q0(100);
    }

    /* renamed from: g */
    public void mo84075g() {
        C4527a aVar = this.f83519d;
        if (aVar != null) {
            aVar.mo13980B(this.f83520e);
        }
        C3860c cVar = this.f83517b;
        if (cVar != null && cVar.mo11956j()) {
            this.f83517b.mo11952e();
        }
    }

    /* renamed from: k */
    public void mo12102k(Bundle bundle) {
        C32359z0.m95575j0("On Location Service Connected");
        C4527a a = C7310h.m27978a(C36546y.m108285N());
        this.f83519d = a;
        a.mo13979A().mo24858c(new C31515b(this));
    }

    /* renamed from: x */
    public void mo12107x(int i) {
    }

    /* renamed from: y */
    public void mo12084y(ConnectionResult connectionResult) {
    }
}
