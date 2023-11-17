package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.j */
class C1807j extends RecyclerView.C1746o implements RecyclerView.C1755t {

    /* renamed from: D */
    private static final int[] f5410D = {16842919};

    /* renamed from: E */
    private static final int[] f5411E = new int[0];

    /* renamed from: A */
    int f5412A;

    /* renamed from: B */
    private final Runnable f5413B;

    /* renamed from: C */
    private final RecyclerView.C1756u f5414C;

    /* renamed from: a */
    private final int f5415a;

    /* renamed from: b */
    private final int f5416b;

    /* renamed from: c */
    final StateListDrawable f5417c;

    /* renamed from: d */
    final Drawable f5418d;

    /* renamed from: e */
    private final int f5419e;

    /* renamed from: f */
    private final int f5420f;

    /* renamed from: g */
    private final StateListDrawable f5421g;

    /* renamed from: h */
    private final Drawable f5422h;

    /* renamed from: i */
    private final int f5423i;

    /* renamed from: j */
    private final int f5424j;

    /* renamed from: k */
    int f5425k;

    /* renamed from: l */
    int f5426l;

    /* renamed from: m */
    float f5427m;

    /* renamed from: n */
    int f5428n;

    /* renamed from: o */
    int f5429o;

    /* renamed from: p */
    float f5430p;

    /* renamed from: q */
    private int f5431q = 0;

    /* renamed from: r */
    private int f5432r = 0;

    /* renamed from: s */
    private RecyclerView f5433s;

    /* renamed from: t */
    private boolean f5434t = false;

    /* renamed from: u */
    private boolean f5435u = false;

    /* renamed from: v */
    private int f5436v = 0;

    /* renamed from: w */
    private int f5437w = 0;

    /* renamed from: x */
    private final int[] f5438x = new int[2];

    /* renamed from: y */
    private final int[] f5439y = new int[2];

    /* renamed from: z */
    final ValueAnimator f5440z;

    /* renamed from: androidx.recyclerview.widget.j$a */
    class C1808a implements Runnable {
        C1808a() {
        }

