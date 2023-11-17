package p341ge.bog.designsystem.components.slider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import ie1.C41330k0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17778c;
import p601sg.C17787l;
import ze1.C43420e;

/* renamed from: ge.bog.designsystem.components.slider.InfinitePagerIndicator */
public final class InfinitePagerIndicator extends View {

    /* renamed from: u */
    public static final C13509a f40301u = new C13509a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private ViewPager2 f40302d;

    /* renamed from: e */
    private final DecelerateInterpolator f40303e;

    /* renamed from: f */
    private int f40304f;

    /* renamed from: g */
    private int f40305g;

    /* renamed from: h */
    private int f40306h;

    /* renamed from: i */
    private int f40307i;

    /* renamed from: j */
    private int f40308j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f40309k;

    /* renamed from: l */
    private boolean f40310l;

    /* renamed from: m */
    private int f40311m;

    /* renamed from: n */
    private int f40312n;

    /* renamed from: o */
    private final Paint f40313o;

    /* renamed from: p */
    private final Paint f40314p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f40315q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f40316r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f40317s;

    /* renamed from: t */
    private C13510b f40318t;

    /* renamed from: ge.bog.designsystem.components.slider.InfinitePagerIndicator$a */
    public static final class C13509a {
        private C13509a() {
        }

        public /* synthetic */ C13509a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m50672b(float f, Resources resources) {
            return (int) (f * ((float) (resources.getDisplayMetrics().densityDpi / 160)));
        }
    }

    /* renamed from: ge.bog.designsystem.components.slider.InfinitePagerIndicator$b */
    public static final class C13510b extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ InfinitePagerIndicator f40319a;

        C13510b(InfinitePagerIndicator infinitePagerIndicator) {
            this.f40319a = infinitePagerIndicator;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (!this.f40319a.f40309k || !this.f40319a.m50669m()) {
                this.f40319a.f40316r = 5;
                this.f40319a.f40317s = f * ((float) -1);
            } else {
                InfinitePagerIndicator infinitePagerIndicator = this.f40319a;
                infinitePagerIndicator.f40316r = infinitePagerIndicator.m50667k(i);
                this.f40319a.f40317s = f * ((float) 1);
            }
            this.f40319a.invalidate();
        }

