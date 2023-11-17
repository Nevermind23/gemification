package p729cv;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p749ev.C20297b;

/* renamed from: cv.d */
public final class C19801d {

    /* renamed from: b */
    public static final C19802a f54175b = new C19802a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20297b f54176a;

    /* renamed from: cv.d$a */
    public static final class C19802a {
        private C19802a() {
        }

        public /* synthetic */ C19802a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19801d(C20297b bVar) {
        C41536l.m120489i(bVar, "paymentsRepository");
        this.f54176a = bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m65569b(C19801d dVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        if ((i2 & 2) != 0) {
            str = "MASTER";
        }
        return dVar.mo48090a(i, str);
    }

    /* renamed from: a */
    public final C40762x mo48090a(int i, String str) {
        C41536l.m120489i(str, "type");
        return this.f54176a.mo48781a(i, str);
    }
}
