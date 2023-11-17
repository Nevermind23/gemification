package p773gv;

import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p783hv.C25067a;
import p784hw.C25074c;
import p793iw.C25263b;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: gv.j0 */
public final class C24809j0 {

    /* renamed from: a */
    private final C25074c f63721a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C24828u f63722b;

    /* renamed from: c */
    private C40762x f63723c;

    /* renamed from: gv.j0$a */
    static final class C24810a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24809j0 f63724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24810a(C24809j0 j0Var) {
            super(1);
            this.f63724d = j0Var;
        }

        /* renamed from: a */
        public final C40735b0 invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return this.f63724d.m79446l();
        }
    }

    /* renamed from: gv.j0$b */
    static final class C24811b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f63725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24811b(String str) {
            super(1);
            this.f63725d = str;
        }

        /* renamed from: a */
        public final List invoke(C25264c cVar) {
            boolean z;
            C41536l.m120489i(cVar, "transactions");
            List d = cVar.mo63846d();
            String str = this.f63725d;
            ArrayList arrayList = new ArrayList();
            for (Object next : d) {
                String w = ((C25263b) next).mo63840w();
                if (w != null) {
                    z = C40440x.m117135K(w, str, true);
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: gv.j0$c */
    static final class C24812c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24812c f63726d = new C24812c();

        C24812c() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "it");
            return C40749p.m118032a0(list);
        }
    }

    /* renamed from: gv.j0$d */
    static final class C24813d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24809j0 f63727d;

        /* renamed from: gv.j0$d$a */
        static final class C24814a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25263b f63728d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24814a(C25263b bVar) {
                super(1);
                this.f63728d = bVar;
            }

            /* renamed from: a */
            public final C25067a.C25069b invoke(Boolean bool) {
                C41536l.m120489i(bool, "isSelected");
                C25263b bVar = this.f63728d;
                C41536l.m120488h(bVar, "it");
                return new C25067a.C25069b(bVar, bool.booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24813d(C24809j0 j0Var) {
            super(1);
            this.f63727d = j0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C25067a.C25069b m79452c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C25067a.C25069b) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C25263b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f63727d.f63722b.mo63239a(bVar).mo95062A(new C24816k0(new C24814a(bVar)));
        }
    }

    public C24809j0(C25074c cVar, C24828u uVar) {
        C25074c cVar2 = cVar;
        C24828u uVar2 = uVar;
        C41536l.m120489i(cVar2, "getTransactions");
        C41536l.m120489i(uVar2, "isOperationSelectedUseCase");
        this.f63721a = cVar2;
        this.f63722b = uVar2;
        this.f63723c = C25074c.m80040d(cVar, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16383, (Object) null).mo95076d();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C40735b0 m79442h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final List m79443i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C40754t m79444j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C40735b0 m79445k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final C40762x m79446l() {
        C40762x d = C25074c.m80040d(this.f63721a, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16383, (Object) null).mo95076d();
        this.f63723c = d;
        C41536l.m120488h(d, "transactionsCache");
        return d;
    }

    /* renamed from: g */
    public final C40762x mo63221g(String str) {
        C41536l.m120489i(str, "searchWord");
        C40762x U0 = this.f63723c.mo95064C(new C24799f0(new C24810a(this))).mo95062A(new C24802g0(new C24811b(str))).mo95090u(new C24804h0(C24812c.f63726d)).mo95010W(new C24806i0(new C24813d(this))).mo95007U0();
        C41536l.m120488h(U0, "operator fun invoke(sear…\n        }.toList()\n    }");
        return U0;
    }
}
