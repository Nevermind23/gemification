package com.salesforce.marketingcloud.messages.iam;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.C1060a1;
import androidx.core.view.C1253v;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.salesforce.marketingcloud.C11302R;
import kotlin.jvm.internal.C41536l;

public final class IamFullImageFillActivity extends IamFullscreenActivity implements C1060a1 {
    /* renamed from: i */
    private final void m42418i() {
        requestWindowFeature(1);
        getWindow().setFlags(1536, 1536);
        getWindow().getDecorView().setSystemUiVisibility(4098);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* renamed from: h */
    public void mo30459h() {
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        C1253v e;
        C41536l.m120489i(view, "v");
        C41536l.m120489i(windowInsetsCompat, "insets");
        if (!isFinishing() && windowInsetsCompat.mo3497m() && (e = windowInsetsCompat.mo3487e()) != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C11302R.dimen.mcsdk_iam_fif_content_padding_top);
            int d = e.mo3727d();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C11302R.dimen.mcsdk_iam_fif_content_padding_bottom);
            int a = e.mo3724a();
            View findViewById = view.findViewById(C11302R.C11304id.mcsdk_iam_container);
            if (d >= dimensionPixelSize) {
                dimensionPixelSize = d;
            }
            if (a >= dimensionPixelSize2) {
                dimensionPixelSize2 = a;
            }
            findViewById.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize2);
        }
        WindowInsetsCompat c = windowInsetsCompat.mo3485c();
        C41536l.m120488h(c, "insets.consumeSystemWindowInsets()");
        return c;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m42418i();
        super.onCreate(bundle);
        View view = this.f33726f;
        if (view != null) {
            ViewCompat.m3550F0(view, this);
        }
    }
}
