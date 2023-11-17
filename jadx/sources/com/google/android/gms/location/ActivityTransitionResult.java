package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p182n6.C7264i;
import p183n7.C7327p0;
import p195o6.C7461a;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C7327p0();

    /* renamed from: d */
    private final List f13886d;

    /* renamed from: e */
    private Bundle f13887e;

    public ActivityTransitionResult(List list) {
        this.f13887e = null;
        C7264i.m27903l(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C7264i.m27892a(((ActivityTransitionEvent) list.get(i)).mo13890w() >= ((ActivityTransitionEvent) list.get(i + -1)).mo13890w());
            }
        }
        this.f13886d = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f13886d.equals(((ActivityTransitionResult) obj).f13886d);
    }

    public int hashCode() {
        return this.f13886d.hashCode();
    }

    /* renamed from: v */
    public List mo13899v() {
        return this.f13886d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, mo13899v(), false);
        C7461a.m28374f(parcel, 2, this.f13887e, false);
        C7461a.m28370b(parcel, a);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.f13887e = bundle;
    }
}
