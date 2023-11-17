package p515me;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleReadyListener;
import kotlin.jvm.internal.C41536l;

/* renamed from: me.a */
public abstract /* synthetic */ class C16680a {
    /* renamed from: a */
    public static void m59021a(CdpModuleReadyListener cdpModuleReadyListener, ModuleInterface moduleInterface) {
        C41536l.m120489i(moduleInterface, "module");
        cdpModuleReadyListener.ready((CdpModuleInterface) moduleInterface);
    }
}
