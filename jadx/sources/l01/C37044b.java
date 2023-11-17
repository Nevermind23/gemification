package l01;

import ed1.C40749p;
import j70.C25339b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import m01.C37187a;
import m70.C26156i;
import md0.C26186e;
import n01.C37342a;
import ue1.C43075l;

/* renamed from: l01.b */
public final class C37044b {

    /* renamed from: a */
    private final C25339b f89195a;

    /* renamed from: b */
    private final C37342a f89196b;

    /* renamed from: l01.b$a */
    /* synthetic */ class C37045a extends C41535k implements C43075l {
        C37045a(Object obj) {
            super(1, obj, C37342a.class, "convert", "convert(Lge/bog/mobilebank/cleanarch/shareddomain/model/account/AccountsAndDetailsModel;)Lge/bog/mobilebank/qrwithdrawal/domain/model/AccountData;", 0);
        }

        /* renamed from: b */
        public final C37187a invoke(C26156i iVar) {
            C41536l.m120489i(iVar, "p0");
            return ((C37342a) this.receiver).mo90425b(iVar);
        }
    }

    public C37044b(C25339b bVar, C37342a aVar) {
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(aVar, "mapper");
        this.f89195a = bVar;
        this.f89196b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C37187a m109564c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37187a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo89965b() {
        C40749p k0 = C26186e.m81987e(C25339b.C25340a.m80512a(this.f89195a, false, 1, (Object) null)).mo95026k0(new C37043a(new C37045a(this.f89196b)));
        C41536l.m120488h(k0, "getAccountsAndDetails().…p().map(mapper:: convert)");
        return k0;
    }
}
