package p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.model.QrMerchantInfoUiModel */
public final class QrMerchantInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<QrMerchantInfoUiModel> CREATOR = new C22535a();

    /* renamed from: d */
    private C24978b f59590d;

    /* renamed from: e */
    private final String f59591e;

    /* renamed from: f */
    private final String f59592f;

    /* renamed from: g */
    private final String f59593g;

    /* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.presentation.model.QrMerchantInfoUiModel$a */
    public static final class C22535a implements Parcelable.Creator {
        /* renamed from: a */
        public final QrMerchantInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new QrMerchantInfoUiModel(parcel.readInt() == 0 ? null : C24978b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final QrMerchantInfoUiModel[] newArray(int i) {
            return new QrMerchantInfoUiModel[i];
        }
    }

    public QrMerchantInfoUiModel(C24978b bVar, String str, String str2, String str3) {
        this.f59590d = bVar;
        this.f59591e = str;
        this.f59592f = str2;
        this.f59593g = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        C24978b bVar = this.f59590d;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeString(this.f59591e);
        parcel.writeString(this.f59592f);
        parcel.writeString(this.f59593g);
    }
}
