package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

/* renamed from: com.salesforce.marketingcloud.messages.iam.g */
class C11647g {

    /* renamed from: com.salesforce.marketingcloud.messages.iam.g$a */
    static /* synthetic */ class C11648a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33763a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Alignment[] r0 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33763a = r0
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Alignment r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Alignment.center     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33763a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Alignment r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Alignment.end     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.messages.iam.InAppMessage$Alignment r1 = com.salesforce.marketingcloud.messages.iam.InAppMessage.Alignment.beginning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11647g.C11648a.<clinit>():void");
        }
    }

    private C11647g() {
    }

    /* renamed from: a */
    static int m42515a(Context context, String str, int i) {
        if (str == null) {
            return context.getResources().getColor(i);
        }
        try {
            return Color.parseColor(str.replace("0x", "#"));
        } catch (Exception unused) {
            return context.getResources().getColor(i);
        }
    }

    /* renamed from: a */
    static int m42516a(InAppMessage.Alignment alignment) {
        int i = C11648a.f33763a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? 8388611 : 8388613;
        }
        return 17;
    }

    /* renamed from: a */
    static Drawable m42517a(int i, float f, int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(Math.round(f2), i2);
        return gradientDrawable;
    }

    /* renamed from: a */
    static void m42518a(TextView textView, String str, int i, float f, int i2) {
        textView.setText(str);
        textView.setTextColor(i);
        textView.setTextSize(0, f);
        textView.setGravity(i2);
    }
}
