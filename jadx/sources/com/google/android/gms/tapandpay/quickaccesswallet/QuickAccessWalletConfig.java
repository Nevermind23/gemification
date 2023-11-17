package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new C4901d();

    /* renamed from: d */
    private int f15388d;

    /* renamed from: e */
    private int f15389e;

    /* renamed from: f */
    private int f15390f;

    /* renamed from: g */
    private String[] f15391g;

    private QuickAccessWalletConfig() {
    }

    /* renamed from: R */
    public int mo15240R() {
        return this.f15390f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15388d), Integer.valueOf(quickAccessWalletConfig.f15388d)) || !C7258g.m27880a(Integer.valueOf(this.f15389e), Integer.valueOf(quickAccessWalletConfig.f15389e)) || !C7258g.m27880a(Integer.valueOf(this.f15390f), Integer.valueOf(quickAccessWalletConfig.f15390f)) || !Arrays.equals(this.f15391g, quickAccessWalletConfig.f15391g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15388d), Integer.valueOf(this.f15389e), Integer.valueOf(this.f15390f), Integer.valueOf(Arrays.hashCode(this.f15391g)));
    }

    /* renamed from: v */
    public int mo15243v() {
        return this.f15389e;
    }

    /* renamed from: w */
    public int mo15244w() {
        return this.f15388d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo15244w());
        C7461a.m28383o(parcel, 2, mo15243v());
        C7461a.m28383o(parcel, 3, mo15240R());
        C7461a.m28393y(parcel, 5, mo15246x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String[] mo15246x() {
        return this.f15391g;
    }

    QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.f15388d = i;
        this.f15389e = i2;
        this.f15390f = i3;
        this.f15391g = strArr;
    }
}
