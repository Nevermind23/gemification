package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;

public final class FaceTecIDScanResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecIDScanResult> CREATOR = new Parcelable.Creator<FaceTecIDScanResult>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FaceTecIDScanResult(parcel);
        }

        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FaceTecIDScanResult[i];
        }
    };

    /* renamed from: a */
    ArrayList<String> f8620a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<String> f8621b = new ArrayList<>();

    /* renamed from: c */
    byte[] f8622c;

    /* renamed from: d */
    String f8623d;

    /* renamed from: e */
    private final FaceTecIDScanStatus f8624e;

    protected FaceTecIDScanResult(Parcel parcel) {
        this.f8624e = (FaceTecIDScanStatus) parcel.readSerializable();
        this.f8620a = (ArrayList) C2864bx.m11693a(parcel);
        this.f8621b = (ArrayList) C2864bx.m11693a(parcel);
        this.f8622c = (byte[]) C2864bx.m11693a(parcel);
        this.f8623d = (String) C2864bx.m11693a(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final ArrayList<String> getBackImagesCompressedBase64() {
        return this.f8621b;
    }

    public final ArrayList<String> getFrontImagesCompressedBase64() {
        return this.f8620a;
    }

    public final byte[] getIDScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f8622c;
        if (bArr2 != null) {
            return bArr2;
        }
        return bArr;
    }

    public final String getIDScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f8622c;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public final String getSessionId() {
        return this.f8623d;
    }

    public final FaceTecIDScanStatus getStatus() {
        return this.f8624e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f8624e);
        C2864bx.m11695a(this.f8620a, parcel);
        C2864bx.m11695a(this.f8621b, parcel);
        C2864bx.m11695a(this.f8622c, parcel);
        C2864bx.m11695a(this.f8623d, parcel);
    }

    FaceTecIDScanResult(FaceTecIDScanStatus faceTecIDScanStatus) {
        this.f8624e = faceTecIDScanStatus;
    }
}
