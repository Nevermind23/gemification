package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C3950g();

    /* renamed from: h */
    public static final ConnectionResult f12230h = new ConnectionResult(0);

    /* renamed from: d */
    final int f12231d;

    /* renamed from: e */
    private final int f12232e;

    /* renamed from: f */
    private final PendingIntent f12233f;

    /* renamed from: g */
    private final String f12234g;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f12231d = i;
        this.f12232e = i2;
        this.f12233f = pendingIntent;
        this.f12234g = str;
    }

    /* renamed from: q0 */
    static String m14460q0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    /* renamed from: R */
    public boolean mo11853R() {
        return (this.f12232e == 0 || this.f12233f == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f12232e != connectionResult.f12232e || !C7258g.m27880a(this.f12233f, connectionResult.f12233f) || !C7258g.m27880a(this.f12234g, connectionResult.f12234g)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public boolean mo11855f0() {
        return this.f12232e == 0;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f12232e), this.f12233f, this.f12234g);
    }

    public String toString() {
        C7258g.C7259a c = C7258g.m27882c(this);
        c.mo21632a("statusCode", m14460q0(this.f12232e));
        c.mo21632a("resolution", this.f12233f);
        c.mo21632a("message", this.f12234g);
        return c.toString();
    }

    /* renamed from: v */
    public int mo11858v() {
        return this.f12232e;
    }

    /* renamed from: w */
    public String mo11859w() {
        return this.f12234g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12231d);
        C7461a.m28383o(parcel, 2, mo11858v());
        C7461a.m28390v(parcel, 3, mo11861x(), i, false);
        C7461a.m28392x(parcel, 4, mo11859w(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public PendingIntent mo11861x() {
        return this.f12233f;
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
