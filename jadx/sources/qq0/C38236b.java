package qq0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qq0.b */
public enum C38236b {
    X,
    Y,
    N;
    

    /* renamed from: d */
    public static final C38237a f91724d = null;

    /* renamed from: qq0.b$a */
    public static final class C38237a {
        private C38237a() {
        }

        public /* synthetic */ C38237a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38236b mo91770a(String str) {
            for (C38236b bVar : C38236b.values()) {
                if (C41536l.m120484d(bVar.name(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f91724d = new C38237a((DefaultConstructorMarker) null);
    }
}
