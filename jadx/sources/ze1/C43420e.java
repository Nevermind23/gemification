package ze1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ze1.e */
public final class C43420e extends C43417c implements C43414a {

    /* renamed from: h */
    public static final C43421a f101282h = new C43421a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C43420e f101283i = new C43420e(1, 0);

    /* renamed from: ze1.e$a */
    public static final class C43421a {
        private C43421a() {
        }

        public /* synthetic */ C43421a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43420e mo102119a() {
            return C43420e.f101283i;
        }
    }

    public C43420e(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo102099c(Comparable comparable) {
        return mo102116v(((Number) comparable).intValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C43420e) {
            if (!isEmpty() || !((C43420e) obj).isEmpty()) {
                C43420e eVar = (C43420e) obj;
                if (!(mo102109j() == eVar.mo102109j() && mo102110l() == eVar.mo102110l())) {
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
        return (mo102109j() * 31) + mo102110l();
    }

    public boolean isEmpty() {
        return mo102109j() > mo102110l();
    }

    public String toString() {
        return mo102109j() + ".." + mo102110l();
    }

    /* renamed from: v */
    public boolean mo102116v(int i) {
        return mo102109j() <= i && i <= mo102110l();
    }

    /* renamed from: w */
    public Integer mo102100i() {
        return Integer.valueOf(mo102110l());
    }

    /* renamed from: x */
    public Integer mo102098b() {
        return Integer.valueOf(mo102109j());
    }
}
