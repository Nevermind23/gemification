package p060e1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.res.C0820l;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e1.g0 */
public class C5917g0 extends C5974o1 {

    /* renamed from: Q */
    private static final TimeInterpolator f18539Q = new DecelerateInterpolator();

    /* renamed from: R */
    private static final TimeInterpolator f18540R = new AccelerateInterpolator();

    /* renamed from: S */
    private static final C5924g f18541S = new C5918a();

    /* renamed from: T */
    private static final C5924g f18542T = new C5919b();

    /* renamed from: U */
    private static final C5924g f18543U = new C5920c();

    /* renamed from: V */
    private static final C5924g f18544V = new C5921d();

    /* renamed from: W */
    private static final C5924g f18545W = new C5922e();

    /* renamed from: X */
    private static final C5924g f18546X = new C5923f();

    /* renamed from: O */
    private C5924g f18547O = f18546X;

    /* renamed from: P */
    private int f18548P = 80;

    /* renamed from: e1.g0$a */
    class C5918a extends C5925h {
        C5918a() {
            super((C5918a) null);
        }

        /* renamed from: b */
        public float mo19301b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: e1.g0$b */
    class C5919b extends C5925h {
        C5919b() {
            super((C5918a) null);
        }

        /* renamed from: b */
        public float mo19301b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.m3541B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: e1.g0$c */
    class C5920c extends C5926i {
        C5920c() {
            super((C5918a) null);
        }

        /* renamed from: a */
        public float mo19302a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: e1.g0$d */
    class C5921d extends C5925h {
        C5921d() {
            super((C5918a) null);
        }

        /* renamed from: b */
        public float mo19301b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: e1.g0$e */
    class C5922e extends C5925h {
        C5922e() {
            super((C5918a) null);
        }

        /* renamed from: b */
        public float mo19301b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.m3541B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: e1.g0$f */
    class C5923f extends C5926i {
        C5923f() {
            super((C5918a) null);
        }

        /* renamed from: a */
        public float mo19302a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: e1.g0$g */
    private interface C5924g {
        /* renamed from: a */
        float mo19302a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo19301b(ViewGroup viewGroup, View view);
    }

    /* renamed from: e1.g0$h */
    private static abstract class C5925h implements C5924g {
        private C5925h() {
        }

        /* synthetic */ C5925h(C5918a aVar) {
            this();
        }

        /* renamed from: a */
        public float mo19302a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: e1.g0$i */
    private static abstract class C5926i implements C5924g {
        private C5926i() {
        }

        /* synthetic */ C5926i(C5918a aVar) {
            this();
        }

        /* renamed from: b */
        public float mo19301b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C5917g0(int i) {
        mo19300I0(i);
    }

    /* renamed from: A0 */
    private void m23750A0(C5989q0 q0Var) {
        int[] iArr = new int[2];
        q0Var.f18719b.getLocationOnScreen(iArr);
        q0Var.f18718a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: D0 */
    public Animator mo19298D0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        if (q0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) q0Var2.f18718a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C5995s0.m24078a(view, q0Var2, iArr[0], iArr[1], this.f18547O.mo19301b(viewGroup, view), this.f18547O.mo19302a(viewGroup, view), translationX, translationY, f18539Q, this);
    }

    /* renamed from: F0 */
    public Animator mo19299F0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        if (q0Var == null) {
            return null;
        }
        int[] iArr = (int[]) q0Var.f18718a.get("android:slide:screenPosition");
        return C5995s0.m24078a(view, q0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f18547O.mo19301b(viewGroup, view), this.f18547O.mo19302a(viewGroup, view), f18540R, this);
    }

    /* renamed from: I0 */
    public void mo19300I0(int i) {
        if (i == 3) {
            this.f18547O = f18541S;
        } else if (i == 5) {
            this.f18547O = f18544V;
        } else if (i == 48) {
            this.f18547O = f18543U;
        } else if (i == 80) {
            this.f18547O = f18546X;
        } else if (i == 8388611) {
            this.f18547O = f18542T;
        } else if (i == 8388613) {
            this.f18547O = f18545W;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f18548P = i;
        C5903f0 f0Var = new C5903f0();
        f0Var.mo19262j(i);
        mo19360w0(f0Var);
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        super.mo16526k(q0Var);
        m23750A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        super.mo16527n(q0Var);
        m23750A0(q0Var);
    }

    public C5917g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18559h);
        int k = C0820l.m3068k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo19300I0(k);
    }
}