        public void run() {
            C1807j.this.mo5990q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    class C1809b extends RecyclerView.C1756u {
        C1809b() {
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            C1807j.this.mo5988B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    private class C1810c extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f5443d = false;

        C1810c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f5443d = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f5443d) {
                this.f5443d = false;
            } else if (((Float) C1807j.this.f5440z.getAnimatedValue()).floatValue() == Utils.FLOAT_EPSILON) {
                C1807j jVar = C1807j.this;
                jVar.f5412A = 0;
                jVar.mo5994y(0);
            } else {
                C1807j jVar2 = C1807j.this;
                jVar2.f5412A = 2;
                jVar2.mo5993v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    private class C1811d implements ValueAnimator.AnimatorUpdateListener {
        C1811d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1807j.this.f5417c.setAlpha(floatValue);
            C1807j.this.f5418d.setAlpha(floatValue);
            C1807j.this.mo5993v();
        }
    }

    C1807j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f5440z = ofFloat;
        this.f5412A = 0;
        this.f5413B = new C1808a();
        this.f5414C = new C1809b();
        this.f5417c = stateListDrawable;
        this.f5418d = drawable;
        this.f5421g = stateListDrawable2;
        this.f5422h = drawable2;
        this.f5419e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5420f = Math.max(i, drawable.getIntrinsicWidth());
        this.f5423i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5424j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5415a = i2;
        this.f5416b = i3;
        stateListDrawable.setAlpha(C11051p3.f31759c);
        drawable.setAlpha(C11051p3.f31759c);
        ofFloat.addListener(new C1810c());
        ofFloat.addUpdateListener(new C1811d());
        mo5989j(recyclerView);
    }

    /* renamed from: C */
    private void m6965C(float f) {
        int[] p = m6971p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f5426l) - max) >= 2.0f) {
            int x = m6975x(this.f5427m, max, p, this.f5433s.computeVerticalScrollRange(), this.f5433s.computeVerticalScrollOffset(), this.f5432r);
            if (x != 0) {
                this.f5433s.scrollBy(0, x);
            }
            this.f5427m = max;
        }
    }

    /* renamed from: k */
    private void m6966k() {
        this.f5433s.removeCallbacks(this.f5413B);
    }

    /* renamed from: l */
    private void m6967l() {
        this.f5433s.mo5359l1(this);
        this.f5433s.mo5365n1(this);
        this.f5433s.mo5367o1(this.f5414C);
        m6966k();
    }

    /* renamed from: m */
    private void m6968m(Canvas canvas) {
        int i = this.f5432r;
        int i2 = this.f5423i;
        int i3 = i - i2;
        int i4 = this.f5429o;
        int i5 = this.f5428n;
        int i6 = i4 - (i5 / 2);
        this.f5421g.setBounds(0, 0, i5, i2);
        this.f5422h.setBounds(0, 0, this.f5431q, this.f5424j);
        canvas.translate(Utils.FLOAT_EPSILON, (float) i3);
        this.f5422h.draw(canvas);
        canvas.translate((float) i6, Utils.FLOAT_EPSILON);
        this.f5421g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m6969n(Canvas canvas) {
        int i = this.f5431q;
        int i2 = this.f5419e;
        int i3 = i - i2;
        int i4 = this.f5426l;
        int i5 = this.f5425k;
        int i6 = i4 - (i5 / 2);
        this.f5417c.setBounds(0, 0, i2, i5);
        this.f5418d.setBounds(0, 0, this.f5420f, this.f5432r);
        if (m6973s()) {
            this.f5418d.draw(canvas);
            canvas.translate((float) this.f5419e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f5417c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f5419e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, Utils.FLOAT_EPSILON);
        this.f5418d.draw(canvas);
        canvas.translate(Utils.FLOAT_EPSILON, (float) i6);
        this.f5417c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m6970o() {
        int[] iArr = this.f5439y;
        int i = this.f5416b;
        iArr[0] = i;
        iArr[1] = this.f5431q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m6971p() {
        int[] iArr = this.f5438x;
        int i = this.f5416b;
        iArr[0] = i;
        iArr[1] = this.f5432r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m6972r(float f) {
        int[] o = m6970o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f5429o) - max) >= 2.0f) {
            int x = m6975x(this.f5430p, max, o, this.f5433s.computeHorizontalScrollRange(), this.f5433s.computeHorizontalScrollOffset(), this.f5431q);
            if (x != 0) {
                this.f5433s.scrollBy(x, 0);
            }
            this.f5430p = max;
        }
    }

    /* renamed from: s */
    private boolean m6973s() {
        return ViewCompat.m3541B(this.f5433s) == 1;
    }

    /* renamed from: w */
    private void m6974w(int i) {
        m6966k();
        this.f5433s.postDelayed(this.f5413B, (long) i);
    }

    /* renamed from: x */
    private int m6975x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m6976z() {
        this.f5433s.mo5351j(this);
        this.f5433s.mo5360m(this);
        this.f5433s.mo5363n(this.f5414C);
    }

    /* renamed from: A */
    public void mo5987A() {
        int i = this.f5412A;
        if (i != 0) {
            if (i == 3) {
                this.f5440z.cancel();
            } else {
                return;
            }
        }
        this.f5412A = 1;
        ValueAnimator valueAnimator = this.f5440z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f5440z.setDuration(500);
        this.f5440z.setStartDelay(0);
        this.f5440z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo5988B(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f5433s.computeVerticalScrollRange();
        int i3 = this.f5432r;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f5415a) {
            z = false;
        } else {
            z = true;
        }
        this.f5434t = z;
        int computeHorizontalScrollRange = this.f5433s.computeHorizontalScrollRange();
        int i4 = this.f5431q;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f5415a) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f5435u = z2;
        boolean z3 = this.f5434t;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i3;
                this.f5426l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f5425k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f5435u) {
                float f2 = (float) i4;
                this.f5429o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f5428n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f5436v;
            if (i5 == 0 || i5 == 1) {
                mo5994y(1);
            }
        } else if (this.f5436v != 0) {
            mo5994y(0);
        }
    }

    /* renamed from: a */
    public void mo5736a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5436v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo5992u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo5991t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f5437w = 1;
                        this.f5430p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f5437w = 2;
                        this.f5427m = (float) ((int) motionEvent.getY());
                    }
                    mo5994y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5436v == 2) {
                this.f5427m = Utils.FLOAT_EPSILON;
                this.f5430p = Utils.FLOAT_EPSILON;
                mo5994y(1);
                this.f5437w = 0;
            } else if (motionEvent.getAction() == 2 && this.f5436v == 2) {
                mo5987A();
                if (this.f5437w == 1) {
                    m6972r(motionEvent.getX());
                }
                if (this.f5437w == 2) {
                    m6965C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo5737b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f5436v;
        if (i == 1) {
            boolean u = mo5992u(motionEvent.getX(), motionEvent.getY());
            boolean t = mo5991t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u && !t) {
                return false;
            }
            if (t) {
                this.f5437w = 1;
                this.f5430p = (float) ((int) motionEvent.getX());
            } else if (u) {
                this.f5437w = 2;
                this.f5427m = (float) ((int) motionEvent.getY());
            }
            mo5994y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo5738c(boolean z) {
    }

    /* renamed from: i */
    public void mo5619i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        if (this.f5431q != this.f5433s.getWidth() || this.f5432r != this.f5433s.getHeight()) {
            this.f5431q = this.f5433s.getWidth();
            this.f5432r = this.f5433s.getHeight();
            mo5994y(0);
        } else if (this.f5412A != 0) {
            if (this.f5434t) {
                m6969n(canvas);
            }
            if (this.f5435u) {
                m6968m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo5989j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5433s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6967l();
            }
            this.f5433s = recyclerView;
            if (recyclerView != null) {
                m6976z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5990q(int i) {
        int i2 = this.f5412A;
        if (i2 == 1) {
            this.f5440z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f5412A = 3;
        ValueAnimator valueAnimator = this.f5440z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f5440z.setDuration((long) i);
        this.f5440z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5991t(float f, float f2) {
        if (f2 >= ((float) (this.f5432r - this.f5423i))) {
            int i = this.f5429o;
            int i2 = this.f5428n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5992u(float f, float f2) {
        if (!m6973s() ? f >= ((float) (this.f5431q - this.f5419e)) : f <= ((float) this.f5419e)) {
            int i = this.f5426l;
            int i2 = this.f5425k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5993v() {
        this.f5433s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5994y(int i) {
        if (i == 2 && this.f5436v != 2) {
            this.f5417c.setState(f5410D);
            m6966k();
        }
        if (i == 0) {
            mo5993v();
        } else {
            mo5987A();
        }
        if (this.f5436v == 2 && i != 2) {
            this.f5417c.setState(f5411E);
            m6974w(1200);
        } else if (i == 1) {
            m6974w(1500);
        }
        this.f5436v = i;
    }
}
