package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.os.Handler;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import kotlin.jvm.internal.C41536l;

public final class ModuleReadyHandler extends Handler {
    private final ModuleReadyListener listener;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModuleReadyHandler(com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyHandler.<init>(com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: deliverModule$lambda-0  reason: not valid java name */
    public static final void m125025deliverModule$lambda0(ModuleReadyHandler moduleReadyHandler, ModuleInterface moduleInterface) {
        C41536l.m120489i(moduleReadyHandler, "this$0");
        C41536l.m120489i(moduleInterface, "$module");
        moduleReadyHandler.execute(moduleInterface, moduleReadyHandler.getListener());
    }

    private final void execute(ModuleInterface moduleInterface, ModuleReadyListener moduleReadyListener) {
        try {
            moduleReadyListener.ready(moduleInterface);
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.mo31453e("~$ModuleReadyHandler", e, new ModuleReadyHandler$execute$1(moduleInterface, moduleReadyListener));
        }
    }

    public final void deliverModule(ModuleInterface moduleInterface) {
        C41536l.m120489i(moduleInterface, "module");
        post(new C11746c(this, moduleInterface));
    }

    public final ModuleReadyListener getListener() {
        return this.listener;
    }
}
