package p523mm;

import ed0.C20217b;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import p537nm.C17082f;
import p579qm.C17538b;
import ue1.C43079p;

/* renamed from: mm.m */
public final class C16758m {

    /* renamed from: a */
    private final C20217b f47002a;

    /* renamed from: b */
    private final C16740f f47003b;

    /* renamed from: mm.m$a */
    static final class C16759a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C16759a f47004d = new C16759a();

        C16759a() {
            super(2);
        }

        /* renamed from: a */
        public final C17538b invoke(List list, C17082f fVar) {
            C41536l.m120489i(list, "lookups");
            C41536l.m120489i(fVar, "countryInfo");
            return new C17538b(list, fVar);
        }
    }

    public C16758m(C20217b bVar, C16740f fVar) {
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(fVar, "getCardClientCountryInfo");
        this.f47002a = bVar;
        this.f47003b = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C17538b m59190c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C17538b) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo43880b() {
        C40762x T = C40762x.m118154T(this.f47002a.mo48650b("CARD_APPLICATION_TYPE"), C26186e.m81990h(this.f47003b.mo43869a()), new C16756l(C16759a.f47004d));
        C41536l.m120488h(T, "zip(\n            getLook…s, countryInfo)\n        }");
        return T;
    }
}
