package com.salesforce.marketingcloud.analytics;

import com.salesforce.marketingcloud.analytics.C11366l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.i */
public abstract class C11363i implements C11364j, C11365k, AnalyticsManager, C11359g, C11358f, C11368m, C11369n, C11366l {
    /* renamed from: a */
    public void mo29785a(long j) {
    }

    /* renamed from: a */
    public abstract void mo29783a(boolean z);

    /* renamed from: b */
    public void mo29788b(long j) {
    }

    /* renamed from: c */
    public void mo29790c(long j) {
    }

    public String getPiIdentifier() {
        return null;
    }

    public void setPiIdentifier(String str) {
    }

    public void trackCartContents(PiCart piCart) {
    }

    public void trackCartConversion(PiOrder piOrder) {
    }

    public void trackInboxOpenEvent(InboxMessage inboxMessage) {
    }

    public final void trackPageView(String str) {
        trackPageView(str, (String) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo29800a(C11346e eVar, Event... eventArr) {
    }

    /* renamed from: b */
    public void mo29789b(Region region) {
    }

    public final void trackPageView(String str, String str2) {
        trackPageView(str, str2, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo29801a(C11366l.C11367a aVar, JSONObject jSONObject) {
    }

    /* renamed from: b */
    public void mo29799b(InAppMessage inAppMessage) {
    }

    public final void trackPageView(String str, String str2, String str3) {
        trackPageView(str, str2, str3, (String) null);
    }

    /* renamed from: a */
    public void mo29786a(Region region) {
    }

    /* renamed from: b */
    public void mo29784b(NotificationMessage notificationMessage) {
    }

    public void trackPageView(String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public void mo29795a(InAppMessage inAppMessage) {
    }

    /* renamed from: b */
    public void mo29804b(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public void mo29796a(InAppMessage inAppMessage, C11651j jVar) {
    }

    /* renamed from: a */
    public void mo29797a(InAppMessage inAppMessage, JSONObject jSONObject) {
    }

    /* renamed from: a */
    public void mo29781a(InboxMessage inboxMessage) {
    }

    /* renamed from: a */
    public void mo29787a(NotificationMessage notificationMessage) {
    }

    /* renamed from: a */
    public void mo29782a(NotificationMessage notificationMessage, boolean z) {
    }

    /* renamed from: a */
    public void mo29802a(String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public void mo29798a(String str, String str2, List<String> list) {
    }

    /* renamed from: a */
    public void mo29803a(JSONObject jSONObject) {
    }
}
