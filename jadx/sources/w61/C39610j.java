package w61;

import hd1.C41205b;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: w61.j */
public final class C39610j {

    /* renamed from: a */
    private final BankApi f94119a;

    /* renamed from: w61.j$a */
    class C39611a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ C39612b f94120a;

        C39611a(C39612b bVar) {
            this.f94120a = bVar;
        }

        public void onEnqueue(C41205b bVar) {
            this.f94120a.mo85270a(bVar);
        }

        public void onFailure(Throwable th) {
            this.f94120a.mo85271b((String) null);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                Long l = (Long) bankApiResponse.getResult();
                if (l != null) {
                    this.f94120a.mo85271b(String.valueOf(l));
                } else {
                    this.f94120a.mo85271b((String) null);
                }
            } else {
                this.f94120a.mo85271b((String) null);
            }
        }
    }

    /* renamed from: w61.j$b */
    public interface C39612b {
        /* renamed from: a */
        void mo85270a(C41205b bVar);

        /* renamed from: b */
        void mo85271b(String str);
    }

    public C39610j(BankApi bankApi) {
        this.f94119a = bankApi;
    }

    /* renamed from: a */
    public void mo93271a(String str, C39612b bVar) {
        this.f94119a.getPaymentRequestId(str, new C39611a(bVar));
    }
}
