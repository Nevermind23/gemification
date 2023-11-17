package p267u0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import he1.C41238w;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p318y0.C8998i;
import p318y0.C8999j;
import ue1.C43075l;

/* renamed from: u0.c */
public final class C8443c {

    /* renamed from: m */
    public static final C8444a f24003m = new C8444a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public C8999j f24004a;

    /* renamed from: b */
    private final Handler f24005b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private Runnable f24006c;

    /* renamed from: d */
    private final Object f24007d = new Object();

    /* renamed from: e */
    private long f24008e;

    /* renamed from: f */
    private final Executor f24009f;

    /* renamed from: g */
    private int f24010g;

    /* renamed from: h */
    private long f24011h;

    /* renamed from: i */
    private C8998i f24012i;

    /* renamed from: j */
    private boolean f24013j;

    /* renamed from: k */
    private final Runnable f24014k;

    /* renamed from: l */
    private final Runnable f24015l;

    /* renamed from: u0.c$a */
    public static final class C8444a {
        private C8444a() {
        }

        public /* synthetic */ C8444a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C8443c(long j, TimeUnit timeUnit, Executor executor) {
        C41536l.m120489i(timeUnit, "autoCloseTimeUnit");
        C41536l.m120489i(executor, "autoCloseExecutor");
        this.f24008e = timeUnit.toMillis(j);
        this.f24009f = executor;
        this.f24011h = SystemClock.uptimeMillis();
        this.f24014k = new C8437a(this);
        this.f24015l = new C8440b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m31668c(C8443c cVar) {
        C41238w wVar;
        C41536l.m120489i(cVar, "this$0");
        synchronized (cVar.f24007d) {
            if (SystemClock.uptimeMillis() - cVar.f24011h >= cVar.f24008e) {
                if (cVar.f24010g == 0) {
                    Runnable runnable = cVar.f24006c;
                    if (runnable != null) {
                        runnable.run();
                        wVar = C41238w.f97225a;
                    } else {
                        wVar = null;
                    }
                    if (wVar != null) {
                        C8998i iVar = cVar.f24012i;
                        if (iVar != null && iVar.isOpen()) {
                            iVar.close();
                        }
                        cVar.f24012i = null;
                        C41238w wVar2 = C41238w.f97225a;
                        return;
                    }
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m31669f(C8443c cVar) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f24009f.execute(cVar.f24015l);
    }

    /* renamed from: d */
    public final void mo23633d() {
        synchronized (this.f24007d) {
            this.f24013j = true;
            C8998i iVar = this.f24012i;
            if (iVar != null) {
                iVar.close();
            }
            this.f24012i = null;
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: e */
    public final void mo23634e() {
        boolean z;
        synchronized (this.f24007d) {
            int i = this.f24010g;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = i - 1;
                this.f24010g = i2;
                if (i2 == 0) {
                    if (this.f24012i != null) {
                        this.f24005b.postDelayed(this.f24014k, this.f24008e);
                    } else {
                        return;
                    }
                }
                C41238w wVar = C41238w.f97225a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    /* renamed from: g */
    public final Object mo23635g(C43075l lVar) {
        C41536l.m120489i(lVar, "block");
        try {
            return lVar.invoke(mo23638j());
        } finally {
            mo23634e();
        }
    }

    /* renamed from: h */
    public final C8998i mo23636h() {
        return this.f24012i;
    }

    /* renamed from: i */
    public final C8999j mo23637i() {
        C8999j jVar = this.f24004a;
        if (jVar != null) {
            return jVar;
        }
        C41536l.m120506z("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final C8998i mo23638j() {
        synchronized (this.f24007d) {
            this.f24005b.removeCallbacks(this.f24014k);
            this.f24010g++;
            if (!this.f24013j) {
                C8998i iVar = this.f24012i;
                if (iVar != null && iVar.isOpen()) {
                    return iVar;
                }
                C8998i Z0 = mo23637i().mo23643Z0();
                this.f24012i = Z0;
                return Z0;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    /* renamed from: k */
    public final void mo23639k(C8999j jVar) {
        C41536l.m120489i(jVar, "delegateOpenHelper");
        mo23642n(jVar);
    }

    /* renamed from: l */
    public final boolean mo23640l() {
        return !this.f24013j;
    }

    /* renamed from: m */
    public final void mo23641m(Runnable runnable) {
        C41536l.m120489i(runnable, "onAutoClose");
        this.f24006c = runnable;
    }

    /* renamed from: n */
    public final void mo23642n(C8999j jVar) {
        C41536l.m120489i(jVar, "<set-?>");
        this.f24004a = jVar;
    }
}
