package com.facetec.sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facetec.sdk.cy */
final class C2923cy {

    /* renamed from: a */
    private static Resources f9813a;

    /* renamed from: d */
    private static HashMap<Integer, String> f9814d;

    C2923cy() {
    }

    /* renamed from: b */
    static String m12206b(int i) {
        String str;
        if (i == 0) {
            return "";
        }
        HashMap<Integer, String> hashMap = f9814d;
        if (hashMap != null) {
            str = hashMap.get(Integer.valueOf(i));
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return f9813a.getString(i);
    }

    /* renamed from: c */
    static synchronized void m12207c(Map<Integer, String> map) {
        synchronized (C2923cy.class) {
            f9814d = new HashMap<>(map);
        }
    }

    /* renamed from: e */
    static void m12208e(Activity activity) {
        if (f9813a == null) {
            f9813a = activity.getApplicationContext().getResources();
        }
    }

    /* renamed from: e */
    static void m12209e(TextView textView, int i) {
        if (textView != null) {
            textView.setText(m12206b(i));
        }
    }
}
