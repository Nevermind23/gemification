package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0820l;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;

/* renamed from: e1.g */
public class C5905g extends C5936i0 {

    /* renamed from: P */
    private static final String[] f18502P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Q */
    private static final Property f18503Q;

    /* renamed from: R */
    private static final Property f18504R;

    /* renamed from: S */
    private static final Property f18505S;

    /* renamed from: T */
    private static final Property f18506T;

    /* renamed from: U */
    private static final Property f18507U;

    /* renamed from: V */
    private static final Property f18508V;

    /* renamed from: W */
    private static C5897d0 f18509W = new C5897d0();

    /* renamed from: M */
    private int[] f18510M = new int[2];

    /* renamed from: N */
    private boolean f18511N = false;

    /* renamed from: O */
    private boolean f18512O = false;

    /* renamed from: e1.g$a */
    class C5906a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f18513d;

        /* renamed from: e */
        final /* synthetic */ BitmapDrawable f18514e;

        /* renamed from: f */
        final /* synthetic */ View f18515f;

        /* renamed from: g */
        final /* synthetic */ float f18516g;

        C5906a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f18513d = viewGroup;
            this.f18514e = bitmapDrawable;
            this.f18515f = view;
            this.f18516g = f;
        }

        public void onAnimationEnd(Animator animator) {
            C5887a1.m23685b(this.f18513d).mo19450b(this.f18514e);
            C5887a1.m23691h(this.f18515f, this.f18516g);
        }
    }

    /* renamed from: e1.g$b */
    class C5907b extends Property {

        /* renamed from: a */
        private Rect f18518a = new Rect();

        C5907b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f18518a);
            Rect rect = this.f18518a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f18518a);
            this.f18518a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f18518a);
        }
    }

    /* renamed from: e1.g$c */
    class C5908c extends Property {
        C5908c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5916k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5916k kVar, PointF pointF) {
            kVar.mo19297c(pointF);
        }
    }

    /* renamed from: e1.g$d */
    class C5909d extends Property {
        C5909d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5916k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5916k kVar, PointF pointF) {
            kVar.mo19296a(pointF);
        }
    }

    /* renamed from: e1.g$e */
    class C5910e extends Property {
        C5910e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C5887a1.m23690g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: e1.g$f */
    class C5911f extends Property {
        C5911f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C5887a1.m23690g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: e1.g$g */
    class C5912g extends Property {
        C5912g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C5887a1.m23690g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: e1.g$h */
    class C5913h extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C5916k f18519d;
        private C5916k mViewBounds;

        C5913h(C5916k kVar) {
            this.f18519d = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: e1.g$i */
    class C5914i extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f18521d;

        /* renamed from: e */
        final /* synthetic */ View f18522e;

        /* renamed from: f */
        final /* synthetic */ Rect f18523f;

        /* renamed from: g */
        final /* synthetic */ int f18524g;

        /* renamed from: h */
        final /* synthetic */ int f18525h;

        /* renamed from: i */
        final /* synthetic */ int f18526i;

        /* renamed from: j */
        final /* synthetic */ int f18527j;

        C5914i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f18522e = view;
            this.f18523f = rect;
            this.f18524g = i;
            this.f18525h = i2;
            this.f18526i = i3;
            this.f18527j = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18521d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f18521d) {
                ViewCompat.m3633y0(this.f18522e, this.f18523f);
                C5887a1.m23690g(this.f18522e, this.f18524g, this.f18525h, this.f18526i, this.f18527j);
            }
        }
    }

    /* renamed from: e1.g$j */
    class C5915j extends C5955k0 {

        /* renamed from: d */
        boolean f18529d = false;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f18530e;

        C5915j(ViewGroup viewGroup) {
            this.f18530e = viewGroup;
        }

        /* renamed from: a */
        public void mo19292a(C5936i0 i0Var) {
            C6008x0.m24109d(this.f18530e, false);
            this.f18529d = true;
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
            C6008x0.m24109d(this.f18530e, true);
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            if (!this.f18529d) {
                C6008x0.m24109d(this.f18530e, false);
            }
            i0Var.mo19343k0(this);
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
            C6008x0.m24109d(this.f18530e, false);
        }
    }

    /* renamed from: e1.g$k */
    private static class C5916k {

        /* renamed from: a */
        private int f18532a;

        /* renamed from: b */
        private int f18533b;

        /* renamed from: c */
        private int f18534c;

        /* renamed from: d */
        private int f18535d;

        /* renamed from: e */
        private View f18536e;

        /* renamed from: f */
        private int f18537f;

        /* renamed from: g */
        private int f18538g;

        C5916k(View view) {
            this.f18536e = view;
        }

        /* renamed from: b */
        private void m23747b() {
            C5887a1.m23690g(this.f18536e, this.f18532a, this.f18533b, this.f18534c, this.f18535d);
            this.f18537f = 0;
            this.f18538g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19296a(PointF pointF) {
            this.f18534c = Math.round(pointF.x);
            this.f18535d = Math.round(pointF.y);
            int i = this.f18538g + 1;
            this.f18538g = i;
            if (this.f18537f == i) {
                m23747b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19297c(PointF pointF) {
            this.f18532a = Math.round(pointF.x);
            this.f18533b = Math.round(pointF.y);
            int i = this.f18537f + 1;
            this.f18537f = i;
            if (i == this.f18538g) {
                m23747b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f18503Q = new C5907b(cls, "boundsOrigin");
        f18504R = new C5908c(cls, "topLeft");
        f18505S = new C5909d(cls, "bottomRight");
        f18506T = new C5910e(cls, "bottomRight");
        f18507U = new C5911f(cls, "topLeft");
        f18508V = new C5912g(cls, "position");
    }

    public C5905g() {
    }

    /* renamed from: A0 */
    private void m23724A0(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        if (ViewCompat.m3579V(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            q0Var.f18718a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            q0Var.f18718a.put("android:changeBounds:parent", q0Var.f18719b.getParent());
            if (this.f18512O) {
                q0Var.f18719b.getLocationInWindow(this.f18510M);
                q0Var.f18718a.put("android:changeBounds:windowX", Integer.valueOf(this.f18510M[0]));
                q0Var.f18718a.put("android:changeBounds:windowY", Integer.valueOf(this.f18510M[1]));
            }
            if (this.f18511N) {
                q0Var.f18718a.put("android:changeBounds:clip", ViewCompat.m3624u(view));
            }
        }
    }

    /* renamed from: B0 */
    private boolean m23725B0(View view, View view2) {
        if (!this.f18512O) {
            return true;
        }
        C5989q0 K = mo19321K(view, true);
        if (K == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == K.f18719b) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public void mo19263C0(boolean z) {
        this.f18511N = z;
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18502P;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23724A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23724A0(q0Var);
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator2;
        C5989q0 q0Var3 = q0Var;
        C5989q0 q0Var4 = q0Var2;
        if (q0Var3 == null || q0Var4 == null) {
            return null;
        }
        Map map = q0Var3.f18718a;
        Map map2 = q0Var4.f18718a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = q0Var4.f18719b;
        if (m23725B0(viewGroup2, viewGroup3)) {
            Rect rect3 = (Rect) q0Var3.f18718a.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) q0Var4.f18718a.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i12 = rect4.bottom;
            int i13 = i7 - i3;
            int i14 = i9 - i5;
            int i15 = i8 - i4;
            int i16 = i12 - i6;
            View view3 = view2;
            Rect rect5 = (Rect) q0Var3.f18718a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) q0Var4.f18718a.get("android:changeBounds:clip");
            if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                i = 0;
            } else {
                if (i3 == i4 && i5 == i6) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (!(i7 == i8 && i9 == i12)) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect7 = rect6;
            Rect rect8 = rect5;
            if (!this.f18511N) {
                view = view3;
                C5887a1.m23690g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i13 == i15 && i14 == i16) {
                        animator = C6009y.m24110a(view, f18508V, mo19323M().mo19242a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C5916k kVar = new C5916k(view);
                        ObjectAnimator a = C6009y.m24110a(kVar, f18504R, mo19323M().mo19242a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C6009y.m24110a(kVar, f18505S, mo19323M().mo19242a((float) i7, (float) i9, (float) i8, (float) i12));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C5913h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C6009y.m24110a(view, f18506T, mo19323M().mo19242a((float) i7, (float) i9, (float) i8, (float) i12));
                } else {
                    animator = C6009y.m24110a(view, f18507U, mo19323M().mo19242a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C5887a1.m23690g(view, i3, i5, Math.max(i13, i15) + i3, Math.max(i14, i16) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C6009y.m24110a(view, f18508V, mo19323M().mo19242a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect8 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i13, i14);
                } else {
                    i2 = 0;
                    rect = rect8;
                }
                if (rect7 == null) {
                    rect2 = new Rect(i2, i2, i15, i16);
                } else {
                    rect2 = rect7;
                }
                if (!rect.equals(rect2)) {
                    ViewCompat.m3633y0(view, rect);
                    C5897d0 d0Var = f18509W;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect2;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", d0Var, objArr);
                    ofObject.addListener(new C5914i(view, rect7, i4, i6, i8, i12));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C5985p0.m24056c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C6008x0.m24109d(viewGroup4, true);
                mo19333a(new C5915j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) q0Var3.f18718a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) q0Var3.f18718a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) q0Var4.f18718a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) q0Var4.f18718a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f18510M);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C5887a1.m23686c(view2);
        C5887a1.m23691h(view2, Utils.FLOAT_EPSILON);
        C5887a1.m23685b(viewGroup).mo19449a(bitmapDrawable);
        C6011z M = mo19323M();
        int[] iArr = this.f18510M;
        int i17 = iArr[0];
        int i18 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C5891b0.m23704a(f18503Q, M.mo19242a((float) (intValue - i17), (float) (intValue2 - i18), (float) (intValue3 - i17), (float) (intValue4 - i18)))});
        ofPropertyValuesHolder.addListener(new C5906a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    public C5905g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18555d);
        boolean e = C0820l.m3062e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo19263C0(e);
    }
}
