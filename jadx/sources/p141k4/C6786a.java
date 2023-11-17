package p141k4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C2626d;
import java.lang.ref.WeakReference;
import p115i4.C6549g;
import p154l4.C6880a;
import p154l4.C6888f;
import p193o4.C7438b;
import p334z4.C9207a;

/* renamed from: k4.a */
public abstract class C6786a {

    /* renamed from: k4.a$a */
    static class C6787a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f20402d;

        /* renamed from: e */
        final /* synthetic */ Bundle f20403e;

        C6787a(String str, Bundle bundle) {
            this.f20402d = str;
            this.f20403e = bundle;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6549g.m25849h(C2626d.m10134e()).mo20530g(this.f20402d, this.f20403e);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: k4.a$b */
    public static class C6788b implements View.OnClickListener {

        /* renamed from: d */
        private C6880a f20404d;

        /* renamed from: e */
        private WeakReference f20405e;

        /* renamed from: f */
        private WeakReference f20406f;

        /* renamed from: g */
        private View.OnClickListener f20407g;

        /* renamed from: h */
        private boolean f20408h;

        /* synthetic */ C6788b(C6880a aVar, View view, View view2, C6787a aVar2) {
            this(aVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo20846a() {
            return this.f20408h;
        }

        public void onClick(View view) {
            if (!C9207a.m34024c(this)) {
                try {
                    View.OnClickListener onClickListener = this.f20407g;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (this.f20406f.get() != null && this.f20405e.get() != null) {
                        C6786a.m26472a(this.f20404d, (View) this.f20406f.get(), (View) this.f20405e.get());
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }

        private C6788b(C6880a aVar, View view, View view2) {
            this.f20408h = false;
            if (aVar != null && view != null && view2 != null) {
                this.f20407g = C6888f.m26743g(view2);
                this.f20404d = aVar;
                this.f20405e = new WeakReference(view2);
                this.f20406f = new WeakReference(view);
                this.f20408h = true;
            }
        }
    }

    /* renamed from: k4.a$c */
    public static class C6789c implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        private C6880a f20409d;

        /* renamed from: e */
        private WeakReference f20410e;

        /* renamed from: f */
        private WeakReference f20411f;

        /* renamed from: g */
        private AdapterView.OnItemClickListener f20412g;

        /* renamed from: h */
        private boolean f20413h;

        /* synthetic */ C6789c(C6880a aVar, View view, AdapterView adapterView, C6787a aVar2) {
            this(aVar, view, adapterView);
        }

        /* renamed from: a */
        public boolean mo20848a() {
            return this.f20413h;
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f20412g;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f20411f.get() != null && this.f20410e.get() != null) {
                C6786a.m26472a(this.f20409d, (View) this.f20411f.get(), (View) this.f20410e.get());
            }
        }

        private C6789c(C6880a aVar, View view, AdapterView adapterView) {
            this.f20413h = false;
            if (aVar != null && view != null && adapterView != null) {
                this.f20412g = adapterView.getOnItemClickListener();
                this.f20409d = aVar;
                this.f20410e = new WeakReference(adapterView);
                this.f20411f = new WeakReference(view);
                this.f20413h = true;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26472a(C6880a aVar, View view, View view2) {
        Class<C6786a> cls = C6786a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m26475d(aVar, view, view2);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static C6788b m26473b(C6880a aVar, View view, View view2) {
        Class<C6786a> cls = C6786a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return new C6788b(aVar, view, view2, (C6787a) null);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static C6789c m26474c(C6880a aVar, View view, AdapterView adapterView) {
        Class<C6786a> cls = C6786a.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return new C6789c(aVar, view, adapterView, (C6787a) null);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    private static void m26475d(C6880a aVar, View view, View view2) {
        Class<C6786a> cls = C6786a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                String b = aVar.mo20974b();
                Bundle f = C6795c.m26500f(aVar, view, view2);
                m26476e(f);
                C2626d.m10142m().execute(new C6787a(b, f));
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    protected static void m26476e(Bundle bundle) {
        Class<C6786a> cls = C6786a.class;
        if (!C9207a.m34024c(cls)) {
            try {
                String string = bundle.getString("_valueToSum");
                if (string != null) {
                    bundle.putDouble("_valueToSum", C7438b.m28298g(string));
                }
                bundle.putString("_is_fb_codeless", "1");
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
