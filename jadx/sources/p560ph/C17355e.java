package p560ph;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;
import p601sg.C17787l;

/* renamed from: ph.e */
public abstract class C17355e extends View {

    /* renamed from: d */
    private C17356a f48672d;

    /* renamed from: e */
    private String f48673e = "";

    /* renamed from: f */
    private String f48674f;

    /* renamed from: g */
    private int f48675g = -1;

    /* renamed from: h */
    private Integer f48676h;

    /* renamed from: i */
    private final Paint f48677i;

    /* renamed from: j */
    private final Paint f48678j;

    /* renamed from: k */
    private final RectF f48679k;

    /* renamed from: l */
    private ValueAnimator f48680l;

    /* renamed from: ph.e$a */
    public static final class C17356a {

        /* renamed from: a */
        private final int f48681a;

        /* renamed from: b */
        private final int f48682b;

        /* renamed from: c */
        private final int f48683c;

        /* renamed from: d */
        private final Color f48684d;

        public C17356a(int i, int i2, int i3, Color color) {
            C41536l.m120489i(color, "color");
            this.f48681a = i;
            this.f48682b = i2;
            this.f48683c = i3;
            this.f48684d = color;
        }

        /* renamed from: a */
        public final Color mo44781a() {
            return this.f48684d;
        }

        /* renamed from: b */
        public final int mo44782b() {
            return this.f48682b;
        }

        /* renamed from: c */
        public final int mo44783c() {
            return this.f48683c;
        }

        /* renamed from: d */
        public final int mo44784d() {
            return this.f48681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17356a)) {
                return false;
            }
            C17356a aVar = (C17356a) obj;
            return this.f48681a == aVar.f48681a && this.f48682b == aVar.f48682b && this.f48683c == aVar.f48683c && C41536l.m120484d(this.f48684d, aVar.f48684d);
        }

        public int hashCode() {
            return (((((this.f48681a * 31) + this.f48682b) * 31) + this.f48683c) * 31) + this.f48684d.hashCode();
        }

        public String toString() {
            int i = this.f48681a;
            int i2 = this.f48682b;
            int i3 = this.f48683c;
            Color color = this.f48684d;
            return "ViewParams(width=" + i + ", height=" + i2 + ", textAppearance=" + i3 + ", color=" + color + ")";
        }
    }

    /* renamed from: ph.e$b */
    public interface C17357b {
        /* renamed from: a */
        C17356a mo44788a();

        /* renamed from: b */
        C17356a mo44789b();

        /* renamed from: c */
        C17356a mo44790c();

        /* renamed from: d */
        C17356a mo44791d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17355e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f48677i = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f48678j = paint2;
        this.f48679k = new RectF();
    }

    /* renamed from: b */
    private final void m60729b(C17356a aVar) {
        int i;
        Color a;
        ValueAnimator valueAnimator = this.f48680l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (C41536l.m120484d(this.f48672d, getViewType().mo44789b()) || C41536l.m120484d(aVar, getViewType().mo44789b())) {
            Color a2 = aVar.mo44781a();
            Context context = getContext();
            C41536l.m120488h(context, "context");
            setBackgroundColor(Integer.valueOf(a2.mo35260a(context)));
            invalidate();
            return;
        }
        C17356a aVar2 = this.f48672d;
        if (aVar2 == null || (a = aVar2.mo44781a()) == null) {
            Color a3 = getViewType().mo44788a().mo44781a();
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            i = a3.mo35260a(context2);
        } else {
            Context context3 = getContext();
            C41536l.m120488h(context3, "context");
            i = a.mo35260a(context3);
        }
        Color a4 = aVar.mo44781a();
        Context context4 = getContext();
        C41536l.m120488h(context4, "context");
        int a5 = a4.mo35260a(context4);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(a5)});
        this.f48680l = ofObject;
        if (ofObject != null) {
            ofObject.setDuration(300);
            ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
            ofObject.addUpdateListener(new C17354d(this));
            ofObject.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m60730c(C17355e eVar, ValueAnimator valueAnimator) {
        C41536l.m120489i(eVar, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        eVar.setBackgroundColor((Integer) animatedValue);
        eVar.invalidate();
    }

    /* renamed from: f */
    private final void m60731f(int i) {
        Typeface typeface;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        int[] iArr = C17787l.f50212Yb;
        C41536l.m120488h(iArr, "TextAppearance");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        this.f48678j.setColor(obtainStyledAttributes.getColor(C17787l.f50243ac, -1));
        this.f48678j.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(C17787l.f50227Zb, 0));
        Paint paint = this.f48678j;
        if (Build.VERSION.SDK_INT >= 26) {
            typeface = obtainStyledAttributes.getFont(C17787l.f50259bc);
        } else {
            typeface = Typeface.create(obtainStyledAttributes.getString(C17787l.f50275cc), 0);
        }
        paint.setTypeface(typeface);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void mo44765d(C17356a aVar) {
        C41536l.m120489i(aVar, "type");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = aVar.mo44784d();
            setLayoutParams(layoutParams);
            if (!C41536l.m120484d(this.f48672d, aVar) || this.f48672d == null) {
                m60729b(aVar);
                this.f48672d = aVar;
                setTextAppearance(aVar.mo44783c());
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: e */
    public abstract int mo44766e();

    public final RectF getActiveItemRectF() {
        return this.f48679k;
    }

    public final C17356a getAppliedType() {
        return this.f48672d;
    }

    public final Integer getBackgroundColor() {
        return this.f48676h;
    }

    public final Paint getBackgroundPaint() {
        return this.f48677i;
    }

    public String getSuffix() {
        return this.f48674f;
    }

    public final int getTextAppearance() {
        return this.f48675g;
    }

    public final Paint getTextPaint() {
        return this.f48678j;
    }

    public String getValue() {
        return this.f48673e;
    }

    public abstract C17357b getViewType();

    public final void setAppliedType(C17356a aVar) {
        this.f48672d = aVar;
    }

    public final void setBackgroundColor(Integer num) {
        int i;
        this.f48676h = num;
        Paint paint = this.f48677i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        paint.setColor(i);
    }

    public void setSuffix(String str) {
        this.f48674f = str;
        invalidate();
    }

    public final void setTextAppearance(int i) {
        if (i != -1 && i != 0) {
            this.f48675g = i;
            m60731f(i);
        }
    }

    public void setValue(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f48673e = str;
        invalidate();
    }
}
