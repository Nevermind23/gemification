package wh0;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vh0.C29079e;

/* renamed from: wh0.h */
public final class C29400h {

    /* renamed from: b */
    public static final C29401a f74487b = new C29401a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C29079e f74488a;

    /* renamed from: wh0.h$a */
    public static final class C29401a {
        private C29401a() {
        }

        public /* synthetic */ C29401a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29400h(C29079e eVar) {
        C41536l.m120489i(eVar, "purchaseRepository");
        this.f74488a = eVar;
    }

    /* renamed from: a */
    public final C40762x mo69241a(long j, boolean z, String str) {
        String str2;
        C41536l.m120489i(str, "phoneNumber");
        C29079e eVar = this.f74488a;
        if (z) {
            str2 = "self";
        } else {
            str2 = "gift";
        }
        return eVar.mo67745H(j, str2, str);
    }
}
