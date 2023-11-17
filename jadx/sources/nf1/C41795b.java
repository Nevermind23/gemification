package nf1;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: nf1.b */
public abstract class C41795b {

    /* renamed from: nf1.b$a */
    static class C41796a extends C41794a {

        /* renamed from: e */
        final /* synthetic */ C41800e f98120e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41796a(Activity activity, C41800e eVar) {
            super(activity);
            this.f98120e = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo96608a() {
            this.f98120e.unregister();
        }
    }

    /* renamed from: nf1.b$b */
    static class C41797b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        private final Rect f98121d = new Rect();

        /* renamed from: e */
        private boolean f98122e = false;

        /* renamed from: f */
        final /* synthetic */ View f98123f;

        /* renamed from: g */
        final /* synthetic */ C41798c f98124g;

        C41797b(View view, C41798c cVar) {
            this.f98123f = view;
            this.f98124g = cVar;
        }

        public void onGlobalLayout() {
            boolean z;
            this.f98123f.getWindowVisibleDisplayFrame(this.f98121d);
            int height = this.f98123f.getRootView().getHeight();
            if (((double) (height - this.f98121d.height())) > ((double) height) * 0.15d) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f98122e) {
                this.f98122e = z;
                this.f98124g.mo87974a(z);
            }
        }
    }

    /* renamed from: a */
    static View m121159a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    /* renamed from: b */
    public static C41800e m121160b(Activity activity, C41798c cVar) {
        if (activity != null) {
            int i = activity.getWindow().getAttributes().softInputMode;
            if (i != 0 && (16 > i || 32 <= i)) {
                throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is not ADJUST_RESIZE");
            } else if (cVar != null) {
                View a = m121159a(activity);
                C41797b bVar = new C41797b(a, cVar);
                a.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
                return new C41799d(activity, bVar);
            } else {
                throw new NullPointerException("Parameter:listener must not be null");
            }
        } else {
            throw new NullPointerException("Parameter:activity must not be null");
        }
    }

    /* renamed from: c */
    public static void m121161c(Activity activity, C41798c cVar) {
        activity.getApplication().registerActivityLifecycleCallbacks(new C41796a(activity, m121160b(activity, cVar)));
    }
}
