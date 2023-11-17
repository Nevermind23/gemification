package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0162q;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0174c;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0680c1;
import androidx.core.app.C0683d1;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.C0785i;
import androidx.core.content.C0786j;
import androidx.core.util.C1000a;
import androidx.core.view.C1114b0;
import androidx.core.view.C1242t0;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1631s;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.loader.app.C1647a;
import androidx.savedstate.C1846a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p306x0.C8933d;

/* renamed from: androidx.fragment.app.h */
public abstract class C1505h extends ComponentActivity implements ActivityCompat.C0657f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1631s mFragmentLifecycleRegistry = new C1631s(this);
    final C1517k mFragments = C1517k.m5376b(new C1506a());
    boolean mResumed;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.h$a */
    class C1506a extends C1529m implements C0785i, C0786j, C0680c1, C0683d1, C1638u0, C0162q, C0174c, C8933d, C1546y, C1114b0 {
        public C1506a() {
            super(C1505h.this);
        }

        /* renamed from: a */
        public void mo4461a(FragmentManager fragmentManager, Fragment fragment) {
            C1505h.this.onAttachFragment(fragment);
        }

        public void addMenuProvider(C1242t0 t0Var) {
            C1505h.this.addMenuProvider(t0Var);
        }

        public void addOnConfigurationChangedListener(C1000a aVar) {
            C1505h.this.addOnConfigurationChangedListener(aVar);
        }

        public void addOnMultiWindowModeChangedListener(C1000a aVar) {
            C1505h.this.addOnMultiWindowModeChangedListener(aVar);
        }

        public void addOnPictureInPictureModeChangedListener(C1000a aVar) {
            C1505h.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        public void addOnTrimMemoryListener(C1000a aVar) {
            C1505h.this.addOnTrimMemoryListener(aVar);
        }

        /* renamed from: c */
        public View mo4327c(int i) {
            return C1505h.this.findViewById(i);
        }

        /* renamed from: d */
        public boolean mo4328d() {
            Window window = C1505h.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return C1505h.this.getActivityResultRegistry();
        }

        public C1593j getLifecycle() {
            return C1505h.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C1505h.this.getOnBackPressedDispatcher();
        }

        public C1846a getSavedStateRegistry() {
            return C1505h.this.getSavedStateRegistry();
        }

        public C1636t0 getViewModelStore() {
            return C1505h.this.getViewModelStore();
        }

        /* renamed from: h */
        public void mo4696h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C1505h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: j */
        public LayoutInflater mo4698j() {
            return C1505h.this.getLayoutInflater().cloneInContext(C1505h.this);
        }

        /* renamed from: l */
        public boolean mo4699l(String str) {
            return ActivityCompat.m2592x(C1505h.this, str);
        }

        /* renamed from: o */
        public void mo4700o() {
            mo4701p();
        }

        /* renamed from: p */
        public void mo4701p() {
            C1505h.this.invalidateOptionsMenu();
        }

        /* renamed from: q */
        public C1505h mo4697i() {
            return C1505h.this;
        }

        public void removeMenuProvider(C1242t0 t0Var) {
            C1505h.this.removeMenuProvider(t0Var);
        }

        public void removeOnConfigurationChangedListener(C1000a aVar) {
            C1505h.this.removeOnConfigurationChangedListener(aVar);
        }

        public void removeOnMultiWindowModeChangedListener(C1000a aVar) {
            C1505h.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        public void removeOnPictureInPictureModeChangedListener(C1000a aVar) {
            C1505h.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        public void removeOnTrimMemoryListener(C1000a aVar) {
            C1505h.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public C1505h() {
        mo79599D0();
    }

    /* renamed from: D0 */
    private void mo79599D0() {
        getSavedStateRegistry().mo6116h(LIFECYCLE_TAG, new C1490d(this));
        addOnConfigurationChangedListener(new C1492e(this));
        addOnNewIntentListener(new C1495f(this));
        addOnContextAvailableListener(new C1497g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ Bundle m5322G0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ void m5323I0(Configuration configuration) {
        this.mFragments.mo4729m();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ void m5324J0(Intent intent) {
        this.mFragments.mo4729m();
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ void m5325K0(Context context) {
        this.mFragments.mo4718a((Fragment) null);
    }

    /* renamed from: L0 */
    private static boolean m5326L0(FragmentManager fragmentManager, C1593j.C1598b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.mo4446y0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= m5326L0(fragment.getChildFragmentManager(), bVar);
                }
                C1512i0 i0Var = fragment.mViewLifecycleOwner;
                if (i0Var != null && i0Var.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.STARTED)) {
                    fragment.mViewLifecycleOwner.mo4715f(bVar);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.mo4907b().mo4914b(C1593j.C1598b.STARTED)) {
                    fragment.mLifecycleRegistry.mo4943o(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo4730n(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                C1647a.m5726b(this).mo4961a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.mo4728l().mo4397Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.mo4728l();
    }

    @Deprecated
    public C1647a getSupportLoaderManager() {
        return C1647a.m5726b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (m5326L0(getSupportFragmentManager(), C1593j.C1598b.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo4729m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_CREATE);
        this.mFragments.mo4721e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo4722f();
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.mo4720d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo4723g();
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo4729m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.mo4729m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo4727k();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_RESUME);
        this.mFragments.mo4724h();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.mo4729m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo4719c();
        }
        this.mFragments.mo4727k();
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_START);
        this.mFragments.mo4725i();
    }

    public void onStateNotSaved() {
        this.mFragments.mo4729m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo4726j();
        this.mFragmentLifecycleRegistry.mo4941i(C1593j.C1594a.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m2590v(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.m2591w(this, sharedElementCallback);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            ActivityCompat.m2594z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.m2585q(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.m2587s(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.m2582A(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            ActivityCompat.m2593y(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public C1505h(int i) {
        super(i);
        mo79599D0();
    }
}
