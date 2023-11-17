package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public abstract class C1824r {

    /* renamed from: a */
    protected final RecyclerView.C1747p f5484a;

    /* renamed from: b */
    private int f5485b;

    /* renamed from: c */
    final Rect f5486c;

    /* renamed from: androidx.recyclerview.widget.r$a */
    class C1825a extends C1824r {
        C1825a(RecyclerView.C1747p pVar) {
            super(pVar, (C1825a) null);
        }

        /* renamed from: d */
        public int mo6034d(View view) {
            return this.f5484a.mo5674f0(view) + ((RecyclerView.C1752q) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo6035e(View view) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            return this.f5484a.mo5673e0(view) + qVar.leftMargin + qVar.rightMargin;
        }

        /* renamed from: f */
        public int mo6036f(View view) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            return this.f5484a.mo5672d0(view) + qVar.topMargin + qVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo6037g(View view) {
            return this.f5484a.mo5671c0(view) - ((RecyclerView.C1752q) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo6038h() {
            return this.f5484a.mo5716x0();
        }

        /* renamed from: i */
        public int mo6039i() {
            return this.f5484a.mo5716x0() - this.f5484a.getPaddingRight();
        }

        /* renamed from: j */
        public int mo6040j() {
            return this.f5484a.getPaddingRight();
        }

        /* renamed from: l */
        public int mo6042l() {
            return this.f5484a.mo5718y0();
        }

        /* renamed from: m */
        public int mo6043m() {
            return this.f5484a.mo5685j0();
        }

        /* renamed from: n */
        public int mo6044n() {
            return this.f5484a.getPaddingLeft();
        }

        /* renamed from: o */
        public int mo6045o() {
            return (this.f5484a.mo5716x0() - this.f5484a.getPaddingLeft()) - this.f5484a.getPaddingRight();
        }

        /* renamed from: q */
        public int mo6047q(View view) {
            this.f5484a.mo5714w0(view, true, this.f5486c);
            return this.f5486c.right;
        }

        /* renamed from: r */
        public int mo6048r(View view) {
            this.f5484a.mo5714w0(view, true, this.f5486c);
            return this.f5486c.left;
        }

        /* renamed from: s */
        public void mo6049s(int i) {
            this.f5484a.mo5645N0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$b */
    class C1826b extends C1824r {
        C1826b(RecyclerView.C1747p pVar) {
            super(pVar, (C1825a) null);
        }

        /* renamed from: d */
        public int mo6034d(View view) {
            return this.f5484a.mo5668a0(view) + ((RecyclerView.C1752q) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo6035e(View view) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            return this.f5484a.mo5672d0(view) + qVar.topMargin + qVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo6036f(View view) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            return this.f5484a.mo5673e0(view) + qVar.leftMargin + qVar.rightMargin;
        }

        /* renamed from: g */
        public int mo6037g(View view) {
            return this.f5484a.mo5675g0(view) - ((RecyclerView.C1752q) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo6038h() {
            return this.f5484a.mo5684i0();
        }

        /* renamed from: i */
        public int mo6039i() {
            return this.f5484a.mo5684i0() - this.f5484a.getPaddingBottom();
        }

        /* renamed from: j */
        public int mo6040j() {
            return this.f5484a.getPaddingBottom();
        }

        /* renamed from: l */
        public int mo6042l() {
            return this.f5484a.mo5685j0();
        }

        /* renamed from: m */
        public int mo6043m() {
            return this.f5484a.mo5718y0();
        }

        /* renamed from: n */
        public int mo6044n() {
            return this.f5484a.getPaddingTop();
        }

        /* renamed from: o */
        public int mo6045o() {
            return (this.f5484a.mo5684i0() - this.f5484a.getPaddingTop()) - this.f5484a.getPaddingBottom();
        }

        /* renamed from: q */
        public int mo6047q(View view) {
            this.f5484a.mo5714w0(view, true, this.f5486c);
            return this.f5486c.bottom;
        }

        /* renamed from: r */
        public int mo6048r(View view) {
            this.f5484a.mo5714w0(view, true, this.f5486c);
            return this.f5486c.top;
        }

        /* renamed from: s */
        public void mo6049s(int i) {
            this.f5484a.mo5647O0(i);
        }
    }

    /* synthetic */ C1824r(RecyclerView.C1747p pVar, C1825a aVar) {
        this(pVar);
    }

    /* renamed from: a */
    public static C1824r m7051a(RecyclerView.C1747p pVar) {
        return new C1825a(pVar);
    }

    /* renamed from: b */
    public static C1824r m7052b(RecyclerView.C1747p pVar, int i) {
        if (i == 0) {
            return m7051a(pVar);
        }
        if (i == 1) {
            return m7053c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1824r m7053c(RecyclerView.C1747p pVar) {
        return new C1826b(pVar);
    }

    /* renamed from: d */
    public abstract int mo6034d(View view);

    /* renamed from: e */
    public abstract int mo6035e(View view);

    /* renamed from: f */
    public abstract int mo6036f(View view);

    /* renamed from: g */
    public abstract int mo6037g(View view);

    /* renamed from: h */
    public abstract int mo6038h();

    /* renamed from: i */
    public abstract int mo6039i();

    /* renamed from: j */
    public abstract int mo6040j();

    /* renamed from: k */
    public RecyclerView.C1747p mo6041k() {
        return this.f5484a;
    }

    /* renamed from: l */
    public abstract int mo6042l();

    /* renamed from: m */
    public abstract int mo6043m();

    /* renamed from: n */
    public abstract int mo6044n();

    /* renamed from: o */
    public abstract int mo6045o();

    /* renamed from: p */
    public int mo6046p() {
        if (Integer.MIN_VALUE == this.f5485b) {
            return 0;
        }
        return mo6045o() - this.f5485b;
    }

    /* renamed from: q */
    public abstract int mo6047q(View view);

    /* renamed from: r */
    public abstract int mo6048r(View view);

    /* renamed from: s */
    public abstract void mo6049s(int i);

    /* renamed from: t */
    public void mo6050t() {
        this.f5485b = mo6045o();
    }

    private C1824r(RecyclerView.C1747p pVar) {
        this.f5485b = Integer.MIN_VALUE;
        this.f5486c = new Rect();
        this.f5484a = pVar;
    }
}
