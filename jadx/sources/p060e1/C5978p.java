package p060e1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0909f;
import androidx.fragment.app.C1507h0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p060e1.C5936i0;

/* renamed from: e1.p */
public class C5978p extends C1507h0 {

    /* renamed from: e1.p$a */
    class C5979a extends C5936i0.C5942f {

        /* renamed from: a */
        final /* synthetic */ Rect f18693a;

        C5979a(Rect rect) {
            this.f18693a = rect;
        }

        /* renamed from: a */
        public Rect mo19367a(C5936i0 i0Var) {
            return this.f18693a;
        }
    }

    /* renamed from: e1.p$b */
    class C5980b implements C5936i0.C5943g {

        /* renamed from: d */
        final /* synthetic */ View f18695d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f18696e;

        C5980b(View view, ArrayList arrayList) {
            this.f18695d = view;
            this.f18696e = arrayList;
        }

        /* renamed from: a */
        public void mo19292a(C5936i0 i0Var) {
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            i0Var.mo19343k0(this);
            this.f18695d.setVisibility(8);
            int size = this.f18696e.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f18696e.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
            i0Var.mo19343k0(this);
            i0Var.mo19333a(this);
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
        }
    }

    /* renamed from: e1.p$c */
    class C5981c extends C5955k0 {

        /* renamed from: d */
        final /* synthetic */ Object f18698d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f18699e;

        /* renamed from: f */
        final /* synthetic */ Object f18700f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f18701g;

        /* renamed from: h */
        final /* synthetic */ Object f18702h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f18703i;

