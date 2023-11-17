package g40;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;
import g91.C32303f;
import g91.C32319m;
import g91.C32335t0;
import g91.C32343x;
import g91.C32359z0;
import he1.C41238w;
import i40.C25115a;
import i40.C25117c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q40.C27680a;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: g40.i */
public final class C20694i extends C29615f {

    /* renamed from: l */
    public static final C20701d f55825l = new C20701d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C25117c f55826f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RecyclerView f55827g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ExpandableItemView f55828h;

    /* renamed from: i */
    private C43064a f55829i;

    /* renamed from: j */
    private C20695a f55830j;

    /* renamed from: k */
    private C43079p f55831k;

    /* renamed from: g40.i$a */
    public interface C20695a {
        /* renamed from: a */
        void mo49218a(ArrayList arrayList);

        /* renamed from: b */
        void mo49219b();

        /* renamed from: c */
        void mo49220c();
    }

    /* renamed from: g40.i$b */
    public final class C20696b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final BudgetProgressBar f55832d;

        /* renamed from: e */
        private final BogTextView f55833e;

        /* renamed from: f */
        private final BogTextView f55834f;

        /* renamed from: g */
        private final BogTextView f55835g;

        /* renamed from: h */
        private final BogTextView f55836h;

        /* renamed from: i */
        private final BogTextView f55837i;

        /* renamed from: j */
        private final BogTextView f55838j;

