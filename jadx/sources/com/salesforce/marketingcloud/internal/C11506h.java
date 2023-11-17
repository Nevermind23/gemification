package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.internal.h */
public final class C11506h {

    /* renamed from: a */
    public static final C11507a f33425a = new C11507a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.h$a */
    public static final class C11507a {
        private C11507a() {
        }

        public /* synthetic */ C11507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NotificationMessage mo30078a(Message message, Region region) {
            C41536l.m120489i(message, "message");
            C41536l.m120489i(region, "region");
            return NotificationMessage.Companion.mo30942a(message, region);
        }

        /* renamed from: a */
        public final NotificationMessage mo30079a(Map<String, String> map) {
            C41536l.m120489i(map, "data");
            return NotificationMessage.Companion.mo30943a(map);
        }

        /* renamed from: a */
        public final void mo30080a(NotificationMessage notificationMessage, int i) {
            C41536l.m120489i(notificationMessage, "message");
            notificationMessage.setNotificationId$sdk_release(i);
        }
    }

    /* renamed from: a */
    public static final NotificationMessage m42055a(Message message, Region region) {
        return f33425a.mo30078a(message, region);
    }

    /* renamed from: a */
    public static final NotificationMessage m42056a(Map<String, String> map) {
        return f33425a.mo30079a(map);
    }

    /* renamed from: a */
    public static final void m42057a(NotificationMessage notificationMessage, int i) {
        f33425a.mo30080a(notificationMessage, i);
    }
}
