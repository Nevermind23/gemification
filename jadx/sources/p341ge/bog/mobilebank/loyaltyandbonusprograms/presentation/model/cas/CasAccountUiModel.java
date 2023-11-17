package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel */
public final class CasAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<CasAccountUiModel> CREATOR = new C33102a();

    /* renamed from: d */
    private final long f81017d;

    /* renamed from: e */
    private final long f81018e;

    /* renamed from: f */
    private final long f81019f;

    /* renamed from: g */
    private final String f81020g;

    /* renamed from: h */
    private final double f81021h;

    /* renamed from: i */
    private final String f81022i;

    /* renamed from: j */
    private final String f81023j;

    /* renamed from: k */
    private final Integer f81024k;

    /* renamed from: l */
    private final String f81025l;

    /* renamed from: m */
    private final boolean f81026m;

    /* renamed from: n */
    private final boolean f81027n;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel$a */
    public static final class C33102a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new CasAccountUiModel(readLong, readLong2, readLong3, readString, readDouble, readString2, readString3, valueOf, readString4, z2, z);
        }

        /* renamed from: b */
        public final CasAccountUiModel[] newArray(int i) {
            return new CasAccountUiModel[i];
        }
    }

    public CasAccountUiModel(long j, long j2, long j3, String str, double d, String str2, String str3, Integer num, String str4, boolean z, boolean z2) {
        C41536l.m120489i(str, "acctName");
        this.f81017d = j;
        this.f81018e = j2;
        this.f81019f = j3;
        this.f81020g = str;
        this.f81021h = d;
        this.f81022i = str2;
        this.f81023j = str3;
        this.f81024k = num;
        this.f81025l = str4;
        this.f81026m = z;
        this.f81027n = z2;
    }

    /* renamed from: a */
    public final long mo75002a() {
        return this.f81019f;
    }

    /* renamed from: b */
    public final String mo75003b() {
        return this.f81020g;
    }

    /* renamed from: d */
    public final String mo75004d() {
        return this.f81025l;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer mo75006e() {
        return this.f81024k;
    }

    /* renamed from: f */
    public final double mo75007f() {
        return this.f81021h;
    }

    /* renamed from: g */
    public final String mo75008g() {
        return this.f81022i;
    }

    /* renamed from: h */
    public final boolean mo75009h() {
        return this.f81027n;
    }

    /* renamed from: i */
    public final boolean mo75010i() {
        return this.f81026m;
    }

    /* renamed from: j */
    public final String mo75011j() {
        return this.f81023j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81017d);
        parcel.writeLong(this.f81018e);
        parcel.writeLong(this.f81019f);
        parcel.writeString(this.f81020g);
        parcel.writeDouble(this.f81021h);
        parcel.writeString(this.f81022i);
        parcel.writeString(this.f81023j);
        Integer num = this.f81024k;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f81025l);
        parcel.writeInt(this.f81026m ? 1 : 0);
        parcel.writeInt(this.f81027n ? 1 : 0);
    }
}
