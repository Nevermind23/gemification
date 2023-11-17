package p121ia;

import com.google.firebase.perf.config.C5380a;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: ia.b */
public final class C6621b implements C41084a {

    /* renamed from: a */
    private final C6620a f20129a;

    public C6621b(C6620a aVar) {
        this.f20129a = aVar;
    }

    /* renamed from: a */
    public static C6621b m26020a(C6620a aVar) {
        return new C6621b(aVar);
    }

    /* renamed from: c */
    public static C5380a m26021c(C6620a aVar) {
        return (C5380a) C18329d.m62676c(aVar.mo20645a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5380a get() {
        return m26021c(this.f20129a);
    }
}
