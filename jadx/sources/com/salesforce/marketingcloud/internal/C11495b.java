package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.salesforce.marketingcloud.internal.b */
public final class C11495b {

    /* renamed from: a */
    public static final C11496a f33419a = new C11496a((DefaultConstructorMarker) null);

    /* renamed from: com.salesforce.marketingcloud.internal.b$a */
    public static final class C11496a {
        private C11496a() {
        }

        public /* synthetic */ C11496a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo30054a(InboxMessage inboxMessage) {
            C41536l.m120489i(inboxMessage, "message");
            return inboxMessage.m124977messageHash();
        }

        /* renamed from: b */
        public final String mo30056b(InboxMessage inboxMessage) {
            C41536l.m120489i(inboxMessage, "message");
            return inboxMessage.m124979requestId();
        }

        /* renamed from: c */
        public final int mo30058c(InboxMessage inboxMessage) {
            C41536l.m120489i(inboxMessage, "message");
            return inboxMessage.m124980viewCount();
        }

        /* renamed from: a */
        public final void mo30055a(InboxMessage inboxMessage, boolean z) {
            C41536l.m120489i(inboxMessage, "message");
            inboxMessage.m124960deleted(z);
        }

        /* renamed from: b */
        public final void mo30057b(InboxMessage inboxMessage, boolean z) {
            C41536l.m120489i(inboxMessage, "message");
            inboxMessage.m124975dirty(z);
        }

        /* renamed from: c */
        public final void mo30059c(InboxMessage inboxMessage, boolean z) {
            C41536l.m120489i(inboxMessage, "message");
            inboxMessage.m124978read(z);
        }
    }

    /* renamed from: a */
    public static final String m42008a(InboxMessage inboxMessage) {
        return f33419a.mo30054a(inboxMessage);
    }

    /* renamed from: b */
    public static final String m42010b(InboxMessage inboxMessage) {
        return f33419a.mo30056b(inboxMessage);
    }

    /* renamed from: c */
    public static final int m42012c(InboxMessage inboxMessage) {
        return f33419a.mo30058c(inboxMessage);
    }

    /* renamed from: a */
    public static final void m42009a(InboxMessage inboxMessage, boolean z) {
        f33419a.mo30055a(inboxMessage, z);
    }

    /* renamed from: b */
    public static final void m42011b(InboxMessage inboxMessage, boolean z) {
        f33419a.mo30057b(inboxMessage, z);
    }

    /* renamed from: c */
    public static final void m42013c(InboxMessage inboxMessage, boolean z) {
        f33419a.mo30059c(inboxMessage, z);
    }
}
