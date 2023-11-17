package p060e1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e1.l0 */
public abstract class C5958l0 {

    /* renamed from: a */
    private static C5936i0 f18649a = new C5893c();

    /* renamed from: b */
    private static ThreadLocal f18650b = new ThreadLocal();

    /* renamed from: c */
    static ArrayList f18651c = new ArrayList();

    /* renamed from: e1.l0$a */
    private static class C5959a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: d */
        C5936i0 f18652d;

        /* renamed from: e */
        ViewGroup f18653e;

        /* renamed from: e1.l0$a$a */
        class C5960a extends C5955k0 {

            /* renamed from: d */
            final /* synthetic */ ArrayMap f18654d;

            C5960a(ArrayMap arrayMap) {
                this.f18654d = arrayMap;
            }

            /* renamed from: c */
            public void mo19294c(C5936i0 i0Var) {
                ((ArrayList) this.f18654d.get(C5959a.this.f18653e)).remove(i0Var);
                i0Var.mo19343k0(this);
            }
        }

        C5959a(C5936i0 i0Var, ViewGroup viewGroup) {
            this.f18652d = i0Var;
            this.f18653e = viewGroup;
        }

        /* renamed from: a */
        private void m23916a() {
            this.f18653e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f18653e.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m23916a();
            if (!C5958l0.f18651c.remove(this.f18653e)) {
                return true;
            }
            ArrayMap d = C5958l0.m23913d();
            ArrayList arrayList = (ArrayList) d.get(this.f18653e);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                d.put(this.f18653e, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f18652d);
            this.f18652d.mo19333a(new C5960a(d));
            this.f18652d.mo19347o(this.f18653e, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C5936i0) it.next()).mo19346m0(this.f18653e);
                }
            }
            this.f18652d.mo19342j0(this.f18653e);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m23916a();
            C5958l0.f18651c.remove(this.f18653e);
            ArrayList arrayList = (ArrayList) C5958l0.m23913d().get(this.f18653e);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5936i0) it.next()).mo19346m0(this.f18653e);
                }
            }
            this.f18652d.mo19349p(true);
        }
    }

    /* renamed from: a */
    public static void m23910a(ViewGroup viewGroup) {
        m23911b(viewGroup, (C5936i0) null);
    }

    /* renamed from: b */
    public static void m23911b(ViewGroup viewGroup, C5936i0 i0Var) {
        if (!f18651c.contains(viewGroup) && ViewCompat.m3579V(viewGroup)) {
            f18651c.add(viewGroup);
            if (i0Var == null) {
                i0Var = f18649a;
            }
            C5936i0 q = i0Var.clone();
            m23915f(viewGroup, q);
            C5900e0.m23716b(viewGroup, (C5900e0) null);
            m23914e(viewGroup, q);
        }
    }

    /* renamed from: c */
    public static void m23912c(ViewGroup viewGroup) {
        f18651c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m23913d().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((C5936i0) arrayList2.get(size)).mo19316F(viewGroup);
            }
        }
    }

    /* renamed from: d */
    static ArrayMap m23913d() {
        ArrayMap arrayMap;
        WeakReference weakReference = (WeakReference) f18650b.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        f18650b.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    /* renamed from: e */
    private static void m23914e(ViewGroup viewGroup, C5936i0 i0Var) {
        if (i0Var != null && viewGroup != null) {
            C5959a aVar = new C5959a(i0Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: f */
    private static void m23915f(ViewGroup viewGroup, C5936i0 i0Var) {
        ArrayList arrayList = (ArrayList) m23913d().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C5936i0) it.next()).mo19340i0(viewGroup);
            }
        }
        if (i0Var != null) {
            i0Var.mo19347o(viewGroup, true);
        }
        C5900e0.m23715a(viewGroup);
    }
}
