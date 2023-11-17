package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0125b;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.widget.C0469n0;
import androidx.appcompat.widget.C0504v1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C1008h;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.d0 */
class C0221d0 extends C0209a {

    /* renamed from: a */
    final C0469n0 f1297a;

    /* renamed from: b */
    final Window.Callback f1298b;

    /* renamed from: c */
    final AppCompatDelegateImpl.C0192g f1299c;

    /* renamed from: d */
    boolean f1300d;

    /* renamed from: e */
    private boolean f1301e;

    /* renamed from: f */
    private boolean f1302f;

    /* renamed from: g */
    private ArrayList f1303g = new ArrayList();

    /* renamed from: h */
    private final Runnable f1304h = new C0222a();

    /* renamed from: i */
    private final Toolbar.C0390h f1305i;

    /* renamed from: androidx.appcompat.app.d0$a */
    class C0222a implements Runnable {
        C0222a() {
        }

        public void run() {
            C0221d0.this.mo661E();
        }
    }

    /* renamed from: androidx.appcompat.app.d0$b */
    class C0223b implements Toolbar.C0390h {
        C0223b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0221d0.this.f1298b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.d0$c */
    private final class C0224c implements C0313m.C0314a {

        /* renamed from: d */
        private boolean f1308d;

        C0224c() {
        }

        /* renamed from: c */
        public void mo519c(C0297g gVar, boolean z) {
            if (!this.f1308d) {
                this.f1308d = true;
                C0221d0.this.f1297a.mo2260t();
                C0221d0.this.f1298b.onPanelClosed(108, gVar);
                this.f1308d = false;
            }
        }

        /* renamed from: d */
        public boolean mo520d(C0297g gVar) {
            C0221d0.this.f1298b.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.d0$d */
    private final class C0225d implements C0297g.C0298a {
        C0225d() {
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
            if (C0221d0.this.f1297a.mo2239f()) {
                C0221d0.this.f1298b.onPanelClosed(108, gVar);
            } else if (C0221d0.this.f1298b.onPreparePanel(0, (View) null, gVar)) {
                C0221d0.this.f1298b.onMenuOpened(108, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d0$e */
    private class C0226e implements AppCompatDelegateImpl.C0192g {
        C0226e() {
        }

        /* renamed from: a */
        public boolean mo517a(int i) {
            if (i != 0) {
                return false;
            }
            C0221d0 d0Var = C0221d0.this;
            if (d0Var.f1300d) {
                return false;
            }
            d0Var.f1297a.mo2240g();
            C0221d0.this.f1300d = true;
            return false;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0221d0.this.f1297a.mo2234b());
            }
            return null;
        }
    }

    C0221d0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0223b bVar = new C0223b();
        this.f1305i = bVar;
        C1008h.m3530g(toolbar);
        C0504v1 v1Var = new C0504v1(toolbar, false);
        this.f1297a = v1Var;
        this.f1298b = (Window.Callback) C1008h.m3530g(callback);
        v1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        v1Var.setWindowTitle(charSequence);
        this.f1299c = new C0226e();
    }

    /* renamed from: D */
    private Menu m686D() {
        if (!this.f1301e) {
            this.f1297a.mo2264x(new C0224c(), new C0225d());
            this.f1301e = true;
        }
        return this.f1297a.mo2246l();
    }

    /* renamed from: A */
    public void mo550A(CharSequence charSequence) {
        this.f1297a.setTitle(charSequence);
    }

    /* renamed from: B */
    public void mo551B(CharSequence charSequence) {
        this.f1297a.setWindowTitle(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo661E() {
        C0297g gVar;
        Menu D = m686D();
        if (D instanceof C0297g) {
            gVar = (C0297g) D;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.mo1018h0();
        }
        try {
            D.clear();
            if (!this.f1298b.onCreatePanelMenu(0, D) || !this.f1298b.onPreparePanel(0, (View) null, D)) {
                D.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo1015g0();
            }
        }
    }

    /* renamed from: F */
    public void mo662F(int i, int i2) {
        this.f1297a.mo2244j((i & i2) | ((~i2) & this.f1297a.mo2265y()));
    }

    /* renamed from: g */
    public boolean mo553g() {
        return this.f1297a.mo2235c();
    }

    /* renamed from: h */
    public boolean mo554h() {
        if (!this.f1297a.mo2243i()) {
            return false;
        }
        this.f1297a.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo555i(boolean z) {
        if (z != this.f1302f) {
            this.f1302f = z;
            if (this.f1303g.size() > 0) {
                C0125b.m366a(this.f1303g.get(0));
                throw null;
            }
        }
    }

    /* renamed from: j */
    public int mo556j() {
        return this.f1297a.mo2265y();
    }

    /* renamed from: k */
    public Context mo557k() {
        return this.f1297a.mo2234b();
    }

    /* renamed from: l */
    public boolean mo558l() {
        this.f1297a.mo2249o().removeCallbacks(this.f1304h);
        ViewCompat.m3603j0(this.f1297a.mo2249o(), this.f1304h);
        return true;
    }

    /* renamed from: m */
    public void mo559m(Configuration configuration) {
        super.mo559m(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo560n() {
        this.f1297a.mo2249o().removeCallbacks(this.f1304h);
    }

    /* renamed from: o */
    public boolean mo561o(int i, KeyEvent keyEvent) {
        int i2;
        Menu D = m686D();
        if (D == null) {
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
        D.setQwertyMode(z);
        return D.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: p */
    public boolean mo562p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo563q();
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo563q() {
        return this.f1297a.mo2237d();
    }

    /* renamed from: r */
    public void mo564r(boolean z) {
    }

    /* renamed from: s */
    public void mo565s(boolean z) {
        mo662F(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo566t(boolean z) {
        mo662F(z ? 8 : 0, 8);
    }

    /* renamed from: u */
    public void mo567u(int i) {
        this.f1297a.mo2251q(i);
    }

    /* renamed from: v */
    public void mo568v(CharSequence charSequence) {
        this.f1297a.mo2245k(charSequence);
    }

    /* renamed from: w */
    public void mo569w(int i) {
        this.f1297a.mo2263w(i);
    }

    /* renamed from: x */
    public void mo570x(Drawable drawable) {
        this.f1297a.mo2232A(drawable);
    }

    /* renamed from: y */
    public void mo571y(boolean z) {
    }

    /* renamed from: z */
    public void mo572z(int i) {
        C0469n0 n0Var = this.f1297a;
        n0Var.setTitle(i != 0 ? n0Var.mo2234b().getText(i) : null);
    }
}
