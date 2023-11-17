package p318y0;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.C41536l;

/* renamed from: y0.c */
public final class C8992c {

    /* renamed from: a */
    public static final C8992c f25024a = new C8992c();

    private C8992c() {
    }

    /* renamed from: a */
    public static final Uri m33284a(Cursor cursor) {
        C41536l.m120489i(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        C41536l.m120488h(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    /* renamed from: b */
    public static final boolean m33285b(ActivityManager activityManager) {
        C41536l.m120489i(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
