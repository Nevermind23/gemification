package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.C0263a;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.view.C0272g;
import androidx.appcompat.view.C0275h;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0460k1;
import androidx.appcompat.widget.C0469n0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1182j3;
import androidx.core.view.C1188k3;
import androidx.core.view.C1194l3;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p030c.C2210a;
import p030c.C2215f;
import p030c.C2219j;

/* renamed from: androidx.appcompat.app.g0 */
public class C0233g0 extends C0209a implements ActionBarOverlayLayout.C0328d {

    /* renamed from: D */
    private static final Interpolator f1323D = new AccelerateInterpolator();

    /* renamed from: E */
    private static final Interpolator f1324E = new DecelerateInterpolator();

    /* renamed from: A */
    final C1182j3 f1325A = new C0234a();

    /* renamed from: B */
    final C1182j3 f1326B = new C0235b();

    /* renamed from: C */
    final C1194l3 f1327C = new C0236c();

    /* renamed from: a */
    Context f1328a;

    /* renamed from: b */
    private Context f1329b;

    /* renamed from: c */
    private Activity f1330c;

    /* renamed from: d */
    ActionBarOverlayLayout f1331d;

    /* renamed from: e */
    ActionBarContainer f1332e;

    /* renamed from: f */
    C0469n0 f1333f;

    /* renamed from: g */
    ActionBarContextView f1334g;

    /* renamed from: h */
    View f1335h;

    /* renamed from: i */
    private ArrayList f1336i = new ArrayList();

    /* renamed from: j */
    private int f1337j = -1;

    /* renamed from: k */
    private boolean f1338k;

    /* renamed from: l */
    C0237d f1339l;

    /* renamed from: m */
    C0264b f1340m;

    /* renamed from: n */
    C0264b.C0265a f1341n;

    /* renamed from: o */
    private boolean f1342o;

    /* renamed from: p */
    private ArrayList f1343p = new ArrayList();

    /* renamed from: q */
    private boolean f1344q;

    /* renamed from: r */
    private int f1345r = 0;

    /* renamed from: s */
    boolean f1346s = true;

    /* renamed from: t */
    boolean f1347t;

    /* renamed from: u */
    boolean f1348u;

    /* renamed from: v */
    private boolean f1349v;

    /* renamed from: w */
    private boolean f1350w = true;

    /* renamed from: x */
    C0275h f1351x;

    /* renamed from: y */
    private boolean f1352y;

    /* renamed from: z */
    boolean f1353z;

    /* renamed from: androidx.appcompat.app.g0$a */
    class C0234a extends C1188k3 {
        C0234a() {
        }

