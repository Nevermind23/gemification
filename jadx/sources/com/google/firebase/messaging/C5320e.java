package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.e */
public abstract class C5320e {

    /* renamed from: a */
    public static final long f17037a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class C5321a {
        /* renamed from: a */
        public static ArrayMap m21029a(Bundle bundle) {
            ArrayMap arrayMap = new ArrayMap();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals(C11769i.C11770a.f34147j) && !next.equals("collapse_key")) {
                        arrayMap.put(next, str);
                    }
                }
            }
            return arrayMap;
        }
    }
}
