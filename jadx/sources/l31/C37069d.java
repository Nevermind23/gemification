package l31;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l31.d */
public enum C37069d {
    ACCEPT("ACCEPT"),
    CLOSE("CLOSE");
    

    /* renamed from: e */
    public static final C37070a f89232e = null;

    /* renamed from: d */
    private final String f89236d;

    /* renamed from: l31.d$a */
    public static final class C37070a {
        private C37070a() {
        }

        public /* synthetic */ C37070a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37069d mo90009a(String str) {
            C41536l.m120489i(str, "buttonType");
            C37069d dVar = C37069d.ACCEPT;
            if (C41536l.m120484d(str, dVar.mo90008b())) {
                return dVar;
            }
            C37069d dVar2 = C37069d.CLOSE;
            if (C41536l.m120484d(str, dVar2.mo90008b())) {
                return dVar2;
            }
            return null;
        }
    }

    static {
        f89232e = new C37070a((DefaultConstructorMarker) null);
    }

    private C37069d(String str) {
        this.f89236d = str;
    }

    /* renamed from: b */
    public final String mo90008b() {
        return this.f89236d;
    }
}
