package com.salesforce.marketingcloud.messages.inbox;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11359g;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.notifications.C11695a;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.inbox.a */
public class C11666a implements C11419e, InboxMessageManager, C11403b, C11481c.C11484c, C11327b.C11329b {

    /* renamed from: m */
    private static final String f33813m = "8";

    /* renamed from: d */
    private final MarketingCloudConfig f33814d;

    /* renamed from: e */
    private final C11800j f33815e;

    /* renamed from: f */
    private final String f33816f;

    /* renamed from: g */
    private final C11404c f33817g;

    /* renamed from: h */
    private final C11327b f33818h;

    /* renamed from: i */
    private final C11481c f33819i;

    /* renamed from: j */
    private final C11359g f33820j;

    /* renamed from: k */
    private C11669c f33821k;

    /* renamed from: l */
    private C11513l f33822l;

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.a$a */
    static /* synthetic */ class C11667a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33823a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33824b;

        /* renamed from: c */
        static final /* synthetic */ int[] f33825c;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
                com.salesforce.marketingcloud.alarms.a$b[] r0 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33825c = r0
                r1 = 1
                com.salesforce.marketingcloud.alarms.a$b r2 = com.salesforce.marketingcloud.alarms.C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.salesforce.marketingcloud.http.a[] r0 = com.salesforce.marketingcloud.http.C11474a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33824b = r0
                com.salesforce.marketingcloud.http.a r2 = com.salesforce.marketingcloud.http.C11474a.INBOX_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r0 = 2
                int[] r2 = f33824b     // Catch:{ NoSuchFieldError -> 0x002e }
                com.salesforce.marketingcloud.http.a r3 = com.salesforce.marketingcloud.http.C11474a.USER_INITIATED_INBOX_MESSAGE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                r2 = 3
                int[] r3 = f33824b     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.salesforce.marketingcloud.http.a r4 = com.salesforce.marketingcloud.http.C11474a.INBOX_STATUS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                com.salesforce.marketingcloud.behaviors.a[] r3 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f33823a = r3
                com.salesforce.marketingcloud.behaviors.a r4 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_FOREGROUNDED     // Catch:{ NoSuchFieldError -> 0x004a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004a }
            L_0x004a:
                int[] r1 = f33823a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.salesforce.marketingcloud.behaviors.a r3 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_BACKGROUNDED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f33823a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_SDK_PUSH_RECEIVED     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f33823a     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_SDK_NOTIFICATION_OPENED     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.C11666a.C11667a.<clinit>():void");
        }
    }

    public C11666a(MarketingCloudConfig marketingCloudConfig, C11800j jVar, String str, C11404c cVar, C11327b bVar, C11481c cVar2, C11513l lVar, C11359g gVar) {
        this.f33814d = (MarketingCloudConfig) C11821j.m43272a(marketingCloudConfig, "MarketingCloudConfig is null.");
        this.f33815e = (C11800j) C11821j.m43272a(jVar, "Storage is null.");
        this.f33816f = (String) C11821j.m43271a(str, "You must provide the Device ID.");
        this.f33817g = (C11404c) C11821j.m43272a(cVar, "BehaviorManager is null.");
        this.f33818h = (C11327b) C11821j.m43272a(bVar, "AlarmScheduler is null.");
        this.f33819i = (C11481c) C11821j.m43272a(cVar2, "RequestManager is null.");
        this.f33820j = (C11359g) C11821j.m43272a(gVar, "InboxAnalyticEventListener is null.");
        this.f33822l = lVar;
    }

    /* renamed from: a */
    private void m42583a() {
        this.f33821k = new C11669c(this.f33814d, this.f33815e, this.f33816f, this.f33818h, this.f33819i, this.f33820j, this.f33822l);
        this.f33819i.mo30021a(C11474a.INBOX_MESSAGE, (C11481c.C11484c) this);
        this.f33819i.mo30021a(C11474a.USER_INITIATED_INBOX_MESSAGE, (C11481c.C11484c) this);
        this.f33819i.mo30021a(C11474a.INBOX_STATUS, (C11481c.C11484c) this);
        this.f33818h.mo29671a((C11327b.C11329b) this, C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
        this.f33817g.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_APP_FOREGROUNDED, C11402a.BEHAVIOR_SDK_PUSH_RECEIVED, C11402a.BEHAVIOR_APP_BACKGROUNDED, C11402a.BEHAVIOR_SDK_NOTIFICATION_OPENED));
    }

    public final String componentName() {
        return "InboxMessageManager";
    }

    public JSONObject componentState() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.mo30840c();
        }
        return null;
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, 128)) {
            this.f33821k = null;
            C11669c.m42590a(this.f33815e, this.f33818h, this.f33822l, C11398b.m41711c(i, 128));
            this.f33817g.mo29850a((C11403b) this);
            this.f33818h.mo29681e(C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
            this.f33819i.mo30020a(C11474a.INBOX_MESSAGE);
            this.f33819i.mo30020a(C11474a.USER_INITIATED_INBOX_MESSAGE);
            this.f33819i.mo30020a(C11474a.INBOX_STATUS);
        } else if (this.f33821k == null && this.f33814d.inboxEnabled()) {
            m42583a();
        }
    }

    public void deleteMessage(InboxMessage inboxMessage) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.deleteMessage(inboxMessage);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to deleteMessage() was ignored.", new Object[0]);
        }
    }

    public int getDeletedMessageCount() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getDeletedMessageCount();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getDeletedMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    public List<InboxMessage> getDeletedMessages() {
        List<InboxMessage> emptyList = Collections.emptyList();
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getDeletedMessages();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getDeletedMessages() was ignored.", new Object[0]);
        return emptyList;
    }

    public int getMessageCount() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getMessageCount();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    public List<InboxMessage> getMessages() {
        List<InboxMessage> emptyList = Collections.emptyList();
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getMessages();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getMessages() was ignored.", new Object[0]);
        return emptyList;
    }

    public int getReadMessageCount() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getReadMessageCount();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getReadMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    public List<InboxMessage> getReadMessages() {
        List<InboxMessage> emptyList = Collections.emptyList();
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getReadMessages();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getReadMessages() was ignored.", new Object[0]);
        return emptyList;
    }

    public int getUnreadMessageCount() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getUnreadMessageCount();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getUnreadMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    public List<InboxMessage> getUnreadMessages() {
        List<InboxMessage> emptyList = Collections.emptyList();
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            return cVar.getUnreadMessages();
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getUnreadMessages() was ignored.", new Object[0]);
        return emptyList;
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        if (C11398b.m41710b(i, 128) && this.f33814d.inboxEnabled()) {
            m42583a();
        }
    }

    public void markAllMessagesDeleted() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.markAllMessagesDeleted();
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to markAllMessagesDeleted() was ignored.", new Object[0]);
        }
    }

    public void markAllMessagesRead() {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.markAllMessagesRead();
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to markAllMessagesRead() was ignored.", new Object[0]);
        }
    }

    public void onBehavior(C11402a aVar, Bundle bundle) {
        NotificationMessage notificationMessage;
        if (this.f33821k != null) {
            int i = C11667a.f33823a[aVar.ordinal()];
            if (i == 1) {
                this.f33821k.mo30836b();
            } else if (i == 2) {
                this.f33821k.mo30829a();
            } else if (i != 3) {
                if (i == 4 && (notificationMessage = (NotificationMessage) bundle.get(C11695a.f33907o)) != null) {
                    this.f33821k.mo30834a(notificationMessage);
                }
            } else if (m42584a(bundle)) {
                try {
                    this.f33821k.mo30833a(new InboxMessage(bundle));
                } catch (Exception e) {
                    C11461g.m41885b(InboxMessageManager.TAG, e, "Failed to seed inbox_messages table with message: %s.", bundle.getString(NotificationMessage.NOTIF_KEY_ID));
                }
            }
        }
    }

    public void refreshInbox(InboxMessageManager.InboxRefreshListener inboxRefreshListener) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.refreshInbox(inboxRefreshListener);
            return;
        }
        C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to refreshInbox() was ignored.", new Object[0]);
        if (inboxRefreshListener != null) {
            try {
                inboxRefreshListener.onRefreshComplete(false);
            } catch (Exception unused) {
                C11461g.m41884b(InboxMessageManager.TAG, "InboxRefreshListener threw an exception.", new Object[0]);
            }
        }
    }

    public void registerInboxResponseListener(InboxMessageManager.InboxResponseListener inboxResponseListener) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.registerInboxResponseListener(inboxResponseListener);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to registerInboxResponseListener() was ignored.", new Object[0]);
        }
    }

    public void setMessageRead(InboxMessage inboxMessage) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.setMessageRead(inboxMessage);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to setMessageRead() was ignored.", new Object[0]);
        }
    }

    public void tearDown(boolean z) {
        C11327b bVar = this.f33818h;
        if (bVar != null) {
            bVar.mo29681e(C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
        }
        C11404c cVar = this.f33817g;
        if (cVar != null) {
            cVar.mo29850a((C11403b) this);
        }
    }

    public void unregisterInboxResponseListener(InboxMessageManager.InboxResponseListener inboxResponseListener) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.unregisterInboxResponseListener(inboxResponseListener);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to unregisterInboxResponseListener() was ignored.", new Object[0]);
        }
    }

    C11666a(C11669c cVar) {
        this.f33814d = null;
        this.f33815e = null;
        this.f33816f = null;
        this.f33817g = null;
        this.f33818h = null;
        this.f33819i = null;
        this.f33820j = null;
        this.f33821k = cVar;
    }

    /* renamed from: a */
    public void mo29684a(C11307a.C11309b bVar) {
        if (this.f33821k != null && C11667a.f33825c[bVar.ordinal()] == 1) {
            this.f33821k.mo30841d();
        }
    }

    public void deleteMessage(String str) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.deleteMessage(str);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to deleteMessage() was ignored.", new Object[0]);
        }
    }

    public void setMessageRead(String str) {
        C11669c cVar = this.f33821k;
        if (cVar != null) {
            cVar.setMessageRead(str);
        } else {
            C11461g.m41894e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to setMessageRead() was ignored.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo29793a(C11476b bVar, C11486d dVar) {
        if (this.f33821k != null) {
            int i = C11667a.f33824b[bVar.mo30002p().ordinal()];
            if (i == 1 || i == 2) {
                if (dVar.mo30033g()) {
                    this.f33821k.mo30832a(dVar);
                } else {
                    this.f33821k.mo30830a(dVar.mo30027b(), dVar.mo30031e());
                }
            } else if (i == 3) {
                if (dVar.mo30033g()) {
                    this.f33821k.mo30831a(bVar);
                } else {
                    this.f33821k.mo30837b(dVar.mo30027b(), dVar.mo30031e());
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m42584a(Bundle bundle) {
        return f33813m.equals(bundle.getString(NotificationMessage.NOTIF_KEY_MESSAGE_TYPE));
    }

    /* renamed from: a */
    public static boolean m42585a(Map<String, String> map) {
        return f33813m.equals(map.get(NotificationMessage.NOTIF_KEY_MESSAGE_TYPE));
    }
}
