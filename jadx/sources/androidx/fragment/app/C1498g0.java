package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0909f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.g0 */
class C1498g0 extends C1507h0 {

    /* renamed from: androidx.fragment.app.g0$a */
    class C1499a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4392a;

        C1499a(Rect rect) {
            this.f4392a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f4392a;
        }
    }

    /* renamed from: androidx.fragment.app.g0$b */
    class C1500b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4394a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4395b;

        C1500b(View view, ArrayList arrayList) {
            this.f4394a = view;
            this.f4395b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C1504f.m5317b(transition, this);
            this.f4394a.setVisibility(8);
            int size = this.f4395b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4395b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            C1504f.m5317b(transition, this);
            C1504f.m5316a(transition, this);
        }
    }

    /* renamed from: androidx.fragment.app.g0$c */
    class C1501c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4397a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4398b;

        /* renamed from: c */
        final /* synthetic */ Object f4399c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4400d;

        /* renamed from: e */
        final /* synthetic */ Object f4401e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4402f;

        C1501c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4397a = obj;
            this.f4398b = arrayList;
            this.f4399c = obj2;
            this.f4400d = arrayList2;
            this.f4401e = obj3;
            this.f4402f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            C1504f.m5317b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f4397a;
            if (obj != null) {
                C1498g0.this.mo4659w(obj, this.f4398b, (ArrayList) null);
            }
            Object obj2 = this.f4399c;
            if (obj2 != null) {
                C1498g0.this.mo4659w(obj2, this.f4400d, (ArrayList) null);
            }
            Object obj3 = this.f4401e;
            if (obj3 != null) {
                C1498g0.this.mo4659w(obj3, this.f4402f, (ArrayList) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.g0$d */
    class C1502d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4404a;

        C1502d(Runnable runnable) {
            this.f4404a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f4404a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.g0$e */
    class C1503e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4406a;

        C1503e(Rect rect) {
            this.f4406a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4406a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4406a;
        }
    }

    /* renamed from: androidx.fragment.app.g0$f */
    static class C1504f {
        /* renamed from: a */
        static void m5316a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        static void m5317b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    C1498g0() {
    }

    /* renamed from: v */
    private static boolean m5299v(Transition transition) {
        if (!C1507h0.m5340i(transition.getTargetIds()) || !C1507h0.m5340i(transition.getTargetNames()) || !C1507h0.m5340i(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4644a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo4645b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4645b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m5299v(transition) && C1507h0.m5340i(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4646c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo4647e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public Object mo4648f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: j */
    public Object mo4649j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: k */
    public Object mo4650k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: m */
    public void mo4651m(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1500b(view, arrayList));
    }

    /* renamed from: n */
    public void mo4652n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C1501c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: o */
    public void mo4653o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1503e(rect));
        }
    }

    /* renamed from: p */
    public void mo4654p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4703h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1499a(rect));
        }
    }

    /* renamed from: q */
    public void mo4655q(Fragment fragment, Object obj, C0909f fVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1502d(runnable));
    }

    /* renamed from: s */
    public void mo4656s(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1507h0.m5338d(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo4645b(transitionSet, arrayList);
    }

    /* renamed from: t */
    public void mo4657t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4659w(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public Object mo4658u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void mo4659w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo4659w(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m5299v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget((View) arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget((View) arrayList.get(size));
            }
        }
    }
}
