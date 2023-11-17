package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p411em.C12487d;
import p674xm.C18781a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel */
public final class AddressAdapterModel implements Parcelable {
    public static final Parcelable.Creator<AddressAdapterModel> CREATOR = new C14191a();

    /* renamed from: d */
    private final String f41604d;

    /* renamed from: e */
    private final long f41605e;

    /* renamed from: f */
    private final List f41606f;

    /* renamed from: g */
    private final C18781a f41607g;

    /* renamed from: h */
    private final int f41608h;

    /* renamed from: i */
    private final List f41609i;

    /* renamed from: j */
    private final boolean f41610j;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel$a */
    public static final class C14191a implements Parcelable.Creator {
        /* renamed from: a */
        public final AddressAdapterModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AddressAdapterModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new AddressAdapterModel(readString, readLong, arrayList, C18781a.valueOf(parcel.readString()), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final AddressAdapterModel[] newArray(int i) {
            return new AddressAdapterModel[i];
        }
    }

    public AddressAdapterModel(String str, long j, List list, C18781a aVar, int i, List list2, boolean z) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(aVar, "step");
        C41536l.m120489i(list2, "keyWords");
        this.f41604d = str;
        this.f41605e = j;
        this.f41606f = list;
        this.f41607g = aVar;
        this.f41608h = i;
        this.f41609i = list2;
        this.f41610j = z;
    }

    /* renamed from: a */
    public final boolean mo39270a() {
        return this.f41610j;
    }

    /* renamed from: b */
    public final int mo39271b() {
        return this.f41608h;
    }

    /* renamed from: d */
    public final long mo39272d() {
        return this.f41605e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo39274e() {
        return this.f41609i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAdapterModel)) {
            return false;
        }
        AddressAdapterModel addressAdapterModel = (AddressAdapterModel) obj;
        return C41536l.m120484d(this.f41604d, addressAdapterModel.f41604d) && this.f41605e == addressAdapterModel.f41605e && C41536l.m120484d(this.f41606f, addressAdapterModel.f41606f) && this.f41607g == addressAdapterModel.f41607g && this.f41608h == addressAdapterModel.f41608h && C41536l.m120484d(this.f41609i, addressAdapterModel.f41609i) && this.f41610j == addressAdapterModel.f41610j;
    }

    /* renamed from: f */
    public final String mo39276f() {
        return this.f41604d;
    }

    /* renamed from: g */
    public final C18781a mo39277g() {
        return this.f41607g;
    }

    /* renamed from: h */
    public final List mo39278h() {
        return this.f41606f;
    }

    public int hashCode() {
        int hashCode = ((this.f41604d.hashCode() * 31) + C7397t.m28148a(this.f41605e)) * 31;
        List list = this.f41606f;
        int hashCode2 = (((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f41607g.hashCode()) * 31) + this.f41608h) * 31) + this.f41609i.hashCode()) * 31;
        boolean z = this.f41610j;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f41604d;
        long j = this.f41605e;
        List list = this.f41606f;
        C18781a aVar = this.f41607g;
        int i = this.f41608h;
        List list2 = this.f41609i;
        boolean z = this.f41610j;
        return "AddressAdapterModel(name=" + str + ", id=" + j + ", subAddresses=" + list + ", step=" + aVar + ", iconResId=" + i + ", keyWords=" + list2 + ", chevronVisible=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41604d);
        parcel.writeLong(this.f41605e);
        List<AddressAdapterModel> list = this.f41606f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AddressAdapterModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f41607g.name());
        parcel.writeInt(this.f41608h);
        parcel.writeStringList(this.f41609i);
        parcel.writeInt(this.f41610j ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressAdapterModel(String str, long j, List list, C18781a aVar, int i, List list2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, list, aVar, (i2 & 16) != 0 ? C12487d.f37162e : i, (i2 & 32) != 0 ? C41339p.m119900e(str) : list2, (i2 & 64) != 0 ? true : z);
    }
}
