package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.widget.C0416d1;
import androidx.appcompat.widget.C0420e1;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import p030c.C2213d;
import p030c.C2216g;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0288d extends C0309k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: E */
    private static final int f1531E = C2216g.f6584e;

    /* renamed from: A */
    private C0313m.C0314a f1532A;

    /* renamed from: B */
    ViewTreeObserver f1533B;

    /* renamed from: C */
    private PopupWindow.OnDismissListener f1534C;

    /* renamed from: D */
    boolean f1535D;

    /* renamed from: e */
    private final Context f1536e;

    /* renamed from: f */
    private final int f1537f;

    /* renamed from: g */
    private final int f1538g;

    /* renamed from: h */
    private final int f1539h;

    /* renamed from: i */
    private final boolean f1540i;

    /* renamed from: j */
    final Handler f1541j;

    /* renamed from: k */
    private final List f1542k = new ArrayList();

    /* renamed from: l */
    final List f1543l = new ArrayList();

    /* renamed from: m */
    final ViewTreeObserver.OnGlobalLayoutListener f1544m = new C0289a();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f1545n = new C0290b();

    /* renamed from: o */
    private final C0416d1 f1546o = new C0291c();

    /* renamed from: p */
    private int f1547p = 0;

    /* renamed from: q */
    private int f1548q = 0;

    /* renamed from: r */
    private View f1549r;

    /* renamed from: s */
    View f1550s;

    /* renamed from: t */
    private int f1551t;

    /* renamed from: u */
    private boolean f1552u;

    /* renamed from: v */
    private boolean f1553v;

    /* renamed from: w */
    private int f1554w;

    /* renamed from: x */
    private int f1555x;

    /* renamed from: y */
    private boolean f1556y;

    /* renamed from: z */
    private boolean f1557z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0289a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0289a() {
        }

        public void onGlobalLayout() {
            if (C0288d.this.mo922b() && C0288d.this.f1543l.size() > 0 && !((C0293d) C0288d.this.f1543l.get(0)).f1565a.mo2371B()) {
                View view = C0288d.this.f1550s;
                if (view == null || !view.isShown()) {
                    C0288d.this.dismiss();
                    return;
                }
                for (C0293d dVar : C0288d.this.f1543l) {
                    dVar.f1565a.mo923d();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0290b implements View.OnAttachStateChangeListener {
        C0290b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0288d.this.f1533B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0288d.this.f1533B = view.getViewTreeObserver();
                }
                C0288d dVar = C0288d.this;
                dVar.f1533B.removeGlobalOnLayoutListener(dVar.f1544m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0291c implements C0416d1 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0292a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C0293d f1561d;

            /* renamed from: e */
            final /* synthetic */ MenuItem f1562e;

            /* renamed from: f */
            final /* synthetic */ C0297g f1563f;

            C0292a(C0293d dVar, MenuItem menuItem, C0297g gVar) {
                this.f1561d = dVar;
                this.f1562e = menuItem;
                this.f1563f = gVar;
            }

            public void run() {
                C0293d dVar = this.f1561d;
                if (dVar != null) {
                    C0288d.this.f1535D = true;
                    dVar.f1566b.mo1011e(false);
                    C0288d.this.f1535D = false;
                }
                if (this.f1562e.isEnabled() && this.f1562e.hasSubMenu()) {
                    this.f1563f.mo980N(this.f1562e, 4);
                }
            }
        }

        C0291c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.d$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo943a(androidx.appcompat.view.menu.C0297g r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.C0288d.this
                android.os.Handler r0 = r0.f1541j
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.C0288d.this
                java.util.List r0 = r0.f1543l
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.d r4 = androidx.appcompat.view.menu.C0288d.this
                java.util.List r4 = r4.f1543l
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.d$d r4 = (androidx.appcompat.view.menu.C0288d.C0293d) r4
                androidx.appcompat.view.menu.g r4 = r4.f1566b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.C0288d.this
                java.util.List r0 = r0.f1543l
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.C0288d.this
                java.util.List r0 = r0.f1543l
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.d$d r1 = (androidx.appcompat.view.menu.C0288d.C0293d) r1
            L_0x0041:
                androidx.appcompat.view.menu.d$c$a r0 = new androidx.appcompat.view.menu.d$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.d r7 = androidx.appcompat.view.menu.C0288d.this
                android.os.Handler r7 = r7.f1541j
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0288d.C0291c.mo943a(androidx.appcompat.view.menu.g, android.view.MenuItem):void");
        }

        /* renamed from: n */
        public void mo944n(C0297g gVar, MenuItem menuItem) {
            C0288d.this.f1541j.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0293d {

        /* renamed from: a */
        public final C0420e1 f1565a;

        /* renamed from: b */
        public final C0297g f1566b;

        /* renamed from: c */
        public final int f1567c;

        public C0293d(C0420e1 e1Var, C0297g gVar, int i) {
            this.f1565a = e1Var;
            this.f1566b = gVar;
            this.f1567c = i;
        }

        /* renamed from: a */
        public ListView mo946a() {
            return this.f1565a.mo929o();
        }
    }

    public C0288d(Context context, View view, int i, int i2, boolean z) {
        this.f1536e = context;
        this.f1549r = view;
        this.f1538g = i;
        this.f1539h = i2;
        this.f1540i = z;
        this.f1556y = false;
        this.f1551t = m1021G();
        Resources resources = context.getResources();
        this.f1537f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2213d.f6481b));
        this.f1541j = new Handler();
    }

    /* renamed from: C */
    private C0420e1 m1017C() {
        C0420e1 e1Var = new C0420e1(this.f1536e, (AttributeSet) null, this.f1538g, this.f1539h);
        e1Var.mo2052U(this.f1546o);
        e1Var.mo2380L(this);
        e1Var.mo2379K(this);
        e1Var.mo2372D(this.f1549r);
        e1Var.mo2375G(this.f1548q);
        e1Var.mo2378J(true);
        e1Var.mo2377I(2);
        return e1Var;
    }

    /* renamed from: D */
    private int m1018D(C0297g gVar) {
        int size = this.f1543l.size();
        for (int i = 0; i < size; i++) {
            if (gVar == ((C0293d) this.f1543l.get(i)).f1566b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m1019E(C0297g gVar, C0297g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m1020F(C0293d dVar, C0297g gVar) {
        int i;
        C0296f fVar;
        int firstVisiblePosition;
        MenuItem E = m1019E(dVar.f1566b, gVar);
        if (E == null) {
            return null;
        }
        ListView a = dVar.mo946a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0296f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0296f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    private int m1021G() {
        return ViewCompat.m3541B(this.f1549r) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    private int m1022H(int i) {
        List list = this.f1543l;
        ListView a = ((C0293d) list.get(list.size() - 1)).mo946a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1550s.getWindowVisibleDisplayFrame(rect);
        if (this.f1551t == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: I */
    private void m1023I(C0297g gVar) {
        View view;
        C0293d dVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1536e);
        C0296f fVar = new C0296f(gVar, from, this.f1540i, f1531E);
        if (!mo922b() && this.f1556y) {
            fVar.mo962d(true);
        } else if (mo922b()) {
            fVar.mo962d(C0309k.m1173A(gVar));
        }
        int r = C0309k.m1175r(fVar, (ViewGroup) null, this.f1536e, this.f1537f);
        C0420e1 C = m1017C();
        C.mo1503m(fVar);
        C.mo2374F(r);
        C.mo2375G(this.f1548q);
        if (this.f1543l.size() > 0) {
            List list = this.f1543l;
            dVar = (C0293d) list.get(list.size() - 1);
            view = m1020F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.mo2053V(false);
            C.mo2050S((Object) null);
            int H = m1022H(r);
            if (H == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1551t = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.mo2372D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1549r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1548q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1549r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1548q & 5) != 5) {
                if (z) {
                    r = view.getWidth();
                }
                i3 = i - r;
                C.mo2388f(i3);
                C.mo2382N(true);
                C.mo2389i(i2);
            } else if (!z) {
                r = view.getWidth();
                i3 = i - r;
                C.mo2388f(i3);
                C.mo2382N(true);
                C.mo2389i(i2);
            }
            i3 = i + r;
            C.mo2388f(i3);
            C.mo2382N(true);
            C.mo2389i(i2);
        } else {
            if (this.f1552u) {
                C.mo2388f(this.f1554w);
            }
            if (this.f1553v) {
                C.mo2389i(this.f1555x);
            }
            C.mo2376H(mo1176q());
        }
        this.f1543l.add(new C0293d(C, gVar, this.f1551t));
        C.mo923d();
        ListView o = C.mo929o();
        o.setOnKeyListener(this);
        if (dVar == null && this.f1557z && gVar.mo1043z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C2216g.f6591l, o, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo1043z());
            o.addHeaderView(frameLayout, (Object) null, false);
            C.mo923d();
        }
    }

    /* renamed from: b */
    public boolean mo922b() {
        return this.f1543l.size() > 0 && ((C0293d) this.f1543l.get(0)).f1565a.mo922b();
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
        int D = m1018D(gVar);
        if (D >= 0) {
            int i = D + 1;
            if (i < this.f1543l.size()) {
                ((C0293d) this.f1543l.get(i)).f1566b.mo1011e(false);
            }
            C0293d dVar = (C0293d) this.f1543l.remove(D);
            dVar.f1566b.mo982Q(this);
            if (this.f1535D) {
                dVar.f1565a.mo2051T((Object) null);
                dVar.f1565a.mo2373E(0);
            }
            dVar.f1565a.dismiss();
            int size = this.f1543l.size();
            if (size > 0) {
                this.f1551t = ((C0293d) this.f1543l.get(size - 1)).f1567c;
            } else {
                this.f1551t = m1021G();
            }
            if (size == 0) {
                dismiss();
                C0313m.C0314a aVar = this.f1532A;
                if (aVar != null) {
                    aVar.mo519c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1533B;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1533B.removeGlobalOnLayoutListener(this.f1544m);
                    }
                    this.f1533B = null;
                }
                this.f1550s.removeOnAttachStateChangeListener(this.f1545n);
                this.f1534C.onDismiss();
            } else if (z) {
                ((C0293d) this.f1543l.get(0)).f1566b.mo1011e(false);
            }
        }
    }

    /* renamed from: d */
    public void mo923d() {
        boolean z;
        if (!mo922b()) {
            for (C0297g I : this.f1542k) {
                m1023I(I);
            }
            this.f1542k.clear();
            View view = this.f1549r;
            this.f1550s = view;
            if (view != null) {
                if (this.f1533B == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1533B = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1544m);
                }
                this.f1550s.addOnAttachStateChangeListener(this.f1545n);
            }
        }
    }

    public void dismiss() {
        int size = this.f1543l.size();
        if (size > 0) {
            C0293d[] dVarArr = (C0293d[]) this.f1543l.toArray(new C0293d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0293d dVar = dVarArr[i];
                if (dVar.f1565a.mo922b()) {
                    dVar.f1565a.dismiss();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo905f(C0313m.C0314a aVar) {
        this.f1532A = aVar;
    }

    /* renamed from: g */
    public void mo925g(Parcelable parcelable) {
    }

    /* renamed from: h */
    public boolean mo906h(C0322r rVar) {
        for (C0293d dVar : this.f1543l) {
            if (rVar == dVar.f1566b) {
                dVar.mo946a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo928n(rVar);
        C0313m.C0314a aVar = this.f1532A;
        if (aVar != null) {
            aVar.mo520d(rVar);
        }
        return true;
    }

    /* renamed from: i */
    public Parcelable mo926i() {
        return null;
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        for (C0293d a : this.f1543l) {
            C0309k.m1174B(a.mo946a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo927k() {
        return false;
    }

    /* renamed from: n */
    public void mo928n(C0297g gVar) {
        gVar.mo1004c(this, this.f1536e);
        if (mo922b()) {
            m1023I(gVar);
        } else {
            this.f1542k.add(gVar);
        }
    }

    /* renamed from: o */
    public ListView mo929o() {
        if (this.f1543l.isEmpty()) {
            return null;
        }
        List list = this.f1543l;
        return ((C0293d) list.get(list.size() - 1)).mo946a();
    }

    public void onDismiss() {
        C0293d dVar;
        int size = this.f1543l.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0293d) this.f1543l.get(i);
            if (!dVar.f1565a.mo922b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1566b.mo1011e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo932p() {
        return false;
    }

    /* renamed from: s */
    public void mo933s(View view) {
        if (this.f1549r != view) {
            this.f1549r = view;
            this.f1548q = C1266x.m4406b(this.f1547p, ViewCompat.m3541B(view));
        }
    }

    /* renamed from: u */
    public void mo934u(boolean z) {
        this.f1556y = z;
    }

    /* renamed from: v */
    public void mo935v(int i) {
        if (this.f1547p != i) {
            this.f1547p = i;
            this.f1548q = C1266x.m4406b(i, ViewCompat.m3541B(this.f1549r));
        }
    }

    /* renamed from: w */
    public void mo936w(int i) {
        this.f1552u = true;
        this.f1554w = i;
    }

    /* renamed from: x */
    public void mo937x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1534C = onDismissListener;
    }

    /* renamed from: y */
    public void mo938y(boolean z) {
        this.f1557z = z;
    }

    /* renamed from: z */
    public void mo939z(int i) {
        this.f1553v = true;
        this.f1555x = i;
    }
}
