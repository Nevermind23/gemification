package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C3877d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p156l6.C6931b;
import p156l6.C6934c0;
import p156l6.C6949j0;
import p156l6.C6955m0;
import p156l6.C6969u;
import p156l6.C6974z;
import p182n6.C7258g;
import p182n6.C7264i;
import p208p6.C7728e;
import p260t6.C8400b;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
public final class C3918p0 implements C3860c.C3862b, C3860c.C3863c, C6955m0 {

    /* renamed from: b */
    private final Queue f12497b = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3847a.C3855f f12498c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6931b f12499d;

    /* renamed from: e */
    private final C3908m f12500e;

    /* renamed from: f */
    private final Set f12501f = new HashSet();

    /* renamed from: g */
    private final Map f12502g = new HashMap();

    /* renamed from: h */
    private final int f12503h;

    /* renamed from: i */
    private final C6949j0 f12504i;

    /* renamed from: j */
    private boolean f12505j;

    /* renamed from: k */
    private final List f12506k = new ArrayList();

    /* renamed from: l */
    private ConnectionResult f12507l = null;

    /* renamed from: m */
    private int f12508m = 0;

    /* renamed from: n */
    final /* synthetic */ C3874c f12509n;

    public C3918p0(C3874c cVar, C3857b bVar) {
        this.f12509n = cVar;
        C3847a.C3855f w = bVar.mo11947w(cVar.f12369p.getLooper(), this);
        this.f12498c = w;
        this.f12499d = bVar.mo11942r();
        this.f12500e = new C3908m();
        this.f12503h = bVar.mo11946v();
        if (w.mo7052k()) {
            this.f12504i = bVar.mo11948x(cVar.f12360g, cVar.f12369p);
        } else {
            this.f12504i = null;
        }
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m14858A(C3918p0 p0Var, C3921q0 q0Var) {
        if (!p0Var.f12506k.contains(q0Var) || p0Var.f12505j) {
            return;
        }
        if (!p0Var.f12498c.mo11919c()) {
            p0Var.mo12128D();
        } else {
            p0Var.m14864f();
        }
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m14859B(C3918p0 p0Var, C3921q0 q0Var) {
        Feature[] g;
        if (p0Var.f12506k.remove(q0Var)) {
            p0Var.f12509n.f12369p.removeMessages(15, q0Var);
            p0Var.f12509n.f12369p.removeMessages(16, q0Var);
            Feature a = q0Var.f12514b;
            ArrayList arrayList = new ArrayList(p0Var.f12497b.size());
            for (C3891g1 g1Var : p0Var.f12497b) {
                if ((g1Var instanceof C6974z) && (g = ((C6974z) g1Var).mo12052g(p0Var)) != null && C8400b.m31526b(g, a)) {
                    arrayList.add(g1Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3891g1 g1Var2 = (C3891g1) arrayList.get(i);
                p0Var.f12497b.remove(g1Var2);
                g1Var2.mo12038b(new UnsupportedApiCallException(a));
            }
        }
    }

    /* renamed from: b */
    private final Feature m14860b(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] r = this.f12498c.mo11930r();
            if (r == null) {
                r = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(r3);
            for (Feature feature : r) {
                arrayMap.put(feature.mo11865v(), Long.valueOf(feature.mo11866w()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.mo11865v());
                if (l == null || l.longValue() < feature2.mo11866w()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m14861c(ConnectionResult connectionResult) {
        Iterator it = this.f12501f.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            if (C7258g.m27880a(connectionResult, ConnectionResult.f12230h)) {
                this.f12498c.mo11923g();
            }
            throw null;
        }
        this.f12501f.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m14862d(Status status) {
        C7264i.m27895d(this.f12509n.f12369p);
        m14863e(status, (Exception) null, false);
    }

    /* renamed from: e */
    private final void m14863e(Status status, Exception exc, boolean z) {
        boolean z2;
        C7264i.m27895d(this.f12509n.f12369p);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.f12497b.iterator();
            while (it.hasNext()) {
                C3891g1 g1Var = (C3891g1) it.next();
                if (!z || g1Var.f12425a == 2) {
                    if (status != null) {
                        g1Var.mo12037a(status);
                    } else {
                        g1Var.mo12038b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m14864f() {
        ArrayList arrayList = new ArrayList(this.f12497b);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3891g1 g1Var = (C3891g1) arrayList.get(i);
            if (this.f12498c.mo11919c()) {
                if (m14870m(g1Var)) {
                    this.f12497b.remove(g1Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m14865g() {
        mo12127C();
        m14861c(ConnectionResult.f12230h);
        m14869l();
        Iterator it = this.f12502g.values().iterator();
        while (it.hasNext()) {
            C6934c0 c0Var = (C6934c0) it.next();
            if (m14860b(c0Var.f20810a.mo12058c()) != null) {
                it.remove();
            } else {
                try {
                    c0Var.f20810a.mo12059d(this.f12498c, new C9227g());
                } catch (DeadObjectException unused) {
                    mo12107x(3);
                    this.f12498c.mo11921e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m14864f();
        m14867i();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14866h(int i) {
        mo12127C();
        this.f12505j = true;
        this.f12500e.mo12116e(i, this.f12498c.mo11931t());
        C3874c cVar = this.f12509n;
        cVar.f12369p.sendMessageDelayed(Message.obtain(cVar.f12369p, 9, this.f12499d), this.f12509n.f12354a);
        C3874c cVar2 = this.f12509n;
        cVar2.f12369p.sendMessageDelayed(Message.obtain(cVar2.f12369p, 11, this.f12499d), this.f12509n.f12355b);
        this.f12509n.f12362i.mo21673c();
        for (C6934c0 c0Var : this.f12502g.values()) {
            c0Var.f20812c.run();
        }
    }

    /* renamed from: i */
    private final void m14867i() {
        this.f12509n.f12369p.removeMessages(12, this.f12499d);
        C3874c cVar = this.f12509n;
        cVar.f12369p.sendMessageDelayed(cVar.f12369p.obtainMessage(12, this.f12499d), this.f12509n.f12356c);
    }

    /* renamed from: j */
    private final void m14868j(C3891g1 g1Var) {
        g1Var.mo12040d(this.f12500e, mo12136L());
        try {
            g1Var.mo12039c(this);
        } catch (DeadObjectException unused) {
            mo12107x(1);
            this.f12498c.mo11921e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: l */
    private final void m14869l() {
        if (this.f12505j) {
            this.f12509n.f12369p.removeMessages(11, this.f12499d);
            this.f12509n.f12369p.removeMessages(9, this.f12499d);
            this.f12505j = false;
        }
    }

    /* renamed from: m */
    private final boolean m14870m(C3891g1 g1Var) {
        if (!(g1Var instanceof C6974z)) {
            m14868j(g1Var);
            return true;
        }
        C6974z zVar = (C6974z) g1Var;
        Feature b = m14860b(zVar.mo12052g(this));
        if (b == null) {
            m14868j(g1Var);
            return true;
        }
        String name = this.f12498c.getClass().getName();
        String v = b.mo11865v();
        long w = b.mo11866w();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(v).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(v);
        sb.append(", ");
        sb.append(w);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f12509n.f12370q || !zVar.mo12051f(this)) {
            zVar.mo12038b(new UnsupportedApiCallException(b));
            return true;
        }
        C3921q0 q0Var = new C3921q0(this.f12499d, b, (C6969u) null);
        int indexOf = this.f12506k.indexOf(q0Var);
        if (indexOf >= 0) {
            C3921q0 q0Var2 = (C3921q0) this.f12506k.get(indexOf);
            this.f12509n.f12369p.removeMessages(15, q0Var2);
            C3874c cVar = this.f12509n;
            cVar.f12369p.sendMessageDelayed(Message.obtain(cVar.f12369p, 15, q0Var2), this.f12509n.f12354a);
            return false;
        }
        this.f12506k.add(q0Var);
        C3874c cVar2 = this.f12509n;
        cVar2.f12369p.sendMessageDelayed(Message.obtain(cVar2.f12369p, 15, q0Var), this.f12509n.f12354a);
        C3874c cVar3 = this.f12509n;
        cVar3.f12369p.sendMessageDelayed(Message.obtain(cVar3.f12369p, 16, q0Var), this.f12509n.f12355b);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m14871n(connectionResult)) {
            return false;
        }
        this.f12509n.mo12033h(connectionResult, this.f12503h);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14871n(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C3874c.f12352t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.c r1 = r3.f12509n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.n r2 = r1.f12366m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f12367n     // Catch:{ all -> 0x002a }
            l6.b r2 = r3.f12499d     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.c r1 = r3.f12509n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.n r1 = r1.f12366m     // Catch:{ all -> 0x002a }
            int r2 = r3.f12503h     // Catch:{ all -> 0x002a }
            r1.mo12121s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3918p0.m14871n(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* renamed from: o */
    private final boolean m14872o(boolean z) {
        C7264i.m27895d(this.f12509n.f12369p);
        if (!this.f12498c.mo11919c() || this.f12502g.size() != 0) {
            return false;
        }
        if (this.f12500e.mo12118g()) {
            if (z) {
                m14867i();
            }
            return false;
        }
        this.f12498c.mo11921e("Timing out service connection.");
        return true;
    }

    /* renamed from: C */
    public final void mo12127C() {
        C7264i.m27895d(this.f12509n.f12369p);
        this.f12507l = null;
    }

    /* renamed from: D */
    public final void mo12128D() {
        C7264i.m27895d(this.f12509n.f12369p);
        if (!this.f12498c.mo11919c() && !this.f12498c.mo11922f()) {
            try {
                C3874c cVar = this.f12509n;
                int b = cVar.f12362i.mo21672b(cVar.f12360g, this.f12498c);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f12498c.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    mo12131G(connectionResult, (Exception) null);
                    return;
                }
                C3874c cVar2 = this.f12509n;
                C3847a.C3855f fVar = this.f12498c;
                C3926s0 s0Var = new C3926s0(cVar2, fVar, this.f12499d);
                if (fVar.mo7052k()) {
                    ((C6949j0) C7264i.m27902k(this.f12504i)).mo21091D2(s0Var);
                }
                try {
                    this.f12498c.mo11924h(s0Var);
                } catch (SecurityException e) {
                    mo12131G(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo12131G(new ConnectionResult(10), e2);
            }
        }
    }

    /* renamed from: E */
    public final void mo12129E(C3891g1 g1Var) {
        C7264i.m27895d(this.f12509n.f12369p);
        if (!this.f12498c.mo11919c()) {
            this.f12497b.add(g1Var);
            ConnectionResult connectionResult = this.f12507l;
            if (connectionResult == null || !connectionResult.mo11853R()) {
                mo12128D();
            } else {
                mo12131G(this.f12507l, (Exception) null);
            }
        } else if (m14870m(g1Var)) {
            m14867i();
        } else {
            this.f12497b.add(g1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo12130F() {
        this.f12508m++;
    }

    /* renamed from: G */
    public final void mo12131G(ConnectionResult connectionResult, Exception exc) {
        C7264i.m27895d(this.f12509n.f12369p);
        C6949j0 j0Var = this.f12504i;
        if (j0Var != null) {
            j0Var.mo21092E2();
        }
        mo12127C();
        this.f12509n.f12362i.mo21673c();
        m14861c(connectionResult);
        if ((this.f12498c instanceof C7728e) && connectionResult.mo11858v() != 24) {
            this.f12509n.f12357d = true;
            C3874c cVar = this.f12509n;
            cVar.f12369p.sendMessageDelayed(cVar.f12369p.obtainMessage(19), 300000);
        }
        if (connectionResult.mo11858v() == 4) {
            m14862d(C3874c.f12351s);
        } else if (this.f12497b.isEmpty()) {
            this.f12507l = connectionResult;
        } else if (exc != null) {
            C7264i.m27895d(this.f12509n.f12369p);
            m14863e((Status) null, exc, false);
        } else if (this.f12509n.f12370q) {
            m14863e(C3874c.m14646i(this.f12499d, connectionResult), (Exception) null, true);
            if (!this.f12497b.isEmpty() && !m14871n(connectionResult) && !this.f12509n.mo12033h(connectionResult, this.f12503h)) {
                if (connectionResult.mo11858v() == 18) {
                    this.f12505j = true;
                }
                if (this.f12505j) {
                    C3874c cVar2 = this.f12509n;
                    cVar2.f12369p.sendMessageDelayed(Message.obtain(cVar2.f12369p, 9, this.f12499d), this.f12509n.f12354a);
                    return;
                }
                m14862d(C3874c.m14646i(this.f12499d, connectionResult));
            }
        } else {
            m14862d(C3874c.m14646i(this.f12499d, connectionResult));
        }
    }

    /* renamed from: H */
    public final void mo12132H(ConnectionResult connectionResult) {
        C7264i.m27895d(this.f12509n.f12369p);
        C3847a.C3855f fVar = this.f12498c;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo11921e(sb.toString());
        mo12131G(connectionResult, (Exception) null);
    }

    /* renamed from: I */
    public final void mo12133I() {
        C7264i.m27895d(this.f12509n.f12369p);
        if (this.f12505j) {
            mo12128D();
        }
    }

    /* renamed from: J */
    public final void mo12134J() {
        C7264i.m27895d(this.f12509n.f12369p);
        m14862d(C3874c.f12350r);
        this.f12500e.mo12117f();
        for (C3877d.C3878a f1Var : (C3877d.C3878a[]) this.f12502g.keySet().toArray(new C3877d.C3878a[0])) {
            mo12129E(new C3887f1(f1Var, new C9227g()));
        }
        m14861c(new ConnectionResult(4));
        if (this.f12498c.mo11919c()) {
            this.f12498c.mo11928o(new C3915o0(this));
        }
    }

    /* renamed from: K */
    public final void mo12135K() {
        Status status;
        C7264i.m27895d(this.f12509n.f12369p);
        if (this.f12505j) {
            m14869l();
            C3874c cVar = this.f12509n;
            if (cVar.f12361h.mo11872i(cVar.f12360g) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m14862d(status);
            this.f12498c.mo11921e("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean mo12136L() {
        return this.f12498c.mo7052k();
    }

    /* renamed from: T1 */
    public final void mo12100T1(ConnectionResult connectionResult, C3847a aVar, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo12137a() {
        return m14872o(true);
    }

    /* renamed from: k */
    public final void mo12102k(Bundle bundle) {
        if (Looper.myLooper() == this.f12509n.f12369p.getLooper()) {
            m14865g();
        } else {
            this.f12509n.f12369p.post(new C3906l0(this));
        }
    }

    /* renamed from: p */
    public final int mo12138p() {
        return this.f12503h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo12139q() {
        return this.f12508m;
    }

    /* renamed from: s */
    public final C3847a.C3855f mo12140s() {
        return this.f12498c;
    }

    /* renamed from: u */
    public final Map mo12141u() {
        return this.f12502g;
    }

    /* renamed from: x */
    public final void mo12107x(int i) {
        if (Looper.myLooper() == this.f12509n.f12369p.getLooper()) {
            m14866h(i);
        } else {
            this.f12509n.f12369p.post(new C3909m0(this, i));
        }
    }

    /* renamed from: y */
    public final void mo12084y(ConnectionResult connectionResult) {
        mo12131G(connectionResult, (Exception) null);
    }
}
