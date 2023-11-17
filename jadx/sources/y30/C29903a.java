package y30;

import a40.C19167a;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import d40.C19902c;
import g91.C32303f;
import g91.C32343x;
import g91.C32355x0;
import he1.C41238w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.BudgetingBannerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import q40.C27680a;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;
import z30.C30146d;

/* renamed from: y30.a */
public final class C29903a extends C29615f {

    /* renamed from: u */
    public static final C29905b f75635u = new C29905b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C43079p f75636f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43075l f75637g;

    /* renamed from: h */
    private C43064a f75638h;

    /* renamed from: i */
    private C43064a f75639i;

    /* renamed from: j */
    private C43075l f75640j;

    /* renamed from: k */
    private FilterValue.Calendar f75641k = new FilterValue.Calendar(0, (Long) null, (Long) null, 0L);

    /* renamed from: l */
    private String f75642l = "";
    /* access modifiers changed from: private */

    /* renamed from: m */
    public BigDecimal f75643m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList f75644n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f75645o;

    /* renamed from: p */
    private boolean f75646p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public RecyclerView f75647q;

    /* renamed from: r */
    private int f75648r;

    /* renamed from: s */
    private C30146d.C30148b f75649s;

    /* renamed from: t */
    private boolean f75650t;

    /* renamed from: y30.a$a */
    public final class C29904a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final BudgetingBannerView f75651d;

