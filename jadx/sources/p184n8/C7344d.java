package p184n8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0082l;

/* renamed from: n8.d */
public class C7344d {

    /* renamed from: a */
    public final ColorStateList f21536a;

    /* renamed from: b */
    public final ColorStateList f21537b;

    /* renamed from: c */
    public final ColorStateList f21538c;

    /* renamed from: d */
    public final String f21539d;

    /* renamed from: e */
    public final int f21540e;

    /* renamed from: f */
    public final int f21541f;

    /* renamed from: g */
    public final boolean f21542g;

    /* renamed from: h */
    public final float f21543h;

    /* renamed from: i */
    public final float f21544i;

    /* renamed from: j */
    public final float f21545j;

    /* renamed from: k */
    public final boolean f21546k;

    /* renamed from: l */
    public final float f21547l;

    /* renamed from: m */
    private ColorStateList f21548m;

    /* renamed from: n */
    private float f21549n;

    /* renamed from: o */
    private final int f21550o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f21551p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Typeface f21552q;

    /* renamed from: n8.d$a */
    class C7345a extends C0808h.C0813e {

        /* renamed from: a */
        final /* synthetic */ C7348f f21553a;

        C7345a(C7348f fVar) {
            this.f21553a = fVar;
        }

        /* renamed from: h */
        public void mo1951h(int i) {
            boolean unused = C7344d.this.f21551p = true;
            this.f21553a.mo16009a(i);
        }

        /* renamed from: i */
        public void mo1952i(Typeface typeface) {
            C7344d dVar = C7344d.this;
            Typeface unused = dVar.f21552q = Typeface.create(typeface, dVar.f21540e);
            boolean unused2 = C7344d.this.f21551p = true;
            this.f21553a.mo16010b(C7344d.this.f21552q, false);
        }
    }

    /* renamed from: n8.d$b */
    class C7346b extends C7348f {

        /* renamed from: a */
        final /* synthetic */ Context f21555a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f21556b;

        /* renamed from: c */
        final /* synthetic */ C7348f f21557c;

        C7346b(Context context, TextPaint textPaint, C7348f fVar) {
            this.f21555a = context;
            this.f21556b = textPaint;
            this.f21557c = fVar;
        }

        /* renamed from: a */
        public void mo16009a(int i) {
            this.f21557c.mo16009a(i);
        }

        /* renamed from: b */
        public void mo16010b(Typeface typeface, boolean z) {
            C7344d.this.mo21726p(this.f21555a, this.f21556b, typeface);
            this.f21557c.mo16010b(typeface, z);
        }
    }

    public C7344d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0082l.f660c7);
        mo21723l(obtainStyledAttributes.getDimension(C0082l.f670d7, Utils.FLOAT_EPSILON));
        mo21722k(C7343c.m28003a(context, obtainStyledAttributes, C0082l.f700g7));
        this.f21536a = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f710h7);
        this.f21537b = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f720i7);
        this.f21540e = obtainStyledAttributes.getInt(C0082l.f690f7, 0);
        this.f21541f = obtainStyledAttributes.getInt(C0082l.f680e7, 1);
        int f = C7343c.m28008f(obtainStyledAttributes, C0082l.f780o7, C0082l.f770n7);
        this.f21550o = obtainStyledAttributes.getResourceId(f, 0);
        this.f21539d = obtainStyledAttributes.getString(f);
        this.f21542g = obtainStyledAttributes.getBoolean(C0082l.f790p7, false);
        this.f21538c = C7343c.m28003a(context, obtainStyledAttributes, C0082l.f730j7);
        this.f21543h = obtainStyledAttributes.getFloat(C0082l.f740k7, Utils.FLOAT_EPSILON);
        this.f21544i = obtainStyledAttributes.getFloat(C0082l.f750l7, Utils.FLOAT_EPSILON);
        this.f21545j = obtainStyledAttributes.getFloat(C0082l.f760m7, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C0082l.f514N4);
        int i2 = C0082l.f524O4;
        this.f21546k = obtainStyledAttributes2.hasValue(i2);
        this.f21547l = obtainStyledAttributes2.getFloat(i2, Utils.FLOAT_EPSILON);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m28016d() {
        String str;
        if (this.f21552q == null && (str = this.f21539d) != null) {
            this.f21552q = Typeface.create(str, this.f21540e);
        }
        if (this.f21552q == null) {
            int i = this.f21541f;
            if (i == 1) {
                this.f21552q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f21552q = Typeface.SERIF;
            } else if (i != 3) {
                this.f21552q = Typeface.DEFAULT;
            } else {
                this.f21552q = Typeface.MONOSPACE;
            }
            this.f21552q = Typeface.create(this.f21552q, this.f21540e);
        }
    }

    /* renamed from: m */
    private boolean m28017m(Context context) {
        Typeface typeface;
        if (C7347e.m28033a()) {
            return true;
        }
        int i = this.f21550o;
        if (i != 0) {
            typeface = C0808h.m3028c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface mo21716e() {
        m28016d();
        return this.f21552q;
    }

    /* renamed from: f */
    public Typeface mo21717f(Context context) {
        if (this.f21551p) {
            return this.f21552q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h = C0808h.m3033h(context, this.f21550o);
                this.f21552q = h;
                if (h != null) {
                    this.f21552q = Typeface.create(h, this.f21540e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f21539d, e);
            }
        }
        m28016d();
        this.f21551p = true;
        return this.f21552q;
    }

    /* renamed from: g */
    public void mo21718g(Context context, TextPaint textPaint, C7348f fVar) {
        mo21726p(context, textPaint, mo21716e());
        mo21719h(context, new C7346b(context, textPaint, fVar));
    }

    /* renamed from: h */
    public void mo21719h(Context context, C7348f fVar) {
        if (m28017m(context)) {
            mo21717f(context);
        } else {
            m28016d();
        }
        int i = this.f21550o;
        if (i == 0) {
            this.f21551p = true;
        }
        if (this.f21551p) {
            fVar.mo16010b(this.f21552q, true);
            return;
        }
        try {
            C0808h.m3035j(context, i, new C7345a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f21551p = true;
            fVar.mo16009a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f21539d, e);
            this.f21551p = true;
            fVar.mo16009a(-3);
        }
    }

    /* renamed from: i */
    public ColorStateList mo21720i() {
        return this.f21548m;
    }

    /* renamed from: j */
    public float mo21721j() {
        return this.f21549n;
    }

    /* renamed from: k */
    public void mo21722k(ColorStateList colorStateList) {
        this.f21548m = colorStateList;
    }

    /* renamed from: l */
    public void mo21723l(float f) {
        this.f21549n = f;
    }

    /* renamed from: n */
    public void mo21724n(Context context, TextPaint textPaint, C7348f fVar) {
        int i;
        int i2;
        mo21725o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f21548m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f21545j;
        float f2 = this.f21543h;
        float f3 = this.f21544i;
        ColorStateList colorStateList2 = this.f21538c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: o */
    public void mo21725o(Context context, TextPaint textPaint, C7348f fVar) {
        if (m28017m(context)) {
            mo21726p(context, textPaint, mo21717f(context));
        } else {
            mo21718g(context, textPaint, fVar);
        }
    }

    /* renamed from: p */
    public void mo21726p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface a = C7351i.m28038a(context, typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f21540e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f21549n);
        if (this.f21546k) {
            textPaint.setLetterSpacing(this.f21547l);
        }
    }
}
