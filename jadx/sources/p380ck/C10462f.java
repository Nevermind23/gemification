package p380ck;

import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.analytics.PiOrder;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p529ne.C16917a;

/* renamed from: ck.f */
public final /* synthetic */ class C10462f implements PushModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ PiCart f29792a;

    public /* synthetic */ C10462f(PiCart piCart) {
        this.f29792a = piCart;
    }

    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        pushModuleInterface.getAnalyticsManager().trackCartConversion(new PiOrder(this.f29792a, "", Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON));
    }
}
