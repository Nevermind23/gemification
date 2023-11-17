package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0410c;
import androidx.appcompat.widget.C0520z0;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C5077e;
import com.google.android.material.internal.C5088l;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0078h;
import p009a8.C0081k;
import p009a8.C0082l;
import p080f8.C6170a;
import p184n8.C7343c;
import p249s8.C8273a;

/* renamed from: com.google.android.material.textfield.w */
public class C5209w extends C0410c {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0520z0 f16696h;

    /* renamed from: i */
    private final AccessibilityManager f16697i;

    /* renamed from: j */
    private final Rect f16698j;

    /* renamed from: k */
    private final int f16699k;

    /* renamed from: l */
    private final float f16700l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f16701m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ColorStateList f16702n;

    /* renamed from: com.google.android.material.textfield.w$a */
    class C5210a implements AdapterView.OnItemClickListener {
        C5210a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Object obj;
            C5209w wVar = C5209w.this;
            if (i < 0) {
                obj = wVar.f16696h.mo2394v();
            } else {
                obj = wVar.getAdapter().getItem(i);
            }
            C5209w.this.m20584i(obj);
            AdapterView.OnItemClickListener onItemClickListener = C5209w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C5209w.this.f16696h.mo2397y();
                    i = C5209w.this.f16696h.mo2396x();
                    j = C5209w.this.f16696h.mo2395w();
                }
                onItemClickListener.onItemClick(C5209w.this.f16696h.mo929o(), view, i, j);
            }
            C5209w.this.f16696h.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.w$b */
    private class C5211b extends ArrayAdapter {

        /* renamed from: d */
        private ColorStateList f16704d;

        /* renamed from: e */
        private ColorStateList f16705e;

        C5211b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            mo17347f();
        }

        /* renamed from: a */
        private ColorStateList m20585a() {
            if (!m20587c() || !m20588d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C6170a.m24586g(C5209w.this.f16701m, C5209w.this.f16702n.getColorForState(iArr2, 0)), C6170a.m24586g(C5209w.this.f16701m, C5209w.this.f16702n.getColorForState(iArr, 0)), C5209w.this.f16701m});
        }

        /* renamed from: b */
        private Drawable m20586b() {
            if (!m20587c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(C5209w.this.f16701m);
            if (this.f16705e == null) {
                return colorDrawable;
            }
            C0836a.m3153o(colorDrawable, this.f16704d);
            return new RippleDrawable(this.f16705e, colorDrawable, (Drawable) null);
        }

        /* renamed from: c */
        private boolean m20587c() {
            return C5209w.this.f16701m != 0;
        }

        /* renamed from: d */
        private boolean m20588d() {
            return C5209w.this.f16702n != null;
        }

        /* renamed from: e */
        private ColorStateList m20589e() {
            if (!m20588d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{C5209w.this.f16702n.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo17347f() {
            this.f16705e = m20589e();
            this.f16704d = m20585a();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (C5209w.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = m20586b();
                } else {
                    drawable = null;
                }
                ViewCompat.m3627v0(textView, drawable);
            }
            return view2;
        }
    }

    public C5209w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f144c);
    }

    /* renamed from: f */
    private TextInputLayout m20581f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: g */
    private int m20582g() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f = m20581f();
        int i = 0;
        if (adapter == null || f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f16696h.mo2396x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable c = this.f16696h.mo2386c();
        if (c != null) {
            c.getPadding(this.f16698j);
            Rect rect = this.f16698j;
            i2 += rect.left + rect.right;
        }
        return i2 + f.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: h */
    private void m20583h() {
        TextInputLayout f = m20581f();
        if (f != null) {
            f.mo17073n0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m20584i(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout f = m20581f();
        if (f == null || !f.mo17006P()) {
            return super.getHint();
        }
        return f.getHint();
    }

    public float getPopupElevation() {
        return this.f16700l;
    }

    public int getSimpleItemSelectedColor() {
        return this.f16701m;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f16702n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f = m20581f();
        if (f != null && f.mo17006P() && super.getHint() == null && C5077e.m19861c()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m20582g()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f16696h.mo1503m(getAdapter());
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f16696h.mo2381M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m20583h();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f16701m = i;
        if (getAdapter() instanceof C5211b) {
            ((C5211b) getAdapter()).mo17347f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f16702n = colorStateList;
        if (getAdapter() instanceof C5211b) {
            ((C5211b) getAdapter()).mo17347f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f16697i;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f16696h.mo923d();
        }
    }

    public C5209w(Context context, AttributeSet attributeSet, int i) {
        super(C8273a.m31120c(context, attributeSet, i, 0), attributeSet, i);
        this.f16698j = new Rect();
        Context context2 = getContext();
        TypedArray i2 = C5088l.m19898i(context2, attributeSet, C0082l.f716i3, i, C0081k.f360h, new int[0]);
        int i3 = C0082l.f726j3;
        if (i2.hasValue(i3) && i2.getInt(i3, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f16699k = i2.getResourceId(C0082l.f746l3, C0078h.mtrl_auto_complete_simple_item);
        this.f16700l = (float) i2.getDimensionPixelOffset(C0082l.f736k3, C0074d.f195Z);
        this.f16701m = i2.getColor(C0082l.f756m3, 0);
        this.f16702n = C7343c.m28003a(context2, i2, C0082l.f766n3);
        this.f16697i = (AccessibilityManager) context2.getSystemService("accessibility");
        C0520z0 z0Var = new C0520z0(context2);
        this.f16696h = z0Var;
        z0Var.mo2378J(true);
        z0Var.mo2372D(this);
        z0Var.mo2377I(2);
        z0Var.mo1503m(getAdapter());
        z0Var.mo2380L(new C5210a());
        int i4 = C0082l.f776o3;
        if (i2.hasValue(i4)) {
            setSimpleItems(i2.getResourceId(i4, 0));
        }
        i2.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C5211b(getContext(), this.f16699k, strArr));
    }
}
