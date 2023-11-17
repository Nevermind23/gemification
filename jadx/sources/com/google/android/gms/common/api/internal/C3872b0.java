package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p013v4.media.session.C0125b;
import android.util.Log;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.internal.C3966e;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p156l6.C6960p;
import p156l6.C6964r;
import p156l6.C6966s;
import p182n6.C7249c;
import p182n6.C7264i;
import p274u7.C8645e;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
public final class C3872b0 implements C6964r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3900j0 f12326a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f12327b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f12328c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3941b f12329d;

    /* renamed from: e */
    private ConnectionResult f12330e;

    /* renamed from: f */
    private int f12331f;

    /* renamed from: g */
    private int f12332g = 0;

    /* renamed from: h */
    private int f12333h;

    /* renamed from: i */
    private final Bundle f12334i = new Bundle();

    /* renamed from: j */
    private final Set f12335j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8645e f12336k;

    /* renamed from: l */
    private boolean f12337l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f12338m;

    /* renamed from: n */
    private boolean f12339n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3966e f12340o;

    /* renamed from: p */
    private boolean f12341p;

    /* renamed from: q */
    private boolean f12342q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C7249c f12343r;

    /* renamed from: s */
    private final Map f12344s;

    /* renamed from: t */
    private final C3847a.C3848a f12345t;

    /* renamed from: u */
    private final ArrayList f12346u = new ArrayList();

    public C3872b0(C3900j0 j0Var, C7249c cVar, Map map, C3941b bVar, C3847a.C3848a aVar, Lock lock, Context context) {
        this.f12326a = j0Var;
        this.f12343r = cVar;
        this.f12344s = map;
        this.f12329d = bVar;
        this.f12345t = aVar;
        this.f12327b = lock;
        this.f12328c = context;
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m14603A(C3872b0 b0Var, zak zak) {
        if (b0Var.m14618n(0)) {
            ConnectionResult v = zak.mo15013v();
            if (v.mo11855f0()) {
                zav zav = (zav) C7264i.m27902k(zak.mo15014w());
                ConnectionResult v2 = zav.mo12314v();
                if (!v2.mo11855f0()) {
                    String valueOf = String.valueOf(v2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    b0Var.m14615k(v2);
                    return;
                }
                b0Var.f12339n = true;
                b0Var.f12340o = (C3966e) C7264i.m27902k(zav.mo12315w());
                b0Var.f12341p = zav.mo12317x();
                b0Var.f12342q = zav.mo12312R();
                b0Var.m14617m();
            } else if (b0Var.m14620p(v)) {
                b0Var.m14612h();
                b0Var.m14617m();
            } else {
                b0Var.m14615k(v);
            }
        }
    }

    /* renamed from: I */
    private final void m14611I() {
        ArrayList arrayList = this.f12346u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f12346u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m14612h() {
        this.f12338m = false;
        this.f12326a.f12468o.f12415p = Collections.emptySet();
        for (C3847a.C3850c cVar : this.f12335j) {
            if (!this.f12326a.f12461h.containsKey(cVar)) {
                this.f12326a.f12461h.put(cVar, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: i */
    private final void m14613i(boolean z) {
        C8645e eVar = this.f12336k;
        if (eVar != null) {
            if (eVar.mo11919c() && z) {
                eVar.mo14997a();
            }
            eVar.mo11918b();
            C7249c cVar = (C7249c) C7264i.m27902k(this.f12343r);
            this.f12340o = null;
        }
    }

    /* renamed from: j */
    private final void m14614j() {
        Bundle bundle;
        this.f12326a.mo12101j();
        C6966s.m26983a().execute(new C3923r(this));
        C8645e eVar = this.f12336k;
        if (eVar != null) {
            if (this.f12341p) {
                eVar.mo15000s((C3966e) C7264i.m27902k(this.f12340o), this.f12342q);
            }
            m14613i(false);
        }
        for (C3847a.C3850c cVar : this.f12326a.f12461h.keySet()) {
            ((C3847a.C3855f) C7264i.m27902k((C3847a.C3855f) this.f12326a.f12460g.get(cVar))).mo11918b();
        }
        if (this.f12334i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f12334i;
        }
        this.f12326a.f12469p.mo12068a(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m14615k(ConnectionResult connectionResult) {
        m14611I();
        m14613i(!connectionResult.mo11853R());
        this.f12326a.mo12104m(connectionResult);
        this.f12326a.f12469p.mo12070c(connectionResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m14616l(ConnectionResult connectionResult, C3847a aVar, boolean z) {
        int b = aVar.mo11915c().mo11917b();
        if ((!z || connectionResult.mo11853R() || this.f12329d.mo12154c(connectionResult.mo11858v()) != null) && (this.f12330e == null || b < this.f12331f)) {
            this.f12330e = connectionResult;
            this.f12331f = b;
        }
        this.f12326a.f12461h.put(aVar.mo11914b(), connectionResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m14617m() {
        if (this.f12333h == 0) {
            if (!this.f12338m || this.f12339n) {
                ArrayList arrayList = new ArrayList();
                this.f12332g = 1;
                this.f12333h = this.f12326a.f12460g.size();
                for (C3847a.C3850c cVar : this.f12326a.f12460g.keySet()) {
                    if (!this.f12326a.f12461h.containsKey(cVar)) {
                        arrayList.add((C3847a.C3855f) this.f12326a.f12460g.get(cVar));
                    } else if (m14619o()) {
                        m14614j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f12346u.add(C6966s.m26983a().submit(new C3933w(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m14618n(int i) {
        if (this.f12332g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f12326a.f12468o.mo12071q());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f12333h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String q = m14621q(this.f12332g);
        String q2 = m14621q(i);
        StringBuilder sb2 = new StringBuilder(q.length() + 70 + q2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(q);
        sb2.append(" but received callback for step ");
        sb2.append(q2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        m14615k(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m14619o() {
        int i = this.f12333h - 1;
        this.f12333h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f12326a.f12468o.mo12071q());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m14615k(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f12330e;
        if (connectionResult == null) {
            return true;
        }
        this.f12326a.f12467n = this.f12331f;
        m14615k(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m14620p(ConnectionResult connectionResult) {
        return this.f12337l && !connectionResult.mo11853R();
    }

    /* renamed from: q */
    private static final String m14621q(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ Set m14628x(C3872b0 b0Var) {
        C7249c cVar = b0Var.f12343r;
        if (cVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(cVar.mo21621g());
        Map k = b0Var.f12343r.mo21625k();
        for (C3847a aVar : k.keySet()) {
            if (!b0Var.f12326a.f12461h.containsKey(aVar.mo11914b())) {
                C0125b.m366a(k.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo12013a(Bundle bundle) {
        if (m14618n(1)) {
            if (bundle != null) {
                this.f12334i.putAll(bundle);
            }
            if (m14619o()) {
                m14614j();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, u7.e] */
    /* renamed from: b */
    public final void mo12014b() {
        boolean z;
        this.f12326a.f12461h.clear();
        this.f12338m = false;
        this.f12330e = null;
        this.f12332g = 0;
        this.f12337l = true;
        this.f12339n = false;
        this.f12341p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (C3847a aVar : this.f12344s.keySet()) {
            C3847a.C3855f fVar = (C3847a.C3855f) C7264i.m27902k((C3847a.C3855f) this.f12326a.f12460g.get(aVar.mo11914b()));
            if (aVar.mo11915c().mo11917b() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.f12344s.get(aVar)).booleanValue();
            if (fVar.mo7052k()) {
                this.f12338m = true;
                if (booleanValue) {
                    this.f12335j.add(aVar.mo11914b());
                } else {
                    this.f12337l = false;
                }
            }
            hashMap.put(fVar, new C3925s(this, aVar, booleanValue));
        }
        if (z2) {
            this.f12338m = false;
        }
        if (this.f12338m) {
            C7264i.m27902k(this.f12343r);
            C7264i.m27902k(this.f12345t);
            this.f12343r.mo21626l(Integer.valueOf(System.identityHashCode(this.f12326a.f12468o)));
            C3939z zVar = new C3939z(this, (C6960p) null);
            C3847a.C3848a aVar2 = this.f12345t;
            Context context = this.f12328c;
            Looper i = this.f12326a.f12468o.mo11955i();
            C7249c cVar = this.f12343r;
            this.f12336k = aVar2.mo113c(context, i, cVar, cVar.mo21622h(), zVar, zVar);
        }
        this.f12333h = this.f12326a.f12460g.size();
        this.f12346u.add(C6966s.m26983a().submit(new C3931v(this, hashMap)));
    }

    /* renamed from: c */
    public final void mo12015c() {
    }

    /* renamed from: d */
    public final void mo12016d(ConnectionResult connectionResult, C3847a aVar, boolean z) {
        if (m14618n(1)) {
            m14616l(connectionResult, aVar, z);
            if (m14619o()) {
                m14614j();
            }
        }
    }

    /* renamed from: e */
    public final void mo12017e(int i) {
        m14615k(new ConnectionResult(8, (PendingIntent) null));
    }

    /* renamed from: f */
    public final boolean mo12018f() {
        m14611I();
        m14613i(true);
        this.f12326a.mo12104m((ConnectionResult) null);
        return true;
    }

    /* renamed from: g */
    public final C3871b mo12019g(C3871b bVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
