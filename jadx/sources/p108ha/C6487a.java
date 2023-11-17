package p108ha;

import ge1.C41084a;
import p095ga.C6401e;
import p095ga.C6403g;
import p121ia.C6620a;
import p121ia.C6621b;
import p121ia.C6622c;
import p121ia.C6623d;
import p121ia.C6624e;
import p121ia.C6625f;
import p121ia.C6626g;
import p121ia.C6627h;
import p640vf.C18327b;
import p640vf.C18329d;

/* renamed from: ha.a */
public final class C6487a implements C6490b {

    /* renamed from: a */
    private C41084a f19804a;

    /* renamed from: b */
    private C41084a f19805b;

    /* renamed from: c */
    private C41084a f19806c;

    /* renamed from: d */
    private C41084a f19807d;

    /* renamed from: e */
    private C41084a f19808e;

    /* renamed from: f */
    private C41084a f19809f;

    /* renamed from: g */
    private C41084a f19810g;

    /* renamed from: h */
    private C41084a f19811h;

    /* renamed from: ha.a$b */
    public static final class C6489b {

        /* renamed from: a */
        private C6620a f19812a;

        /* renamed from: a */
        public C6490b mo20393a() {
            C18329d.m62674a(this.f19812a, C6620a.class);
            return new C6487a(this.f19812a);
        }

        /* renamed from: b */
        public C6489b mo20394b(C6620a aVar) {
            this.f19812a = (C6620a) C18329d.m62675b(aVar);
            return this;
        }

        private C6489b() {
        }
    }

    /* renamed from: b */
    public static C6489b m25645b() {
        return new C6489b();
    }

    /* renamed from: c */
    private void m25646c(C6620a aVar) {
        this.f19804a = C6622c.m26023a(aVar);
        this.f19805b = C6624e.m26029a(aVar);
        this.f19806c = C6623d.m26026a(aVar);
        this.f19807d = C6627h.m26038a(aVar);
        this.f19808e = C6625f.m26032a(aVar);
        this.f19809f = C6621b.m26020a(aVar);
        C6626g a = C6626g.m26035a(aVar);
        this.f19810g = a;
        this.f19811h = C18327b.m62669a(C6403g.m25449a(this.f19804a, this.f19805b, this.f19806c, this.f19807d, this.f19808e, this.f19809f, a));
    }

    /* renamed from: a */
    public C6401e mo20392a() {
        return (C6401e) this.f19811h.get();
    }

    private C6487a(C6620a aVar) {
        m25646c(aVar);
    }
}
