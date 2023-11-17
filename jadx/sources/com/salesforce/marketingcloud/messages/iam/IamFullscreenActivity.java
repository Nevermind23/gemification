package com.salesforce.marketingcloud.messages.iam;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.C1060a1;
import androidx.core.view.ViewCompat;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

public class IamFullscreenActivity extends C11645f {

    /* renamed from: f */
    protected View f33726f;

    /* renamed from: g */
    private C11654k f33727g;

    /* renamed from: h */
    private InAppMessage f33728h;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.IamFullscreenActivity$a */
    static /* synthetic */ class C11624a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33729a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33730b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33730b = r0
                r1 = 1
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r2 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f33730b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Type r3 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Type.fullImageFill     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder[] r2 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f33729a = r2
                com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder r3 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.ImageTitleBody     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f33729a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$LayoutOrder r2 = com.salesforce.marketingcloud.messages.iam.InAppMessage.LayoutOrder.TitleImageBody     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.IamFullscreenActivity.C11624a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private int m42420a(InAppMessage inAppMessage) {
        int i = C11302R.layout.mcsdk_iam_full_inset_itb;
        int i2 = C11624a.f33730b[inAppMessage.type().ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? i : (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? C11302R.layout.mcsdk_iam_fif_inset_itb : C11302R.layout.mcsdk_iam_fif_e2e_itb;
        }
        int i3 = C11624a.f33729a[inAppMessage.layoutOrder().ordinal()];
        return i3 != 1 ? i3 != 2 ? i : (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? C11302R.layout.mcsdk_iam_full_inset_tib : C11302R.layout.mcsdk_iam_full_e2e_tib : (inAppMessage.media() == null || inAppMessage.media().size() != InAppMessage.Media.ImageSize.e2e) ? i : C11302R.layout.mcsdk_iam_full_e2e_itb;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo30451b(InAppMessage.Button button) {
        super.mo30451b(button);
    }

    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C11654k kVar;
        super.onConfigurationChanged(configuration);
        InAppMessage inAppMessage = this.f33728h;
        if (inAppMessage != null && inAppMessage.type() == InAppMessage.Type.fullImageFill && configuration.orientation == 2 && (kVar = this.f33727g) != null) {
            kVar.mo30712a(C11651j.m42523a(kVar.mo30715c(), this.f33727g.mo30714b()));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isFinishing()) {
            this.f33726f = findViewById(16908290);
            C11654k c = mo30700c();
            this.f33727g = c;
            InAppMessage d = c.mo30716d();
            this.f33728h = d;
            setContentView(m42420a(d));
            new C11643e(this, this.f33727g.mo30723k()).mo30692a(this.f33726f, this.f33727g);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        View view = this.f33726f;
        if (view != null) {
            ViewCompat.m3550F0(view, (C1060a1) null);
        }
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onDismissed() {
        super.onDismissed();
    }

    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public /* bridge */ /* synthetic */ void onSwipeStarted() {
        super.onSwipeStarted();
    }

    public /* bridge */ /* synthetic */ void onViewSettled() {
        super.onViewSettled();
    }
}
