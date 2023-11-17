package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
public final class C4498y5 {

    /* renamed from: a */
    private final SimpleArrayMap f13830a;

    C4498y5(SimpleArrayMap simpleArrayMap) {
        this.f13830a = simpleArrayMap;
    }

    /* renamed from: a */
    public final String mo13830a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.f13830a.get(uri.toString());
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(str3));
    }
}
