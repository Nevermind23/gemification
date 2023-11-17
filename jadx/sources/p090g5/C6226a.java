package p090g5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.facebook.C2626d;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.C2671a;
import p297w4.C8769a0;
import p297w4.C8796e;
import p297w4.C8797f;

/* renamed from: g5.a */
class C6226a {

    /* renamed from: a */
    private Fragment f19248a;

    /* renamed from: b */
    private String f19249b;

    /* renamed from: c */
    protected String f19250c;

    C6226a(Fragment fragment) {
        this.f19248a = fragment;
    }

    /* renamed from: a */
    private void m24756a(int i, Intent intent) {
        C1505h activity;
        if (this.f19248a.isAdded() && (activity = this.f19248a.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: b */
    private String m24757b() {
        if (this.f19249b == null) {
            this.f19249b = C8797f.m32769a();
        }
        return this.f19249b;
    }

    /* renamed from: c */
    static String m24758c() {
        return "fb" + C2626d.m10135f() + "://authorize";
    }

    /* renamed from: d */
    private Bundle m24759d() {
        Bundle bundle = new Bundle();
        this.f19250c = C8769a0.m32684p(20);
        bundle.putString("redirect_uri", C8797f.m32771c(m24758c()));
        bundle.putString("app_id", C2626d.m10135f());
        bundle.putString("state", this.f19250c);
        return bundle;
    }

    /* renamed from: e */
    private boolean m24760e() {
        return m24757b() != null;
    }

    /* renamed from: h */
    private boolean m24761h() {
        if (this.f19248a.getActivity() == null || this.f19248a.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || !m24760e()) {
            return false;
        }
        Bundle d = m24759d();
        if (C2626d.f8237q) {
            C2671a.m10387b(C8796e.m32767a("share_referral", d));
        }
        Intent intent = new Intent(this.f19248a.getActivity(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f8102f, "share_referral");
        intent.putExtra(CustomTabMainActivity.f8103g, d);
        intent.putExtra(CustomTabMainActivity.f8104h, m24757b());
        this.f19248a.startActivityForResult(intent, 1);
        return true;
    }

    /* renamed from: i */
    private boolean m24762i(Bundle bundle) {
        if (this.f19250c == null) {
            return true;
        }
        boolean equals = this.f19250c.equals(bundle.getString("state"));
        this.f19250c = null;
        return equals;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19833f(int i, int i2, Intent intent) {
        String stringExtra;
        if (i == 1) {
            if (!(intent == null || (stringExtra = intent.getStringExtra(CustomTabMainActivity.f8105i)) == null || !stringExtra.startsWith(C8797f.m32771c(m24758c())))) {
                Bundle a0 = C8769a0.m32655a0(Uri.parse(stringExtra).getQuery());
                if (m24762i(a0)) {
                    intent.putExtras(a0);
                } else {
                    intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                    i2 = 0;
                }
            }
            m24756a(i2, intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19834g() {
        if (!m24761h()) {
            Intent intent = new Intent();
            intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            m24756a(0, intent);
        }
    }
}
