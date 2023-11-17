package p341ge.bog.mobilebank.p975ui.activities.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.C0218d;
import g91.C32330r0;
import p341ge.bog.mobilebank.p975ui.widgets.atms.AtmLocationService;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.activities.widget.ServiceCentersWidgetConfigActivity */
public class ServiceCentersWidgetConfigActivity extends C0218d {

    /* renamed from: n */
    private int f85873n = 0;

    /* renamed from: o */
    private boolean f85874o = false;

    public void onBackPressed() {
        if (this.f85874o) {
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", this.f85873n);
            setResult(-1, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10324m.activity_service_centers_widget_config);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f85873n = extras.getInt("appWidgetId", 0);
        }
        if (!new C32330r0((Activity) this).mo72839z(903)) {
            this.f85874o = true;
            onBackPressed();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 903) {
            if (strArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
                sendBroadcast(new Intent("ge.bog.mobilebank.LOCATION_PERMISSIONS_GRANTED").setClass(this, AtmLocationService.class));
                this.f85874o = true;
            }
            onBackPressed();
        }
    }
}
