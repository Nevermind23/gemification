package p506lj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lj.a */
public enum C16578a {
    TRANSPARENT(0),
    SOLID(1);
    

    /* renamed from: e */
    public static final C16579a f46751e = null;

    /* renamed from: d */
    private final int f46755d;

    /* renamed from: lj.a$a */
    public static final class C16579a {
        private C16579a() {
        }

        public /* synthetic */ C16579a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16578a mo43727a(int i) {
            C16578a aVar;
            boolean z;
            C16578a[] values = C16578a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i2];
                if (aVar.mo43726b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (aVar == null) {
                return C16578a.TRANSPARENT;
            }
            return aVar;
        }
    }

    static {
        f46751e = new C16579a((DefaultConstructorMarker) null);
    }

    private C16578a(int i) {
        this.f46755d = i;
    }

    /* renamed from: b */
    public final int mo43726b() {
        return this.f46755d;
    }
}
