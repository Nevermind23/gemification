package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.session.C0125b;

/* renamed from: com.google.android.material.snackbar.a */
class C5141a {

    /* renamed from: c */
    private static C5141a f16453c;

    /* renamed from: a */
    private final Object f16454a = new Object();

    /* renamed from: b */
    private final Handler f16455b = new Handler(Looper.getMainLooper(), new C5142a());

    /* renamed from: com.google.android.material.snackbar.a$a */
    class C5142a implements Handler.Callback {
        C5142a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C5141a aVar = C5141a.this;
            C0125b.m366a(message.obj);
            aVar.mo16853c((C5144c) null);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    interface C5143b {
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    private static class C5144c {
    }

    private C5141a() {
    }

    /* renamed from: a */
    private boolean m20133a(C5144c cVar, int i) {
        throw null;
    }

    /* renamed from: b */
    static C5141a m20134b() {
        if (f16453c == null) {
            f16453c = new C5141a();
        }
        return f16453c;
    }

    /* renamed from: d */
    private boolean m20135d(C5143b bVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16853c(C5144c cVar) {
        synchronized (this.f16454a) {
            m20133a(cVar, 2);
        }
    }

    /* renamed from: e */
    public void mo16854e(C5143b bVar) {
        synchronized (this.f16454a) {
            if (m20135d(bVar)) {
                throw null;
            }
        }
    }

    /* renamed from: f */
    public void mo16855f(C5143b bVar) {
        synchronized (this.f16454a) {
            if (m20135d(bVar)) {
                throw null;
            }
        }
    }
}
