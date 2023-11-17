package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import j40.C25326a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.C25644p;
import k40.C25645q;
import k40.C25646r;
import k40.C25647s;
import k40.C25648t;
import k40.C25649u;
import k40.C25650v;
import k40.C25651w;
import k40.C25652x;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p925vv.C29176h;
import p925vv.C29179j;
import p925vv.C29180k;
import p936wv.C29576b;
import p936wv.C29581g;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel */
public final class EditBudgetViewModel extends C21481a {

    /* renamed from: d */
    private final C29179j f58813d;

    /* renamed from: e */
    private final C29180k f58814e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25326a f58815f;

    /* renamed from: g */
    private final C29176h f58816g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f58817h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f58818i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f58819j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f58820k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f58821l = new C1644x();

    /* renamed from: m */
    private final C1644x f58822m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList f58823n = new ArrayList();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$a */
    static final class C22122a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22122a(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58824d = editBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54938a(C41205b bVar) {
            this.f58824d.f58818i.mo4823o(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54938a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$b */
    static final class C22123b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22123b(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58825d = editBudgetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58825d.f58818i.mo4823o(Boolean.FALSE);
            this.f58825d.f58821l.mo4823o(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$c */
    static final class C22124c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22124c f58826d = new C22124c();

        C22124c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54940a(C41205b bVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54940a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$d */
    static final class C22125d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22125d(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58827d = editBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54941a(C41224m mVar) {
            if (!((C29581g) mVar.mo95678e()).mo69470a().mo69441a().isEmpty()) {
                this.f58827d.f58820k.mo4823o(new C37223a(Boolean.TRUE));
            } else {
                this.f58827d.f58820k.mo4823o(new C37223a(Boolean.FALSE));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54941a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$e */
    static final class C22126e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22126e f58828d = new C22126e();

        C22126e() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$f */
    static final class C22127f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22127f(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58829d = editBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54943a(C41205b bVar) {
            this.f58829d.f58818i.mo4826r(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54943a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$g */
    static final class C22128g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22128g(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58830d = editBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54944a(C41224m mVar) {
            this.f58830d.f58818i.mo4826r(Boolean.FALSE);
            C25326a sw = this.f58830d.f58815f;
            C41536l.m120488h(mVar, "it");
            List k = sw.mo63898k(mVar);
            this.f58830d.f58823n = new ArrayList(k);
            if (this.f58830d.m71686Cw(k)) {
                this.f58830d.f58817h.mo4826r(this.f58830d.f58823n);
            } else {
                this.f58830d.f58819j.mo4826r(new C37223a(C41238w.f97225a));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54944a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel$h */
    static final class C22129h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditBudgetViewModel f58831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22129h(EditBudgetViewModel editBudgetViewModel) {
            super(1);
            this.f58831d = editBudgetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58831d.f58818i.mo4826r(Boolean.FALSE);
            this.f58831d.f58821l.mo4826r(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditBudgetViewModel(C29179j jVar, C29180k kVar, C25326a aVar, C29176h hVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(jVar, "createUpdateBudgetUseCase");
        C41536l.m120489i(kVar, "deleteBudgetUseCase");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(hVar, "budgetsAndCategoriesUseCase");
        this.f58813d = jVar;
        this.f58814e = kVar;
        this.f58815f = aVar;
        this.f58816g = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m71684Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    private final C41224m m71685Bw(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
            C29576b bVar = new C29576b(Long.valueOf(addBudgetModel.mo54893i()), addBudgetModel.mo54887e(), addBudgetModel.mo54895k().floatValue(), (String) null, 8, (DefaultConstructorMarker) null);
            if (!addBudgetModel.mo54896l() || addBudgetModel.mo54893i() <= 0) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
            for (AddBudgetModel addBudgetModel2 : addBudgetModel.mo54885d()) {
                C29576b bVar2 = new C29576b(Long.valueOf(addBudgetModel2.mo54893i()), addBudgetModel2.mo54887e(), addBudgetModel2.mo54895k().floatValue(), (String) null, 8, (DefaultConstructorMarker) null);
                if (!addBudgetModel2.mo54896l() || addBudgetModel2.mo54893i() <= 0) {
                    arrayList.add(bVar2);
                } else {
                    arrayList2.add(bVar2);
                }
            }
        }
        return new C41224m(arrayList, arrayList2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final boolean m71686Cw(List list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
            if (addBudgetModel.mo54891h() != null) {
                return true;
            }
            Iterator it2 = addBudgetModel.mo54885d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    continue;
                    break;
                }
                obj = it2.next();
                if (((AddBudgetModel) obj).mo54891h() != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    continue;
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Dw */
    private final List m71687Dw(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
            if (m71692Pw(addBudgetModel)) {
                arrayList2.add(new C29576b(Long.valueOf(addBudgetModel.mo54893i()), 0, Utils.FLOAT_EPSILON, (String) null, 8, (DefaultConstructorMarker) null));
            }
            for (AddBudgetModel addBudgetModel2 : addBudgetModel.mo54885d()) {
                if (m71692Pw(addBudgetModel2)) {
                    arrayList2.add(new C29576b(Long.valueOf(addBudgetModel2.mo54893i()), 0, Utils.FLOAT_EPSILON, (String) null, 8, (DefaultConstructorMarker) null));
                }
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m71688Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m71689Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m71690Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Nw */
    private final ArrayList m71691Nw(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
            if (addBudgetModel.mo54898p()) {
                List d = addBudgetModel.mo54885d();
                ArrayList arrayList3 = new ArrayList();
                for (Object next : d) {
                    if (!((AddBudgetModel) next).mo54898p()) {
                        arrayList3.add(next);
                    }
                }
                arrayList2.addAll(arrayList3);
            } else {
                List d2 = addBudgetModel.mo54885d();
                ArrayList arrayList4 = new ArrayList();
                for (Object next2 : d2) {
                    if (!((AddBudgetModel) next2).mo54898p()) {
                        arrayList4.add(next2);
                    }
                }
                arrayList2.add(AddBudgetModel.m71621b(addBudgetModel, 0, C41527d0.m120456c(arrayList4), 0, (String) null, false, 0, (BigDecimal) null, false, (String) null, (Integer) null, false, 2045, (Object) null));
            }
        }
        return arrayList2;
    }

    /* renamed from: Pw */
    private final boolean m71692Pw(AddBudgetModel addBudgetModel) {
        return addBudgetModel.mo54893i() > 0 && addBudgetModel.mo54898p();
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m71693Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m71694Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final void m71695Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m71714yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m71715zw(EditBudgetViewModel editBudgetViewModel, ArrayList arrayList) {
        C41536l.m120489i(editBudgetViewModel, "this$0");
        C41536l.m120489i(arrayList, "$budgets");
        editBudgetViewModel.f58818i.mo4823o(Boolean.FALSE);
        editBudgetViewModel.f58822m.mo4823o(new C37223a(Boolean.TRUE));
        ArrayList Nw = editBudgetViewModel.m71691Nw(arrayList);
        editBudgetViewModel.f58823n = Nw;
        editBudgetViewModel.f58817h.mo4823o(Nw);
    }

    /* renamed from: Ew */
    public final LiveData mo54925Ew() {
        return this.f58817h;
    }

    /* renamed from: Fw */
    public final void mo54926Fw() {
        C41205b I = this.f58816g.mo69015b().mo95083l(new C25647s(C22124c.f58826d)).mo95070I(new C25648t(new C22125d(this)), new C25649u(C22126e.f58828d));
        C41536l.m120488h(I, "fun getBudgeting() {\n   …   }, {})\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Jw */
    public final ArrayList mo54927Jw(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "budgetsToEdit");
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AddBudgetModel> arrayList3 = new ArrayList<>();
        for (Object next : arrayList) {
            if (!((AddBudgetModel) next).mo54896l()) {
                arrayList3.add(next);
            }
        }
        for (AddBudgetModel addBudgetModel : arrayList3) {
            arrayList2.add(Long.valueOf(addBudgetModel.mo54887e()));
            List d = addBudgetModel.mo54885d();
            ArrayList<AddBudgetModel> arrayList4 = new ArrayList<>();
            for (Object next2 : d) {
                if (!((AddBudgetModel) next2).mo54896l()) {
                    arrayList4.add(next2);
                }
            }
            for (AddBudgetModel e : arrayList4) {
                arrayList2.add(Long.valueOf(e.mo54887e()));
            }
        }
        ArrayList<AddBudgetModel> arrayList5 = new ArrayList<>();
        for (Object next3 : arrayList) {
            if (((AddBudgetModel) next3).mo54896l()) {
                arrayList5.add(next3);
            }
        }
        for (AddBudgetModel d2 : arrayList5) {
            List d3 = d2.mo54885d();
            ArrayList<AddBudgetModel> arrayList6 = new ArrayList<>();
            for (Object next4 : d3) {
                if (!((AddBudgetModel) next4).mo54896l()) {
                    arrayList6.add(next4);
                }
            }
            for (AddBudgetModel e2 : arrayList6) {
                arrayList2.add(Long.valueOf(e2.mo54887e()));
            }
        }
        return arrayList2;
    }

    /* renamed from: Kw */
    public final LiveData mo54928Kw() {
        return this.f58820k;
    }

    /* renamed from: Lw */
    public final LiveData mo54929Lw() {
        return this.f58822m;
    }

    /* renamed from: Mf */
    public final LiveData mo54930Mf() {
        return this.f58819j;
    }

    /* renamed from: Mw */
    public final LiveData mo54931Mw() {
        return this.f58818i;
    }

    /* renamed from: Ow */
    public final void mo54932Ow(ArrayList arrayList) {
        if (arrayList != null) {
            this.f58823n = arrayList;
        }
        this.f58817h.mo4826r(arrayList);
    }

    /* renamed from: Qw */
    public final void mo54933Qw(List list) {
        C41536l.m120489i(list, "editedValues");
        C41224m Bw = m71685Bw(list);
        List list2 = (List) Bw.mo95676b();
        C41205b I = this.f58813d.mo69017b(list2, (List) Bw.mo95675a()).mo95063B(C40992a.m118827a()).mo95083l(new C25644p(new C22127f(this))).mo95070I(new C25645q(new C22128g(this)), new C25646r(new C22129h(this)));
        C41536l.m120488h(I, "fun updateBudgets(edited…       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: vw */
    public final boolean mo54934vw(List list) {
        Object obj;
        C41536l.m120489i(list, "values");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
            if (C41536l.m120484d(addBudgetModel.mo54895k(), BigDecimal.ZERO)) {
                return false;
            }
            Iterator it2 = addBudgetModel.mo54885d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    continue;
                    break;
                }
                obj = it2.next();
                if (C41536l.m120484d(((AddBudgetModel) obj).mo54895k(), BigDecimal.ZERO)) {
                    continue;
                    break;
                }
            }
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ww */
    public final void mo54935ww(int i, int i2) {
        if (i2 > -1) {
            ((AddBudgetModel) ((AddBudgetModel) this.f58823n.get(i)).mo54885d().get(i2)).mo54900r(true);
        } else {
            ((AddBudgetModel) this.f58823n.get(i)).mo54900r(true);
        }
        mo54937xw(this.f58823n);
    }

    /* renamed from: x0 */
    public final LiveData mo54936x0() {
        return this.f58821l;
    }

    /* renamed from: xw */
    public final void mo54937xw(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "budgets");
        C41205b G = this.f58814e.mo69018a(m71687Dw(arrayList)).mo94904r(new C25650v(new C22122a(this))).mo94888G(new C25651w(this, arrayList), new C25652x(new C22123b(this)));
        C41536l.m120488h(G, "fun deleteSelectedBudget…       })\n        )\n    }");
        addDisposable(G);
    }
}
