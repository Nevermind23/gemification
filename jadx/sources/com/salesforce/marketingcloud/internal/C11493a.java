package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.internal.a */
public final class C11493a {

    /* renamed from: a */
    public static final C11494a f33418a = new C11494a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.a$a */
    public static final class C11494a {
        private C11494a() {
        }

        public /* synthetic */ C11494a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InAppMessage.CloseButton mo30051a() {
            return InAppMessage.CloseButton.Companion.mo30588a();
        }

        /* renamed from: b */
        public final JSONObject mo30053b(InAppMessage inAppMessage) {
            C41536l.m120489i(inAppMessage, "message");
            return inAppMessage.m124932toJson();
        }

        /* renamed from: a */
        public final String mo30052a(InAppMessage inAppMessage) {
            C41536l.m120489i(inAppMessage, "message");
            return inAppMessage.m124911activityInstanceId();
        }
    }

    /* renamed from: a */
    public static final InAppMessage.CloseButton m42002a() {
        return f33418a.mo30051a();
    }

    /* renamed from: b */
    public static final JSONObject m42004b(InAppMessage inAppMessage) {
        return f33418a.mo30053b(inAppMessage);
    }

    /* renamed from: a */
    public static final String m42003a(InAppMessage inAppMessage) {
        return f33418a.mo30052a(inAppMessage);
    }
}
