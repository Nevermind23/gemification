package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.a */
public enum C13606a {
    MINE(0),
    OTHERS(1);
    

    /* renamed from: e */
    public static final C13607a f40700e = null;

    /* renamed from: d */
    private final int f40704d;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.a$a */
    public static final class C13607a {
        private C13607a() {
        }

        public /* synthetic */ C13607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13606a mo37477a(int i) {
            C13606a aVar;
            boolean z;
            C13606a[] values = C13606a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i2];
                if (aVar.mo37476b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unknown CarOwner; position:" + i);
        }
    }

    static {
        f40700e = new C13607a((DefaultConstructorMarker) null);
    }

    private C13606a(int i) {
        this.f40704d = i;
    }

    /* renamed from: b */
    public final int mo37476b() {
        return this.f40704d;
    }
}
