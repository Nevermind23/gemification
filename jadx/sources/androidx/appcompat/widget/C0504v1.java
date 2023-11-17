package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0285a;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0313m;
import androidx.core.view.C1188k3;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.github.mikephil.charting.utils.Utils;
import p030c.C2210a;
import p030c.C2214e;
import p030c.C2215f;
import p030c.C2217h;
import p030c.C2219j;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.v1 */
public class C0504v1 implements C0469n0 {

    /* renamed from: a */
    Toolbar f2244a;

    /* renamed from: b */
    private int f2245b;

    /* renamed from: c */
    private View f2246c;

    /* renamed from: d */
    private View f2247d;

    /* renamed from: e */
    private Drawable f2248e;

    /* renamed from: f */
    private Drawable f2249f;

    /* renamed from: g */
    private Drawable f2250g;

    /* renamed from: h */
    private boolean f2251h;

    /* renamed from: i */
    CharSequence f2252i;

    /* renamed from: j */
    private CharSequence f2253j;

    /* renamed from: k */
    private CharSequence f2254k;

    /* renamed from: l */
    Window.Callback f2255l;

    /* renamed from: m */
    boolean f2256m;

    /* renamed from: n */
    private ActionMenuPresenter f2257n;

    /* renamed from: o */
    private int f2258o;

    /* renamed from: p */
    private int f2259p;

    /* renamed from: q */
    private Drawable f2260q;

    /* renamed from: androidx.appcompat.widget.v1$a */
    class C0505a implements View.OnClickListener {

        /* renamed from: d */
        final C0285a f2261d;

        C0505a() {
            this.f2261d = new C0285a(C0504v1.this.f2244a.getContext(), 0, 16908332, 0, 0, C0504v1.this.f2252i);
        }

        public void onClick(View view) {
            C0504v1 v1Var = C0504v1.this;
            Window.Callback callback = v1Var.f2255l;
            if (callback != null && v1Var.f2256m) {
                callback.onMenuItemSelected(0, this.f2261d);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v1$b */
    class C0506b extends C1188k3 {

        /* renamed from: a */
        private boolean f2263a = false;

        /* renamed from: b */
        final /* synthetic */ int f2264b;

        C0506b(int i) {
            this.f2264b = i;
        }

        /* renamed from: a */
        public void mo1913a(View view) {
            this.f2263a = true;
        }

        /* renamed from: b */
        public void mo513b(View view) {
            if (!this.f2263a) {
                C0504v1.this.f2244a.setVisibility(this.f2264b);
            }
        }

        /* renamed from: c */
        public void mo514c(View view) {
            C0504v1.this.f2244a.setVisibility(0);
        }
    }

    public C0504v1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C2217h.f6600a, C2214e.f6525n);
    }

