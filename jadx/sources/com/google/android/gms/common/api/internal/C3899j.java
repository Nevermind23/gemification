package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p066e7.C6042f;
import p066e7.C6047k;
import p156l6.C6930a0;
import p156l6.C6950k;
import p156l6.C6953l0;
import p156l6.C6957n0;
import p156l6.C6959o0;
import p182n6.C7249c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.j */
final class C3899j implements C6930a0 {

    /* renamed from: b */
    private final Context f12441b;

    /* renamed from: c */
    private final C3890g0 f12442c;

    /* renamed from: d */
    private final Looper f12443d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3900j0 f12444e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3900j0 f12445f;

    /* renamed from: g */
    private final Map f12446g;

    /* renamed from: h */
    private final Set f12447h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    private final C3847a.C3855f f12448i;

    /* renamed from: j */
    private Bundle f12449j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f12450k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ConnectionResult f12451l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f12452m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Lock f12453n;

    /* renamed from: o */
    private int f12454o = 0;

    private C3899j(Context context, C3890g0 g0Var, Lock lock, Looper looper, C3941b bVar, Map map, Map map2, C7249c cVar, C3847a.C3848a aVar, C3847a.C3855f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f12441b = context;
        this.f12442c = g0Var;
        this.f12453n = lock;
        this.f12443d = looper;
        this.f12448i = fVar;
        Context context2 = context;
        C3890g0 g0Var2 = g0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C3941b bVar2 = bVar;
        C3900j0 j0Var = r3;
        C3900j0 j0Var2 = new C3900j0(context2, g0Var2, lock2, looper2, bVar2, map2, (C7249c) null, map4, (C3847a.C3848a) null, arrayList2, new C3919p1(this, (C6957n0) null));
        this.f12444e = j0Var;
        this.f12445f = new C3900j0(context2, g0Var2, lock2, looper2, bVar2, map, cVar, map3, aVar, arrayList, new C3922q1(this, (C6959o0) null));
        ArrayMap arrayMap = new ArrayMap();
        for (C3847a.C3850c put : map2.keySet()) {
            arrayMap.put(put, this.f12444e);
        }
        for (C3847a.C3850c put2 : map.keySet()) {
            arrayMap.put(put2, this.f12445f);
        }
        this.f12446g = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: h */
    private final void m14778h(ConnectionResult connectionResult) {
        int i = this.f12454o;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f12454o = 0;
            }
            this.f12442c.mo12070c(connectionResult);
        }
        m14779i();
        this.f12454o = 0;
    }

    /* renamed from: i */
    private final void m14779i() {
        for (C6950k onComplete : this.f12447h) {
            onComplete.onComplete();
        }
        this.f12447h.clear();
    }

    /* renamed from: j */
    private final boolean m14780j() {
        ConnectionResult connectionResult = this.f12451l;
        return connectionResult != null && connectionResult.mo11858v() == 4;
    }

    /* renamed from: k */
    private final boolean m14781k(C3871b bVar) {
        C3900j0 j0Var = (C3900j0) this.f12446g.get(bVar.mo12009r());
        C7264i.m27903l(j0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return j0Var.equals(this.f12445f);
    }

    /* renamed from: l */
    private static boolean m14782l(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo11855f0();
    }

    /* renamed from: n */
    public static C3899j m14784n(Context context, C3890g0 g0Var, Lock lock, Looper looper, C3941b bVar, Map map, C7249c cVar, Map map2, C3847a.C3848a aVar, ArrayList arrayList) {
        Map map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        C3847a.C3855f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            C3847a.C3855f fVar2 = (C3847a.C3855f) entry.getValue();
            if (true == fVar2.mo11920d()) {
                fVar = fVar2;
            }
            if (fVar2.mo7052k()) {
                arrayMap.put((C3847a.C3850c) entry.getKey(), fVar2);
            } else {
                arrayMap2.put((C3847a.C3850c) entry.getKey(), fVar2);
            }
        }
        C7264i.m27906o(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C3847a aVar2 : map2.keySet()) {
            C3847a.C3850c b = aVar2.mo11914b();
            if (arrayMap.containsKey(b)) {
                arrayMap3.put(aVar2, (Boolean) map3.get(aVar2));
            } else if (arrayMap2.containsKey(b)) {
                arrayMap4.put(aVar2, (Boolean) map3.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6953l0 l0Var = (C6953l0) arrayList.get(i);
            if (arrayMap3.containsKey(l0Var.f20826b)) {
                arrayList2.add(l0Var);
            } else if (arrayMap4.containsKey(l0Var.f20826b)) {
                arrayList3.add(l0Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C3899j(context, g0Var, lock, looper, bVar, arrayMap, arrayMap2, cVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m14791u(C3899j jVar, int i, boolean z) {
        jVar.f12442c.mo12069b(i, z);
        jVar.f12451l = null;
        jVar.f12450k = null;
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m14792v(C3899j jVar, Bundle bundle) {
        Bundle bundle2 = jVar.f12449j;
        if (bundle2 == null) {
            jVar.f12449j = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m14793w(C3899j jVar) {
        ConnectionResult connectionResult;
        if (m14782l(jVar.f12450k)) {
            if (m14782l(jVar.f12451l) || jVar.m14780j()) {
                int i = jVar.f12454o;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        jVar.f12454o = 0;
                        return;
                    }
                    ((C3890g0) C7264i.m27902k(jVar.f12442c)).mo12068a(jVar.f12449j);
                }
                jVar.m14779i();
                jVar.f12454o = 0;
                return;
            }
            ConnectionResult connectionResult2 = jVar.f12451l;
            if (connectionResult2 == null) {
                return;
            }
            if (jVar.f12454o == 1) {
                jVar.m14779i();
                return;
            }
            jVar.m14778h(connectionResult2);
            jVar.f12444e.mo12094c();
        } else if (jVar.f12450k == null || !m14782l(jVar.f12451l)) {
            ConnectionResult connectionResult3 = jVar.f12450k;
            if (connectionResult3 != null && (connectionResult = jVar.f12451l) != null) {
                if (jVar.f12445f.f12467n < jVar.f12444e.f12467n) {
                    connectionResult3 = connectionResult;
                }
                jVar.m14778h(connectionResult3);
            }
        } else {
            jVar.f12445f.mo12094c();
            jVar.m14778h((ConnectionResult) C7264i.m27902k(jVar.f12450k));
        }
    }

    /* renamed from: z */
    private final PendingIntent m14795z() {
        if (this.f12448i == null) {
            return null;
        }
        return C6042f.m24169a(this.f12441b, System.identityHashCode(this.f12442c), this.f12448i.mo11932u(), C6042f.f18825a | 134217728);
    }

    /* renamed from: a */
    public final void mo12092a() {
        this.f12454o = 2;
        this.f12452m = false;
        this.f12451l = null;
        this.f12450k = null;
        this.f12444e.mo12092a();
        this.f12445f.mo12092a();
    }

    /* renamed from: b */
    public final void mo12093b() {
        this.f12453n.lock();
        try {
            boolean y = mo12099y();
            this.f12445f.mo12094c();
            this.f12451l = new ConnectionResult(4);
            if (y) {
                new C6047k(this.f12443d).post(new C3916o1(this));
            } else {
                m14779i();
            }
        } finally {
            this.f12453n.unlock();
        }
    }

    /* renamed from: c */
    public final void mo12094c() {
        this.f12451l = null;
        this.f12450k = null;
        this.f12454o = 0;
        this.f12444e.mo12094c();
        this.f12445f.mo12094c();
        m14779i();
    }

    /* renamed from: d */
    public final void mo12095d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f12445f.mo12095d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f12444e.mo12095d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public final boolean mo12096e() {
        this.f12453n.lock();
        try {
            boolean z = false;
            if (this.f12444e.mo12096e() && (this.f12445f.mo12096e() || m14780j() || this.f12454o == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f12453n.unlock();
        }
    }

    /* renamed from: f */
    public final C3871b mo12097f(C3871b bVar) {
        if (!m14781k(bVar)) {
            return this.f12444e.mo12097f(bVar);
        }
        if (!m14780j()) {
            return this.f12445f.mo12097f(bVar);
        }
        bVar.mo12012v(new Status(4, (String) null, m14795z()));
        return bVar;
    }

    /* renamed from: g */
    public final boolean mo12098g(C6950k kVar) {
        this.f12453n.lock();
        try {
            if ((mo12099y() || mo12096e()) && !this.f12445f.mo12096e()) {
                this.f12447h.add(kVar);
                if (this.f12454o == 0) {
                    this.f12454o = 1;
                }
                this.f12451l = null;
                this.f12445f.mo12092a();
                return true;
            }
            this.f12453n.unlock();
            return false;
        } finally {
            this.f12453n.unlock();
        }
    }

    /* renamed from: y */
    public final boolean mo12099y() {
        boolean z;
        this.f12453n.lock();
        try {
            if (this.f12454o == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f12453n.unlock();
        }
    }
}
