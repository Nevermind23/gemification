package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new C4902e();

    /* renamed from: d */
    private int f15392d;

    /* renamed from: e */
    private Account f15393e;

    /* renamed from: f */
    private QuickAccessWalletCard[] f15394f;

    private SetQuickAccessWalletCardsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15392d), Integer.valueOf(setQuickAccessWalletCardsRequest.f15392d)) || !C7258g.m27880a(this.f15393e, setQuickAccessWalletCardsRequest.f15393e) || !Arrays.equals(this.f15394f, setQuickAccessWalletCardsRequest.f15394f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15392d), this.f15393e, Integer.valueOf(Arrays.hashCode(this.f15394f)));
    }

    /* renamed from: v */
    public Account mo15249v() {
        return this.f15393e;
    }

    /* renamed from: w */
    public QuickAccessWalletCard[] mo15250w() {
        return this.f15394f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo15252x());
        C7461a.m28390v(parcel, 2, mo15249v(), i, false);
        C7461a.m28363B(parcel, 3, mo15250w(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo15252x() {
        return this.f15392d;
    }

    SetQuickAccessWalletCardsRequest(int i, Account account, QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.f15392d = i;
        this.f15393e = account;
        this.f15394f = quickAccessWalletCardArr;
    }
}
