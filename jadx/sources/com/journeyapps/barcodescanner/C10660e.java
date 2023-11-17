package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import com.google.zxing.C5765n;
import com.journeyapps.barcodescanner.C10650a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p174mb.C7157e;
import p174mb.C7160h;
import p174mb.C7168n;
import p416fd.C12843a;
import p416fd.C12844b;
import p416fd.C12845c;
import p416fd.C12846d;
import p416fd.C12847e;

/* renamed from: com.journeyapps.barcodescanner.e */
public class C10660e {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f30392o = "e";

    /* renamed from: p */
    private static int f30393p = 250;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f30394a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public DecoratedBarcodeView f30395b;

    /* renamed from: c */
    private int f30396c = -1;

    /* renamed from: d */
    private boolean f30397d = false;

    /* renamed from: e */
    private boolean f30398e = true;

    /* renamed from: f */
    private String f30399f = "";

    /* renamed from: g */
    private boolean f30400g = false;

    /* renamed from: h */
    private C7160h f30401h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7157e f30402i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f30403j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f30404k = false;

    /* renamed from: l */
    private C12843a f30405l = new C10661a();

    /* renamed from: m */
    private final C10650a.C10656f f30406m;

    /* renamed from: n */
    private boolean f30407n;

    /* renamed from: com.journeyapps.barcodescanner.e$a */
    class C10661a implements C12843a {
        C10661a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m38908d(C12844b bVar) {
            C10660e.this.mo27460B(bVar);
        }

        /* renamed from: a */
        public void mo27407a(List list) {
        }

        /* renamed from: b */
        public void mo27408b(C12844b bVar) {
            C10660e.this.f30395b.mo27392f();
            C10660e.this.f30402i.mo21421f();
            C10660e.this.f30403j.post(new C10659d(this, bVar));
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.e$b */
    class C10662b implements C10650a.C10656f {
        C10662b() {
        }

        /* renamed from: a */
        public void mo27415a() {
        }

        /* renamed from: b */
        public void mo27416b() {
            if (C10660e.this.f30404k) {
                Log.d(C10660e.f30392o, "Camera closed; finishing activity");
                C10660e.this.m38888n();
            }
        }

        /* renamed from: c */
        public void mo27417c(Exception exc) {
            C10660e eVar = C10660e.this;
            eVar.mo27465m(eVar.f30394a.getString(C7168n.zxing_msg_camera_framework_bug));
        }

        /* renamed from: d */
        public void mo27418d() {
        }

        /* renamed from: e */
        public void mo27419e() {
        }
    }

    public C10660e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C10662b bVar = new C10662b();
        this.f30406m = bVar;
        this.f30407n = false;
        this.f30394a = activity;
        this.f30395b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().mo27428i(bVar);
        this.f30403j = new Handler();
        this.f30401h = new C7160h(activity, new C12845c(this));
        this.f30402i = new C7157e(activity);
    }

    /* renamed from: A */
    public static Intent m38876A(C12844b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.mo33498a().toString());
        byte[] c = bVar.mo33500c();
        if (c != null && c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c);
        }
        Map d = bVar.mo33501d();
        if (d != null) {
            C5765n nVar = C5765n.UPC_EAN_EXTENSION;
            if (d.containsKey(nVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d.get(nVar).toString());
            }
            Number number = (Number) d.get(C5765n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d.get(C5765n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d.get(C5765n.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, putExtra);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* renamed from: D */
    private void m38877D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f30394a.setResult(0, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m38888n() {
        this.f30394a.finish();
    }

    /* renamed from: o */
    private String m38889o(C12844b bVar) {
        if (this.f30397d) {
            Bitmap b = bVar.mo33499b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f30394a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = f30392o;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m38890q(DialogInterface dialogInterface, int i) {
        m38888n();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m38891r(DialogInterface dialogInterface) {
        m38888n();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m38892s() {
        Log.d(f30392o, "Finishing due to inactivity");
        m38888n();
    }

    /* renamed from: z */
    private void m38893z() {
        if (C0767a.m2891a(this.f30394a, "android.permission.CAMERA") == 0) {
            this.f30395b.mo27399h();
        } else if (!this.f30407n) {
            ActivityCompat.m2589u(this.f30394a, new String[]{"android.permission.CAMERA"}, f30393p);
            this.f30407n = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo27460B(C12844b bVar) {
        this.f30394a.setResult(-1, m38876A(bVar, m38889o(bVar)));
        mo27463k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo27461C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f30394a.setResult(0, intent);
        mo27463k();
    }

    /* renamed from: E */
    public void mo27462E(boolean z, String str) {
        this.f30398e = z;
        if (str == null) {
            str = "";
        }
        this.f30399f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo27463k() {
        if (this.f30395b.getBarcodeView().mo27438s()) {
            m38888n();
        } else {
            this.f30404k = true;
        }
        this.f30395b.mo27392f();
        this.f30401h.mo21424d();
    }

    /* renamed from: l */
    public void mo27464l() {
        this.f30395b.mo27390c(this.f30405l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27465m(String str) {
        if (!this.f30394a.isFinishing() && !this.f30400g && !this.f30404k) {
            if (str.isEmpty()) {
                str = this.f30394a.getString(C7168n.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f30394a);
            builder.setTitle(this.f30394a.getString(C7168n.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(C7168n.zxing_button_ok, new C12846d(this));
            builder.setOnCancelListener(new C12847e(this));
            builder.show();
        }
    }

    /* renamed from: p */
    public void mo27466p(Intent intent, Bundle bundle) {
        this.f30394a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f30396c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                mo27467t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f30395b.mo27391e(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f30402i.mo21422g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                mo27462E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f30403j.postDelayed(new C10658c(this), intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f30397d = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo27467t() {
        if (this.f30396c == -1) {
            int rotation = this.f30394a.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f30394a.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f30396c = i2;
        }
        this.f30394a.setRequestedOrientation(this.f30396c);
    }

    /* renamed from: u */
    public void mo27468u() {
        this.f30400g = true;
        this.f30401h.mo21424d();
        this.f30403j.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: v */
    public void mo27469v() {
        this.f30401h.mo21424d();
        this.f30395b.mo27393g();
    }

    /* renamed from: w */
    public void mo27470w(int i, String[] strArr, int[] iArr) {
        if (i != f30393p) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            m38877D();
            if (this.f30398e) {
                mo27465m(this.f30399f);
            } else {
                mo27463k();
            }
        } else {
            this.f30395b.mo27399h();
        }
    }

    /* renamed from: x */
    public void mo27471x() {
        m38893z();
        this.f30401h.mo21425h();
    }

    /* renamed from: y */
    public void mo27472y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f30396c);
    }
}
