package p202p0;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: p0.b0 */
public final class C7526b0 {

    /* renamed from: a */
    public static final C7526b0 f21968a = new C7526b0();

    /* renamed from: p0.b0$a */
    static final class C7527a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7527a f21969d = new C7527a();

        C7527a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C41536l.m120489i(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: p0.b0$b */
    static final class C7528b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7528b f21970d = new C7528b();

        C7528b() {
            super(1);
        }

        /* renamed from: a */
        public final C7556l invoke(View view) {
            C41536l.m120489i(view, "it");
            return C7526b0.f21968a.m28620d(view);
        }
    }

    private C7526b0() {
    }

    /* renamed from: b */
    public static final C7556l m28618b(View view) {
        C41536l.m120489i(view, "view");
        C7556l c = f21968a.m28619c(view);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: c */
    private final C7556l m28619c(View view) {
        return (C7556l) C40355o.m116858p(C40355o.m116864v(C40349m.m116845f(view, C7527a.f21969d), C7528b.f21970d));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C7556l m28620d(View view) {
        Object tag = view.getTag(C7543g0.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C7556l) ((WeakReference) tag).get();
        }
        if (tag instanceof C7556l) {
            return (C7556l) tag;
        }
        return null;
    }

    /* renamed from: e */
    public static final void m28621e(View view, C7556l lVar) {
        C41536l.m120489i(view, "view");
        view.setTag(C7543g0.nav_controller_view_tag, lVar);
    }
}
