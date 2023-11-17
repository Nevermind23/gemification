package my0;

import ed1.C40762x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import oy0.C37836b;
import oy0.C37838d;
import oy0.C37841g;
import oy0.C37842h;
import ue1.C43079p;

/* renamed from: my0.b */
public final class C37298b {

    /* renamed from: a */
    private final C37300c f89747a;

    /* renamed from: b */
    private final C37303f f89748b;

    /* renamed from: my0.b$a */
    static final class C37299a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ long f89749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37299a(long j) {
            super(2);
            this.f89749d = j;
        }

        /* renamed from: a */
        public final C37838d invoke(List list, C37841g gVar) {
            boolean z;
            C41536l.m120489i(list, "agreements");
            C41536l.m120489i(gVar, "validation");
            C37836b b = gVar.mo91189b();
            long j = this.f89749d;
            boolean z2 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C37842h) it.next()).mo91193a() == j) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return new C37838d(b, z2, gVar.mo91188a());
        }
    }

    public C37298b(C37300c cVar, C37303f fVar) {
        C41536l.m120489i(cVar, "getDepositLoanAgreement");
        C41536l.m120489i(fVar, "validateDepositBreak");
        this.f89747a = cVar;
        this.f89748b = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C37838d m110056c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C37838d) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo90406b(long j) {
        C40762x T = C40762x.m118154T(this.f89747a.mo90408a(), this.f89748b.mo90411a(j), new C37297a(new C37299a(j)));
        C41536l.m120488h(T, "agreeKey: Long): Single<…y\n            )\n        }");
        return T;
    }
}
