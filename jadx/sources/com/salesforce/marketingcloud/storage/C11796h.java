package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.Date;
import java.util.List;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.h */
public interface C11796h {

    /* renamed from: com.salesforce.marketingcloud.storage.h$a */
    public enum C11797a {
        UNREAD,
        READ,
        DELETED,
        NOT_DELETED
    }

    /* renamed from: com.salesforce.marketingcloud.storage.h$b */
    public static class C11798b {

        /* renamed from: a */
        public final String f34237a;

        /* renamed from: b */
        public final String f34238b;

        /* renamed from: c */
        public final Date f34239c;

        /* renamed from: d */
        public final boolean f34240d;

        /* renamed from: e */
        public final boolean f34241e;

        /* renamed from: f */
        public final boolean f34242f;

        public C11798b(String str, String str2, Date date, boolean z, boolean z2, boolean z3) {
            this.f34237a = str;
            this.f34238b = str2;
            this.f34239c = date;
            this.f34240d = z;
            this.f34241e = z2;
            this.f34242f = z3;
        }
    }

    /* renamed from: a */
    int mo31546a(C11797a aVar);

    /* renamed from: a */
    int mo31547a(List<String> list);

    /* renamed from: a */
    InboxMessage mo31548a(String str, C11808c cVar);

    /* renamed from: a */
    List<InboxMessage> mo31549a(C11808c cVar, C11797a aVar);

    /* renamed from: a */
    void mo31550a(InboxMessage inboxMessage, C11808c cVar);

    /* renamed from: b */
    void mo31551b();

    /* renamed from: b */
    void mo31552b(String str);

    /* renamed from: c */
    void mo31553c(String str);

    /* renamed from: d */
    int mo31554d();

    /* renamed from: d */
    void mo31555d(String[] strArr);

    /* renamed from: d */
    boolean mo31556d(String str);

    /* renamed from: e */
    C11798b mo31557e(String str);

    /* renamed from: g */
    List<C11798b> mo31558g();

    /* renamed from: i */
    List<InboxMessage> mo31559i(C11808c cVar);

    /* renamed from: j */
    void mo31560j();
}
