package p341ge.bog.mobilebank.model;

import java.util.List;
import jd1.C41399f;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ge.bog.mobilebank.model.s */
public final /* synthetic */ class C33273s implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ Client f81352d;

    /* renamed from: e */
    public final /* synthetic */ BankApiResponse f81353e;

    /* renamed from: f */
    public final /* synthetic */ int f81354f;

    /* renamed from: g */
    public final /* synthetic */ Long f81355g;

    /* renamed from: h */
    public final /* synthetic */ Long f81356h;

    /* renamed from: i */
    public final /* synthetic */ Long f81357i;

    /* renamed from: j */
    public final /* synthetic */ Long f81358j;

    /* renamed from: k */
    public final /* synthetic */ Long f81359k;

    /* renamed from: l */
    public final /* synthetic */ Long f81360l;

    /* renamed from: m */
    public final /* synthetic */ String f81361m;

    /* renamed from: n */
    public final /* synthetic */ String f81362n;

    /* renamed from: o */
    public final /* synthetic */ int f81363o;

    public /* synthetic */ C33273s(Client client, BankApiResponse bankApiResponse, int i, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, int i2) {
        this.f81352d = client;
        this.f81353e = bankApiResponse;
        this.f81354f = i;
        this.f81355g = l;
        this.f81356h = l2;
        this.f81357i = l3;
        this.f81358j = l4;
        this.f81359k = l5;
        this.f81360l = l6;
        this.f81361m = str;
        this.f81362n = str2;
        this.f81363o = i2;
    }

    public final void accept(Object obj) {
        this.f81352d.lambda$onOperationsResponse$28(this.f81353e, this.f81354f, this.f81355g, this.f81356h, this.f81357i, this.f81358j, this.f81359k, this.f81360l, this.f81361m, this.f81362n, this.f81363o, (List) obj);
    }
}
