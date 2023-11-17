package p341ge.bog.designsystem.components.datefilter;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import he1.C41217g;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10053y2;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.datefilter.DateFilterView */
public final class DateFilterView extends LayerView {

    /* renamed from: i */
    public static final C13288a f39310i = new C13288a((DefaultConstructorMarker) null);

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f39311j = {C41520a0.m120439e(new C41539o(DateFilterView.class, "filterText", "getFilterText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private final C10053y2 f39312d;

    /* renamed from: e */
    private final C41217g f39313e;

    /* renamed from: f */
    private final C18355e0 f39314f;

    /* renamed from: g */
    private long f39315g;

    /* renamed from: h */
    private long f39316h;

    /* renamed from: ge.bog.designsystem.components.datefilter.DateFilterView$a */
    public static final class C13288a {
        private C13288a() {
        }

        public /* synthetic */ C13288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.datefilter.DateFilterView$b */
    static final class C13289b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DateFilterView f39317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13289b(DateFilterView dateFilterView) {
            super(0);
            this.f39317d = dateFilterView;
        }

        /* renamed from: b */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("MMM, yyyy", C18368l.m62759h(this.f39317d));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DateFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50007a() {
        String b = m50008b(this.f39315g);
        String b2 = m50008b(this.f39316h);
        setFilterText(b + " - " + b2);
    }

    /* renamed from: b */
    private final String m50008b(long j) {
        String format = getSdf().format(new Date(j));
        C41536l.m120488h(format, "sdf.format(Date(this))");
        return format;
    }

    private final SimpleDateFormat getSdf() {
        return (SimpleDateFormat) this.f39313e.getValue();
    }

    public final long getEndTimestamp() {
        return this.f39316h;
    }

    public final CharSequence getFilterText() {
        return this.f39314f.getValue(this, f39311j[0]);
    }

    public final long getStartTimestamp() {
        return this.f39315g;
    }

    public final void setEndTimestamp(long j) {
        this.f39316h = j;
        m50007a();
    }

    public final void setFilterText(CharSequence charSequence) {
        this.f39314f.setValue(this, f39311j[0], charSequence);
    }

    public final void setStartTimestamp(long j) {
        this.f39315g = j;
        m50007a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DateFilterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DateFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10053y2 d = C10053y2.m36874d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39312d = d;
        this.f39313e = C41219i.m119470b(new C13289b(this));
        TextView textView = d.f27772e;
        C41536l.m120488h(textView, "binding.filterText");
        this.f39314f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        setStartTimestamp(0);
        setEndTimestamp(new Date().getTime());
        int[] iArr = C17787l.f50189X3;
        C41536l.m120488h(iArr, "DateFilterView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50204Y3, -1);
        if (resourceId != -1) {
            d.f27773f.setImageDrawable(C5769a.m23210b(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
