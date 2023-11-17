package androidx.work;

import androidx.work.C2096y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.work.r */
public final class C2086r extends C2096y {

    /* renamed from: e */
    public static final C2088b f6236e = new C2088b((DefaultConstructorMarker) null);

    /* renamed from: androidx.work.r$a */
    public static final class C2087a extends C2096y.C2097a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2087a(Class cls, long j, TimeUnit timeUnit) {
            super(cls);
            C41536l.m120489i(cls, "workerClass");
            C41536l.m120489i(timeUnit, "repeatIntervalTimeUnit");
            mo6991h().mo21794k(timeUnit.toMillis(j));
        }

        /* renamed from: l */
        public C2086r mo6968c() {
            boolean z;
            if (!mo6988d() || !mo6991h().f21639j.mo6717h()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            } else if (!mo6991h().f21646q) {
                return new C2086r(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
            }
        }

        /* renamed from: m */
        public C2087a mo6969g() {
            return this;
        }
    }

    /* renamed from: androidx.work.r$b */
    public static final class C2088b {
        private C2088b() {
        }

        public /* synthetic */ C2088b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2086r(C2087a aVar) {
        super(aVar.mo6989e(), aVar.mo6991h(), aVar.mo6990f());
        C41536l.m120489i(aVar, "builder");
    }
}
