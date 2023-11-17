package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import p516mf.C16681a;
import p572qf.C17496a;
import p586rf.C17609e;
import p586rf.C17611g;
import p627uf.C18154b;
import p627uf.C18156d;

public final class ViewComponentManager implements C18154b {

    /* renamed from: d */
    private volatile Object f35445d;

    /* renamed from: e */
    private final Object f35446e = new Object();

    /* renamed from: f */
    private final boolean f35447f;

    /* renamed from: g */
    private final View f35448g;

    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$a */
    public interface C12052a {
        /* renamed from: t0 */
        C17609e mo32182t0();
    }

    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$b */
    public interface C12053b {
        /* renamed from: m0 */
        C17611g mo32183m0();
    }

    public ViewComponentManager(View view, boolean z) {
        this.f35448g = view;
        this.f35447f = z;
    }

    /* renamed from: a */
    private Object m44241a() {
        C18154b b = m44242b(false);
        if (this.f35447f) {
            return ((C12053b) C16681a.m59022a(b, C12053b.class)).mo32183m0().mo32895b(this.f35448g).mo32894a();
        }
        return ((C12052a) C16681a.m59022a(b, C12052a.class)).mo32182t0().mo32882b(this.f35448g).mo32881a();
    }

    /* renamed from: b */
    private C18154b m44242b(boolean z) {
        Class<C18154b> cls = C18154b.class;
        if (this.f35447f) {
            Context c = m44243c(FragmentContextWrapper.class, z);
            if (c instanceof FragmentContextWrapper) {
                return (C18154b) ((FragmentContextWrapper) c).mo32180d();
            }
            if (z) {
                return null;
            }
            Context c2 = m44243c(cls, z);
            C18156d.m62249d(!(c2 instanceof C18154b), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f35448g.getClass(), c2.getClass().getName());
        } else {
            Context c3 = m44243c(cls, z);
            if (c3 instanceof C18154b) {
                return (C18154b) c3;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f35448g.getClass()}));
    }

    /* renamed from: c */
    private Context m44243c(Class cls, boolean z) {
        Context d = m44244d(this.f35448g.getContext(), cls);
        if (d != C17496a.m60996a(d.getApplicationContext())) {
            return d;
        }
        C18156d.m62249d(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f35448g.getClass());
        return null;
    }

    /* renamed from: d */
    private static Context m44244d(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public Object generatedComponent() {
        if (this.f35445d == null) {
            synchronized (this.f35446e) {
                if (this.f35445d == null) {
                    this.f35445d = m44241a();
                }
            }
        }
        return this.f35445d;
    }

    public static final class FragmentContextWrapper extends ContextWrapper {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Fragment f35449a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public LayoutInflater f35450b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public LayoutInflater f35451c;

        /* renamed from: d */
        private final C1606m f35452d;

        FragmentContextWrapper(Context context, Fragment fragment) {
            super((Context) C18156d.m62247b(context));
            C120511 r2 = new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    if (aVar == C1593j.C1594a.ON_DESTROY) {
                        Fragment unused = FragmentContextWrapper.this.f35449a = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.f35450b = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.f35451c = null;
                    }
                }
            };
            this.f35452d = r2;
            this.f35450b = null;
            Fragment fragment2 = (Fragment) C18156d.m62247b(fragment);
            this.f35449a = fragment2;
            fragment2.getLifecycle().mo4906a(r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Fragment mo32180d() {
            C18156d.m62248c(this.f35449a, "The fragment has already been destroyed.");
            return this.f35449a;
        }

        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f35451c == null) {
                if (this.f35450b == null) {
                    this.f35450b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f35451c = this.f35450b.cloneInContext(this);
            }
            return this.f35451c;
        }

        FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) C18156d.m62247b(((LayoutInflater) C18156d.m62247b(layoutInflater)).getContext()));
            C120511 r0 = new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    if (aVar == C1593j.C1594a.ON_DESTROY) {
                        Fragment unused = FragmentContextWrapper.this.f35449a = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.f35450b = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.f35451c = null;
                    }
                }
            };
            this.f35452d = r0;
            this.f35450b = layoutInflater;
            Fragment fragment2 = (Fragment) C18156d.m62247b(fragment);
            this.f35449a = fragment2;
            fragment2.getLifecycle().mo4906a(r0);
        }
    }
}
