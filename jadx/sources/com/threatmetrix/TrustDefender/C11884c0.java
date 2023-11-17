package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.threatmetrix.TrustDefender.C11969r1;
import com.threatmetrix.TrustDefender.lrrlrr;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.threatmetrix.TrustDefender.c0 */
public class C11884c0 implements lrrlrr.C11930a {

    /* renamed from: h */
    private static final String f34791h = C11907h.m43615j(C11884c0.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11919j1 f34792a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12010y f34793b;

    /* renamed from: c */
    private lrrlrr.C11931b f34794c;

    /* renamed from: d */
    private HandlerThread f34795d = null;

    /* renamed from: e */
    private Context f34796e;

    /* renamed from: f */
    private volatile boolean f34797f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicInteger f34798g = new AtomicInteger(0);

    /* renamed from: com.threatmetrix.TrustDefender.c0$b */
    public private class C11886b implements InvocationHandler {
        private C11886b() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!"onLocationChanged".equals(method.getName())) {
                return lrrlrr.m43775c(this, method, objArr);
            }
            if (C11884c0.this.m43552m() && objArr != null && objArr.length > 0) {
                C11884c0.this.f34792a.onLocationChanged(objArr[0]);
            }
            return null;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.c0$c */
    public private class C11887c implements InvocationHandler {

        /* renamed from: a */
        public final boolean f34800a;

        public C11887c(boolean z) {
            this.f34800a = z;
        }

        /* renamed from: a */
        private void m43559a(boolean z) {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            if (C11884c0.this.m43552m()) {
                if (z) {
                    atomicInteger = C11884c0.this.f34798g;
                    i2 = 2;
                    i = 1;
                } else {
                    atomicInteger = C11884c0.this.f34798g;
                    i2 = 4;
                    i = 3;
                }
                atomicInteger.compareAndSet(i2, i);
            }
        }

        /* renamed from: b */
        private void m43560b(boolean z) {
            if (C11884c0.this.m43552m()) {
                if (!z) {
                    C11884c0.this.f34798g.compareAndSet(4, 1);
                } else if (C11884c0.this.f34798g.compareAndSet(2, 3)) {
                    C11884c0.this.f34793b.mo32102m();
                }
                C11884c0.this.m43553n();
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!"onResult".equals(method.getName())) {
                return lrrlrr.m43775c(this, method, objArr);
            }
            if (objArr == null || objArr.length <= 0) {
                return null;
            }
            if (lrrlrr.m43774b(objArr[0])) {
                m43560b(this.f34800a);
                return null;
            }
            m43559a(this.f34800a);
            return null;
        }
    }

    /* renamed from: h */
    private void m43548h() {
        if (m43552m() && this.f34798g.compareAndSet(3, 4)) {
            this.f34794c.mo31982a(new C11887c(false));
        }
    }

    /* renamed from: j */
    private void m43550j() {
        if (m43552m()) {
            C11969r1.C11975f fVar = new C11969r1.C11975f(this.f34796e);
            boolean c = fVar.mo32041c("android.permission.ACCESS_FINE_LOCATION", this.f34796e.getPackageName());
            boolean c2 = fVar.mo32041c("android.permission.ACCESS_COARSE_LOCATION", this.f34796e.getPackageName());
            if ((c || c2) && this.f34798g.compareAndSet(1, 2)) {
                this.f34794c.mo31984c(new C11887c(true), this.f34795d.getLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m43552m() {
        return (this.f34794c == null || this.f34792a == null || this.f34793b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m43553n() {
        if (this.f34797f) {
            m43548h();
        } else {
            m43550j();
        }
    }

    /* renamed from: a */
    public void mo31927a() {
        this.f34798g.set(-1);
    }

    /* renamed from: b */
    public void mo31928b() {
        if (this.f34798g.compareAndSet(0, 1)) {
            m43553n();
        }
    }

    /* renamed from: d */
    public void mo31929d(boolean z) {
        this.f34797f = z;
        m43553n();
    }

    /* renamed from: f */
    public boolean mo31930f() {
        return this.f34798g.get() > 0;
    }

    /* renamed from: k */
    public boolean mo31931k(Context context, long j, long j2, int i, C11919j1 j1Var, C12010y yVar, HandlerThread handlerThread) {
        Context context2 = context;
        if (context2 == null) {
            C11907h.m43622q(f34791h, "Null context");
            return false;
        }
        this.f34793b = yVar;
        this.f34792a = j1Var;
        this.f34795d = handlerThread;
        this.f34796e = context2;
        this.f34798g.set(0);
        lrrlrr.C11931b h = lrrlrr.m43780h(context, j, j2, i, this, new C11886b(), new C11886b(), new Handler(handlerThread.getLooper()));
        this.f34794c = h;
        return h != null;
    }
}
