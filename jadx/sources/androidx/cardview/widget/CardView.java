package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;
import p162m.C7043a;
import p162m.C7044b;
import p162m.C7045c;
import p162m.C7046d;

public class CardView extends FrameLayout {

    /* renamed from: k */
    private static final int[] f2428k = {16842801};

    /* renamed from: l */
    private static final C0596c f2429l;

    /* renamed from: d */
    private boolean f2430d;

    /* renamed from: e */
    private boolean f2431e;

    /* renamed from: f */
    int f2432f;

    /* renamed from: g */
    int f2433g;

    /* renamed from: h */
    final Rect f2434h;

    /* renamed from: i */
    final Rect f2435i;

    /* renamed from: j */
    private final C0595b f2436j;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0593a implements C0595b {

        /* renamed from: a */
        private Drawable f2437a;

        C0593a() {
        }

        /* renamed from: a */
        public void mo2522a(Drawable drawable) {
            this.f2437a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo2523b() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: c */
        public Drawable mo2524c() {
            return this.f2437a;
        }

        /* renamed from: d */
        public void mo2525d(int i, int i2, int i3, int i4) {
            CardView.this.f2435i.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2434h;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: e */
        public boolean mo2526e() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: f */
        public View mo2527f() {
            return CardView.this;
        }
    }

    static {
        C0594a aVar = new C0594a();
        f2429l = aVar;
        aVar.mo2539l();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7043a.f20968a);
    }

    /* renamed from: b */
    public void mo2499b(int i, int i2, int i3, int i4) {
        this.f2434h.set(i, i2, i3, i4);
        f2429l.mo2538k(this.f2436j);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2429l.mo2532e(this.f2436j);
    }

    public float getCardElevation() {
        return f2429l.mo2536i(this.f2436j);
    }

    public int getContentPaddingBottom() {
        return this.f2434h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2434h.left;
    }

    public int getContentPaddingRight() {
        return this.f2434h.right;
    }

    public int getContentPaddingTop() {
        return this.f2434h.top;
    }

    public float getMaxCardElevation() {
        return f2429l.mo2531d(this.f2436j);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2431e;
    }

    public float getRadius() {
        return f2429l.mo2529b(this.f2436j);
    }

    public boolean getUseCompatPadding() {
        return this.f2430d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0596c cVar = f2429l;
        if (!(cVar instanceof C0594a)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.mo2540m(this.f2436j)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.mo2533f(this.f2436j)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f2429l.mo2541n(this.f2436j, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f2429l.mo2530c(this.f2436j, f);
    }

    public void setMaxCardElevation(float f) {
        f2429l.mo2542o(this.f2436j, f);
    }

    public void setMinimumHeight(int i) {
        this.f2433g = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f2432f = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2431e) {
            this.f2431e = z;
            f2429l.mo2534g(this.f2436j);
        }
    }

    public void setRadius(float f) {
        f2429l.mo2528a(this.f2436j, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2430d != z) {
            this.f2430d = z;
            f2429l.mo2537j(this.f2436j);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2434h = rect;
        this.f2435i = new Rect();
        C0593a aVar = new C0593a();
        this.f2436j = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7046d.f20972a, i, C7045c.f20971a);
        int i3 = C7046d.f20975d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2428k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C7044b.f20970b);
            } else {
                i2 = getResources().getColor(C7044b.f20969a);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C7046d.f20976e, Utils.FLOAT_EPSILON);
        float dimension2 = obtainStyledAttributes.getDimension(C7046d.f20977f, Utils.FLOAT_EPSILON);
        float dimension3 = obtainStyledAttributes.getDimension(C7046d.f20978g, Utils.FLOAT_EPSILON);
        this.f2430d = obtainStyledAttributes.getBoolean(C7046d.f20980i, false);
        this.f2431e = obtainStyledAttributes.getBoolean(C7046d.f20979h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20981j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20983l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20985n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20984m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20982k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2432f = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20973b, 0);
        this.f2433g = obtainStyledAttributes.getDimensionPixelSize(C7046d.f20974c, 0);
        obtainStyledAttributes.recycle();
        f2429l.mo2535h(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2429l.mo2541n(this.f2436j, colorStateList);
    }
}
