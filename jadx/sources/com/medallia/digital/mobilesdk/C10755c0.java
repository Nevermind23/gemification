package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.appcompat.app.C0214c;

/* renamed from: com.medallia.digital.mobilesdk.c0 */
public class C10755c0 extends C0214c.C0215a {
    public C10755c0(Context context, int i, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, i);
        m39182a(str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    /* renamed from: a */
    private void m39182a(String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        if (!TextUtils.isEmpty(str4)) {
            try {
                setTitle((CharSequence) str4);
            } catch (Exception e) {
                C10735b4.m39109b(e.getMessage());
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            try {
                setMessage((CharSequence) str5);
            } catch (Exception e2) {
                C10735b4.m39109b(e2.getMessage());
            }
        }
        if (onClickListener != null) {
            try {
                setPositiveButton((CharSequence) str, onClickListener);
            } catch (Exception e3) {
                C10735b4.m39109b(e3.getMessage());
            }
        }
        if (onClickListener2 != null) {
            try {
                setNegativeButton((CharSequence) str2, onClickListener2);
            } catch (Exception e4) {
                C10735b4.m39109b(e4.getMessage());
            }
        }
        if (onClickListener3 != null) {
            try {
                setNeutralButton((CharSequence) str3, onClickListener3);
            } catch (Exception e5) {
                C10735b4.m39109b(e5.getMessage());
            }
        }
        if (onCancelListener != null) {
            try {
                setOnCancelListener(onCancelListener);
            } catch (Exception e6) {
                C10735b4.m39109b(e6.getMessage());
            }
        }
    }
}
