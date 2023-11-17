package com.salesforce.marketingcloud.messages.inbox;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11359g;
import com.salesforce.marketingcloud.http.C11474a;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.internal.C11495b;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.C11796h;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.storage.p385db.C11765g;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.messages.inbox.c */
class C11669c implements InboxMessageManager {

    /* renamed from: d */
    final C11800j f33826d;

    /* renamed from: e */
    final C11359g f33827e;

    /* renamed from: f */
    final C11481c f33828f;

    /* renamed from: g */
    final MarketingCloudConfig f33829g;

    /* renamed from: h */
    final String f33830h;

    /* renamed from: i */
    private final Set<InboxMessageManager.InboxResponseListener> f33831i = new ArraySet();

    /* renamed from: j */
    private final C11327b f33832j;

    /* renamed from: k */
    private final C11513l f33833k;

    /* renamed from: l */
    private final Object f33834l = new Object();

    /* renamed from: m */
    private InboxMessageManager.InboxRefreshListener f33835m;

    /* renamed from: n */
    private boolean f33836n;

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$a */
    class C11670a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33837b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11670a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f33837b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31555d(TextUtils.split(this.f33837b, ","));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$b */
    class C11671b implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a */
        final /* synthetic */ C11474a f33839a;

        C11671b(C11474a aVar) {
            this.f33839a = aVar;
        }

