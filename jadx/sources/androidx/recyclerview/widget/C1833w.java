package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.w */
public abstract class C1833w extends RecyclerView.C1754s {

    /* renamed from: a */
    RecyclerView f5495a;

    /* renamed from: b */
    private Scroller f5496b;

    /* renamed from: c */
    private final RecyclerView.C1756u f5497c = new C1834a();

    /* renamed from: androidx.recyclerview.widget.w$a */
    class C1834a extends RecyclerView.C1756u {

        /* renamed from: a */
        boolean f5498a = false;

        C1834a() {
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            super.mo5739d(recyclerView, i);
            if (i == 0 && this.f5498a) {
                this.f5498a = false;
                C1833w.this.mo6076l();
            }
        }

        /* renamed from: e */
        public void mo5740e(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f5498a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    class C1835b extends C1817m {
        C1835b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5451o(View view, RecyclerView.C1726b0 b0Var, RecyclerView.C1722a0.C1723a aVar) {
            C1833w wVar = C1833w.this;
            RecyclerView recyclerView = wVar.f5495a;
            if (recyclerView != null) {
                int[] c = wVar.mo6023c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo6020w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo5458d(i, i2, w, this.f5471j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo6019v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m7146g() {
        this.f5495a.mo5367o1(this.f5497c);
        this.f5495a.setOnFlingListener((RecyclerView.C1754s) null);
    }

    /* renamed from: j */
    private void m7147j() {
        if (this.f5495a.getOnFlingListener() == null) {
            this.f5495a.mo5363n(this.f5497c);
            this.f5495a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m7148k(RecyclerView.C1747p pVar, int i, int i2) {
        RecyclerView.C1722a0 e;
        int i3;
        if (!(pVar instanceof RecyclerView.C1722a0.C1724b) || (e = mo6051e(pVar)) == null || (i3 = mo6025i(pVar, i, i2)) == -1) {
            return false;
        }
        e.mo5452p(i3);
        pVar.mo5662W1(e);
        return true;
    }

    /* renamed from: a */
    public boolean mo5735a(int i, int i2) {
        RecyclerView.C1747p layoutManager = this.f5495a.getLayoutManager();
        if (layoutManager == null || this.f5495a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5495a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m7148k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo6073b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5495a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m7146g();
            }
            this.f5495a = recyclerView;
            if (recyclerView != null) {
                m7147j();
                this.f5496b = new Scroller(this.f5495a.getContext(), new DecelerateInterpolator());
                mo6076l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo6023c(RecyclerView.C1747p pVar, View view);

    /* renamed from: d */
    public int[] mo6074d(int i, int i2) {
        this.f5496b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f5496b.getFinalX(), this.f5496b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C1722a0 mo6051e(RecyclerView.C1747p pVar) {
        return mo6075f(pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1817m mo6075f(RecyclerView.C1747p pVar) {
        if (!(pVar instanceof RecyclerView.C1722a0.C1724b)) {
            return null;
        }
        return new C1835b(this.f5495a.getContext());
    }

    /* renamed from: h */
    public abstract View mo6024h(RecyclerView.C1747p pVar);

    /* renamed from: i */
    public abstract int mo6025i(RecyclerView.C1747p pVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6076l() {
        RecyclerView.C1747p layoutManager;
        View h;
        RecyclerView recyclerView = this.f5495a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo6024h(layoutManager)) != null) {
            int[] c = mo6023c(layoutManager, h);
            int i = c[0];
            if (i != 0 || c[1] != 0) {
                this.f5495a.mo5253C1(i, c[1]);
            }
        }
    }
}
