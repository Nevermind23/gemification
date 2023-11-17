package com.salesforce.marketingcloud.sfmcsdk.modules;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.modules.b */
public final /* synthetic */ class C11745b implements ModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ Module$initModule$1 f34066a;

    /* renamed from: b */
    public final /* synthetic */ Module f34067b;

    /* renamed from: c */
    public final /* synthetic */ Config f34068c;

    /* renamed from: d */
    public final /* synthetic */ ModuleReadyListener f34069d;

    public /* synthetic */ C11745b(Module$initModule$1 module$initModule$1, Module module, Config config, ModuleReadyListener moduleReadyListener) {
        this.f34066a = module$initModule$1;
        this.f34067b = module;
        this.f34068c = config;
        this.f34069d = moduleReadyListener;
    }

    public final void ready(ModuleInterface moduleInterface) {
        Module$initModule$1.m125024execute$lambda2(this.f34066a, this.f34067b, this.f34068c, this.f34069d, moduleInterface);
    }
}
