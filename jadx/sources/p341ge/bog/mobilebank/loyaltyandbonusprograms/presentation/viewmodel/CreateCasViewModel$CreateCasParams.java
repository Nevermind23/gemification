package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreateCasViewModel$CreateCasParams */
public final class CreateCasViewModel$CreateCasParams implements Parcelable {
    public static final Parcelable.Creator<CreateCasViewModel$CreateCasParams> CREATOR = new C33118a();

    /* renamed from: d */
    private final long f81119d;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreateCasViewModel$CreateCasParams$a */
    public static final class C33118a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreateCasViewModel$CreateCasParams createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreateCasViewModel$CreateCasParams(parcel.readLong());
        }

        /* renamed from: b */
        public final CreateCasViewModel$CreateCasParams[] newArray(int i) {
            return new CreateCasViewModel$CreateCasParams[i];
        }
    }

    public CreateCasViewModel$CreateCasParams() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final long mo75215a() {
        return this.f81119d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateCasViewModel$CreateCasParams) && this.f81119d == ((CreateCasViewModel$CreateCasParams) obj).f81119d;
    }

    public int hashCode() {
        return C7397t.m28148a(this.f81119d);
    }

    public String toString() {
        long j = this.f81119d;
        return "CreateCasParams(depositAgreeKey=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81119d);
    }

    public CreateCasViewModel$CreateCasParams(long j) {
        this.f81119d = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateCasViewModel$CreateCasParams(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : j);
    }
}
