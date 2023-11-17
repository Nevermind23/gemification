package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p182n6.C7264i;
import p196o7.C7476e;
import p209p7.C7733c;
import p209p7.C7755t;
import p299w6.C8859b;
import p299w6.C8861c;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.maps.d */
final class C4553d implements C8861c {

    /* renamed from: a */
    private final Fragment f14030a;

    /* renamed from: b */
    private final C7733c f14031b;

    public C4553d(Fragment fragment, C7733c cVar) {
        this.f14031b = (C7733c) C7264i.m27902k(cVar);
        this.f14030a = (Fragment) C7264i.m27902k(fragment);
    }

    /* renamed from: N */
    public final void mo14069N() {
        try {
            this.f14031b.mo22479N();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo14070a(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            C7755t.m29409b(bundle2, bundle3);
            this.f14031b.mo22480W(C8862d.m32984T1(activity), googleMapOptions, bundle3);
            C7755t.m29409b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final View mo14071b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            Bundle bundle2 = new Bundle();
            C7755t.m29409b(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            C8859b b2 = this.f14031b.mo22481b2(C8862d.m32984T1(layoutInflater), C8862d.m32984T1(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            C7755t.m29409b(bundle2, bundle);
            return (View) C8862d.m32985y(b2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo14072c(C7476e eVar) {
        try {
            this.f14031b.mo22478G1(new C4552c(this, eVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void mo14073f() {
        try {
            this.f14031b.mo22482f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo14074i() {
        try {
            this.f14031b.mo22483i();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final void mo14075j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C7755t.m29409b(bundle, bundle2);
            Bundle arguments = this.f14030a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C7755t.m29410c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f14031b.mo22484j(bundle2);
            C7755t.m29409b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public final void mo14076n() {
        try {
            this.f14031b.mo22485n();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public final void mo14077o() {
        try {
            this.f14031b.mo22486o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onDestroy() {
        try {
            this.f14031b.onDestroy();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f14031b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public final void mo14080p(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C7755t.m29409b(bundle, bundle2);
            this.f14031b.mo22489p(bundle2);
            C7755t.m29409b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
