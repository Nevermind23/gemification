package p341ge.bog.mobilebank.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import iu0.C36546y;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.fcm.MyFirebaseMessagingService;

/* renamed from: ge.bog.mobilebank.util.NotificationListener */
public class NotificationListener extends BroadcastReceiver {
    /* renamed from: a */
    private void m106803a(Context context, boolean z, String str, Intent intent) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("ge.bog.mobilebank");
        launchIntentForPackage.putExtra("type", str);
        launchIntentForPackage.putExtra("STARTED_FROM_PUSH", true);
        launchIntentForPackage.putExtra("parameters", intent.getStringExtra("parameters"));
        context.startActivity(launchIntentForPackage);
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("type");
        String stringExtra3 = intent.getStringExtra("messageId");
        ArrayList n = MyFirebaseMessagingService.m75492n(stringExtra2, intent);
        boolean z = !TextUtils.isEmpty(stringExtra2);
        if (stringExtra != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        } else if (C36546y.m108285N() == null || C36546y.m108285N().mo89314L() == null) {
            m106803a(context, z, stringExtra2, intent);
        } else if (z) {
            try {
                Intent intent3 = new Intent("PUSH_NOTIF_INTENT");
                intent3.putExtra("PUSH_NOTIFS_OPEN", true);
                intent3.putExtra("messageId", stringExtra3);
                intent3.putExtra("type", stringExtra2);
                intent3.putExtra("parameters", C42035e.m122121c(n));
                C36546y.m108282F().mo27152s("push_notification", "open_app", stringExtra2);
                C36546y.m108285N().mo89314L().mo86427Q1(intent3);
            } catch (Exception unused) {
                m106803a(context, z, stringExtra2, intent);
            }
        } else {
            C36546y.m108282F().mo27152s("push_notification", "open_app", stringExtra2);
        }
    }
}
