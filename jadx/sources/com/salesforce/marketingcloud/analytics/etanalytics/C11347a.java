package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.salesforce.marketingcloud.analytics.C11340a;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.C11363i;
import com.salesforce.marketingcloud.internal.C11495b;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.C11800j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.a */
public class C11347a extends C11363i {

    /* renamed from: f */
    private static final int f32999f = 0;

    /* renamed from: d */
    private final C11800j f33000d;

    /* renamed from: e */
    private final C11513l f33001e;

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.a$a */
    class C11348a extends C11505g {

        /* renamed from: b */
        final /* synthetic */ C11800j f33002b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11348a(String str, Object[] objArr, C11800j jVar) {
            super(str, objArr);
            this.f33002b = jVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo29760a() {
            this.f33002b.mo31616m().mo31499b(0);
        }
    }

    public C11347a(C11800j jVar, C11513l lVar) {
        this.f33000d = jVar;
        this.f33001e = lVar;
    }

    /* renamed from: a */
    private static void m41488a(C11513l lVar, C11800j jVar) {
        lVar.mo30089b().execute(new C11348a("delete_analytics", new Object[0], jVar));
    }

    /* renamed from: b */
    public void mo29784b(NotificationMessage notificationMessage) {
        Region region = notificationMessage.region();
        if (!TextUtils.isEmpty(notificationMessage.mo30925id()) && region != null) {
            this.f33001e.mo30089b().execute(new C11340a(this.f33000d.mo31616m(), this.f33000d.mo31604b(), C11341b.m41461a(new Date(), 0, 3, Arrays.asList(new String[]{notificationMessage.mo30925id(), region.mo30395id()}), notificationMessage.requestId(), true)));
        }
    }

    /* renamed from: a */
    public void mo29781a(InboxMessage inboxMessage) {
        this.f33001e.mo30089b().execute(new C11340a(this.f33000d.mo31616m(), this.f33000d.mo31604b(), C11341b.m41461a(new Date(), 0, 14, Collections.singletonList(inboxMessage.mo30788id()), C11495b.m42010b(inboxMessage), true)));
    }

    /* renamed from: a */
    public void mo29782a(NotificationMessage notificationMessage, boolean z) {
        if (notificationMessage.region() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(notificationMessage.mo30925id());
            arrayList.add(notificationMessage.region().mo30395id());
            C11341b a = C11341b.m41461a(new Date(), 0, 17, arrayList, notificationMessage.requestId(), true);
            a.mo29766b(z ? 1 : 0);
            this.f33001e.mo30089b().execute(new C11340a(this.f33000d.mo31616m(), this.f33000d.mo31604b(), a));
        }
    }

    /* renamed from: a */
    public static void m41489a(C11800j jVar, C11513l lVar, boolean z) {
        if (z) {
            m41488a(lVar, jVar);
        }
    }

    /* renamed from: a */
    public void mo29783a(boolean z) {
        if (z) {
            m41488a(this.f33001e, this.f33000d);
        }
    }
}
