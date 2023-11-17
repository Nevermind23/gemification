package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.SelectorChipData */
public final class SelectorChipData implements Parcelable {
    public static final Parcelable.Creator<SelectorChipData> CREATOR = new C33101a();

    /* renamed from: d */
    private final String f81015d;

    /* renamed from: e */
    private final boolean f81016e;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.SelectorChipData$a */
    public static final class C33101a implements Parcelable.Creator {
        /* renamed from: a */
        public final SelectorChipData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SelectorChipData(parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final SelectorChipData[] newArray(int i) {
            return new SelectorChipData[i];
        }
    }

    public SelectorChipData(String str, boolean z) {
        C41536l.m120489i(str, "title");
        this.f81015d = str;
        this.f81016e = z;
    }

    /* renamed from: a */
    public final String mo74991a() {
        return this.f81015d;
    }

    /* renamed from: b */
    public final boolean mo74992b() {
        return this.f81016e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectorChipData)) {
            return false;
        }
        SelectorChipData selectorChipData = (SelectorChipData) obj;
        return C41536l.m120484d(this.f81015d, selectorChipData.f81015d) && this.f81016e == selectorChipData.f81016e;
    }

    public int hashCode() {
        int hashCode = this.f81015d.hashCode() * 31;
        boolean z = this.f81016e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f81015d;
        boolean z = this.f81016e;
        return "SelectorChipData(title=" + str + ", isSelected=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81015d);
        parcel.writeInt(this.f81016e ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectorChipData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
