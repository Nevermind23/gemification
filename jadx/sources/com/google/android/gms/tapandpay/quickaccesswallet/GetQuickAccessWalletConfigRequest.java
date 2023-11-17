package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetQuickAccessWalletConfigRequest> CREATOR = new C4899b();

    /* renamed from: d */
    private int f15378d;

    /* renamed from: e */
    private Account f15379e;

    private GetQuickAccessWalletConfigRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15378d), Integer.valueOf(getQuickAccessWalletConfigRequest.f15378d)) || !C7258g.m27880a(this.f15379e, getQuickAccessWalletConfigRequest.f15379e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15378d), this.f15379e);
    }

    /* renamed from: v */
    public Account mo15226v() {
        return this.f15379e;
    }

    /* renamed from: w */
    public int mo15227w() {
        return this.f15378d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo15227w());
        C7461a.m28390v(parcel, 2, mo15226v(), i, false);
        C7461a.m28370b(parcel, a);
    }

    GetQuickAccessWalletConfigRequest(int i, Account account) {
        this.f15378d = i;
        this.f15379e = account;
    }
}
