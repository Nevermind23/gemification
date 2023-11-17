package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.messages.Message;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.internal.f */
public final class C11503f {

    /* renamed from: a */
    public static final C11504a f33423a = new C11504a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.f$a */
    public static final class C11504a {
        private C11504a() {
        }

        public /* synthetic */ C11504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Date mo30067a(Message message) {
            C41536l.m120489i(message, "message");
            return message.m124881lastShownDate();
        }

        /* renamed from: b */
        public final Date mo30070b(Message message) {
            C41536l.m120489i(message, "message");
            return message.m124883nextAllowedShow();
        }

        /* renamed from: c */
        public final int mo30073c(Message message) {
            C41536l.m120489i(message, "message");
            return message.m124885notificationId();
        }

        /* renamed from: d */
        public final int mo30075d(Message message) {
            C41536l.m120489i(message, "message");
            return message.m124887periodShowCount();
        }

        /* renamed from: e */
        public final int mo30076e(Message message) {
            C41536l.m120489i(message, "message");
            return message.m124889showCount();
        }

        /* renamed from: a */
        public final void mo30068a(Message message, int i) {
            C41536l.m120489i(message, "message");
            message.m124886notificationId(i);
        }

        /* renamed from: b */
        public final void mo30071b(Message message, int i) {
            C41536l.m120489i(message, "message");
            message.m124888periodShowCount(i);
        }

        /* renamed from: c */
        public final void mo30074c(Message message, int i) {
            C41536l.m120489i(message, "message");
            message.m124890showCount(i);
        }

        /* renamed from: a */
        public final void mo30069a(Message message, Date date) {
            C41536l.m120489i(message, "message");
            message.m124882lastShownDate(date);
        }

        /* renamed from: b */
        public final void mo30072b(Message message, Date date) {
            C41536l.m120489i(message, "message");
            message.m124884nextAllowedShow(date);
        }
    }

    /* renamed from: a */
    public static final Date m42034a(Message message) {
        return f33423a.mo30067a(message);
    }

    /* renamed from: b */
    public static final Date m42037b(Message message) {
        return f33423a.mo30070b(message);
    }

    /* renamed from: c */
    public static final int m42040c(Message message) {
        return f33423a.mo30073c(message);
    }

    /* renamed from: d */
    public static final int m42042d(Message message) {
        return f33423a.mo30075d(message);
    }

    /* renamed from: e */
    public static final int m42043e(Message message) {
        return f33423a.mo30076e(message);
    }

    /* renamed from: a */
    public static final void m42035a(Message message, int i) {
        f33423a.mo30068a(message, i);
    }

    /* renamed from: b */
    public static final void m42038b(Message message, int i) {
        f33423a.mo30071b(message, i);
    }

    /* renamed from: c */
    public static final void m42041c(Message message, int i) {
        f33423a.mo30074c(message, i);
    }

    /* renamed from: a */
    public static final void m42036a(Message message, Date date) {
        f33423a.mo30069a(message, date);
    }

    /* renamed from: b */
    public static final void m42039b(Message message, Date date) {
        f33423a.mo30072b(message, date);
    }
}
