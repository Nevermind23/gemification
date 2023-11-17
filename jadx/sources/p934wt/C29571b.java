package p934wt;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p761fx.C20576a;
import p945xt.C29858a;
import ue1.C43075l;

/* renamed from: wt.b */
public final class C29571b implements C20576a {

    /* renamed from: c */
    public static final C29572a f74694c = new C29572a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f74695a;

    /* renamed from: b */
    private final C29858a f74696b;

    /* renamed from: wt.b$a */
    public static final class C29572a {
        private C29572a() {
        }

        public /* synthetic */ C29572a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wt.b$b */
    static final class C29573b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29571b f74697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29573b(C29571b bVar) {
            super(1);
            this.f74697d = bVar;
        }

        /* renamed from: a */
        public final TransferAccounts invoke(TransferAccountsApiEntity transferAccountsApiEntity) {
            C41536l.m120489i(transferAccountsApiEntity, "it");
            return this.f74697d.mo69417b().mo70112c(transferAccountsApiEntity);
        }
    }

    public C29571b(IRetrofitService iRetrofitService, C29858a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f74695a = iRetrofitService;
        this.f74696b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final TransferAccounts m89768c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (TransferAccounts) lVar.invoke(obj);
    }

    /* renamed from: a0 */
    public C40762x mo49115a0() {
        C40762x<BankApiResponse<TransferAccountsApiEntity>> transferAccounts = this.f74695a.getTransferAccounts("TRANSFERS_GET_ACCOUNTS_LOV_DETAILS");
        C41536l.m120488h(transferAccounts, "service.getTransferAccou…GET_ACCOUNTS_LOV_DETAILS)");
        C40762x A = C19273c.m64722h(transferAccounts).mo95062A(new C29570a(new C29573b(this)));
        C41536l.m120488h(A, "override fun getTransfer…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: b */
    public final C29858a mo69417b() {
        return this.f74696b;
    }
}
