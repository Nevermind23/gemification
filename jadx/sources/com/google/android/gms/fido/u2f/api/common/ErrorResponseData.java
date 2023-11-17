package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p105h7.C6454g;
import p105h7.C6456h;
import p182n6.C7258g;
import p195o6.C7461a;

@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new C4060d();

    /* renamed from: d */
    private final ErrorCode f13028d;

    /* renamed from: e */
    private final String f13029e;

    ErrorResponseData(int i, String str) {
        this.f13028d = ErrorCode.m15387b(i);
        this.f13029e = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!C7258g.m27880a(this.f13028d, errorResponseData.f13028d) || !C7258g.m27880a(this.f13029e, errorResponseData.f13029e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13028d, this.f13029e);
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        a.mo20319a("errorCode", this.f13028d.mo12677a());
        String str = this.f13029e;
        if (str != null) {
            a.mo20320b("errorMessage", str);
        }
        return a.toString();
    }

    /* renamed from: v */
    public int mo12683v() {
        return this.f13028d.mo12677a();
    }

    /* renamed from: w */
    public String mo12684w() {
        return this.f13029e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, mo12683v());
        C7461a.m28392x(parcel, 3, mo12684w(), false);
        C7461a.m28370b(parcel, a);
    }
}