        /* renamed from: e */
        final /* synthetic */ C29903a f75652e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29904a(C29903a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75652e = aVar;
            View findViewById = view.findViewById(C10322k.linkCell);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.linkCell)");
            BudgetingBannerView budgetingBannerView = (BudgetingBannerView) findViewById;
            this.f75651d = budgetingBannerView;
            budgetingBannerView.setAnalyticsLabel("from_analysis");
        }

        /* renamed from: h */
        public final void mo70191h(int i) {
            this.f75651d.mo54867c(i);
        }

        /* renamed from: i */
        public final void mo70192i() {
            this.f75651d.mo54868e();
        }
    }

    /* renamed from: y30.a$b */
    public static final class C29905b {
        private C29905b() {
        }

        public /* synthetic */ C29905b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y30.a$c */
    public final class C29906c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final ImageView f75653d;

        /* renamed from: e */
        private final BogTextView f75654e;

        /* renamed from: f */
        private final BogTextView f75655f;

        /* renamed from: g */
        private final BogTextView f75656g;

        /* renamed from: h */
        private final View f75657h;

        /* renamed from: i */
        private final DecimalFormat f75658i;

        /* renamed from: j */
        private final DecimalFormat f75659j;

        /* renamed from: k */
        final /* synthetic */ C29903a f75660k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29906c(C29903a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75660k = aVar;
            View findViewById = view.findViewById(C10322k.iconIV);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.iconIV)");
            this.f75653d = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C10322k.titleTV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.titleTV)");
            this.f75654e = (BogTextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.f28827e1);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.amountTV)");
            this.f75655f = (BogTextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.percentTV);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.percentTV)");
            this.f75656g = (BogTextView) findViewById4;
            View findViewById5 = view.findViewById(C10322k.categoryIndicator);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.categoryIndicator)");
            this.f75657h = findViewById5;
            Locale locale = Locale.US;
            this.f75658i = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(locale));
            this.f75659j = new DecimalFormat("#0.0", new DecimalFormatSymbols(locale));
            view.setOnClickListener(new C29911b(aVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m90740i(C29903a aVar, C29906c cVar, View view) {
            C43079p E;
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            int m = aVar.mo69515m(cVar.getAdapterPosition());
            if (m != -1 && (E = aVar.f75636f) != null) {
                Object obj = aVar.f75644n.get(m);
                C41536l.m120488h(obj, "listItems[positionInSection]");
                E.invoke(obj, Boolean.FALSE);
            }
        }

        /* renamed from: j */
        public final void mo70193j(AnalysisChildModel analysisChildModel) {
            boolean z;
            String str;
            C41536l.m120489i(analysisChildModel, "analysisChild");
            C29903a aVar = this.f75660k;
            int parseColor = Color.parseColor(analysisChildModel.mo54779e());
            if ((!aVar.f75645o || analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) <= 0) && (aVar.f75645o || analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) >= 0)) {
                z = false;
            } else {
                z = true;
            }
            this.f75653d.setImageResource(C27680a.f70771a.mo67216a(analysisChildModel.mo54781f()));
            this.f75653d.setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
            this.f75654e.setText(C27950a.m86287d(analysisChildModel.mo54782g(), false, 2, (Object) null));
            BogTextView bogTextView = this.f75655f;
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{this.f75658i.format(C32343x.m95427Y0(analysisChildModel.mo54783h(), 2)), C32303f.m95197h("GEL")}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            bogTextView.setText(format);
            if (z) {
                this.f75656g.setVisibility(8);
            } else {
                this.f75656g.setVisibility(0);
                BogTextView bogTextView2 = this.f75656g;
                if (aVar.f75643m.abs().compareTo(BigDecimal.ZERO) > 0) {
                    DecimalFormat decimalFormat = this.f75659j;
                    BigDecimal divide = analysisChildModel.mo54783h().abs().divide(aVar.f75643m.abs(), 3, RoundingMode.HALF_UP);
                    C41536l.m120488h(divide, "value.abs().divide(categ… 3, RoundingMode.HALF_UP)");
                    BigDecimal valueOf = BigDecimal.valueOf((long) 100);
                    C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                    BigDecimal multiply = divide.multiply(valueOf);
                    C41536l.m120488h(multiply, "this.multiply(other)");
                    str = String.format("%s%s", Arrays.copyOf(new Object[]{decimalFormat.format(multiply), "%"}, 2));
                    C41536l.m120488h(str, "format(format, *args)");
                } else {
                    str = "0%";
                }
                bogTextView2.setText(str);
            }
            this.f75657h.setBackgroundColor(parseColor);
        }
    }

    /* renamed from: y30.a$d */
    public final class C29907d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TabLayout f75661d;

        /* renamed from: e */
        final /* synthetic */ C29903a f75662e;

        /* renamed from: y30.a$d$a */
        public static final class C29908a implements TabLayout.C5149d {

            /* renamed from: a */
            final /* synthetic */ C29903a f75663a;

            C29908a(C29903a aVar) {
                this.f75663a = aVar;
            }

            /* renamed from: a */
            public void mo16942a(TabLayout.C5153g gVar) {
                int i;
                C29903a aVar = this.f75663a;
                C30146d.C30148b.C30149a aVar2 = C30146d.C30148b.f76025e;
                if (gVar != null) {
                    i = gVar.mo16958g();
                } else {
                    i = 0;
                }
                C30146d.C30148b a = aVar2.mo70514a(i);
                C41536l.m120486f(a);
                aVar.mo70189T(a);
                C43075l I = this.f75663a.f75637g;
                if (I != null) {
                    I.invoke(this.f75663a.mo70182L());
                }
            }

            /* renamed from: b */
            public void mo16943b(TabLayout.C5153g gVar) {
            }

            /* renamed from: c */
            public void mo16944c(TabLayout.C5153g gVar) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29907d(C29903a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75662e = aVar;
            View findViewById = view.findViewById(C10322k.tabLayout);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.tabLayout)");
            TabLayout tabLayout = (TabLayout) findViewById;
            this.f75661d = tabLayout;
            tabLayout.addOnTabSelectedListener((TabLayout.C5149d) new C29908a(aVar));
        }

        /* renamed from: h */
        public final void mo70194h(C30146d.C30148b bVar) {
            C41536l.m120489i(bVar, "tab");
            TabLayout.C5153g tabAt = this.f75661d.getTabAt(bVar.mo70513b());
            if (tabAt != null) {
                tabAt.mo16964m();
            }
        }
    }

    /* renamed from: y30.a$e */
    public static final class C29909e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ C29903a f75664d;

        /* renamed from: e */
        final /* synthetic */ LinearLayoutManager f75665e;

        C29909e(C29903a aVar, LinearLayoutManager linearLayoutManager) {
            this.f75664d = aVar;
            this.f75665e = linearLayoutManager;
        }

        public void onGlobalLayout() {
            C32355x0.m95523n(this.f75664d.f75647q, this);
            if (this.f75665e.mo5215j2() == 0) {
                int k0 = this.f75665e.mo5686k0() - 2;
                int k02 = this.f75665e.mo5686k0();
                int o2 = this.f75665e.mo5221o2();
                boolean z = false;
                if (k0 <= o2 && o2 < k02) {
                    z = true;
                }
                if (z) {
                    C29615f.m89897A(this.f75664d, 3, 1, false, 4, (Object) null);
                    return;
                }
            }
            this.f75664d.mo69517s(3);
        }
    }

    /* renamed from: y30.a$f */
    static final class C29910f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29903a f75666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29910f(C29903a aVar) {
            super(1);
            this.f75666d = aVar;
        }

        /* renamed from: a */
        public final void mo70196a(AnalysisChildModel analysisChildModel) {
            C41536l.m120489i(analysisChildModel, "it");
            C43079p E = this.f75666d.f75636f;
            if (E != null) {
                E.invoke(analysisChildModel, Boolean.TRUE);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70196a((AnalysisChildModel) obj);
            return C41238w.f97225a;
        }
    }

    public C29903a() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        this.f75643m = bigDecimal;
        this.f75644n = new ArrayList();
        this.f75649s = C30146d.C30148b.EXPENSES;
        this.f75650t = true;
    }

    /* renamed from: M */
    private final void m90724M() {
        RecyclerView.C1747p pVar;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.f75647q;
        if (recyclerView != null) {
            pVar = recyclerView.getLayoutManager();
        } else {
            pVar = null;
        }
        C41536l.m120487g(pVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
        RecyclerView recyclerView2 = this.f75647q;
        if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C29909e(this, linearLayoutManager));
        }
    }

    /* renamed from: K */
    public final void mo70181K(String str, C19167a aVar, FilterValue.Calendar calendar, boolean z, boolean z2) {
        C41536l.m120489i(str, "categoryName");
        C41536l.m120489i(aVar, "analysisIncomeAndExpensesModel");
        C41536l.m120489i(calendar, "calendarValue");
        this.f75645o = z;
        this.f75646p = z2;
        this.f75644n.clear();
        this.f75644n.addAll(aVar.mo47392a());
        this.f75641k = calendar;
        this.f75642l = str;
        this.f75643m = aVar.mo47393b();
        mo69516r(0);
        C29615f.m89897A(this, 2, this.f75644n.size(), false, 4, (Object) null);
        m90724M();
    }

    /* renamed from: L */
    public final C30146d.C30148b mo70182L() {
        return this.f75649s;
    }

    /* renamed from: N */
    public final void mo70183N(C43075l lVar) {
        this.f75640j = lVar;
    }

    /* renamed from: O */
    public final void mo70184O(C43079p pVar) {
        C41536l.m120489i(pVar, "block");
        this.f75636f = pVar;
    }

    /* renamed from: P */
    public final void mo70185P(C43064a aVar) {
        this.f75639i = aVar;
    }

    /* renamed from: Q */
    public final void mo70186Q(C43064a aVar) {
        this.f75638h = aVar;
    }

    /* renamed from: R */
    public final void mo70187R(C43075l lVar) {
        C41536l.m120489i(lVar, "block");
        this.f75637g = lVar;
    }

    /* renamed from: S */
    public final void mo70188S(int i) {
        this.f75648r = i;
        C29615f.m89897A(this, 4, 1, false, 4, (Object) null);
    }

    /* renamed from: T */
    public final void mo70189T(C30146d.C30148b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f75649s = bVar;
    }

    /* renamed from: U */
    public final void mo70190U(boolean z) {
        this.f75650t = z;
    }

    /* renamed from: l */
    public List mo48134l() {
        List p = C41341q.m119913p(new C29615f.C29617b(0, 1), new C29615f.C29617b(1, 1), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(3, 0, 2, (DefaultConstructorMarker) null));
        if (this.f75650t) {
            p.add(1, new C29615f.C29617b(4, 1));
        }
        return p;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f75647q = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            return C19902c.C19903a.m65782b(C19902c.f54412u, viewGroup, false, 2, (Object) null);
        }
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_tab_layout_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…yout_item, parent, false)");
            return new C29907d(this, inflate);
        } else if (i == 3) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, C32343x.m95394I(80)));
            return new C37107d(view);
        } else if (i != 4) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_category_item, viewGroup, false);
            C41536l.m120488h(inflate2, "from(parent.context).inf…gory_item, parent, false)");
            return new C29906c(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budgeting_banner_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate3, "from(parent.context).inf…cler_item, parent, false)");
            return new C29904a(this, inflate3);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        RecyclerView.C1734f0 f0Var2 = f0Var;
        C41536l.m120489i(f0Var2, "holder");
        if (f0Var2 instanceof C19902c) {
            C19902c cVar = (C19902c) f0Var2;
            String str = this.f75642l;
            BigDecimal bigDecimal = this.f75643m;
            C19902c.C19904b bVar = r2;
            C19902c.C19904b bVar2 = new C19902c.C19904b(str, bigDecimal, bigDecimal, (Drawable) null, this.f75644n, this.f75641k, false, false, true, this.f75646p, 0, false, 3072, (DefaultConstructorMarker) null);
            cVar.mo48272o(bVar);
            cVar.mo48276t(new C29910f(this));
            cVar.mo48278v(this.f75638h);
            cVar.mo48277u(this.f75639i);
            cVar.mo48275s(this.f75640j);
        } else if (f0Var2 instanceof C29906c) {
            Object obj = this.f75644n.get(i2);
            C41536l.m120488h(obj, "listItems[positionInSection]");
            ((C29906c) f0Var2).mo70193j((AnalysisChildModel) obj);
        } else if (f0Var2 instanceof C29904a) {
            int i3 = this.f75648r;
            C29904a aVar = (C29904a) f0Var2;
            if (i3 >= 0) {
                aVar.mo70191h(i3);
            } else {
                aVar.mo70192i();
            }
        } else if (f0Var2 instanceof C29907d) {
            ((C29907d) f0Var2).mo70194h(this.f75649s);
        }
    }
}
