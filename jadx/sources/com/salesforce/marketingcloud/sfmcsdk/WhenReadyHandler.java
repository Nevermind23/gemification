package com.salesforce.marketingcloud.sfmcsdk;

import android.os.Handler;
import kotlin.jvm.internal.C41536l;

public final class WhenReadyHandler extends Handler {
    private final SFMCSdkReadyListener listener;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WhenReadyHandler(com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener r2) {
        /*
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x000f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000f:
            r1.<init>(r0)
            r1.listener = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.WhenReadyHandler.<init>(com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: deliverSdk$lambda-0  reason: not valid java name */
    public static final void m125023deliverSdk$lambda0(WhenReadyHandler whenReadyHandler, SFMCSdk sFMCSdk) {
        C41536l.m120489i(whenReadyHandler, "this$0");
        C41536l.m120489i(sFMCSdk, "$sdk");
        whenReadyHandler.execute(sFMCSdk, whenReadyHandler.getListener());
    }

    private final void execute(SFMCSdk sFMCSdk, SFMCSdkReadyListener sFMCSdkReadyListener) {
        sFMCSdkReadyListener.ready(sFMCSdk);
    }

    public final void deliverSdk(SFMCSdk sFMCSdk) {
        C41536l.m120489i(sFMCSdk, "sdk");
        post(new C11743e(this, sFMCSdk));
    }

    public final SFMCSdkReadyListener getListener() {
        return this.listener;
    }
}
