package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7526b0;
import p202p0.C7530c0;
import p202p0.C7536d0;
import p202p0.C7545h0;
import p202p0.C7556l;
import p202p0.C7599u;
import p228r0.C8031c;
import p228r0.C8035e;
import p228r0.C8038f;
import p228r0.C8039g;

public class NavHostFragment extends Fragment {

    /* renamed from: i */
    public static final C1656a f4698i = new C1656a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7599u f4699d;

    /* renamed from: e */
    private Boolean f4700e;

    /* renamed from: f */
    private View f4701f;

    /* renamed from: g */
    private int f4702g;

    /* renamed from: h */
    private boolean f4703h;

    /* renamed from: androidx.navigation.fragment.NavHostFragment$a */
    public static final class C1656a {
        private C1656a() {
        }

        public /* synthetic */ C1656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7556l mo5012a(Fragment fragment) {
            C1483c cVar;
            Dialog n1;
            Window window;
            C41536l.m120489i(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof NavHostFragment) {
                    C7599u h1 = ((NavHostFragment) fragment2).f4699d;
                    if (h1 != null) {
                        return h1;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment D0 = fragment2.getParentFragmentManager().mo4360D0();
                if (D0 instanceof NavHostFragment) {
                    C7599u h12 = ((NavHostFragment) D0).f4699d;
                    if (h12 != null) {
                        return h12;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return C7526b0.m28618b(view);
            }
            View view2 = null;
            if (fragment instanceof C1483c) {
                cVar = (C1483c) fragment;
            } else {
                cVar = null;
            }
            if (!(cVar == null || (n1 = cVar.mo4579n1()) == null || (window = n1.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return C7526b0.m28618b(view2);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
    }

    /* renamed from: j1 */
    private final int m5772j1() {
        int id = getId();
        if (id == 0 || id == -1) {
            return C8038f.nav_host_fragment_container;
        }
        return id;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public C7530c0 mo5008i1() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return new C8035e(requireContext, childFragmentManager, m5772j1());
    }

    /* renamed from: k1 */
    public final C7556l mo5009k1() {
        C7599u uVar = this.f4699d;
        if (uVar == null) {
            throw new IllegalStateException("NavController is not available before onCreate()".toString());
        } else if (uVar != null) {
            return uVar;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public void mo5010l1(C7556l lVar) {
        C41536l.m120489i(lVar, "navController");
        C7536d0 G = lVar.mo22115G();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        G.mo22060c(new C8031c(requireContext, childFragmentManager));
        lVar.mo22115G().mo22060c(mo5008i1());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public void mo5011m1(C7599u uVar) {
        C41536l.m120489i(uVar, "navHostController");
        mo5010l1(uVar);
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (this.f4703h) {
            getParentFragmentManager().mo4428p().mo4525w(this).mo4515i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext()"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            p0.u r1 = new p0.u
            r1.<init>(r0)
            r6.f4699d = r1
            kotlin.jvm.internal.C41536l.m120486f(r1)
            r1.mo22134l0(r6)
        L_0x0016:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L_0x003e
            boolean r1 = r0 instanceof androidx.activity.C0162q
            if (r1 == 0) goto L_0x0032
            p0.u r1 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            androidx.activity.q r0 = (androidx.activity.C0162q) r0
            androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
            java.lang.String r2 = "context as OnBackPressed…).onBackPressedDispatcher"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            r1.mo22135m0(r0)
            goto L_0x003e
        L_0x0032:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            java.lang.String r1 = "context.baseContext"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            goto L_0x0016
        L_0x003e:
            p0.u r0 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r0)
            java.lang.Boolean r1 = r6.f4700e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x0053
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005b
            r1 = r2
            goto L_0x005c
        L_0x0053:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r7.<init>(r0)
            throw r7
        L_0x005b:
            r1 = r3
        L_0x005c:
            r0.mo22141t(r1)
            r0 = 0
            r6.f4700e = r0
            p0.u r1 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            androidx.lifecycle.t0 r4 = r6.getViewModelStore()
            java.lang.String r5 = "viewModelStore"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            r1.mo22136n0(r4)
            p0.u r1 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            r6.mo5011m1(r1)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r7 == 0) goto L_0x00a5
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r7.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r7.getBoolean(r5, r3)
            if (r5 == 0) goto L_0x009e
            r6.f4703h = r2
            androidx.fragment.app.FragmentManager r2 = r6.getParentFragmentManager()
            androidx.fragment.app.e0 r2 = r2.mo4428p()
            androidx.fragment.app.e0 r2 = r2.mo4525w(r6)
            r2.mo4515i()
        L_0x009e:
            int r2 = r7.getInt(r1)
            r6.f4702g = r2
            goto L_0x00a6
        L_0x00a5:
            r4 = r0
        L_0x00a6:
            if (r4 == 0) goto L_0x00b0
            p0.u r2 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r2)
            r2.mo22129f0(r4)
        L_0x00b0:
            int r2 = r6.f4702g
            if (r2 == 0) goto L_0x00bf
            p0.u r0 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r0)
            int r1 = r6.f4702g
            r0.mo22131i0(r1)
            goto L_0x00db
        L_0x00bf:
            android.os.Bundle r2 = r6.getArguments()
            if (r2 == 0) goto L_0x00c9
            int r3 = r2.getInt(r1)
        L_0x00c9:
            if (r2 == 0) goto L_0x00d1
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r2.getBundle(r0)
        L_0x00d1:
            if (r3 == 0) goto L_0x00db
            p0.u r1 = r6.f4699d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            r1.mo22132j0(r3, r0)
        L_0x00db:
            super.onCreate(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.NavHostFragment.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C41536l.m120488h(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(m5772j1());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f4701f;
        if (view != null && C7526b0.m28618b(view) == this.f4699d) {
            C7526b0.m28621e(view, (C7556l) null);
        }
        this.f4701f = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7545h0.f22005g);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(C7545h0.f22006h, 0);
        if (resourceId != 0) {
            this.f4702g = resourceId;
        }
        C41238w wVar = C41238w.f97225a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C8039g.f23185e);
        C41536l.m120488h(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(C8039g.f23186f, false)) {
            this.f4703h = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C7599u uVar = this.f4699d;
        if (uVar == null) {
            this.f4700e = Boolean.valueOf(z);
        } else if (uVar != null) {
            uVar.mo22141t(z);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C41536l.m120489i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C7599u uVar = this.f4699d;
        C41536l.m120486f(uVar);
        Bundle h0 = uVar.mo22130h0();
        if (h0 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", h0);
        }
        if (this.f4703h) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.f4702g;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            C7526b0.m28621e(view, this.f4699d);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f4701f = view2;
                    C41536l.m120486f(view2);
                    if (view2.getId() == getId()) {
                        View view3 = this.f4701f;
                        C41536l.m120486f(view3);
                        C7526b0.m28621e(view3, this.f4699d);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
