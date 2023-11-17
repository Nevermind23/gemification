package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import p182n6.C7264i;
import p273u6.C8637a;

/* renamed from: com.google.android.gms.common.api.internal.d */
public final class C3877d {

    /* renamed from: a */
    private final Executor f12373a;

    /* renamed from: b */
    private volatile Object f12374b;

    /* renamed from: c */
    private volatile C3878a f12375c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public static final class C3878a {

        /* renamed from: a */
        private final Object f12376a;

        /* renamed from: b */
        private final String f12377b;

        C3878a(Object obj, String str) {
            this.f12376a = obj;
            this.f12377b = str;
        }

        /* renamed from: a */
        public String mo12045a() {
            String str = this.f12377b;
            int identityHashCode = System.identityHashCode(this.f12376a);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(str);
            sb.append("@");
            sb.append(identityHashCode);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3878a)) {
                return false;
            }
            C3878a aVar = (C3878a) obj;
            if (this.f12376a != aVar.f12376a || !this.f12377b.equals(aVar.f12377b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12376a) * 31) + this.f12377b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    public interface C3879b {
        /* renamed from: a */
        void mo12048a(Object obj);

        /* renamed from: b */
        void mo12049b();
    }

    C3877d(Looper looper, Object obj, String str) {
        this.f12373a = new C8637a(looper);
        this.f12374b = C7264i.m27903l(obj, "Listener must not be null");
        this.f12375c = new C3878a(obj, C7264i.m27898g(str));
    }

    /* renamed from: a */
    public void mo12041a() {
        this.f12374b = null;
        this.f12375c = null;
    }

    /* renamed from: b */
    public C3878a mo12042b() {
        return this.f12375c;
    }

    /* renamed from: c */
    public void mo12043c(C3879b bVar) {
        C7264i.m27903l(bVar, "Notifier must not be null");
        this.f12373a.execute(new C3928t0(this, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12044d(C3879b bVar) {
        Object obj = this.f12374b;
        if (obj == null) {
            bVar.mo12049b();
            return;
        }
        try {
            bVar.mo12048a(obj);
        } catch (RuntimeException e) {
            bVar.mo12049b();
            throw e;
        }
    }
}
