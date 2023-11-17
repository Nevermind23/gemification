package o31;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.text.C0998y;
import androidx.recyclerview.widget.C1817m;
import androidx.recyclerview.widget.C1818n;
import androidx.recyclerview.widget.C1824r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o31.o */
public final class C37608o extends C1818n {

    /* renamed from: s */
    public static final C37609a f90356s = new C37609a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private int f90357f;

    /* renamed from: g */
    private boolean f90358g;

    /* renamed from: h */
    private boolean f90359h;

    /* renamed from: i */
    private int f90360i;

    /* renamed from: j */
    private boolean f90361j;

    /* renamed from: k */
    private boolean f90362k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f90363l;

    /* renamed from: m */
    private int f90364m;

    /* renamed from: n */
    private float f90365n;

    /* renamed from: o */
    private C1824r f90366o;

    /* renamed from: p */
    private C1824r f90367p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public RecyclerView f90368q;

    /* renamed from: r */
    private final RecyclerView.C1756u f90369r;

    /* renamed from: o31.o$a */
    public static final class C37609a {
        private C37609a() {
        }

        public /* synthetic */ C37609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o31.o$b */
    public interface C37610b {
    }

    /* renamed from: o31.o$c */
    public static final class C37611c extends C1817m {

        /* renamed from: q */
        final /* synthetic */ C37608o f90370q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37611c(C37608o oVar, Context context) {
            super(context);
            this.f90370q = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5451o(View view, RecyclerView.C1726b0 b0Var, RecyclerView.C1722a0.C1723a aVar) {
            C41536l.m120489i(view, "targetView");
            C41536l.m120489i(b0Var, "state");
            C41536l.m120489i(aVar, UrlHandler.ACTION);
            if (this.f90370q.f90368q != null) {
                RecyclerView s = this.f90370q.f90368q;
                C41536l.m120486f(s);
                if (s.getLayoutManager() != null) {
                    C37608o oVar = this.f90370q;
                    RecyclerView s2 = oVar.f90368q;
                    C41536l.m120486f(s2);
                    RecyclerView.C1747p layoutManager = s2.getLayoutManager();
                    C41536l.m120486f(layoutManager);
                    int[] c = oVar.mo6023c(layoutManager, view);
                    int i = c[0];
                    int i2 = c[1];
                    int w = mo6020w(Math.max(Math.abs(i), Math.abs(i2)));
                    if (w > 0) {
                        aVar.mo5458d(i, i2, w, this.f5471j);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo6019v(DisplayMetrics displayMetrics) {
            C41536l.m120489i(displayMetrics, "displayMetrics");
            return this.f90370q.f90363l / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: o31.o$d */
    public static final class C37612d extends RecyclerView.C1756u {

        /* renamed from: a */
        final /* synthetic */ C37608o f90371a;

        C37612d(C37608o oVar) {
            this.f90371a = oVar;
        }

        /* renamed from: d */
        public void mo5739d(RecyclerView recyclerView, int i) {
            C41536l.m120489i(recyclerView, "recyclerView");
            super.mo5739d(recyclerView, i);
            this.f90371a.m110595B(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37608o(int i, boolean z, C37610b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : bVar);
    }

    /* renamed from: A */
    private final boolean m110594A(LinearLayoutManager linearLayoutManager) {
        if ((linearLayoutManager.mo5193C2() || this.f90357f != 8388611) && ((!linearLayoutManager.mo5193C2() || this.f90357f != 8388613) && ((linearLayoutManager.mo5193C2() || this.f90357f != 48) && (!linearLayoutManager.mo5193C2() || this.f90357f != 80)))) {
            if (this.f90357f == 17) {
                if (!(linearLayoutManager.mo5215j2() == 0 || linearLayoutManager.mo5221o2() == linearLayoutManager.mo5686k0() - 1)) {
                    return false;
                }
            } else if (linearLayoutManager.mo5215j2() != 0) {
                return false;
            }
        } else if (linearLayoutManager.mo5221o2() != linearLayoutManager.mo5686k0() - 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m110595B(int i) {
        this.f90361j = i != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.mo6041k() != r2) goto L_0x000d;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.recyclerview.widget.C1824r m110596q(androidx.recyclerview.widget.RecyclerView.C1747p r2) {
        /*
            r1 = this;
            androidx.recyclerview.widget.r r0 = r1.f90367p
            if (r0 == 0) goto L_0x000d
            kotlin.jvm.internal.C41536l.m120486f(r0)
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.mo6041k()
            if (r0 == r2) goto L_0x0013
        L_0x000d:
            androidx.recyclerview.widget.r r2 = androidx.recyclerview.widget.C1824r.m7051a(r2)
            r1.f90367p = r2
        L_0x0013:
            androidx.recyclerview.widget.r r2 = r1.f90367p
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.C37608o.m110596q(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.r");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.mo6041k() != r2) goto L_0x000d;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.recyclerview.widget.C1824r m110597r(androidx.recyclerview.widget.RecyclerView.C1747p r2) {
        /*
            r1 = this;
            androidx.recyclerview.widget.r r0 = r1.f90366o
            if (r0 == 0) goto L_0x000d
            kotlin.jvm.internal.C41536l.m120486f(r0)
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.mo6041k()
            if (r0 == r2) goto L_0x0013
        L_0x000d:
            androidx.recyclerview.widget.r r2 = androidx.recyclerview.widget.C1824r.m7053c(r2)
            r1.f90366o = r2
        L_0x0013:
            androidx.recyclerview.widget.r r2 = r1.f90366o
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.C37608o.m110597r(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.r");
    }

    /* renamed from: w */
    private final View m110601w(RecyclerView.C1747p pVar, C1824r rVar, int i, boolean z) {
        int i2;
        boolean z2;
        int i3;
        View view = null;
        if (pVar.mo5660V() != 0 && (pVar instanceof LinearLayoutManager)) {
            if (z && m110594A((LinearLayoutManager) pVar) && !this.f90359h) {
                return null;
            }
            if (pVar.mo5665Y()) {
                i2 = rVar.mo6044n() + (rVar.mo6045o() / 2);
            } else {
                i2 = rVar.mo6038h() / 2;
            }
            boolean z3 = true;
            if ((i != 8388611 || this.f90358g) && (i != 8388613 || !this.f90358g)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i != 8388611 || !this.f90358g) && (i != 8388613 || this.f90358g)) {
                z3 = false;
            }
            int V = ((LinearLayoutManager) pVar).mo5660V();
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < V; i5++) {
                View U = pVar.mo5658U(i5);
                if (z2) {
                    if (!this.f90362k) {
                        i3 = Math.abs(rVar.mo6037g(U));
                    } else {
                        i3 = Math.abs(rVar.mo6044n() - rVar.mo6037g(U));
                    }
                } else if (!z3) {
                    i3 = Math.abs((rVar.mo6037g(U) + (rVar.mo6035e(U) / 2)) - i2);
                } else if (!this.f90362k) {
                    i3 = Math.abs(rVar.mo6034d(U) - rVar.mo6038h());
                } else {
                    i3 = Math.abs(rVar.mo6039i() - rVar.mo6034d(U));
                }
                if (i3 < i4) {
                    view = U;
                    i4 = i3;
                }
            }
        }
        return view;
    }

    /* renamed from: x */
    private final int m110602x(View view, C1824r rVar) {
        int i;
        int i2;
        if (!this.f90362k) {
            int d = rVar.mo6034d(view);
            if (d < rVar.mo6038h() - ((rVar.mo6038h() - rVar.mo6039i()) / 2)) {
                return d - rVar.mo6039i();
            }
            i2 = rVar.mo6034d(view);
            i = rVar.mo6038h();
        } else {
            i2 = rVar.mo6034d(view);
            i = rVar.mo6039i();
        }
        return i2 - i;
    }

    /* renamed from: y */
    private final int m110603y(View view, C1824r rVar) {
        int i;
        int i2;
        if (!this.f90362k) {
            i2 = rVar.mo6037g(view);
            if (i2 < rVar.mo6044n() / 2) {
                return i2;
            }
            i = rVar.mo6044n();
        } else {
            i2 = rVar.mo6037g(view);
            i = rVar.mo6044n();
        }
        return i2 - i;
    }

    /* renamed from: z */
    private final int m110604z() {
        boolean z;
        float width;
        float f;
        if (this.f90365n == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f90366o != null) {
                RecyclerView recyclerView = this.f90368q;
                C41536l.m120486f(recyclerView);
                width = (float) recyclerView.getHeight();
                f = this.f90365n;
            } else if (this.f90367p == null) {
                return Integer.MAX_VALUE;
            } else {
                RecyclerView recyclerView2 = this.f90368q;
                C41536l.m120486f(recyclerView2);
                width = (float) recyclerView2.getWidth();
                f = this.f90365n;
            }
            return (int) (width * f);
        }
        int i = this.f90364m;
        if (i != -1) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void mo6073b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f90368q;
        if (recyclerView2 != null) {
            recyclerView2.mo5367o1(this.f90369r);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener((RecyclerView.C1754s) null);
            int i = this.f90357f;
            if (i == 8388611 || i == 8388613) {
                boolean z = true;
                if (C0998y.m3506a(Locale.getDefault()) != 1) {
                    z = false;
                }
                this.f90358g = z;
            }
            recyclerView.mo5363n(this.f90369r);
            this.f90368q = recyclerView;
        } else {
            this.f90368q = null;
        }
        super.mo6073b(recyclerView);
    }

    /* renamed from: c */
    public int[] mo6023c(RecyclerView.C1747p pVar, View view) {
        C41536l.m120489i(pVar, "layoutManager");
        C41536l.m120489i(view, "targetView");
        if (this.f90357f == 17) {
            int[] c = super.mo6023c(pVar, view);
            C41536l.m120486f(c);
            return c;
        }
        int[] iArr = new int[2];
        if (!(pVar instanceof LinearLayoutManager)) {
            return iArr;
        }
        if (pVar.mo5226v()) {
            boolean z = this.f90358g;
            if ((!z || this.f90357f != 8388613) && (z || this.f90357f != 8388611)) {
                C1824r q = m110596q(pVar);
                C41536l.m120486f(q);
                iArr[0] = m110602x(view, q);
            } else {
                C1824r q2 = m110596q(pVar);
                C41536l.m120486f(q2);
                iArr[0] = m110603y(view, q2);
            }
        } else if (pVar.mo5227w()) {
            if (this.f90357f == 48) {
                C1824r r = m110597r(pVar);
                C41536l.m120486f(r);
                iArr[1] = m110603y(view, r);
            } else {
                C1824r r2 = m110597r(pVar);
                C41536l.m120486f(r2);
                iArr[1] = m110602x(view, r2);
            }
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 != false) goto L_0x0053;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo6074d(int r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r13.f90368q
            if (r0 == 0) goto L_0x0053
            androidx.recyclerview.widget.r r0 = r13.f90366o
            if (r0 != 0) goto L_0x000c
            androidx.recyclerview.widget.r r0 = r13.f90367p
            if (r0 == 0) goto L_0x0053
        L_0x000c:
            int r0 = r13.f90364m
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0021
            float r0 = r13.f90365n
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            r0 = r2
            goto L_0x001e
        L_0x001d:
            r0 = r3
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            goto L_0x0053
        L_0x0021:
            r0 = 2
            int[] r0 = new int[r0]
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r4 = r13.f90368q
            kotlin.jvm.internal.C41536l.m120486f(r4)
            android.content.Context r4 = r4.getContext()
            android.view.animation.AccelerateDecelerateInterpolator r5 = new android.view.animation.AccelerateDecelerateInterpolator
            r5.<init>()
            r1.<init>(r4, r5)
            int r12 = r13.m110604z()
            r5 = 0
            r6 = 0
            int r11 = -r12
            r4 = r1
            r7 = r14
            r8 = r15
            r9 = r11
            r10 = r12
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            int r14 = r1.getFinalX()
            r0[r3] = r14
            int r14 = r1.getFinalY()
            r0[r2] = r14
            return r0
        L_0x0053:
            int[] r14 = super.mo6074d(r14, r15)
            java.lang.String r15 = "super.calculateScrollDis…nce(velocityX, velocityY)"
            kotlin.jvm.internal.C41536l.m120488h(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o31.C37608o.mo6074d(int, int):int[]");
    }

    /* renamed from: e */
    public RecyclerView.C1722a0 mo6051e(RecyclerView.C1747p pVar) {
        RecyclerView recyclerView;
        C41536l.m120489i(pVar, "layoutManager");
        if (!(pVar instanceof RecyclerView.C1722a0.C1724b) || (recyclerView = this.f90368q) == null) {
            return null;
        }
        C41536l.m120486f(recyclerView);
        return new C37611c(this, recyclerView.getContext());
    }

    /* renamed from: h */
    public View mo6024h(RecyclerView.C1747p pVar) {
        C41536l.m120489i(pVar, "lm");
        return mo90792v(pVar, true);
    }

    /* renamed from: v */
    public final View mo90792v(RecyclerView.C1747p pVar, boolean z) {
        View view;
        int i;
        C41536l.m120489i(pVar, "lm");
        int i2 = this.f90357f;
        if (i2 != 17) {
            if (i2 == 48) {
                C1824r r = m110597r(pVar);
                C41536l.m120486f(r);
                view = m110601w(pVar, r, 8388611, z);
            } else if (i2 == 80) {
                C1824r r2 = m110597r(pVar);
                C41536l.m120486f(r2);
                view = m110601w(pVar, r2, 8388613, z);
            } else if (i2 == 8388611) {
                C1824r q = m110596q(pVar);
                C41536l.m120486f(q);
                view = m110601w(pVar, q, 8388611, z);
            } else if (i2 != 8388613) {
                view = null;
            } else {
                C1824r q2 = m110596q(pVar);
                C41536l.m120486f(q2);
                view = m110601w(pVar, q2, 8388613, z);
            }
        } else if (pVar.mo5226v()) {
            C1824r q3 = m110596q(pVar);
            C41536l.m120486f(q3);
            view = m110601w(pVar, q3, 17, z);
        } else {
            C1824r r3 = m110597r(pVar);
            C41536l.m120486f(r3);
            view = m110601w(pVar, r3, 17, z);
        }
        if (view != null) {
            RecyclerView recyclerView = this.f90368q;
            C41536l.m120486f(recyclerView);
            i = recyclerView.mo5355k0(view);
        } else {
            i = -1;
        }
        this.f90360i = i;
        return view;
    }

    public C37608o(int i, boolean z, C37610b bVar) {
        this.f90363l = 50.0f;
        this.f90364m = -1;
        this.f90365n = -1.0f;
        this.f90369r = new C37612d(this);
        if (i == 8388611 || i == 8388613 || i == 80 || i == 48 || i == 17) {
            this.f90359h = z;
            this.f90357f = i;
            return;
        }
        throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants".toString());
    }
}