        public void onPageSelected(int i) {
            int i2;
            InfinitePagerIndicator infinitePagerIndicator = this.f40319a;
            infinitePagerIndicator.f40316r = infinitePagerIndicator.f40315q;
            InfinitePagerIndicator infinitePagerIndicator2 = this.f40319a;
            if (!infinitePagerIndicator2.f40309k || !this.f40319a.m50669m()) {
                i2 = 5;
            } else {
                i2 = this.f40319a.m50667k(i);
            }
            infinitePagerIndicator2.f40315q = i2;
            this.f40319a.invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfinitePagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final int getCalculatedWidth() {
        return (((this.f40304f + (this.f40305g * 2)) - 1) * getDistanceBetweenTheCenterOfTwoDots()) + (this.f40307i * 2);
    }

    private final int getDistanceBetweenTheCenterOfTwoDots() {
        return (this.f40307i * 2) + this.f40308j;
    }

    private final int getDotYCoordinate() {
        return this.f40306h;
    }

    private final int getPagerItemCount() {
        return 11;
    }

    /* renamed from: i */
    private final float m50665i(int i) {
        return ((float) ((i - this.f40316r) * getDistanceBetweenTheCenterOfTwoDots())) + (((float) getDistanceBetweenTheCenterOfTwoDots()) * this.f40317s);
    }

    /* renamed from: j */
    private final Paint m50666j(float f) {
        if (Math.abs(f) < ((float) (getDistanceBetweenTheCenterOfTwoDots() / 2))) {
            return this.f40313o;
        }
        return this.f40314p;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final int m50667k(int i) {
        return (getPagerItemCount() - i) - 1;
    }

    /* renamed from: l */
    private final float m50668l(float f) {
        int i;
        float abs = Math.abs(f);
        float distanceBetweenTheCenterOfTwoDots = (((float) this.f40304f) / ((float) 2)) * ((float) getDistanceBetweenTheCenterOfTwoDots());
        if (abs < ((float) (getDistanceBetweenTheCenterOfTwoDots() / 2))) {
            i = this.f40306h;
        } else if (abs <= distanceBetweenTheCenterOfTwoDots) {
            i = this.f40307i;
        } else {
            return this.f40303e.getInterpolation(((float) 1) - ((abs - distanceBetweenTheCenterOfTwoDots) / ((((float) getCalculatedWidth()) / 2.01f) - distanceBetweenTheCenterOfTwoDots))) * ((float) this.f40307i);
        }
        return (float) i;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m50669m() {
        return ViewCompat.m3541B(this) == 1;
    }

    /* renamed from: h */
    public final void mo36716h(ViewPager2 viewPager2) {
        C41536l.m120489i(viewPager2, "viewPager");
        this.f40302d = viewPager2;
        if (viewPager2 != null) {
            viewPager2.mo6603h(this.f40318t);
        }
        this.f40315q = 5;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        C41536l.m120489i(canvas, "canvas");
        super.onDraw(canvas);
        C43420e o = C43429k.m124596o(0, getPagerItemCount());
        ArrayList<Number> arrayList = new ArrayList<>(C41343r.m119925u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(m50665i(((C41330k0) it).nextInt())));
        }
        for (Number floatValue : arrayList) {
            float floatValue2 = floatValue.floatValue();
            if (this.f40310l) {
                f2 = (float) getDotYCoordinate();
                f = ((float) (getHeight() / 2)) + floatValue2;
            } else {
                f2 = ((float) (getWidth() / 2)) + floatValue2;
                f = (float) getDotYCoordinate();
            }
            canvas.drawCircle(f2, f, m50668l(floatValue2), m50666j(floatValue2));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f40306h * 2;
        if (this.f40310l) {
            setMeasuredDimension(i3, getCalculatedWidth());
        } else {
            setMeasuredDimension(getCalculatedWidth(), i3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfinitePagerIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfinitePagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f40303e = new DecelerateInterpolator();
        this.f40304f = 5;
        this.f40305g = 1;
        C13509a aVar = f40301u;
        Resources resources = getResources();
        C41536l.m120488h(resources, "resources");
        this.f40306h = aVar.m50672b(5.5f, resources);
        Resources resources2 = getResources();
        C41536l.m120488h(resources2, "resources");
        this.f40307i = aVar.m50672b(4.0f, resources2);
        Resources resources3 = getResources();
        C41536l.m120488h(resources3, "resources");
        this.f40308j = aVar.m50672b(10.0f, resources3);
        this.f40311m = C0767a.m2893c(getContext(), C17778c.default_dot_color);
        this.f40312n = C0767a.m2893c(getContext(), C17778c.default_selected_dot_color);
        Paint paint = new Paint();
        this.f40313o = paint;
        Paint paint2 = new Paint();
        this.f40314p = paint2;
        this.f40318t = new C13510b(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f49996K5, 0, 0);
            C41536l.m120488h(obtainStyledAttributes, "context.theme.obtainStyl…          0\n            )");
            this.f40304f = obtainStyledAttributes.getInteger(C17787l.f50026M5, 5);
            this.f40305g = obtainStyledAttributes.getInt(C17787l.f50071P5, 1);
            this.f40307i = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50041N5, this.f40307i);
            this.f40306h = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50101R5, this.f40306h);
            this.f40311m = obtainStyledAttributes.getColor(C17787l.f50011L5, this.f40311m);
            this.f40312n = obtainStyledAttributes.getColor(C17787l.f50086Q5, this.f40312n);
            this.f40308j = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50056O5, this.f40308j);
            this.f40309k = obtainStyledAttributes.getBoolean(C17787l.f50116S5, false);
            this.f40310l = obtainStyledAttributes.getBoolean(C17787l.f50131T5, false);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f40312n);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f40311m);
        paint2.setAntiAlias(true);
    }
}
