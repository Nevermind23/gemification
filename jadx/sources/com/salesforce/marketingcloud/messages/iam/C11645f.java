package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.C1505h;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout;
import com.salesforce.marketingcloud.util.C11819h;

/* renamed from: com.salesforce.marketingcloud.messages.iam.f */
abstract class C11645f extends C1505h implements View.OnClickListener, SwipeDismissConstraintLayout.SwipeDismissListener {

    /* renamed from: c */
    private static final int f33757c = 123;

    /* renamed from: d */
    private static final String f33758d = "completedEvent";

    /* renamed from: e */
    private static final String f33759e = C11461g.m41875a("IamBaseActivity");

    /* renamed from: a */
    private C11654k f33760a;

    /* renamed from: b */
    private C11651j f33761b;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.f$a */
    static /* synthetic */ class C11646a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33762a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33762a = r0
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType.url     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33762a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType.pushSettings     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33762a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Button$ActionType r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Button.ActionType.locationSettings     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11645f.C11646a.<clinit>():void");
        }
    }

    C11645f() {
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    private void m42506d() {
        if (C11819h.m43268b(this) && MarketingCloudSdk.isReady()) {
            RegionMessageManager regionMessageManager = MarketingCloudSdk.getInstance().getRegionMessageManager();
            try {
                if (regionMessageManager.enableGeofenceMessaging()) {
                    C11461g.m41880a(f33759e, "Geofence messaging enabled from IAM action", new Object[0]);
                }
                if (regionMessageManager.enableProximityMessaging()) {
                    C11461g.m41880a(f33759e, "Proximity messaging enabled from IAM action", new Object[0]);
                }
            } catch (Exception e) {
                C11461g.m41885b(f33759e, e, "Unable to enable region messaging", new Object[0]);
            }
        }
    }

    /* renamed from: e */
    private void m42507e() {
        if (C11819h.m43268b(this)) {
            C11461g.m41880a(f33759e, "Location permission already allowed.  Skipping action from button click.", new Object[0]);
            m42506d();
            finish();
        } else if (ActivityCompat.m2592x(this, "android.permission.ACCESS_FINE_LOCATION")) {
            ActivityCompat.m2589u(this, C11819h.f34323b, 123);
        } else {
            try {
                startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), (String) null)), 123);
            } catch (ActivityNotFoundException e) {
                C11461g.m41885b(f33759e, e, "Unable to launch application settings page for location permission request.", new Object[0]);
            }
        }
    }

    /* renamed from: f */
    private void m42508f() {
        Intent putExtra = Build.VERSION.SDK_INT >= 26 ? new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", getPackageName()) : new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("app_package", getPackageName()).putExtra("app_uid", getApplicationInfo().uid);
        if (putExtra != null) {
            try {
                startActivity(putExtra);
            } catch (ActivityNotFoundException e) {
                C11461g.m41885b(f33759e, e, "Unable to handle push settings button action.", new Object[0]);
            }
        } else {
            C11461g.m41880a(f33759e, "Unable to launch notification settings for this device.", new Object[0]);
        }
        finish();
    }

    /* renamed from: g */
    private void m42509g() {
        try {
            int i = mo30700c().mo30721i();
            if (i != 0) {
                getWindow().setStatusBarColor(i);
            }
        } catch (Exception e) {
            C11461g.m41881a(f33759e, (Throwable) e, "Failed to find status bar color from meta-data", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo30697a() {
        C11654k c = mo30700c();
        c.mo30722j();
        return c.mo30714b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InAppMessage mo30699b() {
        return this.f33760a.mo30716d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11654k mo30700c() {
        return this.f33760a;
    }

    public void finish() {
        C11654k kVar = this.f33760a;
        if (kVar != null) {
            kVar.mo30712a(this.f33761b);
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            m42506d();
        }
        finish();
    }

    public void onBackPressed() {
        this.f33761b = C11651j.m42525b(this.f33760a.mo30715c(), mo30697a());
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getTag() != null) {
            boolean z = view.getTag() instanceof InAppMessage.Button;
            Object tag = view.getTag();
            if (z) {
                mo30451b((InAppMessage.Button) tag);
            } else if (tag instanceof InAppMessage.CloseButton) {
                this.f33761b = C11651j.m42525b(this.f33760a.mo30715c(), mo30697a());
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f33760a = (C11654k) getIntent().getParcelableExtra("messageHandler");
        }
        C11654k kVar = this.f33760a;
        if (kVar == null || !kVar.mo30713a()) {
            finish();
            return;
        }
        m42509g();
        if (bundle != null) {
            this.f33761b = (C11651j) bundle.getParcelable(f33758d);
        }
    }

    public void onDismissed() {
        this.f33761b = C11651j.m42525b(this.f33760a.mo30715c(), mo30697a());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo30700c().mo30719f();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        m42506d();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo30700c().mo30720g();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f33758d, this.f33761b);
    }

    public void onSwipeStarted() {
    }

    public void onViewSettled() {
    }

    /* renamed from: a */
    private void m42505a(InAppMessage.Button button) {
        PendingIntent a = mo30700c().mo30711a(this, button);
        if (a != null) {
            try {
                a.send();
            } catch (PendingIntent.CanceledException e) {
                C11461g.m41885b(f33759e, e, "Unable to launch url for button click", new Object[0]);
            }
        } else {
            C11461g.m41880a(f33759e, "No PendingIntent returned for button click.", new Object[0]);
        }
        finish();
    }

    /* renamed from: b */
    public void mo30451b(InAppMessage.Button button) {
        if (button != null) {
            this.f33761b = C11651j.m42524a(this.f33760a.mo30715c(), mo30697a(), button);
            int i = C11646a.f33762a[button.actionType().ordinal()];
            if (i == 1) {
                m42505a(button);
            } else if (i == 2) {
                m42508f();
            } else if (i != 3) {
                finish();
            } else {
                m42507e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30698a(C11651j jVar) {
        this.f33761b = jVar;
    }
}
