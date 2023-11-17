package iu0;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;

/* renamed from: iu0.w */
public final /* synthetic */ class C36544w implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ String f88045a;

    public /* synthetic */ C36544w(String str) {
        this.f88045a = str;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        sFMCSdk.mo31149mp(new C36536o(this.f88045a));
    }
}
