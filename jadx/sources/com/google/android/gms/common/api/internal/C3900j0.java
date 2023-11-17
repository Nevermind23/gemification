package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p156l6.C6930a0;
import p156l6.C6950k;
import p156l6.C6953l0;
import p156l6.C6955m0;
import p156l6.C6964r;
import p156l6.C6973y;
import p182n6.C7249c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
public final class C3900j0 implements C6930a0, C6955m0 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f12455b;

    /* renamed from: c */
    private final Condition f12456c;

    /* renamed from: d */
    private final Context f12457d;

    /* renamed from: e */
    private final C3941b f12458e;

    /* renamed from: f */
    private final C3897i0 f12459f;

    /* renamed from: g */
    final Map f12460g;

    /* renamed from: h */
    final Map f12461h = new HashMap();

    /* renamed from: i */
    final C7249c f12462i;

    /* renamed from: j */
    final Map f12463j;

    /* renamed from: k */
    final C3847a.C3848a f12464k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile C6964r f12465l;

    /* renamed from: m */
    private ConnectionResult f12466m = null;

    /* renamed from: n */
    int f12467n;

    /* renamed from: o */
    final C3890g0 f12468o;

    /* renamed from: p */
    final C6973y f12469p;

    public C3900j0(Context context, C3890g0 g0Var, Lock lock, Looper looper, C3941b bVar, Map map, C7249c cVar, Map map2, C3847a.C3848a aVar, ArrayList arrayList, C6973y yVar) {
        this.f12457d = context;
        this.f12455b = lock;
        this.f12458e = bVar;
        this.f12460g = map;
        this.f12462i = cVar;
        this.f12463j = map2;
        this.f12464k = aVar;
        this.f12468o = g0Var;
        this.f12469p = yVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C6953l0) arrayList.get(i)).mo21093a(this);
        }
        this.f12459f = new C3897i0(this, looper);
        this.f12456c = lock.newCondition();
        this.f12465l = new C3875c0(this);
    }

    /* renamed from: T1 */
    public final void mo12100T1(ConnectionResult connectionResult, C3847a aVar, boolean z) {
        this.f12455b.lock();
        try {
            this.f12465l.mo12016d(connectionResult, aVar, z);
        } finally {
            this.f12455b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo12092a() {
        this.f12465l.mo12015c();
    }

    /* renamed from: b */
    public final void mo12093b() {
    }

    /* renamed from: c */
    public final void mo12094c() {
        if (this.f12465l.mo12018f()) {
            this.f12461h.clear();
        }
    }

    /* renamed from: d */
    public final void mo12095d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f12465l);
        for (C3847a aVar : this.f12463j.keySet()) {
            printWriter.append(str).append(aVar.mo11916d()).println(":");
            ((C3847a.C3855f) C7264i.m27902k((C3847a.C3855f) this.f12460g.get(aVar.mo11914b()))).mo11929p(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final boolean mo12096e() {
        return this.f12465l instanceof C3920q;
    }

    /* renamed from: f */
    public final C3871b mo12097f(C3871b bVar) {
        bVar.mo11978l();
        return this.f12465l.mo12019g(bVar);
    }

    /* renamed from: g */
    public final boolean mo12098g(C6950k kVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12101j() {
        this.f12455b.lock();
        try {
            this.f12468o.mo12072u();
            this.f12465l = new C3920q(this);
            this.f12465l.mo12014b();
            this.f12456c.signalAll();
        } finally {
            this.f12455b.unlock();
        }
    }

    /* renamed from: k */
    public final void mo12102k(Bundle bundle) {
        this.f12455b.lock();
        try {
            this.f12465l.mo12013a(bundle);
        } finally {
            this.f12455b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12103l() {
        this.f12455b.lock();
        try {
            this.f12465l = new C3872b0(this, this.f12462i, this.f12463j, this.f12458e, this.f12464k, this.f12455b, this.f12457d);
            this.f12465l.mo12014b();
            this.f12456c.signalAll();
        } finally {
            this.f12455b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo12104m(ConnectionResult connectionResult) {
        this.f12455b.lock();
        try {
            this.f12466m = connectionResult;
            this.f12465l = new C3875c0(this);
            this.f12465l.mo12014b();
            this.f12456c.signalAll();
        } finally {
            this.f12455b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12105n(C3894h0 h0Var) {
        this.f12459f.sendMessage(this.f12459f.obtainMessage(1, h0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo12106o(RuntimeException runtimeException) {
        this.f12459f.sendMessage(this.f12459f.obtainMessage(2, runtimeException));
    }

    /* renamed from: x */
    public final void mo12107x(int i) {
        this.f12455b.lock();
        try {
            this.f12465l.mo12017e(i);
        } finally {
            this.f12455b.unlock();
        }
    }
}
