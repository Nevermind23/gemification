package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.InitializationState;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModule;
import he1.C41223l;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

public abstract class Module {
    private final List<ModuleReadyHandler> MODULE_INSTANCE_REQUESTS = new ArrayList();
    private InitializationState initializationState = InitializationState.NONE;
    private ModuleInterface module;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            iArr[InitializationState.READY.ordinal()] = 1;
            iArr[InitializationState.NONE.ordinal()] = 2;
            iArr[InitializationState.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected static /* synthetic */ void getMODULE_INSTANCE_REQUESTS$annotations() {
    }

    public final ModuleIdentity getIdentity() {
        ModuleInterface moduleInterface = this.module;
        ModuleIdentity moduleIdentity = moduleInterface == null ? null : moduleInterface.getModuleIdentity();
        if (moduleIdentity != null) {
            return moduleIdentity;
        }
        throw new C41223l("An operation is not implemented: " + "Your module must implement getIdentity().");
    }

    /* access modifiers changed from: protected */
    public final InitializationState getInitializationState() {
        return this.initializationState;
    }

    /* access modifiers changed from: protected */
    public final List<ModuleReadyHandler> getMODULE_INSTANCE_REQUESTS() {
        return this.MODULE_INSTANCE_REQUESTS;
    }

    /* access modifiers changed from: protected */
    public final ModuleInterface getModule() {
        return this.module;
    }

    public abstract String getName();

    public final JSONObject getState() {
        JSONObject jSONObject;
        JSONObject put;
        ModuleInterface moduleInterface = this.module;
        if (moduleInterface == null) {
            jSONObject = null;
        } else {
            jSONObject = moduleInterface.getState();
        }
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            int i = WhenMappings.$EnumSwitchMapping$0[getInitializationState().ordinal()];
            if (i == 2) {
                put = jSONObject2.put("INITIALIZATION_STATUS", "NOT IMPLEMENTED OR NOT INITIALIZED");
            } else if (i != 3) {
                put = jSONObject2.put("INITIALIZATION_STATUS", "NOT READY");
            } else {
                put = jSONObject2.put("INITIALIZATION_STATUS", "ERROR");
            }
            C41536l.m120488h(jSONObject, "JSONObject().run {\n    w…\", \"NOT READY\")\n    }\n  }");
        }
        return jSONObject;
    }

    public final void initModule(Context context, Config config, SFMCSdkComponents sFMCSdkComponents, ModuleReadyListener moduleReadyListener) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(config, "config");
        C41536l.m120489i(sFMCSdkComponents, "components");
        C41536l.m120489i(moduleReadyListener, "listener");
        try {
            sFMCSdkComponents.getExecutors().getDiskIO().execute(new Module$initModule$1(this, config, context, sFMCSdkComponents, moduleReadyListener, C41536l.m120497q(config.getModuleIdentifier().name(), "_init_thread"), new Object[0]));
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.mo31462w(getName(), e, new Module$initModule$2(this));
        } catch (Error e2) {
            SFMCSdkLogger.INSTANCE.mo31462w(getName(), e2, new Module$initModule$3(this));
        }
    }

    public final void requestModule(ModuleReadyListener moduleReadyListener) {
        C41536l.m120489i(moduleReadyListener, "listener");
        ModuleReadyHandler moduleReadyHandler = new ModuleReadyHandler(moduleReadyListener);
        synchronized (this.MODULE_INSTANCE_REQUESTS) {
            if (WhenMappings.$EnumSwitchMapping$0[getInitializationState().ordinal()] == 1) {
                try {
                    ModuleInterface module2 = getModule();
                    if (module2 != null) {
                        moduleReadyHandler.deliverModule(module2);
                        C41238w wVar = C41238w.f97225a;
                    }
                } catch (Exception e) {
                    SFMCSdkLogger.INSTANCE.mo31453e(PushModule.TAG, e, new Module$requestModule$1$2(moduleReadyHandler));
                    C41238w wVar2 = C41238w.f97225a;
                }
            } else {
                getMODULE_INSTANCE_REQUESTS().add(moduleReadyHandler);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setInitializationState(InitializationState initializationState2) {
        C41536l.m120489i(initializationState2, "<set-?>");
        this.initializationState = initializationState2;
    }

    /* access modifiers changed from: protected */
    public final void setModule(ModuleInterface moduleInterface) {
        this.module = moduleInterface;
    }

    public final void tearDown() {
        this.MODULE_INSTANCE_REQUESTS.clear();
        this.module = null;
        this.initializationState = InitializationState.NONE;
    }
}
