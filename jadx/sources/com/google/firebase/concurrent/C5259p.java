package com.google.firebase.concurrent;

import androidx.concurrent.futures.C0601a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.p */
class C5259p extends C0601a implements ScheduledFuture {

    /* renamed from: k */
    private final ScheduledFuture f16861k;

    /* renamed from: com.google.firebase.concurrent.p$a */
    class C5260a implements C5261b {
        C5260a() {
        }

        /* renamed from: a */
        public void mo17441a(Throwable th) {
            boolean unused = C5259p.this.mo2820u(th);
        }

        public void set(Object obj) {
            boolean unused = C5259p.this.mo2818t(obj);
        }
    }

    /* renamed from: com.google.firebase.concurrent.p$b */
    interface C5261b {
        /* renamed from: a */
        void mo17441a(Throwable th);

        void set(Object obj);
    }

    /* renamed from: com.google.firebase.concurrent.p$c */
    interface C5262c {
        /* renamed from: a */
        ScheduledFuture mo17412a(C5261b bVar);
    }

    C5259p(C5262c cVar) {
        this.f16861k = cVar.mo17412a(new C5260a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2809b() {
        this.f16861k.cancel(mo2821w());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f16861k.getDelay(timeUnit);
    }

    /* renamed from: z */
    public int compareTo(Delayed delayed) {
        return this.f16861k.compareTo(delayed);
    }
}
