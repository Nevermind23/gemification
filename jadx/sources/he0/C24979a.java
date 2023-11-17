package he0;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;
import p341ge.bog.mobilebank.fcm.MyFirebaseMessagingService;

/* renamed from: he0.a */
public final /* synthetic */ class C24979a implements SFMCSdkReadyListener {

    /* renamed from: a */
    public final /* synthetic */ String f64304a;

    public /* synthetic */ C24979a(String str) {
        this.f64304a = str;
    }

    public final void ready(SFMCSdk sFMCSdk) {
        MyFirebaseMessagingService.m75494p(this.f64304a, sFMCSdk);
    }
}
