package p391dg;

import com.google.gson.Gson;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: dg.k */
public final class C12121k implements C41084a {

    /* renamed from: a */
    private final C12111a f35618a;

    public C12121k(C12111a aVar) {
        this.f35618a = aVar;
    }

    /* renamed from: a */
    public static C12121k m44462a(C12111a aVar) {
        return new C12121k(aVar);
    }

    /* renamed from: c */
    public static Gson m44463c(C12111a aVar) {
        return (Gson) C18329d.m62676c(aVar.mo32300j(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Gson get() {
        return m44463c(this.f35618a);
    }
}