        /* renamed from: b */
        public void mo513b(View view) {
            View view2;
            C0233g0 g0Var = C0233g0.this;
            if (g0Var.f1346s && (view2 = g0Var.f1335h) != null) {
                view2.setTranslationY(Utils.FLOAT_EPSILON);
                C0233g0.this.f1332e.setTranslationY(Utils.FLOAT_EPSILON);
            }
            C0233g0.this.f1332e.setVisibility(8);
            C0233g0.this.f1332e.setTransitioning(false);
            C0233g0 g0Var2 = C0233g0.this;
            g0Var2.f1351x = null;
            g0Var2.mo669F();
            ActionBarOverlayLayout actionBarOverlayLayout = C0233g0.this.f1331d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.m3613o0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g0$b */
    class C0235b extends C1188k3 {
        C0235b() {
        }

        /* renamed from: b */
        public void mo513b(View view) {
            C0233g0 g0Var = C0233g0.this;
            g0Var.f1351x = null;
            g0Var.f1332e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.g0$c */
    class C0236c implements C1194l3 {
        C0236c() {
        }

        /* renamed from: a */
        public void mo683a(View view) {
            ((View) C0233g0.this.f1332e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.g0$d */
    public class C0237d extends C0264b implements C0297g.C0298a {

        /* renamed from: f */
        private final Context f1357f;

        /* renamed from: g */
        private final C0297g f1358g;

        /* renamed from: h */
        private C0264b.C0265a f1359h;

        /* renamed from: i */
        private WeakReference f1360i;

        public C0237d(Context context, C0264b.C0265a aVar) {
            this.f1357f = context;
            this.f1359h = aVar;
            C0297g W = new C0297g(context).mo988W(1);
            this.f1358g = W;
            W.mo987V(this);
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            C0264b.C0265a aVar = this.f1359h;
            if (aVar != null) {
                return aVar.mo523c(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
            if (this.f1359h != null) {
                mo690k();
                C0233g0.this.f1334g.mo1258l();
            }
        }

        /* renamed from: c */
        public void mo684c() {
            C0233g0 g0Var = C0233g0.this;
            if (g0Var.f1339l == this) {
                if (!C0233g0.m725E(g0Var.f1347t, g0Var.f1348u, false)) {
                    C0233g0 g0Var2 = C0233g0.this;
                    g0Var2.f1340m = this;
                    g0Var2.f1341n = this.f1359h;
                } else {
                    this.f1359h.mo521a(this);
                }
                this.f1359h = null;
                C0233g0.this.mo668D(false);
                C0233g0.this.f1334g.mo1248g();
                C0233g0 g0Var3 = C0233g0.this;
                g0Var3.f1331d.setHideOnContentScrollEnabled(g0Var3.f1353z);
                C0233g0.this.f1339l = null;
            }
        }

        /* renamed from: d */
        public View mo685d() {
            WeakReference weakReference = this.f1360i;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo686e() {
            return this.f1358g;
        }

        /* renamed from: f */
        public MenuInflater mo687f() {
            return new C0272g(this.f1357f);
        }

        /* renamed from: g */
        public CharSequence mo688g() {
            return C0233g0.this.f1334g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo689i() {
            return C0233g0.this.f1334g.getTitle();
        }

        /* renamed from: k */
        public void mo690k() {
            if (C0233g0.this.f1339l == this) {
                this.f1358g.mo1018h0();
                try {
                    this.f1359h.mo524d(this, this.f1358g);
                } finally {
                    this.f1358g.mo1015g0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo691l() {
            return C0233g0.this.f1334g.mo1256j();
        }

        /* renamed from: m */
        public void mo692m(View view) {
            C0233g0.this.f1334g.setCustomView(view);
            this.f1360i = new WeakReference(view);
        }

        /* renamed from: n */
        public void mo693n(int i) {
            mo694o(C0233g0.this.f1328a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo694o(CharSequence charSequence) {
            C0233g0.this.f1334g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo695q(int i) {
            mo696r(C0233g0.this.f1328a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo696r(CharSequence charSequence) {
            C0233g0.this.f1334g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo697s(boolean z) {
            super.mo697s(z);
            C0233g0.this.f1334g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo698t() {
            this.f1358g.mo1018h0();
            try {
                return this.f1359h.mo522b(this, this.f1358g);
            } finally {
                this.f1358g.mo1015g0();
            }
        }
    }

    public C0233g0(Activity activity, boolean z) {
        this.f1330c = activity;
        View decorView = activity.getWindow().getDecorView();
        m728L(decorView);
        if (!z) {
            this.f1335h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: E */
    static boolean m725E(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: I */
    private C0469n0 m726I(View view) {
        String str;
        if (view instanceof C0469n0) {
            return (C0469n0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: K */
    private void m727K() {
        if (this.f1349v) {
            this.f1349v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1331d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m732T(false);
        }
    }

    /* renamed from: L */
    private void m728L(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2215f.f6569p);
        this.f1331d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1333f = m726I(view.findViewById(C2215f.f6554a));
        this.f1334g = (ActionBarContextView) view.findViewById(C2215f.f6559f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2215f.f6556c);
        this.f1332e = actionBarContainer;
        C0469n0 n0Var = this.f1333f;
        if (n0Var == null || this.f1334g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1328a = n0Var.mo2234b();
        if ((this.f1333f.mo2265y() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1338k = true;
        }
        C0263a b = C0263a.m881b(this.f1328a);
        if (b.mo733a() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo676Q(z2);
        m729O(b.mo736e());
        TypedArray obtainStyledAttributes = this.f1328a.obtainStyledAttributes((AttributeSet) null, C2219j.f6750a, C2210a.f6447c, 0);
        if (obtainStyledAttributes.getBoolean(C2219j.f6800k, false)) {
            mo675P(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2219j.f6790i, 0);
        if (dimensionPixelSize != 0) {
            mo674N((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m729O(boolean z) {
        boolean z2;
        boolean z3;
        this.f1344q = z;
        if (!z) {
            this.f1333f.mo2261u((C0460k1) null);
            this.f1332e.setTabContainer((C0460k1) null);
        } else {
            this.f1332e.setTabContainer((C0460k1) null);
            this.f1333f.mo2261u((C0460k1) null);
        }
        boolean z4 = true;
        if (mo672J() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0469n0 n0Var = this.f1333f;
        if (this.f1344q || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        n0Var.mo2253s(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1331d;
        if (this.f1344q || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: R */
    private boolean m730R() {
        return ViewCompat.m3579V(this.f1332e);
    }

    /* renamed from: S */
    private void m731S() {
        if (!this.f1349v) {
            this.f1349v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1331d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m732T(false);
        }
    }

    /* renamed from: T */
    private void m732T(boolean z) {
        if (m725E(this.f1347t, this.f1348u, this.f1349v)) {
            if (!this.f1350w) {
                this.f1350w = true;
                mo671H(z);
            }
        } else if (this.f1350w) {
            this.f1350w = false;
            mo670G(z);
        }
    }

    /* renamed from: A */
    public void mo550A(CharSequence charSequence) {
        this.f1333f.setTitle(charSequence);
    }

    /* renamed from: B */
    public void mo551B(CharSequence charSequence) {
        this.f1333f.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    public C0264b mo552C(C0264b.C0265a aVar) {
        C0237d dVar = this.f1339l;
        if (dVar != null) {
            dVar.mo684c();
        }
        this.f1331d.setHideOnContentScrollEnabled(false);
        this.f1334g.mo1257k();
        C0237d dVar2 = new C0237d(this.f1334g.getContext(), aVar);
        if (!dVar2.mo698t()) {
            return null;
        }
        this.f1339l = dVar2;
        dVar2.mo690k();
        this.f1334g.mo1255h(dVar2);
        mo668D(true);
        return dVar2;
    }

    /* renamed from: D */
    public void mo668D(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            m731S();
        } else {
            m727K();
        }
        if (m730R()) {
            if (z) {
                viewPropertyAnimatorCompat = this.f1333f.mo2248n(4, 100);
                viewPropertyAnimatorCompat2 = this.f1334g.mo1247f(0, 200);
            } else {
                viewPropertyAnimatorCompat2 = this.f1333f.mo2248n(0, 200);
                viewPropertyAnimatorCompat = this.f1334g.mo1247f(8, 100);
            }
            C0275h hVar = new C0275h();
            hVar.mo782d(viewPropertyAnimatorCompat, viewPropertyAnimatorCompat2);
            hVar.mo786h();
        } else if (z) {
            this.f1333f.setVisibility(4);
            this.f1334g.setVisibility(0);
        } else {
            this.f1333f.setVisibility(0);
            this.f1334g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo669F() {
        C0264b.C0265a aVar = this.f1341n;
        if (aVar != null) {
            aVar.mo521a(this.f1340m);
            this.f1340m = null;
            this.f1341n = null;
        }
    }

    /* renamed from: G */
    public void mo670G(boolean z) {
        View view;
        C0275h hVar = this.f1351x;
        if (hVar != null) {
            hVar.mo779a();
        }
        if (this.f1345r != 0 || (!this.f1352y && !z)) {
            this.f1325A.mo513b((View) null);
            return;
        }
        this.f1332e.setAlpha(1.0f);
        this.f1332e.setTransitioning(true);
        C0275h hVar2 = new C0275h();
        float f = (float) (-this.f1332e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1332e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        ViewPropertyAnimatorCompat m = ViewCompat.m3592e(this.f1332e).mo3478m(f);
        m.mo3476k(this.f1327C);
        hVar2.mo781c(m);
        if (this.f1346s && (view = this.f1335h) != null) {
            hVar2.mo781c(ViewCompat.m3592e(view).mo3478m(f));
        }
        hVar2.mo784f(f1323D);
        hVar2.mo783e(250);
        hVar2.mo785g(this.f1325A);
        this.f1351x = hVar2;
        hVar2.mo786h();
    }

    /* renamed from: H */
    public void mo671H(boolean z) {
        View view;
        View view2;
        C0275h hVar = this.f1351x;
        if (hVar != null) {
            hVar.mo779a();
        }
        this.f1332e.setVisibility(0);
        if (this.f1345r != 0 || (!this.f1352y && !z)) {
            this.f1332e.setAlpha(1.0f);
            this.f1332e.setTranslationY(Utils.FLOAT_EPSILON);
            if (this.f1346s && (view = this.f1335h) != null) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
            }
            this.f1326B.mo513b((View) null);
        } else {
            this.f1332e.setTranslationY(Utils.FLOAT_EPSILON);
            float f = (float) (-this.f1332e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1332e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1332e.setTranslationY(f);
            C0275h hVar2 = new C0275h();
            ViewPropertyAnimatorCompat m = ViewCompat.m3592e(this.f1332e).mo3478m(Utils.FLOAT_EPSILON);
            m.mo3476k(this.f1327C);
            hVar2.mo781c(m);
            if (this.f1346s && (view2 = this.f1335h) != null) {
                view2.setTranslationY(f);
                hVar2.mo781c(ViewCompat.m3592e(this.f1335h).mo3478m(Utils.FLOAT_EPSILON));
            }
            hVar2.mo784f(f1324E);
            hVar2.mo783e(250);
            hVar2.mo785g(this.f1326B);
            this.f1351x = hVar2;
            hVar2.mo786h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1331d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m3613o0(actionBarOverlayLayout);
        }
    }

    /* renamed from: J */
    public int mo672J() {
        return this.f1333f.mo2247m();
    }

    /* renamed from: M */
    public void mo673M(int i, int i2) {
        int y = this.f1333f.mo2265y();
        if ((i2 & 4) != 0) {
            this.f1338k = true;
        }
        this.f1333f.mo2244j((i & i2) | ((~i2) & y));
    }

    /* renamed from: N */
    public void mo674N(float f) {
        ViewCompat.m3635z0(this.f1332e, f);
    }

    /* renamed from: P */
    public void mo675P(boolean z) {
        if (!z || this.f1331d.mo1313q()) {
            this.f1353z = z;
            this.f1331d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: Q */
    public void mo676Q(boolean z) {
        this.f1333f.mo2250p(z);
    }

    /* renamed from: a */
    public void mo677a() {
        if (this.f1348u) {
            this.f1348u = false;
            m732T(true);
        }
    }

    /* renamed from: b */
    public void mo678b(int i) {
        this.f1345r = i;
    }

    /* renamed from: c */
    public void mo679c() {
    }

    /* renamed from: d */
    public void mo680d(boolean z) {
        this.f1346s = z;
    }

    /* renamed from: e */
    public void mo681e() {
        if (!this.f1348u) {
            this.f1348u = true;
            m732T(true);
        }
    }

    /* renamed from: f */
    public void mo682f() {
        C0275h hVar = this.f1351x;
        if (hVar != null) {
            hVar.mo779a();
            this.f1351x = null;
        }
    }

    /* renamed from: h */
    public boolean mo554h() {
        C0469n0 n0Var = this.f1333f;
        if (n0Var == null || !n0Var.mo2243i()) {
            return false;
        }
        this.f1333f.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo555i(boolean z) {
        if (z != this.f1342o) {
            this.f1342o = z;
            if (this.f1343p.size() > 0) {
                C0125b.m366a(this.f1343p.get(0));
                throw null;
            }
        }
    }

    /* renamed from: j */
    public int mo556j() {
        return this.f1333f.mo2265y();
    }

    /* renamed from: k */
    public Context mo557k() {
        if (this.f1329b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1328a.getTheme().resolveAttribute(C2210a.f6449e, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1329b = new ContextThemeWrapper(this.f1328a, i);
            } else {
                this.f1329b = this.f1328a;
            }
        }
        return this.f1329b;
    }

    /* renamed from: m */
    public void mo559m(Configuration configuration) {
        m729O(C0263a.m881b(this.f1328a).mo736e());
    }

    /* renamed from: o */
    public boolean mo561o(int i, KeyEvent keyEvent) {
        Menu e;
        int i2;
        C0237d dVar = this.f1339l;
        if (dVar == null || (e = dVar.mo686e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: r */
    public void mo564r(boolean z) {
        if (!this.f1338k) {
            mo565s(z);
        }
    }

    /* renamed from: s */
    public void mo565s(boolean z) {
        mo673M(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo566t(boolean z) {
        mo673M(z ? 8 : 0, 8);
    }

    /* renamed from: u */
    public void mo567u(int i) {
        this.f1333f.mo2251q(i);
    }

    /* renamed from: v */
    public void mo568v(CharSequence charSequence) {
        this.f1333f.mo2245k(charSequence);
    }

    /* renamed from: w */
    public void mo569w(int i) {
        this.f1333f.mo2263w(i);
    }

    /* renamed from: x */
    public void mo570x(Drawable drawable) {
        this.f1333f.mo2232A(drawable);
    }

    /* renamed from: y */
    public void mo571y(boolean z) {
        C0275h hVar;
        this.f1352y = z;
        if (!z && (hVar = this.f1351x) != null) {
            hVar.mo779a();
        }
    }

    /* renamed from: z */
    public void mo572z(int i) {
        mo550A(this.f1328a.getString(i));
    }

    public C0233g0(Dialog dialog) {
        m728L(dialog.getWindow().getDecorView());
    }
}
