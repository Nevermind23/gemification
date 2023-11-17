package y30;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import d40.C19902c;
import g91.C32303f;
import g91.C32343x;
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
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import q40.C27680a;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: y30.c */
public final class C29912c extends C29615f {

    /* renamed from: o */
    public static final C29913a f75669o = new C29913a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C43079p f75670f;

    /* renamed from: g */
    private C43064a f75671g;

    /* renamed from: h */
    private C43064a f75672h;

    /* renamed from: i */
    private FilterValue.Calendar f75673i = new FilterValue.Calendar(0, (Long) null, (Long) null, 0L);

    /* renamed from: j */
    private String f75674j = "";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public BigDecimal f75675k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ArrayList f75676l;

    /* renamed from: m */
    private boolean f75677m;

    /* renamed from: n */
    private boolean f75678n;

    /* renamed from: y30.c$a */
    public static final class C29913a {
        private C29913a() {
        }

        public /* synthetic */ C29913a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y30.c$b */
    public final class C29914b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C29912c f75679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29914b(C29912c cVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75679d = cVar;
        }
    }

    /* renamed from: y30.c$c */
    public final class C29915c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final ImageView f75680d;

        /* renamed from: e */
        private final BogTextView f75681e;

        /* renamed from: f */
        private final BogTextView f75682f;

        /* renamed from: g */
        private final BogTextView f75683g;

        /* renamed from: h */
        private final View f75684h;

        /* renamed from: i */
        private final DecimalFormat f75685i;

        /* renamed from: j */
        private final DecimalFormat f75686j;

