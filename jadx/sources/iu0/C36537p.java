package iu0;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p529ne.C16917a;

/* renamed from: iu0.p */
public final /* synthetic */ class C36537p implements PushModuleReadyListener {
    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        pushModuleInterface.getRegionMessageManager().enableGeofenceMessaging();
    }
}