        public void ready(MarketingCloudSdk marketingCloudSdk) {
            C11669c cVar = C11669c.this;
            cVar.f33828f.mo30022a(this.f33839a.mo29979a(cVar.f33829g, cVar.f33826d.mo31606c(), C11474a.m41923b(C11669c.this.f33829g.applicationId(), C11669c.this.f33830h)));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$c */
    class C11672c extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11796h f33841b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11672c(String str, Object[] objArr, C11796h hVar) {
            super(str, objArr);
            this.f33841b = hVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            this.f33841b.mo31554d();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$d */
    class C11673d extends C11505g {

        /* renamed from: b */
        final /* synthetic */ InboxMessage f33842b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11673d(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.f33842b = inboxMessage;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31550a(this.f33842b, C11669c.this.f33826d.mo31604b());
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$e */
    class C11674e extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33844b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11674e(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f33844b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.setMessageRead(this.f33844b);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$f */
    class C11675f extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33846b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11675f(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f33846b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31552b(this.f33846b);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$g */
    class C11676g extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f33848b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11676g(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f33848b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31553c(this.f33848b);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$h */
    class C11677h extends C11505g {
        C11677h(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31560j();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$i */
    class C11678i extends C11505g {
        C11678i(String str, Object... objArr) {
            super(str, objArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            C11669c.this.f33826d.mo31620q().mo31551b();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$j */
    class C11679j implements Runnable {
        C11679j() {
        }

        public void run() {
            C11669c.this.mo30839b(false);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$k */
    class C11680k extends C11505g {

        /* renamed from: b */
        final /* synthetic */ List f33853b;

        /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$k$a */
        class C11681a implements Runnable {
            C11681a() {
            }

            public void run() {
                C11680k kVar = C11680k.this;
                C11669c.this.mo30835a((List<InboxMessage>) kVar.f33853b);
                C11669c.this.mo30839b(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11680k(String str, Object[] objArr, List list) {
            super(str, objArr);
            this.f33853b = list;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29760a() {
            /*
                r9 = this;
                com.salesforce.marketingcloud.messages.inbox.c r0 = com.salesforce.marketingcloud.messages.inbox.C11669c.this
                com.salesforce.marketingcloud.storage.j r0 = r0.f33826d
                com.salesforce.marketingcloud.storage.h r0 = r0.mo31620q()
                com.salesforce.marketingcloud.messages.inbox.c r1 = com.salesforce.marketingcloud.messages.inbox.C11669c.this
                com.salesforce.marketingcloud.storage.j r1 = r1.f33826d
                com.salesforce.marketingcloud.util.c r1 = r1.mo31604b()
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List r3 = r9.f33853b
                int r3 = r3.size()
                r2.<init>(r3)
                java.util.List r3 = r9.f33853b
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L_0x009f
                java.util.List r3 = r9.f33853b
                java.util.Iterator r3 = r3.iterator()
            L_0x0029:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x009f
                java.lang.Object r4 = r3.next()
                com.salesforce.marketingcloud.messages.inbox.InboxMessage r4 = (com.salesforce.marketingcloud.messages.inbox.InboxMessage) r4
                java.lang.String r5 = r4.mo30788id()
                r2.add(r5)
                java.lang.String r5 = r4.mo30788id()
                com.salesforce.marketingcloud.storage.h$b r5 = r0.mo31557e(r5)
                r6 = 1
                if (r5 == 0) goto L_0x0092
                java.lang.String r7 = r5.f34238b
                if (r7 != 0) goto L_0x0056
                boolean r7 = r5.f34241e
                com.salesforce.marketingcloud.internal.C11495b.m42009a(r4, r7)
                boolean r7 = r5.f34240d
                com.salesforce.marketingcloud.internal.C11495b.m42013c(r4, r7)
                goto L_0x0071
            L_0x0056:
                java.lang.String r8 = com.salesforce.marketingcloud.internal.C11495b.m42008a(r4)
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x0071
                boolean r7 = r5.f34241e
                com.salesforce.marketingcloud.internal.C11495b.m42009a(r4, r7)
                boolean r7 = r5.f34240d
                com.salesforce.marketingcloud.internal.C11495b.m42013c(r4, r7)
                java.util.Date r7 = r5.f34239c
                if (r7 != 0) goto L_0x006f
                goto L_0x0071
            L_0x006f:
                r7 = 0
                goto L_0x0072
            L_0x0071:
                r7 = r6
            L_0x0072:
                boolean r8 = r5.f34242f
                com.salesforce.marketingcloud.internal.C11495b.m42011b(r4, r8)
                int r8 = com.salesforce.marketingcloud.internal.C11495b.m42012c(r4)
                if (r8 <= 0) goto L_0x0080
                com.salesforce.marketingcloud.internal.C11495b.m42013c(r4, r6)
            L_0x0080:
                boolean r8 = r5.f34241e
                if (r8 != 0) goto L_0x008e
                boolean r5 = r5.f34240d
                if (r5 == 0) goto L_0x0091
                int r5 = com.salesforce.marketingcloud.internal.C11495b.m42012c(r4)
                if (r5 != 0) goto L_0x0091
            L_0x008e:
                com.salesforce.marketingcloud.internal.C11495b.m42011b(r4, r6)
            L_0x0091:
                r6 = r7
            L_0x0092:
                r0.mo31550a((com.salesforce.marketingcloud.messages.inbox.InboxMessage) r4, (com.salesforce.marketingcloud.util.C11808c) r1)
                if (r6 == 0) goto L_0x0029
                com.salesforce.marketingcloud.messages.inbox.c r5 = com.salesforce.marketingcloud.messages.inbox.C11669c.this
                com.salesforce.marketingcloud.analytics.g r5 = r5.f33827e
                r5.mo29781a(r4)
                goto L_0x0029
            L_0x009f:
                r0.mo31547a((java.util.List<java.lang.String>) r2)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.salesforce.marketingcloud.messages.inbox.c$k$a r1 = new com.salesforce.marketingcloud.messages.inbox.c$k$a
                r1.<init>()
                r0.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.C11669c.C11680k.mo29760a():void");
        }
    }

    C11669c(MarketingCloudConfig marketingCloudConfig, C11800j jVar, String str, C11327b bVar, C11481c cVar, C11359g gVar, C11513l lVar) {
        this.f33829g = marketingCloudConfig;
        this.f33826d = jVar;
        this.f33830h = str;
        this.f33832j = bVar;
        this.f33828f = cVar;
        this.f33827e = gVar;
        this.f33833k = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30829a() {
        this.f33836n = false;
        mo30841d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30836b() {
        this.f33836n = true;
        m42591a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject mo30840c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11765g.f34122e, this.f33826d.mo31620q().mo31559i(this.f33826d.mo31604b()));
            return jSONObject;
        } catch (JSONException e) {
            C11461g.m41885b(InboxMessageManager.TAG, e, "Failed to create our component state JSONObject.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30841d() {
        List<C11796h.C11798b> g = this.f33826d.mo31620q().mo31558g();
        int size = g.size();
        if (size > 0) {
            ArrayList arrayList = new ArrayList(size);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deviceId", this.f33830h);
                String a = C11824l.m43282a(new Date());
                for (C11796h.C11798b next : g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("actionParameters", jSONObject);
                    jSONObject2.put("messageId", next.f34237a);
                    jSONObject2.put("actionDate", a);
                    jSONObject2.put(UrlHandler.ACTION, next.f34241e ? "Deleted" : "Viewed");
                    jSONArray.put(jSONObject2);
                    arrayList.add(next.f34237a);
                }
                C11476b a2 = C11474a.INBOX_STATUS.mo29980a(this.f33829g, this.f33826d.mo31606c(), C11474a.m41920a(this.f33829g.applicationId()), jSONArray.toString());
                a2.mo29986a(TextUtils.join(",", arrayList));
                this.f33828f.mo30022a(a2);
            } catch (JSONException e) {
                C11461g.m41885b(InboxMessageManager.TAG, e, "Failed to create Inbox status payload.  Status updates not sent to Marketing Cloud", new Object[0]);
            }
        }
    }

    public void deleteMessage(InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            C11461g.m41884b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to deleteMessage() ignored.", new Object[0]);
            return;
        }
        C11495b.m42009a(inboxMessage, true);
        deleteMessage(inboxMessage.mo30788id());
    }

    public int getDeletedMessageCount() {
        return this.f33826d.mo31620q().mo31546a(C11796h.C11797a.DELETED);
    }

    public List<InboxMessage> getDeletedMessages() {
        return this.f33826d.mo31620q().mo31549a(this.f33826d.mo31604b(), C11796h.C11797a.DELETED);
    }

    public int getMessageCount() {
        return this.f33826d.mo31620q().mo31546a(C11796h.C11797a.NOT_DELETED);
    }

    public List<InboxMessage> getMessages() {
        return this.f33826d.mo31620q().mo31549a(this.f33826d.mo31604b(), C11796h.C11797a.NOT_DELETED);
    }

    public int getReadMessageCount() {
        return this.f33826d.mo31620q().mo31546a(C11796h.C11797a.READ);
    }

    public List<InboxMessage> getReadMessages() {
        return this.f33826d.mo31620q().mo31549a(this.f33826d.mo31604b(), C11796h.C11797a.READ);
    }

    public int getUnreadMessageCount() {
        return this.f33826d.mo31620q().mo31546a(C11796h.C11797a.UNREAD);
    }

    public List<InboxMessage> getUnreadMessages() {
        return this.f33826d.mo31620q().mo31549a(this.f33826d.mo31604b(), C11796h.C11797a.UNREAD);
    }

    public void markAllMessagesDeleted() {
        this.f33833k.mo30089b().execute(new C11678i("delete_all", new Object[0]));
    }

    public void markAllMessagesRead() {
        this.f33833k.mo30089b().execute(new C11677h("mark_all_read", new Object[0]));
    }

    public void refreshInbox(InboxMessageManager.InboxRefreshListener inboxRefreshListener) {
        synchronized (this.f33834l) {
            if (this.f33835m != null) {
                C11461g.m41891d(InboxMessageManager.TAG, "Refresh already in progress.", new Object[0]);
                inboxRefreshListener.onRefreshComplete(false);
                return;
            }
            this.f33835m = inboxRefreshListener;
            C11461g.m41891d(InboxMessageManager.TAG, "Refreshing inbox messages", new Object[0]);
            m42591a(true);
        }
    }

    public void registerInboxResponseListener(InboxMessageManager.InboxResponseListener inboxResponseListener) {
        if (inboxResponseListener != null) {
            synchronized (this.f33831i) {
                this.f33831i.add(inboxResponseListener);
            }
        }
    }

    public void setMessageRead(InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            C11461g.m41884b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to setMessageRead() ignored.", new Object[0]);
            return;
        }
        C11495b.m42013c(inboxMessage, true);
        setMessageRead(inboxMessage.mo30788id());
    }

    public void unregisterInboxResponseListener(InboxMessageManager.InboxResponseListener inboxResponseListener) {
        synchronized (this.f33831i) {
            this.f33831i.remove(inboxResponseListener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30830a(int i, String str) {
        C11461g.m41888c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i), str);
        new Handler(Looper.getMainLooper()).post(new C11679j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30837b(int i, String str) {
        C11461g.m41888c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i), str);
        this.f33832j.mo29675b(C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
    }

    public void deleteMessage(String str) {
        this.f33833k.mo30089b().execute(new C11675f("inbox_delete", new Object[0], str));
    }

    public void setMessageRead(String str) {
        this.f33833k.mo30089b().execute(new C11676g("mark_read", new Object[0], str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30831a(C11476b bVar) {
        if (bVar.mo30003q() != null) {
            this.f33832j.mo29676c(C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
            this.f33833k.mo30089b().execute(new C11670a("inbox_status_updated", new Object[0], bVar.mo30003q()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30838b(List<InboxMessage> list) {
        this.f33833k.mo30089b().execute(new C11680k("inbox_updated", new Object[0], list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30832a(C11486d dVar) {
        int length;
        try {
            JSONArray optJSONArray = new JSONObject(dVar.mo30026a()).optJSONArray(C11769i.f34134e);
            List emptyList = Collections.emptyList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                emptyList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    try {
                        emptyList.add(new InboxMessage(optJSONArray.getJSONObject(i)));
                    } catch (Exception e) {
                        C11461g.m41885b(InboxMessageManager.TAG, e, "Failed to parse inbox message", new Object[0]);
                    }
                }
            }
            mo30838b((List<InboxMessage>) emptyList);
        } catch (Exception e2) {
            C11461g.m41885b(InboxMessageManager.TAG, e2, "Failed to parse inbox messages response", new Object[0]);
            mo30830a(-1, "Failed to parse response");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30839b(boolean z) {
        synchronized (this.f33834l) {
            InboxMessageManager.InboxRefreshListener inboxRefreshListener = this.f33835m;
            if (inboxRefreshListener != null) {
                try {
                    inboxRefreshListener.onRefreshComplete(z);
                } catch (Exception e) {
                    C11461g.m41885b(InboxMessageManager.TAG, e, "InboxRefreshListener threw an exception", new Object[0]);
                }
                this.f33835m = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30833a(InboxMessage inboxMessage) {
        this.f33833k.mo30089b().execute(new C11673d("inbox_push_received", new Object[0], inboxMessage));
        if (this.f33836n) {
            m42591a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30834a(NotificationMessage notificationMessage) {
        if (this.f33829g.markMessageReadOnInboxNotificationOpen()) {
            this.f33833k.mo30089b().execute(new C11674e("inbox_notification_opened", new Object[0], notificationMessage.mo30925id()));
        }
    }

    /* renamed from: a */
    static void m42590a(C11800j jVar, C11327b bVar, C11513l lVar, boolean z) {
        bVar.mo29680d(C11307a.C11309b.UPDATE_INBOX_MESSAGE_STATUS);
        if (z) {
            lVar.mo30089b().execute(new C11672c("inbox_shutdown", new Object[0], jVar.mo31620q()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30835a(List<InboxMessage> list) {
        synchronized (this.f33831i) {
            if (!this.f33831i.isEmpty()) {
                for (InboxMessageManager.InboxResponseListener next : this.f33831i) {
                    if (next != null) {
                        try {
                            next.onInboxMessagesChanged(list);
                        } catch (Exception e) {
                            C11461g.m41885b(InboxMessageManager.TAG, e, "%s threw an exception while processing the inbox messages response", next.getClass().getName());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m42591a(boolean z) {
        MarketingCloudSdk.requestSdk(new C11671b(z ? C11474a.USER_INITIATED_INBOX_MESSAGE : C11474a.INBOX_MESSAGE));
    }
}
