package p843nw;

import ed1.C40749p;
import j70.C25339b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import m70.C26156i;
import md0.C26186e;
import p853ow.C27092a;
import p863pw.C27631i;
import ue1.C43075l;

/* renamed from: nw.h */
public final class C26625h {

    /* renamed from: a */
    private final C25339b f67249a;

    /* renamed from: b */
    private final C27092a f67250b;

    /* renamed from: nw.h$a */
    /* synthetic */ class C26626a extends C41535k implements C43075l {
        C26626a(Object obj) {
            super(1, obj, C27092a.class, "convert", "convert(Lge/bog/mobilebank/cleanarch/shareddomain/model/account/AccountsAndDetailsModel;)Lge/bog/mobilebank/cleanarch/domain/products/model/Accounts;", 0);
        }

        /* renamed from: b */
        public final C27631i invoke(C26156i iVar) {
            C41536l.m120489i(iVar, "p0");
            return ((C27092a) this.receiver).mo66373j(iVar);
        }
    }

    public C26625h(C25339b bVar, C27092a aVar) {
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(aVar, "mapper");
        this.f67249a = bVar;
        this.f67250b = aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40749p m83089d(C26625h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return hVar.mo65879c(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C27631i m83090e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27631i) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo65878b() {
        return m83089d(this, false, 1, (Object) null);
    }

    /* renamed from: c */
    public final C40749p mo65879c(boolean z) {
        C40749p k0 = C26186e.m81987e(this.f67249a.mo63908a(z)).mo95026k0(new C26624g(new C26626a(this.f67250b)));
        C41536l.m120488h(k0, "getAccountsAndDetails(re…ap().map(mapper::convert)");
        return k0;
    }
}
