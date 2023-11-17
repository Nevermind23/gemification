package dg1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dg1.a0 */
public class C40669a0 {

    /* renamed from: d */
    public static final C40671b f96309d = new C40671b((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final C40669a0 f96310e = new C40670a();

    /* renamed from: a */
    private boolean f96311a;

    /* renamed from: b */
    private long f96312b;

    /* renamed from: c */
    private long f96313c;

    /* renamed from: dg1.a0$a */
    public static final class C40670a extends C40669a0 {
        C40670a() {
        }

        /* renamed from: d */
        public C40669a0 mo94685d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo94687f() {
        }

        /* renamed from: g */
        public C40669a0 mo94688g(long j, TimeUnit timeUnit) {
            C41536l.m120489i(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: dg1.a0$b */
    public static final class C40671b {
        private C40671b() {
        }

        public /* synthetic */ C40671b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public C40669a0 mo94682a() {
        this.f96311a = false;
        return this;
    }

    /* renamed from: b */
    public C40669a0 mo94683b() {
        this.f96313c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo94684c() {
        if (this.f96311a) {
            return this.f96312b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C40669a0 mo94685d(long j) {
        this.f96311a = true;
        this.f96312b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo94686e() {
        return this.f96311a;
    }

    /* renamed from: f */
    public void mo94687f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f96311a && this.f96312b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C40669a0 mo94688g(long j, TimeUnit timeUnit) {
        boolean z;
        C41536l.m120489i(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f96313c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C41536l.m120497q("timeout < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: h */
    public long mo94689h() {
        return this.f96313c;
    }
}
