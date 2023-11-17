package p341ge.bog.designsystem.components.actionsheet.additionalactions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.UrlHandler;
import java.lang.Enum;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17786k;

/* renamed from: ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction */
public final class AdditionalAction<E extends Enum<E>> implements Parcelable {
    public static final Parcelable.Creator<AdditionalAction<?>> CREATOR = new C13157a();

    /* renamed from: d */
    private final String f38758d;

    /* renamed from: e */
    private final Enum f38759e;

    /* renamed from: f */
    private final int f38760f;

    /* renamed from: g */
    private final Integer f38761g;

    /* renamed from: h */
    private final Integer f38762h;

    /* renamed from: ge.bog.designsystem.components.actionsheet.additionalactions.model.AdditionalAction$a */
    public static final class C13157a implements Parcelable.Creator {
        /* renamed from: a */
        public final AdditionalAction createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AdditionalAction(parcel.readString(), (Enum) parcel.readSerializable(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final AdditionalAction[] newArray(int i) {
            return new AdditionalAction[i];
        }
    }

    public AdditionalAction(String str, Enum enumR, int i, Integer num, Integer num2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(enumR, UrlHandler.ACTION);
        this.f38758d = str;
        this.f38759e = enumR;
        this.f38760f = i;
        this.f38761g = num;
        this.f38762h = num2;
    }

    /* renamed from: a */
    public final Enum mo34770a() {
        return this.f38759e;
    }

    /* renamed from: b */
    public final Integer mo34771b() {
        return this.f38761g;
    }

    /* renamed from: d */
    public final Integer mo34772d() {
        return this.f38762h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo34774e() {
        return this.f38758d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalAction)) {
            return false;
        }
        AdditionalAction additionalAction = (AdditionalAction) obj;
        return C41536l.m120484d(this.f38758d, additionalAction.f38758d) && C41536l.m120484d(this.f38759e, additionalAction.f38759e) && this.f38760f == additionalAction.f38760f && C41536l.m120484d(this.f38761g, additionalAction.f38761g) && C41536l.m120484d(this.f38762h, additionalAction.f38762h);
    }

    /* renamed from: f */
    public final int mo34776f() {
        return this.f38760f;
    }

    public int hashCode() {
        int hashCode = ((((this.f38758d.hashCode() * 31) + this.f38759e.hashCode()) * 31) + this.f38760f) * 31;
        Integer num = this.f38761g;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f38762h;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f38758d;
        Enum enumR = this.f38759e;
        int i = this.f38760f;
        Integer num = this.f38761g;
        Integer num2 = this.f38762h;
        return "AdditionalAction(title=" + str + ", action=" + enumR + ", titleStyle=" + i + ", iconId=" + num + ", tintColorId=" + num2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f38758d);
        parcel.writeSerializable(this.f38759e);
        parcel.writeInt(this.f38760f);
        Integer num = this.f38761g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f38762h;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdditionalAction(String str, Enum enumR, int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumR, (i2 & 4) != 0 ? C17786k.f49823N : i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }
}
