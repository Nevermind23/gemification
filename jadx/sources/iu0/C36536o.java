package iu0;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import p529ne.C16917a;

/* renamed from: iu0.o */
public final /* synthetic */ class C36536o implements PushModuleReadyListener {

    /* renamed from: a */
    public final /* synthetic */ String f88042a;

    public /* synthetic */ C36536o(String str) {
        this.f88042a = str;
    }

    public /* synthetic */ void ready(ModuleInterface moduleInterface) {
        C16917a.m59517a(this, moduleInterface);
    }

    public final void ready(PushModuleInterface pushModuleInterface) {
        pushModuleInterface.getPushMessageManager().setPushToken(this.f88042a);
    }
}
