package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p143k6.C6818a;
import p143k6.C6823e;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public final class Status extends AbstractSafeParcelable implements C6823e, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C3865e();

    /* renamed from: i */
    public static final Status f12251i = new Status(-1);

    /* renamed from: j */
    public static final Status f12252j = new Status(0);

    /* renamed from: k */
    public static final Status f12253k = new Status(14);

    /* renamed from: l */
    public static final Status f12254l = new Status(8);

    /* renamed from: m */
    public static final Status f12255m = new Status(15);

    /* renamed from: n */
    public static final Status f12256n = new Status(16);

    /* renamed from: o */
    public static final Status f12257o = new Status(18);

    /* renamed from: p */
    public static final Status f12258p = new Status(17);

    /* renamed from: d */
    final int f12259d;

    /* renamed from: e */
    private final int f12260e;

    /* renamed from: f */
    private final String f12261f;

    /* renamed from: g */
    private final PendingIntent f12262g;

    /* renamed from: h */
    private final ConnectionResult f12263h;

    Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f12259d = i;
        this.f12260e = i2;
        this.f12261f = str;
        this.f12262g = pendingIntent;
        this.f12263h = connectionResult;
    }

    /* renamed from: R */
    public String mo11899R() {
        return this.f12261f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f12259d != status.f12259d || this.f12260e != status.f12260e || !C7258g.m27880a(this.f12261f, status.f12261f) || !C7258g.m27880a(this.f12262g, status.f12262g) || !C7258g.m27880a(this.f12263h, status.f12263h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public boolean mo11901f0() {
        return this.f12262g != null;
    }

    /* renamed from: f1 */
    public final String mo11902f1() {
        String str = this.f12261f;
        return str != null ? str : C6818a.m26551a(this.f12260e);
    }

    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f12259d), Integer.valueOf(this.f12260e), this.f12261f, this.f12262g, this.f12263h);
    }

    /* renamed from: q0 */
    public boolean mo11905q0() {
        return this.f12260e <= 0;
    }

    /* renamed from: s0 */
    public void mo11906s0(Activity activity, int i) {
        if (mo11901f0()) {
            PendingIntent pendingIntent = this.f12262g;
            C7264i.m27902k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public String toString() {
        C7258g.C7259a c = C7258g.m27882c(this);
        c.mo21632a("statusCode", mo11902f1());
        c.mo21632a("resolution", this.f12262g);
        return c.toString();
    }

    /* renamed from: v */
    public ConnectionResult mo11908v() {
        return this.f12263h;
    }

    /* renamed from: w */
    public PendingIntent mo11909w() {
        return this.f12262g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo11911x());
        C7461a.m28392x(parcel, 2, mo11899R(), false);
        C7461a.m28390v(parcel, 3, this.f12262g, i, false);
        C7461a.m28390v(parcel, 4, mo11908v(), i, false);
        C7461a.m28383o(parcel, 1000, this.f12259d);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo11911x() {
        return this.f12260e;
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(ConnectionResult connectionResult, String str, int i) {
        this(1, i, str, connectionResult.mo11861x(), connectionResult);
    }
}
