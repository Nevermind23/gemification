package z61;

import ju0.C36790b;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBankList;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: z61.c */
public class C40152c extends C36790b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C40151b f95402b;

    /* renamed from: z61.c$a */
    class C40153a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f95403a;

        C40153a(String str) {
            this.f95403a = str;
        }

        public void onFailure(Throwable th) {
            C40152c.this.f95402b.mo94092U0();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                C40152c.this.f95402b.mo94097i0((ForeignBankList) bankApiResponse.getResult(), this.f95403a);
            } else {
                C40152c.this.f95402b.mo94091B(bankApiResponse.getKey());
            }
        }
    }

    /* renamed from: z61.c$b */
    class C40154b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f95405a;

        C40154b(String str) {
            this.f95405a = str;
        }

        public void onFailure(Throwable th) {
            C40152c.this.f95402b.mo94095c();
            C40152c.this.f95402b.mo94099w();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C40152c.this.f95402b.mo94095c();
            if (bankApiResponse.isSuccess()) {
                C40152c.this.f95402b.mo94090A(this.f95405a, (TransferCountryCode) bankApiResponse.getResult());
            } else {
                C40152c.this.f95402b.mo94099w();
            }
        }
    }

    /* renamed from: z61.c$c */
    class C40155c extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f95407a;

        C40155c(String str) {
            this.f95407a = str;
        }

        public void onFailure(Throwable th) {
            C40152c.this.f95402b.mo94093X0();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                C40152c.this.f95402b.mo94098r0((ForeignBankList) bankApiResponse.getResult(), this.f95407a);
            } else {
                C40152c.this.f95402b.mo94094a0(bankApiResponse.getKey());
            }
        }
    }

    C40152c(C40151b bVar) {
        this.f95402b = bVar;
    }

    /* renamed from: b */
    public void mo94100b(String str) {
        this.f95402b.mo94096e();
        this.f88761a.getCountryCodeBySwift(str, new C40154b(str));
    }

    /* renamed from: c */
    public void mo94101c(String str) {
        this.f88761a.getForeignBankList(str, 0, 10, new C40153a(str));
    }

    /* renamed from: d */
    public void mo94102d(String str, int i) {
        this.f88761a.getForeignBankList(str, i, 10, new C40155c(str));
    }
}