    /* renamed from: B */
    private int m2007B() {
        if (this.f2244a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2260q = this.f2244a.getNavigationIcon();
        return 15;
    }

    /* renamed from: G */
    private void m2008G(CharSequence charSequence) {
        this.f2252i = charSequence;
        if ((this.f2245b & 8) != 0) {
            this.f2244a.setTitle(charSequence);
            if (this.f2251h) {
                ViewCompat.m3625u0(this.f2244a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: H */
    private void m2009H() {
        if ((this.f2245b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2254k)) {
            this.f2244a.setNavigationContentDescription(this.f2259p);
        } else {
            this.f2244a.setNavigationContentDescription(this.f2254k);
        }
    }

    /* renamed from: I */
    private void m2010I() {
        if ((this.f2245b & 4) != 0) {
            Toolbar toolbar = this.f2244a;
            Drawable drawable = this.f2250g;
            if (drawable == null) {
                drawable = this.f2260q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f2244a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: J */
    private void m2011J() {
        Drawable drawable;
        int i = this.f2245b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2249f;
            if (drawable == null) {
                drawable = this.f2248e;
            }
        } else {
            drawable = this.f2248e;
        }
        this.f2244a.setLogo(drawable);
    }

    /* renamed from: A */
    public void mo2232A(Drawable drawable) {
        this.f2250g = drawable;
        m2010I();
    }

    /* renamed from: C */
    public void mo2353C(View view) {
        View view2 = this.f2247d;
        if (!(view2 == null || (this.f2245b & 16) == 0)) {
            this.f2244a.removeView(view2);
        }
        this.f2247d = view;
        if (view != null && (this.f2245b & 16) != 0) {
            this.f2244a.addView(view);
        }
    }

    /* renamed from: D */
    public void mo2354D(int i) {
        if (i != this.f2259p) {
            this.f2259p = i;
            if (TextUtils.isEmpty(this.f2244a.getNavigationContentDescription())) {
                mo2251q(this.f2259p);
            }
        }
    }

    /* renamed from: E */
    public void mo2355E(Drawable drawable) {
        this.f2249f = drawable;
        m2011J();
    }

    /* renamed from: F */
    public void mo2356F(CharSequence charSequence) {
        this.f2253j = charSequence;
        if ((this.f2245b & 8) != 0) {
            this.f2244a.setSubtitle(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo2233a() {
        return this.f2244a.mo1803d();
    }

    /* renamed from: b */
    public Context mo2234b() {
        return this.f2244a.getContext();
    }

    /* renamed from: c */
    public boolean mo2235c() {
        return this.f2244a.mo1886w();
    }

    public void collapseActionView() {
        this.f2244a.mo1804e();
    }

    /* renamed from: d */
    public boolean mo2237d() {
        return this.f2244a.mo1799Q();
    }

    /* renamed from: e */
    public void mo2238e(Menu menu, C0313m.C0314a aVar) {
        if (this.f2257n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f2244a.getContext());
            this.f2257n = actionMenuPresenter;
            actionMenuPresenter.mo915s(C2215f.f6560g);
        }
        this.f2257n.mo905f(aVar);
        this.f2244a.mo1795K((C0297g) menu, this.f2257n);
    }

    /* renamed from: f */
    public boolean mo2239f() {
        return this.f2244a.mo1792B();
    }

    /* renamed from: g */
    public void mo2240g() {
        this.f2256m = true;
    }

    public CharSequence getTitle() {
        return this.f2244a.getTitle();
    }

    /* renamed from: h */
    public boolean mo2242h() {
        return this.f2244a.mo1791A();
    }

    /* renamed from: i */
    public boolean mo2243i() {
        return this.f2244a.mo1885v();
    }

    /* renamed from: j */
    public void mo2244j(int i) {
        View view;
        int i2 = this.f2245b ^ i;
        this.f2245b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2009H();
                }
                m2010I();
            }
            if ((i2 & 3) != 0) {
                m2011J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2244a.setTitle(this.f2252i);
                    this.f2244a.setSubtitle(this.f2253j);
                } else {
                    this.f2244a.setTitle((CharSequence) null);
                    this.f2244a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f2247d) != null) {
                if ((i & 16) != 0) {
                    this.f2244a.addView(view);
                } else {
                    this.f2244a.removeView(view);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo2245k(CharSequence charSequence) {
        this.f2254k = charSequence;
        m2009H();
    }

    /* renamed from: l */
    public Menu mo2246l() {
        return this.f2244a.getMenu();
    }

    /* renamed from: m */
    public int mo2247m() {
        return this.f2258o;
    }

    /* renamed from: n */
    public ViewPropertyAnimatorCompat mo2248n(int i, long j) {
        float f;
        ViewPropertyAnimatorCompat e = ViewCompat.m3592e(this.f2244a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return e.mo3469b(f).mo3472f(j).mo3474h(new C0506b(i));
    }

    /* renamed from: o */
    public ViewGroup mo2249o() {
        return this.f2244a;
    }

    /* renamed from: p */
    public void mo2250p(boolean z) {
    }

    /* renamed from: q */
    public void mo2251q(int i) {
        mo2245k(i == 0 ? null : mo2234b().getString(i));
    }

    /* renamed from: r */
    public void mo2252r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: s */
    public void mo2253s(boolean z) {
        this.f2244a.setCollapsible(z);
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C5769a.m23210b(mo2234b(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2251h = true;
        m2008G(charSequence);
    }

    public void setVisibility(int i) {
        this.f2244a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f2255l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2251h) {
            m2008G(charSequence);
        }
    }

    /* renamed from: t */
    public void mo2260t() {
        this.f2244a.mo1805f();
    }

    /* renamed from: u */
    public void mo2261u(C0460k1 k1Var) {
        Toolbar toolbar;
        View view = this.f2246c;
        if (view != null && view.getParent() == (toolbar = this.f2244a)) {
            toolbar.removeView(this.f2246c);
        }
        this.f2246c = k1Var;
    }

    /* renamed from: v */
    public void mo2262v(int i) {
        mo2355E(i != 0 ? C5769a.m23210b(mo2234b(), i) : null);
    }

    /* renamed from: w */
    public void mo2263w(int i) {
        mo2232A(i != 0 ? C5769a.m23210b(mo2234b(), i) : null);
    }

    /* renamed from: x */
    public void mo2264x(C0313m.C0314a aVar, C0297g.C0298a aVar2) {
        this.f2244a.mo1796L(aVar, aVar2);
    }

    /* renamed from: y */
    public int mo2265y() {
        return this.f2245b;
    }

    /* renamed from: z */
    public void mo2266z() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public C0504v1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2258o = 0;
        this.f2259p = 0;
        this.f2244a = toolbar;
        this.f2252i = toolbar.getTitle();
        this.f2253j = toolbar.getSubtitle();
        this.f2251h = this.f2252i != null;
        this.f2250g = toolbar.getNavigationIcon();
        C0483r1 v = C0483r1.m1946v(toolbar.getContext(), (AttributeSet) null, C2219j.f6750a, C2210a.f6447c, 0);
        this.f2260q = v.mo2320g(C2219j.f6805l);
        if (z) {
            CharSequence p = v.mo2329p(C2219j.f6835r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo2329p(C2219j.f6825p);
            if (!TextUtils.isEmpty(p2)) {
                mo2356F(p2);
            }
            Drawable g = v.mo2320g(C2219j.f6815n);
            if (g != null) {
                mo2355E(g);
            }
            Drawable g2 = v.mo2320g(C2219j.f6810m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f2250g == null && (drawable = this.f2260q) != null) {
                mo2232A(drawable);
            }
            mo2244j(v.mo2324k(C2219j.f6785h, 0));
            int n = v.mo2327n(C2219j.f6780g, 0);
            if (n != 0) {
                mo2353C(LayoutInflater.from(this.f2244a.getContext()).inflate(n, this.f2244a, false));
                mo2244j(this.f2245b | 16);
            }
            int m = v.mo2326m(C2219j.f6795j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2244a.getLayoutParams();
                layoutParams.height = m;
                this.f2244a.setLayoutParams(layoutParams);
            }
            int e = v.mo2318e(C2219j.f6775f, -1);
            int e2 = v.mo2318e(C2219j.f6770e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f2244a.mo1794J(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo2327n(C2219j.f6840s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f2244a;
                toolbar2.mo1798N(toolbar2.getContext(), n2);
            }
            int n3 = v.mo2327n(C2219j.f6830q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f2244a;
                toolbar3.mo1797M(toolbar3.getContext(), n3);
            }
            int n4 = v.mo2327n(C2219j.f6820o, 0);
            if (n4 != 0) {
                this.f2244a.setPopupTheme(n4);
            }
        } else {
            this.f2245b = m2007B();
        }
        v.mo2333w();
        mo2354D(i);
        this.f2254k = this.f2244a.getNavigationContentDescription();
        this.f2244a.setNavigationOnClickListener(new C0505a());
    }

    public void setIcon(Drawable drawable) {
        this.f2248e = drawable;
        m2011J();
    }
}
