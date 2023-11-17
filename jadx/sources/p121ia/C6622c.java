package p121ia;

import com.google.firebase.C5270e;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: ia.c */
public final class C6622c implements C41084a {

    /* renamed from: a */
    private final C6620a f20130a;

    public C6622c(C6620a aVar) {
        this.f20130a = aVar;
    }

    /* renamed from: a */
    public static C6622c m26023a(C6620a aVar) {
        return new C6622c(aVar);
    }

    /* renamed from: c */
    public static C5270e m26024c(C6620a aVar) {
        return (C5270e) C18329d.m62676c(aVar.mo20646b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5270e get() {
        return m26024c(this.f20130a);
    }
}
