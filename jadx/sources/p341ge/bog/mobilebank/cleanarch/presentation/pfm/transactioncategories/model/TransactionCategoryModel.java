package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel */
public final class TransactionCategoryModel implements Parcelable {
    public static final Parcelable.Creator<TransactionCategoryModel> CREATOR = new C22242a();

    /* renamed from: d */
    private final int f59037d;

    /* renamed from: e */
    private final long f59038e;

    /* renamed from: f */
    private final boolean f59039f;

    /* renamed from: g */
    private final String f59040g;

    /* renamed from: h */
    private final Long f59041h;

    /* renamed from: i */
    private final boolean f59042i;

    /* renamed from: j */
    private List f59043j;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel$a */
    public static final class C22242a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransactionCategoryModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(TransactionCategoryModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new TransactionCategoryModel(readInt, readLong, z, readString, valueOf, z2, arrayList);
        }

        /* renamed from: b */
        public final TransactionCategoryModel[] newArray(int i) {
            return new TransactionCategoryModel[i];
        }
    }

    public TransactionCategoryModel(int i, long j, boolean z, String str, Long l, boolean z2, List list) {
        C41536l.m120489i(str, "displayName");
        this.f59037d = i;
        this.f59038e = j;
        this.f59039f = z;
        this.f59040g = str;
        this.f59041h = l;
        this.f59042i = z2;
        this.f59043j = list;
    }

    /* renamed from: a */
    public final long mo55075a() {
        return this.f59038e;
    }

    /* renamed from: b */
    public final boolean mo55076b() {
        return this.f59039f;
    }

    /* renamed from: d */
    public final boolean mo55077d() {
        return this.f59042i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo55079e() {
        return this.f59043j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionCategoryModel)) {
            return false;
        }
        TransactionCategoryModel transactionCategoryModel = (TransactionCategoryModel) obj;
        return this.f59037d == transactionCategoryModel.f59037d && this.f59038e == transactionCategoryModel.f59038e && this.f59039f == transactionCategoryModel.f59039f && C41536l.m120484d(this.f59040g, transactionCategoryModel.f59040g) && C41536l.m120484d(this.f59041h, transactionCategoryModel.f59041h) && this.f59042i == transactionCategoryModel.f59042i && C41536l.m120484d(this.f59043j, transactionCategoryModel.f59043j);
    }

    /* renamed from: f */
    public final int mo55081f() {
        return this.f59037d;
    }

    /* renamed from: g */
    public final String mo55082g() {
        return this.f59040g;
    }

    /* renamed from: h */
    public final Long mo55083h() {
        return this.f59041h;
    }

    public int hashCode() {
        int a = ((this.f59037d * 31) + C7397t.m28148a(this.f59038e)) * 31;
        boolean z = this.f59039f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((a + (z ? 1 : 0)) * 31) + this.f59040g.hashCode()) * 31;
        Long l = this.f59041h;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        boolean z3 = this.f59042i;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (hashCode2 + (z2 ? 1 : 0)) * 31;
        List list = this.f59043j;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    /* renamed from: i */
    public final void mo55085i(List list) {
        this.f59043j = list;
    }

    public String toString() {
        int i = this.f59037d;
        long j = this.f59038e;
        boolean z = this.f59039f;
        String str = this.f59040g;
        Long l = this.f59041h;
        boolean z2 = this.f59042i;
        List list = this.f59043j;
        return "TransactionCategoryModel(color=" + i + ", catId=" + j + ", catIsCustom=" + z + ", displayName=" + str + ", parentCatId=" + l + ", catIsIncome=" + z2 + ", categories=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f59037d);
        parcel.writeLong(this.f59038e);
        parcel.writeInt(this.f59039f ? 1 : 0);
        parcel.writeString(this.f59040g);
        Long l = this.f59041h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.f59042i ? 1 : 0);
        List<TransactionCategoryModel> list = this.f59043j;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (TransactionCategoryModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
