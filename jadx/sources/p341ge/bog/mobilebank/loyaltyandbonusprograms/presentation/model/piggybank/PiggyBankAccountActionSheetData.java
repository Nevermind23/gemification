package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountActionSheetData */
public final class PiggyBankAccountActionSheetData implements Parcelable {
    public static final Parcelable.Creator<PiggyBankAccountActionSheetData> CREATOR = new C33112a();

    /* renamed from: d */
    private final List f81100d;

    /* renamed from: e */
    private final String f81101e;

    /* renamed from: f */
    private final String f81102f;

    /* renamed from: g */
    private final String f81103g;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountActionSheetData$a */
    public static final class C33112a implements Parcelable.Creator {
        /* renamed from: a */
        public final PiggyBankAccountActionSheetData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PiggyBankAccountUiModel.CREATOR.createFromParcel(parcel));
            }
            return new PiggyBankAccountActionSheetData(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PiggyBankAccountActionSheetData[] newArray(int i) {
            return new PiggyBankAccountActionSheetData[i];
        }
    }

    public PiggyBankAccountActionSheetData(List list, String str, String str2, String str3) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str3, "buttonText");
        this.f81100d = list;
        this.f81101e = str;
        this.f81102f = str2;
        this.f81103g = str3;
    }

    /* renamed from: a */
    public final List mo75144a() {
        return this.f81100d;
    }

    /* renamed from: b */
    public final String mo75145b() {
        return this.f81103g;
    }

    /* renamed from: d */
    public final String mo75146d() {
        return this.f81102f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo75148e() {
        return this.f81101e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankAccountActionSheetData)) {
            return false;
        }
        PiggyBankAccountActionSheetData piggyBankAccountActionSheetData = (PiggyBankAccountActionSheetData) obj;
        return C41536l.m120484d(this.f81100d, piggyBankAccountActionSheetData.f81100d) && C41536l.m120484d(this.f81101e, piggyBankAccountActionSheetData.f81101e) && C41536l.m120484d(this.f81102f, piggyBankAccountActionSheetData.f81102f) && C41536l.m120484d(this.f81103g, piggyBankAccountActionSheetData.f81103g);
    }

    public int hashCode() {
        int hashCode = ((this.f81100d.hashCode() * 31) + this.f81101e.hashCode()) * 31;
        String str = this.f81102f;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f81103g.hashCode();
    }

    public String toString() {
        List list = this.f81100d;
        String str = this.f81101e;
        String str2 = this.f81102f;
        String str3 = this.f81103g;
        return "PiggyBankAccountActionSheetData(accounts=" + list + ", title=" + str + ", description=" + str2 + ", buttonText=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<PiggyBankAccountUiModel> list = this.f81100d;
        parcel.writeInt(list.size());
        for (PiggyBankAccountUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f81101e);
        parcel.writeString(this.f81102f);
        parcel.writeString(this.f81103g);
    }
}
