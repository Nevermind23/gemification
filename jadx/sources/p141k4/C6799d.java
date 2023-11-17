package p141k4;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C2626d;
import java.lang.ref.WeakReference;
import p115i4.C6549g;
import p154l4.C6880a;
import p154l4.C6888f;
import p193o4.C7438b;
import p334z4.C9207a;

/* renamed from: k4.d */
public abstract class C6799d {

    /* renamed from: k4.d$a */
    public static class C6800a implements View.OnTouchListener {

        /* renamed from: d */
        private C6880a f20440d;

        /* renamed from: e */
        private WeakReference f20441e;

        /* renamed from: f */
        private WeakReference f20442f;

        /* renamed from: g */
        private View.OnTouchListener f20443g;

        /* renamed from: h */
        private boolean f20444h = false;

        /* renamed from: k4.d$a$a */
        class C6801a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ String f20445d;

            /* renamed from: e */
            final /* synthetic */ Bundle f20446e;

            C6801a(String str, Bundle bundle) {
                this.f20445d = str;
                this.f20446e = bundle;
            }

            public void run() {
                if (!C9207a.m34024c(this)) {
                    try {
                        C6549g.m25849h(C2626d.m10134e()).mo20530g(this.f20445d, this.f20446e);
                    } catch (Throwable th) {
                        C9207a.m34023b(th, this);
                    }
                }
            }
        }

        public C6800a(C6880a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f20443g = C6888f.m26744h(view2);
                this.f20440d = aVar;
                this.f20441e = new WeakReference(view2);
                this.f20442f = new WeakReference(view);
                this.f20444h = true;
            }
        }

        /* renamed from: b */
        private void m26518b() {
            C6880a aVar = this.f20440d;
            if (aVar != null) {
                String b = aVar.mo20974b();
                Bundle f = C6795c.m26500f(this.f20440d, (View) this.f20442f.get(), (View) this.f20441e.get());
                if (f.containsKey("_valueToSum")) {
                    f.putDouble("_valueToSum", C7438b.m28298g(f.getString("_valueToSum")));
                }
                f.putString("_is_fb_codeless", "1");
                C2626d.m10142m().execute(new C6801a(b, f));
            }
        }

        /* renamed from: a */
        public boolean mo20863a() {
            return this.f20444h;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m26518b();
            }
            View.OnTouchListener onTouchListener = this.f20443g;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C6800a m26517a(C6880a aVar, View view, View view2) {
        Class<C6799d> cls = C6799d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return new C6800a(aVar, view, view2);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}
