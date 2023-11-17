package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p030c.C2219j;
import p305x.C8911d;

/* renamed from: androidx.appcompat.widget.b0 */
class C0400b0 {

    /* renamed from: a */
    private final TextView f2031a;

    /* renamed from: b */
    private C0476p1 f2032b;

    /* renamed from: c */
    private C0476p1 f2033c;

    /* renamed from: d */
    private C0476p1 f2034d;

    /* renamed from: e */
    private C0476p1 f2035e;

    /* renamed from: f */
    private C0476p1 f2036f;

    /* renamed from: g */
    private C0476p1 f2037g;

    /* renamed from: h */
    private C0476p1 f2038h;

    /* renamed from: i */
    private final C0446i0 f2039i;

    /* renamed from: j */
    private int f2040j = 0;

    /* renamed from: k */
    private int f2041k = -1;

    /* renamed from: l */
    private Typeface f2042l;

    /* renamed from: m */
    private boolean f2043m;

    /* renamed from: androidx.appcompat.widget.b0$a */
    class C0401a extends C0808h.C0813e {

        /* renamed from: a */
        final /* synthetic */ int f2044a;

        /* renamed from: b */
        final /* synthetic */ int f2045b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f2046c;

        C0401a(int i, int i2, WeakReference weakReference) {
            this.f2044a = i;
            this.f2045b = i2;
            this.f2046c = weakReference;
        }

        /* renamed from: h */
        public void mo1951h(int i) {
        }

