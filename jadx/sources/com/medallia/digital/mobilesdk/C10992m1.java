package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.m1 */
final class C10992m1 {

    /* renamed from: d */
    protected static final int f31560d = -1;

    /* renamed from: e */
    private static final long f31561e = 5000;

    /* renamed from: f */
    protected static final C10992m1 f31562f = new C10994b().mo28727a(Long.valueOf(f31561e)).mo28729a();

    /* renamed from: a */
    final long f31563a;

    /* renamed from: b */
    final C10995c f31564b;

    /* renamed from: c */
    final boolean f31565c;

    /* renamed from: com.medallia.digital.mobilesdk.m1$b */
    protected static class C10994b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f31566a = C10992m1.f31561e;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10995c f31567b = C10995c.TOP;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f31568c = false;

        protected C10994b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10994b mo28726a(C10995c cVar) {
            this.f31567b = cVar;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10994b mo28727a(Long l) {
            if (l != null) {
                this.f31566a = l.longValue();
            }
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10994b mo28728a(boolean z) {
            this.f31568c = z;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10992m1 mo28729a() {
            return new C10992m1(this);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.m1$c */
    enum C10995c {
        TOP,
        BOTTOM;

        static C10995c getPosition(String str) {
            if (str != null) {
                C10995c cVar = BOTTOM;
                if (str.equalsIgnoreCase(cVar.toString())) {
                    return cVar;
                }
            }
            return TOP;
        }
    }

    private C10992m1(C10994b bVar) {
        this.f31563a = bVar.f31566a;
        this.f31564b = bVar.f31567b;
        this.f31565c = bVar.f31568c;
    }

    public String toString() {
        return "DefaultBannerConfigurations{durationInMilliseconds=" + this.f31563a + '}';
    }
}
