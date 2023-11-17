package p520mj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mj.b */
public enum C16716b {
    UNVERIFIED(1),
    WEAK(2),
    AVERAGE(3),
    STRONG(4);
    

    /* renamed from: e */
    public static final C16717a f46957e = null;

    /* renamed from: d */
    private final int f46963d;

    /* renamed from: mj.b$a */
    public static final class C16717a {
        private C16717a() {
        }

        public /* synthetic */ C16717a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16716b mo43837a(int i) {
            boolean z;
            for (C16716b bVar : C16716b.values()) {
                if (bVar.mo43836b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f46957e = new C16717a((DefaultConstructorMarker) null);
    }

    private C16716b(int i) {
        this.f46963d = i;
    }

    /* renamed from: b */
    public final int mo43836b() {
        return this.f46963d;
    }
}
