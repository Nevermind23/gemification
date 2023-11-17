package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import p196o7.C7474d;
import p196o7.C7476e;
import p209p7.C7733c;
import p209p7.C7756u;
import p299w6.C8858a;
import p299w6.C8862d;
import p299w6.C8863e;

/* renamed from: com.google.android.gms.maps.e */
final class C4554e extends C8858a {

    /* renamed from: e */
    private final Fragment f14032e;

    /* renamed from: f */
    protected C8863e f14033f;

    /* renamed from: g */
    private Activity f14034g;

    /* renamed from: h */
    private final List f14035h = new ArrayList();

    C4554e(Fragment fragment) {
        this.f14032e = fragment;
    }

    /* renamed from: v */
    static /* synthetic */ void m17440v(C4554e eVar, Activity activity) {
        eVar.f14034g = activity;
        eVar.mo14083x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14081a(C8863e eVar) {
        this.f14033f = eVar;
        mo14083x();
    }

    /* renamed from: w */
    public final void mo14082w(C7476e eVar) {
        if (mo24279b() != null) {
            ((C4553d) mo24279b()).mo14072c(eVar);
        } else {
            this.f14035h.add(eVar);
        }
    }

    /* renamed from: x */
    public final void mo14083x() {
        if (this.f14034g != null && this.f14033f != null && mo24279b() == null) {
            try {
                C7474d.m28433a(this.f14034g);
                C7733c h1 = C7756u.m29412a(this.f14034g, (C7474d.C7475a) null).mo22517h1(C8862d.m32984T1(this.f14034g));
                if (h1 != null) {
                    this.f14033f.mo24292a(new C4553d(this.f14032e, h1));
                    for (C7476e c : this.f14035h) {
                        ((C4553d) mo24279b()).mo14072c(c);
                    }
                    this.f14035h.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
