package com.salesforce.marketingcloud.sfmcsdk.modules;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.modules.c */
public final /* synthetic */ class C11746c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ModuleReadyHandler f34070d;

    /* renamed from: e */
    public final /* synthetic */ ModuleInterface f34071e;

    public /* synthetic */ C11746c(ModuleReadyHandler moduleReadyHandler, ModuleInterface moduleInterface) {
        this.f34070d = moduleReadyHandler;
        this.f34071e = moduleInterface;
    }

    public final void run() {
        ModuleReadyHandler.m125025deliverModule$lambda0(this.f34070d, this.f34071e);
    }
}
