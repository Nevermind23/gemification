package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import j40.C25326a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k40.C25629a;
import k40.C25630b;
import k40.C25631c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p925vv.C29176h;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel */
public final class AddBudgetViewModel extends C21481a {

    /* renamed from: d */
    private final C29176h f58793d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25326a f58794e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f58795f = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel$a */
    static final class C22112a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddBudgetViewModel f58796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22112a(AddBudgetViewModel addBudgetViewModel) {
            super(1);
            this.f58796d = addBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54912a(C41205b bVar) {
            C21484c.m69417i(this.f58796d.f58795f, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54912a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel$b */
    static final class C22113b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddBudgetViewModel f58797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22113b(AddBudgetViewModel addBudgetViewModel) {
            super(1);
            this.f58797d = addBudgetViewModel;
        }

        /* renamed from: a */
        public final void mo54913a(C41224m mVar) {
            C1644x gw = this.f58797d.f58795f;
            C25326a hw = this.f58797d.f58794e;
            C41536l.m120488h(mVar, "it");
            C21484c.m69418j(gw, hw.mo63896f(mVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54913a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel$c */
    static final class C22114c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddBudgetViewModel f58798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22114c(AddBudgetViewModel addBudgetViewModel) {
            super(1);
            this.f58798d = addBudgetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58798d.f58795f, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddBudgetViewModel(C29176h hVar, C25326a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "budgetsAndCategoriesUseCase");
        C41536l.m120489i(aVar, "budgetingMapper");
        this.f58793d = hVar;
        this.f58794e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m71644lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m71645mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m71646nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final boolean m71647pw(AddBudgetModel addBudgetModel, HashSet hashSet) {
        return hashSet.contains(Long.valueOf(addBudgetModel.mo54887e()));
    }

    /* renamed from: iw */
    public final void mo54908iw(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        C41536l.m120489i(arrayList2, "allBudgetableCategories");
        HashMap hashMap = new HashMap();
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                AddBudgetModel addBudgetModel = (AddBudgetModel) it.next();
                hashMap.put(Long.valueOf(addBudgetModel.mo54887e()), addBudgetModel.mo54895k());
                for (AddBudgetModel addBudgetModel2 : addBudgetModel.mo54885d()) {
                    hashMap.put(Long.valueOf(addBudgetModel2.mo54887e()), addBudgetModel2.mo54895k());
                }
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AddBudgetModel addBudgetModel3 = (AddBudgetModel) it2.next();
                if (arrayList.contains(Long.valueOf(addBudgetModel3.mo54887e()))) {
                    addBudgetModel3.mo54899q(true);
                }
                if (hashMap.containsKey(Long.valueOf(addBudgetModel3.mo54887e()))) {
                    BigDecimal bigDecimal = (BigDecimal) hashMap.get(Long.valueOf(addBudgetModel3.mo54887e()));
                    if (bigDecimal == null) {
                        bigDecimal = BigDecimal.ZERO;
                        C41536l.m120488h(bigDecimal, "ZERO");
                    } else {
                        C41536l.m120488h(bigDecimal, "editedIds[parentBudget.catId] ?: BigDecimal.ZERO");
                    }
                    addBudgetModel3.mo54901s(bigDecimal);
                }
                for (AddBudgetModel addBudgetModel4 : addBudgetModel3.mo54885d()) {
                    if (arrayList.contains(Long.valueOf(addBudgetModel4.mo54887e()))) {
                        addBudgetModel4.mo54899q(true);
                    }
                    if (hashMap.containsKey(Long.valueOf(addBudgetModel4.mo54887e()))) {
                        BigDecimal bigDecimal2 = (BigDecimal) hashMap.get(Long.valueOf(addBudgetModel4.mo54887e()));
                        if (bigDecimal2 == null) {
                            bigDecimal2 = BigDecimal.ZERO;
                            C41536l.m120488h(bigDecimal2, "ZERO");
                        } else {
                            C41536l.m120488h(bigDecimal2, "editedIds[childBudget.catId] ?: BigDecimal.ZERO");
                        }
                        addBudgetModel4.mo54901s(bigDecimal2);
                    }
                }
            }
        }
    }

    /* renamed from: jw */
    public final LiveData mo54909jw() {
        return this.f58795f;
    }

    /* renamed from: kw */
    public final void mo54910kw() {
        C41205b I = this.f58793d.mo69015b().mo95083l(new C25629a(new C22112a(this))).mo95070I(new C25630b(new C22113b(this)), new C25631c(new C22114c(this)));
        C41536l.m120488h(I, "fun getBudgetCategories(…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r4 == false) goto L_0x006b;
     */
    /* renamed from: ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo54911ow(java.util.HashSet r23, java.util.ArrayList r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "selectedItems"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            java.lang.String r2 = "allBudgetableCategories"
            r3 = r24
            kotlin.jvm.internal.C41536l.m120489i(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r24.iterator()
        L_0x0019:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r3.next()
            r5 = r4
            ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel r5 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel) r5
            java.lang.String r4 = "parentBudget"
            kotlin.jvm.internal.C41536l.m120488h(r5, r4)
            boolean r4 = r0.m71647pw(r5, r1)
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0093
            boolean r4 = r5.mo54896l()
            if (r4 == 0) goto L_0x006b
            java.util.List r4 = r5.mo54885d()
            boolean r8 = r4 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0049
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x0049
        L_0x0047:
            r4 = r7
            goto L_0x0068
        L_0x0049:
            java.util.Iterator r4 = r4.iterator()
        L_0x004d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0047
            java.lang.Object r8 = r4.next()
            ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel r8 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel) r8
            long r8 = r8.mo54887e()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x004d
            r4 = r6
        L_0x0068:
            if (r4 == 0) goto L_0x006b
            goto L_0x0093
        L_0x006b:
            java.util.List r4 = r5.mo54885d()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0078:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008f
            java.lang.Object r6 = r4.next()
            r7 = r6
            ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel r7 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel) r7
            boolean r7 = r0.m71647pw(r7, r1)
            if (r7 == 0) goto L_0x0078
            r5.add(r6)
            goto L_0x0078
        L_0x008f:
            r2.addAll(r5)
            goto L_0x0019
        L_0x0093:
            r8 = 0
            java.util.List r4 = r5.mo54885d()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00a2:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00c5
            java.lang.Object r11 = r4.next()
            r12 = r11
            ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel r12 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel) r12
            boolean r13 = r0.m71647pw(r12, r1)
            if (r13 != 0) goto L_0x00be
            boolean r12 = r12.mo54896l()
            if (r12 == 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r12 = r7
            goto L_0x00bf
        L_0x00be:
            r12 = r6
        L_0x00bf:
            if (r12 == 0) goto L_0x00a2
            r10.add(r11)
            goto L_0x00a2
        L_0x00c5:
            java.util.List r4 = ie1.C41358y.m119991B0(r10)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 2045(0x7fd, float:2.866E-42)
            r21 = 0
            r6 = r8
            r8 = r4
            r9 = r10
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel r4 = p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel.m71621b(r5, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.add(r4)
            goto L_0x0019
        L_0x00f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel.mo54911ow(java.util.HashSet, java.util.ArrayList):java.util.ArrayList");
    }
}
