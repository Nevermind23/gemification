package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import p516mf.C16681a;
import p586rf.C17607c;
import p627uf.C18154b;
import p627uf.C18156d;

/* renamed from: dagger.hilt.android.internal.managers.g */
public class C12066g implements C18154b {

    /* renamed from: d */
    private volatile Object f35467d;

    /* renamed from: e */
    private final Object f35468e = new Object();

    /* renamed from: f */
    private final Fragment f35469f;

    /* renamed from: dagger.hilt.android.internal.managers.g$a */
    public interface C12067a {
        /* renamed from: Z1 */
        C17607c mo32192Z1();
    }

    public C12066g(Fragment fragment) {
        this.f35469f = fragment;
    }

    /* renamed from: a */
    private Object m44265a() {
        C18156d.m62248c(this.f35469f.getHost(), "Hilt Fragments must be attached before creating the component.");
        C18156d.m62249d(this.f35469f.getHost() instanceof C18154b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f35469f.getHost().getClass());
        mo32191e(this.f35469f);
        return ((C12067a) C16681a.m59022a(this.f35469f.getHost(), C12067a.class)).mo32192Z1().mo32580b(this.f35469f).mo32579a();
    }

    /* renamed from: b */
    public static ContextWrapper m44266b(Context context, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m44267c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m44268d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32191e(Fragment fragment) {
    }

    public Object generatedComponent() {
        if (this.f35467d == null) {
            synchronized (this.f35468e) {
                if (this.f35467d == null) {
                    this.f35467d = m44265a();
                }
            }
        }
        return this.f35467d;
    }
}
