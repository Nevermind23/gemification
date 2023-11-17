package p341ge.bog.mobilebank.fcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.core.app.C0750x;
import androidx.core.content.C0767a;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32313j0;
import g91.C32359z0;
import he0.C24979a;
import he0.C24980b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p130j6.C6731g;
import p130j6.C6732h;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.util.NotificationListener;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.fcm.MyFirebaseMessagingService */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: e */
    public static final C23335a f61066e = new C23335a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final int f61067d = C10320i.ic_notification;

    /* renamed from: ge.bog.mobilebank.fcm.MyFirebaseMessagingService$a */
    public static final class C23335a {
        private C23335a() {
        }

        public /* synthetic */ C23335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final ArrayList m75497b(String str) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                KeyValue keyValue = new KeyValue();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("key")) {
                    keyValue.setKey(jSONObject.getString("key"));
                    if (jSONObject.has(C11755a.C11756a.f34100b)) {
                        keyValue.setValue(jSONObject.getString(C11755a.C11756a.f34100b));
                    } else {
                        keyValue.setValue("");
                    }
                    arrayList.add(keyValue);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final ArrayList mo59090a(String str, Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent != null && C32313j0.f79742b.contains(str)) {
                try {
                    arrayList.addAll(m75497b(intent.getStringExtra("parameters")));
                } catch (Exception unused) {
                }
            }
            return arrayList;
        }
    }

    /* renamed from: n */
    public static final ArrayList m75492n(String str, Intent intent) {
        return f61066e.mo59090a(str, intent);
    }

    /* renamed from: o */
    private final void m75493o(RemoteMessage remoteMessage) {
        String clientKey = PreferencesApiManager.getInstance().getClientKey();
        if (clientKey != null && C40439w.m117116t((String) remoteMessage.mo17546v().get("contactkey"), clientKey, false, 2, (Object) null)) {
            Map v = remoteMessage.mo17546v();
            C41536l.m120488h(v, "message.data");
            v.put("messageId", remoteMessage.mo17546v().get(NotificationMessage.NOTIF_KEY_SID));
            Map v2 = remoteMessage.mo17546v();
            C41536l.m120488h(v2, "message.data");
            m75496r((String) remoteMessage.mo17546v().get("title"), (String) remoteMessage.mo17546v().get("alert"), v2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m75494p(String str, SFMCSdk sFMCSdk) {
        C41536l.m120489i(str, "$token");
        C41536l.m120489i(sFMCSdk, "sdk");
        sFMCSdk.mo31149mp(new C24980b(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m75495q(String str, PushModuleInterface pushModuleInterface) {
        C41536l.m120489i(str, "$token");
        C41536l.m120489i(pushModuleInterface, "it");
        pushModuleInterface.getPushMessageManager().setPushToken(str);
    }

    /* renamed from: r */
    private final void m75496r(String str, String str2, Map map) {
        Intent intent = new Intent("PUSH_NOTIF_INTENT");
        intent.setClass(getApplicationContext(), NotificationListener.class);
        intent.putExtra("parameters", (String) map.get("parameters"));
        intent.putExtra("type", (String) map.get("type"));
        intent.putExtra("messageId", (String) map.get("messageId"));
        intent.putExtra("link", (String) map.get(NotificationMessage.NOTIF_KEY_OPEN_DIRECT_URL));
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 167772160);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        int i = C10328q.default_notification_channel_id;
        C0750x.C0759e v = new C0750x.C0759e(this, getString(i)).mo3229v(this.f61067d);
        if (str == null) {
            str = getString(C10328q.application_name);
            C41536l.m120488h(str, "getString(R.string.application_name)");
        }
        C0750x.C0759e w = v.mo3219k(str).mo3218j(str2).mo3231x(new C0750x.C0756c().mo3207h(str2)).mo3214f(true).mo3230w(defaultUri);
        Context applicationContext = getApplicationContext();
        int i2 = C10318g.color_accent_retail;
        C0750x.C0759e i3 = w.mo3223p(C0767a.m2893c(applicationContext, i2), 500, 500).mo3216h(C0767a.m2893c(getApplicationContext(), i2)).mo3217i(broadcast);
        C41536l.m120488h(i3, "Builder(this, getString(…tentIntent(pendingIntent)");
        Object systemService = getSystemService("notification");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (C32359z0.m95586p()) {
            C6732h.m26251a();
            notificationManager.createNotificationChannel(C6731g.m26250a(getString(i), getString(i), 3));
        }
        notificationManager.notify(0, i3.mo3212b());
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        C41536l.m120489i(remoteMessage, "remoteMessage");
        if (PushMessageManager.isMarketingCloudPush(remoteMessage)) {
            m75493o(remoteMessage);
            return;
        }
        RemoteMessage.C5301b w = remoteMessage.mo17547w();
        if (w != null) {
            String c = w.mo17550c();
            String a = w.mo17549a();
            Map v = remoteMessage.mo17546v();
            C41536l.m120488h(v, "remoteMessage.data");
            m75496r(c, a, v);
        }
    }

    public void onNewToken(String str) {
        C41536l.m120489i(str, "token");
        PreferencesApiManager.getInstance().saveFcmToken(str);
        SFMCSdk.Companion.requestSdk(new C24979a(str));
    }
}
