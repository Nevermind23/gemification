package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.c */
public final /* synthetic */ class C11739c implements ModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f34053a;

    /* renamed from: b */
    public final /* synthetic */ Config f34054b;

    public /* synthetic */ C11739c(CountDownLatch countDownLatch, Config config) {
        this.f34053a = countDownLatch;
        this.f34054b = config;
    }

    public final void ready(ModuleInterface moduleInterface) {
        SFMCSdk.Companion.m125020configure$lambda14$lambda13$lambda8$lambda5(this.f34053a, this.f34054b, moduleInterface);
    }
}
