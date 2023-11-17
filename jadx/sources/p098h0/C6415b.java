package p098h0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h0.b */
public final class C6415b {

    /* renamed from: a */
    public static final C6415b f19670a = new C6415b();

    /* renamed from: b */
    private static C6418c f19671b = C6418c.f19682d;

    /* renamed from: h0.b$a */
    public enum C6416a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: h0.b$b */
    public interface C6417b {
    }

    /* renamed from: h0.b$c */
    public static final class C6418c {

        /* renamed from: c */
        public static final C6419a f19681c = new C6419a((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final C6418c f19682d = new C6418c(C41357x0.m119985e(), (C6417b) null, C41344r0.m119928j());

        /* renamed from: a */
        private final Set f19683a;

        /* renamed from: b */
        private final Map f19684b;

        /* renamed from: h0.b$c$a */
        public static final class C6419a {
            private C6419a() {
            }

            public /* synthetic */ C6419a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C6418c(Set set, C6417b bVar, Map map) {
            C41536l.m120489i(set, "flags");
            C41536l.m120489i(map, "allowedViolations");
            this.f19683a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f19684b = linkedHashMap;
        }

        /* renamed from: a */
        public final Set mo20297a() {
            return this.f19683a;
        }

        /* renamed from: b */
        public final C6417b mo20298b() {
            return null;
        }

        /* renamed from: c */
        public final Map mo20299c() {
            return this.f19684b;
        }
    }

    private C6415b() {
    }

    /* renamed from: b */
    private final C6418c m25479b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                C41536l.m120488h(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.mo4366F0() != null) {
                    C6418c F0 = parentFragmentManager.mo4366F0();
                    C41536l.m120486f(F0);
                    return F0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f19671b;
    }

    /* renamed from: c */
    private final void m25480c(C6418c cVar, Violation violation) {
        Fragment a = violation.mo4787a();
        String name = a.getClass().getName();
        if (cVar.mo20297a().contains(C6416a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.mo20298b();
        if (cVar.mo20297a().contains(C6416a.PENALTY_DEATH)) {
            m25492o(a, new C6414a(name, violation));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m25481d(String str, Violation violation) {
        C41536l.m120489i(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* renamed from: e */
    private final void m25482e(Violation violation) {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.mo4787a().getClass().getName(), violation);
        }
    }

    /* renamed from: f */
    public static final void m25483f(Fragment fragment, String str) {
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        C6415b bVar = f19670a;
        bVar.m25482e(fragmentReuseViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_FRAGMENT_REUSE) && bVar.m25493p(b, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.m25480c(b, fragmentReuseViolation);
        }
    }

    /* renamed from: g */
    public static final void m25484g(Fragment fragment, ViewGroup viewGroup) {
        C41536l.m120489i(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        C6415b bVar = f19670a;
        bVar.m25482e(fragmentTagUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_FRAGMENT_TAG_USAGE) && bVar.m25493p(b, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.m25480c(b, fragmentTagUsageViolation);
        }
    }

    /* renamed from: h */
    public static final void m25485h(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        C6415b bVar = f19670a;
        bVar.m25482e(getRetainInstanceUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.m25493p(b, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            bVar.m25480c(b, getRetainInstanceUsageViolation);
        }
    }

    /* renamed from: i */
    public static final void m25486i(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        C6415b bVar = f19670a;
        bVar.m25482e(getTargetFragmentRequestCodeUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.m25493p(b, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            bVar.m25480c(b, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* renamed from: j */
    public static final void m25487j(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        C6415b bVar = f19670a;
        bVar.m25482e(getTargetFragmentUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.m25493p(b, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.m25480c(b, getTargetFragmentUsageViolation);
        }
    }

    /* renamed from: k */
    public static final void m25488k(Fragment fragment) {
        C41536l.m120489i(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        C6415b bVar = f19670a;
        bVar.m25482e(setRetainInstanceUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.m25493p(b, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            bVar.m25480c(b, setRetainInstanceUsageViolation);
        }
    }

    /* renamed from: l */
    public static final void m25489l(Fragment fragment, Fragment fragment2, int i) {
        C41536l.m120489i(fragment, "violatingFragment");
        C41536l.m120489i(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        C6415b bVar = f19670a;
        bVar.m25482e(setTargetFragmentUsageViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.m25493p(b, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.m25480c(b, setTargetFragmentUsageViolation);
        }
    }

    /* renamed from: m */
    public static final void m25490m(Fragment fragment, boolean z) {
        C41536l.m120489i(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        C6415b bVar = f19670a;
        bVar.m25482e(setUserVisibleHintViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_SET_USER_VISIBLE_HINT) && bVar.m25493p(b, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            bVar.m25480c(b, setUserVisibleHintViolation);
        }
    }

    /* renamed from: n */
    public static final void m25491n(Fragment fragment, ViewGroup viewGroup) {
        C41536l.m120489i(fragment, "fragment");
        C41536l.m120489i(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        C6415b bVar = f19670a;
        bVar.m25482e(wrongFragmentContainerViolation);
        C6418c b = bVar.m25479b(fragment);
        if (b.mo20297a().contains(C6416a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.m25493p(b, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.m25480c(b, wrongFragmentContainerViolation);
        }
    }

    /* renamed from: o */
    private final void m25492o(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g = fragment.getParentFragmentManager().mo4449z0().mo4763g();
            C41536l.m120488h(g, "fragment.parentFragmentManager.host.handler");
            if (C41536l.m120484d(g.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                g.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* renamed from: p */
    private final boolean m25493p(C6418c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.mo20299c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C41536l.m120484d(cls2.getSuperclass(), Violation.class) || !C41358y.m119999O(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
