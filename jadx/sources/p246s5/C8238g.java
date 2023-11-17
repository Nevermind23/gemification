package p246s5;

import ge1.C41084a;
import p194o5.C7458b;
import p194o5.C7460d;
import p259t5.C8376f;
import p298w5.C8850a;

/* renamed from: s5.g */
public final class C8238g implements C7458b {

    /* renamed from: a */
    private final C41084a f23441a;

    public C8238g(C41084a aVar) {
        this.f23441a = aVar;
    }

    /* renamed from: a */
    public static C8376f m31036a(C8850a aVar) {
        return (C8376f) C7460d.m28361c(C8237f.m31035a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8238g m31037b(C41084a aVar) {
        return new C8238g(aVar);
    }

    /* renamed from: c */
    public C8376f get() {
        return m31036a((C8850a) this.f23441a.get());
    }
}
