package o50;

import android.content.Intent;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;

/* renamed from: o50.p */
public final /* synthetic */ class C26749p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PushNotificationHandlerActivity f67403d;

    /* renamed from: e */
    public final /* synthetic */ Intent f67404e;

    public /* synthetic */ C26749p(PushNotificationHandlerActivity pushNotificationHandlerActivity, Intent intent) {
        this.f67403d = pushNotificationHandlerActivity;
        this.f67404e = intent;
    }

    public final void run() {
        PushNotificationHandlerActivity.m72297R3(this.f67403d, this.f67404e);
    }
}
