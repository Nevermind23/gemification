package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;

public final class FaceTecSessionResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecSessionResult> CREATOR = new Parcelable.Creator<FaceTecSessionResult>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FaceTecSessionResult(parcel);
        }

        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FaceTecSessionResult[i];
        }
    };

    /* renamed from: a */
    private String f8643a;

    /* renamed from: b */
    private final byte[] f8644b;

    /* renamed from: c */
    private final FaceTecSessionStatus f8645c;

    /* renamed from: d */
    private final byte[][] f8646d;

    /* renamed from: e */
    private final byte[][] f8647e;

    protected FaceTecSessionResult(Parcel parcel) {
        this.f8645c = FaceTecSessionStatus.valueOf(parcel.readString());
        this.f8643a = parcel.readString();
        this.f8646d = (byte[][]) C2864bx.m11693a(parcel);
        this.f8647e = (byte[][]) C2864bx.m11693a(parcel);
        this.f8644b = (byte[]) C2864bx.m11693a(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8777b(String str) {
        this.f8643a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String[] getAuditTrailCompressedBase64() {
        byte[][] bArr = this.f8646d;
        int i = 0;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        while (true) {
            byte[][] bArr2 = this.f8646d;
            if (i >= bArr2.length) {
                return strArr;
            }
            strArr[i] = Base64.encodeToString(bArr2[i], 2);
            i++;
        }
    }

    public final byte[] getFaceScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f8644b;
        if (bArr2 != null) {
            return bArr2;
        }
        return bArr;
    }

    public final String getFaceScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f8644b;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public final String[] getLowQualityAuditTrailCompressedBase64() {
        byte[][] bArr = this.f8647e;
        int i = 0;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        while (true) {
            byte[][] bArr2 = this.f8647e;
            if (i >= bArr2.length) {
                return strArr;
            }
            strArr[i] = Base64.encodeToString(bArr2[i], 2);
            i++;
        }
    }

    public final String getSessionId() {
        return this.f8643a;
    }

    public final FaceTecSessionStatus getStatus() {
        return this.f8645c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8645c.name());
        parcel.writeString(this.f8643a);
        C2864bx.m11695a(this.f8646d, parcel);
        C2864bx.m11695a(this.f8647e, parcel);
        C2864bx.m11695a(this.f8644b, parcel);
    }

    FaceTecSessionResult(FaceTecSessionStatus faceTecSessionStatus, byte[][] bArr, byte[][] bArr2, byte[] bArr3) {
        this.f8645c = faceTecSessionStatus;
        this.f8646d = bArr;
        this.f8647e = bArr2;
        this.f8644b = bArr3;
    }
}
