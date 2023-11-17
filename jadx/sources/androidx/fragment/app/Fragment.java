package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0172a;
import androidx.activity.result.C0173b;
import androidx.activity.result.C0174c;
import androidx.core.app.C0681d;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.C1278z;
import androidx.lifecycle.C1583g0;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1599j0;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1631s;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1641v0;
import androidx.lifecycle.C1643w0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C1647a;
import androidx.savedstate.C1846a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p017b.C2101a;
import p098h0.C6415b;
import p123j.C6631a;
import p163m0.C7047a;
import p163m0.C7052d;
import p306x0.C8931c;
import p306x0.C8933d;
import p306x0.C8934e;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1619q, C1638u0, C1591i, C8933d {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1438j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C1620q0.C1624b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C1529m mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1631s mLifecycleRegistry;
    C1593j.C1598b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C1440l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final C1440l mSavedStateAttachListener;
    C8931c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C1512i0 mViewLifecycleOwner;
    C1644x mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C1429a extends C0173b {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f4129a;

        /* renamed from: b */
        final /* synthetic */ C2101a f4130b;

        C1429a(AtomicReference atomicReference, C2101a aVar) {
            this.f4129a = atomicReference;
            this.f4130b = aVar;
        }

        /* renamed from: b */
        public void mo386b(Object obj, C0681d dVar) {
            C0173b bVar = (C0173b) this.f4129a.get();
            if (bVar != null) {
                bVar.mo386b(obj, dVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: c */
        public void mo387c() {
            C0173b bVar = (C0173b) this.f4129a.getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo387c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C1430b implements Runnable {
        C1430b() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C1431c extends C1440l {
        C1431c() {
            super((C1430b) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4324a() {
            Fragment.this.mSavedStateRegistryController.mo24349c();
            C1583g0.m5614c(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C1432d implements Runnable {
        C1432d() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C1433e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1520l0 f4135d;

        C1433e(C1520l0 l0Var) {
            this.f4135d = l0Var;
        }

        public void run() {
            this.f4135d.mo4738g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    class C1434f extends C1513j {
        C1434f() {
        }

        /* renamed from: c */
        public View mo4327c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: d */
        public boolean mo4328d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    class C1435g implements C6631a {
        C1435g() {
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = Fragment.this;
            C1529m mVar = fragment.mHost;
            if (mVar instanceof C0174c) {
                return ((C0174c) mVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    class C1436h implements C6631a {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f4139a;

        C1436h(ActivityResultRegistry activityResultRegistry) {
            this.f4139a = activityResultRegistry;
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            return this.f4139a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    class C1437i extends C1440l {

        /* renamed from: a */
        final /* synthetic */ C6631a f4141a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f4142b;

        /* renamed from: c */
        final /* synthetic */ C2101a f4143c;

        /* renamed from: d */
        final /* synthetic */ C0172a f4144d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1437i(C6631a aVar, AtomicReference atomicReference, C2101a aVar2, C0172a aVar3) {
            super((C1430b) null);
            this.f4141a = aVar;
            this.f4142b = atomicReference;
            this.f4143c = aVar2;
            this.f4144d = aVar3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4324a() {
            this.f4142b.set(((ActivityResultRegistry) this.f4141a.apply((Object) null)).mo383i(Fragment.this.generateActivityResultKey(), Fragment.this, this.f4143c, this.f4144d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    static class C1438j {

        /* renamed from: a */
        View f4146a;

        /* renamed from: b */
        boolean f4147b;

        /* renamed from: c */
        int f4148c;

        /* renamed from: d */
        int f4149d;

        /* renamed from: e */
        int f4150e;

        /* renamed from: f */
        int f4151f;

        /* renamed from: g */
        int f4152g;

        /* renamed from: h */
        ArrayList f4153h;

        /* renamed from: i */
        ArrayList f4154i;

        /* renamed from: j */
        Object f4155j = null;

        /* renamed from: k */
        Object f4156k;

        /* renamed from: l */
        Object f4157l;

        /* renamed from: m */
        Object f4158m;

        /* renamed from: n */
        Object f4159n;

        /* renamed from: o */
        Object f4160o;

        /* renamed from: p */
        Boolean f4161p;

        /* renamed from: q */
        Boolean f4162q;

        /* renamed from: r */
        SharedElementCallback f4163r;

        /* renamed from: s */
        SharedElementCallback f4164s;

        /* renamed from: t */
        float f4165t;

        /* renamed from: u */
        View f4166u;

        /* renamed from: v */
        boolean f4167v;

        C1438j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4156k = obj;
            this.f4157l = null;
            this.f4158m = obj;
            this.f4159n = null;
            this.f4160o = obj;
            this.f4163r = null;
            this.f4164s = null;
            this.f4165t = 1.0f;
            this.f4166u = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    static class C1439k {
        /* renamed from: a */
        static void m4946a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    private static abstract class C1440l {
        private C1440l() {
        }

        /* synthetic */ C1440l(C1430b bVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4324a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1543w();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C1430b();
        this.mMaxState = C1593j.C1598b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1644x();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C1431c();
        m4930d1();
    }

    /* renamed from: a1 */
    private C1438j m4927a1() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C1438j();
        }
        return this.mAnimationInfo;
    }

    /* renamed from: b1 */
    private int m4928b1() {
        C1593j.C1598b bVar = this.mMaxState;
        if (bVar == C1593j.C1598b.INITIALIZED || this.mParentFragment == null) {
            return bVar.ordinal();
        }
        return Math.min(bVar.ordinal(), this.mParentFragment.m4928b1());
    }

    /* renamed from: c1 */
    private Fragment m4929c1(boolean z) {
        String str;
        if (z) {
            C6415b.m25487j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.mo4410h0(str);
    }

    /* renamed from: d1 */
    private void m4930d1() {
        this.mLifecycleRegistry = new C1631s(this);
        this.mSavedStateRegistryController = C8931c.m33145a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            m4932f1(this.mSavedStateAttachListener);
        }
    }

    /* renamed from: e1 */
    private C0173b m4931e1(C2101a aVar, C6631a aVar2, C0172a aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            m4932f1(new C1437i(aVar2, atomicReference, aVar, aVar3));
            return new C1429a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* renamed from: f1 */
    private void m4932f1(C1440l lVar) {
        if (this.mState >= 0) {
            lVar.mo4324a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    /* renamed from: g1 */
    private void m4933g1() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C1438j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f4167v = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            C1520l0 n = C1520l0.m5398n(viewGroup, fragmentManager);
            n.mo4743p();
            if (z) {
                this.mHost.mo4763g().post(new C1433e(n));
            } else {
                n.mo4738g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1513j createFragmentContainer() {
        return new C1434f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment c1 = m4929c1(false);
        if (c1 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c1);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            C1647a.m5726b(this).mo4961a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.mo4397Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo4421l0(str);
    }

    /* access modifiers changed from: package-private */
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final C1505h getActivity() {
        C1529m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (C1505h) mVar.mo4761e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f4162q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f4161p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4146a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        C1529m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.mo4762f();
    }

    public C7047a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C7052d dVar = new C7052d();
        if (application != null) {
            dVar.mo21274c(C1620q0.C1621a.f4641g, application);
        }
        dVar.mo21274c(C1583g0.f4589a, this);
        dVar.mo21274c(C1583g0.f4590b, this);
        if (getArguments() != null) {
            dVar.mo21274c(C1583g0.f4591c, getArguments());
        }
        return dVar;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m4954M0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C1599j0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public int getEnterAnim() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4148c;
    }

    public Object getEnterTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4155j;
    }

    /* access modifiers changed from: package-private */
    public SharedElementCallback getEnterTransitionCallback() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4163r;
    }

    /* access modifiers changed from: package-private */
    public int getExitAnim() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4149d;
    }

    public Object getExitTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4157l;
    }

    /* access modifiers changed from: package-private */
    public SharedElementCallback getExitTransitionCallback() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4164s;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4166u;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C1529m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.mo4697i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public C1593j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C1647a getLoaderManager() {
        return C1647a.m5726b(this);
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4152g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f4147b;
    }

    /* access modifiers changed from: package-private */
    public int getPopEnterAnim() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4150e;
    }

    /* access modifiers changed from: package-private */
    public int getPopExitAnim() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f4151f;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f4165t;
    }

    public Object getReenterTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4158m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C6415b.m25485h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4156k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final C1846a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo24348b();
    }

    public Object getSharedElementEnterTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f4159n;
    }

    public Object getSharedElementReturnTransition() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f4160o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f4153h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null || (arrayList = jVar.f4154i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return m4929c1(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C6415b.m25486i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C1619q getViewLifecycleOwner() {
        C1512i0 i0Var = this.mViewLifecycleOwner;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C1636t0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m4928b1() != C1593j.C1598b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.mo4371H0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        m4930d1();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1543w();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        if (this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.mo4386P0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (!this.mMenuVisible || ((fragmentManager = this.mFragmentManager) != null && !fragmentManager.mo4388Q0(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        C1438j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f4167v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo4394T0();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo4405d1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C1529m mVar = this.mHost;
        Activity e = mVar == null ? null : mVar.mo4761e();
        if (e != null) {
            this.mCalled = false;
            onAttach(e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo4392S0(1)) {
            this.mChildFragmentManager.mo4359D();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C1529m mVar = this.mHost;
        Activity e = mVar == null ? null : mVar.mo4761e();
        if (e != null) {
            this.mCalled = false;
            onInflate(e, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo4405d1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            m4933g1();
            this.mChildFragmentManager.mo4448z();
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        Iterator<C1440l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4324a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo4424n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.mo4762f());
        if (this.mCalled) {
            this.mFragmentManager.mo4375J(this);
            this.mChildFragmentManager.mo4350A();
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo4356C(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo4405d1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4906a(new C1606m() {
            /* renamed from: b */
            public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                View view;
                if (aVar == C1593j.C1594a.ON_STOP && (view = Fragment.this.mView) != null) {
                    C1439k.m4946a(view);
                }
            }
        });
        this.mSavedStateRegistryController.mo24350d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo4941i(C1593j.C1594a.ON_CREATE);
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.mo4362E(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.mo4405d1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1512i0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo4711b();
            C1641v0.m5722a(this.mView, this.mViewLifecycleOwner);
            C1643w0.m5723a(this.mView, this.mViewLifecycleOwner);
            C8934e.m33151a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo4826r(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo4712c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.mo4365F();
        this.mLifecycleRegistry.mo4941i(C1593j.C1594a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C1532n0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.mo4368G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.CREATED)) {
            this.mViewLifecycleOwner.mo4710a(C1593j.C1594a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C1647a.m5726b(this).mo4963d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C1532n0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.mo4381L0()) {
            this.mChildFragmentManager.mo4365F();
            this.mChildFragmentManager = new C1543w();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo4380L(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo4382M(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.mo4384O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4710a(C1593j.C1594a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo4941i(C1593j.C1594a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C1532n0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.mo4387Q(menu);
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean R0 = this.mFragmentManager.mo4390R0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != R0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(R0);
            onPrimaryNavigationFragmentChanged(R0);
            this.mChildFragmentManager.mo4389R();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.mo4405d1();
        this.mChildFragmentManager.mo4402c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C1631s sVar = this.mLifecycleRegistry;
            C1593j.C1594a aVar = C1593j.C1594a.ON_RESUME;
            sVar.mo4941i(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4710a(aVar);
            }
            this.mChildFragmentManager.mo4391S();
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo24351e(bundle);
        Bundle x1 = this.mChildFragmentManager.m4960U0();
        if (x1 != null) {
            bundle.putParcelable("android:support:fragments", x1);
        }
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.mo4405d1();
        this.mChildFragmentManager.mo4402c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C1631s sVar = this.mLifecycleRegistry;
            C1593j.C1594a aVar = C1593j.C1594a.ON_START;
            sVar.mo4941i(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo4710a(aVar);
            }
            this.mChildFragmentManager.mo4393T();
            return;
        }
        throw new C1532n0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.mo4395V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4710a(C1593j.C1594a.ON_STOP);
        }
        this.mLifecycleRegistry.mo4941i(C1593j.C1594a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C1532n0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo4396W();
    }

    public void postponeEnterTransition() {
        m4927a1().f4167v = true;
    }

    public final <I, O> C0173b registerForActivityResult(C2101a aVar, C0172a aVar2) {
        return m4931e1(aVar, new C1435g(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().mo4398Z0(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final C1505h requireActivity() {
        C1505h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.mo4440v1(parcelable);
            this.mChildFragmentManager.mo4359D();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo4713d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C1532n0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo4710a(C1593j.C1594a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        m4927a1().f4162q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        m4927a1().f4161p = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m4927a1().f4148c = i;
            m4927a1().f4149d = i2;
            m4927a1().f4150e = i3;
            m4927a1().f4151f = i4;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        m4927a1().f4163r = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        m4927a1().f4155j = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        m4927a1().f4164s = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        m4927a1().f4157l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setFocusedView(View view) {
        m4927a1().f4166u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo4700o();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f4128d) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo4700o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            m4927a1();
            this.mAnimationInfo.f4152g = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            m4927a1().f4147b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPostOnViewCreatedAlpha(float f) {
        m4927a1().f4165t = f;
    }

    public void setReenterTransition(Object obj) {
        m4927a1().f4158m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C6415b.m25488k(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.mo4420l(this);
        } else {
            fragmentManager.mo4433r1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m4927a1().f4156k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m4927a1().f4159n = obj;
    }

    /* access modifiers changed from: package-private */
    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4927a1();
        C1438j jVar = this.mAnimationInfo;
        jVar.f4153h = arrayList;
        jVar.f4154i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m4927a1().f4160o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C6415b.m25489l(this, fragment, i);
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 == null || fragmentManager == null || fragmentManager2 == fragmentManager) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.m4929c1(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        C6415b.m25490m(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.mo4407f1(fragmentManager.mo4442x(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 5 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C1529m mVar = this.mHost;
        if (mVar != null) {
            return mVar.mo4699l(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            if (FragmentManager.m4954M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
                Log.v("FragmentManager", sb.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().mo4401b1(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && m4927a1().f4167v) {
            if (this.mHost == null) {
                m4927a1().f4167v = false;
            } else if (Looper.myLooper() != this.mHost.mo4763g().getLooper()) {
                this.mHost.mo4763g().postAtFrontOfQueue(new C1432d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1428a();

        /* renamed from: d */
        final Bundle f4128d;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        class C1428a implements Parcelable.ClassLoaderCreator {
            C1428a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Bundle bundle) {
            this.f4128d = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f4128d);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4128d = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1519l.m5393d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        m4927a1().f4167v = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.mo4449z0().mo4763g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> C0173b registerForActivityResult(C2101a aVar, ActivityResultRegistry activityResultRegistry, C0172a aVar2) {
        return m4931e1(aVar, new C1436h(activityResultRegistry), aVar2);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C1529m mVar = this.mHost;
        if (mVar != null) {
            mVar.mo4765m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().mo4400a1(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C1529m mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater j = mVar.mo4698j();
            C1278z.m4422a(j, this.mChildFragmentManager.mo4351A0());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
