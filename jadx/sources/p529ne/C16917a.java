package p529ne;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import kotlin.jvm.internal.C41536l;

/* renamed from: ne.a */
public abstract /* synthetic */ class C16917a {
    /* renamed from: a */
    public static void m59517a(PushModuleReadyListener pushModuleReadyListener, ModuleInterface moduleInterface) {
        C41536l.m120489i(moduleInterface, "module");
        pushModuleReadyListener.ready((PushModuleInterface) moduleInterface);
    }
}
