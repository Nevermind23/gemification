package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.C11530k;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.internal.C11506h;
import com.salesforce.marketingcloud.messages.inbox.C11666a;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.C11695a;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.C11751c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189o0.C7357a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.push.a */
public class C11689a extends PushMessageManager implements C11419e, C11327b.C11329b {

    /* renamed from: t */
    static final String f33882t = "et_push_enabled";

    /* renamed from: u */
    private static final String f33883u = "last_push_token_refresh";

    /* renamed from: v */
    private static final String f33884v = "content-available";

    /* renamed from: w */
    private static final String f33885w = "_c";

    /* renamed from: x */
    private static final String f33886x = "_p";

    /* renamed from: y */
    private static final long f33887y = TimeUnit.HOURS.toMillis(48);

    /* renamed from: j */
    private final Context f33888j;

    /* renamed from: k */
    private final C11695a f33889k;

    /* renamed from: l */
    private final C11327b f33890l;

    /* renamed from: m */
    private final Set<PushMessageManager.SilentPushListener> f33891m = new ArraySet();

    /* renamed from: n */
    private final C11800j f33892n;

    /* renamed from: o */
    private final String f33893o;

    /* renamed from: p */
    private final Set<PushMessageManager.PushTokenRefreshListener> f33894p = new ArraySet();

    /* renamed from: q */
    private int f33895q;

    /* renamed from: r */
    private BroadcastReceiver f33896r;

    /* renamed from: s */
    private boolean f33897s;

