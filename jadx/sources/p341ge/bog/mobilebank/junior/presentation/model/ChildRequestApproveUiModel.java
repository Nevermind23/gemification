package p341ge.bog.mobilebank.junior.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import sm0.C28251c;

/* renamed from: ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel */
public final class ChildRequestApproveUiModel implements Parcelable {
    public static final Parcelable.Creator<ChildRequestApproveUiModel> CREATOR = new C24674b();

    /* renamed from: l */
    public static final C24673a f63533l = new C24673a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final long f63534d;

    /* renamed from: e */
    private final String f63535e;

    /* renamed from: f */
    private final int f63536f;

    /* renamed from: g */
    private final boolean f63537g;

    /* renamed from: h */
    private final String f63538h;

    /* renamed from: i */
    private final String f63539i;

    /* renamed from: j */
    private final String f63540j;

    /* renamed from: k */
    private final Long f63541k;

    /* renamed from: ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel$a */
    public static final class C24673a {
        private C24673a() {
        }

        public /* synthetic */ C24673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChildRequestApproveUiModel mo63043a(C28251c cVar) {
            C41536l.m120489i(cVar, "<this>");
            return new ChildRequestApproveUiModel(cVar.mo67787a(), cVar.mo67789c(), cVar.mo67795h(), cVar.mo67794g(), cVar.mo67790d(), cVar.mo67788b(), cVar.mo67791e(), cVar.mo67793f());
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel$b */
    public static final class C24674b implements Parcelable.Creator {
        /* renamed from: a */
        public final ChildRequestApproveUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ChildRequestApproveUiModel(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final ChildRequestApproveUiModel[] newArray(int i) {
            return new ChildRequestApproveUiModel[i];
        }
    }

    public ChildRequestApproveUiModel(long j, String str, int i, boolean z, String str2, String str3, String str4, Long l) {
        C41536l.m120489i(str, "childFirstNameInt");
        C41536l.m120489i(str2, "childLastName");
        C41536l.m120489i(str3, "childFirstName");
        C41536l.m120489i(str4, "childLastNameInt");
        this.f63534d = j;
        this.f63535e = str;
        this.f63536f = i;
        this.f63537g = z;
        this.f63538h = str2;
        this.f63539i = str3;
        this.f63540j = str4;
        this.f63541k = l;
    }

    /* renamed from: a */
    public final long mo63033a() {
        return this.f63534d;
    }

    /* renamed from: b */
    public final String mo63034b() {
        return this.f63539i;
    }

    /* renamed from: d */
    public final String mo63035d() {
        return this.f63538h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo63037e() {
        return this.f63541k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildRequestApproveUiModel)) {
            return false;
        }
        ChildRequestApproveUiModel childRequestApproveUiModel = (ChildRequestApproveUiModel) obj;
        return this.f63534d == childRequestApproveUiModel.f63534d && C41536l.m120484d(this.f63535e, childRequestApproveUiModel.f63535e) && this.f63536f == childRequestApproveUiModel.f63536f && this.f63537g == childRequestApproveUiModel.f63537g && C41536l.m120484d(this.f63538h, childRequestApproveUiModel.f63538h) && C41536l.m120484d(this.f63539i, childRequestApproveUiModel.f63539i) && C41536l.m120484d(this.f63540j, childRequestApproveUiModel.f63540j) && C41536l.m120484d(this.f63541k, childRequestApproveUiModel.f63541k);
    }

    /* renamed from: f */
    public final boolean mo63039f() {
        return this.f63537g;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f63534d) * 31) + this.f63535e.hashCode()) * 31) + this.f63536f) * 31;
        boolean z = this.f63537g;
        if (z) {
            z = true;
        }
        int hashCode = (((((((a + (z ? 1 : 0)) * 31) + this.f63538h.hashCode()) * 31) + this.f63539i.hashCode()) * 31) + this.f63540j.hashCode()) * 31;
        Long l = this.f63541k;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.f63534d;
        String str = this.f63535e;
        int i = this.f63536f;
        boolean z = this.f63537g;
        String str2 = this.f63538h;
        String str3 = this.f63539i;
        String str4 = this.f63540j;
        Long l = this.f63541k;
        return "ChildRequestApproveUiModel(childClientKey=" + j + ", childFirstNameInt=" + str + ", resultCode=" + i + ", hasSchoolCard=" + z + ", childLastName=" + str2 + ", childFirstName=" + str3 + ", childLastNameInt=" + str4 + ", childRequestId=" + l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f63534d);
        parcel.writeString(this.f63535e);
        parcel.writeInt(this.f63536f);
        parcel.writeInt(this.f63537g ? 1 : 0);
        parcel.writeString(this.f63538h);
        parcel.writeString(this.f63539i);
        parcel.writeString(this.f63540j);
        Long l = this.f63541k;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
