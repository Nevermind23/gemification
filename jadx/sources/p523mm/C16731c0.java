package p523mm;

import ed0.C20217b;
import ed1.C40762x;
import fd0.C20463a;
import j51.C36734f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k51.C36874b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p537nm.C17085g0;
import p537nm.C17108y;
import p565pm.C17386a;
import ue1.C43075l;

/* renamed from: mm.c0 */
public final class C16731c0 {

    /* renamed from: a */
    private final C20217b f46974a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C36734f f46975b;

    /* renamed from: mm.c0$a */
    static final class C16732a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16731c0 f46976d;

        /* renamed from: mm.c0$a$a */
        public static final class C16733a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Boolean.valueOf(((C36874b) obj2).mo89807b()), Boolean.valueOf(((C36874b) obj).mo89807b()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16732a(C16731c0 c0Var) {
            super(1);
            this.f46976d = c0Var;
        }

        /* renamed from: a */
        public final C17386a invoke(List list) {
            C41536l.m120489i(list, "ls");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20463a aVar = (C20463a) it.next();
                String c = aVar.mo49003c();
                C17085g0 g0Var = C17085g0.EXISTING_ACCOUNT;
                if (!C41536l.m120484d(c, g0Var.mo44353b())) {
                    g0Var = C17085g0.NEW_ACCOUNT;
                }
                arrayList.add(new C17108y(g0Var, aVar.mo49001a()));
            }
            List<C36874b> t0 = C41358y.m120030t0(this.f46976d.f46975b.mo89561a(), new C16733a());
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(t0, 10));
            for (C36874b a : t0) {
                arrayList2.add(a.mo89806a());
            }
            return new C17386a(arrayList, arrayList2);
        }
    }

    public C16731c0(C20217b bVar, C36734f fVar) {
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(fVar, "getClientPhones");
        this.f46974a = bVar;
        this.f46975b = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C17386a m59157d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17386a) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo43860c() {
        C40762x A = this.f46974a.mo48650b("PLC_REG_TYPE").mo95062A(new C16727b0(new C16732a(this)));
        C41536l.m120488h(A, "operator fun invoke() = …t.phone }\n        )\n    }");
        return A;
    }
}
