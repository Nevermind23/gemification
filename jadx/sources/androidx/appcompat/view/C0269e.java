package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.e */
public class C0269e extends C0264b implements C0297g.C0298a {

    /* renamed from: f */
    private Context f1402f;

    /* renamed from: g */
    private ActionBarContextView f1403g;

    /* renamed from: h */
    private C0264b.C0265a f1404h;

    /* renamed from: i */
    private WeakReference f1405i;

    /* renamed from: j */
    private boolean f1406j;

    /* renamed from: k */
    private boolean f1407k;

    /* renamed from: l */
    private C0297g f1408l;

    public C0269e(Context context, ActionBarContextView actionBarContextView, C0264b.C0265a aVar, boolean z) {
        this.f1402f = context;
        this.f1403g = actionBarContextView;
        this.f1404h = aVar;
        C0297g W = new C0297g(actionBarContextView.getContext()).mo988W(1);
        this.f1408l = W;
        W.mo987V(this);
        this.f1407k = z;
    }

    /* renamed from: a */
    public boolean mo462a(C0297g gVar, MenuItem menuItem) {
        return this.f1404h.mo523c(this, menuItem);
    }

    /* renamed from: b */
    public void mo464b(C0297g gVar) {
        mo690k();
        this.f1403g.mo1258l();
    }

    /* renamed from: c */
    public void mo684c() {
        if (!this.f1406j) {
            this.f1406j = true;
            this.f1404h.mo521a(this);
        }
    }

    /* renamed from: d */
    public View mo685d() {
        WeakReference weakReference = this.f1405i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo686e() {
        return this.f1408l;
    }

    /* renamed from: f */
    public MenuInflater mo687f() {
        return new C0272g(this.f1403g.getContext());
    }

    /* renamed from: g */
    public CharSequence mo688g() {
        return this.f1403g.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo689i() {
        return this.f1403g.getTitle();
    }

    /* renamed from: k */
    public void mo690k() {
        this.f1404h.mo524d(this, this.f1408l);
    }

    /* renamed from: l */
    public boolean mo691l() {
        return this.f1403g.mo1256j();
    }

    /* renamed from: m */
    public void mo692m(View view) {
        WeakReference weakReference;
        this.f1403g.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f1405i = weakReference;
    }

    /* renamed from: n */
    public void mo693n(int i) {
        mo694o(this.f1402f.getString(i));
    }

    /* renamed from: o */
    public void mo694o(CharSequence charSequence) {
        this.f1403g.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo695q(int i) {
        mo696r(this.f1402f.getString(i));
    }

    /* renamed from: r */
    public void mo696r(CharSequence charSequence) {
        this.f1403g.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo697s(boolean z) {
        super.mo697s(z);
        this.f1403g.setTitleOptional(z);
    }
}
