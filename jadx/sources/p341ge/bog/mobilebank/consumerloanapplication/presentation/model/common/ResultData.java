package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import h00.C24846c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData */
public final class ResultData implements Parcelable {
    public static final Parcelable.Creator<ResultData> CREATOR = new C22679a();

    /* renamed from: d */
    private final boolean f59882d;

    /* renamed from: e */
    private final C24846c f59883e;

    /* renamed from: f */
    private final String f59884f;

    /* renamed from: g */
    private final String f59885g;

    /* renamed from: h */
    private final BigDecimal f59886h;

    /* renamed from: i */
    private final String f59887i;

    /* renamed from: j */
    private final String f59888j;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData$a */
    public static final class C22679a implements Parcelable.Creator {
        /* renamed from: a */
        public final ResultData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ResultData(parcel.readInt() != 0, C24846c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ResultData[] newArray(int i) {
            return new ResultData[i];
        }
    }

    public ResultData(boolean z, C24846c cVar, String str, String str2, BigDecimal bigDecimal, String str3, String str4) {
        C41536l.m120489i(cVar, "status");
        this.f59882d = z;
        this.f59883e = cVar;
        this.f59884f = str;
        this.f59885g = str2;
        this.f59886h = bigDecimal;
        this.f59887i = str3;
        this.f59888j = str4;
    }

    /* renamed from: a */
    public final String mo56203a() {
        return this.f59885g;
    }

    /* renamed from: b */
    public final String mo56204b() {
        return this.f59888j;
    }

    /* renamed from: d */
    public final String mo56205d() {
        return this.f59887i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo56207e() {
        return this.f59886h;
    }

    /* renamed from: f */
    public final C24846c mo56208f() {
        return this.f59883e;
    }

    /* renamed from: g */
    public final String mo56209g() {
        return this.f59884f;
    }

    /* renamed from: h */
    public final boolean mo56210h() {
        return this.f59882d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f59882d ? 1 : 0);
        parcel.writeString(this.f59883e.name());
        parcel.writeString(this.f59884f);
        parcel.writeString(this.f59885g);
        parcel.writeSerializable(this.f59886h);
        parcel.writeString(this.f59887i);
        parcel.writeString(this.f59888j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResultData(boolean z, C24846c cVar, String str, String str2, BigDecimal bigDecimal, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, cVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bigDecimal, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
