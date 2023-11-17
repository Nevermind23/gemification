package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.medallia.digital.mobilesdk.n7 */
class C11020n7<T> {

    /* renamed from: d */
    private static final long f31675d = 10;

    /* renamed from: e */
    private static final long f31676e = 10000;

    /* renamed from: a */
    private final long f31677a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11023b<T> f31678b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f31679c = -1;

    /* renamed from: com.medallia.digital.mobilesdk.n7$a */
    class C11021a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ Object f31680a;

        /* renamed from: com.medallia.digital.mobilesdk.n7$a$a */
        class C11022a extends C11033o4 {
            C11022a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                if (C11020n7.this.f31678b != null) {
                    C11020n7.this.f31678b.mo28132a(C11021a.this.f31680a);
                }
                long unused = C11020n7.this.f31679c = -1;
            }
        }

        C11021a(Object obj) {
            this.f31680a = obj;
        }

        /* renamed from: a */
        public void mo27617a() {
            C11004m7.m40304b().mo28763a().execute(new C11022a());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.n7$b */
    protected interface C11023b<T> {
        /* renamed from: a */
        void mo28132a(T t);
    }

    protected C11020n7(long j, C11023b<T> bVar) {
        this.f31677a = (j < 0 || j > f31676e) ? 10000 : j;
        this.f31678b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28841a(T t) {
        if (this.f31679c != -1) {
            return false;
        }
        this.f31679c = System.currentTimeMillis() + this.f31677a;
        new Handler(Looper.getMainLooper()).postDelayed(new C11021a(t), this.f31677a);
        return true;
    }
}
