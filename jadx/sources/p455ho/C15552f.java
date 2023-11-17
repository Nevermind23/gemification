package p455ho;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ho.f */
public enum C15552f {
    MD("MD"),
    YA("YA");
    

    /* renamed from: e */
    public static final C15553a f44150e = null;

    /* renamed from: d */
    private final String f44154d;

    /* renamed from: ho.f$a */
    public static final class C15553a {
        private C15553a() {
        }

        public /* synthetic */ C15553a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15552f mo42740a(String str) {
            for (C15552f fVar : C15552f.values()) {
                if (C41536l.m120484d(fVar.mo42739b(), str)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    static {
        f44150e = new C15553a((DefaultConstructorMarker) null);
    }

    private C15552f(String str) {
        this.f44154d = str;
    }

    /* renamed from: b */
    public final String mo42739b() {
        return this.f44154d;
    }
}
