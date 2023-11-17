package p102h4;

/* renamed from: h4.c */
public abstract class C6436c {

    /* renamed from: h4.c$b */
    private static class C6438b extends C6436c {

        /* renamed from: a */
        private volatile boolean f19705a;

        C6438b() {
            super();
        }

        /* renamed from: b */
        public void mo20309b(boolean z) {
            this.f19705a = z;
        }

        /* renamed from: c */
        public void mo20310c() {
            if (this.f19705a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private C6436c() {
    }

    /* renamed from: a */
    public static C6436c m25531a() {
        return new C6438b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo20309b(boolean z);

    /* renamed from: c */
    public abstract void mo20310c();
}
