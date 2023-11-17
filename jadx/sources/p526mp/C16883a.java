package p526mp;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mp.a */
public enum C16883a {
    Y,
    N,
    A,
    S,
    P,
    D;
    

    /* renamed from: d */
    public static final C16884a f47190d = null;

    /* renamed from: mp.a$a */
    public static final class C16884a {
        private C16884a() {
        }

        public /* synthetic */ C16884a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16883a mo44020a(String str) {
            for (C16883a aVar : C16883a.values()) {
                if (C41536l.m120484d(aVar.name(), str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f47190d = new C16884a((DefaultConstructorMarker) null);
    }
}
