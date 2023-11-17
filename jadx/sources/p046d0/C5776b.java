package p046d0;

import android.os.Looper;
import android.support.p013v4.media.session.C0125b;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p046d0.C5770a;

/* renamed from: d0.b */
public abstract class C5776b implements C5770a.C5772b {

    /* renamed from: m */
    public static final C5792p f18230m = new C5782f("translationX");

    /* renamed from: n */
    public static final C5792p f18231n = new C5783g("translationY");

    /* renamed from: o */
    public static final C5792p f18232o = new C5784h("translationZ");

    /* renamed from: p */
    public static final C5792p f18233p = new C5785i("scaleX");

    /* renamed from: q */
    public static final C5792p f18234q = new C5786j("scaleY");

    /* renamed from: r */
    public static final C5792p f18235r = new C5787k("rotation");

    /* renamed from: s */
    public static final C5792p f18236s = new C5788l("rotationX");

    /* renamed from: t */
    public static final C5792p f18237t = new C5789m("rotationY");

    /* renamed from: u */
    public static final C5792p f18238u = new C5790n("x");

    /* renamed from: v */
    public static final C5792p f18239v = new C5777a("y");

    /* renamed from: w */
    public static final C5792p f18240w = new C5778b("z");

    /* renamed from: x */
    public static final C5792p f18241x = new C5779c("alpha");

    /* renamed from: y */
    public static final C5792p f18242y = new C5780d("scrollX");

    /* renamed from: z */
    public static final C5792p f18243z = new C5781e("scrollY");

    /* renamed from: a */
    float f18244a = Utils.FLOAT_EPSILON;

    /* renamed from: b */
    float f18245b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f18246c = false;

    /* renamed from: d */
    final Object f18247d;

    /* renamed from: e */
    final C5793c f18248e;

    /* renamed from: f */
    boolean f18249f = false;

    /* renamed from: g */
    float f18250g = Float.MAX_VALUE;

    /* renamed from: h */
    float f18251h = (-Float.MAX_VALUE);

    /* renamed from: i */
    private long f18252i = 0;

    /* renamed from: j */
    private float f18253j;

    /* renamed from: k */
    private final ArrayList f18254k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f18255l = new ArrayList();

    /* renamed from: d0.b$a */
    static class C5777a extends C5792p {
        C5777a(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: d0.b$b */
    static class C5778b extends C5792p {
        C5778b(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return ViewCompat.m3567O(view);
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            ViewCompat.m3572Q0(view, f);
        }
    }

    /* renamed from: d0.b$c */
    static class C5779c extends C5792p {
        C5779c(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: d0.b$d */
    static class C5780d extends C5792p {
        C5780d(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: d0.b$e */
    static class C5781e extends C5792p {
        C5781e(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: d0.b$f */
    static class C5782f extends C5792p {
        C5782f(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: d0.b$g */
    static class C5783g extends C5792p {
        C5783g(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: d0.b$h */
    static class C5784h extends C5792p {
        C5784h(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return ViewCompat.m3563M(view);
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            ViewCompat.m3568O0(view, f);
        }
    }

    /* renamed from: d0.b$i */
    static class C5785i extends C5792p {
        C5785i(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: d0.b$j */
    static class C5786j extends C5792p {
        C5786j(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: d0.b$k */
    static class C5787k extends C5792p {
        C5787k(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: d0.b$l */
    static class C5788l extends C5792p {
        C5788l(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: d0.b$m */
    static class C5789m extends C5792p {
        C5789m(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: d0.b$n */
    static class C5790n extends C5792p {
        C5790n(String str) {
            super(str, (C5782f) null);
        }

        /* renamed from: c */
        public float mo16795a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void mo16796b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: d0.b$o */
    static class C5791o {

        /* renamed from: a */
        float f18256a;

        /* renamed from: b */
        float f18257b;

        C5791o() {
        }
    }

    /* renamed from: d0.b$p */
    public static abstract class C5792p extends C5793c {
        /* synthetic */ C5792p(String str, C5782f fVar) {
            this(str);
        }

        private C5792p(String str) {
            super(str);
        }
    }

    C5776b(Object obj, C5793c cVar) {
        this.f18247d = obj;
        this.f18248e = cVar;
        if (cVar == f18235r || cVar == f18236s || cVar == f18237t) {
            this.f18253j = 0.1f;
        } else if (cVar == f18241x) {
            this.f18253j = 0.00390625f;
        } else if (cVar == f18233p || cVar == f18234q) {
            this.f18253j = 0.00390625f;
        } else {
            this.f18253j = 1.0f;
        }
    }

    /* renamed from: b */
    private void m23222b(boolean z) {
        int i = 0;
        this.f18249f = false;
        C5770a.m23212d().mo18910g(this);
        this.f18252i = 0;
        this.f18246c = false;
        while (i < this.f18254k.size()) {
            if (this.f18254k.get(i) == null) {
                i++;
            } else {
                C0125b.m366a(this.f18254k.get(i));
                throw null;
            }
        }
        m23224f(this.f18254k);
    }

    /* renamed from: c */
    private float m23223c() {
        return this.f18248e.mo16795a(this.f18247d);
    }

    /* renamed from: f */
    private static void m23224f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: j */
    private void m23225j() {
        if (!this.f18249f) {
            this.f18249f = true;
            if (!this.f18246c) {
                this.f18245b = m23223c();
            }
            float f = this.f18245b;
            if (f > this.f18250g || f < this.f18251h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C5770a.m23212d().mo18907a(this, 0);
        }
    }

    /* renamed from: a */
    public boolean mo18912a(long j) {
        long j2 = this.f18252i;
        if (j2 == 0) {
            this.f18252i = j;
            mo18917g(this.f18245b);
            return false;
        }
        this.f18252i = j;
        boolean k = mo18920k(j - j2);
        float min = Math.min(this.f18245b, this.f18250g);
        this.f18245b = min;
        float max = Math.max(min, this.f18251h);
        this.f18245b = max;
        mo18917g(max);
        if (k) {
            m23222b(false);
        }
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo18915d() {
        return this.f18253j * 0.75f;
    }

    /* renamed from: e */
    public boolean mo18916e() {
        return this.f18249f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18917g(float f) {
        this.f18248e.mo16796b(this.f18247d, f);
        int i = 0;
        while (i < this.f18255l.size()) {
            if (this.f18255l.get(i) == null) {
                i++;
            } else {
                C0125b.m366a(this.f18255l.get(i));
                throw null;
            }
        }
        m23224f(this.f18255l);
    }

    /* renamed from: h */
    public C5776b mo18918h(float f) {
        this.f18245b = f;
        this.f18246c = true;
        return this;
    }

    /* renamed from: i */
    public void mo18919i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f18249f) {
            m23225j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo18920k(long j);
}
