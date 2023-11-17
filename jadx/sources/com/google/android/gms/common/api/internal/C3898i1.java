package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3860c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p156l6.C6940f;
import p156l6.C6942g;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
public final class C3898i1 extends C3910m1 {

    /* renamed from: i */
    private final SparseArray f12440i = new SparseArray();

    private C3898i1(C6942g gVar) {
        super(gVar, C3846a.m14468q());
        this.f12316d.mo21087i("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C3898i1 m14769t(C6940f fVar) {
        C6942g d = LifecycleCallback.m14578d(fVar);
        C3898i1 i1Var = (C3898i1) d.mo21086H("AutoManageHelper", C3898i1.class);
        if (i1Var != null) {
            return i1Var;
        }
        return new C3898i1(d);
    }

    /* renamed from: w */
    private final C3895h1 m14770w(int i) {
        if (this.f12440i.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f12440i;
        return (C3895h1) sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo11982a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f12440i.size(); i++) {
            C3895h1 w = m14770w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f12434b);
                printWriter.println(":");
                w.f12435c.mo11953f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo11989j() {
        super.mo11989j();
        boolean z = this.f12486e;
        String valueOf = String.valueOf(this.f12440i);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f12487f.get() == null) {
            for (int i = 0; i < this.f12440i.size(); i++) {
                C3895h1 w = m14770w(i);
                if (w != null) {
                    w.f12435c.mo11951d();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo11990k() {
        super.mo11990k();
        for (int i = 0; i < this.f12440i.size(); i++) {
            C3895h1 w = m14770w(i);
            if (w != null) {
                w.f12435c.mo11952e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo12088m(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C3895h1 h1Var = (C3895h1) this.f12440i.get(i);
        if (h1Var != null) {
            mo12091v(i);
            C3860c.C3863c cVar = h1Var.f12436d;
            if (cVar != null) {
                cVar.mo12084y(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo12089n() {
        for (int i = 0; i < this.f12440i.size(); i++) {
            C3895h1 w = m14770w(i);
            if (w != null) {
                w.f12435c.mo11951d();
            }
        }
    }

    /* renamed from: u */
    public final void mo12090u(int i, C3860c cVar, C3860c.C3863c cVar2) {
        boolean z;
        C7264i.m27903l(cVar, "GoogleApiClient instance cannot be null");
        if (this.f12440i.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C7264i.m27906o(z, sb.toString());
        C3901j1 j1Var = (C3901j1) this.f12487f.get();
        boolean z2 = this.f12486e;
        String valueOf = String.valueOf(j1Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        C3895h1 h1Var = new C3895h1(this, i, cVar, cVar2);
        cVar.mo11959m(h1Var);
        this.f12440i.put(i, h1Var);
        if (this.f12486e && j1Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(cVar.toString()));
            cVar.mo11951d();
        }
    }

    /* renamed from: v */
    public final void mo12091v(int i) {
        C3895h1 h1Var = (C3895h1) this.f12440i.get(i);
        this.f12440i.remove(i);
        if (h1Var != null) {
            h1Var.f12435c.mo11960n(h1Var);
            h1Var.f12435c.mo11952e();
        }
    }
}
