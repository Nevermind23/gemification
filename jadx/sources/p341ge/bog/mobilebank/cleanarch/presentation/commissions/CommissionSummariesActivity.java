package p341ge.bog.mobilebank.cleanarch.presentation.commissions;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.C1314o;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32184h0;
import g91.C32297d;
import g91.C32300e0;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27329i5;
import p90.C27424t;
import s00.C28115a;
import s00.C28116b;
import s00.C28117c;
import u00.C28535c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity */
public final class CommissionSummariesActivity extends C30772sa {

    /* renamed from: I */
    public static final C21429a f57295I = new C21429a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57296F = new C1617p0(C41520a0.m120436b(CommissionsSummariesViewModel.class), new C21440i(this), new C21439h(this), new C21441j((C43064a) null, this));

    /* renamed from: G */
    private final C41217g f57297G = C41219i.m119470b(new C21437f(this));

    /* renamed from: H */
    private final C41217g f57298H = C41219i.m119470b(new C21430b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$a */
    public static final class C21429a {
        private C21429a() {
        }

        public /* synthetic */ C21429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53515a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, CommissionSummariesActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$b */
    static final class C21430b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CommissionSummariesActivity f57299d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$b$a */
        static final class C21431a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ CommissionSummariesActivity f57300d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21431a(CommissionSummariesActivity commissionSummariesActivity) {
                super(2);
                this.f57300d = commissionSummariesActivity;
            }

            /* renamed from: a */
            public final View mo53517a(int i, ViewGroup viewGroup) {
                C41536l.m120489i(viewGroup, "viewGroup");
                C27329i5 d = C27329i5.m84626d(this.f57300d.getLayoutInflater(), this.f57300d.m69265M2().f69809i, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                C1314o.m4566h(d.f68991k, 7, 17, 1, 2);
                C1314o.m4566h(d.f68990j, 27, 70, 1, 2);
                CardView c = d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                return c;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo53517a(((Number) obj).intValue(), (ViewGroup) obj2);
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$b$b */
        static final class C21432b extends C41537m implements C43080q {

            /* renamed from: d */
            final /* synthetic */ CommissionSummariesActivity f57301d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21432b(CommissionSummariesActivity commissionSummariesActivity) {
                super(3);
                this.f57301d = commissionSummariesActivity;
            }

            /* renamed from: a */
            public final void mo53518a(C28535c cVar, int i, View view) {
                C41536l.m120489i(view, "v");
                if (cVar != null) {
                    CommissionSummariesActivity commissionSummariesActivity = this.f57301d;
                    C27329i5 a = C27329i5.m84625a(view);
                    C41536l.m120488h(a, "bind(v)");
                    commissionSummariesActivity.m69263K2(a, cVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo53518a((C28535c) obj, ((Number) obj2).intValue(), (View) obj3);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$b$c */
        static final class C21433c extends C41537m implements C43080q {

            /* renamed from: d */
            final /* synthetic */ CommissionSummariesActivity f57302d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21433c(CommissionSummariesActivity commissionSummariesActivity) {
                super(3);
                this.f57302d = commissionSummariesActivity;
            }

            /* renamed from: a */
            public final void mo53519a(C28535c cVar, View view, int i) {
                String str;
                C41536l.m120489i(view, "v");
                CommissionsActivity.C21442a aVar = CommissionsActivity.f57309N;
                CommissionSummariesActivity commissionSummariesActivity = this.f57302d;
                if (cVar == null || (str = cVar.mo68260b()) == null) {
                    str = "GEL";
                }
                aVar.mo53524b(commissionSummariesActivity, str);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo53519a((C28535c) obj, (View) obj2, ((Number) obj3).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21430b(CommissionSummariesActivity commissionSummariesActivity) {
            super(0);
            this.f57299d = commissionSummariesActivity;
        }

        /* renamed from: b */
        public final C32184h0 invoke() {
            return new C32184h0(C41341q.m119907j(), new C21431a(this.f57299d), (C43079p) null, (Integer) null, new C21432b(this.f57299d), new C21433c(this.f57299d), 12, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$c */
    /* synthetic */ class C21434c extends C41535k implements C43075l {
        C21434c(Object obj) {
            super(1, obj, CommissionSummariesActivity.class, "onCommissionsList", "onCommissionsList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo53520b(List list) {
            C41536l.m120489i(list, "p0");
            ((CommissionSummariesActivity) this.receiver).m69268P2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53520b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$d */
    /* synthetic */ class C21435d extends C41535k implements C43075l {
        C21435d(Object obj) {
            super(1, obj, CommissionSummariesActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53521b(boolean z) {
            ((CommissionSummariesActivity) this.receiver).mo53514R2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53521b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$e */
    /* synthetic */ class C21436e extends C41535k implements C43075l {
        C21436e(Object obj) {
            super(1, obj, CommissionSummariesActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53522b(C21503d.C21504a aVar) {
            ((CommissionSummariesActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53522b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$f */
    static final class C21437f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CommissionSummariesActivity f57303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21437f(CommissionSummariesActivity commissionSummariesActivity) {
            super(0);
            this.f57303d = commissionSummariesActivity;
        }

        /* renamed from: b */
        public final C27424t invoke() {
            C27424t a = C27424t.m85006a(this.f57303d.findViewById(C10322k.activity_commissions_list_root));
            C41536l.m120488h(a, "bind(findViewById(R.id.a…y_commissions_list_root))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$g */
    public static final class C21438g extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ CommissionSummariesActivity f57304a;

        C21438g(CommissionSummariesActivity commissionSummariesActivity) {
            this.f57304a = commissionSummariesActivity;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            rect.bottom = (int) this.f57304a.getResources().getDimension(C10319h.list_spacing);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$h */
    public static final class C21439h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21439h(ComponentActivity componentActivity) {
            super(0);
            this.f57305d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57305d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$i */
    public static final class C21440i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21440i(ComponentActivity componentActivity) {
            super(0);
            this.f57306d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57306d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity$j */
    public static final class C21441j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57307d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21441j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57307d = aVar;
            this.f57308e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57307d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57308e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m69262J2(CommissionSummariesActivity commissionSummariesActivity, Object obj) {
        C41536l.m120489i(commissionSummariesActivity, "$owner");
        C32297d.m95160h(commissionSummariesActivity, C32343x.m95452h0(C10328q.payment_completed_successfully, new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final void m69263K2(C27329i5 i5Var, C28535c cVar) {
        i5Var.f68991k.setText(C32300e0.m95170h(cVar));
        i5Var.f68989i.setText(C32303f.m95203n(cVar.mo68259a(), cVar.mo68260b()));
        i5Var.f68990j.setText(C32303f.m95197h(cVar.mo68260b()));
    }

    /* renamed from: L2 */
    private final C32184h0 m69264L2() {
        return (C32184h0) this.f57298H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final C27424t m69265M2() {
        return (C27424t) this.f57297G.getValue();
    }

    /* renamed from: N2 */
    private final C21438g m69266N2() {
        return new C21438g(this);
    }

    /* renamed from: O2 */
    private final CommissionsSummariesViewModel m69267O2() {
        return (CommissionsSummariesViewModel) this.f57296F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m69268P2(List list) {
        int i;
        m69264L2().mo72712n(list);
        Group group = m69265M2().f69807g;
        if (list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        group.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m69269Q2(CommissionSummariesActivity commissionSummariesActivity, View view) {
        C41536l.m120489i(commissionSummariesActivity, "this$0");
        commissionSummariesActivity.m69267O2().mo53556fw();
    }

    /* renamed from: l1 */
    private final void m69270l1() {
        CommissionsSummariesViewModel O2 = m69267O2();
        C21484c.m69411c(O2.mo53557gw(), this, new C21434c(this), new C21435d(this), new C21436e(this));
        O2.mo53558hw().mo4819k(this, new C28117c(this));
    }

    /* renamed from: G1 */
    public void mo52674G1(C21503d.C21504a aVar) {
        super.mo52674G1(aVar);
        m69265M2().f69816p.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_commission_summaries_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m69265M2().f69809i.mo5351j(m69266N2());
        m69265M2().f69809i.setAdapter(m69264L2());
        m69270l1();
        m69265M2().f69815o.mo3946b().setOnClickListener(new C28115a(this));
        m69265M2().f69810j.setOnRefreshListener(new C28116b(m69267O2()));
        m69265M2().f69808h.setText(C32343x.m95420V("text.commissions.emptylist", C32343x.m95452h0(C10328q.commissions_empty_list_indicator_text, new Object[0]), new Object[0]));
        m69267O2().mo53556fw();
    }

    /* renamed from: R2 */
    public final void mo53514R2(boolean z) {
        if (z) {
            m69265M2().f69816p.setVisibility(8);
            m69265M2().f69814n.setVisibility(0);
            return;
        }
        m69265M2().f69810j.setRefreshing(false);
        m69265M2().f69814n.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m69267O2().mo53559iw(i, i2);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95452h0(C10328q.common_text_commissions, new Object[0]);
    }
}
