package com.salesforce.marketingcloud.messages.iam;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

public class IamBannerActivity extends C11645f {

    /* renamed from: i */
    private static final String f33721i = C11461g.m41875a("IamBaseActivity");

    /* renamed from: f */
    private C11634a f33722f;

    /* renamed from: g */
    private boolean f33723g;

    /* renamed from: h */
    private long f33724h;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.IamBannerActivity$a */
    class C11623a extends C11634a {
        C11623a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            IamBannerActivity.this.mo30453h();
        }
    }

    /* renamed from: a */
    private int m42413a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? C11302R.anim.mcsdk_iam_slide_in_from_top : C11302R.anim.mcsdk_iam_slide_in_from_bottom;
    }

    /* renamed from: b */
    private int m42415b(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? C11302R.anim.mcsdk_iam_slide_out_from_top : C11302R.anim.mcsdk_iam_slide_out_from_bottom;
    }

    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo30453h() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment j0 = supportFragmentManager.mo4415j0(16908290);
        if (j0 != null) {
            supportFragmentManager.mo4428p().mo4641t(0, m42415b(mo30700c().mo30716d())).mo4522q(j0).mo4516j();
        }
        mo30698a(C11651j.m42523a(mo30700c().mo30715c(), mo30697a()));
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isFinishing()) {
            C11654k c = mo30700c();
            InAppMessage d = c.mo30716d();
            findViewById(16908290).setBackgroundDrawable(new ColorDrawable(C11647g.m42515a(this, d.windowColor(), C11302R.color.mcsdk_iam_default_window_background)));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.mo4415j0(16908290) == null) {
                this.f33723g = true;
                supportFragmentManager.mo4428p().mo4641t(m42413a(d), 0).mo4631b(16908290, C11637c.m42457a(c)).mo4515i();
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11634a aVar = this.f33722f;
        if (aVar != null) {
            aVar.cancel();
            this.f33722f = null;
        }
    }

    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        long displayDuration = mo30699b().displayDuration();
        long integer = this.f33723g ? (long) (((double) getResources().getInteger(C11302R.integer.mcsdk_iam_banner_animation_duration)) * -1.0d) : 0;
        this.f33723g = false;
        m42414a(displayDuration, integer);
    }

    public void onSwipeStarted() {
        super.onSwipeStarted();
        C11634a aVar = this.f33722f;
        if (aVar != null) {
            aVar.cancel();
            this.f33724h = this.f33722f.mo30670a();
            this.f33722f = null;
        }
    }

    public void onViewSettled() {
        super.onViewSettled();
        m42414a(mo30699b().displayDuration(), this.f33724h);
    }

    /* renamed from: a */
    private void m42414a(long j, long j2) {
        if (j > 0) {
            C11461g.m41891d(f33721i, "Banner dismiss timer set.  Will auto dismiss in %dms", Long.valueOf(j - j2));
            C11623a aVar = new C11623a(j, j2);
            this.f33722f = aVar;
            aVar.start();
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo30451b(InAppMessage.Button button) {
        super.mo30451b(button);
    }
}
