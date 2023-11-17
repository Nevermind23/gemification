package com.salesforce.marketingcloud.messages.iam;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

/* renamed from: com.salesforce.marketingcloud.messages.iam.e */
class C11643e extends C11639d {

    /* renamed from: com.salesforce.marketingcloud.messages.iam.e$a */
    static /* synthetic */ class C11644a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33756a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33756a = r0
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.l     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33756a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.m     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33756a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Size r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Size.s     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11643e.C11644a.<clinit>():void");
        }
    }

    C11643e(View.OnClickListener onClickListener, Typeface typeface) {
        super(onClickListener, typeface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo30672a(Resources resources) {
        return resources.getDimension(C11302R.dimen.mcsdk_iam_fs_closebtn_hitbox_increase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo30677b(Resources resources) {
        return resources.getDimension(C11302R.dimen.mcsdk_button_group_horizontal_divider);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo30681c(Resources resources) {
        return resources.getDimension(C11302R.dimen.mcsdk_button_group_vertical_divider);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo30684d() {
        return C11302R.C11304id.mcsdk_iam_media_group;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo30685e() {
        return C11302R.C11304id.mcsdk_iam_media;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo30686f() {
        return C11302R.C11304id.mcsdk_iam_container;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo30687g() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo30688h() {
        return C11302R.C11304id.mcsdk_iam_title;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo30673a(Resources resources, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i = C11644a.f33756a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? C11302R.dimen.mcsdk_iam_fs_body_font_small : C11302R.dimen.mcsdk_iam_fs_body_font_medium : C11302R.dimen.mcsdk_iam_fs_body_font_large);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo30678b(Resources resources, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i = C11644a.f33756a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? C11302R.dimen.mcsdk_iam_fs_btn_font_small : C11302R.dimen.mcsdk_iam_fs_btn_font_medium : C11302R.dimen.mcsdk_iam_fs_btn_font_large);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo30682c(Resources resources, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        int i = C11644a.f33756a[size.ordinal()];
        return resources.getDimension((i == 1 || i == 2) ? C11302R.dimen.mcsdk_iam_fs_title_font_large : C11302R.dimen.mcsdk_iam_fs_title_font_small);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30674a() {
        return C11302R.C11304id.mcsdk_iam_body;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo30679b() {
        return C11302R.C11304id.mcsdk_iam_buttons;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo30683c() {
        return C11302R.C11304id.mcsdk_iam_close;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30676a(View view, String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30693a(View view, String str, String str2, InAppMessage.Size size, InAppMessage.Size size2) {
        View findViewById = view.findViewById(mo30686f());
        if (str != null && findViewById != null) {
            findViewById.setBackgroundColor(C11647g.m42515a(view.getContext(), str, C11302R.color.mcsdk_iam_default_message_background));
        }
    }
}
