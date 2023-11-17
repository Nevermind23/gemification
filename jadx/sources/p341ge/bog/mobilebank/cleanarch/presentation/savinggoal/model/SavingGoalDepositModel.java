package p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.model.deposits.SavingGoal;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.model.SavingGoalDepositModel */
public final class SavingGoalDepositModel implements Parcelable {
    public static final Parcelable.Creator<SavingGoalDepositModel> CREATOR = new C22366a();

    /* renamed from: d */
    private final String f59247d;

    /* renamed from: e */
    private final String f59248e;

    /* renamed from: f */
    private final String f59249f;

    /* renamed from: g */
    private final BigDecimal f59250g;

    /* renamed from: h */
    private final String f59251h;

    /* renamed from: i */
    private final long f59252i;

    /* renamed from: j */
    private final Long f59253j;

    /* renamed from: k */
    private final long f59254k;

    /* renamed from: l */
    private final SavingGoal f59255l;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.model.SavingGoalDepositModel$a */
    public static final class C22366a implements Parcelable.Creator {
        /* renamed from: a */
        public final SavingGoalDepositModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString4 = parcel.readString();
            long readLong = parcel.readLong();
            SavingGoal savingGoal = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                savingGoal = SavingGoal.CREATOR.createFromParcel(parcel);
            }
            return new SavingGoalDepositModel(readString, readString2, readString3, bigDecimal, readString4, readLong, valueOf, readLong2, savingGoal);
        }

        /* renamed from: b */
        public final SavingGoalDepositModel[] newArray(int i) {
            return new SavingGoalDepositModel[i];
        }
    }

    public SavingGoalDepositModel(String str, String str2, String str3, BigDecimal bigDecimal, String str4, long j, Long l, long j2, SavingGoal savingGoal) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "name");
        C41536l.m120489i(bigDecimal, "startingAmount");
        this.f59247d = str;
        this.f59248e = str2;
        this.f59249f = str3;
        this.f59250g = bigDecimal;
        this.f59251h = str4;
        this.f59252i = j;
        this.f59253j = l;
        this.f59254k = j2;
        this.f59255l = savingGoal;
    }

    /* renamed from: a */
    public final long mo55301a() {
        return this.f59252i;
    }

    /* renamed from: b */
    public final long mo55302b() {
        return this.f59254k;
    }

    /* renamed from: d */
    public final String mo55303d() {
        return this.f59248e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo55305e() {
        return this.f59251h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingGoalDepositModel)) {
            return false;
        }
        SavingGoalDepositModel savingGoalDepositModel = (SavingGoalDepositModel) obj;
        return C41536l.m120484d(this.f59247d, savingGoalDepositModel.f59247d) && C41536l.m120484d(this.f59248e, savingGoalDepositModel.f59248e) && C41536l.m120484d(this.f59249f, savingGoalDepositModel.f59249f) && C41536l.m120484d(this.f59250g, savingGoalDepositModel.f59250g) && C41536l.m120484d(this.f59251h, savingGoalDepositModel.f59251h) && this.f59252i == savingGoalDepositModel.f59252i && C41536l.m120484d(this.f59253j, savingGoalDepositModel.f59253j) && this.f59254k == savingGoalDepositModel.f59254k && C41536l.m120484d(this.f59255l, savingGoalDepositModel.f59255l);
    }

    /* renamed from: f */
    public final String mo55307f() {
        return this.f59249f;
    }

    /* renamed from: g */
    public final String mo55308g() {
        return this.f59247d;
    }

    /* renamed from: h */
    public final Long mo55309h() {
        return this.f59253j;
    }

    public int hashCode() {
        int hashCode = ((((((this.f59247d.hashCode() * 31) + this.f59248e.hashCode()) * 31) + this.f59249f.hashCode()) * 31) + this.f59250g.hashCode()) * 31;
        String str = this.f59251h;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f59252i)) * 31;
        Long l = this.f59253j;
        int hashCode3 = (((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + C7397t.m28148a(this.f59254k)) * 31;
        SavingGoal savingGoal = this.f59255l;
        if (savingGoal != null) {
            i = savingGoal.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final SavingGoal mo55311i() {
        return this.f59255l;
    }

    /* renamed from: j */
    public final BigDecimal mo55312j() {
        return this.f59250g;
    }

    public String toString() {
        String str = this.f59247d;
        String str2 = this.f59248e;
        String str3 = this.f59249f;
        BigDecimal bigDecimal = this.f59250g;
        String str4 = this.f59251h;
        long j = this.f59252i;
        Long l = this.f59253j;
        long j2 = this.f59254k;
        SavingGoal savingGoal = this.f59255l;
        return "SavingGoalDepositModel(prodType=" + str + ", ccy=" + str2 + ", name=" + str3 + ", startingAmount=" + bigDecimal + ", endDate=" + str4 + ", accountId=" + j + ", purposeId=" + l + ", agreeKey=" + j2 + ", savingGoal=" + savingGoal + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59247d);
        parcel.writeString(this.f59248e);
        parcel.writeString(this.f59249f);
        parcel.writeSerializable(this.f59250g);
        parcel.writeString(this.f59251h);
        parcel.writeLong(this.f59252i);
        Long l = this.f59253j;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.f59254k);
        SavingGoal savingGoal = this.f59255l;
        if (savingGoal == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        savingGoal.writeToParcel(parcel, i);
    }
}
