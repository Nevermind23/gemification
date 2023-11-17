package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p156l6.C6930a0;
import p156l6.C6950k;
import p156l6.C6972x;
import p156l6.C6973y;
import p182n6.C7249c;
import p182n6.C7264i;
import p182n6.C7291w;
import p182n6.C7292x;
import p260t6.C8403e;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
public final class C3890g0 extends C3860c implements C6973y {

    /* renamed from: b */
    private final Lock f12401b;

    /* renamed from: c */
    private final C7292x f12402c;

    /* renamed from: d */
    private C6930a0 f12403d = null;

    /* renamed from: e */
    private final int f12404e;

    /* renamed from: f */
    private final Context f12405f;

    /* renamed from: g */
    private final Looper f12406g;

    /* renamed from: h */
    final Queue f12407h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f12408i;

    /* renamed from: j */
    private long f12409j;

    /* renamed from: k */
    private long f12410k;

    /* renamed from: l */
    private final C3883e0 f12411l;

    /* renamed from: m */
    private final C3846a f12412m;

    /* renamed from: n */
    C6972x f12413n;

    /* renamed from: o */
    final Map f12414o;

    /* renamed from: p */
    Set f12415p;

    /* renamed from: q */
    final C7249c f12416q;

    /* renamed from: r */
    final Map f12417r;

    /* renamed from: s */
    final C3847a.C3848a f12418s;

    /* renamed from: t */
    private final C3882e f12419t;

    /* renamed from: u */
    private final ArrayList f12420u;

    /* renamed from: v */
    private Integer f12421v;

    /* renamed from: w */
    Set f12422w;

    /* renamed from: x */
    final C3873b1 f12423x;

    /* renamed from: y */
    private final C7291w f12424y;

