package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import ue1.C43075l;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.a */
public final /* synthetic */ class C11737a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SFMCSdkModuleConfig f34049d;

    /* renamed from: e */
    public final /* synthetic */ C43075l f34050e;

    /* renamed from: f */
    public final /* synthetic */ Context f34051f;

    public /* synthetic */ C11737a(SFMCSdkModuleConfig sFMCSdkModuleConfig, C43075l lVar, Context context) {
        this.f34049d = sFMCSdkModuleConfig;
        this.f34050e = lVar;
        this.f34051f = context;
    }

    public final void run() {
        SFMCSdk.Companion.m125019configure$lambda14$lambda13(this.f34049d, this.f34050e, this.f34051f);
    }
}
