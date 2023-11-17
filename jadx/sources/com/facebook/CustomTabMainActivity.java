package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import p189o0.C7357a;
import p297w4.C8769a0;
import p297w4.C8796e;
import p297w4.C8832s;

public class CustomTabMainActivity extends Activity {

    /* renamed from: f */
    public static final String f8102f;

    /* renamed from: g */
    public static final String f8103g;

    /* renamed from: h */
    public static final String f8104h;

    /* renamed from: i */
    public static final String f8105i;

    /* renamed from: j */
    public static final String f8106j;

    /* renamed from: k */
    public static final String f8107k;

    /* renamed from: d */
    private boolean f8108d = true;

    /* renamed from: e */
    private BroadcastReceiver f8109e;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    class C2602a extends BroadcastReceiver {
        C2602a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f8106j);
            String str = CustomTabMainActivity.f8105i;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        sb.append(cls.getSimpleName());
        sb.append(".extra_action");
        f8102f = sb.toString();
        f8103g = cls.getSimpleName() + ".extra_params";
        f8104h = cls.getSimpleName() + ".extra_chromePackage";
        f8105i = cls.getSimpleName() + ".extra_url";
        f8106j = cls.getSimpleName() + ".action_refresh";
        f8107k = cls.getSimpleName() + ".no_activity_exception";
    }

    /* renamed from: a */
    private static Bundle m9986a(String str) {
        Uri parse = Uri.parse(str);
        Bundle a0 = C8769a0.m32655a0(parse.getQuery());
        a0.putAll(C8769a0.m32655a0(parse.getFragment()));
        return a0;
    }

    /* renamed from: b */
    private void m9987b(int i, Intent intent) {
        Bundle bundle;
        C7357a.m28044b(this).mo21732e(this.f8109e);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f8105i);
            if (stringExtra != null) {
                bundle = m9986a(stringExtra);
            } else {
                bundle = new Bundle();
            }
            Intent m = C8832s.m32889m(getIntent(), bundle, (FacebookException) null);
            if (m != null) {
                intent = m;
            }
            setResult(i, intent);
        } else {
            setResult(i, C8832s.m32889m(getIntent(), (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.f8098e;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f8102f);
            Bundle bundleExtra = getIntent().getBundleExtra(f8103g);
            boolean b = new C8796e(stringExtra, bundleExtra).mo24227b(this, getIntent().getStringExtra(f8104h));
            this.f8108d = false;
            if (!b) {
                setResult(0, getIntent().putExtra(f8107k, true));
                finish();
                return;
            }
            this.f8109e = new C2602a();
            C7357a.m28044b(this).mo21730c(this.f8109e, new IntentFilter(str));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f8106j.equals(intent.getAction())) {
            C7357a.m28044b(this).mo21731d(new Intent(CustomTabActivity.f8099f));
            m9987b(-1, intent);
        } else if (CustomTabActivity.f8098e.equals(intent.getAction())) {
            m9987b(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f8108d) {
            m9987b(0, (Intent) null);
        }
        this.f8108d = true;
    }
}
