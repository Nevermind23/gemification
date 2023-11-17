package o90;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g90.C20785g;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p855oy.C27094a;
import t80.C28327d;
import ue1.C43075l;

/* renamed from: o90.t1 */
public final class C26861t1 extends C21481a implements C26843n1, C26846o1 {

    /* renamed from: d */
    private final LookupUiModel f67588d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28327d f67589e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C27094a f67590f;

    /* renamed from: g */
    private final C26843n1 f67591g = this;

    /* renamed from: h */
    private final C26846o1 f67592h = this;

    /* renamed from: i */
    private final C1644x f67593i = new C1644x();

    /* renamed from: j */
    private final C1644x f67594j = new C1644x(C41341q.m119907j());

    /* renamed from: k */
    private final C1644x f67595k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List f67596l = new ArrayList();

    /* renamed from: o90.t1$a */
    static final class C26862a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26861t1 f67597d;

        /* renamed from: o90.t1$a$a */
        /* synthetic */ class C26863a extends C41535k implements C43075l {
            C26863a(Object obj) {
                super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27094a) this.receiver).mo66388b(list);
            }
        }

        /* renamed from: o90.t1$a$b */
        /* synthetic */ class C26864b extends C41535k implements C43075l {
            C26864b(Object obj) {
                super(1, obj, C26861t1.class, "transformJobPositions", "transformJobPositions(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26861t1) this.receiver).m83519qw(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26862a(C26861t1 t1Var) {
            super(1);
            this.f67597d = t1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final List m83532d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f67597d.f67589e.mo67969a().mo95062A(new C26855r1(new C26863a(this.f67597d.f67590f))).mo95062A(new C26858s1(new C26864b(this.f67597d))).mo95075O();
            C41536l.m120488h(O, "getJobPositions()\n      …Positions).toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: o90.t1$b */
    static final class C26865b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26861t1 f67598d;

        /* renamed from: o90.t1$b$a */
        static final class C26866a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26861t1 f67599d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26866a(C26861t1 t1Var) {
                super(1);
                this.f67599d = t1Var;
            }

            /* renamed from: a */
            public final void mo66168a(List list) {
                List hw = this.f67599d.f67596l;
                C41536l.m120488h(list, "list");
                C32343x.m95475p(hw, list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66168a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26865b(C26861t1 t1Var) {
            super(1);
            this.f67598d = t1Var;
        }

        /* renamed from: a */
        public final void mo66167a(C31128a aVar) {
            this.f67598d.mo66156Bj().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C26866a(this.f67598d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66167a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.t1$c */
    public interface C26867c {
        /* renamed from: a */
        C26861t1 mo32795a(LookupUiModel lookupUiModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26861t1(LookupUiModel lookupUiModel, C28327d dVar, C27094a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "getJobPositions");
        C41536l.m120489i(aVar, "lookupUiMapper");
        this.f67588d = lookupUiModel;
        this.f67589e = dVar;
        this.f67590f = aVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26849p1(new C26862a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C26852q1(new C26865b(this)));
        C41536l.m120488h(F0, "merge(\n                o…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m83513fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m83514gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final List m83519qw(List list) {
        String str;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LookupUiModel lookupUiModel = (LookupUiModel) it.next();
            String d = lookupUiModel.mo52393d();
            LookupUiModel lookupUiModel2 = this.f67588d;
            if (lookupUiModel2 != null) {
                str = lookupUiModel2.mo52393d();
            } else {
                str = null;
            }
            arrayList.add(new C20785g(lookupUiModel, C41536l.m120484d(d, str)));
        }
        return arrayList;
    }

    /* renamed from: Y2 */
    public void mo66154Y2(String str) {
        boolean z;
        C41536l.m120489i(str, "query");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1644x ow = mo66157El();
            List list = this.f67596l;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (C40439w.m117107F(C32343x.m95388F(((C20785g) next).mo49358a().mo52391a(), new Object[0]), str, true)) {
                    arrayList.add(next);
                }
            }
            ow.mo4823o(arrayList);
            return;
        }
        mo66157El().mo4823o(C41341q.m119907j());
    }

    /* renamed from: l3 */
    public void mo66155l3(LookupUiModel lookupUiModel) {
        C41536l.m120489i(lookupUiModel, "selectedPosition");
        mo66158h().mo4823o(C32343x.m95466m(lookupUiModel));
    }

    /* renamed from: lw */
    public C1644x mo66158h() {
        return this.f67595k;
    }

    /* renamed from: mw */
    public final C26843n1 mo66160mw() {
        return this.f67591g;
    }

    /* renamed from: nw */
    public final C26846o1 mo66161nw() {
        return this.f67592h;
    }

    /* renamed from: ow */
    public C1644x mo66157El() {
        return this.f67594j;
    }

    /* renamed from: pw */
    public C1644x mo66156Bj() {
        return this.f67593i;
    }
}
