package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7325o0;
import p195o6.C7461a;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C7325o0();

    /* renamed from: h */
    public static final Comparator f13881h = new C4546t();

    /* renamed from: d */
    private final List f13882d;

    /* renamed from: e */
    private final String f13883e;

    /* renamed from: f */
    private final List f13884f;

    /* renamed from: g */
    private String f13885g;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        boolean z;
        List list3;
        C7264i.m27903l(list, "transitions can't be null");
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "transitions can't be empty.");
        C7264i.m27902k(list);
        TreeSet treeSet = new TreeSet(f13881h);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            C7264i.m27893b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f13882d = Collections.unmodifiableList(list);
        this.f13883e = str;
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f13884f = list3;
        this.f13885g = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (!C7258g.m27880a(this.f13882d, activityTransitionRequest.f13882d) || !C7258g.m27880a(this.f13883e, activityTransitionRequest.f13883e) || !C7258g.m27880a(this.f13885g, activityTransitionRequest.f13885g) || !C7258g.m27880a(this.f13884f, activityTransitionRequest.f13884f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f13882d.hashCode() * 31;
        String str = this.f13883e;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list = this.f13884f;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.f13885g;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13882d);
        String str = this.f13883e;
        String valueOf2 = String.valueOf(this.f13884f);
        String str2 = this.f13885g;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f13882d, false);
        C7461a.m28392x(parcel, 2, this.f13883e, false);
        C7461a.m28364C(parcel, 3, this.f13884f, false);
        C7461a.m28392x(parcel, 4, this.f13885g, false);
        C7461a.m28370b(parcel, a);
    }
}
