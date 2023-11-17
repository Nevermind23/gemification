package p535nk;

import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p521mk.C16718a;
import p521mk.C16719b;
import p563pk.C17371a;
import p563pk.C17381k;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: nk.o */
public final class C17035o {

    /* renamed from: a */
    private final C16718a f47540a;

    /* renamed from: b */
    private final C16719b f47541b;

    /* renamed from: nk.o$a */
    static final class C17036a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17036a f47542d = new C17036a();

        C17036a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C17381k kVar) {
            C41536l.m120489i(kVar, "it");
            return kVar.mo44880j();
        }
    }

    /* renamed from: nk.o$b */
    static final class C17037b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C17037b f47543d = new C17037b();

        C17037b() {
            super(2);
        }

        /* renamed from: a */
        public final C17371a invoke(Integer num, List list) {
            C41536l.m120489i(num, "index");
            C41536l.m120489i(list, "list");
            return (C17371a) list.get(num.intValue());
        }
    }

    public C17035o(C16718a aVar, C16719b bVar) {
        C41536l.m120489i(aVar, "insuranceRepo");
        C41536l.m120489i(bVar, "policyRepo");
        this.f47540a = aVar;
        this.f47541b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Integer m59877d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C17371a m59878e(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C17371a) pVar.invoke(obj, obj2);
    }

    /* renamed from: c */
    public final C40749p mo44226c() {
        C40749p Y0 = this.f47541b.mo42994a().mo95026k0(new C17033m(C17036a.f47542d)).mo95043y().mo95014Y0(this.f47540a.mo42973e(), new C17034n(C17037b.f47543d));
        C41536l.m120488h(Y0, "policyRepo\n            .…list[index]\n            }");
        return Y0;
    }
}
