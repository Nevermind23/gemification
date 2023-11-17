package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1520l0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1638u0;
import p085g0.C6199b;

/* renamed from: androidx.fragment.app.b0 */
class C1480b0 {

    /* renamed from: a */
    private final C1536q f4317a;

    /* renamed from: b */
    private final C1491d0 f4318b;

    /* renamed from: c */
    private final Fragment f4319c;

    /* renamed from: d */
    private boolean f4320d = false;

    /* renamed from: e */
    private int f4321e = -1;

    /* renamed from: androidx.fragment.app.b0$a */
    class C1481a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ View f4322d;

        C1481a(View view) {
            this.f4322d = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f4322d.removeOnAttachStateChangeListener(this);
            ViewCompat.m3613o0(this.f4322d);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.b0$b */
    static /* synthetic */ class C1482b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4324a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.j$b[] r0 = androidx.lifecycle.C1593j.C1598b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4324a = r0
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4324a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4324a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4324a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1593j.C1598b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1480b0.C1482b.<clinit>():void");
        }
    }

    C1480b0(C1536q qVar, C1491d0 d0Var, Fragment fragment) {
        this.f4317a = qVar;
        this.f4318b = d0Var;
        this.f4319c = fragment;
    }

    /* renamed from: l */
    private boolean m5187l(View view) {
        if (view == this.f4319c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4319c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m5188q() {
        Bundle bundle = new Bundle();
        this.f4319c.performSaveInstanceState(bundle);
        this.f4317a.mo4780j(this.f4319c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4319c.mView != null) {
            mo4570t();
        }
        if (this.f4319c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4319c.mSavedViewState);
        }
        if (this.f4319c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4319c.mSavedViewRegistryState);
        }
        if (!this.f4319c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4319c.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4553a() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4319c);
        }
        Fragment fragment = this.f4319c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1536q qVar = this.f4317a;
        Fragment fragment2 = this.f4319c;
        qVar.mo4771a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4554b() {
        int j = this.f4318b.mo4614j(this.f4319c);
        Fragment fragment = this.f4319c;
        fragment.mContainer.addView(fragment.mView, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4555c() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4319c);
        }
        Fragment fragment = this.f4319c;
        Fragment fragment2 = fragment.mTarget;
        C1480b0 b0Var = null;
        if (fragment2 != null) {
            C1480b0 n = this.f4318b.mo4618n(fragment2.mWho);
            if (n != null) {
                Fragment fragment3 = this.f4319c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                b0Var = n;
            } else {
                throw new IllegalStateException("Fragment " + this.f4319c + " declared target fragment " + this.f4319c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (b0Var = this.f4318b.mo4618n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4319c + " declared target fragment " + this.f4319c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (b0Var != null) {
            b0Var.mo4564m();
        }
        Fragment fragment4 = this.f4319c;
        fragment4.mHost = fragment4.mFragmentManager.mo4449z0();
        Fragment fragment5 = this.f4319c;
        fragment5.mParentFragment = fragment5.mFragmentManager.mo4357C0();
        this.f4317a.mo4777g(this.f4319c, false);
        this.f4319c.performAttach();
        this.f4317a.mo4772b(this.f4319c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo4556d() {
        C1520l0.C1525e.C1527b bVar;
        Fragment fragment = this.f4319c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f4321e;
        int i2 = C1482b.f4324a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.f4319c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f4321e, 2);
                View view = this.f4319c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4321e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f4319c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f4319c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            bVar = C1520l0.m5398n(viewGroup, fragment3.getParentFragmentManager()).mo4741l(this);
        } else {
            bVar = null;
        }
        if (bVar == C1520l0.C1525e.C1527b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C1520l0.C1525e.C1527b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f4319c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f4319c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f4319c);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4557e() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4319c);
        }
        Fragment fragment = this.f4319c;
        if (!fragment.mIsCreated) {
            this.f4317a.mo4778h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f4319c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C1536q qVar = this.f4317a;
            Fragment fragment3 = this.f4319c;
            qVar.mo4773c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f4319c.mState = 1;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4558f() {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.f4319c
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m4954M0(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r7.f4319c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x0026:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.os.Bundle r2 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            androidx.fragment.app.Fragment r2 = r7.f4319c
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 == 0) goto L_0x0036
            goto L_0x00c0
        L_0x0036:
            int r3 = r2.mContainerId
            if (r3 == 0) goto L_0x00bf
            r4 = -1
            if (r3 == r4) goto L_0x00a1
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.j r2 = r2.mo4434t0()
            androidx.fragment.app.Fragment r3 = r7.f4319c
            int r3 = r3.mContainerId
            android.view.View r2 = r2.mo4327c(r3)
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L_0x0097
            androidx.fragment.app.Fragment r2 = r7.f4319c
            boolean r4 = r2.mRestored
            if (r4 == 0) goto L_0x0057
            goto L_0x00c0
        L_0x0057:
            android.content.res.Resources r0 = r2.getResources()     // Catch:{ NotFoundException -> 0x0064 }
            androidx.fragment.app.Fragment r1 = r7.f4319c     // Catch:{ NotFoundException -> 0x0064 }
            int r1 = r1.mContainerId     // Catch:{ NotFoundException -> 0x0064 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "unknown"
        L_0x0066:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r7.f4319c
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.f4319c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0097:
            boolean r2 = r3 instanceof androidx.fragment.app.FragmentContainerView
            if (r2 != 0) goto L_0x00c0
            androidx.fragment.app.Fragment r2 = r7.f4319c
            p098h0.C6415b.m25491n(r2, r3)
            goto L_0x00c0
        L_0x00a1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r7.f4319c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            androidx.fragment.app.Fragment r2 = r7.f4319c
            r2.mContainer = r3
            android.os.Bundle r4 = r2.mSavedFragmentState
            r2.performCreateView(r0, r3, r4)
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            r2 = 2
            if (r0 == 0) goto L_0x0173
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r5 = r0.mView
            int r6 = p085g0.C6199b.f19204a
            r5.setTag(r6, r0)
            if (r3 == 0) goto L_0x00e2
            r7.mo4554b()
        L_0x00e2:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            boolean r3 = r0.mHidden
            if (r3 == 0) goto L_0x00ef
            android.view.View r0 = r0.mView
            r3 = 8
            r0.setVisibility(r3)
        L_0x00ef:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.m3578U(r0)
            if (r0 == 0) goto L_0x0101
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.m3613o0(r0)
            goto L_0x010d
        L_0x0101:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            androidx.fragment.app.b0$a r3 = new androidx.fragment.app.b0$a
            r3.<init>(r0)
            r0.addOnAttachStateChangeListener(r3)
        L_0x010d:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            r0.performViewCreated()
            androidx.fragment.app.q r0 = r7.f4317a
            androidx.fragment.app.Fragment r3 = r7.f4319c
            android.view.View r5 = r3.mView
            android.os.Bundle r6 = r3.mSavedFragmentState
            r0.mo4783m(r3, r5, r6, r4)
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r3 = r7.f4319c
            android.view.View r3 = r3.mView
            float r3 = r3.getAlpha()
            androidx.fragment.app.Fragment r4 = r7.f4319c
            r4.setPostOnViewCreatedAlpha(r3)
            androidx.fragment.app.Fragment r3 = r7.f4319c
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 == 0) goto L_0x0173
            if (r0 != 0) goto L_0x0173
            android.view.View r0 = r3.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x016b
            androidx.fragment.app.Fragment r3 = r7.f4319c
            r3.setFocusedView(r0)
            boolean r3 = androidx.fragment.app.FragmentManager.m4954M0(r2)
            if (r3 == 0) goto L_0x016b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Saved focused view "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " for Fragment "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r7.f4319c
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r1, r0)
        L_0x016b:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
        L_0x0173:
            androidx.fragment.app.Fragment r0 = r7.f4319c
            r0.mState = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1480b0.mo4558f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4559g() {
        boolean z;
        boolean z2;
        Fragment f;
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4319c);
        }
        Fragment fragment = this.f4319c;
        boolean z3 = true;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Fragment fragment2 = this.f4319c;
            if (!fragment2.mBeingSaved) {
                this.f4318b.mo4604B(fragment2.mWho, (FragmentState) null);
            }
        }
        if (z || this.f4318b.mo4620p().mo4801pw(this.f4319c)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C1529m mVar = this.f4319c.mHost;
            if (mVar instanceof C1638u0) {
                z3 = this.f4318b.mo4620p().mo4797mw();
            } else if (mVar.mo4762f() instanceof Activity) {
                z3 = true ^ ((Activity) mVar.mo4762f()).isChangingConfigurations();
            }
            if ((z && !this.f4319c.mBeingSaved) || z3) {
                this.f4318b.mo4620p().mo4790ew(this.f4319c);
            }
            this.f4319c.performDestroy();
            this.f4317a.mo4774d(this.f4319c, false);
            for (C1480b0 b0Var : this.f4318b.mo4615k()) {
                if (b0Var != null) {
                    Fragment k = b0Var.mo4563k();
                    if (this.f4319c.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.f4319c;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f4319c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f4318b.mo4610f(str);
            }
            this.f4318b.mo4623s(this);
            return;
        }
        String str2 = this.f4319c.mTargetWho;
        if (!(str2 == null || (f = this.f4318b.mo4610f(str2)) == null || !f.mRetainInstance)) {
            this.f4319c.mTarget = f;
        }
        this.f4319c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4560h() {
        View view;
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4319c);
        }
        Fragment fragment = this.f4319c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f4319c.performDestroyView();
        this.f4317a.mo4784n(this.f4319c, false);
        Fragment fragment2 = this.f4319c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo4826r((Object) null);
        this.f4319c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4561i() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4319c);
        }
        this.f4319c.performDetach();
        boolean z = false;
        this.f4317a.mo4775e(this.f4319c, false);
        Fragment fragment = this.f4319c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f4318b.mo4620p().mo4801pw(this.f4319c)) {
            if (FragmentManager.m4954M0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4319c);
            }
            this.f4319c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4562j() {
        Fragment fragment = this.f4319c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m4954M0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4319c);
            }
            Fragment fragment2 = this.f4319c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f4319c.mSavedFragmentState);
            View view = this.f4319c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4319c;
                fragment3.mView.setTag(C6199b.f19204a, fragment3);
                Fragment fragment4 = this.f4319c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4319c.performViewCreated();
                C1536q qVar = this.f4317a;
                Fragment fragment5 = this.f4319c;
                qVar.mo4783m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4319c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo4563k() {
        return this.f4319c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4564m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f4320d) {
            try {
                this.f4320d = true;
                boolean z = false;
                while (true) {
                    int d = mo4556d();
                    Fragment fragment = this.f4319c;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo4561i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved && this.f4318b.mo4621q(fragment.mWho) == null) {
                                        mo4569s();
                                    }
                                    mo4559g();
                                    break;
                                case 1:
                                    mo4560h();
                                    this.f4319c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m4954M0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4319c);
                                    }
                                    Fragment fragment2 = this.f4319c;
                                    if (fragment2.mBeingSaved) {
                                        mo4569s();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo4570t();
                                    }
                                    Fragment fragment3 = this.f4319c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        C1520l0.m5398n(viewGroup2, fragment3.getParentFragmentManager()).mo4736d(this);
                                    }
                                    this.f4319c.mState = 3;
                                    break;
                                case 4:
                                    mo4573w();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    mo4565n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo4555c();
                                    break;
                                case 1:
                                    mo4557e();
                                    break;
                                case 2:
                                    mo4562j();
                                    mo4558f();
                                    break;
                                case 3:
                                    mo4553a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        C1520l0.m5398n(viewGroup3, fragment.getParentFragmentManager()).mo4734b(C1520l0.C1525e.C1528c.m5428b(this.f4319c.mView.getVisibility()), this);
                                    }
                                    this.f4319c.mState = 4;
                                    break;
                                case 5:
                                    mo4572v();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo4567p();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4319c.mBeingSaved) {
                            if (FragmentManager.m4954M0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4319c);
                            }
                            this.f4318b.mo4620p().mo4790ew(this.f4319c);
                            this.f4318b.mo4623s(this);
                            if (FragmentManager.m4954M0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f4319c);
                            }
                            this.f4319c.initState();
                        }
                        Fragment fragment4 = this.f4319c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                C1520l0 n = C1520l0.m5398n(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f4319c.mHidden) {
                                    n.mo4735c(this);
                                } else {
                                    n.mo4737e(this);
                                }
                            }
                            Fragment fragment5 = this.f4319c;
                            FragmentManager fragmentManager = fragment5.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.mo4379K0(fragment5);
                            }
                            Fragment fragment6 = this.f4319c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f4319c.mChildFragmentManager.mo4378K();
                        }
                        this.f4320d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f4320d = false;
                throw th;
            }
        } else if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo4563k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4565n() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4319c);
        }
        this.f4319c.performPause();
        this.f4317a.mo4776f(this.f4319c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4566o(ClassLoader classLoader) {
        Bundle bundle = this.f4319c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f4319c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f4319c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f4319c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f4319c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f4319c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f4319c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f4319c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4567p() {
        String str;
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4319c);
        }
        View focusedView = this.f4319c.getFocusedView();
        if (focusedView != null && m5187l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m4954M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.f4319c);
                sb.append(" resulting in focused view ");
                sb.append(this.f4319c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f4319c.setFocusedView((View) null);
        this.f4319c.performResume();
        this.f4317a.mo4779i(this.f4319c, false);
        Fragment fragment = this.f4319c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Fragment.SavedState mo4568r() {
        Bundle q;
        if (this.f4319c.mState <= -1 || (q = m5188q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4569s() {
        FragmentState fragmentState = new FragmentState(this.f4319c);
        Fragment fragment = this.f4319c;
        if (fragment.mState <= -1 || fragmentState.f4265p != null) {
            fragmentState.f4265p = fragment.mSavedFragmentState;
        } else {
            Bundle q = m5188q();
            fragmentState.f4265p = q;
            if (this.f4319c.mTargetWho != null) {
                if (q == null) {
                    fragmentState.f4265p = new Bundle();
                }
                fragmentState.f4265p.putString("android:target_state", this.f4319c.mTargetWho);
                int i = this.f4319c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f4265p.putInt("android:target_req_state", i);
                }
            }
        }
        this.f4318b.mo4604B(this.f4319c.mWho, fragmentState);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4570t() {
        if (this.f4319c.mView != null) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f4319c + " with view " + this.f4319c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f4319c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f4319c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f4319c.mViewLifecycleOwner.mo4714e(bundle);
            if (!bundle.isEmpty()) {
                this.f4319c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4571u(int i) {
        this.f4321e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4572v() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4319c);
        }
        this.f4319c.performStart();
        this.f4317a.mo4781k(this.f4319c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4573w() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4319c);
        }
        this.f4319c.performStop();
        this.f4317a.mo4782l(this.f4319c, false);
    }

    C1480b0(C1536q qVar, C1491d0 d0Var, ClassLoader classLoader, C1519l lVar, FragmentState fragmentState) {
        this.f4317a = qVar;
        this.f4318b = d0Var;
        Fragment a = fragmentState.mo4492a(lVar, classLoader);
        this.f4319c = a;
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    C1480b0(C1536q qVar, C1491d0 d0Var, Fragment fragment, FragmentState fragmentState) {
        this.f4317a = qVar;
        this.f4318b = d0Var;
        this.f4319c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f4265p;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
