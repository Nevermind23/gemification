package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class WalletCardIntentExtra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new C4904g();

    /* renamed from: d */
    private String f15398d;

    /* renamed from: e */
    private int f15399e;

    /* renamed from: f */
    private String f15400f;

    /* renamed from: g */
    private byte[] f15401g;

    /* renamed from: h */
    private boolean f15402h;

    /* renamed from: i */
    private int f15403i;

    /* renamed from: j */
    private long f15404j;

    private WalletCardIntentExtra() {
    }

    /* renamed from: R */
    public int mo15259R() {
        return this.f15403i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            if (!C7258g.m27880a(this.f15398d, walletCardIntentExtra.f15398d) || !C7258g.m27880a(Integer.valueOf(this.f15399e), Integer.valueOf(walletCardIntentExtra.f15399e)) || !C7258g.m27880a(this.f15400f, walletCardIntentExtra.f15400f) || !Arrays.equals(this.f15401g, walletCardIntentExtra.f15401g) || !C7258g.m27880a(Boolean.valueOf(this.f15402h), Boolean.valueOf(walletCardIntentExtra.f15402h)) || !C7258g.m27880a(Integer.valueOf(this.f15403i), Integer.valueOf(walletCardIntentExtra.f15403i)) || !C7258g.m27880a(Long.valueOf(this.f15404j), Long.valueOf(walletCardIntentExtra.f15404j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public long mo15261f0() {
        return this.f15404j;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f15398d, Integer.valueOf(this.f15399e), this.f15400f, Integer.valueOf(Arrays.hashCode(this.f15401g)), Boolean.valueOf(this.f15402h), Integer.valueOf(this.f15403i), Long.valueOf(this.f15404j));
    }

    /* renamed from: q0 */
    public String mo15263q0() {
        return this.f15400f;
    }

    /* renamed from: s0 */
    public int mo15264s0() {
        return this.f15399e;
    }

    /* renamed from: v */
    public String mo15265v() {
        return this.f15398d;
    }

    /* renamed from: w */
    public boolean mo15266w() {
        return this.f15402h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo15265v(), false);
        C7461a.m28383o(parcel, 2, mo15264s0());
        C7461a.m28392x(parcel, 3, mo15263q0(), false);
        C7461a.m28376h(parcel, 4, mo15268x(), false);
        C7461a.m28372d(parcel, 5, mo15266w());
        C7461a.m28383o(parcel, 6, mo15259R());
        C7461a.m28387s(parcel, 7, mo15261f0());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo15268x() {
        return this.f15401g;
    }

    WalletCardIntentExtra(String str, int i, String str2, byte[] bArr, boolean z, int i2, long j) {
        this.f15398d = str;
        this.f15399e = i;
        this.f15400f = str2;
        this.f15401g = bArr;
        this.f15402h = z;
        this.f15403i = i2;
        this.f15404j = j;
    }
}
