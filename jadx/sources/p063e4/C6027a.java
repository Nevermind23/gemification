package p063e4;

import p166m3.C7079a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: e4.a */
public class C6027a implements C6034e {

    /* renamed from: a */
    private final int f18811a;

    /* renamed from: b */
    private final boolean f18812b;

    /* renamed from: c */
    private C6029b f18813c;

    /* renamed from: e4.a$a */
    public static class C6028a {

        /* renamed from: a */
        private final int f18814a;

        /* renamed from: b */
        private boolean f18815b;

        public C6028a() {
            this(BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
        }

        /* renamed from: a */
        public C6027a mo19523a() {
            return new C6027a(this.f18814a, this.f18815b);
        }

        public C6028a(int i) {
            this.f18814a = i;
        }
    }

    protected C6027a(int i, boolean z) {
        this.f18811a = i;
        this.f18812b = z;
    }

    /* renamed from: b */
    private C6032d m24147b() {
        if (this.f18813c == null) {
            this.f18813c = new C6029b(this.f18811a, this.f18812b);
        }
        return this.f18813c;
    }

    /* renamed from: a */
    public C6032d mo19522a(C7079a aVar, boolean z) {
        if (aVar == C7079a.MEMORY_CACHE) {
            return C6030c.m24152b();
        }
        return m24147b();
    }
}
