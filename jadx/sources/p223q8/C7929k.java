package p223q8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0082l;

/* renamed from: q8.k */
public class C7929k {

    /* renamed from: m */
    public static final C7918c f22925m = new C7927i(0.5f);

    /* renamed from: a */
    C7919d f22926a;

    /* renamed from: b */
    C7919d f22927b;

    /* renamed from: c */
    C7919d f22928c;

    /* renamed from: d */
    C7919d f22929d;

    /* renamed from: e */
    C7918c f22930e;

    /* renamed from: f */
    C7918c f22931f;

    /* renamed from: g */
    C7918c f22932g;

    /* renamed from: h */
    C7918c f22933h;

    /* renamed from: i */
    C7921f f22934i;

    /* renamed from: j */
    C7921f f22935j;

    /* renamed from: k */
    C7921f f22936k;

    /* renamed from: l */
    C7921f f22937l;

    /* renamed from: q8.k$c */
    public interface C7932c {
        /* renamed from: a */
        C7918c mo22970a(C7918c cVar);
    }

    /* renamed from: a */
    public static C7931b m29974a() {
        return new C7931b();
    }

    /* renamed from: b */
    public static C7931b m29975b(Context context, int i, int i2) {
        return m29976c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C7931b m29976c(Context context, int i, int i2, int i3) {
        return m29977d(context, i, i2, new C7916a((float) i3));
    }

    /* renamed from: d */
    private static C7931b m29977d(Context context, int i, int i2, C7918c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C0082l.f555R5);
        try {
            int i3 = obtainStyledAttributes.getInt(C0082l.f565S5, 0);
            int i4 = obtainStyledAttributes.getInt(C0082l.f593V5, i3);
            int i5 = obtainStyledAttributes.getInt(C0082l.f602W5, i3);
            int i6 = obtainStyledAttributes.getInt(C0082l.f584U5, i3);
            int i7 = obtainStyledAttributes.getInt(C0082l.f575T5, i3);
            C7918c m = m29981m(obtainStyledAttributes, C0082l.f611X5, cVar);
            C7918c m2 = m29981m(obtainStyledAttributes, C0082l.f639a6, m);
            C7918c m3 = m29981m(obtainStyledAttributes, C0082l.f649b6, m);
            C7918c m4 = m29981m(obtainStyledAttributes, C0082l.f629Z5, m);
            return new C7931b().mo23009y(i4, m2).mo22994C(i5, m3).mo23005u(i6, m4).mo23001q(i7, m29981m(obtainStyledAttributes, C0082l.f620Y5, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C7931b m29978e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m29979f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C7931b m29979f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m29980g(context, attributeSet, i, i2, new C7916a((float) i3));
    }

    /* renamed from: g */
    public static C7931b m29980g(Context context, AttributeSet attributeSet, int i, int i2, C7918c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f474J4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C0082l.f484K4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C0082l.f494L4, 0);
        obtainStyledAttributes.recycle();
        return m29977d(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: m */
    private static C7918c m29981m(TypedArray typedArray, int i, C7918c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C7916a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C7927i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    /* renamed from: h */
    public C7921f mo22975h() {
        return this.f22936k;
    }

    /* renamed from: i */
    public C7919d mo22976i() {
        return this.f22929d;
    }

    /* renamed from: j */
    public C7918c mo22977j() {
        return this.f22933h;
    }

    /* renamed from: k */
    public C7919d mo22978k() {
        return this.f22928c;
    }

    /* renamed from: l */
    public C7918c mo22979l() {
        return this.f22932g;
    }

    /* renamed from: n */
    public C7921f mo22980n() {
        return this.f22937l;
    }

    /* renamed from: o */
    public C7921f mo22981o() {
        return this.f22935j;
    }

    /* renamed from: p */
    public C7921f mo22982p() {
        return this.f22934i;
    }

    /* renamed from: q */
    public C7919d mo22983q() {
        return this.f22926a;
    }

    /* renamed from: r */
    public C7918c mo22984r() {
        return this.f22930e;
    }

    /* renamed from: s */
    public C7919d mo22985s() {
        return this.f22927b;
    }

    /* renamed from: t */
    public C7918c mo22986t() {
        return this.f22931f;
    }

    /* renamed from: u */
    public boolean mo22987u(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        Class<C7921f> cls = C7921f.class;
        if (!this.f22937l.getClass().equals(cls) || !this.f22935j.getClass().equals(cls) || !this.f22934i.getClass().equals(cls) || !this.f22936k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f22930e.mo22917a(rectF);
        if (this.f22931f.mo22917a(rectF) == a && this.f22933h.mo22917a(rectF) == a && this.f22932g.mo22917a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f22927b instanceof C7928j) || !(this.f22926a instanceof C7928j) || !(this.f22928c instanceof C7928j) || !(this.f22929d instanceof C7928j)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public C7931b mo22988v() {
        return new C7931b(this);
    }

    /* renamed from: w */
    public C7929k mo22989w(float f) {
        return mo22988v().mo22999o(f).mo22998m();
    }

    /* renamed from: x */
    public C7929k mo22990x(C7918c cVar) {
        return mo22988v().mo23000p(cVar).mo22998m();
    }

    /* renamed from: y */
    public C7929k mo22991y(C7932c cVar) {
        return mo22988v().mo22993B(cVar.mo22970a(mo22984r())).mo22997F(cVar.mo22970a(mo22986t())).mo23004t(cVar.mo22970a(mo22977j())).mo23008x(cVar.mo22970a(mo22979l())).mo22998m();
    }

    private C7929k(C7931b bVar) {
        this.f22926a = bVar.f22938a;
        this.f22927b = bVar.f22939b;
        this.f22928c = bVar.f22940c;
        this.f22929d = bVar.f22941d;
        this.f22930e = bVar.f22942e;
        this.f22931f = bVar.f22943f;
        this.f22932g = bVar.f22944g;
        this.f22933h = bVar.f22945h;
        this.f22934i = bVar.f22946i;
        this.f22935j = bVar.f22947j;
        this.f22936k = bVar.f22948k;
        this.f22937l = bVar.f22949l;
    }

    /* renamed from: q8.k$b */
    public static final class C7931b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7919d f22938a = C7926h.m29967b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C7919d f22939b = C7926h.m29967b();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C7919d f22940c = C7926h.m29967b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C7919d f22941d = C7926h.m29967b();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7918c f22942e = new C7916a(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7918c f22943f = new C7916a(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C7918c f22944g = new C7916a(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C7918c f22945h = new C7916a(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C7921f f22946i = C7926h.m29968c();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C7921f f22947j = C7926h.m29968c();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C7921f f22948k = C7926h.m29968c();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C7921f f22949l = C7926h.m29968c();

        public C7931b() {
        }

        /* renamed from: n */
        private static float m30011n(C7919d dVar) {
            if (dVar instanceof C7928j) {
                return ((C7928j) dVar).f22924a;
            }
            if (dVar instanceof C7920e) {
                return ((C7920e) dVar).f22872a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C7931b mo22992A(float f) {
            this.f22942e = new C7916a(f);
            return this;
        }

        /* renamed from: B */
        public C7931b mo22993B(C7918c cVar) {
            this.f22942e = cVar;
            return this;
        }

        /* renamed from: C */
        public C7931b mo22994C(int i, C7918c cVar) {
            return mo22995D(C7926h.m29966a(i)).mo22997F(cVar);
        }

        /* renamed from: D */
        public C7931b mo22995D(C7919d dVar) {
            this.f22939b = dVar;
            float n = m30011n(dVar);
            if (n != -1.0f) {
                mo22996E(n);
            }
            return this;
        }

        /* renamed from: E */
        public C7931b mo22996E(float f) {
            this.f22943f = new C7916a(f);
            return this;
        }

        /* renamed from: F */
        public C7931b mo22997F(C7918c cVar) {
            this.f22943f = cVar;
            return this;
        }

        /* renamed from: m */
        public C7929k mo22998m() {
            return new C7929k(this);
        }

        /* renamed from: o */
        public C7931b mo22999o(float f) {
            return mo22992A(f).mo22996E(f).mo23007w(f).mo23003s(f);
        }

        /* renamed from: p */
        public C7931b mo23000p(C7918c cVar) {
            return mo22993B(cVar).mo22997F(cVar).mo23008x(cVar).mo23004t(cVar);
        }

        /* renamed from: q */
        public C7931b mo23001q(int i, C7918c cVar) {
            return mo23002r(C7926h.m29966a(i)).mo23004t(cVar);
        }

        /* renamed from: r */
        public C7931b mo23002r(C7919d dVar) {
            this.f22941d = dVar;
            float n = m30011n(dVar);
            if (n != -1.0f) {
                mo23003s(n);
            }
            return this;
        }

        /* renamed from: s */
        public C7931b mo23003s(float f) {
            this.f22945h = new C7916a(f);
            return this;
        }

        /* renamed from: t */
        public C7931b mo23004t(C7918c cVar) {
            this.f22945h = cVar;
            return this;
        }

        /* renamed from: u */
        public C7931b mo23005u(int i, C7918c cVar) {
            return mo23006v(C7926h.m29966a(i)).mo23008x(cVar);
        }

        /* renamed from: v */
        public C7931b mo23006v(C7919d dVar) {
            this.f22940c = dVar;
            float n = m30011n(dVar);
            if (n != -1.0f) {
                mo23007w(n);
            }
            return this;
        }

        /* renamed from: w */
        public C7931b mo23007w(float f) {
            this.f22944g = new C7916a(f);
            return this;
        }

        /* renamed from: x */
        public C7931b mo23008x(C7918c cVar) {
            this.f22944g = cVar;
            return this;
        }

        /* renamed from: y */
        public C7931b mo23009y(int i, C7918c cVar) {
            return mo23010z(C7926h.m29966a(i)).mo22993B(cVar);
        }

        /* renamed from: z */
        public C7931b mo23010z(C7919d dVar) {
            this.f22938a = dVar;
            float n = m30011n(dVar);
            if (n != -1.0f) {
                mo22992A(n);
            }
            return this;
        }

        public C7931b(C7929k kVar) {
            this.f22938a = kVar.f22926a;
            this.f22939b = kVar.f22927b;
            this.f22940c = kVar.f22928c;
            this.f22941d = kVar.f22929d;
            this.f22942e = kVar.f22930e;
            this.f22943f = kVar.f22931f;
            this.f22944g = kVar.f22932g;
            this.f22945h = kVar.f22933h;
            this.f22946i = kVar.f22934i;
            this.f22947j = kVar.f22935j;
            this.f22948k = kVar.f22936k;
            this.f22949l = kVar.f22937l;
        }
    }

    public C7929k() {
        this.f22926a = C7926h.m29967b();
        this.f22927b = C7926h.m29967b();
        this.f22928c = C7926h.m29967b();
        this.f22929d = C7926h.m29967b();
        this.f22930e = new C7916a(Utils.FLOAT_EPSILON);
        this.f22931f = new C7916a(Utils.FLOAT_EPSILON);
        this.f22932g = new C7916a(Utils.FLOAT_EPSILON);
        this.f22933h = new C7916a(Utils.FLOAT_EPSILON);
        this.f22934i = C7926h.m29968c();
        this.f22935j = C7926h.m29968c();
        this.f22936k = C7926h.m29968c();
        this.f22937l = C7926h.m29968c();
    }
}
