package a81;

import p341ge.bog.mobilebank.eventbus.events.NotificationCountEvent;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;

/* renamed from: a81.j4 */
public final /* synthetic */ class C30649j4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainActivity f76657d;

    /* renamed from: e */
    public final /* synthetic */ NotificationCountEvent f76658e;

    public /* synthetic */ C30649j4(MainActivity mainActivity, NotificationCountEvent notificationCountEvent) {
        this.f76657d = mainActivity;
        this.f76658e = notificationCountEvent;
    }

    public final void run() {
        this.f76657d.m103798g6(this.f76658e);
    }
}
