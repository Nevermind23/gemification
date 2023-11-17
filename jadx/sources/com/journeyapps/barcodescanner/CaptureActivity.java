package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import p174mb.C7165k;
import p174mb.C7166l;

public class CaptureActivity extends Activity {

    /* renamed from: d */
    private C10660e f30334d;

    /* renamed from: e */
    private DecoratedBarcodeView f30335e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DecoratedBarcodeView mo27381a() {
        setContentView(C7166l.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C7165k.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30335e = mo27381a();
        C10660e eVar = new C10660e(this, this.f30335e);
        this.f30334d = eVar;
        eVar.mo27466p(getIntent(), bundle);
        this.f30334d.mo27464l();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f30334d.mo27468u();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f30335e.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f30334d.mo27469v();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f30334d.mo27470w(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f30334d.mo27471x();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f30334d.mo27472y(bundle);
    }
}
