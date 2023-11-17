package p126j2;

import java.util.concurrent.Executor;

/* renamed from: j2.c */
public class C6685c implements C6686d {

    /* renamed from: d */
    public static final int f20214d = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: a */
    private final C6682a f20215a;

    /* renamed from: b */
    private final C6682a f20216b;

    /* renamed from: c */
    private final Executor f20217c = new C6687e();

    public C6685c() {
        C6688f fVar = new C6688f(10);
        this.f20215a = new C6682a(f20214d, fVar);
        this.f20216b = new C6682a(2, fVar);
    }

    /* renamed from: a */
    public Executor mo20676a() {
        return this.f20217c;
    }

    /* renamed from: b */
    public C6682a mo20677b() {
        return this.f20216b;
    }

    /* renamed from: c */
    public C6682a mo20678c() {
        return this.f20215a;
    }
}
