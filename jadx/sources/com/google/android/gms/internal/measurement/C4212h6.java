package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
public abstract class C4212h6 {

    /* renamed from: a */
    private static final ArrayMap f13274a = new ArrayMap();

    /* renamed from: a */
    public static synchronized Uri m15980a(String str) {
        synchronized (C4212h6.class) {
            ArrayMap arrayMap = f13274a;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            arrayMap.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