    /* renamed from: com.salesforce.marketingcloud.messages.push.a$a */
    class C11690a extends BroadcastReceiver {
        C11690a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41891d(PushMessageManager.f33876d, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41891d(PushMessageManager.f33876d, "Received null action", new Object[0]);
            } else if (!action.equals(PushMessageManager.f33877e)) {
                C11461g.m41880a(PushMessageManager.f33876d, "Received unknown action: %s", action);
            } else {
                C11689a.this.mo30870a(intent.getExtras());
            }
        }
    }

    public C11689a(Context context, C11800j jVar, C11695a aVar, C11327b bVar, String str) {
        this.f33888j = (Context) C11821j.m43272a(context, "Content is null");
        this.f33892n = (C11800j) C11821j.m43272a(jVar, "Storage is null");
        this.f33889k = (C11695a) C11821j.m43272a(aVar, "NotificationManager is null");
        this.f33890l = (C11327b) C11821j.m43272a(bVar, "AlarmScheduler is null");
        this.f33893o = str;
    }

    /* renamed from: a */
    private static Bundle m42631a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (!map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
        }
        return bundle;
    }

    /* renamed from: b */
    private void m42635b() {
        this.f33896r = new C11690a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushMessageManager.f33877e);
        C7357a.m28044b(this.f33888j).mo21730c(this.f33896r, intentFilter);
    }

    /* renamed from: c */
    private void m42638c() {
        C11800j jVar = this.f33892n;
        if (jVar != null) {
            jVar.mo31608f().edit().putBoolean(f33882t, this.f33897s).apply();
        }
    }

    /* renamed from: d */
    private void m42640d(Map<String, String> map) {
        synchronized (this.f33891m) {
            for (PushMessageManager.SilentPushListener next : this.f33891m) {
                if (next != null) {
                    try {
                        next.silentPushReceived(map);
                    } catch (Exception e) {
                        C11461g.m41885b(PushMessageManager.f33876d, e, "%s threw an exception while processing the silent push message", next.getClass().getName());
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m42641e(Map<String, String> map) {
        if (map != null && !m42642f(map)) {
            C11404c.m41719a(this.f33888j, C11402a.BEHAVIOR_SDK_PUSH_RECEIVED, m42631a(map));
            if (C11530k.m42120a(map)) {
                C11461g.m41891d(PushMessageManager.f33876d, "Sync handler push received.", new Object[0]);
            } else if (!isPushEnabled()) {
                C11461g.m41880a(PushMessageManager.f33876d, "Push Messaging is disabled.  Ignoring message.", new Object[0]);
            } else if (map.containsKey(f33884v)) {
                m42637b(map);
            } else if (map.containsKey(f33885w)) {
                m42639c(map);
            } else {
                try {
                    NotificationMessage a = C11506h.m42056a(map);
                    if (TextUtils.isEmpty(a.alert().trim())) {
                        C11461g.m41880a(PushMessageManager.f33876d, "Message (%s) was received but does not have an alert message.", a.mo30925id());
                        return;
                    }
                    this.f33889k.mo30952a(a, (C11695a.C11697b) null);
                } catch (Exception e) {
                    C11461g.m41885b(PushMessageManager.f33876d, e, "Unable to show push notification", new Object[0]);
                }
            }
        }
    }

    /* renamed from: f */
    private boolean m42642f(Map<String, String> map) {
        if (C11398b.m41709a(this.f33895q, 4)) {
            C11461g.m41880a(PushMessageManager.f33876d, "Blocking push message.  Received a push message when the push feature is blocked.", new Object[0]);
            return true;
        } else if (!C11398b.m41709a(this.f33895q, 128) || !C11666a.m42585a(map)) {
            return false;
        } else {
            C11461g.m41880a(PushMessageManager.f33876d, "Blocking push message.  Received an inbox message when the inbox feature is blocked.", new Object[0]);
            return true;
        }
    }

    public String componentName() {
        return "PushMessageManager";
    }

    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pushEnabled", this.f33897s);
            synchronized (this.f33894p) {
                if (!this.f33894p.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (PushMessageManager.PushTokenRefreshListener next : this.f33894p) {
                        if (next != null) {
                            jSONArray.put(next.getClass().getName());
                        }
                    }
                    jSONObject.put("tokenRefreshListeners", jSONArray);
                }
            }
            jSONObject.put("debugInfo", getPushDebugInfo());
        } catch (JSONException e) {
            C11461g.m41885b(PushMessageManager.f33876d, e, "Unable to create component state for $s", componentName());
        }
        return jSONObject;
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, 4)) {
            disablePush();
            if (this.f33896r != null) {
                C7357a.m28044b(this.f33888j).mo21732e(this.f33896r);
            }
            C11327b bVar = this.f33890l;
            C11307a.C11309b bVar2 = C11307a.C11309b.FETCH_PUSH_TOKEN;
            bVar.mo29681e(bVar2);
            this.f33890l.mo29680d(bVar2);
            if (C11398b.m41711c(i, 4)) {
                C11751c c = this.f33892n.mo31606c();
                c.mo31110a(C11751c.f34089i);
                c.mo31110a(C11751c.f34085e);
            }
            this.f33895q = i;
        } else if (C11398b.m41709a(this.f33895q, 4)) {
            this.f33895q = i;
            m42635b();
            this.f33890l.mo29671a((C11327b.C11329b) this, C11307a.C11309b.FETCH_PUSH_TOKEN);
            enablePush();
            String str = this.f33893o;
            if (str != null) {
                MCService.m41387b(this.f33888j, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void disablePush() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f33897s     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            int r0 = r2.f33895q     // Catch:{ all -> 0x001c }
            r1 = 4
            boolean r0 = com.salesforce.marketingcloud.C11398b.m41709a(r0, r1)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            r0 = 0
            r2.f33897s = r0     // Catch:{ all -> 0x001c }
            r2.m42632a()     // Catch:{ all -> 0x001c }
            r2.m42638c()     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.push.C11689a.disablePush():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void enablePush() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f33897s     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x001a
            int r0 = r2.f33895q     // Catch:{ all -> 0x001c }
            r1 = 4
            boolean r0 = com.salesforce.marketingcloud.C11398b.m41709a(r0, r1)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            r0 = 1
            r2.f33897s = r0     // Catch:{ all -> 0x001c }
            r2.m42632a()     // Catch:{ all -> 0x001c }
            r2.m42638c()     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.push.C11689a.enablePush():void");
    }

    public JSONObject getPushDebugInfo() {
        try {
            return C11691b.m42648a(this.f33888j, this.f33893o, this.f33892n.mo31606c().mo31112b(C11751c.f34085e, (String) null));
        } catch (Exception e) {
            C11461g.m41885b(PushMessageManager.f33876d, e, "Unable to acquire push debug info.", new Object[0]);
            return new JSONObject();
        }
    }

    public String getPushToken() {
        return this.f33892n.mo31606c().mo31112b(C11751c.f34085e, (String) null);
    }

    public boolean handleMessage(RemoteMessage remoteMessage) {
        if (!PushMessageManager.isMarketingCloudPush(remoteMessage)) {
            C11461g.m41880a(PushMessageManager.f33876d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
            return false;
        }
        m42641e(remoteMessage.mo17546v());
        return true;
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        this.f33895q = i;
        if (C11398b.m41710b(i, 4)) {
            this.f33897s = this.f33892n.mo31608f().getBoolean(f33882t, true);
            m42635b();
            C11327b bVar = this.f33890l;
            C11307a.C11309b bVar2 = C11307a.C11309b.FETCH_PUSH_TOKEN;
            bVar.mo29671a((C11327b.C11329b) this, bVar2);
            String str = this.f33893o;
            if (str != null) {
                if (!str.equals(this.f33892n.mo31606c().mo31112b(C11751c.f34089i, (String) null))) {
                    C11461g.m41891d(PushMessageManager.f33876d, "Sender Id has changed.  Refresh system token.", new Object[0]);
                } else if (this.f33892n.mo31608f().getLong(f33883u, 0) + f33887y < System.currentTimeMillis()) {
                    C11461g.m41891d(PushMessageManager.f33876d, "Push token refresh cool down expired.  Refresh system token.", new Object[0]);
                } else {
                    return;
                }
                MCService.m41387b(this.f33888j, this.f33893o);
                return;
            }
            C11461g.m41880a(PushMessageManager.f33876d, "No sender id was provided during initialization.  You will not receive push messages until a token is manually set.", new Object[0]);
            this.f33890l.mo29680d(bVar2);
            this.f33892n.mo31606c().mo31110a(C11751c.f34089i);
        }
    }

    public synchronized boolean isPushEnabled() {
        return this.f33897s;
    }

    public void registerSilentPushListener(PushMessageManager.SilentPushListener silentPushListener) {
        if (silentPushListener != null) {
            synchronized (this.f33891m) {
                this.f33891m.add(silentPushListener);
            }
        }
    }

    public void registerTokenRefreshListener(PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        if (pushTokenRefreshListener != null) {
            synchronized (this.f33894p) {
                this.f33894p.add(pushTokenRefreshListener);
            }
        }
    }

    public void setPushToken(String str) {
        if (!C11398b.m41710b(this.f33895q, 4)) {
            return;
        }
        if (str == null) {
            C11461g.m41884b(PushMessageManager.f33876d, "Provided pushToken was null", new Object[0]);
            return;
        }
        if (this.f33893o != null) {
            C11461g.m41880a(PushMessageManager.f33876d, "Setting the SenderId during SDK initialization and setting the push token will cause conflicts in the system and could prevent the device from receiving push messages.", new Object[0]);
        }
        C11751c c = this.f33892n.mo31606c();
        c.mo31110a(C11751c.f34089i);
        c.mo31111a(C11751c.f34085e, str);
        this.f33890l.mo29680d(C11307a.C11309b.FETCH_PUSH_TOKEN);
        m42636b(str);
    }

    public void tearDown(boolean z) {
        if (this.f33896r != null) {
            C7357a.m28044b(this.f33888j).mo21732e(this.f33896r);
        }
    }

    public void unregisterSilentPushListener(PushMessageManager.SilentPushListener silentPushListener) {
        synchronized (this.f33891m) {
            this.f33891m.remove(silentPushListener);
        }
    }

    public void unregisterTokenRefreshListener(PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        synchronized (this.f33894p) {
            this.f33894p.remove(pushTokenRefreshListener);
        }
    }

    /* renamed from: a */
    private void m42632a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(PushMessageManager.f33880h, this.f33897s);
        C11404c.m41719a(this.f33888j, C11402a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, bundle);
    }

    /* renamed from: b */
    private void m42636b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(PushMessageManager.f33881i, str);
        C11404c.m41719a(this.f33888j, C11402a.BEHAVIOR_SDK_TOKEN_REFRESHED, bundle);
    }

    /* renamed from: c */
    private void m42639c(Map<String, String> map) {
        map.remove(f33885w);
        map.remove(f33886x);
        m42640d(map);
    }

    public boolean handleMessage(Map<String, String> map) {
        if (!PushMessageManager.isMarketingCloudPush(map)) {
            C11461g.m41880a(PushMessageManager.f33876d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
            return false;
        }
        m42641e(map);
        return true;
    }

    /* renamed from: a */
    public static void m42633a(Context context, boolean z, String str, String str2) {
        C7357a.m28044b(context).mo21731d(new Intent(PushMessageManager.f33877e).putExtra(PushMessageManager.f33878f, z).putExtra(PushMessageManager.f33879g, str).putExtra(PushMessageManager.f33881i, str2));
    }

    /* renamed from: b */
    private void m42637b(Map<String, String> map) {
        String str = map.get(f33884v);
        int i = 0;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (Exception e) {
                C11461g.m41885b(PushMessageManager.f33876d, e, "Unable to parse content available flag: %s", str);
            }
        }
        if (i == 1) {
            m42640d(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30870a(Bundle bundle) {
        C11751c c = this.f33892n.mo31606c();
        if (bundle.getBoolean(PushMessageManager.f33878f, false)) {
            String string = bundle.getString(PushMessageManager.f33881i, "");
            c.mo31111a(C11751c.f34085e, string);
            c.mo31111a(C11751c.f34089i, bundle.getString(PushMessageManager.f33879g, ""));
            m42636b(string);
            this.f33890l.mo29680d(C11307a.C11309b.FETCH_PUSH_TOKEN);
            this.f33892n.mo31608f().edit().putLong(f33883u, System.currentTimeMillis()).apply();
            m42634a(string);
            return;
        }
        c.mo31110a(C11751c.f34089i);
        this.f33890l.mo29675b(C11307a.C11309b.FETCH_PUSH_TOKEN);
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        String str;
        if (bVar == C11307a.C11309b.FETCH_PUSH_TOKEN && (str = this.f33893o) != null) {
            MCService.m41387b(this.f33888j, str);
        }
    }

    /* renamed from: a */
    private void m42634a(String str) {
        synchronized (this.f33894p) {
            for (PushMessageManager.PushTokenRefreshListener next : this.f33894p) {
                if (next != null) {
                    try {
                        next.onTokenRefreshed(str);
                    } catch (Exception e) {
                        C11461g.m41885b(PushMessageManager.f33876d, e, "%s threw an exception while processing the token refresh", next.getClass().getName());
                    }
                }
            }
        }
    }
}
