package p578ql;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p564pl.C17385a;

/* renamed from: ql.f */
public final class C17533f {

    /* renamed from: a */
    private final C17385a f49061a;

    public C17533f(C17385a aVar) {
        C41536l.m120489i(aVar, "repo");
        this.f49061a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m61062b(C17533f fVar, Boolean bool, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        return fVar.mo45050a(bool, str, l);
    }

    /* renamed from: a */
    public final C40762x mo45050a(Boolean bool, String str, Long l) {
        return this.f49061a.mo43632h(bool, str, l);
    }
}
