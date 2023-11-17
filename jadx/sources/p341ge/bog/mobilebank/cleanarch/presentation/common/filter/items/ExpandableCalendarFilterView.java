package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import c10.C19443b;
import c10.C19445c;
import c10.C19447e;
import c10.C19454j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import d10.C19821e;
import g91.C32319m;
import he1.C41238w;
import iu0.C36546y;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView */
public final class ExpandableCalendarFilterView extends C19821e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f57540A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f57541B;

    /* renamed from: C */
    private String f57542C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public String f57543D;

    /* renamed from: E */
    private final C21523b f57544E;

    /* renamed from: F */
    private final C21524c f57545F;

    /* renamed from: w */
    private final C21522a f57546w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public long f57547x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Long f57548y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Long f57549z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView$a */
    public enum C21522a {
        DATE_PICKER,
        MONTH_PICKER
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView$b */
    public static final class C21523b implements C19454j {

        /* renamed from: a */
        final /* synthetic */ ExpandableCalendarFilterView f57553a;

        C21523b(ExpandableCalendarFilterView expandableCalendarFilterView) {
            this.f57553a = expandableCalendarFilterView;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            Long l;
            this.f57553a.f57541B = j;
            if (this.f57553a.f57548y != null) {
                long F = this.f57553a.f57541B;
                Long B = this.f57553a.f57548y;
                C41536l.m120486f(B);
                if (F > B.longValue()) {
                    l = Long.valueOf(this.f57553a.f57541B);
                } else {
                    l = this.f57553a.f57548y;
                }
                ExpandableCalendarFilterView expandableCalendarFilterView = this.f57553a;
                C41536l.m120486f(l);
                expandableCalendarFilterView.m69591K(l.longValue(), this.f57553a.f57541B, this.f57553a.f57540A, false).mo47662d();
                return;
            }
            ExpandableCalendarFilterView expandableCalendarFilterView2 = this.f57553a;
            expandableCalendarFilterView2.f57547x = expandableCalendarFilterView2.f57541B;
            this.f57553a.m69593M();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView$c */
    public static final class C21524c implements C19454j {

        /* renamed from: a */
        final /* synthetic */ ExpandableCalendarFilterView f57554a;

        C21524c(ExpandableCalendarFilterView expandableCalendarFilterView) {
            this.f57554a = expandableCalendarFilterView;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            ExpandableCalendarFilterView expandableCalendarFilterView = this.f57554a;
            expandableCalendarFilterView.f57547x = expandableCalendarFilterView.f57541B;
            this.f57554a.f57548y = Long.valueOf(j);
            this.f57554a.m69593M();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.ExpandableCalendarFilterView$d */
    static final class C21525d extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ ExpandableCalendarFilterView f57555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21525d(ExpandableCalendarFilterView expandableCalendarFilterView) {
            super(2);
            this.f57555d = expandableCalendarFilterView;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m69599c(ExpandableCalendarFilterView expandableCalendarFilterView, View view) {
            long j;
            C41536l.m120489i(expandableCalendarFilterView, "this$0");
            C36546y.m108282F().mo27152s(expandableCalendarFilterView.getAnalyticsCategory(), "date", "select_filter");
            long D = expandableCalendarFilterView.f57547x;
            Long E = expandableCalendarFilterView.f57549z;
            if (E != null) {
                j = E.longValue();
            } else {
                j = 0;
            }
            expandableCalendarFilterView.m69591K(D, j, expandableCalendarFilterView.f57540A, true).mo47662d();
        }

        /* renamed from: b */
        public final void mo53742b(View view, int i) {
            C41536l.m120489i(view, "itemView");
            View findViewById = view.findViewById(C10322k.dateTV);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.dateTV)");
            view.setOnClickListener(new C21528b(this.f57555d));
            ((BogTextView) findViewById).setText(this.f57555d.f57543D);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo53742b((View) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpandableCalendarFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (C21522a) null, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final C19445c m69591K(long j, long j2, long j3, boolean z) {
        C19454j jVar;
        if (z) {
            jVar = this.f57544E;
        } else {
            jVar = this.f57545F;
        }
        C19454j jVar2 = jVar;
        if (this.f57546w == C21522a.DATE_PICKER) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            return new C19443b(context, j, j2, j3, jVar2);
        }
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        return new C19447e(context2, j, j2, j3, Boolean.valueOf(z), jVar2);
    }

    /* renamed from: L */
    private final void m69592L() {
        setExpandable(false);
        setOnBindItem(new C21525d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m69593M() {
        String str;
        String str2;
        String str3 = null;
        if (this.f57546w == C21522a.MONTH_PICKER) {
            str = C32319m.m95303j(this.f57547x);
            C41536l.m120488h(str, "formatMonthYear(startDate)");
            Long l = this.f57548y;
            if (l != null) {
                str3 = C32319m.m95303j(l.longValue());
            }
        } else {
            str = C32319m.m95314u(this.f57547x);
            C41536l.m120488h(str, "getDottedDate(startDate)");
            Long l2 = this.f57548y;
            if (l2 != null) {
                str3 = C32319m.m95314u(l2.longValue());
            }
        }
        if (this.f57548y == null || C41536l.m120484d(str, str3)) {
            C41524c0 c0Var = C41524c0.f97701a;
            str2 = String.format("%s", Arrays.copyOf(new Object[]{str}, 1));
            C41536l.m120488h(str2, "format(format, *args)");
        } else {
            C41524c0 c0Var2 = C41524c0.f97701a;
            str2 = String.format("%s - %s", Arrays.copyOf(new Object[]{str, str3}, 2));
            C41536l.m120488h(str2, "format(format, *args)");
        }
        setDescription(str2);
    }

    private final void setDescription(String str) {
        if (str == null) {
            str = "";
        }
        this.f57543D = str;
        mo53637o();
    }

    public final String getAnalyticsCategory() {
        return this.f57542C;
    }

    public final C21522a getMode() {
        return this.f57546w;
    }

    public int getSelectedCount() {
        return 0;
    }

    public FilterValue getValue() {
        return new FilterValue.Calendar(this.f57547x, this.f57548y, this.f57549z, Long.valueOf(this.f57540A));
    }

    public final void setAnalyticsCategory(String str) {
        this.f57542C = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpandableCalendarFilterView(Context context, AttributeSet attributeSet, C21522a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? C21522a.DATE_PICKER : aVar);
    }

    public void setValue(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, C11755a.C11756a.f34100b);
        this.f57547x = calendar.mo53804d();
        this.f57548y = calendar.mo53802a();
        this.f57549z = calendar.mo53806e();
        Long b = calendar.mo53803b();
        if (b != null) {
            this.f57540A = b.longValue();
        }
        m69593M();
        ExpandableItemView.m69446y(this, 1, false, 2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableCalendarFilterView(Context context, AttributeSet attributeSet, C21522a aVar) {
        super(context, attributeSet, C10324m.calendar_filter_item_layout);
        C41536l.m120489i(context, "context");
        this.f57546w = aVar;
        this.f57549z = 0L;
        this.f57540A = Calendar.getInstance().getTimeInMillis();
        this.f57543D = "";
        this.f57544E = new C21523b(this);
        this.f57545F = new C21524c(this);
        m69592L();
    }
}
