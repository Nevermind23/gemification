package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p030c.C2219j;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.i0 */
class C0446i0 {

    /* renamed from: l */
    private static final RectF f2121l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap f2122m = new ConcurrentHashMap();

    /* renamed from: n */
    private static ConcurrentHashMap f2123n = new ConcurrentHashMap();

    /* renamed from: a */
    private int f2124a = 0;

    /* renamed from: b */
    private boolean f2125b = false;

    /* renamed from: c */
    private float f2126c = -1.0f;

    /* renamed from: d */
    private float f2127d = -1.0f;

    /* renamed from: e */
    private float f2128e = -1.0f;

    /* renamed from: f */
    private int[] f2129f = new int[0];

    /* renamed from: g */
    private boolean f2130g = false;

    /* renamed from: h */
    private TextPaint f2131h;

    /* renamed from: i */
    private final TextView f2132i;

    /* renamed from: j */
    private final Context f2133j;

    /* renamed from: k */
    private final C0452f f2134k;

    /* renamed from: androidx.appcompat.widget.i0$a */
    private static final class C0447a {
        /* renamed from: a */
        static StaticLayout m1816a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m1817b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    private static final class C0448b {
        /* renamed from: a */
        static boolean m1818a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$c */
    private static final class C0449c {
        /* renamed from: a */
        static StaticLayout m1819a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0452f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo2145a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$d */
    private static class C0450d extends C0452f {
        C0450d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2145a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0446i0.m1794m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$e */
    private static class C0451e extends C0450d {
        C0451e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2145a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2146b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$f */
    private static class C0452f {
        C0452f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo2145a(StaticLayout.Builder builder, TextView textView);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2146b(TextView textView) {
            return ((Boolean) C0446i0.m1794m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0446i0(TextView textView) {
        this.f2132i = textView;
        this.f2133j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2134k = new C0451e();
        } else {
            this.f2134k = new C0450d();
        }
    }

    /* renamed from: b */
    private int[] m1790b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1791c() {
        this.f2124a = 0;
        this.f2127d = -1.0f;
        this.f2128e = -1.0f;
        this.f2126c = -1.0f;
        this.f2129f = new int[0];
        this.f2125b = false;
    }

    /* renamed from: e */
    private int m1792e(RectF rectF) {
        int length = this.f2129f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (m1799x(this.f2129f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f2129f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: k */
    private static Method m1793k(String str) {
        try {
            Method method = (Method) f2122m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2122m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m1794m(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = m1793k(r4)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x002a
        L_0x000c:
            r3 = move-exception
            throw r3
        L_0x000e:
            r3 = move-exception
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0446i0.m1794m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: s */
    private void m1795s(float f) {
        if (f != this.f2132i.getPaint().getTextSize()) {
            this.f2132i.getPaint().setTextSize(f);
            boolean a = C0448b.m1818a(this.f2132i);
            if (this.f2132i.getLayout() != null) {
                this.f2125b = false;
                try {
                    Method k = m1793k("nullLayouts");
                    if (k != null) {
                        k.invoke(this.f2132i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    this.f2132i.requestLayout();
                } else {
                    this.f2132i.forceLayout();
                }
                this.f2132i.invalidate();
            }
        }
    }

    /* renamed from: u */
    private boolean m1796u() {
        if (!m1800y() || this.f2124a != 1) {
            this.f2125b = false;
        } else {
            if (!this.f2130g || this.f2129f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2128e - this.f2127d) / this.f2126c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f2127d + (((float) i) * this.f2126c));
                }
                this.f2129f = m1790b(iArr);
            }
            this.f2125b = true;
        }
        return this.f2125b;
    }

    /* renamed from: v */
    private void m1797v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2129f = m1790b(iArr);
            m1798w();
        }
    }

    /* renamed from: w */
    private boolean m1798w() {
        boolean z;
        int[] iArr = this.f2129f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2130g = z;
        if (z) {
            this.f2124a = 1;
            this.f2127d = (float) iArr[0];
            this.f2128e = (float) iArr[length - 1];
            this.f2126c = -1.0f;
        }
        return z;
    }

    /* renamed from: x */
    private boolean m1799x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2132i.getText();
        TransformationMethod transformationMethod = this.f2132i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2132i)) == null)) {
            text = transformation;
        }
        int b = C0447a.m1817b(this.f2132i);
        mo2138l(i);
        StaticLayout d = mo2132d(text, (Layout.Alignment) m1794m(this.f2132i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        if ((b == -1 || (d.getLineCount() <= b && d.getLineEnd(d.getLineCount() - 1) == text.length())) && ((float) d.getHeight()) <= rectF.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private boolean m1800y() {
        return !(this.f2132i instanceof C0454j);
    }

    /* renamed from: z */
    private void m1801z(float f, float f2, float f3) {
        if (f <= Utils.FLOAT_EPSILON) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > Utils.FLOAT_EPSILON) {
            this.f2124a = 1;
            this.f2127d = f;
            this.f2128e = f2;
            this.f2126c = f3;
            this.f2130g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2131a() {
        int i;
        if (mo2139n()) {
            if (this.f2125b) {
                if (this.f2132i.getMeasuredHeight() > 0 && this.f2132i.getMeasuredWidth() > 0) {
                    if (this.f2134k.mo2146b(this.f2132i)) {
                        i = 1048576;
                    } else {
                        i = (this.f2132i.getMeasuredWidth() - this.f2132i.getTotalPaddingLeft()) - this.f2132i.getTotalPaddingRight();
                    }
                    int height = (this.f2132i.getHeight() - this.f2132i.getCompoundPaddingBottom()) - this.f2132i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f2121l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float e = (float) m1792e(rectF);
                            if (e != this.f2132i.getTextSize()) {
                                mo2144t(0, e);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2125b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public StaticLayout mo2132d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return C0449c.m1819a(charSequence, alignment, i, i2, this.f2132i, this.f2131h, this.f2134k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2133f() {
        return Math.round(this.f2128e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2134g() {
        return Math.round(this.f2127d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo2135h() {
        return Math.round(this.f2126c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] mo2136i() {
        return this.f2129f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2137j() {
        return this.f2124a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2138l(int i) {
        TextPaint textPaint = this.f2131h;
        if (textPaint == null) {
            this.f2131h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2131h.set(this.f2132i.getPaint());
        this.f2131h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo2139n() {
        return m1800y() && this.f2124a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2140o(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f2133j;
        int[] iArr = C2219j.f6781g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f2132i;
        ViewCompat.m3615p0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C2219j.f6806l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f2124a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C2219j.f6801k0;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = C2219j.f6791i0;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = C2219j.f6786h0;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = C2219j.f6796j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1797v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1800y()) {
            this.f2124a = 0;
        } else if (this.f2124a == 1) {
            if (!this.f2130g) {
                DisplayMetrics displayMetrics = this.f2133j.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                m1801z(f2, f3, f);
            }
            m1796u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2141p(int i, int i2, int i3, int i4) {
        if (m1800y()) {
            DisplayMetrics displayMetrics = this.f2133j.getResources().getDisplayMetrics();
            m1801z(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1796u()) {
                mo2131a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2142q(int[] iArr, int i) {
        if (m1800y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2133j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f2129f = m1790b(iArr2);
                if (!m1798w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2130g = false;
            }
            if (m1796u()) {
                mo2131a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2143r(int i) {
        if (!m1800y()) {
            return;
        }
        if (i == 0) {
            m1791c();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f2133j.getResources().getDisplayMetrics();
            m1801z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1796u()) {
                mo2131a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2144t(int i, float f) {
        Resources resources;
        Context context = this.f2133j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1795s(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
