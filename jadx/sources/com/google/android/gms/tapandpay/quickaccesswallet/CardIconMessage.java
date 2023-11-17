package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class CardIconMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardIconMessage> CREATOR = new C4898a();

    /* renamed from: d */
    private int[] f15375d;

    /* renamed from: e */
    private int f15376e;

    /* renamed from: f */
    private String f15377f;

    private CardIconMessage() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardIconMessage) {
            CardIconMessage cardIconMessage = (CardIconMessage) obj;
            if (!Arrays.equals(this.f15375d, cardIconMessage.f15375d) || !C7258g.m27880a(Integer.valueOf(this.f15376e), Integer.valueOf(cardIconMessage.f15376e)) || !C7258g.m27880a(this.f15377f, cardIconMessage.f15377f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f15375d)), Integer.valueOf(this.f15376e), this.f15377f);
    }

    /* renamed from: v */
    public int[] mo15220v() {
        return this.f15375d;
    }

    /* renamed from: w */
    public int mo15221w() {
        return this.f15376e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28384p(parcel, 1, mo15220v(), false);
        C7461a.m28383o(parcel, 2, mo15221w());
        C7461a.m28392x(parcel, 3, mo15223x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo15223x() {
        return this.f15377f;
    }

    CardIconMessage(int[] iArr, int i, String str) {
        this.f15375d = iArr;
        this.f15376e = i;
        this.f15377f = str;
    }
}
