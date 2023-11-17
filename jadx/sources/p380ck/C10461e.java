package p380ck;

import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;

/* renamed from: ck.e */
public final /* synthetic */ class C10461e implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ PiCart f29791a;

    public /* synthetic */ C10461e(PiCart piCart) {
        this.f29791a = piCart;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        sFMCSdk.mo31149mp(new C10462f(this.f29791a));
    }
}
