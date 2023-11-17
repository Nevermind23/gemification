package ze1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ze1.h */
public final class C43425h extends C43422f implements C43414a {

    /* renamed from: h */
    public static final C43426a f101292h = new C43426a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C43425h f101293i = new C43425h(1, 0);

    /* renamed from: ze1.h$a */
    public static final class C43426a {
        private C43426a() {
        }

        public /* synthetic */ C43426a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43425h mo102132a() {
            return C43425h.f101293i;
        }
    }

    public C43425h(long j, long j2) {
        super(j, j2, 1);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo102099c(Comparable comparable) {
        return mo102128r(((Number) comparable).longValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C43425h) {
            if (!isEmpty() || !((C43425h) obj).isEmpty()) {
                C43425h hVar = (C43425h) obj;
                if (!(mo102121j() == hVar.mo102121j() && mo102122l() == hVar.mo102122l())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (mo102121j() ^ (mo102121j() >>> 32))) + (mo102122l() ^ (mo102122l() >>> 32)));
    }

    public boolean isEmpty() {
        return mo102121j() > mo102122l();
    }

    /* renamed from: r */
    public boolean mo102128r(long j) {
        return mo102121j() <= j && j <= mo102122l();
    }

    public String toString() {
        return mo102121j() + ".." + mo102122l();
    }

    /* renamed from: v */
    public Long mo102100i() {
        return Long.valueOf(mo102122l());
    }

    /* renamed from: w */
    public Long mo102098b() {
        return Long.valueOf(mo102121j());
    }
}
