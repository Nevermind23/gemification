package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0808h;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.r1 */
public class C0483r1 {

    /* renamed from: a */
    private final Context f2208a;

    /* renamed from: b */
    private final TypedArray f2209b;

    /* renamed from: c */
    private TypedValue f2210c;

    private C0483r1(Context context, TypedArray typedArray) {
        this.f2208a = context;
        this.f2209b = typedArray;
    }

    /* renamed from: t */
    public static C0483r1 m1944t(Context context, int i, int[] iArr) {
        return new C0483r1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0483r1 m1945u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0483r1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0483r1 m1946v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0483r1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo2314a(int i, boolean z) {
        return this.f2209b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo2315b(int i, int i2) {
        return this.f2209b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo2316c(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f2209b.hasValue(i) || (resourceId = this.f2209b.getResourceId(i, 0)) == 0 || (a = C5769a.m23209a(this.f2208a, resourceId)) == null) {
            return this.f2209b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: d */
    public float mo2317d(int i, float f) {
        return this.f2209b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo2318e(int i, int i2) {
        return this.f2209b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo2319f(int i, int i2) {
        return this.f2209b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo2320g(int i) {
        int resourceId;
        if (!this.f2209b.hasValue(i) || (resourceId = this.f2209b.getResourceId(i, 0)) == 0) {
            return this.f2209b.getDrawable(i);
        }
        return C5769a.m23210b(this.f2208a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo2321h(int i) {
        int resourceId;
        if (!this.f2209b.hasValue(i) || (resourceId = this.f2209b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0444i.m1769b().mo2128d(this.f2208a, resourceId, true);
    }

    /* renamed from: i */
    public float mo2322i(int i, float f) {
        return this.f2209b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo2323j(int i, int i2, C0808h.C0813e eVar) {
        int resourceId = this.f2209b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2210c == null) {
            this.f2210c = new TypedValue();
        }
        return C0808h.m3034i(this.f2208a, resourceId, this.f2210c, i2, eVar);
    }

    /* renamed from: k */
    public int mo2324k(int i, int i2) {
        return this.f2209b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo2325l(int i, int i2) {
        return this.f2209b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo2326m(int i, int i2) {
        return this.f2209b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo2327n(int i, int i2) {
        return this.f2209b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo2328o(int i) {
        return this.f2209b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo2329p(int i) {
        return this.f2209b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo2330q(int i) {
        return this.f2209b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo2331r() {
        return this.f2209b;
    }

    /* renamed from: s */
    public boolean mo2332s(int i) {
        return this.f2209b.hasValue(i);
    }

    /* renamed from: w */
    public void mo2333w() {
        this.f2209b.recycle();
    }
}
