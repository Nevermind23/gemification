package p380ck;

import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;

/* renamed from: ck.b */
public final /* synthetic */ class C10458b implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ PiCart f29786a;

    public /* synthetic */ C10458b(PiCart piCart) {
        this.f29786a = piCart;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        sFMCSdk.mo31149mp(new C10460d(this.f29786a));
    }
}
