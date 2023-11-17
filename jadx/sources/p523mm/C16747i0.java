package p523mm;

import ed1.C40762x;
import hd0.C24978b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p537nm.C17085g0;
import p537nm.C17097n;
import p537nm.C17103t;
import p565pm.C17388c;
import p565pm.C17389d;
import p579qm.C17537a;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: mm.i0 */
public final class C16747i0 {

    /* renamed from: a */
    private final C16752j0 f46990a;

    /* renamed from: b */
    private final C16753k f46991b;

    /* renamed from: c */
    private final C16795y f46992c;

    /* renamed from: mm.i0$a */
    static final class C16748a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C16748a f46993d = new C16748a();

        C16748a() {
            super(1);
        }

        /* renamed from: a */
        public final C17389d invoke(List list) {
            C41536l.m120489i(list, "it");
            return (C17389d) C41358y.m120009Y(list);
        }
    }

    /* renamed from: mm.i0$b */
    static final class C16749b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f46994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16749b(String str) {
            super(1);
            this.f46994d = str;
        }

        /* renamed from: a */
        public final C17097n invoke(List list) {
            Object obj;
            C41536l.m120489i(list, "it");
            String str = this.f46994d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C17097n) obj).mo44415H(), str)) {
                    break;
                }
            }
            return (C17097n) obj;
        }
    }

    /* renamed from: mm.i0$c */
    static final class C16750c extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C16750c f46995d = new C16750c();

        C16750c() {
            super(3);
        }

        /* renamed from: a */
        public final C17388c invoke(C17389d dVar, C17103t tVar, C17097n nVar) {
            C41536l.m120489i(dVar, "point");
            C41536l.m120489i(tVar, "fees");
            C41536l.m120489i(nVar, "card");
            List e = dVar.mo44911e();
            if (e == null) {
                e = C41341q.m119907j();
            }
            return new C17388c(e, dVar, tVar, nVar);
        }
    }

    public C16747i0(C16752j0 j0Var, C16753k kVar, C16795y yVar) {
        C41536l.m120489i(j0Var, "getServiceCenters");
        C41536l.m120489i(kVar, "getFees");
        C41536l.m120489i(yVar, "getDebitCards");
        this.f46990a = j0Var;
        this.f46991b = kVar;
        this.f46992c = yVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C17389d m59173e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17389d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C17097n m59174f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17097n) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C17388c m59175g(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C17388c) qVar.invoke(obj, obj2, obj3);
    }

    /* renamed from: d */
    public final C40762x mo43872d(String str, boolean z, Long l, boolean z2) {
        C17085g0 g0Var;
        String str2 = str;
        C41536l.m120489i(str2, "product");
        C40762x A = this.f46990a.mo43876a("INSTANT_CARD_DELIVERY_POINTS").mo95062A(new C16741f0(C16748a.f46993d));
        C16753k kVar = this.f46991b;
        if (z) {
            g0Var = C17085g0.EXISTING_ACCOUNT;
        } else {
            g0Var = C17085g0.NEW_ACCOUNT;
        }
        C24978b bVar = C24978b.NO;
        C24978b b = C24978b.m79846b(Boolean.valueOf(z2));
        C41536l.m120488h(b, "fromBoolean(closeCard)");
        C40762x S = C40762x.m118153S(A, kVar.mo43877c(new C17537a(str, g0Var, bVar, b, l, (String) null, 32, (DefaultConstructorMarker) null)), C16795y.m59259b(this.f46992c, (List) null, false, (Long) null, (Long) null, (Boolean) null, (Boolean) null, false, 126, (Object) null).mo95062A(new C16743g0(new C16749b(str2))), new C16745h0(C16750c.f46995d));
        C41536l.m120488h(S, "product: String, isExist…rd = card\n        )\n    }");
        return S;
    }
}
