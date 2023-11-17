package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p182n6.C7258g;
import p182n6.C7264i;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: d */
    public Object mo12342d(String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : mo11599a().values()) {
            if (mo11601e(field)) {
                if (!fastJsonResponse.mo11601e(field) || !C7258g.m27880a(mo11600b(field), fastJsonResponse.mo11600b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo11601e(field)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo12343f(String str) {
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field field : mo11599a().values()) {
            if (mo11601e(field)) {
                i = (i * 31) + C7264i.m27902k(mo11600b(field)).hashCode();
            }
        }
        return i;
    }
}
