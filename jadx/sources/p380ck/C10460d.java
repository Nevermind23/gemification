package p380ck;

import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p529ne.C16917a;

/* renamed from: ck.d */
public final /* synthetic */ class C10460d implements PushModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ PiCart f29790a;

    public /* synthetic */ C10460d(PiCart piCart) {
        this.f29790a = piCart;
    }

    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        pushModuleInterface.getAnalyticsManager().trackCartContents(this.f29790a);
    }
}
