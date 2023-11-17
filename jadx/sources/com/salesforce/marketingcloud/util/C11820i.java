package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import java.security.GeneralSecurityException;
import java.text.NumberFormat;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.i */
public class C11820i extends C11806a {

    /* renamed from: f */
    private static final String f34324f = "ETPush";

    public C11820i(Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, 10000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo31643a(Context context, String str) {
        int i;
        String string = context.getSharedPreferences(f34324f, 0).getString("install_date_enc", (String) null);
        if (string != null) {
            try {
                i = NumberFormat.getInstance().parse(C11824l.m43298e(str + "29200FA5-DF79-4C3F-BC0F-E2FF3CE6199A")).intValue();
            } catch (Exception unused) {
                i = BogInputLayout.INPUT_NORMAL_STATE;
            }
            return C11824l.m43298e(string.substring(Integer.valueOf(String.valueOf(i).substring(0, 1)).intValue()));
        }
        throw new GeneralSecurityException("Unable to get old salt.");
    }
}
