package com.google.android.gms.location;

import java.util.Comparator;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.location.v */
final class C4548v implements Comparator {
    C4548v() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        C7264i.m27902k(detectedActivity);
        C7264i.m27902k(detectedActivity2);
        int compareTo = Integer.valueOf(detectedActivity2.mo13912v()).compareTo(Integer.valueOf(detectedActivity.mo13912v()));
        if (compareTo == 0) {
            return Integer.valueOf(detectedActivity.mo13913w()).compareTo(Integer.valueOf(detectedActivity2.mo13913w()));
        }
        return compareTo;
    }
}
