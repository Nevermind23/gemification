package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.p016os.C0909f;
import androidx.core.util.C1008h;
import androidx.core.view.C1136d1;
import androidx.core.view.C1145e3;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1509i;
import androidx.fragment.app.C1520l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.b */
class C1465b extends C1520l0 {

    /* renamed from: androidx.fragment.app.b$a */
    static /* synthetic */ class C1466a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4271a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.l0$e$c[] r0 = androidx.fragment.app.C1520l0.C1525e.C1528c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4271a = r0
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4271a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4271a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4271a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1465b.C1466a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    class C1467b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ List f4272d;

        /* renamed from: e */
        final /* synthetic */ C1520l0.C1525e f4273e;

        C1467b(List list, C1520l0.C1525e eVar) {
            this.f4272d = list;
            this.f4273e = eVar;
        }

        public void run() {
            if (this.f4272d.contains(this.f4273e)) {
                this.f4272d.remove(this.f4273e);
                C1465b.this.mo4529s(this.f4273e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    class C1468c extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f4275d;

        /* renamed from: e */
        final /* synthetic */ View f4276e;

        /* renamed from: f */
        final /* synthetic */ boolean f4277f;

        /* renamed from: g */
        final /* synthetic */ C1520l0.C1525e f4278g;

        /* renamed from: h */
        final /* synthetic */ C1477k f4279h;

        C1468c(ViewGroup viewGroup, View view, boolean z, C1520l0.C1525e eVar, C1477k kVar) {
            this.f4275d = viewGroup;
            this.f4276e = view;
            this.f4277f = z;
            this.f4278g = eVar;
            this.f4279h = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4275d.endViewTransition(this.f4276e);
            if (this.f4277f) {
                this.f4278g.mo4752e().mo4760a(this.f4276e);
            }
            this.f4279h.mo4544a();
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4278g + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    class C1469d implements C0909f.C0911b {

        /* renamed from: a */
        final /* synthetic */ Animator f4281a;

        /* renamed from: b */
        final /* synthetic */ C1520l0.C1525e f4282b;

        C1469d(Animator animator, C1520l0.C1525e eVar) {
            this.f4281a = animator;
            this.f4282b = eVar;
        }

        /* renamed from: a */
        public void mo3362a() {
            this.f4281a.end();
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4282b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    class C1470e implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C1520l0.C1525e f4284d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f4285e;

        /* renamed from: f */
        final /* synthetic */ View f4286f;

        /* renamed from: g */
        final /* synthetic */ C1477k f4287g;

        /* renamed from: androidx.fragment.app.b$e$a */
        class C1471a implements Runnable {
            C1471a() {
            }

            public void run() {
                C1470e eVar = C1470e.this;
                eVar.f4285e.endViewTransition(eVar.f4286f);
                C1470e.this.f4287g.mo4544a();
            }
        }

        C1470e(C1520l0.C1525e eVar, ViewGroup viewGroup, View view, C1477k kVar) {
            this.f4284d = eVar;
            this.f4285e = viewGroup;
            this.f4286f = view;
            this.f4287g = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f4285e.post(new C1471a());
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4284d + " has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4284d + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    class C1472f implements C0909f.C0911b {

        /* renamed from: a */
        final /* synthetic */ View f4290a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4291b;

        /* renamed from: c */
        final /* synthetic */ C1477k f4292c;

        /* renamed from: d */
        final /* synthetic */ C1520l0.C1525e f4293d;

        C1472f(View view, ViewGroup viewGroup, C1477k kVar, C1520l0.C1525e eVar) {
            this.f4290a = view;
            this.f4291b = viewGroup;
            this.f4292c = kVar;
            this.f4293d = eVar;
        }

        /* renamed from: a */
        public void mo3362a() {
            this.f4290a.clearAnimation();
            this.f4291b.endViewTransition(this.f4290a);
            this.f4292c.mo4544a();
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4293d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    class C1473g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1520l0.C1525e f4295d;

        /* renamed from: e */
        final /* synthetic */ C1520l0.C1525e f4296e;

        /* renamed from: f */
        final /* synthetic */ boolean f4297f;

        /* renamed from: g */
        final /* synthetic */ ArrayMap f4298g;

        C1473g(C1520l0.C1525e eVar, C1520l0.C1525e eVar2, boolean z, ArrayMap arrayMap) {
            this.f4295d = eVar;
            this.f4296e = eVar2;
            this.f4297f = z;
            this.f4298g = arrayMap;
        }

        public void run() {
            C1496f0.m5293a(this.f4295d.mo4753f(), this.f4296e.mo4753f(), this.f4297f, this.f4298g, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    class C1474h implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1507h0 f4300d;

        /* renamed from: e */
        final /* synthetic */ View f4301e;

        /* renamed from: f */
        final /* synthetic */ Rect f4302f;

        C1474h(C1507h0 h0Var, View view, Rect rect) {
            this.f4300d = h0Var;
            this.f4301e = view;
            this.f4302f = rect;
        }

        public void run() {
            this.f4300d.mo4703h(this.f4301e, this.f4302f);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    class C1475i implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f4304d;

        C1475i(ArrayList arrayList) {
            this.f4304d = arrayList;
        }

        public void run() {
            C1496f0.m5297e(this.f4304d, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    class C1476j implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1479m f4306d;

        /* renamed from: e */
        final /* synthetic */ C1520l0.C1525e f4307e;

        C1476j(C1479m mVar, C1520l0.C1525e eVar) {
            this.f4306d = mVar;
            this.f4307e = eVar;
        }

        public void run() {
            this.f4306d.mo4544a();
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f4307e + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    private static class C1477k extends C1478l {

        /* renamed from: c */
        private boolean f4309c;

        /* renamed from: d */
        private boolean f4310d = false;

        /* renamed from: e */
        private C1509i.C1510a f4311e;

        C1477k(C1520l0.C1525e eVar, C0909f fVar, boolean z) {
            super(eVar, fVar);
            this.f4309c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1509i.C1510a mo4543e(Context context) {
            boolean z;
            if (this.f4310d) {
                return this.f4311e;
            }
            Fragment f = mo4545b().mo4753f();
            if (mo4545b().mo4752e() == C1520l0.C1525e.C1528c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C1509i.C1510a b = C1509i.m5360b(context, f, z, this.f4309c);
            this.f4311e = b;
            this.f4310d = true;
            return b;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    private static class C1478l {

        /* renamed from: a */
        private final C1520l0.C1525e f4312a;

        /* renamed from: b */
        private final C0909f f4313b;

        C1478l(C1520l0.C1525e eVar, C0909f fVar) {
            this.f4312a = eVar;
            this.f4313b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4544a() {
            this.f4312a.mo4751d(this.f4313b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1520l0.C1525e mo4545b() {
            return this.f4312a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0909f mo4546c() {
            return this.f4313b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4547d() {
            C1520l0.C1525e.C1528c cVar;
            C1520l0.C1525e.C1528c c = C1520l0.C1525e.C1528c.m5429c(this.f4312a.mo4753f().mView);
            C1520l0.C1525e.C1528c e = this.f4312a.mo4752e();
            if (c == e || (c != (cVar = C1520l0.C1525e.C1528c.VISIBLE) && e != cVar)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    private static class C1479m extends C1478l {

        /* renamed from: c */
        private final Object f4314c;

        /* renamed from: d */
        private final boolean f4315d;

        /* renamed from: e */
        private final Object f4316e;

        C1479m(C1520l0.C1525e eVar, C0909f fVar, boolean z, boolean z2) {
            super(eVar, fVar);
            Object obj;
            Object obj2;
            boolean z3;
            if (eVar.mo4752e() == C1520l0.C1525e.C1528c.VISIBLE) {
                if (z) {
                    obj2 = eVar.mo4753f().getReenterTransition();
                } else {
                    obj2 = eVar.mo4753f().getEnterTransition();
                }
                this.f4314c = obj2;
                if (z) {
                    z3 = eVar.mo4753f().getAllowReturnTransitionOverlap();
                } else {
                    z3 = eVar.mo4753f().getAllowEnterTransitionOverlap();
                }
                this.f4315d = z3;
            } else {
                if (z) {
                    obj = eVar.mo4753f().getReturnTransition();
                } else {
                    obj = eVar.mo4753f().getExitTransition();
                }
                this.f4314c = obj;
                this.f4315d = true;
            }
            if (!z2) {
                this.f4316e = null;
            } else if (z) {
                this.f4316e = eVar.mo4753f().getSharedElementReturnTransition();
            } else {
                this.f4316e = eVar.mo4753f().getSharedElementEnterTransition();
            }
        }

        /* renamed from: f */
        private C1507h0 m5181f(Object obj) {
            if (obj == null) {
                return null;
            }
            C1507h0 h0Var = C1496f0.f4389a;
            if (h0Var != null && h0Var.mo4647e(obj)) {
                return h0Var;
            }
            C1507h0 h0Var2 = C1496f0.f4390b;
            if (h0Var2 != null && h0Var2.mo4647e(obj)) {
                return h0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo4545b().mo4753f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1507h0 mo4548e() {
            C1507h0 f = m5181f(this.f4314c);
            C1507h0 f2 = m5181f(this.f4316e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo4545b().mo4753f() + " returned Transition " + this.f4314c + " which uses a different Transition  type than its shared element transition " + this.f4316e);
            } else if (f != null) {
                return f;
            } else {
                return f2;
            }
        }

        /* renamed from: g */
        public Object mo4549g() {
            return this.f4316e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo4550h() {
            return this.f4314c;
        }

        /* renamed from: i */
        public boolean mo4551i() {
            return this.f4316e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo4552j() {
            return this.f4315d;
        }
    }

    C1465b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m5166w(List list, List list2, boolean z, Map map) {
        int i;
        Context context;
        boolean z2;
        View view;
        int i2;
        boolean z3;
        C1520l0.C1525e eVar;
        ViewGroup m = mo4742m();
        Context context2 = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z4 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C1477k kVar = (C1477k) it.next();
            if (kVar.mo4547d()) {
                kVar.mo4544a();
            } else {
                C1509i.C1510a e = kVar.mo4543e(context2);
                if (e == null) {
                    kVar.mo4544a();
                } else {
                    Animator animator = e.f4416b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        C1520l0.C1525e b = kVar.mo4545b();
                        Fragment f = b.mo4753f();
                        if (Boolean.TRUE.equals(map.get(b))) {
                            if (FragmentManager.m4954M0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                            }
                            kVar.mo4544a();
                        } else {
                            if (b.mo4752e() == C1520l0.C1525e.C1528c.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            List list3 = list2;
                            if (z3) {
                                list3.remove(b);
                            }
                            View view2 = f.mView;
                            m.startViewTransition(view2);
                            C1468c cVar = r0;
                            View view3 = view2;
                            C1520l0.C1525e eVar2 = b;
                            Animator animator2 = animator;
                            C1468c cVar2 = new C1468c(m, view3, z3, eVar2, kVar);
                            animator2.addListener(cVar2);
                            animator2.setTarget(view3);
                            animator2.start();
                            if (FragmentManager.m4954M0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                eVar = eVar2;
                                sb.append(eVar);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                eVar = eVar2;
                            }
                            kVar.mo4546c().mo3361c(new C1469d(animator2, eVar));
                            z4 = true;
                        }
                    }
                }
            }
            Map map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1477k kVar2 = (C1477k) it2.next();
            C1520l0.C1525e b2 = kVar2.mo4545b();
            Fragment f2 = b2.mo4753f();
            if (z) {
                if (FragmentManager.m4954M0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.mo4544a();
            } else if (z4) {
                if (FragmentManager.m4954M0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.mo4544a();
            } else {
                View view4 = f2.mView;
                Animation animation = (Animation) C1008h.m3530g(((C1509i.C1510a) C1008h.m3530g(kVar2.mo4543e(context2))).f4415a);
                if (b2.mo4752e() != C1520l0.C1525e.C1528c.REMOVED) {
                    view4.startAnimation(animation);
                    kVar2.mo4544a();
                    z2 = z4;
                    context = context2;
                    i2 = i;
                    view = view4;
                } else {
                    m.startViewTransition(view4);
                    C1470e eVar3 = r0;
                    z2 = z4;
                    C1509i.C1511b bVar = new C1509i.C1511b(animation, m, view4);
                    context = context2;
                    view = view4;
                    C1470e eVar4 = new C1470e(b2, m, view4, kVar2);
                    bVar.setAnimationListener(eVar3);
                    view.startAnimation(bVar);
                    i2 = 2;
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b2 + " has started.");
                    }
                }
                C0909f c = kVar2.mo4546c();
                C1472f fVar = r0;
                C1472f fVar2 = new C1472f(view, m, kVar2, b2);
                c.mo3361c(fVar);
                i = i2;
                z4 = z2;
                context2 = context;
            }
        }
    }

    /* renamed from: x */
    private Map m5167x(List list, List list2, boolean z, C1520l0.C1525e eVar, C1520l0.C1525e eVar2) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        String str3;
        Object obj;
        View view2;
        C1520l0.C1525e eVar3;
        Object obj2;
        Object obj3;
        ArrayMap arrayMap;
        C1507h0 h0Var;
        ArrayList arrayList3;
        View view3;
        HashMap hashMap;
        ArrayList arrayList4;
        Rect rect;
        C1520l0.C1525e eVar4;
        C1520l0.C1525e eVar5;
        SharedElementCallback sharedElementCallback;
        SharedElementCallback sharedElementCallback2;
        ArrayList<String> arrayList5;
        int i;
        View view4;
        View view5;
        String b;
        ArrayList<String> arrayList6;
        boolean z2 = z;
        C1520l0.C1525e eVar6 = eVar;
        C1520l0.C1525e eVar7 = eVar2;
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        C1507h0 h0Var2 = null;
        while (it.hasNext()) {
            C1479m mVar = (C1479m) it.next();
            if (!mVar.mo4547d()) {
                C1507h0 e = mVar.mo4548e();
                if (h0Var2 == null) {
                    h0Var2 = e;
                } else if (!(e == null || h0Var2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.mo4545b().mo4753f() + " returned Transition " + mVar.mo4550h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (h0Var2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1479m mVar2 = (C1479m) it2.next();
                hashMap2.put(mVar2.mo4545b(), Boolean.FALSE);
                mVar2.mo4544a();
            }
            return hashMap2;
        }
        View view6 = new View(mo4742m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        Iterator it3 = list.iterator();
        Object obj4 = null;
        View view7 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            C1479m mVar3 = (C1479m) it3.next();
            if (!mVar3.mo4551i() || eVar6 == null || eVar7 == null) {
                arrayMap = arrayMap2;
                eVar4 = eVar6;
                eVar5 = eVar7;
                hashMap = hashMap2;
                arrayList4 = arrayList7;
                view3 = view6;
                h0Var = h0Var2;
                arrayList3 = arrayList8;
                rect = rect2;
                view7 = view7;
            } else {
                Object u = h0Var2.mo4658u(h0Var2.mo4648f(mVar3.mo4549g()));
                ArrayList<String> sharedElementSourceNames = eVar2.mo4753f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.mo4753f().getSharedElementSourceNames();
                Object obj5 = u;
                ArrayList<String> sharedElementTargetNames = eVar.mo4753f().getSharedElementTargetNames();
                View view8 = view7;
                HashMap hashMap3 = hashMap2;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.mo4753f().getSharedElementTargetNames();
                if (!z2) {
                    sharedElementCallback2 = eVar.mo4753f().getExitTransitionCallback();
                    sharedElementCallback = eVar2.mo4753f().getEnterTransitionCallback();
                } else {
                    sharedElementCallback2 = eVar.mo4753f().getEnterTransitionCallback();
                    sharedElementCallback = eVar2.mo4753f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                View view9 = view6;
                int i3 = 0;
                while (i3 < size) {
                    arrayMap2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size = size;
                    rect2 = rect2;
                }
                Rect rect3 = rect2;
                if (FragmentManager.m4954M0(2)) {
                    Log.v(str, ">>> entering view names <<<");
                    for (Iterator<String> it4 = sharedElementTargetNames2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v(str, "Name: " + it4.next());
                    }
                    Log.v(str, ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v(str, "Name: " + it5.next());
                    }
                }
                ArrayMap arrayMap3 = new ArrayMap();
                mo4531u(arrayMap3, eVar.mo4753f().mView);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v(str, "Executing exit callback for operation " + eVar6);
                    }
                    sharedElementCallback2.mo3108d(sharedElementSourceNames, arrayMap3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str4 = sharedElementSourceNames.get(size2);
                        View view10 = (View) arrayMap3.get(str4);
                        if (view10 == null) {
                            arrayMap2.remove(str4);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str4.equals(ViewCompat.m3557J(view10))) {
                                arrayMap2.put(ViewCompat.m3557J(view10), (String) arrayMap2.remove(str4));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                ArrayMap arrayMap4 = new ArrayMap();
                mo4531u(arrayMap4, eVar2.mo4753f().mView);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (sharedElementCallback != null) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v(str, "Executing enter callback for operation " + eVar7);
                    }
                    sharedElementCallback.mo3108d(sharedElementTargetNames2, arrayMap4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str5 = sharedElementTargetNames2.get(size3);
                        View view11 = (View) arrayMap4.get(str5);
                        if (view11 == null) {
                            String b2 = C1496f0.m5294b(arrayMap2, str5);
                            if (b2 != null) {
                                arrayMap2.remove(b2);
                            }
                        } else if (!str5.equals(ViewCompat.m3557J(view11)) && (b = C1496f0.m5294b(arrayMap2, str5)) != null) {
                            arrayMap2.put(b, ViewCompat.m3557J(view11));
                        }
                    }
                } else {
                    C1496f0.m5296d(arrayMap2, arrayMap4);
                }
                mo4532v(arrayMap3, arrayMap2.keySet());
                mo4532v(arrayMap4, arrayMap2.values());
                if (arrayMap2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    arrayMap = arrayMap2;
                    arrayList3 = arrayList8;
                    eVar4 = eVar6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList7;
                    h0Var = h0Var2;
                    view7 = view8;
                    view3 = view9;
                    hashMap = hashMap3;
                    rect = rect3;
                    obj4 = null;
                } else {
                    C1496f0.m5293a(eVar2.mo4753f(), eVar.mo4753f(), z2, arrayMap3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    Object obj6 = obj5;
                    C1473g gVar = r0;
                    View view12 = view8;
                    ViewGroup m = mo4742m();
                    arrayMap = arrayMap2;
                    ArrayList arrayList11 = arrayList8;
                    C1473g gVar2 = new C1473g(eVar2, eVar, z, arrayMap4);
                    C1136d1.m4184a(m, gVar);
                    arrayList7.addAll(arrayMap3.values());
                    if (!arrayList5.isEmpty()) {
                        i = 0;
                        View view13 = (View) arrayMap3.get(arrayList5.get(0));
                        h0Var2.mo4654p(obj6, view13);
                        view7 = view13;
                    } else {
                        i = 0;
                        view7 = view12;
                    }
                    arrayList11.addAll(arrayMap4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) arrayMap4.get(sharedElementTargetNames2.get(i))) == null) {
                        rect = rect3;
                        view4 = view9;
                    } else {
                        rect = rect3;
                        C1136d1.m4184a(mo4742m(), new C1474h(h0Var2, view5, rect));
                        view4 = view9;
                        z3 = true;
                    }
                    h0Var2.mo4656s(obj6, view4, arrayList7);
                    arrayList4 = arrayList7;
                    view3 = view4;
                    obj4 = obj6;
                    h0Var = h0Var2;
                    h0Var2.mo4652n(obj6, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null, obj4, arrayList11);
                    Boolean bool = Boolean.TRUE;
                    eVar4 = eVar;
                    arrayList3 = arrayList11;
                    hashMap = hashMap3;
                    hashMap.put(eVar4, bool);
                    int i4 = i;
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                }
            }
            rect2 = rect;
            arrayList7 = arrayList4;
            view6 = view3;
            arrayList8 = arrayList3;
            h0Var2 = h0Var;
            z2 = z;
            eVar7 = eVar5;
            hashMap2 = hashMap;
            eVar6 = eVar4;
            arrayMap2 = arrayMap;
        }
        View view14 = view7;
        ArrayMap arrayMap5 = arrayMap2;
        C1520l0.C1525e eVar8 = eVar6;
        C1520l0.C1525e eVar9 = eVar7;
        HashMap hashMap4 = hashMap2;
        ArrayList arrayList12 = arrayList7;
        View view15 = view6;
        C1507h0 h0Var3 = h0Var2;
        ArrayList arrayList13 = arrayList8;
        Rect rect4 = rect2;
        ArrayList arrayList14 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj7 = null;
        Object obj8 = null;
        while (it6.hasNext()) {
            C1479m mVar4 = (C1479m) it6.next();
            if (mVar4.mo4547d()) {
                hashMap4.put(mVar4.mo4545b(), Boolean.FALSE);
                mVar4.mo4544a();
            } else {
                Object f = h0Var3.mo4648f(mVar4.mo4550h());
                C1520l0.C1525e b3 = mVar4.mo4545b();
                boolean z4 = obj4 != null && (b3 == eVar8 || b3 == eVar9);
                if (f == null) {
                    if (!z4) {
                        hashMap4.put(b3, Boolean.FALSE);
                        mVar4.mo4544a();
                    }
                    List list3 = list2;
                    str3 = str;
                    arrayList2 = arrayList12;
                    view = view15;
                    arrayList = arrayList13;
                    obj = obj7;
                    view2 = view14;
                } else {
                    str3 = str;
                    ArrayList arrayList15 = new ArrayList();
                    Object obj9 = obj7;
                    mo4530t(arrayList15, b3.mo4753f().mView);
                    if (z4) {
                        if (b3 == eVar8) {
                            arrayList15.removeAll(arrayList12);
                        } else {
                            arrayList15.removeAll(arrayList13);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        h0Var3.mo4644a(f, view15);
                        arrayList2 = arrayList12;
                        view = view15;
                        arrayList = arrayList13;
                        eVar3 = b3;
                        obj3 = obj8;
                        obj2 = f;
                        List list4 = list2;
                        obj = obj9;
                    } else {
                        h0Var3.mo4645b(f, arrayList15);
                        view = view15;
                        obj = obj9;
                        C1520l0.C1525e eVar10 = b3;
                        arrayList2 = arrayList12;
                        obj3 = obj8;
                        arrayList = arrayList13;
                        obj2 = f;
                        h0Var3.mo4652n(f, f, arrayList15, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null);
                        if (eVar10.mo4752e() == C1520l0.C1525e.C1528c.GONE) {
                            eVar3 = eVar10;
                            list2.remove(eVar3);
                            ArrayList arrayList16 = new ArrayList(arrayList15);
                            arrayList16.remove(eVar3.mo4753f().mView);
                            h0Var3.mo4651m(obj2, eVar3.mo4753f().mView, arrayList16);
                            C1136d1.m4184a(mo4742m(), new C1475i(arrayList15));
                        } else {
                            List list5 = list2;
                            eVar3 = eVar10;
                        }
                    }
                    if (eVar3.mo4752e() == C1520l0.C1525e.C1528c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z3) {
                            h0Var3.mo4653o(obj2, rect4);
                        }
                        view2 = view14;
                    } else {
                        view2 = view14;
                        h0Var3.mo4654p(obj2, view2);
                    }
                    hashMap4.put(eVar3, Boolean.TRUE);
                    if (mVar4.mo4552j()) {
                        obj3 = h0Var3.mo4650k(obj3, obj2, (Object) null);
                    } else {
                        obj = h0Var3.mo4650k(obj, obj2, (Object) null);
                    }
                    obj8 = obj3;
                }
                view14 = view2;
                obj7 = obj;
                str = str3;
                view15 = view;
                arrayList12 = arrayList2;
                arrayList13 = arrayList;
            }
        }
        String str6 = str;
        ArrayList arrayList17 = arrayList12;
        ArrayList arrayList18 = arrayList13;
        Object j = h0Var3.mo4649j(obj8, obj7, obj4);
        if (j == null) {
            return hashMap4;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            C1479m mVar5 = (C1479m) it7.next();
            if (!mVar5.mo4547d()) {
                Object h = mVar5.mo4550h();
                C1520l0.C1525e b4 = mVar5.mo4545b();
                boolean z5 = obj4 != null && (b4 == eVar8 || b4 == eVar9);
                if (h == null && !z5) {
                    str2 = str6;
                } else if (!ViewCompat.m3579V(mo4742m())) {
                    if (FragmentManager.m4954M0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + mo4742m() + " has not been laid out. Completing operation " + b4);
                    } else {
                        str2 = str6;
                    }
                    mVar5.mo4544a();
                } else {
                    str2 = str6;
                    h0Var3.mo4655q(mVar5.mo4545b().mo4753f(), j, mVar5.mo4546c(), new C1476j(mVar5, b4));
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (!ViewCompat.m3579V(mo4742m())) {
            return hashMap4;
        }
        C1496f0.m5297e(arrayList14, 4);
        ArrayList arrayList19 = arrayList18;
        ArrayList l = h0Var3.mo4704l(arrayList19);
        if (FragmentManager.m4954M0(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it8 = arrayList17.iterator();
            while (it8.hasNext()) {
                View view16 = (View) it8.next();
                Log.v(str7, "View: " + view16 + " Name: " + ViewCompat.m3557J(view16));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it9 = arrayList19.iterator();
            while (it9.hasNext()) {
                View view17 = (View) it9.next();
                Log.v(str7, "View: " + view17 + " Name: " + ViewCompat.m3557J(view17));
            }
        }
        h0Var3.mo4646c(mo4742m(), j);
        h0Var3.mo4705r(mo4742m(), arrayList17, arrayList19, l, arrayMap5);
        C1496f0.m5297e(arrayList14, 0);
        h0Var3.mo4657t(obj4, arrayList17, arrayList19);
        return hashMap4;
    }

    /* renamed from: y */
    private void m5168y(List list) {
        Fragment f = ((C1520l0.C1525e) list.get(list.size() - 1)).mo4753f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1520l0.C1525e eVar = (C1520l0.C1525e) it.next();
            eVar.mo4753f().mAnimationInfo.f4148c = f.mAnimationInfo.f4148c;
            eVar.mo4753f().mAnimationInfo.f4149d = f.mAnimationInfo.f4149d;
            eVar.mo4753f().mAnimationInfo.f4150e = f.mAnimationInfo.f4150e;
            eVar.mo4753f().mAnimationInfo.f4151f = f.mAnimationInfo.f4151f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4528f(List list, boolean z) {
        Iterator it = list.iterator();
        C1520l0.C1525e eVar = null;
        C1520l0.C1525e eVar2 = null;
        while (it.hasNext()) {
            C1520l0.C1525e eVar3 = (C1520l0.C1525e) it.next();
            C1520l0.C1525e.C1528c c = C1520l0.C1525e.C1528c.m5429c(eVar3.mo4753f().mView);
            int i = C1466a.f4271a[eVar3.mo4752e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C1520l0.C1525e.C1528c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i == 4 && c != C1520l0.C1525e.C1528c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C1520l0.C1525e> arrayList3 = new ArrayList<>(list);
        m5168y(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1520l0.C1525e eVar4 = (C1520l0.C1525e) it2.next();
            C0909f fVar = new C0909f();
            eVar4.mo4757j(fVar);
            arrayList.add(new C1477k(eVar4, fVar, z));
            C0909f fVar2 = new C0909f();
            eVar4.mo4757j(fVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new C1479m(eVar4, fVar2, z, z2));
                    eVar4.mo4749a(new C1467b(arrayList3, eVar4));
                }
            } else if (eVar4 != eVar2) {
                arrayList2.add(new C1479m(eVar4, fVar2, z, z2));
                eVar4.mo4749a(new C1467b(arrayList3, eVar4));
            }
            z2 = true;
            arrayList2.add(new C1479m(eVar4, fVar2, z, z2));
            eVar4.mo4749a(new C1467b(arrayList3, eVar4));
        }
        Map x = m5167x(arrayList2, arrayList3, z, eVar, eVar2);
        m5166w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C1520l0.C1525e s : arrayList3) {
            mo4529s(s);
        }
        arrayList3.clear();
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4529s(C1520l0.C1525e eVar) {
        eVar.mo4752e().mo4760a(eVar.mo4753f().mView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4530t(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C1145e3.m4205a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo4530t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4531u(Map map, View view) {
        String J = ViewCompat.m3557J(view);
        if (J != null) {
            map.put(J, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo4531u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4532v(ArrayMap arrayMap, Collection collection) {
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.m3557J((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
