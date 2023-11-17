package p341ge.bog.mobilebank.model;

import java.util.List;
import jd1.C41399f;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.model.f */
public final /* synthetic */ class C33230f implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ Client f81317d;

    /* renamed from: e */
    public final /* synthetic */ BankApiResponse f81318e;

    public /* synthetic */ C33230f(Client client, BankApiResponse bankApiResponse) {
        this.f81317d = client;
        this.f81318e = bankApiResponse;
    }

    public final void accept(Object obj) {
        this.f81317d.lambda$lastOperationsResponse$2(this.f81318e, (List) obj);
    }
}
