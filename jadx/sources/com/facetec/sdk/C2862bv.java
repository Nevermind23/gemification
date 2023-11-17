package com.facetec.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Random;
import java.util.UUID;

/* renamed from: com.facetec.sdk.bv */
final class C2862bv {
    C2862bv() {
    }

    /* renamed from: a */
    static String m11670a(String str) {
        int nextInt = new Random().nextInt(8) + 2;
        String replace = UUID.randomUUID().toString().replace("-", "");
        StringBuilder sb = new StringBuilder();
        sb.append(replace.substring(0, 1));
        sb.append(nextInt);
        sb.append(replace.substring(2));
        String obj = sb.toString();
        int length = (replace.length() - 1) - nextInt;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj.substring(0, nextInt));
        sb2.append(str.charAt(0));
        sb2.append(obj.substring(nextInt + 1));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2.substring(0, length));
        sb3.append(str.charAt(1));
        sb3.append(obj2.substring(length + 1));
        return sb3.toString();
    }

    /* renamed from: b */
    static boolean m11671b(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (activeNetworkInfo.isConnected() && z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static String m11672e(String str) {
        int nextInt = new Random().nextInt(8) + 2;
        String replace = UUID.randomUUID().toString().replace("-", "");
        StringBuilder sb = new StringBuilder();
        sb.append(replace.substring(0, 1));
        sb.append(nextInt);
        sb.append(replace.substring(2));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj.substring(0, nextInt));
        sb2.append(str);
        sb2.append(obj.substring(nextInt + 1));
        return sb2.toString();
    }
}
