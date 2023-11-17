package p341ge.bog.designsystem.components.totalstate;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9982o2;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.totalstate.ColoredTotalStateView */
public final class ColoredTotalStateView extends LayerView {

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f40604l;

    /* renamed from: d */
    private final C9982o2 f40605d;

    /* renamed from: e */
    private final C18355e0 f40606e;

    /* renamed from: f */
    private final C18355e0 f40607f;

    /* renamed from: g */
    private final C18355e0 f40608g;

    /* renamed from: h */
    private final C18355e0 f40609h;

    /* renamed from: i */
    private final C18365j0 f40610i;

    /* renamed from: j */
    private final C18365j0 f40611j;

    /* renamed from: k */
    private C13577a f40612k;

    /* renamed from: ge.bog.designsystem.components.totalstate.ColoredTotalStateView$a */
    public static abstract class C13577a {

        /* renamed from: ge.bog.designsystem.components.totalstate.ColoredTotalStateView$a$a */
        public static final class C13578a extends C13577a {

            /* renamed from: a */
            public static final C13578a f40613a = new C13578a();

            private C13578a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: ge.bog.designsystem.components.totalstate.ColoredTotalStateView$a$b */
        public static final class C13579b extends C13577a {

            /* renamed from: a */
            private final String f40614a;

            /* renamed from: b */
            private final String f40615b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13579b(String str, String str2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "positiveBottomText");
                C41536l.m120489i(str2, "negativeBottomText");
                this.f40614a = str;
                this.f40615b = str2;
            }

            /* renamed from: a */
            public final String mo37156a() {
                return this.f40615b;
            }

            /* renamed from: b */
            public final String mo37157b() {
                return this.f40614a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13579b)) {
                    return false;
                }
                C13579b bVar = (C13579b) obj;
                return C41536l.m120484d(this.f40614a, bVar.f40614a) && C41536l.m120484d(this.f40615b, bVar.f40615b);
            }

            public int hashCode() {
                return (this.f40614a.hashCode() * 31) + this.f40615b.hashCode();
            }

            public String toString() {
                String str = this.f40614a;
                String str2 = this.f40615b;
                return "Filled(positiveBottomText=" + str + ", negativeBottomText=" + str2 + ")";
            }
        }

        private C13577a() {
        }

        public /* synthetic */ C13577a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<ColoredTotalStateView> cls = ColoredTotalStateView.class;
        f40604l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "positiveTitle", "getPositiveTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "positiveText", "getPositiveText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "negativeTitle", "getNegativeTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "negativeText", "getNegativeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "positiveTextVisibility", "getPositiveTextVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "negativeTextVisibility", "getNegativeTextVisibility()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColoredTotalStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final CharSequence getNegativeText() {
        return this.f40609h.getValue(this, f40604l[3]);
    }

    private final boolean getNegativeTextVisibility() {
        return this.f40611j.getValue(this, f40604l[5]).booleanValue();
    }

    private final CharSequence getPositiveText() {
        return this.f40607f.getValue(this, f40604l[1]);
    }

    private final boolean getPositiveTextVisibility() {
        return this.f40610i.getValue(this, f40604l[4]).booleanValue();
    }

    private final void setNegativeText(CharSequence charSequence) {
        this.f40609h.setValue(this, f40604l[3], charSequence);
    }

    private final void setNegativeTextVisibility(boolean z) {
        this.f40611j.mo46151c(this, f40604l[5], z);
    }

    private final void setPositiveText(CharSequence charSequence) {
        this.f40607f.setValue(this, f40604l[1], charSequence);
    }

    private final void setPositiveTextVisibility(boolean z) {
        this.f40610i.mo46151c(this, f40604l[4], z);
    }

    public final C9982o2 getBinding() {
        return this.f40605d;
    }

    public final CharSequence getNegativeTitle() {
        return this.f40608g.getValue(this, f40604l[2]);
    }

    public final CharSequence getPositiveTitle() {
        return this.f40606e.getValue(this, f40604l[0]);
    }

    public final C13577a getValue() {
        return this.f40612k;
    }

    public final void setNegativeTitle(CharSequence charSequence) {
        this.f40608g.setValue(this, f40604l[2], charSequence);
    }

    public final void setPositiveTitle(CharSequence charSequence) {
        this.f40606e.setValue(this, f40604l[0], charSequence);
    }

    public final void setValue(C13577a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40612k = aVar;
        if (aVar instanceof C13577a.C13578a) {
            setPositiveTextVisibility(false);
            setNegativeTextVisibility(false);
        } else if (aVar instanceof C13577a.C13579b) {
            C13577a.C13579b bVar = (C13577a.C13579b) aVar;
            setPositiveText(bVar.mo37157b());
            setNegativeText(bVar.mo37156a());
            setPositiveTextVisibility(true);
            setNegativeTextVisibility(true);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColoredTotalStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColoredTotalStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        boolean z = true;
        C9982o2 d = C9982o2.m36611d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40605d = d;
        AppCompatTextView appCompatTextView = d.f27357j;
        C41536l.m120488h(appCompatTextView, "binding.positiveTitleText");
        this.f40606e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f27355h;
        C41536l.m120488h(appCompatTextView2, "binding.positiveBottomText");
        this.f40607f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = d.f27354g;
        C41536l.m120488h(appCompatTextView3, "binding.negativeTitleText");
        this.f40608g = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = d.f27352e;
        C41536l.m120488h(appCompatTextView4, "binding.negativeBottomText");
        this.f40609h = new C18355e0(appCompatTextView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView5 = d.f27355h;
        C41536l.m120488h(appCompatTextView5, "binding.positiveBottomText");
        this.f40610i = new C18365j0(appCompatTextView5, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView6 = d.f27352e;
        C41536l.m120488h(appCompatTextView6, "binding.negativeBottomText");
        this.f40611j = new C18365j0(appCompatTextView6, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f40612k = C13577a.C13578a.f40613a;
        int[] iArr = C17787l.f50314f3;
        C41536l.m120488h(iArr, "ColoredTotalStateView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setPositiveTitle(obtainStyledAttributes.getString(C17787l.f50378j3));
        setNegativeTitle(obtainStyledAttributes.getString(C17787l.f50346h3));
        String string = obtainStyledAttributes.getString(C17787l.f50362i3);
        String string2 = obtainStyledAttributes.getString(C17787l.f50330g3);
        if (!(string == null || string.length() == 0)) {
            if (!(string2 == null || string2.length() == 0)) {
                z = false;
            }
            if (!z) {
                setValue(new C13577a.C13579b(string, string2));
            }
        }
        obtainStyledAttributes.recycle();
    }
}
