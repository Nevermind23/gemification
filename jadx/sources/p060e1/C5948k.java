package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0820l;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e1.k */
public class C5948k extends C5936i0 {

    /* renamed from: P */
    private static final String[] f18618P = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: Q */
    private static final Property f18619Q = new C5949a(float[].class, "nonTranslations");

    /* renamed from: R */
    private static final Property f18620R = new C5950b(PointF.class, "translations");

    /* renamed from: S */
    private static final boolean f18621S = true;

    /* renamed from: M */
    boolean f18622M = true;

    /* renamed from: N */
    private boolean f18623N = true;

    /* renamed from: O */
    private Matrix f18624O = new Matrix();

    /* renamed from: e1.k$a */
    class C5949a extends Property {
        C5949a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C5953e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5953e eVar, float[] fArr) {
            eVar.mo19385d(fArr);
        }
    }

    /* renamed from: e1.k$b */
    class C5950b extends Property {
        C5950b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5953e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5953e eVar, PointF pointF) {
            eVar.mo19384c(pointF);
        }
    }

    /* renamed from: e1.k$c */
    class C5951c extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f18625d;

        /* renamed from: e */
        private Matrix f18626e = new Matrix();

        /* renamed from: f */
        final /* synthetic */ boolean f18627f;

        /* renamed from: g */
        final /* synthetic */ Matrix f18628g;

        /* renamed from: h */
        final /* synthetic */ View f18629h;

        /* renamed from: i */
        final /* synthetic */ C5954f f18630i;

        /* renamed from: j */
        final /* synthetic */ C5953e f18631j;

        C5951c(boolean z, Matrix matrix, View view, C5954f fVar, C5953e eVar) {
            this.f18627f = z;
            this.f18628g = matrix;
            this.f18629h = view;
            this.f18630i = fVar;
            this.f18631j = eVar;
        }

        /* renamed from: a */
        private void m23894a(Matrix matrix) {
            this.f18626e.set(matrix);
            this.f18629h.setTag(C5894c0.f18494g, this.f18626e);
            this.f18630i.mo19386a(this.f18629h);
        }

        public void onAnimationCancel(Animator animator) {
            this.f18625d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f18625d) {
                if (!this.f18627f || !C5948k.this.f18622M) {
                    this.f18629h.setTag(C5894c0.f18494g, (Object) null);
                    this.f18629h.setTag(C5894c0.f18490c, (Object) null);
                } else {
                    m23894a(this.f18628g);
                }
            }
            C5887a1.m23689f(this.f18629h, (Matrix) null);
            this.f18630i.mo19386a(this.f18629h);
        }

        public void onAnimationPause(Animator animator) {
            m23894a(this.f18631j.mo19383a());
        }

        public void onAnimationResume(Animator animator) {
            C5948k.m23883E0(this.f18629h);
        }
    }

    /* renamed from: e1.k$d */
    private static class C5952d extends C5955k0 {

        /* renamed from: d */
        private View f18633d;

        /* renamed from: e */
        private C5988q f18634e;

        C5952d(View view, C5988q qVar) {
            this.f18633d = view;
            this.f18634e = qVar;
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
            this.f18634e.setVisibility(0);
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            i0Var.mo19343k0(this);
            C6000u.m24097b(this.f18633d);
            this.f18633d.setTag(C5894c0.f18494g, (Object) null);
            this.f18633d.setTag(C5894c0.f18490c, (Object) null);
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
            this.f18634e.setVisibility(4);
        }
    }

    /* renamed from: e1.k$e */
    private static class C5953e {

        /* renamed from: a */
        private final Matrix f18635a = new Matrix();

        /* renamed from: b */
        private final View f18636b;

        /* renamed from: c */
        private final float[] f18637c;

        /* renamed from: d */
        private float f18638d;

        /* renamed from: e */
        private float f18639e;

        C5953e(View view, float[] fArr) {
            this.f18636b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f18637c = fArr2;
            this.f18638d = fArr2[2];
            this.f18639e = fArr2[5];
            m23898b();
        }

        /* renamed from: b */
        private void m23898b() {
            float[] fArr = this.f18637c;
            fArr[2] = this.f18638d;
            fArr[5] = this.f18639e;
            this.f18635a.setValues(fArr);
            C5887a1.m23689f(this.f18636b, this.f18635a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo19383a() {
            return this.f18635a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19384c(PointF pointF) {
            this.f18638d = pointF.x;
            this.f18639e = pointF.y;
            m23898b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo19385d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f18637c, 0, fArr.length);
            m23898b();
        }
    }

    /* renamed from: e1.k$f */
    private static class C5954f {

        /* renamed from: a */
        final float f18640a;

        /* renamed from: b */
        final float f18641b;

        /* renamed from: c */
        final float f18642c;

        /* renamed from: d */
        final float f18643d;

        /* renamed from: e */
        final float f18644e;

        /* renamed from: f */
        final float f18645f;

        /* renamed from: g */
        final float f18646g;

        /* renamed from: h */
        final float f18647h;

        C5954f(View view) {
            this.f18640a = view.getTranslationX();
            this.f18641b = view.getTranslationY();
            this.f18642c = ViewCompat.m3563M(view);
            this.f18643d = view.getScaleX();
            this.f18644e = view.getScaleY();
            this.f18645f = view.getRotationX();
            this.f18646g = view.getRotationY();
            this.f18647h = view.getRotation();
        }

        /* renamed from: a */
        public void mo19386a(View view) {
            C5948k.m23885G0(view, this.f18640a, this.f18641b, this.f18642c, this.f18643d, this.f18644e, this.f18645f, this.f18646g, this.f18647h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5954f)) {
                return false;
            }
            C5954f fVar = (C5954f) obj;
            if (fVar.f18640a == this.f18640a && fVar.f18641b == this.f18641b && fVar.f18642c == this.f18642c && fVar.f18643d == this.f18643d && fVar.f18644e == this.f18644e && fVar.f18645f == this.f18645f && fVar.f18646g == this.f18646g && fVar.f18647h == this.f18647h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f18640a;
            int i8 = 0;
            if (f != Utils.FLOAT_EPSILON) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f18641b;
            if (f2 != Utils.FLOAT_EPSILON) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i12 = (i9 + i2) * 31;
            float f3 = this.f18642c;
            if (f3 != Utils.FLOAT_EPSILON) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 31;
            float f4 = this.f18643d;
            if (f4 != Utils.FLOAT_EPSILON) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 31;
            float f5 = this.f18644e;
            if (f5 != Utils.FLOAT_EPSILON) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 31;
            float f6 = this.f18645f;
            if (f6 != Utils.FLOAT_EPSILON) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 31;
            float f7 = this.f18646g;
            if (f7 != Utils.FLOAT_EPSILON) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i17 = (i16 + i7) * 31;
            float f8 = this.f18647h;
            if (f8 != Utils.FLOAT_EPSILON) {
                i8 = Float.floatToIntBits(f8);
            }
            return i17 + i8;
        }
    }

    public C5948k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18558g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f18622M = C0820l.m3062e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f18623N = C0820l.m3062e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A0 */
    private void m23879A0(C5989q0 q0Var) {
        Matrix matrix;
        View view = q0Var.f18719b;
        if (view.getVisibility() != 8) {
            q0Var.f18718a.put("android:changeTransform:parent", view.getParent());
            q0Var.f18718a.put("android:changeTransform:transforms", new C5954f(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            q0Var.f18718a.put("android:changeTransform:matrix", matrix);
            if (this.f18623N) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C5887a1.m23693j(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                q0Var.f18718a.put("android:changeTransform:parentMatrix", matrix3);
                q0Var.f18718a.put("android:changeTransform:intermediateMatrix", view.getTag(C5894c0.f18494g));
                q0Var.f18718a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C5894c0.f18490c));
            }
        }
    }

    /* renamed from: B0 */
    private void m23880B0(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        View view = q0Var2.f18719b;
        Matrix matrix = new Matrix((Matrix) q0Var2.f18718a.get("android:changeTransform:parentMatrix"));
        C5887a1.m23694k(viewGroup, matrix);
        C5988q a = C6000u.m24096a(view, viewGroup, matrix);
        if (a != null) {
            a.mo19429a((ViewGroup) q0Var.f18718a.get("android:changeTransform:parent"), q0Var.f18719b);
            C5936i0 i0Var = this;
            while (true) {
                C5936i0 i0Var2 = i0Var.f18599u;
                if (i0Var2 == null) {
                    break;
                }
                i0Var = i0Var2;
            }
            i0Var.mo19333a(new C5952d(view, a));
            if (f18621S) {
                View view2 = q0Var.f18719b;
                if (view2 != q0Var2.f18719b) {
                    C5887a1.m23691h(view2, Utils.FLOAT_EPSILON);
                }
                C5887a1.m23691h(view, 1.0f);
            }
        }
    }

    /* renamed from: C0 */
    private ObjectAnimator m23881C0(C5989q0 q0Var, C5989q0 q0Var2, boolean z) {
        Matrix matrix = (Matrix) q0Var.f18718a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) q0Var2.f18718a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C6006x.f18753a;
        }
        if (matrix2 == null) {
            matrix2 = C6006x.f18753a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = q0Var2.f18719b;
        m23883E0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C5953e eVar = new C5953e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f18619Q, new C5972o(new float[9]), new float[][]{fArr, fArr2}), C5891b0.m23704a(f18620R, mo19323M().mo19242a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C5951c cVar = new C5951c(z, matrix3, view, (C5954f) q0Var2.f18718a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C5885a.m23678a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f18719b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23882D0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo19332Z(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo19332Z(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            e1.q0 r4 = r3.mo19321K(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f18719b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060e1.C5948k.m23882D0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: E0 */
    static void m23883E0(View view) {
        m23885G0(view, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: F0 */
    private void m23884F0(C5989q0 q0Var, C5989q0 q0Var2) {
        Matrix matrix = (Matrix) q0Var2.f18718a.get("android:changeTransform:parentMatrix");
        q0Var2.f18719b.setTag(C5894c0.f18490c, matrix);
        Matrix matrix2 = this.f18624O;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) q0Var.f18718a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            q0Var.f18718a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) q0Var.f18718a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: G0 */
    static void m23885G0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.m3568O0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18618P;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23879A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23879A0(q0Var);
        if (!f18621S) {
            ((ViewGroup) q0Var.f18719b.getParent()).startViewTransition(q0Var.f18719b);
        }
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        boolean z;
        if (q0Var == null || q0Var2 == null || !q0Var.f18718a.containsKey("android:changeTransform:parent") || !q0Var2.f18718a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) q0Var.f18718a.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) q0Var2.f18718a.get("android:changeTransform:parent");
        if (!this.f18623N || m23882D0(viewGroup2, viewGroup3)) {
            z = false;
        } else {
            z = true;
        }
        Matrix matrix = (Matrix) q0Var.f18718a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            q0Var.f18718a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) q0Var.f18718a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            q0Var.f18718a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m23884F0(q0Var, q0Var2);
        }
        ObjectAnimator C0 = m23881C0(q0Var, q0Var2, z);
        if (z && C0 != null && this.f18622M) {
            m23880B0(viewGroup, q0Var, q0Var2);
        } else if (!f18621S) {
            viewGroup2.endViewTransition(q0Var.f18719b);
        }
        return C0;
    }
}
