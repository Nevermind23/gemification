package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p189o0.C7357a;

public class CustomTabActivity extends Activity {

    /* renamed from: e */
    public static final String f8098e;

    /* renamed from: f */
    public static final String f8099f;

    /* renamed from: d */
    private BroadcastReceiver f8100d;

    /* renamed from: com.facebook.CustomTabActivity$a */
    class C2601a extends BroadcastReceiver {
        C2601a() {
        }

        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Class<CustomTabActivity> cls = CustomTabActivity.class;
        sb.append(cls.getSimpleName());
        sb.append(".action_customTabRedirect");
        f8098e = sb.toString();
        f8099f = cls.getSimpleName() + ".action_destroy";
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f8098e);
            intent2.putExtra(CustomTabMainActivity.f8105i, getIntent().getDataString());
            C7357a.m28044b(this).mo21731d(intent2);
            this.f8100d = new C2601a();
            C7357a.m28044b(this).mo21730c(this.f8100d, new IntentFilter(f8099f));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f8098e);
        intent.putExtra(CustomTabMainActivity.f8105i, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C7357a.m28044b(this).mo21732e(this.f8100d);
        super.onDestroy();
    }
}
