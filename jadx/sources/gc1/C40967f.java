package gc1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gc1.f */
public enum C40967f {
    CONTACT,
    TRANSACTION;
    

    /* renamed from: d */
    public static final C40968a f96746d = null;

    /* renamed from: gc1.f$a */
    public static final class C40968a {
        private C40968a() {
        }

        public /* synthetic */ C40968a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40967f mo95367a(int i) {
            C40967f[] values = C40967f.values();
            return (i < 0 || i > C41333m.m119800y(values)) ? C40967f.CONTACT : values[i];
        }
    }

    static {
        f96746d = new C40968a((DefaultConstructorMarker) null);
    }
}
