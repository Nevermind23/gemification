package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public class C1785g extends C1832v {

    /* renamed from: s */
    private static TimeInterpolator f5330s;

    /* renamed from: h */
    private ArrayList f5331h = new ArrayList();

    /* renamed from: i */
    private ArrayList f5332i = new ArrayList();

    /* renamed from: j */
    private ArrayList f5333j = new ArrayList();

    /* renamed from: k */
    private ArrayList f5334k = new ArrayList();

    /* renamed from: l */
    ArrayList f5335l = new ArrayList();

    /* renamed from: m */
    ArrayList f5336m = new ArrayList();

    /* renamed from: n */
    ArrayList f5337n = new ArrayList();

    /* renamed from: o */
    ArrayList f5338o = new ArrayList();

    /* renamed from: p */
    ArrayList f5339p = new ArrayList();

    /* renamed from: q */
    ArrayList f5340q = new ArrayList();

    /* renamed from: r */
    ArrayList f5341r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    class C1786a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f5342d;

        C1786a(ArrayList arrayList) {
            this.f5342d = arrayList;
        }

        public void run() {
            Iterator it = this.f5342d.iterator();
            while (it.hasNext()) {
                C1795j jVar = (C1795j) it.next();
                C1785g.this.mo5944T(jVar.f5376a, jVar.f5377b, jVar.f5378c, jVar.f5379d, jVar.f5380e);
            }
            this.f5342d.clear();
            C1785g.this.f5336m.remove(this.f5342d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    class C1787b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f5344d;

        C1787b(ArrayList arrayList) {
            this.f5344d = arrayList;
        }

        public void run() {
            Iterator it = this.f5344d.iterator();
            while (it.hasNext()) {
                C1785g.this.mo5943S((C1794i) it.next());
            }
            this.f5344d.clear();
            C1785g.this.f5337n.remove(this.f5344d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    class C1788c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f5346d;

        C1788c(ArrayList arrayList) {
            this.f5346d = arrayList;
        }

        public void run() {
            Iterator it = this.f5346d.iterator();
            while (it.hasNext()) {
                C1785g.this.mo5942R((RecyclerView.C1734f0) it.next());
            }
            this.f5346d.clear();
            C1785g.this.f5335l.remove(this.f5346d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    class C1789d extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1734f0 f5348d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5349e;

        /* renamed from: f */
        final /* synthetic */ View f5350f;

        C1789d(RecyclerView.C1734f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5348d = f0Var;
            this.f5349e = viewPropertyAnimator;
            this.f5350f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5349e.setListener((Animator.AnimatorListener) null);
            this.f5350f.setAlpha(1.0f);
            C1785g.this.mo6062G(this.f5348d);
            C1785g.this.f5340q.remove(this.f5348d);
            C1785g.this.mo5946W();
        }

        public void onAnimationStart(Animator animator) {
            C1785g.this.mo6063H(this.f5348d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    class C1790e extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1734f0 f5352d;

        /* renamed from: e */
        final /* synthetic */ View f5353e;

        /* renamed from: f */
        final /* synthetic */ ViewPropertyAnimator f5354f;

        C1790e(RecyclerView.C1734f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5352d = f0Var;
            this.f5353e = view;
            this.f5354f = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5353e.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f5354f.setListener((Animator.AnimatorListener) null);
            C1785g.this.mo6056A(this.f5352d);
            C1785g.this.f5338o.remove(this.f5352d);
            C1785g.this.mo5946W();
        }

        public void onAnimationStart(Animator animator) {
            C1785g.this.mo6057B(this.f5352d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    class C1791f extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1734f0 f5356d;

        /* renamed from: e */
        final /* synthetic */ int f5357e;

        /* renamed from: f */
        final /* synthetic */ View f5358f;

        /* renamed from: g */
        final /* synthetic */ int f5359g;

        /* renamed from: h */
        final /* synthetic */ ViewPropertyAnimator f5360h;

        C1791f(RecyclerView.C1734f0 f0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5356d = f0Var;
            this.f5357e = i;
            this.f5358f = view;
            this.f5359g = i2;
            this.f5360h = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5357e != 0) {
                this.f5358f.setTranslationX(Utils.FLOAT_EPSILON);
            }
            if (this.f5359g != 0) {
                this.f5358f.setTranslationY(Utils.FLOAT_EPSILON);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f5360h.setListener((Animator.AnimatorListener) null);
            C1785g.this.mo6060E(this.f5356d);
            C1785g.this.f5339p.remove(this.f5356d);
            C1785g.this.mo5946W();
        }

        public void onAnimationStart(Animator animator) {
            C1785g.this.mo6061F(this.f5356d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    class C1792g extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1794i f5362d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5363e;

        /* renamed from: f */
        final /* synthetic */ View f5364f;

        C1792g(C1794i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5362d = iVar;
            this.f5363e = viewPropertyAnimator;
            this.f5364f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5363e.setListener((Animator.AnimatorListener) null);
            this.f5364f.setAlpha(1.0f);
            this.f5364f.setTranslationX(Utils.FLOAT_EPSILON);
            this.f5364f.setTranslationY(Utils.FLOAT_EPSILON);
            C1785g.this.mo6058C(this.f5362d.f5370a, true);
            C1785g.this.f5341r.remove(this.f5362d.f5370a);
            C1785g.this.mo5946W();
        }

        public void onAnimationStart(Animator animator) {
            C1785g.this.mo6059D(this.f5362d.f5370a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    class C1793h extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1794i f5366d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f5367e;

        /* renamed from: f */
        final /* synthetic */ View f5368f;

        C1793h(C1794i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5366d = iVar;
            this.f5367e = viewPropertyAnimator;
            this.f5368f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5367e.setListener((Animator.AnimatorListener) null);
            this.f5368f.setAlpha(1.0f);
            this.f5368f.setTranslationX(Utils.FLOAT_EPSILON);
            this.f5368f.setTranslationY(Utils.FLOAT_EPSILON);
            C1785g.this.mo6058C(this.f5366d.f5371b, false);
            C1785g.this.f5341r.remove(this.f5366d.f5371b);
            C1785g.this.mo5946W();
        }

        public void onAnimationStart(Animator animator) {
            C1785g.this.mo6059D(this.f5366d.f5371b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$j */
    private static class C1795j {

        /* renamed from: a */
        public RecyclerView.C1734f0 f5376a;

        /* renamed from: b */
        public int f5377b;

        /* renamed from: c */
        public int f5378c;

        /* renamed from: d */
        public int f5379d;

        /* renamed from: e */
        public int f5380e;

        C1795j(RecyclerView.C1734f0 f0Var, int i, int i2, int i3, int i4) {
            this.f5376a = f0Var;
            this.f5377b = i;
            this.f5378c = i2;
            this.f5379d = i3;
            this.f5380e = i4;
        }
    }

    /* renamed from: U */
    private void m6908U(RecyclerView.C1734f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5340q.add(f0Var);
        animate.setDuration(mo5603o()).alpha(Utils.FLOAT_EPSILON).setListener(new C1789d(f0Var, animate, view)).start();
    }

    /* renamed from: X */
    private void m6909X(List list, RecyclerView.C1734f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1794i iVar = (C1794i) list.get(size);
            if (m6911Z(iVar, f0Var) && iVar.f5370a == null && iVar.f5371b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: Y */
    private void m6910Y(C1794i iVar) {
        RecyclerView.C1734f0 f0Var = iVar.f5370a;
        if (f0Var != null) {
            m6911Z(iVar, f0Var);
        }
        RecyclerView.C1734f0 f0Var2 = iVar.f5371b;
        if (f0Var2 != null) {
            m6911Z(iVar, f0Var2);
        }
    }

    /* renamed from: Z */
    private boolean m6911Z(C1794i iVar, RecyclerView.C1734f0 f0Var) {
        boolean z = false;
        if (iVar.f5371b == f0Var) {
            iVar.f5371b = null;
        } else if (iVar.f5370a != f0Var) {
            return false;
        } else {
            iVar.f5370a = null;
            z = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(Utils.FLOAT_EPSILON);
        f0Var.itemView.setTranslationY(Utils.FLOAT_EPSILON);
        mo6058C(f0Var, z);
        return true;
    }

    /* renamed from: a0 */
    private void m6912a0(RecyclerView.C1734f0 f0Var) {
        if (f5330s == null) {
            f5330s = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(f5330s);
        mo5598j(f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo5942R(RecyclerView.C1734f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5338o.add(f0Var);
        animate.alpha(1.0f).setDuration(mo5600l()).setListener(new C1790e(f0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo5943S(C1794i iVar) {
        View view;
        RecyclerView.C1734f0 f0Var = iVar.f5370a;
        View view2 = null;
        if (f0Var == null) {
            view = null;
        } else {
            view = f0Var.itemView;
        }
        RecyclerView.C1734f0 f0Var2 = iVar.f5371b;
        if (f0Var2 != null) {
            view2 = f0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo5601m());
            this.f5341r.add(iVar.f5370a);
            duration.translationX((float) (iVar.f5374e - iVar.f5372c));
            duration.translationY((float) (iVar.f5375f - iVar.f5373d));
            duration.alpha(Utils.FLOAT_EPSILON).setListener(new C1792g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f5341r.add(iVar.f5371b);
            animate.translationX(Utils.FLOAT_EPSILON).translationY(Utils.FLOAT_EPSILON).setDuration(mo5601m()).alpha(1.0f).setListener(new C1793h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo5944T(RecyclerView.C1734f0 f0Var, int i, int i2, int i3, int i4) {
        View view = f0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(Utils.FLOAT_EPSILON);
        }
        if (i6 != 0) {
            view.animate().translationY(Utils.FLOAT_EPSILON);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5339p.add(f0Var);
        animate.setDuration(mo5602n()).setListener(new C1791f(f0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5945V(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C1734f0) list.get(size)).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo5946W() {
        if (!mo5604p()) {
            mo5597i();
        }
    }

    /* renamed from: g */
    public boolean mo5595g(RecyclerView.C1734f0 f0Var, List list) {
        return !list.isEmpty() || super.mo5595g(f0Var, list);
    }

    /* renamed from: j */
    public void mo5598j(RecyclerView.C1734f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.f5333j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1795j) this.f5333j.get(size)).f5376a == f0Var) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
                view.setTranslationX(Utils.FLOAT_EPSILON);
                mo6060E(f0Var);
                this.f5333j.remove(size);
            }
        }
        m6909X(this.f5334k, f0Var);
        if (this.f5331h.remove(f0Var)) {
            view.setAlpha(1.0f);
            mo6062G(f0Var);
        }
        if (this.f5332i.remove(f0Var)) {
            view.setAlpha(1.0f);
            mo6056A(f0Var);
        }
        for (int size2 = this.f5337n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f5337n.get(size2);
            m6909X(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f5337n.remove(size2);
            }
        }
        for (int size3 = this.f5336m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f5336m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1795j) arrayList2.get(size4)).f5376a == f0Var) {
                    view.setTranslationY(Utils.FLOAT_EPSILON);
                    view.setTranslationX(Utils.FLOAT_EPSILON);
                    mo6060E(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5336m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5335l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f5335l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                mo6056A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f5335l.remove(size5);
                }
            }
        }
        this.f5340q.remove(f0Var);
        this.f5338o.remove(f0Var);
        this.f5341r.remove(f0Var);
        this.f5339p.remove(f0Var);
        mo5946W();
    }

    /* renamed from: k */
    public void mo5599k() {
        int size = this.f5333j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1795j jVar = (C1795j) this.f5333j.get(size);
            View view = jVar.f5376a.itemView;
            view.setTranslationY(Utils.FLOAT_EPSILON);
            view.setTranslationX(Utils.FLOAT_EPSILON);
            mo6060E(jVar.f5376a);
            this.f5333j.remove(size);
        }
        for (int size2 = this.f5331h.size() - 1; size2 >= 0; size2--) {
            mo6062G((RecyclerView.C1734f0) this.f5331h.get(size2));
            this.f5331h.remove(size2);
        }
        int size3 = this.f5332i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1734f0 f0Var = (RecyclerView.C1734f0) this.f5332i.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            mo6056A(f0Var);
            this.f5332i.remove(size3);
        }
        for (int size4 = this.f5334k.size() - 1; size4 >= 0; size4--) {
            m6910Y((C1794i) this.f5334k.get(size4));
        }
        this.f5334k.clear();
        if (mo5604p()) {
            for (int size5 = this.f5336m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f5336m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1795j jVar2 = (C1795j) arrayList.get(size6);
                    View view2 = jVar2.f5376a.itemView;
                    view2.setTranslationY(Utils.FLOAT_EPSILON);
                    view2.setTranslationX(Utils.FLOAT_EPSILON);
                    mo6060E(jVar2.f5376a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5336m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5335l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f5335l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1734f0 f0Var2 = (RecyclerView.C1734f0) arrayList2.get(size8);
                    f0Var2.itemView.setAlpha(1.0f);
                    mo6056A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5335l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5337n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f5337n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6910Y((C1794i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5337n.remove(arrayList3);
                    }
                }
            }
            mo5945V(this.f5340q);
            mo5945V(this.f5339p);
            mo5945V(this.f5338o);
            mo5945V(this.f5341r);
            mo5597i();
        }
    }

    /* renamed from: p */
    public boolean mo5604p() {
        if (!this.f5332i.isEmpty() || !this.f5334k.isEmpty() || !this.f5333j.isEmpty() || !this.f5331h.isEmpty() || !this.f5339p.isEmpty() || !this.f5340q.isEmpty() || !this.f5338o.isEmpty() || !this.f5341r.isEmpty() || !this.f5336m.isEmpty() || !this.f5335l.isEmpty() || !this.f5337n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void mo5609u() {
        long j;
        long j2;
        boolean z = !this.f5331h.isEmpty();
        boolean z2 = !this.f5333j.isEmpty();
        boolean z3 = !this.f5334k.isEmpty();
        boolean z4 = !this.f5332i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f5331h.iterator();
            while (it.hasNext()) {
                m6908U((RecyclerView.C1734f0) it.next());
            }
            this.f5331h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5333j);
                this.f5336m.add(arrayList);
                this.f5333j.clear();
                C1786a aVar = new C1786a(arrayList);
                if (z) {
                    ViewCompat.m3605k0(((C1795j) arrayList.get(0)).f5376a.itemView, aVar, mo5603o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f5334k);
                this.f5337n.add(arrayList2);
                this.f5334k.clear();
                C1787b bVar = new C1787b(arrayList2);
                if (z) {
                    ViewCompat.m3605k0(((C1794i) arrayList2.get(0)).f5370a.itemView, bVar, mo5603o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f5332i);
                this.f5335l.add(arrayList3);
                this.f5332i.clear();
                C1788c cVar = new C1788c(arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = mo5603o();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = mo5602n();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = mo5601m();
                    }
                    ViewCompat.m3605k0(((RecyclerView.C1734f0) arrayList3.get(0)).itemView, cVar, j + Math.max(j2, j3));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo5947w(RecyclerView.C1734f0 f0Var) {
        m6912a0(f0Var);
        f0Var.itemView.setAlpha(Utils.FLOAT_EPSILON);
        this.f5332i.add(f0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo5948x(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2, int i, int i2, int i3, int i4) {
        if (f0Var == f0Var2) {
            return mo5949y(f0Var, i, i2, i3, i4);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        m6912a0(f0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            m6912a0(f0Var2);
            f0Var2.itemView.setTranslationX((float) (-i5));
            f0Var2.itemView.setTranslationY((float) (-i6));
            f0Var2.itemView.setAlpha(Utils.FLOAT_EPSILON);
        }
        this.f5334k.add(new C1794i(f0Var, f0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo5949y(RecyclerView.C1734f0 f0Var, int i, int i2, int i3, int i4) {
        View view = f0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) f0Var.itemView.getTranslationY());
        m6912a0(f0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo6060E(f0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f5333j.add(new C1795j(f0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo5950z(RecyclerView.C1734f0 f0Var) {
        m6912a0(f0Var);
        this.f5331h.add(f0Var);
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    private static class C1794i {

        /* renamed from: a */
        public RecyclerView.C1734f0 f5370a;

        /* renamed from: b */
        public RecyclerView.C1734f0 f5371b;

        /* renamed from: c */
        public int f5372c;

        /* renamed from: d */
        public int f5373d;

        /* renamed from: e */
        public int f5374e;

        /* renamed from: f */
        public int f5375f;

        private C1794i(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2) {
            this.f5370a = f0Var;
            this.f5371b = f0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5370a + ", newHolder=" + this.f5371b + ", fromX=" + this.f5372c + ", fromY=" + this.f5373d + ", toX=" + this.f5374e + ", toY=" + this.f5375f + '}';
        }

        C1794i(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2, int i, int i2, int i3, int i4) {
            this(f0Var, f0Var2);
            this.f5372c = i;
            this.f5373d = i2;
            this.f5374e = i3;
            this.f5375f = i4;
        }
    }
}
