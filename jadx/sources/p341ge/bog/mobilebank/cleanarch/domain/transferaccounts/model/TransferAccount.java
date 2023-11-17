package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount */
public final class TransferAccount implements Parcelable {
    public static final Parcelable.Creator<TransferAccount> CREATOR = new C21040a();

    /* renamed from: d */
    private final List f56499d;

    /* renamed from: e */
    private final List f56500e;

    /* renamed from: f */
    private final BigDecimal f56501f;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount$a */
    public static final class C21040a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferAccount createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TransferAccountItem.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(TransferAccountItem.CREATOR.createFromParcel(parcel));
            }
            return new TransferAccount(arrayList, arrayList2, (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final TransferAccount[] newArray(int i) {
            return new TransferAccount[i];
        }
    }

    public TransferAccount(List list, List list2, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "src");
        C41536l.m120489i(list2, C11772k.C11773a.f34174f);
        this.f56499d = list;
        this.f56500e = list2;
        this.f56501f = bigDecimal;
    }

    /* renamed from: a */
    public final List mo52122a() {
        return this.f56500e;
    }

    /* renamed from: b */
    public final List mo52123b() {
        return this.f56499d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccount)) {
            return false;
        }
        TransferAccount transferAccount = (TransferAccount) obj;
        return C41536l.m120484d(this.f56499d, transferAccount.f56499d) && C41536l.m120484d(this.f56500e, transferAccount.f56500e) && C41536l.m120484d(this.f56501f, transferAccount.f56501f);
    }

    public int hashCode() {
        int hashCode = ((this.f56499d.hashCode() * 31) + this.f56500e.hashCode()) * 31;
        BigDecimal bigDecimal = this.f56501f;
        return hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        List list = this.f56499d;
        List list2 = this.f56500e;
        BigDecimal bigDecimal = this.f56501f;
        return "TransferAccount(src=" + list + ", dst=" + list2 + ", amountLimit=" + bigDecimal + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<TransferAccountItem> list = this.f56499d;
        parcel.writeInt(list.size());
        for (TransferAccountItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<TransferAccountItem> list2 = this.f56500e;
        parcel.writeInt(list2.size());
        for (TransferAccountItem writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.f56501f);
    }
}
