package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0172a;
import androidx.activity.result.C0173b;
import androidx.activity.result.C0174c;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0680c1;
import androidx.core.app.C0681d;
import androidx.core.app.C0683d1;
import androidx.core.app.C0690e1;
import androidx.core.app.C0704i;
import androidx.core.app.C0743u;
import androidx.core.content.C0785i;
import androidx.core.content.C0786j;
import androidx.core.p016os.C0904b;
import androidx.core.util.C1000a;
import androidx.core.view.C1114b0;
import androidx.core.view.C1141e0;
import androidx.core.view.C1242t0;
import androidx.lifecycle.C1572d0;
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
import androidx.savedstate.C1846a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.C0001b;
import p017b.C2101a;
import p047d1.C5797b;
import p163m0.C7047a;
import p163m0.C7052d;
import p306x0.C8931c;
import p306x0.C8933d;
import p306x0.C8934e;

public abstract class ComponentActivity extends C0704i implements C1638u0, C1591i, C8933d, C0162q, C0174c, C0785i, C0786j, C0680c1, C0683d1, C1114b0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C0000a mContextAwareHelper;
    private C1620q0.C1624b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final C1631s mLifecycleRegistry;
    private final C1141e0 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<C1000a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C1000a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C1000a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<C1000a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C1000a> mOnTrimMemoryListeners;
    final C8931c mSavedStateRegistryController;
    private C1636t0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0136a implements Runnable {
        C0136a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0137b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class C0138a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f1006d;

            /* renamed from: e */
            final /* synthetic */ C2101a.C2102a f1007e;

            C0138a(int i, C2101a.C2102a aVar) {
                this.f1006d = i;
                this.f1007e = aVar;
            }

            public void run() {
                C0137b.this.mo380c(this.f1006d, this.f1007e.mo6998a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class C0139b implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f1009d;

            /* renamed from: e */
            final /* synthetic */ IntentSender.SendIntentException f1010e;

            C0139b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f1009d = i;
                this.f1010e = sendIntentException;
            }

            public void run() {
                C0137b.this.mo379b(this.f1009d, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1010e));
            }
        }

        C0137b() {
        }

        /* renamed from: f */
        public void mo338f(int i, C2101a aVar, Object obj, C0681d dVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            C2101a.C2102a b = aVar.mo6997b(componentActivity, obj);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0138a(i, b));
                return;
            }
            Intent a = aVar.mo4464a(componentActivity, obj);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.m2589u(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    ActivityCompat.m2594z(componentActivity, intentSenderRequest.mo394e(), i, intentSenderRequest.mo390a(), intentSenderRequest.mo391b(), intentSenderRequest.mo392d(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0139b(i, e));
                }
            } else {
                ActivityCompat.m2593y(componentActivity, a, i, bundle);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static class C0140c {
        /* renamed from: a */
        static void m384a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    static class C0141d {
        /* renamed from: a */
        static OnBackInvokedDispatcher m385a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    static final class C0142e {

        /* renamed from: a */
        Object f1012a;

        /* renamed from: b */
        C1636t0 f1013b;

        C0142e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0000a();
        this.mMenuHostHelper = new C1141e0(new C0146b(this));
        this.mLifecycleRegistry = new C1631s(this);
        C8931c a = C8931c.m33145a(this);
        this.mSavedStateRegistryController = a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0136a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0137b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo4906a(new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    View view;
                    if (aVar == C1593j.C1594a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C0140c.m384a(view);
                        }
                    }
                }
            });
            getLifecycle().mo4906a(new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    if (aVar == C1593j.C1594a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.mo2b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo4952a();
                        }
                    }
                }
            });
            getLifecycle().mo4906a(new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo4909d(this);
                }
            });
            a.mo24349c();
            C1583g0.m5614c(this);
            if (i <= 23) {
                getLifecycle().mo4906a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo6116h(ACTIVITY_RESULT_TAG, new C0147c(this));
            addOnContextAvailableListener(new C0148d(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: w0 */
    private void m377w0() {
        C1641v0.m5722a(getWindow().getDecorView(), this);
        C1643w0.m5723a(getWindow().getDecorView(), this);
        C8934e.m33151a(getWindow().getDecorView(), this);
        C0175s.m459a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ Bundle m378x0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.mo382h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m379y0(Context context) {
        Bundle b = getSavedStateRegistry().mo6111b(ACTIVITY_RESULT_TAG);
        if (b != null) {
            this.mActivityResultRegistry.mo381g(b);
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m377w0();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(C1242t0 t0Var) {
        this.mMenuHostHelper.mo3698c(t0Var);
    }

    public final void addOnConfigurationChangedListener(C1000a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C0001b bVar) {
        this.mContextAwareHelper.mo1a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(C1000a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C1000a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C1000a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C1000a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0142e eVar = (C0142e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f1013b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C1636t0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C7047a getDefaultViewModelCreationExtras() {
        C7052d dVar = new C7052d();
        if (getApplication() != null) {
            dVar.mo21274c(C1620q0.C1621a.f4641g, getApplication());
        }
        dVar.mo21274c(C1583g0.f4589a, this);
        dVar.mo21274c(C1583g0.f4590b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.mo21274c(C1583g0.f4591c, getIntent().getExtras());
        }
        return dVar;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new C1599j0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0142e eVar = (C0142e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f1012a;
        }
        return null;
    }

    public C1593j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C1846a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo24348b();
    }

    public C1636t0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo379b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo345g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C1000a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo24350d(bundle);
        this.mContextAwareHelper.mo3c(this);
        super.onCreate(bundle);
        C1572d0.m5587e(this);
        if (C0904b.m3331c()) {
            this.mOnBackPressedDispatcher.mo346h(C0141d.m385a(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.mo3701h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.mo3703j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.mDispatchingOnMultiWindowModeChanged) {
            Iterator<C1000a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0743u(z));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<C1000a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.mo3702i(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.mDispatchingOnPictureInPictureModeChanged) {
            Iterator<C1000a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0690e1(z));
            }
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.mo3704k(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo379b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0142e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1636t0 t0Var = this.mViewModelStore;
        if (t0Var == null && (eVar = (C0142e) getLastNonConfigurationInstance()) != null) {
            t0Var = eVar.f1013b;
        }
        if (t0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0142e eVar2 = new C0142e();
        eVar2.f1012a = onRetainCustomNonConfigurationInstance;
        eVar2.f1013b = t0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C1593j lifecycle = getLifecycle();
        if (lifecycle instanceof C1631s) {
            ((C1631s) lifecycle).mo4943o(C1593j.C1598b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo24351e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C1000a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.mo4d();
    }

    public final <I, O> C0173b registerForActivityResult(C2101a aVar, ActivityResultRegistry activityResultRegistry, C0172a aVar2) {
        return activityResultRegistry.mo383i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void removeMenuProvider(C1242t0 t0Var) {
        this.mMenuHostHelper.mo3705l(t0Var);
    }

    public final void removeOnConfigurationChangedListener(C1000a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C0001b bVar) {
        this.mContextAwareHelper.mo5e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(C1000a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C1000a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C1000a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C1000a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C5797b.m23311d()) {
                C5797b.m23308a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            C5797b.m23309b();
        }
    }

    public void setContentView(int i) {
        m377w0();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(C1242t0 t0Var, C1619q qVar) {
        this.mMenuHostHelper.mo3699d(t0Var, qVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(C1242t0 t0Var, C1619q qVar, C1593j.C1598b bVar) {
        this.mMenuHostHelper.mo3700e(t0Var, qVar, bVar);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m377w0();
        super.setContentView(view);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<C1000a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0743u(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<C1000a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0690e1(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> C0173b registerForActivityResult(C2101a aVar, C0172a aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m377w0();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
