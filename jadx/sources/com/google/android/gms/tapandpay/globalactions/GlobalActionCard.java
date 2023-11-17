package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new C4883c();

    /* renamed from: d */
    private int f15298d;

    /* renamed from: e */
    private String f15299e;

    /* renamed from: f */
    private Bitmap f15300f;

    /* renamed from: g */
    private String f15301g;

    /* renamed from: h */
    private String f15302h;

    /* renamed from: i */
    private String f15303i;

    /* renamed from: j */
    private Bitmap f15304j;

    /* renamed from: k */
    private PendingIntent f15305k;

    private GlobalActionCard() {
    }

    /* renamed from: R */
    public String mo15135R() {
        return this.f15301g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15298d), Integer.valueOf(globalActionCard.f15298d)) || !C7258g.m27880a(this.f15299e, globalActionCard.f15299e) || !C7258g.m27880a(this.f15300f, globalActionCard.f15300f) || !C7258g.m27880a(this.f15301g, globalActionCard.f15301g) || !C7258g.m27880a(this.f15302h, globalActionCard.f15302h) || !C7258g.m27880a(this.f15303i, globalActionCard.f15303i) || !C7258g.m27880a(this.f15304j, globalActionCard.f15304j) || !C7258g.m27880a(this.f15305k, globalActionCard.f15305k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public String mo15137f0() {
        return this.f15303i;
    }

    /* renamed from: f1 */
    public PendingIntent mo15138f1() {
        return this.f15305k;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15298d), this.f15299e, this.f15300f, this.f15301g, this.f15302h, this.f15303i, this.f15304j, this.f15305k);
    }

    /* renamed from: q0 */
    public Bitmap mo15140q0() {
        return this.f15304j;
    }

    /* renamed from: s0 */
    public String mo15141s0() {
        return this.f15302h;
    }

    /* renamed from: v */
    public String mo15142v() {
        return this.f15299e;
    }

    /* renamed from: w */
    public Bitmap mo15143w() {
        return this.f15300f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo15145x());
        C7461a.m28392x(parcel, 2, mo15142v(), false);
        C7461a.m28390v(parcel, 3, mo15143w(), i, false);
        C7461a.m28392x(parcel, 4, mo15135R(), false);
        C7461a.m28392x(parcel, 5, mo15141s0(), false);
        C7461a.m28390v(parcel, 6, mo15140q0(), i, false);
        C7461a.m28390v(parcel, 7, mo15138f1(), i, false);
        C7461a.m28392x(parcel, 8, mo15137f0(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo15145x() {
        return this.f15298d;
    }

    GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.f15298d = i;
        this.f15299e = str;
        this.f15300f = bitmap;
        this.f15301g = str2;
        this.f15302h = str3;
        this.f15303i = str4;
        this.f15304j = bitmap2;
        this.f15305k = pendingIntent;
    }
}
