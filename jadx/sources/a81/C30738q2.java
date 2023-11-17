package a81;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p529ne.C16917a;

/* renamed from: a81.q2 */
public final /* synthetic */ class C30738q2 implements PushModuleReadyListener {
    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        pushModuleInterface.getRegionMessageManager().enableGeofenceMessaging();
    }
}
