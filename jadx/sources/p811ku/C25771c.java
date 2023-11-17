package p811ku;

import ed1.C40762x;
import j70.C25339b;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m70.C26156i;
import md0.C26186e;
import p821lu.C26089b;
import p841nu.C26607a;
import p853ow.C27092a;
import p863pw.C27631i;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ku.c */
public final class C25771c {

    /* renamed from: a */
    private final C26607a f65555a;

    /* renamed from: b */
    private final C25339b f65556b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C26089b f65557c;

    /* renamed from: d */
    private final C27092a f65558d;

    /* renamed from: ku.c$a */
    /* synthetic */ class C25772a extends C41535k implements C43075l {
        C25772a(Object obj) {
            super(1, obj, C27092a.class, "convert", "convert(Lge/bog/mobilebank/cleanarch/shareddomain/model/account/AccountsAndDetailsModel;)Lge/bog/mobilebank/cleanarch/domain/products/model/Accounts;", 0);
        }

        /* renamed from: b */
        public final C27631i invoke(C26156i iVar) {
            C41536l.m120489i(iVar, "p0");
            return ((C27092a) this.receiver).mo66373j(iVar);
        }
    }

    /* renamed from: ku.c$b */
    static final class C25773b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C25771c f65559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25773b(C25771c cVar) {
            super(2);
            this.f65559d = cVar;
        }

        /* renamed from: a */
        public final List invoke(List list, C27631i iVar) {
            C41536l.m120489i(list, "cards");
            C41536l.m120489i(iVar, "accounts");
            return this.f65559d.f65557c.mo65002f(list, iVar);
        }
    }

    public C25771c(C26607a aVar, C25339b bVar, C26089b bVar2, C27092a aVar2) {
        C41536l.m120489i(aVar, "commissionsRepository");
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(bVar2, "commissionsAccountsMapper");
        C41536l.m120489i(aVar2, "mapper");
        this.f65555a = aVar;
        this.f65556b = bVar;
        this.f65557c = bVar2;
        this.f65558d = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C27631i m81041e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27631i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m81042f(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (List) pVar.invoke(obj, obj2);
    }

    /* renamed from: d */
    public final C40762x mo64364d(String str, String str2) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "ccy");
        C40762x T = C40762x.m118154T(this.f65555a.mo65862c(str, str2), C26186e.m81990h(C25339b.C25340a.m80512a(this.f65556b, false, 1, (Object) null)).mo95062A(new C25769a(new C25772a(this.f65558d))), new C25770b(new C25773b(this)));
        C41536l.m120488h(T, "operator fun invoke(lang…nsform(cards, accounts) }");
        return T;
    }
}
