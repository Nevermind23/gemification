package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.InitializationState;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.NamedRunnable;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModule;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import he1.C41238w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;

public final class Module$initModule$1 extends NamedRunnable {
    final /* synthetic */ SFMCSdkComponents $components;
    final /* synthetic */ Config $config;
    final /* synthetic */ Context $context;
    final /* synthetic */ ModuleReadyListener $listener;
    final /* synthetic */ Module this$0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModuleIdentifier.values().length];
            iArr[ModuleIdentifier.PUSH.ordinal()] = 1;
            iArr[ModuleIdentifier.CDP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Module$initModule$1(Module module, Config config, Context context, SFMCSdkComponents sFMCSdkComponents, ModuleReadyListener moduleReadyListener, String str, Object[] objArr) {
        super(str, objArr);
        this.this$0 = module;
        this.$config = config;
        this.$context = context;
        this.$components = sFMCSdkComponents;
        this.$listener = moduleReadyListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: execute$lambda-2  reason: not valid java name */
    public static final void m125024execute$lambda2(Module$initModule$1 module$initModule$1, Module module, Config config, ModuleReadyListener moduleReadyListener, ModuleInterface moduleInterface) {
        ModuleInterface moduleInterface2;
        C41536l.m120489i(module$initModule$1, "this$0");
        C41536l.m120489i(module, "this$1");
        C41536l.m120489i(config, "$config");
        C41536l.m120489i(moduleReadyListener, "$listener");
        C41536l.m120489i(moduleInterface, "it");
        SFMCSdkLogger.INSTANCE.mo31452d(module$initModule$1.getName(), new Module$initModule$1$execute$2$1(config));
        int i = WhenMappings.$EnumSwitchMapping$0[config.getModuleIdentifier().ordinal()];
        if (i == 1) {
            moduleInterface2 = (PushModuleInterface) moduleInterface;
        } else if (i == 2) {
            moduleInterface2 = (CdpModuleInterface) moduleInterface;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        module.setModule(moduleInterface2);
        moduleReadyListener.ready(moduleInterface);
        module.setInitializationState(InitializationState.READY);
        synchronized (module.getMODULE_INSTANCE_REQUESTS()) {
            for (ModuleReadyHandler moduleReadyHandler : module.getMODULE_INSTANCE_REQUESTS()) {
                try {
                    moduleReadyHandler.deliverModule(moduleInterface);
                } catch (Exception e) {
                    SFMCSdkLogger.INSTANCE.mo31453e(PushModule.TAG, e, new Module$initModule$1$execute$2$2$1$1(moduleInterface, moduleReadyHandler));
                }
            }
            module.getMODULE_INSTANCE_REQUESTS().clear();
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: protected */
    public void execute() {
        this.this$0.setInitializationState(InitializationState.INITIALIZING);
        SFMCSdkLogger.INSTANCE.mo31452d(getName(), new Module$initModule$1$execute$1(this.$config));
        Config config = this.$config;
        config.init(this.$context, this.$components, new C11745b(this, this.this$0, config, this.$listener));
    }
}
