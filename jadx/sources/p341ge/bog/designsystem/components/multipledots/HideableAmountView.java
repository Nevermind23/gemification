package p341ge.bog.designsystem.components.multipledots;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C1152f3;
import androidx.core.widget.C1305j;
import androidx.core.widget.C1314o;
import bf1.C40342g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p601sg.C17787l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.multipledots.HideableAmountView */
public final class HideableAmountView extends ViewSwitcher {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f39831m;

    /* renamed from: d */
    private int f39832d;

    /* renamed from: e */
    private int f39833e;

    /* renamed from: f */
    private int f39834f;

    /* renamed from: g */
    private int f39835g = 16;

    /* renamed from: h */
    private int f39836h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f39837i;

    /* renamed from: j */
    private ViewGroup f39838j;

    /* renamed from: k */
    private final C41555e f39839k;

    /* renamed from: l */
    private final C41555e f39840l;

    /* renamed from: ge.bog.designsystem.components.multipledots.HideableAmountView$a */
    public static final class C13389a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13389a f39841d = new C13389a();

        public C13389a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ImageView);
        }
    }

    /* renamed from: ge.bog.designsystem.components.multipledots.HideableAmountView$b */
    public static final class C13390b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ HideableAmountView f39842a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13390b(Object obj, HideableAmountView hideableAmountView) {
            super(obj);
            this.f39842a = hideableAmountView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            TextView a = this.f39842a.f39837i;
            if (a == null) {
                C41536l.m120506z("currencyTextView");
                a = null;
            }
            int i = 0;
            if (str == null || C40439w.m117118v(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!(true ^ z)) {
                i = 8;
            }
            a.setVisibility(i);
            a.setText(str);
        }
    }

    /* renamed from: ge.bog.designsystem.components.multipledots.HideableAmountView$c */
    public static final class C13391c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ HideableAmountView f39843a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13391c(Object obj, HideableAmountView hideableAmountView) {
            super(obj);
            this.f39843a = hideableAmountView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                this.f39843a.setDisplayedChild(booleanValue ^ true ? 1 : 0);
            }
        }
    }

    static {
        Class<HideableAmountView> cls = HideableAmountView.class;
        f39831m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "currencyText", "getCurrencyText()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "showAmount", "getShowAmount()Z", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HideableAmountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41551a aVar = C41551a.f97718a;
        this.f39839k = new C13390b((Object) null, this);
        this.f39840l = new C13391c(Boolean.TRUE, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f49846A5);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…eableAmountView\n        )");
        this.f39832d = obtainStyledAttributes.getResourceId(C17787l.f49891D5, 0);
        this.f39833e = obtainStyledAttributes.getDimensionPixelSize(C17787l.f49906E5, 0);
        this.f39834f = obtainStyledAttributes.getInt(C17787l.f49876C5, 6);
        if (obtainStyledAttributes.getBoolean(C17787l.f49861B5, false)) {
            this.f39835g = 17;
        }
        this.f39836h = obtainStyledAttributes.getResourceId(C17787l.f49921F5, 0);
        C41238w wVar = C41238w.f97225a;
        obtainStyledAttributes.recycle();
        setInAnimation(m50342c(17432576));
        setOutAnimation(m50342c(17432577));
        setMeasureAllChildren(true);
    }

    /* renamed from: b */
    private final LinearLayout m50341b(int i, int i2, int i3, int i4, int i5) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f39838j = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, i5));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(i3, 0);
        linearLayout.setDividerDrawable(gradientDrawable);
        linearLayout.setShowDividers(2);
        linearLayout.setGravity(i5);
        for (int i6 = 0; i6 < i2; i6++) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setImageResource(i);
            linearLayout.addView(appCompatImageView);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f39837i = appCompatTextView;
        C1314o.m4575q(appCompatTextView, i4);
        appCompatTextView.setVisibility(8);
        linearLayout.addView(appCompatTextView);
        return linearLayout;
    }

    /* renamed from: c */
    private final Animation m50342c(int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        loadAnimation.setDuration(250);
        return loadAnimation;
    }

    public final String getCurrencyText() {
        return (String) this.f39839k.getValue(this, f39831m[0]);
    }

    public final boolean getShowAmount() {
        return ((Boolean) this.f39840l.getValue(this, f39831m[1])).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m50341b(this.f39832d, this.f39834f, this.f39833e, this.f39836h, this.f39835g));
    }

    public final void setCurrencyText(String str) {
        this.f39839k.setValue(this, f39831m[0], str);
    }

    public final void setDotsTintColor(Integer num) {
        ColorStateList colorStateList;
        ViewGroup viewGroup = this.f39838j;
        if (viewGroup == null) {
            C41536l.m120506z("dotsLayout");
            viewGroup = null;
        }
        C40342g<ImageView> l = C40355o.m116854l(C1152f3.m4215b(viewGroup), C13389a.f39841d);
        C41536l.m120487g(l, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (ImageView imageView : l) {
            if (num != null) {
                num.intValue();
                colorStateList = ColorStateList.valueOf(num.intValue());
            } else {
                colorStateList = null;
            }
            C1305j.m4529c(imageView, colorStateList);
        }
    }

    public final void setShowAmount(boolean z) {
        this.f39840l.setValue(this, f39831m[1], Boolean.valueOf(z));
    }
}
