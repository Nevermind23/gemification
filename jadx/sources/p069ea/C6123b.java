package p069ea;

import com.google.firebase.messaging.C5332h0;

/* renamed from: ea.b */
public final class C6123b {

    /* renamed from: b */
    private static final C6123b f19056b = new C6124a().mo19681a();

    /* renamed from: a */
    private final C6118a f19057a;

    /* renamed from: ea.b$a */
    public static final class C6124a {

        /* renamed from: a */
        private C6118a f19058a = null;

        C6124a() {
        }

        /* renamed from: a */
        public C6123b mo19681a() {
            return new C6123b(this.f19058a);
        }

        /* renamed from: b */
        public C6124a mo19682b(C6118a aVar) {
            this.f19058a = aVar;
            return this;
        }
    }

    C6123b(C6118a aVar) {
        this.f19057a = aVar;
    }

    /* renamed from: b */
    public static C6124a m24493b() {
        return new C6124a();
    }

    /* renamed from: a */
    public C6118a mo19679a() {
        return this.f19057a;
    }

    /* renamed from: c */
    public byte[] mo19680c() {
        return C5332h0.m21108a(this);
    }
}
