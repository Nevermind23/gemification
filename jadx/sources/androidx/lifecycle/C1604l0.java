package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.l0 */
public class C1604l0 {

    /* renamed from: a */
    private final C1631s f4617a;

    /* renamed from: b */
    private final Handler f4618b = new Handler();

    /* renamed from: c */
    private C1605a f4619c;

    /* renamed from: androidx.lifecycle.l0$a */
    public static final class C1605a implements Runnable {

        /* renamed from: d */
        private final C1631s f4620d;

        /* renamed from: e */
        private final C1593j.C1594a f4621e;

        /* renamed from: f */
        private boolean f4622f;

        public C1605a(C1631s sVar, C1593j.C1594a aVar) {
            C41536l.m120489i(sVar, "registry");
            C41536l.m120489i(aVar, "event");
            this.f4620d = sVar;
            this.f4621e = aVar;
        }

        public void run() {
            if (!this.f4622f) {
                this.f4620d.mo4941i(this.f4621e);
                this.f4622f = true;
            }
        }
    }

    public C1604l0(C1619q qVar) {
        C41536l.m120489i(qVar, "provider");
        this.f4617a = new C1631s(qVar);
    }

    /* renamed from: f */
    private final void m5646f(C1593j.C1594a aVar) {
        C1605a aVar2 = this.f4619c;
        if (aVar2 != null) {
            aVar2.run();
        }
        C1605a aVar3 = new C1605a(this.f4617a, aVar);
        this.f4619c = aVar3;
        Handler handler = this.f4618b;
        C41536l.m120486f(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    /* renamed from: a */
    public C1593j mo4916a() {
        return this.f4617a;
    }

    /* renamed from: b */
    public void mo4917b() {
        m5646f(C1593j.C1594a.ON_START);
    }

    /* renamed from: c */
    public void mo4918c() {
        m5646f(C1593j.C1594a.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4919d() {
        m5646f(C1593j.C1594a.ON_STOP);
        m5646f(C1593j.C1594a.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4920e() {
        m5646f(C1593j.C1594a.ON_START);
    }
}
