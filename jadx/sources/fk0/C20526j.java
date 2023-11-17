package fk0;

import ck0.C19764a;
import ck0.C19765b;
import ed1.C40762x;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43079p;

/* renamed from: fk0.j */
public final class C20526j {

    /* renamed from: a */
    private final C20530m f55546a;

    /* renamed from: b */
    private final C20534p f55547b;

    /* renamed from: fk0.j$a */
    static final class C20527a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C20527a f55548d = new C20527a();

        C20527a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C19764a aVar, C19765b bVar) {
            C41536l.m120489i(aVar, "hardwareId");
            C41536l.m120489i(bVar, "walletId");
            return C41233s.m119492a(aVar, bVar);
        }
    }

    public C20526j(C20530m mVar, C20534p pVar) {
        C41536l.m120489i(mVar, "getHardwareId");
        C41536l.m120489i(pVar, "getWalletId");
        this.f55546a = mVar;
        this.f55547b = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C41224m m66760c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo49055b() {
        C40762x T = C40762x.m118154T(this.f55546a.mo49057c(), this.f55547b.invoke(), new C20525i(C20527a.f55548d));
        C41536l.m120488h(T, "zip(getHardwareId(),\n   … hardwareId to walletId }");
        return T;
    }
}