        C5981c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f18698d = obj;
            this.f18699e = arrayList;
            this.f18700f = obj2;
            this.f18701g = arrayList2;
            this.f18702h = obj3;
            this.f18703i = arrayList3;
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            i0Var.mo19343k0(this);
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
            Object obj = this.f18698d;
            if (obj != null) {
                C5978p.this.mo19423w(obj, this.f18699e, (ArrayList) null);
            }
            Object obj2 = this.f18700f;
            if (obj2 != null) {
                C5978p.this.mo19423w(obj2, this.f18701g, (ArrayList) null);
            }
            Object obj3 = this.f18702h;
            if (obj3 != null) {
                C5978p.this.mo19423w(obj3, this.f18703i, (ArrayList) null);
            }
        }
    }

    /* renamed from: e1.p$d */
    class C5982d implements C0909f.C0911b {

        /* renamed from: a */
        final /* synthetic */ C5936i0 f18705a;

        C5982d(C5936i0 i0Var) {
            this.f18705a = i0Var;
        }

        /* renamed from: a */
        public void mo3362a() {
            this.f18705a.cancel();
        }
    }

    /* renamed from: e1.p$e */
    class C5983e implements C5936i0.C5943g {

        /* renamed from: d */
        final /* synthetic */ Runnable f18707d;

        C5983e(Runnable runnable) {
            this.f18707d = runnable;
        }

        /* renamed from: a */
        public void mo19292a(C5936i0 i0Var) {
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            this.f18707d.run();
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
        }
    }

    /* renamed from: e1.p$f */
    class C5984f extends C5936i0.C5942f {

        /* renamed from: a */
        final /* synthetic */ Rect f18709a;

        C5984f(Rect rect) {
            this.f18709a = rect;
        }

        /* renamed from: a */
        public Rect mo19367a(C5936i0 i0Var) {
            Rect rect = this.f18709a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f18709a;
        }
    }

    /* renamed from: v */
    private static boolean m24022v(C5936i0 i0Var) {
        if (!C1507h0.m5340i(i0Var.mo19326Q()) || !C1507h0.m5340i(i0Var.mo19327S()) || !C1507h0.m5340i(i0Var.mo19328T())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4644a(Object obj, View view) {
        if (obj != null) {
            ((C5936i0) obj).mo19335c(view);
        }
    }

    /* renamed from: b */
    public void mo4645b(Object obj, ArrayList arrayList) {
        C5936i0 i0Var = (C5936i0) obj;
        if (i0Var != null) {
            int i = 0;
            if (i0Var instanceof C5968n0) {
                C5968n0 n0Var = (C5968n0) i0Var;
                int I0 = n0Var.mo19404I0();
                while (i < I0) {
                    mo4645b(n0Var.mo19403H0(i), arrayList);
                    i++;
                }
            } else if (!m24022v(i0Var) && C1507h0.m5340i(i0Var.mo19329U())) {
                int size = arrayList.size();
                while (i < size) {
                    i0Var.mo19335c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4646c(ViewGroup viewGroup, Object obj) {
        C5958l0.m23911b(viewGroup, (C5936i0) obj);
    }

    /* renamed from: e */
    public boolean mo4647e(Object obj) {
        return obj instanceof C5936i0;
    }

    /* renamed from: f */
    public Object mo4648f(Object obj) {
        if (obj != null) {
            return ((C5936i0) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo4649j(Object obj, Object obj2, Object obj3) {
        C5936i0 i0Var = (C5936i0) obj;
        C5936i0 i0Var2 = (C5936i0) obj2;
        C5936i0 i0Var3 = (C5936i0) obj3;
        if (i0Var != null && i0Var2 != null) {
            i0Var = new C5968n0().mo19402F0(i0Var).mo19402F0(i0Var2).mo19409N0(1);
        } else if (i0Var == null) {
            if (i0Var2 != null) {
                i0Var = i0Var2;
            } else {
                i0Var = null;
            }
        }
        if (i0Var3 == null) {
            return i0Var;
        }
        C5968n0 n0Var = new C5968n0();
        if (i0Var != null) {
            n0Var.mo19402F0(i0Var);
        }
        n0Var.mo19402F0(i0Var3);
        return n0Var;
    }

    /* renamed from: k */
    public Object mo4650k(Object obj, Object obj2, Object obj3) {
        C5968n0 n0Var = new C5968n0();
        if (obj != null) {
            n0Var.mo19402F0((C5936i0) obj);
        }
        if (obj2 != null) {
            n0Var.mo19402F0((C5936i0) obj2);
        }
        if (obj3 != null) {
            n0Var.mo19402F0((C5936i0) obj3);
        }
        return n0Var;
    }

    /* renamed from: m */
    public void mo4651m(Object obj, View view, ArrayList arrayList) {
        ((C5936i0) obj).mo19333a(new C5980b(view, arrayList));
    }

    /* renamed from: n */
    public void mo4652n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((C5936i0) obj).mo19333a(new C5981c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo4653o(Object obj, Rect rect) {
        if (obj != null) {
            ((C5936i0) obj).mo19352r0(new C5984f(rect));
        }
    }

    /* renamed from: p */
    public void mo4654p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4703h(view, rect);
            ((C5936i0) obj).mo19352r0(new C5979a(rect));
        }
    }

    /* renamed from: q */
    public void mo4655q(Fragment fragment, Object obj, C0909f fVar, Runnable runnable) {
        C5936i0 i0Var = (C5936i0) obj;
        fVar.mo3361c(new C5982d(i0Var));
        i0Var.mo19333a(new C5983e(runnable));
    }

    /* renamed from: s */
    public void mo4656s(Object obj, View view, ArrayList arrayList) {
        C5968n0 n0Var = (C5968n0) obj;
        List U = n0Var.mo19329U();
        U.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1507h0.m5338d(U, (View) arrayList.get(i));
        }
        U.add(view);
        arrayList.add(view);
        mo4645b(n0Var, arrayList);
    }

    /* renamed from: t */
    public void mo4657t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C5968n0 n0Var = (C5968n0) obj;
        if (n0Var != null) {
            n0Var.mo19329U().clear();
            n0Var.mo19329U().addAll(arrayList2);
            mo19423w(n0Var, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo4658u(Object obj) {
        if (obj == null) {
            return null;
        }
        C5968n0 n0Var = new C5968n0();
        n0Var.mo19402F0((C5936i0) obj);
        return n0Var;
    }

    /* renamed from: w */
    public void mo19423w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        C5936i0 i0Var = (C5936i0) obj;
        int i2 = 0;
        if (i0Var instanceof C5968n0) {
            C5968n0 n0Var = (C5968n0) i0Var;
            int I0 = n0Var.mo19404I0();
            while (i2 < I0) {
                mo19423w(n0Var.mo19403H0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m24022v(i0Var)) {
            List U = i0Var.mo19329U();
            if (U.size() == arrayList.size() && U.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    i0Var.mo19335c((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i0Var.mo19344l0((View) arrayList.get(size));
                }
            }
        }
    }
}
