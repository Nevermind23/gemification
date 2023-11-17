package p559pg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.C0767a;
import p545og.C17190a;

/* renamed from: pg.b */
public abstract class C17346b {

    /* renamed from: a */
    protected Context f48658a;

    /* renamed from: b */
    protected Resources f48659b;

    /* renamed from: c */
    protected AttributeSet f48660c;

    protected C17346b(Context context, AttributeSet attributeSet) {
        this.f48658a = context;
        this.f48659b = context.getResources();
        this.f48660c = attributeSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo44753a(int i) {
        return C0767a.m2893c(this.f48658a, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo44754b(int i) {
        return this.f48659b.getDimensionPixelSize(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Drawable mo44755c(int i) {
        return C0767a.m2895e(this.f48658a, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo44756d() {
        return mo44757e(C17190a.f48219a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo44757e(int i) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = this.f48658a.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Drawable mo44758f(int i) {
        return C0767a.m2895e(this.f48658a, i);
    }
}
