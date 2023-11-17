package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
public abstract class C1111b {

    /* renamed from: a */
    private final Context f3777a;

    /* renamed from: b */
    private C1112a f3778b;

    /* renamed from: c */
    private C1113b f3779c;

    /* renamed from: androidx.core.view.b$a */
    public interface C1112a {
    }

    /* renamed from: androidx.core.view.b$b */
    public interface C1113b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C1111b(Context context) {
        this.f3777a = context;
    }

    /* renamed from: a */
    public Context mo3671a() {
        return this.f3777a;
    }

    /* renamed from: b */
    public boolean mo1163b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1166c() {
        return true;
    }

    /* renamed from: d */
    public abstract View mo1167d(MenuItem menuItem);

    /* renamed from: e */
    public boolean mo1164e() {
        return false;
    }

    /* renamed from: f */
    public void mo1165f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1168g() {
        return false;
    }

    /* renamed from: h */
    public void mo3672h() {
        this.f3779c = null;
        this.f3778b = null;
    }

    /* renamed from: i */
    public void mo3673i(C1112a aVar) {
        this.f3778b = aVar;
    }

    /* renamed from: j */
    public void mo1169j(C1113b bVar) {
        if (!(this.f3779c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3779c = bVar;
    }
}
