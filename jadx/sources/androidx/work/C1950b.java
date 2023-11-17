package androidx.work;

import android.os.Build;
import androidx.core.util.C1000a;
import androidx.work.impl.C2004d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.b */
public final class C1950b {

    /* renamed from: a */
    final Executor f5883a;

    /* renamed from: b */
    final Executor f5884b;

    /* renamed from: c */
    final C2099z f5885c;

    /* renamed from: d */
    final C2066k f5886d;

    /* renamed from: e */
    final C2091u f5887e;

    /* renamed from: f */
    final C1000a f5888f;

    /* renamed from: g */
    final C1000a f5889g;

    /* renamed from: h */
    final String f5890h;

    /* renamed from: i */
    final int f5891i;

    /* renamed from: j */
    final int f5892j;

    /* renamed from: k */
    final int f5893k;

    /* renamed from: l */
    final int f5894l;

    /* renamed from: m */
    private final boolean f5895m;

    /* renamed from: androidx.work.b$a */
    class C1951a implements ThreadFactory {

        /* renamed from: d */
        private final AtomicInteger f5896d = new AtomicInteger(0);

        /* renamed from: e */
        final /* synthetic */ boolean f5897e;

        C1951a(boolean z) {
            this.f5897e = z;
        }

        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f5897e) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f5896d.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b */
    public static final class C1952b {

        /* renamed from: a */
        Executor f5899a;

        /* renamed from: b */
        C2099z f5900b;

        /* renamed from: c */
        C2066k f5901c;

        /* renamed from: d */
        Executor f5902d;

        /* renamed from: e */
        C2091u f5903e;

        /* renamed from: f */
        C1000a f5904f;

        /* renamed from: g */
        C1000a f5905g;

        /* renamed from: h */
        String f5906h;

        /* renamed from: i */
        int f5907i = 4;

        /* renamed from: j */
        int f5908j = 0;

        /* renamed from: k */
        int f5909k = Integer.MAX_VALUE;

        /* renamed from: l */
        int f5910l = 20;

        /* renamed from: a */
        public C1950b mo6706a() {
            return new C1950b(this);
        }

        /* renamed from: b */
        public C1952b mo6707b(C2099z zVar) {
            this.f5900b = zVar;
            return this;
        }
    }

    /* renamed from: androidx.work.b$c */
    public interface C1953c {
        /* renamed from: f */
        C1950b mo6708f();
    }

    C1950b(C1952b bVar) {
        Executor executor = bVar.f5899a;
        if (executor == null) {
            this.f5883a = m7663a(false);
        } else {
            this.f5883a = executor;
        }
        Executor executor2 = bVar.f5902d;
        if (executor2 == null) {
            this.f5895m = true;
            this.f5884b = m7663a(true);
        } else {
            this.f5895m = false;
            this.f5884b = executor2;
        }
        C2099z zVar = bVar.f5900b;
        if (zVar == null) {
            this.f5885c = C2099z.m8134c();
        } else {
            this.f5885c = zVar;
        }
        C2066k kVar = bVar.f5901c;
        if (kVar == null) {
            this.f5886d = C2066k.m8061c();
        } else {
            this.f5886d = kVar;
        }
        C2091u uVar = bVar.f5903e;
        if (uVar == null) {
            this.f5887e = new C2004d();
        } else {
            this.f5887e = uVar;
        }
        this.f5891i = bVar.f5907i;
        this.f5892j = bVar.f5908j;
        this.f5893k = bVar.f5909k;
        this.f5894l = bVar.f5910l;
        this.f5888f = bVar.f5904f;
        this.f5889g = bVar.f5905g;
        this.f5890h = bVar.f5906h;
    }

    /* renamed from: a */
    private Executor m7663a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m7664b(z));
    }

    /* renamed from: b */
    private ThreadFactory m7664b(boolean z) {
        return new C1951a(z);
    }

    /* renamed from: c */
    public String mo6693c() {
        return this.f5890h;
    }

    /* renamed from: d */
    public Executor mo6694d() {
        return this.f5883a;
    }

    /* renamed from: e */
    public C1000a mo6695e() {
        return this.f5888f;
    }

    /* renamed from: f */
    public C2066k mo6696f() {
        return this.f5886d;
    }

    /* renamed from: g */
    public int mo6697g() {
        return this.f5893k;
    }

    /* renamed from: h */
    public int mo6698h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f5894l / 2;
        }
        return this.f5894l;
    }

    /* renamed from: i */
    public int mo6699i() {
        return this.f5892j;
    }

    /* renamed from: j */
    public int mo6700j() {
        return this.f5891i;
    }

    /* renamed from: k */
    public C2091u mo6701k() {
        return this.f5887e;
    }

    /* renamed from: l */
    public C1000a mo6702l() {
        return this.f5889g;
    }

    /* renamed from: m */
    public Executor mo6703m() {
        return this.f5884b;
    }

    /* renamed from: n */
    public C2099z mo6704n() {
        return this.f5885c;
    }
}
