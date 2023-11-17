package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class WalletCardIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntent> CREATOR = new C4903f();

    /* renamed from: d */
    private String f15395d;

    /* renamed from: e */
    private String f15396e;

    /* renamed from: f */
    private WalletCardIntentExtra[] f15397f;

    private WalletCardIntent() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj;
            if (!C7258g.m27880a(this.f15395d, walletCardIntent.f15395d) || !C7258g.m27880a(this.f15396e, walletCardIntent.f15396e) || !Arrays.equals(this.f15397f, walletCardIntent.f15397f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f15395d, this.f15396e, Integer.valueOf(Arrays.hashCode(this.f15397f)));
    }

    /* renamed from: v */
    public String mo15255v() {
        return this.f15396e;
    }

    /* renamed from: w */
    public String mo15256w() {
        return this.f15395d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo15256w(), false);
        C7461a.m28392x(parcel, 2, mo15255v(), false);
        C7461a.m28363B(parcel, 3, mo15258x(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public WalletCardIntentExtra[] mo15258x() {
        return this.f15397f;
    }

    WalletCardIntent(String str, String str2, WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.f15395d = str;
        this.f15396e = str2;
        this.f15397f = walletCardIntentExtraArr;
    }
}