        /* renamed from: k */
        final /* synthetic */ C20694i f55839k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20696b(C20694i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55839k = iVar;
            View findViewById = view.findViewById(C10322k.f28913yq);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.progressBar)");
            this.f55832d = (BudgetProgressBar) findViewById;
            View findViewById2 = view.findViewById(C10322k.dateTV);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.dateTV)");
            this.f55833e = (BogTextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.leftBudgetTV);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.leftBudgetTV)");
            this.f55834f = (BogTextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.spentMoneyTV);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.spentMoneyTV)");
            this.f55835g = (BogTextView) findViewById4;
            View findViewById5 = view.findViewById(C10322k.spentMoneyPercentTV);
            C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.spentMoneyPercentTV)");
            this.f55836h = (BogTextView) findViewById5;
            View findViewById6 = view.findViewById(C10322k.budgetTV);
            C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.budgetTV)");
            this.f55837i = (BogTextView) findViewById6;
            View findViewById7 = view.findViewById(C10322k.leftBudgetLabelTV);
            C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.leftBudgetLabelTV)");
            this.f55838j = (BogTextView) findViewById7;
            view.findViewById(C10322k.editIV).setOnClickListener(new C20703j(iVar));
            view.findViewById(C10322k.addIV).setOnClickListener(new C20704k(iVar));
            view.findViewById(C10322k.historyIV).setOnClickListener(new C20705l(iVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m67047k(C20694i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C20695a J = iVar.mo49209J();
            if (J != null) {
                J.mo49218a(iVar.m67028K(iVar.f55826f));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m67048l(C20694i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C20695a J = iVar.mo49209J();
            if (J != null) {
                J.mo49219b();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m67049m(C20694i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C20695a J = iVar.mo49209J();
            if (J != null) {
                J.mo49220c();
            }
        }

        /* renamed from: n */
        public final void mo49221n() {
            C25117c E = this.f55839k.f55826f;
            if (E != null) {
                String T = C32359z0.m95549T(E.mo63655d());
                String T2 = C32359z0.m95549T(E.mo63654c());
                BigDecimal divide = E.mo63654c().divide(E.mo63655d(), 2, RoundingMode.HALF_UP);
                C41536l.m120488h(divide, "totalSpend.divide(totalV… 2, RoundingMode.HALF_UP)");
                BigDecimal valueOf = BigDecimal.valueOf((long) 100);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                BigDecimal multiply = divide.multiply(valueOf);
                C41536l.m120488h(multiply, "this.multiply(other)");
                BigDecimal scale = multiply.setScale(0);
                this.f55832d.mo53614g(E.mo63655d().floatValue(), E.mo63654c().floatValue(), true);
                this.f55833e.setText(C32319m.m95302i(Calendar.getInstance().getTimeInMillis(), this.itemView.getContext()));
                BogTextView bogTextView = this.f55834f;
                C41524c0 c0Var = C41524c0.f97701a;
                BigDecimal subtract = E.mo63655d().subtract(E.mo63654c());
                C41536l.m120488h(subtract, "this.subtract(other)");
                String format = String.format("%s%s", Arrays.copyOf(new Object[]{C32359z0.m95549T(subtract.abs()), "₾"}, 2));
                C41536l.m120488h(format, "format(format, *args)");
                bogTextView.setText(format);
                BogTextView bogTextView2 = this.f55835g;
                String format2 = String.format("%s%s", Arrays.copyOf(new Object[]{T2, "₾"}, 2));
                C41536l.m120488h(format2, "format(format, *args)");
                bogTextView2.setText(format2);
                BogTextView bogTextView3 = this.f55836h;
                String format3 = String.format("%s%s%s", Arrays.copyOf(new Object[]{"(", scale, "%)"}, 3));
                C41536l.m120488h(format3, "format(format, *args)");
                bogTextView3.setText(format3);
                BogTextView bogTextView4 = this.f55837i;
                String format4 = String.format("%s %s", Arrays.copyOf(new Object[]{T, "₾"}, 2));
                C41536l.m120488h(format4, "format(format, *args)");
                bogTextView4.setText(format4);
                if (E.mo63655d().compareTo(E.mo63654c()) < 0) {
                    this.f55834f.setTextColor(C0767a.m2893c(this.itemView.getContext(), C10318g.budget_overspent_color));
                    this.f55838j.setText(this.itemView.getContext().getText(C10328q.f28944U8));
                    return;
                }
                this.f55834f.setTextColor(C0767a.m2893c(this.itemView.getContext(), C10318g.pfm_green));
                this.f55838j.setText(this.itemView.getContext().getText(C10328q.left_budget));
            }
        }
    }

    /* renamed from: g40.i$c */
    public final class C20697c extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public ExpandableItemView f55840d;

        /* renamed from: e */
        private CardView f55841e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C25115a f55842f;

        /* renamed from: g */
        final /* synthetic */ C20694i f55843g;

        /* renamed from: g40.i$c$a */
        static final class C20698a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C20697c f55844d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20698a(C20697c cVar) {
                super(1);
                this.f55844d = cVar;
            }

            /* renamed from: a */
            public final void mo49223a(View view) {
                C41536l.m120489i(view, "view");
                C20697c cVar = this.f55844d;
                C25115a j = cVar.f55842f;
                if (j == null) {
                    C41536l.m120506z("budget");
                    j = null;
                }
                cVar.m67055l(view, j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49223a((View) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.i$c$b */
        static final class C20699b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C20697c f55845d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20699b(C20697c cVar) {
                super(2);
                this.f55845d = cVar;
            }

            /* renamed from: a */
            public final void mo49224a(View view, int i) {
                C41536l.m120489i(view, "view");
                C20697c cVar = this.f55845d;
                C25115a j = cVar.f55842f;
                if (j == null) {
                    C41536l.m120506z("budget");
                    j = null;
                }
                cVar.m67055l(view, (C25115a) j.mo63630d().get(i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo49224a((View) obj, ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: g40.i$c$c */
        static final class C20700c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ View f55846d;

            /* renamed from: e */
            final /* synthetic */ C20697c f55847e;

            /* renamed from: f */
            final /* synthetic */ C20694i f55848f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20700c(View view, C20697c cVar, C20694i iVar) {
                super(1);
                this.f55846d = view;
                this.f55847e = cVar;
                this.f55848f = iVar;
            }

            /* renamed from: a */
            public final void mo49225a(boolean z) {
                Drawable background;
                Drawable background2;
                BogImageView bogImageView = (BogImageView) this.f55846d.findViewById(C10322k.arrowIV);
                C25115a j = this.f55847e.f55842f;
                if (j == null) {
                    C41536l.m120506z("budget");
                    j = null;
                }
                if (!(!j.mo63630d().isEmpty())) {
                    return;
                }
                if (z) {
                    ExpandableItemView F = this.f55848f.f55828h;
                    if (F != null) {
                        F.mo53625f(true);
                    }
                    this.f55848f.f55828h = this.f55847e.f55840d;
                    if (!(bogImageView == null || (background2 = bogImageView.getBackground()) == null)) {
                        background2.setColorFilter(C32335t0.m95357b(), PorterDuff.Mode.SRC_IN);
                    }
                    if (bogImageView != null) {
                        bogImageView.setColorFilter(C0767a.m2893c(this.f55846d.getContext(), C10318g.f28616A));
                    }
                    this.f55847e.f55840d.setPadding(0, 0, 0, C32343x.m95394I(8));
                    return;
                }
                this.f55848f.f55828h = null;
                if (!(bogImageView == null || (background = bogImageView.getBackground()) == null)) {
                    background.setColorFilter(C0767a.m2893c(this.f55846d.getContext(), C10318g.pfm_light_gray), PorterDuff.Mode.SRC_IN);
                }
                if (bogImageView != null) {
                    bogImageView.setColorFilter(C0767a.m2893c(this.f55846d.getContext(), C10318g.gray));
                }
                this.f55847e.f55840d.setPadding(0, 0, 0, 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49225a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20697c(C20694i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f55843g = iVar;
            View findViewById = view.findViewById(C10322k.expandableItem);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.expandableItem)");
            this.f55840d = (ExpandableItemView) findViewById;
            View findViewById2 = view.findViewById(C10322k.expandableItemParentLayout);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.…pandableItemParentLayout)");
            CardView cardView = (CardView) findViewById2;
            this.f55841e = cardView;
            this.f55840d.setScrollOffset(cardView.getTop() - 20);
            this.f55840d.setScrollableParent(iVar.f55827g);
            this.f55840d.setOnBindHeader(new C20698a(this));
            this.f55840d.setOnBindItem(new C20699b(this));
            this.f55840d.setOnStateChanged(new C20700c(view, this, iVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m67055l(View view, C25115a aVar) {
            View view2 = view;
            C20694i iVar = this.f55843g;
            View findViewById = view2.findViewById(C10322k.f28851jf);
            C41536l.m120488h(findViewById, "contentView.findViewById(R.id.headerContainer)");
            View findViewById2 = view2.findViewById(C10322k.f28913yq);
            C41536l.m120488h(findViewById2, "contentView.findViewById(R.id.progressBar)");
            BudgetProgressBar budgetProgressBar = (BudgetProgressBar) findViewById2;
            View findViewById3 = view2.findViewById(C10322k.iconIV);
            C41536l.m120488h(findViewById3, "contentView.findViewById(R.id.iconIV)");
            ImageView imageView = (ImageView) findViewById3;
            View findViewById4 = view2.findViewById(C10322k.categoryNameTV);
            C41536l.m120488h(findViewById4, "contentView.findViewById(R.id.categoryNameTV)");
            View findViewById5 = view2.findViewById(C10322k.leftBudgetTV);
            C41536l.m120488h(findViewById5, "contentView.findViewById(R.id.leftBudgetTV)");
            BogTextView bogTextView = (BogTextView) findViewById5;
            View findViewById6 = view2.findViewById(C10322k.spentMoneyTV);
            C41536l.m120488h(findViewById6, "contentView.findViewById(R.id.spentMoneyTV)");
            View findViewById7 = view2.findViewById(C10322k.budgetTV);
            C41536l.m120488h(findViewById7, "contentView.findViewById(R.id.budgetTV)");
            BogImageView bogImageView = (BogImageView) view2.findViewById(C10322k.arrowIV);
            String T = C32359z0.m95549T(aVar.mo63639k());
            String T2 = C32359z0.m95549T(aVar.mo63638j());
            int parseColor = Color.parseColor(aVar.mo63631e());
            imageView.setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
            C20694i iVar2 = iVar;
            imageView.setImageResource(C27680a.f70771a.mo67216a(aVar.mo63629c()));
            ((BogTextView) findViewById4).setText(C27950a.m86287d(aVar.mo63634g(), false, 2, (Object) null));
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{T2, C32303f.m95197h("GEL")}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            ((BogTextView) findViewById6).setText(format);
            String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{T, C32303f.m95197h("GEL")}, 2));
            C41536l.m120488h(format2, "format(format, *args)");
            ((BogTextView) findViewById7).setText(format2);
            budgetProgressBar.setPositiveProgressColor(parseColor);
            budgetProgressBar.mo53614g(aVar.mo63639k().floatValue(), aVar.mo63638j().floatValue(), true);
            if (!aVar.mo63630d().isEmpty()) {
                if (bogImageView != null) {
                    bogImageView.setVisibility(0);
                }
                if (bogImageView != null) {
                    bogImageView.setImageDrawable(C32290b1.m95122l(this.itemView.getContext(), bogImageView.getDrawable(), C10318g.budgeting_dark_gray));
                }
            } else if (bogImageView != null) {
                bogImageView.setVisibility(8);
            }
            if (aVar.mo63639k().compareTo(aVar.mo63638j()) < 0) {
                bogTextView.setTextColor(C0767a.m2893c(this.itemView.getContext(), C10318g.budget_overspent_color));
                BigDecimal subtract = aVar.mo63639k().subtract(aVar.mo63638j());
                C41536l.m120488h(subtract, "this.subtract(other)");
                String format3 = String.format("%s %s", Arrays.copyOf(new Object[]{C32359z0.m95549T(subtract.abs()), C32303f.m95197h("GEL")}, 2));
                C41536l.m120488h(format3, "format(format, *args)");
                bogTextView.setText(format3);
            } else {
                bogTextView.setTextColor(C0767a.m2893c(this.itemView.getContext(), C10318g.pfm_green));
                BigDecimal subtract2 = aVar.mo63639k().subtract(aVar.mo63638j());
                C41536l.m120488h(subtract2, "this.subtract(other)");
                String format4 = String.format("%s %s", Arrays.copyOf(new Object[]{C32359z0.m95549T(subtract2.abs()), C32303f.m95197h("GEL")}, 2));
                C41536l.m120488h(format4, "format(format, *args)");
                bogTextView.setText(format4);
            }
            if (aVar.mo63630d().isEmpty()) {
                findViewById = view;
            }
            if (aVar.mo63638j().compareTo(BigDecimal.ZERO) > 0) {
                findViewById.setOnClickListener(new C20706m(iVar2, aVar));
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m67056m(C20694i iVar, C25115a aVar, View view) {
            String str;
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(aVar, "$this_with");
            C43079p L = iVar.mo49210L();
            if (L != null) {
                C25117c E = iVar.f55826f;
                if (E != null) {
                    str = E.mo63653b();
                } else {
                    str = null;
                }
                Long D = C32319m.m95284D(str);
                C41536l.m120488h(D, "getTimestampFromDate(bud…DataResponseModel?.month)");
                L.invoke(aVar, D);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49222n(i40.C25115a r5) {
            /*
                r4 = this;
                java.lang.String r0 = "budget"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                r4.f55842f = r5
                java.util.List r5 = r5.mo63630d()
                int r5 = r5.size()
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55840d
                r1 = 2
                r2 = 0
                r3 = 0
                p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView.m69446y(r0, r5, r3, r1, r2)
                g40.i r0 = r4.f55843g
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r0.f55828h
                if (r0 == 0) goto L_0x0036
                g40.i r0 = r4.f55843g
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r0.f55828h
                kotlin.jvm.internal.C41536l.m120486f(r0)
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r1 = r4.f55840d
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
                if (r0 == 0) goto L_0x0036
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55840d
                r0.mo53635i(r3)
                goto L_0x003b
            L_0x0036:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55840d
                r0.mo53625f(r3)
            L_0x003b:
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView r0 = r4.f55840d
                if (r5 <= 0) goto L_0x0040
                r3 = 1
            L_0x0040:
                r0.setScrollToTopWhenExpanded(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g40.C20694i.C20697c.mo49222n(i40.a):void");
        }
    }

    /* renamed from: g40.i$d */
    public static final class C20701d {
        private C20701d() {
        }

        public /* synthetic */ C20701d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g40.i$e */
    public final class C20702e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C20694i f55849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20702e(C20694i iVar, NoDataView noDataView) {
            super(noDataView);
            C41536l.m120489i(noDataView, "itemView");
            this.f55849d = iVar;
            noDataView.mo53658d(iVar.mo49211M());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final ArrayList m67028K(C25117c cVar) {
        List<C25115a> a;
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        if (!(cVar == null || (a = cVar.mo63652a()) == null)) {
            for (C25115a aVar : a) {
                Long f = aVar.mo63633f();
                if (f != null) {
                    j = f.longValue();
                } else {
                    j = 0;
                }
                AddBudgetModel addBudgetModel = r3;
                AddBudgetModel addBudgetModel2 = new AddBudgetModel(j, new ArrayList(), aVar.mo63629c(), C27950a.m86287d(aVar.mo63634g(), false, 2, (Object) null), true, Color.parseColor(aVar.mo63631e()), aVar.mo63639k(), false, (String) null, aVar.mo63635h(), false, 1408, (DefaultConstructorMarker) null);
                for (C25115a aVar2 : aVar.mo63630d()) {
                    List d = addBudgetModel.mo54885d();
                    Long f2 = aVar2.mo63633f();
                    if (f2 != null) {
                        j2 = f2.longValue();
                    } else {
                        j2 = 0;
                    }
                    d.add(new AddBudgetModel(j2, new ArrayList(), aVar2.mo63629c(), C27950a.m86287d(aVar2.mo63634g(), false, 2, (Object) null), true, Color.parseColor(aVar2.mo63631e()), aVar2.mo63639k(), false, (String) null, aVar2.mo63635h(), false, 1408, (DefaultConstructorMarker) null));
                }
                arrayList.add(addBudgetModel);
            }
        }
        return arrayList;
    }

    /* renamed from: N */
    private final void m67029N() {
        List<C29615f.C29617b> l = mo48134l();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(l, 10));
        for (C29615f.C29617b b : l) {
            arrayList.add(Integer.valueOf(b.mo69533b()));
        }
        mo69519u(arrayList);
    }

    /* renamed from: J */
    public final C20695a mo49209J() {
        return this.f55830j;
    }

    /* renamed from: L */
    public final C43079p mo49210L() {
        return this.f55831k;
    }

    /* renamed from: M */
    public final C43064a mo49211M() {
        return this.f55829i;
    }

    /* renamed from: O */
    public final void mo49212O(C20695a aVar) {
        this.f55830j = aVar;
    }

    /* renamed from: P */
    public final void mo49213P(C25117c cVar) {
        C41536l.m120489i(cVar, "budgetingDataResponseModel");
        this.f55826f = cVar;
        m67029N();
        C29615f.m89897A(this, 0, 1, false, 4, (Object) null);
        C29615f.m89897A(this, 2, cVar.mo63652a().size(), false, 4, (Object) null);
    }

    /* renamed from: Q */
    public final void mo49214Q(C43079p pVar) {
        this.f55831k = pVar;
    }

    /* renamed from: R */
    public final void mo49215R(C43064a aVar) {
        this.f55829i = aVar;
    }

    /* renamed from: S */
    public final void mo49216S() {
        m67029N();
        C29615f.m89897A(this, 5, 1, false, 4, (Object) null);
    }

    /* renamed from: T */
    public final void mo49217T() {
        m67029N();
        C29615f.m89897A(this, 6, 1, false, 4, (Object) null);
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(5, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(6, 0, 2, (DefaultConstructorMarker) null));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f55827g = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budget_card_item_layout, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …em_layout, parent, false)");
            return new C20696b(this, inflate);
        } else if (i == 5) {
            Context context = viewGroup.getContext();
            C41536l.m120488h(context, "parent.context");
            NoDataView noDataView = new NoDataView(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            noDataView.setShowButton(true);
            noDataView.setIcon(C10320i.ic_pfm_data_error);
            String string = viewGroup.getContext().getString(C10328q.could_not_load_data);
            C41536l.m120488h(string, "parent.context.getString…ring.could_not_load_data)");
            noDataView.setMessage(string);
            String string2 = viewGroup.getContext().getString(C10328q.pfm_data_reload);
            C41536l.m120488h(string2, "parent.context.getString(R.string.pfm_data_reload)");
            noDataView.setButtonText(string2);
            noDataView.setButtonIcon(C10320i.ic_pfm_reload);
            noDataView.setBackgroundColor(C0767a.m2893c(viewGroup.getContext(), C10318g.f28616A));
            return new C20702e(this, noDataView);
        } else if (i == 6) {
            return new C37107d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.full_progress_bar, viewGroup, false));
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.budget_category_recycler_item, viewGroup, false);
            C41536l.m120488h(inflate2, "from(parent.context)\n   …cler_item, parent, false)");
            return new C20697c(this, inflate2);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C25117c cVar;
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20696b) {
            C25117c cVar2 = this.f55826f;
            if (cVar2 != null && (!cVar2.mo63652a().isEmpty())) {
                ((C20696b) f0Var).mo49221n();
            }
        } else if ((f0Var instanceof C20697c) && (cVar = this.f55826f) != null) {
            ((C20697c) f0Var).mo49222n((C25115a) cVar.mo63652a().get(i2));
        }
    }
}
