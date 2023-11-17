package df1;

import kotlin.jvm.internal.C41536l;
import ze1.C43425h;

/* renamed from: df1.d */
public abstract class C40654d {
    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final long m117504h(long j, int i) {
        return C40651b.m117478f((j << 1) + ((long) i));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final long m117505i(long j) {
        return C40651b.m117478f((j << 1) + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final long m117506j(long j) {
        if (new C43425h(-4611686018426L, 4611686018426L).mo102128r(j)) {
            return m117507k(m117509m(j));
        }
        return m117505i(C43429k.m124591j(j, -4611686018427387903L, 4611686018427387903L));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final long m117507k(long j) {
        return C40651b.m117478f(j << 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final long m117508l(long j) {
        if (new C43425h(-4611686018426999999L, 4611686018426999999L).mo102128r(j)) {
            return m117507k(j);
        }
        return m117505i(m117510n(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final long m117509m(long j) {
        return j * ((long) 1000000);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final long m117510n(long j) {
        return j / ((long) 1000000);
    }

    /* renamed from: o */
    public static final long m117511o(long j, C40655e eVar) {
        C41536l.m120489i(eVar, "unit");
        C40655e eVar2 = C40655e.NANOSECONDS;
        long b = C40656f.m117515b(4611686018426999999L, eVar2, eVar);
        if (new C43425h(-b, b).mo102128r(j)) {
            return m117507k(C40656f.m117515b(j, eVar, eVar2));
        }
        return m117505i(C43429k.m124591j(C40656f.m117514a(j, eVar, C40655e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
