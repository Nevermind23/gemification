package p397dm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.activities.LauncherActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: dm.c */
public final class C12325c extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(intent, "intent");
        if (C41536l.m120484d(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            if (context instanceof Activity) {
                ((Activity) context).finishAffinity();
            }
            PendingIntent activity = PendingIntent.getActivity(context, 123455, new Intent(context, LauncherActivity.class), 301989888);
            Object systemService = context.getSystemService("alarm");
            C41536l.m120487g(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).set(1, System.currentTimeMillis() + ((long) BogInputLayout.INPUT_NORMAL_STATE), activity);
            System.exit(0);
        }
    }
}
