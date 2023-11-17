package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0175s;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.widget.C0413c2;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.C0707i1;
import androidx.core.app.C0745v;
import androidx.core.p016os.C0918j;
import androidx.fragment.app.C1505h;
import androidx.lifecycle.C1641v0;
import androidx.lifecycle.C1643w0;
import androidx.savedstate.C1846a;
import p000a.C0001b;
import p306x0.C8934e;

/* renamed from: androidx.appcompat.app.d */
public abstract class C0218d extends C1505h implements C0227e, C0707i1.C0708a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private C0238h mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.d$a */
    class C0219a implements C1846a.C1849c {
        C0219a() {
        }

        /* renamed from: a */
        public Bundle mo350a() {
            Bundle bundle = new Bundle();
            C0218d.this.getDelegate().mo435E(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    class C0220b implements C0001b {
        C0220b() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C0238h delegate = C0218d.this.getDelegate();
            delegate.mo489v();
            delegate.mo431A(C0218d.this.getSavedStateRegistry().mo6111b(C0218d.DELEGATE_TAG));
        }
    }

    public C0218d() {
        m681M0();
    }

    /* renamed from: M0 */
    private void m681M0() {
        getSavedStateRegistry().mo6116h(DELEGATE_TAG, new C0219a());
        addOnContextAvailableListener(new C0220b());
    }

    /* renamed from: N0 */
    private boolean m682N0(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    private void m683w0() {
        C1641v0.m5722a(getWindow().getDecorView(), this);
        C1643w0.m5723a(getWindow().getDecorView(), this);
        C8934e.m33151a(getWindow().getDecorView(), this);
        C0175s.m459a(getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m683w0();
        getDelegate().mo467e(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo473i(context));
    }

    public void closeOptionsMenu() {
        C0209a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo553g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0209a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo562p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo477l(i);
    }

    public C0238h getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0238h.m794j(this, this);
        }
        return this.mDelegate;
    }

    public C0212b getDrawerToggleDelegate() {
        return getDelegate().mo483p();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo487s();
    }

    public Resources getResources() {
        if (this.mResources == null && C0413c2.m1673d()) {
            this.mResources = new C0413c2(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public C0209a getSupportActionBar() {
        return getDelegate().mo488u();
    }

    public Intent getSupportParentActivityIntent() {
        return C0745v.m2795a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo491w();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo495z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C0707i1 i1Var) {
        i1Var.mo3144g(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo432B();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m682N0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLocalesChanged(C0918j jVar) {
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0209a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo556j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo433C(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo434D();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0707i1 i1Var) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().mo437F();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo439G();
    }

    public void onSupportActionModeFinished(C0264b bVar) {
    }

    public void onSupportActionModeStarted(C0264b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0707i1 j = C0707i1.m2731j(this);
            onCreateSupportNavigateUpTaskStack(j);
            onPrepareSupportNavigateUpTaskStack(j);
            j.mo3149n();
            try {
                ActivityCompat.m2584p(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo455S(charSequence);
    }

    public C0264b onWindowStartingSupportActionMode(C0264b.C0265a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C0209a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo563q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m683w0();
        getDelegate().mo445L(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo452Q(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo454R(i);
    }

    public C0264b startSupportActionMode(C0264b.C0265a aVar) {
        return getDelegate().mo456T(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo491w();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0745v.m2799e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo442J(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0745v.m2800f(this, intent);
    }

    public C0218d(int i) {
        super(i);
        m681M0();
    }

    public void setContentView(View view) {
        m683w0();
        getDelegate().mo446M(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m683w0();
        getDelegate().mo448N(view, layoutParams);
    }
}
