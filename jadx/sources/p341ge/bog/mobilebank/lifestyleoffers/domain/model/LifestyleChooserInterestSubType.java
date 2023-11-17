package p341ge.bog.mobilebank.lifestyleoffers.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestSubType */
public final class LifestyleChooserInterestSubType implements Parcelable {
    public static final Parcelable.Creator<LifestyleChooserInterestSubType> CREATOR = new C14934a();
    private final String interestSubType;
    private final String subTypeDesc;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestSubType$a */
    public static final class C14934a implements Parcelable.Creator {
        /* renamed from: a */
        public final LifestyleChooserInterestSubType createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LifestyleChooserInterestSubType(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LifestyleChooserInterestSubType[] newArray(int i) {
            return new LifestyleChooserInterestSubType[i];
        }
    }

    public LifestyleChooserInterestSubType(String str, String str2) {
        C41536l.m120489i(str, "interestSubType");
        C41536l.m120489i(str2, "subTypeDesc");
        this.interestSubType = str;
        this.subTypeDesc = str2;
    }

    public static /* synthetic */ LifestyleChooserInterestSubType copy$default(LifestyleChooserInterestSubType lifestyleChooserInterestSubType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lifestyleChooserInterestSubType.interestSubType;
        }
        if ((i & 2) != 0) {
            str2 = lifestyleChooserInterestSubType.subTypeDesc;
        }
        return lifestyleChooserInterestSubType.copy(str, str2);
    }

    public final String component1() {
        return this.interestSubType;
    }

    public final String component2() {
        return this.subTypeDesc;
    }

    public final LifestyleChooserInterestSubType copy(String str, String str2) {
        C41536l.m120489i(str, "interestSubType");
        C41536l.m120489i(str2, "subTypeDesc");
        return new LifestyleChooserInterestSubType(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleChooserInterestSubType)) {
            return false;
        }
        LifestyleChooserInterestSubType lifestyleChooserInterestSubType = (LifestyleChooserInterestSubType) obj;
        return C41536l.m120484d(this.interestSubType, lifestyleChooserInterestSubType.interestSubType) && C41536l.m120484d(this.subTypeDesc, lifestyleChooserInterestSubType.subTypeDesc);
    }

    public final String getInterestSubType() {
        return this.interestSubType;
    }

    public final String getSubTypeDesc() {
        return this.subTypeDesc;
    }

    public int hashCode() {
        return (this.interestSubType.hashCode() * 31) + this.subTypeDesc.hashCode();
    }

    public String toString() {
        String str = this.interestSubType;
        String str2 = this.subTypeDesc;
        return "LifestyleChooserInterestSubType(interestSubType=" + str + ", subTypeDesc=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.interestSubType);
        parcel.writeString(this.subTypeDesc);
    }
}
