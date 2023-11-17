package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.List;
import p060e1.C5978p;

/* renamed from: androidx.fragment.app.f0 */
abstract class C1496f0 {

    /* renamed from: a */
    static final C1507h0 f4389a = new C1498g0();

    /* renamed from: b */
    static final C1507h0 f4390b = m5295c();

    /* renamed from: a */
    static void m5293a(Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap, boolean z2) {
        SharedElementCallback sharedElementCallback;
        int i;
        if (z) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (arrayMap == null) {
                i = 0;
            } else {
                i = arrayMap.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add((String) arrayMap.keyAt(i2));
                arrayList.add((View) arrayMap.valueAt(i2));
            }
            if (z2) {
                sharedElementCallback.mo3111g(arrayList2, arrayList, (List) null);
            } else {
                sharedElementCallback.mo3110f(arrayList2, arrayList, (List) null);
            }
        }
    }

    /* renamed from: b */
    static String m5294b(ArrayMap arrayMap, String str) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return (String) arrayMap.keyAt(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static C1507h0 m5295c() {
        try {
            return C5978p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    static void m5296d(ArrayMap arrayMap, ArrayMap arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey((String) arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    /* renamed from: e */
    static void m5297e(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }
}
