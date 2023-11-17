package androidx.work;

import androidx.work.C2096y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.work.o */
public final class C2076o extends C2096y {

    /* renamed from: e */
    public static final C2078b f6229e = new C2078b((DefaultConstructorMarker) null);

    /* renamed from: androidx.work.o$a */
    public static final class C2077a extends C2096y.C2097a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2077a(Class cls) {
            super(cls);
            C41536l.m120489i(cls, "workerClass");
            mo6991h().f21633d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: l */
        public C2076o mo6968c() {
            boolean z;
            if (!mo6988d() || !mo6991h().f21639j.mo6717h()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C2076o(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        /* renamed from: m */
        public C2077a mo6969g() {
            return this;
        }
    }

    /* renamed from: androidx.work.o$b */
    public static final class C2078b {
        private C2078b() {
        }

        public /* synthetic */ C2078b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2076o mo6972a(Class cls) {
            C41536l.m120489i(cls, "workerClass");
            return (C2076o) new C2077a(cls).mo6987b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2076o(C2077a aVar) {
        super(aVar.mo6989e(), aVar.mo6991h(), aVar.mo6990f());
        C41536l.m120489i(aVar, "builder");
    }

    /* renamed from: e */
    public static final C2076o m8093e(Class cls) {
        return f6229e.mo6972a(cls);
    }
}
