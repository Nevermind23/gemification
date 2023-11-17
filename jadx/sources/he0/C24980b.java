package he0;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p341ge.bog.mobilebank.fcm.MyFirebaseMessagingService;
import p529ne.C16917a;

/* renamed from: he0.b */
public final /* synthetic */ class C24980b implements PushModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ String f64305a;

    public /* synthetic */ C24980b(String str) {
        this.f64305a = str;
    }

    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        MyFirebaseMessagingService.m75495q(this.f64305a, pushModuleInterface);
    }
}
