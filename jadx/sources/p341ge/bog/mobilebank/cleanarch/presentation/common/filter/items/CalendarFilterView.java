package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import c10.C19443b;
import c10.C19445c;
import c10.C19447e;
import c10.C19454j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import d10.C19820d;
import d10.C19822f;
import g91.C32319m;
import iu0.C36546y;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarFilterView */
public final class CalendarFilterView extends C19822f {

    /* renamed from: f */
    private C21519a f57523f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f57524g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Long f57525h;

    /* renamed from: i */
    private Long f57526i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f57527j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f57528k;

    /* renamed from: l */
    private String f57529l;

    /* renamed from: m */
    private TextView f57530m;

    /* renamed from: n */
    private int f57531n;

    /* renamed from: o */
    private String f57532o;

    /* renamed from: p */
    private final C21520b f57533p;

    /* renamed from: q */
    private final C21521c f57534q;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarFilterView$a */
    public enum C21519a {
        DATE_PICKER,
        MONTH_PICKER
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarFilterView$b */
    public static final class C21520b implements C19454j {

        /* renamed from: a */
        final /* synthetic */ CalendarFilterView f57538a;

        C21520b(CalendarFilterView calendarFilterView) {
            this.f57538a = calendarFilterView;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            Long l;
            this.f57538a.f57528k = j;
            if (this.f57538a.f57525h != null) {
                long e = this.f57538a.f57528k;
                Long c = this.f57538a.f57525h;
                C41536l.m120486f(c);
                if (e > c.longValue()) {
                    l = Long.valueOf(this.f57538a.f57528k);
                } else {
                    l = this.f57538a.f57525h;
                }
                CalendarFilterView calendarFilterView = this.f57538a;
                C41536l.m120486f(l);
                calendarFilterView.m69573j(l.longValue(), this.f57538a.f57528k, this.f57538a.f57527j, false).mo47662d();
                return;
            }
            CalendarFilterView calendarFilterView2 = this.f57538a;
            calendarFilterView2.f57524g = calendarFilterView2.f57528k;
            this.f57538a.m69577n();
            C43075l onValueChanged = this.f57538a.getOnValueChanged();
            if (onValueChanged != null) {
                onValueChanged.invoke(this.f57538a.getValue());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarFilterView$c */
    public static final class C21521c implements C19454j {

        /* renamed from: a */
        final /* synthetic */ CalendarFilterView f57539a;

        C21521c(CalendarFilterView calendarFilterView) {
            this.f57539a = calendarFilterView;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            CalendarFilterView calendarFilterView = this.f57539a;
            calendarFilterView.f57524g = calendarFilterView.f57528k;
            this.f57539a.f57525h = Long.valueOf(j);
            this.f57539a.m69577n();
            C43075l onValueChanged = this.f57539a.getOnValueChanged();
            if (onValueChanged != null) {
                onValueChanged.invoke(this.f57539a.getValue());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CalendarFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (C21519a) null, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C19445c m69573j(long j, long j2, long j3, boolean z) {
        C19454j jVar;
        if (z) {
            jVar = this.f57533p;
        } else {
            jVar = this.f57534q;
        }
        C19454j jVar2 = jVar;
        if (this.f57523f == C21519a.DATE_PICKER) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            return new C19443b(context, j, j2, j3, jVar2);
        }
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        return new C19447e(context2, j, j2, j3, Boolean.valueOf(z), jVar2);
    }

    /* renamed from: k */
    private final void m69574k(AttributeSet attributeSet) {
        C21519a aVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29384o1);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…eable.CalendarFilterView)");
        this.f57531n = obtainStyledAttributes.getResourceId(C10330s.f29394p1, C10324m.calendar_filter_item_layout);
        if (obtainStyledAttributes.getInt(C10330s.f29404q1, 0) == 0) {
            aVar = C21519a.DATE_PICKER;
        } else {
            aVar = C21519a.MONTH_PICKER;
        }
        this.f57523f = aVar;
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m69575l(CalendarFilterView calendarFilterView, View view) {
        long j;
        C41536l.m120489i(calendarFilterView, "this$0");
        C36546y.m108282F().mo27152s(calendarFilterView.f57529l, "date", "select_filter");
        long j2 = calendarFilterView.f57524g;
        Long l = calendarFilterView.f57526i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        calendarFilterView.m69573j(j2, j, calendarFilterView.f57527j, true).mo47662d();
    }

    /* renamed from: m */
    private final void m69576m() {
        TextView textView = this.f57530m;
        if (textView == null) {
            C41536l.m120506z("dateTV");
            textView = null;
        }
        textView.setText(this.f57532o);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m69577n() {
        String str;
        String str2;
        String str3 = null;
        if (this.f57523f == C21519a.MONTH_PICKER) {
            str = C32319m.m95303j(this.f57524g);
            C41536l.m120488h(str, "formatMonthYear(startDate)");
            Long l = this.f57525h;
            if (l != null) {
                str3 = C32319m.m95303j(l.longValue());
            }
        } else {
            str = C32319m.m95314u(this.f57524g);
            C41536l.m120488h(str, "getDottedDate(startDate)");
            Long l2 = this.f57525h;
            if (l2 != null) {
                str3 = C32319m.m95314u(l2.longValue());
            }
        }
        if (this.f57525h == null || C41536l.m120484d(str, str3)) {
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
        this.f57532o = str;
        m69576m();
    }

    public final String getAnalyticsCategory() {
        return this.f57529l;
    }

    public final C21519a getMode() {
        return this.f57523f;
    }

    public int getSelectedCount() {
        return 0;
    }

    public final void setAnalyticsCategory(String str) {
        this.f57529l = str;
    }

    public final void setMode(C21519a aVar) {
        this.f57523f = aVar;
    }

    public void setUpView(View view) {
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.dateTV);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.dateTV)");
        this.f57530m = (TextView) findViewById;
        view.setOnClickListener(new C19820d(this));
        TextView textView = this.f57530m;
        if (textView == null) {
            C41536l.m120506z("dateTV");
            textView = null;
        }
        textView.setText(this.f57532o);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarFilterView(Context context, AttributeSet attributeSet, C21519a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? C21519a.DATE_PICKER : aVar);
    }

    public FilterValue.Calendar getValue() {
        return new FilterValue.Calendar(this.f57524g, this.f57525h, this.f57526i, Long.valueOf(this.f57527j));
    }

    public void setValue(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, C11755a.C11756a.f34100b);
        this.f57524g = calendar.mo53804d();
        this.f57525h = calendar.mo53802a();
        this.f57526i = calendar.mo53806e();
        Long b = calendar.mo53803b();
        if (b != null) {
            this.f57527j = b.longValue();
        }
        m69577n();
        m69576m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarFilterView(Context context, AttributeSet attributeSet, C21519a aVar) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.f57523f = aVar;
        this.f57526i = 0L;
        this.f57527j = Calendar.getInstance().getTimeInMillis();
        this.f57531n = C10324m.calendar_filter_item_layout;
        this.f57532o = "";
        this.f57533p = new C21520b(this);
        this.f57534q = new C21521c(this);
        if (attributeSet != null) {
            m69574k(attributeSet);
        }
        View inflate = View.inflate(context, this.f57531n, this);
        C41536l.m120488h(inflate, "view");
        setUpView(inflate);
    }
}
