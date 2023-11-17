package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.widget.C0420e1;
import androidx.core.view.ViewCompat;
import p030c.C2213d;
import p030c.C2216g;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0319q extends C0309k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: y */
    private static final int f1675y = C2216g.f6592m;

    /* renamed from: e */
    private final Context f1676e;

    /* renamed from: f */
    private final C0297g f1677f;

    /* renamed from: g */
    private final C0296f f1678g;

    /* renamed from: h */
    private final boolean f1679h;

    /* renamed from: i */
    private final int f1680i;

    /* renamed from: j */
    private final int f1681j;

    /* renamed from: k */
    private final int f1682k;

    /* renamed from: l */
    final C0420e1 f1683l;

    /* renamed from: m */
    final ViewTreeObserver.OnGlobalLayoutListener f1684m = new C0320a();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f1685n = new C0321b();

    /* renamed from: o */
    private PopupWindow.OnDismissListener f1686o;

    /* renamed from: p */
    private View f1687p;

    /* renamed from: q */
    View f1688q;

    /* renamed from: r */
    private C0313m.C0314a f1689r;

    /* renamed from: s */
    ViewTreeObserver f1690s;

    /* renamed from: t */
    private boolean f1691t;

    /* renamed from: u */
    private boolean f1692u;

    /* renamed from: v */
    private int f1693v;

    /* renamed from: w */
    private int f1694w = 0;

    /* renamed from: x */
    private boolean f1695x;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0320a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0320a() {
        }

        public void onGlobalLayout() {
            if (C0319q.this.mo922b() && !C0319q.this.f1683l.mo2371B()) {
                View view = C0319q.this.f1688q;
                if (view == null || !view.isShown()) {
                    C0319q.this.dismiss();
                } else {
                    C0319q.this.f1683l.mo923d();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0321b implements View.OnAttachStateChangeListener {
        C0321b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0319q.this.f1690s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0319q.this.f1690s = view.getViewTreeObserver();
                }
                C0319q qVar = C0319q.this;
                qVar.f1690s.removeGlobalOnLayoutListener(qVar.f1684m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0319q(Context context, C0297g gVar, View view, int i, int i2, boolean z) {
        this.f1676e = context;
        this.f1677f = gVar;
        this.f1679h = z;
        this.f1678g = new C0296f(gVar, LayoutInflater.from(context), z, f1675y);
        this.f1681j = i;
        this.f1682k = i2;
        Resources resources = context.getResources();
        this.f1680i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2213d.f6481b));
        this.f1687p = view;
        this.f1683l = new C0420e1(context, (AttributeSet) null, i, i2);
        gVar.mo1004c(this, context);
    }

    /* renamed from: C */
    private boolean m1225C() {
        View view;
        boolean z;
        if (mo922b()) {
            return true;
        }
        if (this.f1691t || (view = this.f1687p) == null) {
            return false;
        }
        this.f1688q = view;
        this.f1683l.mo2379K(this);
        this.f1683l.mo2380L(this);
        this.f1683l.mo2378J(true);
        View view2 = this.f1688q;
        if (this.f1690s == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1690s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1684m);
        }
        view2.addOnAttachStateChangeListener(this.f1685n);
        this.f1683l.mo2372D(view2);
        this.f1683l.mo2375G(this.f1694w);
        if (!this.f1692u) {
            this.f1693v = C0309k.m1175r(this.f1678g, (ViewGroup) null, this.f1676e, this.f1680i);
            this.f1692u = true;
        }
        this.f1683l.mo2374F(this.f1693v);
        this.f1683l.mo2377I(2);
        this.f1683l.mo2376H(mo1176q());
        this.f1683l.mo923d();
        ListView o = this.f1683l.mo929o();
        o.setOnKeyListener(this);
        if (this.f1695x && this.f1677f.mo1043z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1676e).inflate(C2216g.f6591l, o, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1677f.mo1043z());
            }
            frameLayout.setEnabled(false);
            o.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1683l.mo1503m(this.f1678g);
        this.f1683l.mo923d();
        return true;
    }

    /* renamed from: b */
    public boolean mo922b() {
        return !this.f1691t && this.f1683l.mo922b();
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
        if (gVar == this.f1677f) {
            dismiss();
            C0313m.C0314a aVar = this.f1689r;
            if (aVar != null) {
                aVar.mo519c(gVar, z);
            }
        }
    }

    /* renamed from: d */
    public void mo923d() {
        if (!m1225C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void dismiss() {
        if (mo922b()) {
            this.f1683l.dismiss();
        }
    }

    /* renamed from: f */
    public void mo905f(C0313m.C0314a aVar) {
        this.f1689r = aVar;
    }

    /* renamed from: g */
    public void mo925g(Parcelable parcelable) {
    }

    /* renamed from: h */
    public boolean mo906h(C0322r rVar) {
        if (rVar.hasVisibleItems()) {
            C0310l lVar = new C0310l(this.f1676e, rVar, this.f1688q, this.f1679h, this.f1681j, this.f1682k);
            lVar.mo1186j(this.f1689r);
            lVar.mo1183g(C0309k.m1173A(rVar));
            lVar.mo1185i(this.f1686o);
            this.f1686o = null;
            this.f1677f.mo1011e(false);
            int e = this.f1683l.mo2387e();
            int l = this.f1683l.mo2390l();
            if ((Gravity.getAbsoluteGravity(this.f1694w, ViewCompat.m3541B(this.f1687p)) & 7) == 5) {
                e += this.f1687p.getWidth();
            }
            if (lVar.mo1189n(e, l)) {
                C0313m.C0314a aVar = this.f1689r;
                if (aVar == null) {
                    return true;
                }
                aVar.mo520d(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public Parcelable mo926i() {
        return null;
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        this.f1692u = false;
        C0296f fVar = this.f1678g;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo927k() {
        return false;
    }

    /* renamed from: n */
    public void mo928n(C0297g gVar) {
    }

    /* renamed from: o */
    public ListView mo929o() {
        return this.f1683l.mo929o();
    }

    public void onDismiss() {
        this.f1691t = true;
        this.f1677f.close();
        ViewTreeObserver viewTreeObserver = this.f1690s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1690s = this.f1688q.getViewTreeObserver();
            }
            this.f1690s.removeGlobalOnLayoutListener(this.f1684m);
            this.f1690s = null;
        }
        this.f1688q.removeOnAttachStateChangeListener(this.f1685n);
        PopupWindow.OnDismissListener onDismissListener = this.f1686o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: s */
    public void mo933s(View view) {
        this.f1687p = view;
    }

    /* renamed from: u */
    public void mo934u(boolean z) {
        this.f1678g.mo962d(z);
    }

    /* renamed from: v */
    public void mo935v(int i) {
        this.f1694w = i;
    }

    /* renamed from: w */
    public void mo936w(int i) {
        this.f1683l.mo2388f(i);
    }

    /* renamed from: x */
    public void mo937x(PopupWindow.OnDismissListener onDismissListener) {
        this.f1686o = onDismissListener;
    }

    /* renamed from: y */
    public void mo938y(boolean z) {
        this.f1695x = z;
    }

    /* renamed from: z */
    public void mo939z(int i) {
        this.f1683l.mo2389i(i);
    }
}