    public C3890g0(Context context, Lock lock, Looper looper, C7249c cVar, C3846a aVar, C3847a.C3848a aVar2, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f12409j = true != C8403e.m31537a() ? 120000 : 10000;
        this.f12410k = 5000;
        this.f12415p = new HashSet();
        this.f12419t = new C3882e();
        this.f12421v = null;
        this.f12422w = null;
        C3880d0 d0Var = new C3880d0(this);
        this.f12424y = d0Var;
        this.f12405f = context;
        this.f12401b = lock;
        this.f12402c = new C7292x(looper, d0Var);
        this.f12406g = looper2;
        this.f12411l = new C3883e0(this, looper);
        this.f12412m = aVar;
        this.f12404e = i3;
        if (i3 >= 0) {
            this.f12421v = Integer.valueOf(i2);
        }
        this.f12417r = map;
        this.f12414o = map2;
        this.f12420u = arrayList;
        this.f12423x = new C3873b1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f12402c.mo21667f((C3860c.C3862b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f12402c.mo21668g((C3860c.C3863c) it2.next());
        }
        this.f12416q = cVar;
        this.f12418s = aVar2;
    }

    /* renamed from: p */
    public static int m14727p(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C3847a.C3855f fVar = (C3847a.C3855f) it.next();
            z2 |= fVar.mo7052k();
            z3 |= fVar.mo11920d();
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: r */
    static String m14728r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: s */
    static /* bridge */ /* synthetic */ void m14729s(C3890g0 g0Var) {
        g0Var.f12401b.lock();
        try {
            if (g0Var.f12408i) {
                g0Var.m14732w();
            }
        } finally {
            g0Var.f12401b.unlock();
        }
    }

    /* renamed from: t */
    static /* bridge */ /* synthetic */ void m14730t(C3890g0 g0Var) {
        g0Var.f12401b.lock();
        try {
            if (g0Var.mo12072u()) {
                g0Var.m14732w();
            }
        } finally {
            g0Var.f12401b.unlock();
        }
    }

    /* renamed from: v */
    private final void m14731v(int i) {
        Integer num = this.f12421v;
        if (num == null) {
            this.f12421v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String r = m14728r(i);
            String r2 = m14728r(this.f12421v.intValue());
            StringBuilder sb = new StringBuilder(r.length() + 51 + r2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(r);
            sb.append(". Mode was already set to ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f12403d == null) {
            boolean z = false;
            boolean z2 = false;
            for (C3847a.C3855f fVar : this.f12414o.values()) {
                z |= fVar.mo7052k();
                z2 |= fVar.mo11920d();
            }
            int intValue = this.f12421v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.f12403d = C3899j.m14784n(this.f12405f, this, this.f12401b, this.f12406g, this.f12412m, this.f12414o, this.f12416q, this.f12417r, this.f12418s, this.f12420u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f12403d = new C3900j0(this.f12405f, this, this.f12401b, this.f12406g, this.f12412m, this.f12414o, this.f12416q, this.f12417r, this.f12418s, this.f12420u, this);
        }
    }

    /* renamed from: w */
    private final void m14732w() {
        this.f12402c.mo21663b();
        ((C6930a0) C7264i.m27902k(this.f12403d)).mo12092a();
    }

    /* renamed from: a */
    public final void mo12068a(Bundle bundle) {
        while (!this.f12407h.isEmpty()) {
            mo11954g((C3871b) this.f12407h.remove());
        }
        this.f12402c.mo21665d(bundle);
    }

    /* renamed from: b */
    public final void mo12069b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f12408i) {
                this.f12408i = true;
                if (this.f12413n == null && !C8403e.m31537a()) {
                    try {
                        this.f12413n = this.f12412m.mo11881v(this.f12405f.getApplicationContext(), new C3886f0(this));
                    } catch (SecurityException unused) {
                    }
                }
                C3883e0 e0Var = this.f12411l;
                e0Var.sendMessageDelayed(e0Var.obtainMessage(1), this.f12409j);
                C3883e0 e0Var2 = this.f12411l;
                e0Var2.sendMessageDelayed(e0Var2.obtainMessage(2), this.f12410k);
            }
            i = 1;
        }
        for (BasePendingResult f : (BasePendingResult[]) this.f12423x.f12348a.toArray(new BasePendingResult[0])) {
            f.mo11974f(C3873b1.f12347c);
        }
        this.f12402c.mo21666e(i);
        this.f12402c.mo21662a();
        if (i == 2) {
            m14732w();
        }
    }

    /* renamed from: c */
    public final void mo12070c(ConnectionResult connectionResult) {
        if (!this.f12412m.mo12156k(this.f12405f, connectionResult.mo11858v())) {
            mo12072u();
        }
        if (!this.f12408i) {
            this.f12402c.mo21664c(connectionResult);
            this.f12402c.mo21662a();
        }
    }

    /* renamed from: d */
    public final void mo11951d() {
        boolean z;
        this.f12401b.lock();
        try {
            int i = 2;
            boolean z2 = false;
            if (this.f12404e >= 0) {
                if (this.f12421v != null) {
                    z = true;
                } else {
                    z = false;
                }
                C7264i.m27906o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f12421v;
                if (num == null) {
                    this.f12421v = Integer.valueOf(m14727p(this.f12414o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C7264i.m27902k(this.f12421v)).intValue();
            this.f12401b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                C7264i.m27893b(z2, sb.toString());
                m14731v(i);
                m14732w();
            }
            z2 = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            C7264i.m27893b(z2, sb2.toString());
            m14731v(i);
            m14732w();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f12401b.unlock();
        }
    }

    /* renamed from: e */
    public final void mo11952e() {
        Lock lock;
        this.f12401b.lock();
        try {
            this.f12423x.mo12021b();
            C6930a0 a0Var = this.f12403d;
            if (a0Var != null) {
                a0Var.mo12094c();
            }
            this.f12419t.mo12054c();
            for (C3871b bVar : this.f12407h) {
                bVar.mo11980o((C3870a1) null);
                bVar.mo11972d();
            }
            this.f12407h.clear();
            if (this.f12403d == null) {
                lock = this.f12401b;
            } else {
                mo12072u();
                this.f12402c.mo21662a();
                lock = this.f12401b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f12401b.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo11953f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f12405f);
        printWriter.append(str).append("mResuming=").print(this.f12408i);
        printWriter.append(" mWorkQueue.size()=").print(this.f12407h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f12423x.f12348a.size());
        C6930a0 a0Var = this.f12403d;
        if (a0Var != null) {
            a0Var.mo12095d(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final C3871b mo11954g(C3871b bVar) {
        String str;
        Lock lock;
        C3847a q = bVar.mo12008q();
        boolean containsKey = this.f12414o.containsKey(bVar.mo12009r());
        if (q != null) {
            str = q.mo11916d();
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        C7264i.m27893b(containsKey, sb.toString());
        this.f12401b.lock();
        try {
            C6930a0 a0Var = this.f12403d;
            if (a0Var != null) {
                if (this.f12408i) {
                    this.f12407h.add(bVar);
                    while (!this.f12407h.isEmpty()) {
                        C3871b bVar2 = (C3871b) this.f12407h.remove();
                        this.f12423x.mo12020a(bVar2);
                        bVar2.mo12012v(Status.f12254l);
                    }
                    lock = this.f12401b;
                } else {
                    bVar = a0Var.mo12097f(bVar);
                    lock = this.f12401b;
                }
                lock.unlock();
                return bVar;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f12401b.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public final Looper mo11955i() {
        return this.f12406g;
    }

    /* renamed from: j */
    public final boolean mo11956j() {
        C6930a0 a0Var = this.f12403d;
        return a0Var != null && a0Var.mo12096e();
    }

    /* renamed from: k */
    public final boolean mo11957k(C6950k kVar) {
        C6930a0 a0Var = this.f12403d;
        return a0Var != null && a0Var.mo12098g(kVar);
    }

    /* renamed from: l */
    public final void mo11958l() {
        C6930a0 a0Var = this.f12403d;
        if (a0Var != null) {
            a0Var.mo12093b();
        }
    }

    /* renamed from: m */
    public final void mo11959m(C3860c.C3863c cVar) {
        this.f12402c.mo21668g(cVar);
    }

    /* renamed from: n */
    public final void mo11960n(C3860c.C3863c cVar) {
        this.f12402c.mo21669h(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo12071q() {
        StringWriter stringWriter = new StringWriter();
        mo11953f("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo12072u() {
        if (!this.f12408i) {
            return false;
        }
        this.f12408i = false;
        this.f12411l.removeMessages(2);
        this.f12411l.removeMessages(1);
        C6972x xVar = this.f12413n;
        if (xVar != null) {
            xVar.mo21106b();
            this.f12413n = null;
        }
        return true;
    }
}
