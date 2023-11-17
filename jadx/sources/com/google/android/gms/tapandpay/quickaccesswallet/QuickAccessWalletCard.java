package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class QuickAccessWalletCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new C4900c();

    /* renamed from: d */
    private String f15380d;

    /* renamed from: e */
    private Bitmap f15381e;

    /* renamed from: f */
    private String f15382f;

    /* renamed from: g */
    private WalletCardIntent[] f15383g;

    /* renamed from: h */
    private CardIconMessage[] f15384h;

    /* renamed from: i */
    private long f15385i;

    /* renamed from: j */
    private long f15386j;

    /* renamed from: k */
    private String f15387k;

    private QuickAccessWalletCard() {
    }

    /* renamed from: R */
    public Bitmap mo15229R() {
        return this.f15381e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            if (!C7258g.m27880a(this.f15380d, quickAccessWalletCard.f15380d) || !C7258g.m27880a(this.f15381e, quickAccessWalletCard.f15381e) || !C7258g.m27880a(this.f15382f, quickAccessWalletCard.f15382f) || !Arrays.equals(this.f15383g, quickAccessWalletCard.f15383g) || !Arrays.equals(this.f15384h, quickAccessWalletCard.f15384h) || !C7258g.m27880a(Long.valueOf(this.f15385i), Long.valueOf(quickAccessWalletCard.f15385i)) || !C7258g.m27880a(Long.valueOf(this.f15386j), Long.valueOf(quickAccessWalletCard.f15386j)) || !C7258g.m27880a(this.f15387k, quickAccessWalletCard.f15387k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public String mo15231f0() {
        return this.f15382f;
    }

    /* renamed from: f1 */
    public WalletCardIntent[] mo15232f1() {
        return this.f15383g;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f15380d, this.f15381e, this.f15382f, Integer.valueOf(Arrays.hashCode(this.f15383g)), Integer.valueOf(Arrays.hashCode(this.f15384h)), Long.valueOf(this.f15385i), Long.valueOf(this.f15386j), this.f15387k);
    }

    /* renamed from: q0 */
    public long mo15234q0() {
        return this.f15386j;
    }

    /* renamed from: s0 */
    public CardIconMessage[] mo15235s0() {
        return this.f15384h;
    }

    /* renamed from: v */
    public String mo15236v() {
        return this.f15387k;
    }

    /* renamed from: w */
    public long mo15237w() {
        return this.f15385i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo15239x(), false);
        C7461a.m28390v(parcel, 2, mo15229R(), i, false);
        C7461a.m28392x(parcel, 3, mo15231f0(), false);
        C7461a.m28363B(parcel, 4, mo15232f1(), i, false);
        C7461a.m28363B(parcel, 5, mo15235s0(), i, false);
        C7461a.m28387s(parcel, 6, mo15237w());
        C7461a.m28387s(parcel, 7, mo15234q0());
        C7461a.m28392x(parcel, 8, mo15236v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo15239x() {
        return this.f15380d;
    }

    QuickAccessWalletCard(String str, Bitmap bitmap, String str2, WalletCardIntent[] walletCardIntentArr, CardIconMessage[] cardIconMessageArr, long j, long j2, String str3) {
        this.f15380d = str;
        this.f15381e = bitmap;
        this.f15382f = str2;
        this.f15383g = walletCardIntentArr;
        this.f15384h = cardIconMessageArr;
        this.f15385i = j;
        this.f15386j = j2;
        this.f15387k = str3;
    }
}