        /* renamed from: i */
        public void mo1952i(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f2044a) != -1) {
                if ((this.f2045b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C0407g.m1661a(typeface, i, z);
            }
            C0400b0.this.mo1940n(this.f2046c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    class C0402b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ TextView f2048d;

        /* renamed from: e */
        final /* synthetic */ Typeface f2049e;

        /* renamed from: f */
        final /* synthetic */ int f2050f;

        C0402b(TextView textView, Typeface typeface, int i) {
            this.f2048d = textView;
            this.f2049e = typeface;
            this.f2050f = i;
        }

        public void run() {
            this.f2048d.setTypeface(this.f2049e, this.f2050f);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$c */
    static class C0403c {
        /* renamed from: a */
        static Drawable[] m1651a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m1652b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m1653c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$d */
    static class C0404d {
        /* renamed from: a */
        static Locale m1654a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$e */
    static class C0405e {
        /* renamed from: a */
        static LocaleList m1655a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        static void m1656b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$f */
    static class C0406f {
        /* renamed from: a */
        static int m1657a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        static void m1658b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        static void m1659c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        static boolean m1660d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$g */
    static class C0407g {
        /* renamed from: a */
        static Typeface m1661a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    C0400b0(TextView textView) {
        this.f2031a = textView;
        this.f2039i = new C0446i0(textView);
    }

    /* renamed from: B */
    private void m1620B(int i, float f) {
        this.f2039i.mo2144t(i, f);
    }

    /* renamed from: C */
    private void m1621C(Context context, C0483r1 r1Var) {
        String o;
        boolean z;
        boolean z2;
        this.f2040j = r1Var.mo2324k(C2219j.f6769d3, this.f2040j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int k = r1Var.mo2324k(C2219j.f6784g3, -1);
            this.f2041k = k;
            if (k != -1) {
                this.f2040j = (this.f2040j & 2) | 0;
            }
        }
        int i2 = C2219j.f6779f3;
        if (r1Var.mo2332s(i2) || r1Var.mo2332s(C2219j.f6789h3)) {
            this.f2042l = null;
            int i3 = C2219j.f6789h3;
            if (r1Var.mo2332s(i3)) {
                i2 = i3;
            }
            int i4 = this.f2041k;
            int i5 = this.f2040j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = r1Var.mo2323j(i2, this.f2040j, new C0401a(i4, i5, new WeakReference(this.f2031a)));
                    if (j != null) {
                        if (i < 28 || this.f2041k == -1) {
                            this.f2042l = j;
                        } else {
                            Typeface create = Typeface.create(j, 0);
                            int i6 = this.f2041k;
                            if ((this.f2040j & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.f2042l = C0407g.m1661a(create, i6, z2);
                        }
                    }
                    if (this.f2042l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f2043m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2042l == null && (o = r1Var.mo2328o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f2041k == -1) {
                    this.f2042l = Typeface.create(o, this.f2040j);
                    return;
                }
                Typeface create2 = Typeface.create(o, 0);
                int i7 = this.f2041k;
                if ((this.f2040j & 2) != 0) {
                    z3 = true;
                }
                this.f2042l = C0407g.m1661a(create2, i7, z3);
                return;
            }
            return;
        }
        int i8 = C2219j.f6764c3;
        if (r1Var.mo2332s(i8)) {
            this.f2043m = false;
            int k2 = r1Var.mo2324k(i8, 1);
            if (k2 == 1) {
                this.f2042l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f2042l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f2042l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m1622a(Drawable drawable, C0476p1 p1Var) {
        if (drawable != null && p1Var != null) {
            C0444i.m1772i(drawable, p1Var, this.f2031a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0476p1 m1623d(Context context, C0444i iVar, int i) {
        ColorStateList f = iVar.mo2129f(context, i);
        if (f == null) {
            return null;
        }
        C0476p1 p1Var = new C0476p1();
        p1Var.f2199d = true;
        p1Var.f2196a = f;
        return p1Var;
    }

    /* renamed from: y */
    private void m1624y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a = C0403c.m1651a(this.f2031a);
            TextView textView = this.f2031a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C0403c.m1652b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a2 = C0403c.m1651a(this.f2031a);
            Drawable drawable7 = a2[0];
            if (drawable7 == null && a2[2] == null) {
                Drawable[] compoundDrawables = this.f2031a.getCompoundDrawables();
                TextView textView2 = this.f2031a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f2031a;
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            Drawable drawable8 = a2[2];
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            C0403c.m1652b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    /* renamed from: z */
    private void m1625z() {
        C0476p1 p1Var = this.f2038h;
        this.f2032b = p1Var;
        this.f2033c = p1Var;
        this.f2034d = p1Var;
        this.f2035e = p1Var;
        this.f2036f = p1Var;
        this.f2037g = p1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo1928A(int i, float f) {
        if (!C0417d2.f2072b && !mo1938l()) {
            m1620B(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1929b() {
        if (!(this.f2032b == null && this.f2033c == null && this.f2034d == null && this.f2035e == null)) {
            Drawable[] compoundDrawables = this.f2031a.getCompoundDrawables();
            m1622a(compoundDrawables[0], this.f2032b);
            m1622a(compoundDrawables[1], this.f2033c);
            m1622a(compoundDrawables[2], this.f2034d);
            m1622a(compoundDrawables[3], this.f2035e);
        }
        if (this.f2036f != null || this.f2037g != null) {
            Drawable[] a = C0403c.m1651a(this.f2031a);
            m1622a(a[0], this.f2036f);
            m1622a(a[2], this.f2037g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1930c() {
        this.f2039i.mo2131a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1931e() {
        return this.f2039i.mo2133f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1932f() {
        return this.f2039i.mo2134g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1933g() {
        return this.f2039i.mo2135h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo1934h() {
        return this.f2039i.mo2136i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1935i() {
        return this.f2039i.mo2137j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo1936j() {
        C0476p1 p1Var = this.f2038h;
        if (p1Var != null) {
            return p1Var.f2196a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo1937k() {
        C0476p1 p1Var = this.f2038h;
        if (p1Var != null) {
            return p1Var.f2197b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo1938l() {
        return this.f2039i.mo2139n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0208  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1939m(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f2031a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.i r11 = androidx.appcompat.widget.C0444i.m1769b()
            int[] r2 = p030c.C2219j.f6740Y
            r12 = 0
            androidx.appcompat.widget.r1 r13 = androidx.appcompat.widget.C0483r1.m1946v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f2031a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo2331r()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.ViewCompat.m3615p0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p030c.C2219j.f6745Z
            r14 = -1
            int r0 = r13.mo2327n(r0, r14)
            int r1 = p030c.C2219j.f6761c0
            boolean r2 = r13.mo2332s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo2327n(r1, r12)
            androidx.appcompat.widget.p1 r1 = m1623d(r10, r11, r1)
            r7.f2032b = r1
        L_0x0042:
            int r1 = p030c.C2219j.f6751a0
            boolean r2 = r13.mo2332s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo2327n(r1, r12)
            androidx.appcompat.widget.p1 r1 = m1623d(r10, r11, r1)
            r7.f2033c = r1
        L_0x0054:
            int r1 = p030c.C2219j.f6766d0
            boolean r2 = r13.mo2332s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo2327n(r1, r12)
            androidx.appcompat.widget.p1 r1 = m1623d(r10, r11, r1)
            r7.f2034d = r1
        L_0x0066:
            int r1 = p030c.C2219j.f6756b0
            boolean r2 = r13.mo2332s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo2327n(r1, r12)
            androidx.appcompat.widget.p1 r1 = m1623d(r10, r11, r1)
            r7.f2035e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = p030c.C2219j.f6771e0
            boolean r3 = r13.mo2332s(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.mo2327n(r2, r12)
            androidx.appcompat.widget.p1 r2 = m1623d(r10, r11, r2)
            r7.f2036f = r2
        L_0x008c:
            int r2 = p030c.C2219j.f6776f0
            boolean r3 = r13.mo2332s(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.mo2327n(r2, r12)
            androidx.appcompat.widget.p1 r2 = m1623d(r10, r11, r2)
            r7.f2037g = r2
        L_0x009e:
            r13.mo2333w()
            android.widget.TextView r2 = r7.f2031a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = p030c.C2219j.f6754a3
            androidx.appcompat.widget.r1 r0 = androidx.appcompat.widget.C0483r1.m1944t(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = p030c.C2219j.f6799j3
            boolean r6 = r0.mo2332s(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.mo2314a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.m1621C(r10, r0)
            int r15 = p030c.C2219j.f6804k3
            boolean r16 = r0.mo2332s(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.mo2328o(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = p030c.C2219j.f6794i3
            boolean r17 = r0.mo2332s(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.mo2328o(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.mo2333w()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = p030c.C2219j.f6754a3
            androidx.appcompat.widget.r1 r0 = androidx.appcompat.widget.C0483r1.m1946v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = p030c.C2219j.f6799j3
            boolean r18 = r0.mo2332s(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.mo2314a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = p030c.C2219j.f6804k3
            boolean r13 = r0.mo2332s(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.mo2328o(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = p030c.C2219j.f6794i3
            boolean r6 = r0.mo2332s(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.mo2328o(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r3 = p030c.C2219j.f6759b3
            boolean r6 = r0.mo2332s(r3)
            if (r6 == 0) goto L_0x0139
            int r3 = r0.mo2319f(r3, r14)
            if (r3 != 0) goto L_0x0139
            android.widget.TextView r3 = r7.f2031a
            r6 = 0
            r3.setTextSize(r12, r6)
        L_0x0139:
            r7.m1621C(r10, r0)
            r0.mo2333w()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.mo1945s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f2042l
            if (r0 == 0) goto L_0x015b
            int r2 = r7.f2041k
            if (r2 != r14) goto L_0x0156
            android.widget.TextView r2 = r7.f2031a
            int r3 = r7.f2040j
            r2.setTypeface(r0, r3)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r2 = r7.f2031a
            r2.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f2031a
            androidx.appcompat.widget.C0400b0.C0406f.m1660d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x0183
            r0 = 24
            if (r1 < r0) goto L_0x0172
            android.widget.TextView r0 = r7.f2031a
            android.os.LocaleList r1 = androidx.appcompat.widget.C0400b0.C0405e.m1655a(r15)
            androidx.appcompat.widget.C0400b0.C0405e.m1656b(r0, r1)
            goto L_0x0183
        L_0x0172:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r15.split(r0)
            r0 = r0[r12]
            android.widget.TextView r1 = r7.f2031a
            java.util.Locale r0 = androidx.appcompat.widget.C0400b0.C0404d.m1654a(r0)
            androidx.appcompat.widget.C0400b0.C0403c.m1653c(r1, r0)
        L_0x0183:
            androidx.appcompat.widget.i0 r0 = r7.f2039i
            r0.mo2140o(r8, r9)
            boolean r0 = androidx.appcompat.widget.C0417d2.f2072b
            if (r0 == 0) goto L_0x01c7
            androidx.appcompat.widget.i0 r0 = r7.f2039i
            int r0 = r0.mo2137j()
            if (r0 == 0) goto L_0x01c7
            androidx.appcompat.widget.i0 r0 = r7.f2039i
            int[] r0 = r0.mo2136i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01c7
            android.widget.TextView r1 = r7.f2031a
            int r1 = androidx.appcompat.widget.C0400b0.C0406f.m1657a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c2
            android.widget.TextView r0 = r7.f2031a
            androidx.appcompat.widget.i0 r1 = r7.f2039i
            int r1 = r1.mo2134g()
            androidx.appcompat.widget.i0 r2 = r7.f2039i
            int r2 = r2.mo2133f()
            androidx.appcompat.widget.i0 r3 = r7.f2039i
            int r3 = r3.mo2135h()
            androidx.appcompat.widget.C0400b0.C0406f.m1658b(r0, r1, r2, r3, r12)
            goto L_0x01c7
        L_0x01c2:
            android.widget.TextView r1 = r7.f2031a
            androidx.appcompat.widget.C0400b0.C0406f.m1659c(r1, r0, r12)
        L_0x01c7:
            int[] r0 = p030c.C2219j.f6781g0
            androidx.appcompat.widget.r1 r8 = androidx.appcompat.widget.C0483r1.m1945u(r10, r8, r0)
            int r0 = p030c.C2219j.f6821o0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x01db
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r1 = r0
            goto L_0x01dc
        L_0x01db:
            r1 = 0
        L_0x01dc:
            int r0 = p030c.C2219j.f6846t0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x01ea
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r2 = r0
            goto L_0x01eb
        L_0x01ea:
            r2 = 0
        L_0x01eb:
            int r0 = p030c.C2219j.f6826p0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x01f9
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r3 = r0
            goto L_0x01fa
        L_0x01f9:
            r3 = 0
        L_0x01fa:
            int r0 = p030c.C2219j.f6811m0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x0208
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r4 = r0
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            int r0 = p030c.C2219j.f6831q0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x0217
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r5 = r0
            goto L_0x0218
        L_0x0217:
            r5 = 0
        L_0x0218:
            int r0 = p030c.C2219j.f6816n0
            int r0 = r8.mo2327n(r0, r14)
            if (r0 == r14) goto L_0x0226
            android.graphics.drawable.Drawable r0 = r11.mo2127c(r10, r0)
            r6 = r0
            goto L_0x0227
        L_0x0226:
            r6 = 0
        L_0x0227:
            r0 = r19
            r0.m1624y(r1, r2, r3, r4, r5, r6)
            int r0 = p030c.C2219j.f6836r0
            boolean r1 = r8.mo2332s(r0)
            if (r1 == 0) goto L_0x023d
            android.content.res.ColorStateList r0 = r8.mo2316c(r0)
            android.widget.TextView r1 = r7.f2031a
            androidx.core.widget.C1314o.m4568j(r1, r0)
        L_0x023d:
            int r0 = p030c.C2219j.f6841s0
            boolean r1 = r8.mo2332s(r0)
            if (r1 == 0) goto L_0x0253
            int r0 = r8.mo2324k(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0485s0.m1971e(r0, r1)
            android.widget.TextView r1 = r7.f2031a
            androidx.core.widget.C1314o.m4569k(r1, r0)
        L_0x0253:
            int r0 = p030c.C2219j.f6856v0
            int r0 = r8.mo2319f(r0, r14)
            int r1 = p030c.C2219j.f6861w0
            int r1 = r8.mo2319f(r1, r14)
            int r2 = p030c.C2219j.f6866x0
            int r2 = r8.mo2319f(r2, r14)
            r8.mo2333w()
            if (r0 == r14) goto L_0x026f
            android.widget.TextView r3 = r7.f2031a
            androidx.core.widget.C1314o.m4571m(r3, r0)
        L_0x026f:
            if (r1 == r14) goto L_0x0276
            android.widget.TextView r0 = r7.f2031a
            androidx.core.widget.C1314o.m4572n(r0, r1)
        L_0x0276:
            if (r2 == r14) goto L_0x027d
            android.widget.TextView r0 = r7.f2031a
            androidx.core.widget.C1314o.m4573o(r0, r2)
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0400b0.mo1939m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1940n(WeakReference weakReference, Typeface typeface) {
        if (this.f2043m) {
            this.f2042l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (ViewCompat.m3578U(textView)) {
                textView.post(new C0402b(textView, typeface, this.f2040j));
            } else {
                textView.setTypeface(typeface, this.f2040j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1941o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0417d2.f2072b) {
            mo1930c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1942p() {
        mo1929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1943q(Context context, int i) {
        String o;
        C0483r1 t = C0483r1.m1944t(context, i, C2219j.f6754a3);
        int i2 = C2219j.f6799j3;
        if (t.mo2332s(i2)) {
            mo1945s(t.mo2314a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C2219j.f6759b3;
        if (t.mo2332s(i4) && t.mo2319f(i4, -1) == 0) {
            this.f2031a.setTextSize(0, Utils.FLOAT_EPSILON);
        }
        m1621C(context, t);
        if (i3 >= 26) {
            int i5 = C2219j.f6794i3;
            if (t.mo2332s(i5) && (o = t.mo2328o(i5)) != null) {
                C0406f.m1660d(this.f2031a, o);
            }
        }
        t.mo2333w();
        Typeface typeface = this.f2042l;
        if (typeface != null) {
            this.f2031a.setTypeface(typeface, this.f2040j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1944r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C8911d.m33107f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1945s(boolean z) {
        this.f2031a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1946t(int i, int i2, int i3, int i4) {
        this.f2039i.mo2141p(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1947u(int[] iArr, int i) {
        this.f2039i.mo2142q(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1948v(int i) {
        this.f2039i.mo2143r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1949w(ColorStateList colorStateList) {
        boolean z;
        if (this.f2038h == null) {
            this.f2038h = new C0476p1();
        }
        C0476p1 p1Var = this.f2038h;
        p1Var.f2196a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        p1Var.f2199d = z;
        m1625z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo1950x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f2038h == null) {
            this.f2038h = new C0476p1();
        }
        C0476p1 p1Var = this.f2038h;
        p1Var.f2197b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        p1Var.f2198c = z;
        m1625z();
    }
}
