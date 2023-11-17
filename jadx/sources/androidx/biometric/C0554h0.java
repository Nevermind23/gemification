package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C1505h;
import com.salesforce.marketingcloud.notifications.NotificationMessage;

/* renamed from: androidx.biometric.h0 */
abstract class C0554h0 {
    /* renamed from: a */
    static boolean m2164a() {
        C0579x f = C0579x.m2205f();
        if (f == null || !f.mo2459h()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m2165b(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    static boolean m2166c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: d */
    private static boolean m2167d(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static void m2168e(String str, C1505h hVar, Bundle bundle, Runnable runnable) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!(hVar instanceof DeviceCredentialHandlerActivity)) {
            Log.e(str, "Failed to check device credential. Parent handler not found.");
            return;
        }
        DeviceCredentialHandlerActivity deviceCredentialHandlerActivity = (DeviceCredentialHandlerActivity) hVar;
        KeyguardManager keyguardManager = (KeyguardManager) deviceCredentialHandlerActivity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            Log.e(str, "Failed to check device credential. KeyguardManager was null.");
            deviceCredentialHandlerActivity.mo2430O0(0);
            return;
        }
        if (bundle != null) {
            charSequence2 = bundle.getCharSequence("title");
            charSequence = bundle.getCharSequence(NotificationMessage.NOTIF_KEY_SUB_TITLE);
        } else {
            charSequence2 = null;
            charSequence = null;
        }
        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence2, charSequence);
        if (createConfirmDeviceCredentialIntent == null) {
            Log.e(str, "Failed to check device credential. Got null intent from Keyguard.");
            deviceCredentialHandlerActivity.mo2430O0(0);
            return;
        }
        C0579x e = C0579x.m2204e();
        e.mo2464m(true);
        e.mo2467p();
        if (runnable != null) {
            runnable.run();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        deviceCredentialHandlerActivity.startActivityForResult(createConfirmDeviceCredentialIntent, 0);
    }

    /* renamed from: f */
    static void m2169f(C1505h hVar) {
        if ((hVar instanceof DeviceCredentialHandlerActivity) && !hVar.isFinishing()) {
            hVar.finish();
        }
    }

    /* renamed from: g */
    static boolean m2170g(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m2165b(context, str, C0540a0.hide_fingerprint_instantly_prefixes);
    }

    /* renamed from: h */
    static boolean m2171h(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (m2167d(context, str, C0540a0.crypto_fingerprint_fallback_vendors) || m2165b(context, str2, C0540a0.crypto_fingerprint_fallback_prefixes)) {
            return true;
        }
        return false;
    }
}
