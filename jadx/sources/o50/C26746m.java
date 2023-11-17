package o50;

import android.content.Intent;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;

/* renamed from: o50.m */
public final /* synthetic */ class C26746m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PushNotificationHandlerActivity f67399d;

    /* renamed from: e */
    public final /* synthetic */ Intent f67400e;

    public /* synthetic */ C26746m(PushNotificationHandlerActivity pushNotificationHandlerActivity, Intent intent) {
        this.f67399d = pushNotificationHandlerActivity;
        this.f67400e = intent;
    }

    public final void run() {
        PushNotificationHandlerActivity.m72304T3(this.f67399d, this.f67400e);
    }
}
