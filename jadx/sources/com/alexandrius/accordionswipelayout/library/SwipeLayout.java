package com.alexandrius.accordionswipelayout.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p074f2.C6150a;
import p074f2.C6151b;

public class SwipeLayout extends FrameLayout implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: W */
    private static Typeface f7432W;

    /* renamed from: A */
    private boolean f7433A = true;

    /* renamed from: B */
    private boolean f7434B = true;

    /* renamed from: C */
    private RecyclerView.C1756u f7435C;

    /* renamed from: D */
    private int f7436D = 0;

    /* renamed from: E */
    int f7437E;

    /* renamed from: F */
    float f7438F = -1.0f;

    /* renamed from: G */
    boolean f7439G;

    /* renamed from: H */
    boolean f7440H;

    /* renamed from: I */
    long f7441I;

    /* renamed from: J */
    long f7442J;

    /* renamed from: K */
    float f7443K;

    /* renamed from: L */
    float f7444L;

    /* renamed from: M */
    float f7445M;

    /* renamed from: N */
    float f7446N;

    /* renamed from: O */
    boolean f7447O;

    /* renamed from: P */
    boolean f7448P;

    /* renamed from: Q */
    private Handler f7449Q = new Handler();

    /* renamed from: R */
    private Runnable f7450R = new C2357a();

    /* renamed from: S */
    private Animation.AnimationListener f7451S = new C2358b();

    /* renamed from: T */
    private C2366c f7452T;

    /* renamed from: U */
    private C2366c f7453U;

    /* renamed from: V */
    boolean f7454V;

    /* renamed from: d */
    private int f7455d;

    /* renamed from: e */
    private ArrayList f7456e;

    /* renamed from: f */
    private ArrayList f7457f;

    /* renamed from: g */
    private int f7458g;

    /* renamed from: h */
    private int f7459h;

    /* renamed from: i */
    private int f7460i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f7461j;

    /* renamed from: k */
    private LinearLayout f7462k;

    /* renamed from: l */
    private LinearLayout f7463l;

    /* renamed from: m */
    private LinearLayout f7464m;

    /* renamed from: n */
    private LinearLayout f7465n;

    /* renamed from: o */
    private int f7466o;

    /* renamed from: p */
    private float f7467p;

    /* renamed from: q */
    private int f7468q;

    /* renamed from: r */
    private int f7469r = getResources().getDimensionPixelSize(C6150a.full_swipe_edge_padding);

    /* renamed from: s */
    private View[] f7470s;

    /* renamed from: t */
    private View[] f7471t;

    /* renamed from: u */
    private C2361e f7472u;

    /* renamed from: v */
    private C2362f f7473v;

    /* renamed from: w */
    private C2360d f7474w;

    /* renamed from: x */
    private boolean f7475x = true;

    /* renamed from: y */
    private boolean f7476y;

    /* renamed from: z */
    private boolean f7477z;

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$a */
    class C2357a implements Runnable {
        C2357a() {
        }

        public void run() {
            SwipeLayout swipeLayout = SwipeLayout.this;
            if (swipeLayout.f7447O && swipeLayout.performLongClick()) {
                SwipeLayout swipeLayout2 = SwipeLayout.this;
                swipeLayout2.f7448P = true;
                swipeLayout2.setPressed(false);
            }
        }
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$b */
    class C2358b implements Animation.AnimationListener {
        C2358b() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeLayout.this.m9109e();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$c */
    class C2359c extends RecyclerView.C1756u {
        C2359c() {
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            super.mo5739d(recyclerView, i);
            if (i == 1 && ViewCompat.m3559K(SwipeLayout.this.f7461j) != Utils.FLOAT_EPSILON) {
                SwipeLayout.this.mo7586B(2, true);
            }
        }
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$d */
    public interface C2360d {
        /* renamed from: e */
        void mo7625e(SwipeLayout swipeLayout, boolean z, String str);
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$e */
    public interface C2361e {
        /* renamed from: a */
        void mo7626a(boolean z, String str);
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$f */
    public interface C2362f {
        /* renamed from: a */
        void mo7627a(SwipeLayout swipeLayout, boolean z);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            setUpAttrs(attributeSet);
        }
        m9104C();
    }

    /* renamed from: C */
    private void m9104C() {
        if (this.f7455d != 0) {
            this.f7461j = LayoutInflater.from(getContext()).inflate(this.f7455d, (ViewGroup) null);
        }
        View view = this.f7461j;
        if (view != null) {
            addView(view);
            m9112i();
            this.f7461j.bringToFront();
            this.f7461j.setOnTouchListener(this);
        }
    }

    /* renamed from: c */
    private void m9107c(ArrayList arrayList, LinearLayout linearLayout, LinearLayout linearLayout2, View[] viewArr, boolean z) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ViewGroup m = m9116m((C2363g) arrayList.get(i), z);
                int i2 = 1;
                m.setClickable(true);
                m.setFocusable(true);
                m.setOnClickListener(this);
                viewArr[i] = m;
                int size = arrayList.size();
                if (z) {
                    i2 = arrayList.size();
                }
                if (i == size - i2) {
                    linearLayout.addView(m);
                } else {
                    linearLayout2.addView(m);
                }
            }
        }
    }

    /* renamed from: d */
    private void m9108d() {
        this.f7461j.clearAnimation();
        LinearLayout linearLayout = this.f7462k;
        if (linearLayout != null) {
            linearLayout.clearAnimation();
        }
        LinearLayout linearLayout2 = this.f7463l;
        if (linearLayout2 != null) {
            linearLayout2.clearAnimation();
        }
        LinearLayout linearLayout3 = this.f7464m;
        if (linearLayout3 != null) {
            linearLayout3.clearAnimation();
        }
        LinearLayout linearLayout4 = this.f7465n;
        if (linearLayout4 != null) {
            linearLayout4.clearAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m9109e() {
        Object obj;
        Object obj2;
        C2361e eVar = this.f7472u;
        if (eVar != null) {
            boolean z = this.f7454V;
            ArrayList arrayList = this.f7457f;
            if (z) {
                obj2 = arrayList.get(0);
            } else {
                obj2 = arrayList.get(arrayList.size() - 1);
            }
            eVar.mo7626a(z, ((C2363g) obj2).f7481a);
        }
        C2360d dVar = this.f7474w;
        if (dVar != null) {
            boolean z2 = this.f7454V;
            if (z2) {
                obj = this.f7457f.get(0);
            } else {
                ArrayList arrayList2 = this.f7457f;
                obj = arrayList2.get(arrayList2.size() - 1);
            }
            dVar.mo7625e(this, z2, ((C2363g) obj).f7481a);
        }
    }

    /* renamed from: g */
    private void m9110g(boolean z) {
        LinearLayout linearLayout = this.f7463l;
        if (linearLayout == null || linearLayout.getWidth() <= 0) {
            LinearLayout linearLayout2 = this.f7462k;
            if (linearLayout2 != null && linearLayout2.getWidth() > 0) {
                C2365b.m9140d(this.f7464m, this.f7470s.length - 1);
                if (z) {
                    this.f7462k.startAnimation(new C2364a(this.f7462k, 0, this.f7461j, false));
                    return;
                }
                ViewCompat.m3564M0(this.f7461j, Utils.FLOAT_EPSILON);
                C2365b.m9140d(this.f7462k, 0);
                return;
            }
            return;
        }
        C2365b.m9140d(this.f7465n, this.f7471t.length - 1);
        if (z) {
            this.f7463l.startAnimation(new C2364a(this.f7463l, 0, this.f7461j, true));
            return;
        }
        ViewCompat.m3564M0(this.f7461j, Utils.FLOAT_EPSILON);
        C2365b.m9140d(this.f7463l, 0);
    }

    private View[] getCollapsibleViews() {
        return this.f7454V ? this.f7471t : this.f7470s;
    }

    private Drawable getRippleDrawable() {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843534});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: h */
    private void m9111h() {
        ViewParent parent;
        if (this.f7434B && (parent = getParent()) != null && (parent instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) parent;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != this && (childAt instanceof SwipeLayout)) {
                    SwipeLayout swipeLayout = (SwipeLayout) childAt;
                    if (ViewCompat.m3559K(swipeLayout.getSwipeableView()) != Utils.FLOAT_EPSILON && !swipeLayout.mo7597q()) {
                        swipeLayout.mo7586B(2, true);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private void m9112i() {
        ArrayList arrayList = this.f7457f;
        int i = 0;
        if (arrayList != null) {
            this.f7459h = this.f7458g * arrayList.size();
            LinearLayout linearLayout = this.f7462k;
            if (linearLayout != null) {
                removeView(linearLayout);
            }
            this.f7462k = m9114k(5);
            LinearLayout k = m9114k(5);
            this.f7464m = k;
            k.setLayoutParams(new LinearLayout.LayoutParams(0, -1, (float) (this.f7457f.size() - 1)));
            addView(this.f7462k);
            this.f7470s = new View[this.f7457f.size()];
            this.f7462k.addView(this.f7464m);
            m9107c(this.f7457f, this.f7462k, this.f7464m, this.f7470s, false);
            int i2 = 0;
            while (true) {
                View[] viewArr = this.f7470s;
                if (i2 >= viewArr.length) {
                    break;
                }
                viewArr[i2].setAlpha(((C2363g) this.f7457f.get(i2)).f7487g.floatValue());
                i2++;
            }
        }
        ArrayList arrayList2 = this.f7456e;
        if (arrayList2 != null) {
            this.f7460i = this.f7458g * arrayList2.size();
            LinearLayout linearLayout2 = this.f7463l;
            if (linearLayout2 != null) {
                removeView(linearLayout2);
            }
            this.f7463l = m9114k(3);
            LinearLayout k2 = m9114k(3);
            this.f7465n = k2;
            k2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, (float) (this.f7456e.size() - 1)));
            this.f7471t = new View[this.f7456e.size()];
            addView(this.f7463l);
            m9107c(this.f7456e, this.f7463l, this.f7465n, this.f7471t, true);
            while (true) {
                View[] viewArr2 = this.f7471t;
                if (i >= viewArr2.length) {
                    break;
                }
                viewArr2[i].setAlpha(((C2363g) this.f7456e.get(i)).f7487g.floatValue());
                i++;
            }
            this.f7463l.addView(this.f7465n);
        }
        getSwipeableView().bringToFront();
    }

    /* renamed from: j */
    private void m9113j() {
        for (int i = 0; i < this.f7456e.size(); i++) {
            ((C2363g) this.f7456e.get(i)).f7487g = Float.valueOf(1.0f);
        }
    }

    /* renamed from: k */
    private LinearLayout m9114k(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -1);
        layoutParams.gravity = i;
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* renamed from: l */
    private void m9115l() {
        for (int i = 0; i < this.f7457f.size(); i++) {
            ((C2363g) this.f7457f.get(i)).f7487g = Float.valueOf(1.0f);
        }
    }

    /* renamed from: m */
    private ViewGroup m9116m(C2363g gVar, boolean z) {
        int i;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(getRippleDrawable());
        frameLayout.addView(view);
        if (gVar.f7484d.intValue() != 0) {
            frameLayout.setBackgroundColor(gVar.f7484d.intValue());
        }
        ImageView imageView = new ImageView(getContext());
        Drawable e = C0767a.m2895e(getContext(), gVar.f7483c.intValue());
        if (gVar.f7486f.intValue() != 0) {
            e = C2365b.m9138b(e, gVar.f7486f.intValue());
        }
        imageView.setImageDrawable(e);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        if (z) {
            i = 21;
        } else {
            i = 19;
        }
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(this.f7458g, -2, i));
        int i2 = this.f7466o;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(14, -1);
        imageView.setLayoutParams(layoutParams);
        int i3 = this.f7437E + 1;
        this.f7437E = i3;
        imageView.setId(i3);
        relativeLayout.addView(imageView);
        if (gVar.f7482b != null) {
            TextView textView = new TextView(getContext());
            textView.setMaxLines(2);
            float f = this.f7467p;
            if (f > Utils.FLOAT_EPSILON) {
                textView.setTextSize(0, f);
            }
            if (gVar.f7485e.intValue() != 0) {
                textView.setTextColor(gVar.f7485e.intValue());
            }
            Typeface typeface = f7432W;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            if (this.f7436D != 0) {
                textView.setTypeface(C0808h.m3033h(getContext(), this.f7436D));
            }
            textView.setText(gVar.f7482b);
            textView.setGravity(17);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f7458g, -2);
            layoutParams2.addRule(3, this.f7437E);
            layoutParams2.topMargin = this.f7468q;
            relativeLayout.addView(textView, layoutParams2);
        }
        frameLayout.setOnTouchListener(this);
        frameLayout.addView(relativeLayout);
        return frameLayout;
    }

    /* renamed from: n */
    private void m9117n(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getRawX() - this.f7444L < Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        this.f7439G = z;
        this.f7449Q.removeCallbacks(this.f7450R);
        this.f7447O = false;
        this.f7448P = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        if (r6 > 300) goto L_0x00f6;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9118o() {
        /*
            r11 = this;
            r0 = 0
            r11.f7447O = r0
            r11.setPressed(r0)
            android.view.ViewParent r1 = r11.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
            r11.f7440H = r0
            android.view.View r1 = r11.f7461j
            float r1 = androidx.core.view.ViewCompat.m3559K(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 <= 0) goto L_0x0078
            android.widget.LinearLayout r1 = r11.f7463l
            if (r1 == 0) goto L_0x0074
            boolean r4 = r11.f7439G
            if (r4 == 0) goto L_0x0029
            int r4 = r11.f7460i
            int r5 = r4 / 3
            int r4 = r4 - r5
            goto L_0x002d
        L_0x0029:
            int r4 = r11.f7460i
            int r4 = r4 / 3
        L_0x002d:
            android.widget.LinearLayout r5 = r11.f7462k
            if (r5 == 0) goto L_0x0034
            com.alexandrius.accordionswipelayout.library.C2365b.m9140d(r5, r0)
        L_0x0034:
            android.widget.LinearLayout r5 = r11.f7463l
            int r5 = r5.getWidth()
            if (r5 < r4) goto L_0x003f
            int r4 = r11.f7460i
            goto L_0x0040
        L_0x003f:
            r4 = r0
        L_0x0040:
            int r5 = r11.f7460i
            if (r4 != r5) goto L_0x0060
            boolean r5 = r11.f7439G
            if (r5 != 0) goto L_0x0060
            android.view.View r5 = r11.f7461j
            float r5 = androidx.core.view.ViewCompat.m3559K(r5)
            int r6 = r11.getWidth()
            int r7 = r11.f7469r
            int r6 = r6 - r7
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            int r4 = r11.getWidth()
            r11.f7454V = r3
        L_0x0060:
            android.view.View r5 = r11.f7461j
            android.widget.LinearLayout r6 = r11.f7463l
            int r6 = r6.getWidth()
            float r6 = (float) r6
            androidx.core.view.ViewCompat.m3564M0(r5, r6)
            com.alexandrius.accordionswipelayout.library.SwipeLayout$f r5 = r11.f7473v
            if (r5 == 0) goto L_0x0075
            r5.mo7627a(r11, r3)
            goto L_0x0075
        L_0x0074:
            r4 = r0
        L_0x0075:
            r5 = r3
            goto L_0x00e1
        L_0x0078:
            android.view.View r1 = r11.f7461j
            float r1 = androidx.core.view.ViewCompat.m3559K(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00de
            android.widget.LinearLayout r1 = r11.f7462k
            if (r1 == 0) goto L_0x00df
            android.widget.LinearLayout r4 = r11.f7463l
            if (r4 == 0) goto L_0x008d
            com.alexandrius.accordionswipelayout.library.C2365b.m9140d(r4, r0)
        L_0x008d:
            boolean r4 = r11.f7439G
            if (r4 == 0) goto L_0x0096
            int r4 = r11.f7459h
            int r4 = r4 / 3
            goto L_0x009b
        L_0x0096:
            int r4 = r11.f7459h
            int r5 = r4 / 3
            int r4 = r4 - r5
        L_0x009b:
            android.widget.LinearLayout r5 = r11.f7462k
            int r5 = r5.getWidth()
            if (r5 < r4) goto L_0x00a6
            int r4 = r11.f7459h
            goto L_0x00a7
        L_0x00a6:
            r4 = r0
        L_0x00a7:
            int r5 = r11.f7459h
            if (r4 != r5) goto L_0x00c8
            boolean r5 = r11.f7439G
            if (r5 == 0) goto L_0x00c8
            android.view.View r5 = r11.f7461j
            float r5 = androidx.core.view.ViewCompat.m3559K(r5)
            int r6 = r11.getWidth()
            int r7 = r11.f7469r
            int r6 = r6 - r7
            int r6 = -r6
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00c8
            int r4 = r11.getWidth()
            r11.f7454V = r0
        L_0x00c8:
            android.view.View r5 = r11.f7461j
            android.widget.LinearLayout r6 = r11.f7462k
            int r6 = r6.getWidth()
            int r6 = -r6
            float r6 = (float) r6
            androidx.core.view.ViewCompat.m3564M0(r5, r6)
            com.alexandrius.accordionswipelayout.library.SwipeLayout$f r5 = r11.f7473v
            if (r5 == 0) goto L_0x00dc
            r5.mo7627a(r11, r0)
        L_0x00dc:
            r5 = r0
            goto L_0x00e1
        L_0x00de:
            r1 = 0
        L_0x00df:
            r4 = r0
            r5 = r4
        L_0x00e1:
            r6 = 1120403456(0x42c80000, float:100.0)
            float r7 = r11.f7443K
            float r7 = r7 * r6
            long r6 = (long) r7
            if (r1 == 0) goto L_0x019a
            com.alexandrius.accordionswipelayout.library.a r8 = new com.alexandrius.accordionswipelayout.library.a
            android.view.View r9 = r11.f7461j
            r8.<init>(r1, r4, r9, r5)
            r9 = 100
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f8
        L_0x00f6:
            r6 = r9
            goto L_0x00ff
        L_0x00f8:
            r9 = 300(0x12c, double:1.48E-321)
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ff
            goto L_0x00f6
        L_0x00ff:
            r8.setDuration(r6)
            android.widget.LinearLayout r5 = r11.f7463l
            if (r1 != r5) goto L_0x0109
            android.widget.LinearLayout r6 = r11.f7465n
            goto L_0x010b
        L_0x0109:
            android.widget.LinearLayout r6 = r11.f7464m
        L_0x010b:
            if (r1 != r5) goto L_0x0110
            android.view.View[] r7 = r11.f7471t
            goto L_0x0112
        L_0x0110:
            android.view.View[] r7 = r11.f7470s
        L_0x0112:
            if (r1 != r5) goto L_0x0115
            r0 = r3
        L_0x0115:
            r11.f7454V = r0
            int r0 = r11.getWidth()
            if (r4 != r0) goto L_0x018c
            float r0 = com.alexandrius.accordionswipelayout.library.C2365b.m9137a(r6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x013e
            int r0 = r11.getWidth()
            float r0 = (float) r0
            android.view.View r3 = r11.f7461j
            float r3 = androidx.core.view.ViewCompat.m3559K(r3)
            float r3 = java.lang.Math.abs(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x013e
            android.view.animation.Animation$AnimationListener r0 = r11.f7451S
            r8.setAnimationListener(r0)
            goto L_0x0197
        L_0x013e:
            com.alexandrius.accordionswipelayout.library.c r0 = r11.f7452T
            if (r0 == 0) goto L_0x0150
            boolean r0 = r0.hasEnded()
            if (r0 != 0) goto L_0x0150
            com.alexandrius.accordionswipelayout.library.c r0 = r11.f7452T
            android.view.animation.Animation$AnimationListener r2 = r11.f7451S
            r0.setAnimationListener(r2)
            goto L_0x0197
        L_0x0150:
            float r0 = com.alexandrius.accordionswipelayout.library.C2365b.m9137a(r6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0188
            int r0 = r11.getWidth()
            float r0 = (float) r0
            android.view.View r3 = r11.f7461j
            float r3 = androidx.core.view.ViewCompat.m3559K(r3)
            float r3 = java.lang.Math.abs(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x016c
            goto L_0x0188
        L_0x016c:
            r6.clearAnimation()
            com.alexandrius.accordionswipelayout.library.c r0 = r11.f7452T
            if (r0 == 0) goto L_0x0176
            r0.cancel()
        L_0x0176:
            com.alexandrius.accordionswipelayout.library.c r0 = new com.alexandrius.accordionswipelayout.library.c
            r0.<init>(r2, r6)
            r11.f7452T = r0
            android.view.animation.Animation$AnimationListener r2 = r11.f7451S
            r0.setAnimationListener(r2)
            com.alexandrius.accordionswipelayout.library.c r0 = r11.f7452T
            r6.startAnimation(r0)
            goto L_0x0197
        L_0x0188:
            r11.m9109e()
            goto L_0x0197
        L_0x018c:
            com.alexandrius.accordionswipelayout.library.c r0 = new com.alexandrius.accordionswipelayout.library.c
            int r2 = r7.length
            int r2 = r2 - r3
            float r2 = (float) r2
            r0.<init>(r2, r6)
            r6.startAnimation(r0)
        L_0x0197:
            r1.startAnimation(r8)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alexandrius.accordionswipelayout.library.SwipeLayout.m9118o():void");
    }

    private void setUpAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6151b.f19122i);
        if (obtainStyledAttributes != null) {
            this.f7455d = obtainStyledAttributes.getResourceId(C6151b.f19128o, 0);
            this.f7458g = obtainStyledAttributes.getDimensionPixelSize(C6151b.f19131r, 100);
            this.f7466o = obtainStyledAttributes.getDimensionPixelSize(C6151b.f19129p, -1);
            this.f7467p = (float) obtainStyledAttributes.getDimensionPixelSize(C6151b.f19132s, 0);
            this.f7468q = obtainStyledAttributes.getDimensionPixelSize(C6151b.f19133t, 20);
            this.f7476y = obtainStyledAttributes.getBoolean(C6151b.f19126m, false);
            this.f7477z = obtainStyledAttributes.getBoolean(C6151b.f19125l, false);
            this.f7434B = obtainStyledAttributes.getBoolean(C6151b.f19130q, true);
            this.f7433A = obtainStyledAttributes.getBoolean(C6151b.f19124k, true);
            String string = obtainStyledAttributes.getString(C6151b.f19127n);
            if (string != null && f7432W == null) {
                f7432W = Typeface.createFromAsset(getContext().getAssets(), string);
            }
            this.f7436D = obtainStyledAttributes.getResourceId(C6151b.f19123j, 0);
            obtainStyledAttributes.recycle();
            if (this.f7456e != null) {
                m9113j();
            }
            if (this.f7457f != null) {
                m9115l();
            }
        }
    }

    /* renamed from: A */
    public void mo7585A(boolean z, int i, float f) {
        int i2 = 0;
        if (z) {
            while (i2 < this.f7456e.size()) {
                if (i2 == i) {
                    ((C2363g) this.f7456e.get(i)).f7487g = Float.valueOf(f);
                }
                i2++;
            }
            return;
        }
        while (i2 < this.f7457f.size()) {
            if (i2 == i) {
                ((C2363g) this.f7457f.get(i)).f7487g = Float.valueOf(f);
            }
            i2++;
        }
    }

    /* renamed from: B */
    public void mo7586B(int i, boolean z) {
        if (i == 0) {
            mo7598r();
            int size = this.f7456e.size() * this.f7458g;
            if (z) {
                this.f7463l.startAnimation(new C2364a(this.f7463l, size, this.f7461j, true));
                return;
            }
            ViewCompat.m3564M0(this.f7461j, (float) size);
            C2365b.m9140d(this.f7463l, size);
        } else if (i == 1) {
            mo7598r();
            int size2 = this.f7457f.size() * this.f7458g;
            if (z) {
                this.f7462k.startAnimation(new C2364a(this.f7462k, size2, this.f7461j, false));
                return;
            }
            ViewCompat.m3564M0(this.f7461j, (float) (-size2));
            C2365b.m9140d(this.f7462k, size2);
        } else if (i == 2) {
            m9110g(z);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f7461j != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        this.f7461j = view;
        m9104C();
    }

    /* renamed from: f */
    public void mo7588f(boolean z) {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) parent;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt instanceof SwipeLayout) {
                    SwipeLayout swipeLayout = (SwipeLayout) childAt;
                    if (ViewCompat.m3559K(swipeLayout.getSwipeableView()) != Utils.FLOAT_EPSILON) {
                        swipeLayout.mo7586B(2, z);
                    }
                }
            }
        }
    }

    public View[] getLeftViews() {
        return this.f7471t;
    }

    public View[] getRightViews() {
        return this.f7470s;
    }

    public View getSwipeableView() {
        return this.f7461j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAutoHideSwipe(this.f7433A);
        setOnlyOneSwipe(this.f7434B);
    }

    public void onClick(View view) {
        if (this.f7471t != null) {
            int i = 0;
            while (true) {
                View[] viewArr = this.f7471t;
                if (i >= viewArr.length) {
                    break;
                } else if (viewArr[i] != view) {
                    i++;
                } else if (viewArr.length == 1 || C2365b.m9137a(this.f7465n) > Utils.FLOAT_EPSILON) {
                    C2361e eVar = this.f7472u;
                    if (eVar != null) {
                        eVar.mo7626a(true, ((C2363g) this.f7456e.get(i)).f7481a);
                    }
                    C2360d dVar = this.f7474w;
                    if (dVar != null) {
                        dVar.mo7625e(this, true, ((C2363g) this.f7456e.get(i)).f7481a);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (this.f7470s != null) {
            int i2 = 0;
            while (true) {
                View[] viewArr2 = this.f7470s;
                if (i2 >= viewArr2.length) {
                    return;
                }
                if (viewArr2[i2] != view || (viewArr2.length != 1 && C2365b.m9137a(this.f7464m) <= Utils.FLOAT_EPSILON)) {
                    i2++;
                }
            }
            C2361e eVar2 = this.f7472u;
            if (eVar2 != null) {
                eVar2.mo7626a(false, ((C2363g) this.f7457f.get(i2)).f7481a);
            }
            C2360d dVar2 = this.f7474w;
            if (dVar2 != null) {
                dVar2.mo7625e(this, false, ((C2363g) this.f7457f.get(i2)).f7481a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo7586B(2, false);
        super.onDetachedFromWindow();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C2366c cVar;
        C2366c cVar2;
        C2366c cVar3;
        C2366c cVar4;
        if (this.f7475x && !(this.f7456e == null && this.f7457f == null)) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f7445M = motionEvent.getX();
                this.f7446N = motionEvent.getY();
                long currentTimeMillis = System.currentTimeMillis();
                this.f7441I = currentTimeMillis;
                this.f7442J = currentTimeMillis;
                float rawX = motionEvent.getRawX();
                this.f7438F = rawX;
                this.f7444L = rawX;
                if (ViewCompat.m3559K(this.f7461j) == Utils.FLOAT_EPSILON) {
                    LinearLayout linearLayout = this.f7464m;
                    if (linearLayout != null) {
                        C2365b.m9139c(linearLayout, (float) (this.f7470s.length - 1));
                    }
                    LinearLayout linearLayout2 = this.f7465n;
                    if (linearLayout2 != null) {
                        C2365b.m9139c(linearLayout2, (float) (this.f7471t.length - 1));
                    }
                }
                if (!mo7599s()) {
                    mo7598r();
                }
                return true;
            } else if (action == 1) {
                m9117n(motionEvent);
                if (this.f7440H) {
                    m9118o();
                } else {
                    view.setPressed(false);
                    if (System.currentTimeMillis() - this.f7442J < ((long) ViewConfiguration.getTapTimeout())) {
                        view.setPressed(true);
                        view.performClick();
                        view.setPressed(false);
                    }
                }
                return false;
            } else if (action != 2) {
                if (action == 3) {
                    m9117n(motionEvent);
                    if (this.f7440H) {
                        m9118o();
                    }
                    return false;
                }
            } else if (Math.abs(this.f7438F - motionEvent.getRawX()) >= 20.0f || this.f7440H) {
                if (view.isPressed()) {
                    view.setPressed(false);
                }
                this.f7447O = false;
                this.f7440H = true;
                m9111h();
                m9108d();
                if (this.f7438F - motionEvent.getRawX() > Utils.FLOAT_EPSILON) {
                    z = true;
                } else {
                    z = false;
                }
                this.f7439G = z;
                float abs = Math.abs(this.f7438F - motionEvent.getRawX());
                this.f7443K = ((float) (System.currentTimeMillis() - this.f7441I)) / abs;
                if (this.f7439G) {
                    float K = ViewCompat.m3559K(this.f7461j) - abs;
                    int i = this.f7459h;
                    if (K < ((float) (-i))) {
                        if (this.f7476y) {
                            if (K < ((float) (-getWidth()))) {
                                i = getWidth();
                            }
                        }
                        K = (float) (-i);
                    }
                    if (this.f7476y) {
                        if (ViewCompat.m3559K(this.f7461j) <= ((float) (-(getWidth() - this.f7469r)))) {
                            if (C2365b.m9137a(this.f7464m) > Utils.FLOAT_EPSILON && ((cVar4 = this.f7452T) == null || cVar4.hasEnded())) {
                                view.setPressed(false);
                                this.f7464m.clearAnimation();
                                if (this.f7453U != null) {
                                    this.f7453U = null;
                                }
                                this.f7452T = new C2366c(Utils.FLOAT_EPSILON, this.f7464m);
                                Log.d("WeightAnim", "onTouch - Collapse");
                                startAnimation(this.f7452T);
                            }
                        } else if (C2365b.m9137a(this.f7464m) < ((float) this.f7457f.size()) - 1.0f && ((cVar3 = this.f7453U) == null || cVar3.hasEnded())) {
                            Log.d("WeightAnim", "onTouch - Expand");
                            view.setPressed(false);
                            this.f7464m.clearAnimation();
                            if (this.f7452T != null) {
                                this.f7452T = null;
                            }
                            C2366c cVar5 = new C2366c((float) (this.f7457f.size() - 1), this.f7464m);
                            this.f7453U = cVar5;
                            startAnimation(cVar5);
                        }
                    }
                    ViewCompat.m3564M0(this.f7461j, K);
                    if (this.f7462k != null) {
                        C2365b.m9140d(this.f7462k, (int) Math.abs(K));
                    }
                    if (this.f7463l != null && K > Utils.FLOAT_EPSILON) {
                        C2365b.m9140d(this.f7463l, (int) Math.abs(ViewCompat.m3559K(this.f7461j)));
                    }
                } else {
                    float K2 = ViewCompat.m3559K(this.f7461j) + abs;
                    int i2 = this.f7460i;
                    if (K2 > ((float) i2)) {
                        if (!this.f7477z) {
                            K2 = (float) i2;
                        } else if (K2 >= ((float) getWidth())) {
                            K2 = (float) getWidth();
                        }
                    }
                    if (this.f7477z) {
                        if (ViewCompat.m3559K(this.f7461j) >= ((float) (getWidth() - this.f7469r))) {
                            if (C2365b.m9137a(this.f7465n) > Utils.FLOAT_EPSILON && ((cVar2 = this.f7452T) == null || cVar2.hasEnded())) {
                                this.f7465n.clearAnimation();
                                if (this.f7453U != null) {
                                    this.f7453U = null;
                                }
                                C2366c cVar6 = new C2366c(Utils.FLOAT_EPSILON, this.f7465n);
                                this.f7452T = cVar6;
                                startAnimation(cVar6);
                            }
                        } else if (C2365b.m9137a(this.f7465n) < ((float) this.f7456e.size()) - 1.0f && ((cVar = this.f7453U) == null || cVar.hasEnded())) {
                            this.f7465n.clearAnimation();
                            if (this.f7452T != null) {
                                this.f7452T = null;
                            }
                            C2366c cVar7 = new C2366c((float) (this.f7456e.size() - 1), this.f7465n);
                            this.f7453U = cVar7;
                            startAnimation(cVar7);
                        }
                    }
                    ViewCompat.m3564M0(this.f7461j, K2);
                    if (this.f7463l != null && K2 > Utils.FLOAT_EPSILON) {
                        C2365b.m9140d(this.f7463l, (int) Math.abs(K2));
                    }
                    if (this.f7462k != null) {
                        C2365b.m9140d(this.f7462k, (int) Math.abs(ViewCompat.m3559K(this.f7461j)));
                    }
                }
                if (Math.abs(ViewCompat.m3559K(this.f7461j)) > ((float) (this.f7458g / 5))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f7438F = motionEvent.getRawX();
                this.f7441I = System.currentTimeMillis();
                return true;
            } else {
                if (System.currentTimeMillis() - this.f7441I >= 50 && !isPressed() && !mo7614t() && !this.f7448P) {
                    view.setPressed(true);
                    if (!this.f7447O) {
                        this.f7447O = true;
                        this.f7449Q.postDelayed(this.f7450R, (long) ViewConfiguration.getLongPressTimeout());
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo7596p() {
        ArrayList arrayList = this.f7457f;
        return arrayList != null && !arrayList.isEmpty();
    }

    /* renamed from: q */
    public boolean mo7597q() {
        Animation animation;
        Animation animation2;
        LinearLayout linearLayout = this.f7463l;
        if (linearLayout != null && (animation2 = linearLayout.getAnimation()) != null && !animation2.hasEnded()) {
            return true;
        }
        LinearLayout linearLayout2 = this.f7462k;
        if (linearLayout2 == null || (animation = linearLayout2.getAnimation()) == null || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public void mo7598r() {
        m9112i();
    }

    /* renamed from: s */
    public boolean mo7599s() {
        return mo7615u() || mo7617w();
    }

    public void setAutoHideSwipe(boolean z) {
        this.f7433A = z;
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof RecyclerView)) {
            Log.e("SwipeLayout", "For autoHideSwipe parent must be a RecyclerView");
            return;
        }
        RecyclerView recyclerView = (RecyclerView) parent;
        RecyclerView.C1756u uVar = this.f7435C;
        if (uVar != null) {
            recyclerView.mo5367o1(uVar);
        }
        if (z) {
            C2359c cVar = new C2359c();
            this.f7435C = cVar;
            recyclerView.mo5363n(cVar);
        }
    }

    public void setCanFullSwipeFromLeft(boolean z) {
        this.f7477z = z;
    }

    public void setCanFullSwipeFromRight(boolean z) {
        this.f7476y = z;
    }

    public void setLeftSwipeItem(C2363g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f7456e = arrayList;
        arrayList.add(gVar);
    }

    public void setLeftSwipeItems(ArrayList<C2363g> arrayList) {
        this.f7456e = arrayList;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7461j.setOnClickListener(onClickListener);
    }

    public void setOnItemClickListener(C2360d dVar) {
        this.f7474w = dVar;
    }

    public void setOnSwipeItemClickListener(C2361e eVar) {
        this.f7472u = eVar;
    }

    public void setOnSwipedListener(C2362f fVar) {
        this.f7473v = fVar;
    }

    public void setOnlyOneSwipe(boolean z) {
        this.f7434B = z;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        drawableHotspotChanged(this.f7445M, this.f7446N);
    }

    public void setRightSwipeItem(C2363g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f7457f = arrayList;
        arrayList.add(gVar);
    }

    public void setRightSwipeItems(ArrayList<C2363g> arrayList) {
        this.f7457f = arrayList;
    }

    public void setSwipeEnabled(boolean z) {
        this.f7475x = z;
    }

    /* renamed from: t */
    public boolean mo7614t() {
        return mo7618x() || mo7616v();
    }

    /* renamed from: u */
    public boolean mo7615u() {
        LinearLayout linearLayout = this.f7463l;
        return linearLayout != null && linearLayout.getWidth() >= this.f7460i;
    }

    /* renamed from: v */
    public boolean mo7616v() {
        return ViewCompat.m3559K(this.f7461j) > Utils.FLOAT_EPSILON;
    }

    /* renamed from: w */
    public boolean mo7617w() {
        LinearLayout linearLayout = this.f7462k;
        return linearLayout != null && linearLayout.getWidth() >= this.f7459h;
    }

    /* renamed from: x */
    public boolean mo7618x() {
        return ViewCompat.m3559K(this.f7461j) < Utils.FLOAT_EPSILON;
    }

    /* renamed from: y */
    public boolean mo7619y() {
        return this.f7475x;
    }

    /* renamed from: z */
    public void mo7620z() {
        this.f7457f = null;
    }

    /* renamed from: com.alexandrius.accordionswipelayout.library.SwipeLayout$g */
    public static class C2363g {

        /* renamed from: a */
        public String f7481a;

        /* renamed from: b */
        public String f7482b;

        /* renamed from: c */
        public Integer f7483c;

        /* renamed from: d */
        public Integer f7484d;

        /* renamed from: e */
        public Integer f7485e;

        /* renamed from: f */
        public Integer f7486f;

        /* renamed from: g */
        public Float f7487g;

        public C2363g(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Float f) {
            int i;
            float f2;
            this.f7481a = str;
            this.f7482b = str2;
            this.f7483c = num;
            this.f7484d = num2;
            this.f7485e = num3;
            if (num4 == null) {
                i = 0;
            } else {
                i = num4.intValue();
            }
            this.f7486f = Integer.valueOf(i);
            if (f == null) {
                f2 = 1.0f;
            } else {
                f2 = f.floatValue();
            }
            this.f7487g = Float.valueOf(f2);
        }

        public C2363g(String str, String str2, Integer num) {
            this(str, str2, num, (Integer) null, (Integer) null, (Integer) null, (Float) null);
        }
    }
}
