package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.d */
public final /* synthetic */ class C11742d implements ModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f34062a;

    /* renamed from: b */
    public final /* synthetic */ Config f34063b;

    public /* synthetic */ C11742d(CountDownLatch countDownLatch, Config config) {
        this.f34062a = countDownLatch;
        this.f34063b = config;
    }

    public final void ready(ModuleInterface moduleInterface) {
        SFMCSdk.Companion.m125021configure$lambda14$lambda13$lambda8$lambda7(this.f34062a, this.f34063b, moduleInterface);
    }
}
