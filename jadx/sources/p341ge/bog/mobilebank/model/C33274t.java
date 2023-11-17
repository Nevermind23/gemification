package p341ge.bog.mobilebank.model;

import jd1.C41399f;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.model.t */
public final /* synthetic */ class C33274t implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ Client f81365d;

    /* renamed from: e */
    public final /* synthetic */ int f81366e;

    /* renamed from: f */
    public final /* synthetic */ Long f81367f;

    /* renamed from: g */
    public final /* synthetic */ Long f81368g;

    /* renamed from: h */
    public final /* synthetic */ Long f81369h;

    /* renamed from: i */
    public final /* synthetic */ Long f81370i;

    /* renamed from: j */
    public final /* synthetic */ Long f81371j;

    /* renamed from: k */
    public final /* synthetic */ Long f81372k;

    /* renamed from: l */
    public final /* synthetic */ String f81373l;

    /* renamed from: m */
    public final /* synthetic */ String f81374m;

    /* renamed from: n */
    public final /* synthetic */ int f81375n;

    /* renamed from: o */
    public final /* synthetic */ BankApiResponse f81376o;

    public /* synthetic */ C33274t(Client client, int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2, BankApiResponse bankApiResponse) {
        this.f81365d = client;
        this.f81366e = i;
        this.f81367f = l;
        this.f81368g = l2;
        this.f81369h = l3;
        this.f81370i = l4;
        this.f81371j = l5;
        this.f81372k = l6;
        this.f81373l = str;
        this.f81374m = str2;
        this.f81375n = i2;
        this.f81376o = bankApiResponse;
    }

    public final void accept(Object obj) {
        this.f81365d.lambda$onOperationsResponse$29(this.f81366e, this.f81367f, this.f81368g, this.f81369h, this.f81370i, this.f81371j, this.f81372k, this.f81373l, this.f81374m, this.f81375n, this.f81376o, (Throwable) obj);
    }
}
