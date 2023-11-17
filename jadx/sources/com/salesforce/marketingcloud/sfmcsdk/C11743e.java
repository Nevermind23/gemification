package com.salesforce.marketingcloud.sfmcsdk;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.e */
public final /* synthetic */ class C11743e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WhenReadyHandler f34064d;

    /* renamed from: e */
    public final /* synthetic */ SFMCSdk f34065e;

    public /* synthetic */ C11743e(WhenReadyHandler whenReadyHandler, SFMCSdk sFMCSdk) {
        this.f34064d = whenReadyHandler;
        this.f34065e = sFMCSdk;
    }

    public final void run() {
        WhenReadyHandler.m125023deliverSdk$lambda0(this.f34064d, this.f34065e);
    }
}