        /* renamed from: k */
        final /* synthetic */ C29912c f75687k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29915c(C29912c cVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f75687k = cVar;
            View findViewById = view.findViewById(C10322k.iconIV);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.iconIV)");
            this.f75680d = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C10322k.titleTV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.titleTV)");
            this.f75681e = (BogTextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.f28827e1);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.amountTV)");
            this.f75682f = (BogTextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.percentTV);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.percentTV)");
            this.f75683g = (BogTextView) findViewById4;
            View findViewById5 = view.findViewById(C10322k.categoryIndicator);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.categoryIndicator)");
            this.f75684h = findViewById5;
            Locale locale = Locale.US;
            this.f75685i = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(locale));
            this.f75686j = new DecimalFormat("#0.0", new DecimalFormatSymbols(locale));
            view.setOnClickListener(new C29917d(cVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m90759i(C29912c cVar, C29915c cVar2, View view) {
            C43079p E;
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(cVar2, "this$1");
            int m = cVar.mo69515m(cVar2.getAdapterPosition());
            if (m != -1 && (E = cVar.f75670f) != null) {
                E.invoke(Long.valueOf(((AnalysisChildModel) cVar.f75676l.get(m)).mo54781f()), Boolean.FALSE);
            }
        }

        /* renamed from: j */
        public final void mo70204j(AnalysisChildModel analysisChildModel) {
            boolean z;
            String str;
            C41536l.m120489i(analysisChildModel, "analysisChild");
            C29912c cVar = this.f75687k;
            int parseColor = Color.parseColor(analysisChildModel.mo54779e());
            if ((cVar.f75675k.compareTo(BigDecimal.ZERO) >= 0 || analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) <= 0) && (cVar.f75675k.compareTo(BigDecimal.ZERO) <= 0 || analysisChildModel.mo54783h().compareTo(BigDecimal.ZERO) >= 0)) {
                z = false;
            } else {
                z = true;
            }
            this.f75680d.setImageResource(C27680a.f70771a.mo67216a(analysisChildModel.mo54781f()));
            this.f75680d.setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
            this.f75681e.setText(C27950a.m86287d(analysisChildModel.mo54782g(), false, 2, (Object) null));
            BogTextView bogTextView = this.f75682f;
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{this.f75685i.format(C32343x.m95427Y0(analysisChildModel.mo54783h(), 2)), C32303f.m95197h("GEL")}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            bogTextView.setText(format);
            if (z) {
                this.f75683g.setVisibility(8);
            } else {
                this.f75683g.setVisibility(0);
                BogTextView bogTextView2 = this.f75683g;
                if (cVar.f75675k.abs().compareTo(BigDecimal.ZERO) > 0) {
                    DecimalFormat decimalFormat = this.f75686j;
                    BigDecimal divide = analysisChildModel.mo54783h().abs().divide(cVar.f75675k.abs(), 3, RoundingMode.HALF_UP);
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
            this.f75684h.setBackgroundColor(parseColor);
        }
    }

    /* renamed from: y30.c$d */
    static final class C29916d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29912c f75688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29916d(C29912c cVar) {
            super(1);
            this.f75688d = cVar;
        }

        /* renamed from: a */
        public final void mo70205a(AnalysisChildModel analysisChildModel) {
            C41536l.m120489i(analysisChildModel, "it");
            C43079p E = this.f75688d.f75670f;
            if (E != null) {
                E.invoke(Long.valueOf(analysisChildModel.mo54781f()), Boolean.TRUE);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70205a((AnalysisChildModel) obj);
            return C41238w.f97225a;
        }
    }

    public C29912c() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        this.f75675k = bigDecimal;
        this.f75676l = new ArrayList();
        this.f75677m = true;
        this.f75678n = true;
    }

    /* renamed from: H */
    public final void mo70198H(AnalysisChildModel analysisChildModel, FilterValue.Calendar calendar) {
        C41536l.m120489i(analysisChildModel, "analysisChild");
        C41536l.m120489i(calendar, "calendarValue");
        this.f75676l.clear();
        ArrayList arrayList = this.f75676l;
        List d = analysisChildModel.mo54777d();
        C41536l.m120486f(d);
        arrayList.addAll(d);
        this.f75673i = calendar;
        this.f75675k = analysisChildModel.mo54783h();
        this.f75674j = C27950a.m86287d(analysisChildModel.mo54782g(), false, 2, (Object) null);
        mo69516r(0);
        C29615f.m89897A(this, 2, this.f75676l.size(), false, 4, (Object) null);
    }

    /* renamed from: I */
    public final void mo70199I(C43064a aVar) {
        this.f75671g = aVar;
    }

    /* renamed from: J */
    public final void mo70200J(C43079p pVar) {
        C41536l.m120489i(pVar, "block");
        this.f75670f = pVar;
    }

    /* renamed from: K */
    public final void mo70201K(C43064a aVar) {
        this.f75672h = aVar;
    }

    /* renamed from: L */
    public final void mo70202L(boolean z) {
        this.f75678n = z;
    }

    /* renamed from: M */
    public final void mo70203M(boolean z) {
        this.f75677m = z;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 1), new C29615f.C29617b(1, 1), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null));
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            return C19902c.C19903a.m65782b(C19902c.f54412u, viewGroup, false, 2, (Object) null);
        }
        if (i != 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_category_item, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…gory_item, parent, false)");
            return new C29915c(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_divider_item, viewGroup, false);
        C41536l.m120488h(inflate2, "from(parent.context).inf…ider_item, parent, false)");
        return new C29914b(this, inflate2);
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        RecyclerView.C1734f0 f0Var2 = f0Var;
        C41536l.m120489i(f0Var2, "holder");
        if (f0Var2 instanceof C19902c) {
            C19902c cVar = (C19902c) f0Var2;
            String str = this.f75674j;
            BigDecimal bigDecimal = this.f75675k;
            C19902c.C19904b bVar = r2;
            C19902c.C19904b bVar2 = new C19902c.C19904b(str, bigDecimal, bigDecimal, (Drawable) null, this.f75676l, this.f75673i, true, this.f75677m, this.f75678n, false, 0, false, 3584, (DefaultConstructorMarker) null);
            cVar.mo48272o(bVar);
            cVar.mo48276t(new C29916d(this));
            cVar.mo48274r(this.f75671g);
            cVar.mo48277u(this.f75672h);
        } else if (f0Var2 instanceof C29915c) {
            Object obj = this.f75676l.get(i2);
            C41536l.m120488h(obj, "listItems[positionInSection]");
            ((C29915c) f0Var2).mo70204j((AnalysisChildModel) obj);
        }
    }
}
