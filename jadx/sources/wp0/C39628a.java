package wp0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wp0.a */
public enum C39628a {
    V,
    C,
    R,
    N;
    

    /* renamed from: d */
    public static final C39629a f94136d = null;

    /* renamed from: wp0.a$a */
    public static final class C39629a {
        private C39629a() {
        }

        public /* synthetic */ C39629a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39628a mo93288a(String str) {
            for (C39628a aVar : C39628a.values()) {
                if (C41536l.m120484d(aVar.name(), str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f94136d = new C39629a((DefaultConstructorMarker) null);
    }
}
