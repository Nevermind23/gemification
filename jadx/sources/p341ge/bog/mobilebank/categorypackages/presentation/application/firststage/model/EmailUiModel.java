package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel */
public final class EmailUiModel implements Parcelable {
    public static final Parcelable.Creator<EmailUiModel> CREATOR = new C14457a();

    /* renamed from: d */
    private final String f42259d;

    /* renamed from: e */
    private final String f42260e;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel$a */
    public static final class C14457a implements Parcelable.Creator {
        /* renamed from: a */
        public final EmailUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new EmailUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final EmailUiModel[] newArray(int i) {
            return new EmailUiModel[i];
        }
    }

    public EmailUiModel(String str, String str2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "email");
        this.f42259d = str;
        this.f42260e = str2;
    }

    /* renamed from: a */
    public final String mo40655a() {
        return this.f42260e;
    }

    /* renamed from: b */
    public final String mo40656b() {
        return this.f42259d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailUiModel)) {
            return false;
        }
        EmailUiModel emailUiModel = (EmailUiModel) obj;
        return C41536l.m120484d(this.f42259d, emailUiModel.f42259d) && C41536l.m120484d(this.f42260e, emailUiModel.f42260e);
    }

    public int hashCode() {
        return (this.f42259d.hashCode() * 31) + this.f42260e.hashCode();
    }

    public String toString() {
        String str = this.f42259d;
        String str2 = this.f42260e;
        return "EmailUiModel(id=" + str + ", email=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42259d);
        parcel.writeString(this.f42260e);
    }
}
