package p341ge.bog.mobilebank.shared.chooser.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem */
public final class ChooserItem<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ChooserItem<?>> CREATOR = new C34636a();

    /* renamed from: d */
    private final Parcelable f83717d;

    /* renamed from: e */
    private final C43080q f83718e;

    /* renamed from: f */
    private final String f83719f;

    /* renamed from: g */
    private boolean f83720g;

    /* renamed from: h */
    private boolean f83721h;

    /* renamed from: i */
    private int f83722i;

    /* renamed from: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem$a */
    public static final class C34636a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChooserItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Parcelable readParcelable = parcel.readParcelable(ChooserItem.class.getClassLoader());
            C43080q qVar = (C43080q) parcel.readSerializable();
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ChooserItem(readParcelable, qVar, readString, z2, z, parcel.readInt());
        }

        /* renamed from: b */
        public final ChooserItem[] newArray(int i) {
            return new ChooserItem[i];
        }
    }

    public ChooserItem(Parcelable parcelable, C43080q qVar, String str, boolean z, boolean z2, int i) {
        C41536l.m120489i(parcelable, C11755a.C11756a.f34100b);
        C41536l.m120489i(str, "displayedText");
        this.f83717d = parcelable;
        this.f83718e = qVar;
        this.f83719f = str;
        this.f83720g = z;
        this.f83721h = z2;
        this.f83722i = i;
    }

    /* renamed from: b */
    public static /* synthetic */ ChooserItem m101694b(ChooserItem chooserItem, Parcelable parcelable, C43080q qVar, String str, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            parcelable = chooserItem.f83717d;
        }
        if ((i2 & 2) != 0) {
            qVar = chooserItem.f83718e;
        }
        C43080q qVar2 = qVar;
        if ((i2 & 4) != 0) {
            str = chooserItem.f83719f;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z = chooserItem.f83720g;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = chooserItem.f83721h;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            i = chooserItem.f83722i;
        }
        return chooserItem.mo84279a(parcelable, qVar2, str2, z3, z4, i);
    }

    /* renamed from: a */
    public final ChooserItem mo84279a(Parcelable parcelable, C43080q qVar, String str, boolean z, boolean z2, int i) {
        C41536l.m120489i(parcelable, C11755a.C11756a.f34100b);
        C41536l.m120489i(str, "displayedText");
        return new ChooserItem(parcelable, qVar, str, z, z2, i);
    }

    /* renamed from: d */
    public final C43080q mo84280d() {
        return this.f83718e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo84282e() {
        return this.f83719f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooserItem)) {
            return false;
        }
        ChooserItem chooserItem = (ChooserItem) obj;
        return C41536l.m120484d(this.f83717d, chooserItem.f83717d) && C41536l.m120484d(this.f83718e, chooserItem.f83718e) && C41536l.m120484d(this.f83719f, chooserItem.f83719f) && this.f83720g == chooserItem.f83720g && this.f83721h == chooserItem.f83721h && this.f83722i == chooserItem.f83722i;
    }

    /* renamed from: f */
    public final boolean mo84284f() {
        return this.f83721h;
    }

    /* renamed from: g */
    public final int mo84285g() {
        return this.f83722i;
    }

    /* renamed from: h */
    public final Parcelable mo84286h() {
        return this.f83717d;
    }

    public int hashCode() {
        int hashCode = this.f83717d.hashCode() * 31;
        C43080q qVar = this.f83718e;
        int hashCode2 = (((hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31) + this.f83719f.hashCode()) * 31;
        boolean z = this.f83720g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f83721h;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f83722i;
    }

    /* renamed from: i */
    public final boolean mo84288i() {
        return this.f83720g;
    }

    /* renamed from: j */
    public final void mo84289j(boolean z) {
        this.f83720g = z;
    }

    /* renamed from: k */
    public final void mo84290k(boolean z) {
        this.f83721h = z;
    }

    /* renamed from: l */
    public final void mo84291l(int i) {
        this.f83722i = i;
    }

    public String toString() {
        Parcelable parcelable = this.f83717d;
        C43080q qVar = this.f83718e;
        String str = this.f83719f;
        boolean z = this.f83720g;
        boolean z2 = this.f83721h;
        int i = this.f83722i;
        return "ChooserItem(value=" + parcelable + ", bind=" + qVar + ", displayedText=" + str + ", isChecked=" + z + ", enabled=" + z2 + ", idx=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f83717d, i);
        parcel.writeSerializable((Serializable) this.f83718e);
        parcel.writeString(this.f83719f);
        parcel.writeInt(this.f83720g ? 1 : 0);
        parcel.writeInt(this.f83721h ? 1 : 0);
        parcel.writeInt(this.f83722i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChooserItem(Parcelable parcelable, C43080q qVar, String str, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelable, (i2 & 2) != 0 ? null : qVar, str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? -1 : i);
    }
}
