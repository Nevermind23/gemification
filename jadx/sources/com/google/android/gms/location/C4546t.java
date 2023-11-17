package com.google.android.gms.location;

import java.util.Comparator;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.location.t */
final class C4546t implements Comparator {
    C4546t() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        C7264i.m27902k(activityTransition);
        C7264i.m27902k(activityTransition2);
        int v = activityTransition.mo13883v();
        int v2 = activityTransition2.mo13883v();
        if (v == v2) {
            int w = activityTransition.mo13884w();
            int w2 = activityTransition2.mo13884w();
            if (w == w2) {
                return 0;
            }
            if (w < w2) {
                return -1;
            }
            return 1;
        } else if (v >= v2) {
            return 1;
        } else {
            return -1;
        }
    }
}
