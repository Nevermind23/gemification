package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

public final class FaceTecSessionActivity extends C2831bd {

    /* renamed from: e */
    static FaceTecFaceScanProcessor f8641e;

    /* renamed from: g */
    static FaceTecIDScanProcessor f8642g;

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, (FaceTecIDScanProcessor) null, "");
    }

    public static FaceTecIDScanResult getIDScanResultFromActivityResult(Intent intent) {
        if (intent != null) {
            return (FaceTecIDScanResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_ID_SCAN_RESULTS);
        }
        return null;
    }

    public static FaceTecSessionResult getSessionResultFromActivityResult(Intent intent) {
        if (intent != null) {
            return (FaceTecSessionResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_SESSION_RESULTS);
        }
        return null;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    public final Resources getResources() {
        return super.getResources();
    }

    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public final /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: package-private */
    public final void onPause() {
        super.onPause();
    }

    public final /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: package-private */
    public final void onResume() {
        super.onResume();
    }

    public final /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo8775t() {
        super.mo8775t();
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo8776x() {
        super.mo8776x();
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, String str) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, (FaceTecIDScanProcessor) null, str);
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor) {
        createAndLaunchSession(context, faceTecFaceScanProcessor, faceTecIDScanProcessor, "");
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor, String str) {
        Intent intent = new Intent(context, FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("zoom.serverSessionToken", str);
        }
        f8641e = faceTecFaceScanProcessor;
        f8642g = faceTecIDScanProcessor;
        ((Activity) context).startActivityForResult(intent, FaceTecSDK.REQUEST_CODE_SESSION);
    }

    public static void createAndLaunchSession(Context context, FaceTecIDScanProcessor faceTecIDScanProcessor, String str) {
        Intent intent = new Intent(context, FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("zoom.serverSessionToken", str);
        }
        f8641e = null;
        f8642g = faceTecIDScanProcessor;
        intent.putExtra("facetec.idScanOnlyMode", true);
        ((Activity) context).startActivityForResult(intent, FaceTecSDK.REQUEST_CODE_SESSION);
    }
}
