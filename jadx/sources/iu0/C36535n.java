package iu0;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;

/* renamed from: iu0.n */
public final /* synthetic */ class C36535n implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ C36546y f88039a;

    /* renamed from: b */
    public final /* synthetic */ String f88040b;

    /* renamed from: c */
    public final /* synthetic */ String f88041c;

    public /* synthetic */ C36535n(C36546y yVar, String str, String str2) {
        this.f88039a = yVar;
        this.f88040b = str;
        this.f88041c = str2;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        this.f88039a.m108304h0(this.f88040b, this.f88041c, sFMCSdk);
    }
}
