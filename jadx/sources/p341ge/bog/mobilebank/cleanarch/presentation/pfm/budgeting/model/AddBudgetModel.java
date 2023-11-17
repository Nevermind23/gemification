package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel */
public final class AddBudgetModel implements Parcelable {
    public static final Parcelable.Creator<AddBudgetModel> CREATOR = new C22111a();

    /* renamed from: d */
    private final long f58782d;

    /* renamed from: e */
    private final List f58783e;

    /* renamed from: f */
    private final long f58784f;

    /* renamed from: g */
    private final String f58785g;

    /* renamed from: h */
    private boolean f58786h;

    /* renamed from: i */
    private final int f58787i;

    /* renamed from: j */
    private BigDecimal f58788j;

    /* renamed from: k */
    private boolean f58789k;

    /* renamed from: l */
    private String f58790l;

    /* renamed from: m */
    private Integer f58791m;

    /* renamed from: n */
    private boolean f58792n;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel$a */
    public static final class C22111a implements Parcelable.Creator {
        /* renamed from: a */
        public final AddBudgetModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AddBudgetModel.CREATOR.createFromParcel(parcel2));
            }
            return new AddBudgetModel(readLong, arrayList, parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final AddBudgetModel[] newArray(int i) {
            return new AddBudgetModel[i];
        }
    }

    public AddBudgetModel(long j, List list, long j2, String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, String str2, Integer num, boolean z3) {
        C41536l.m120489i(list, "addBudgetModels");
        C41536l.m120489i(str, "displayName");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f58782d = j;
        this.f58783e = list;
        this.f58784f = j2;
        this.f58785g = str;
        this.f58786h = z;
        this.f58787i = i;
        this.f58788j = bigDecimal;
        this.f58789k = z2;
        this.f58790l = str2;
        this.f58791m = num;
        this.f58792n = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ AddBudgetModel m71621b(AddBudgetModel addBudgetModel, long j, List list, long j2, String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, String str2, Integer num, boolean z3, int i2, Object obj) {
        AddBudgetModel addBudgetModel2 = addBudgetModel;
        int i3 = i2;
        return addBudgetModel.mo54884a((i3 & 1) != 0 ? addBudgetModel2.f58782d : j, (i3 & 2) != 0 ? addBudgetModel2.f58783e : list, (i3 & 4) != 0 ? addBudgetModel2.f58784f : j2, (i3 & 8) != 0 ? addBudgetModel2.f58785g : str, (i3 & 16) != 0 ? addBudgetModel2.f58786h : z, (i3 & 32) != 0 ? addBudgetModel2.f58787i : i, (i3 & 64) != 0 ? addBudgetModel2.f58788j : bigDecimal, (i3 & 128) != 0 ? addBudgetModel2.f58789k : z2, (i3 & C11398b.f33139r) != 0 ? addBudgetModel2.f58790l : str2, (i3 & C11398b.f33140s) != 0 ? addBudgetModel2.f58791m : num, (i3 & C11398b.f33141t) != 0 ? addBudgetModel2.f58792n : z3);
    }

    /* renamed from: a */
    public final AddBudgetModel mo54884a(long j, List list, long j2, String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, String str2, Integer num, boolean z3) {
        List list2 = list;
        C41536l.m120489i(list2, "addBudgetModels");
        String str3 = str;
        C41536l.m120489i(str3, "displayName");
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120489i(bigDecimal2, C11755a.C11756a.f34100b);
        return new AddBudgetModel(j, list2, j2, str3, z, i, bigDecimal2, z2, str2, num, z3);
    }

    /* renamed from: d */
    public final List mo54885d() {
        return this.f58783e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo54887e() {
        return this.f58784f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddBudgetModel)) {
            return false;
        }
        AddBudgetModel addBudgetModel = (AddBudgetModel) obj;
        return this.f58782d == addBudgetModel.f58782d && C41536l.m120484d(this.f58783e, addBudgetModel.f58783e) && this.f58784f == addBudgetModel.f58784f && C41536l.m120484d(this.f58785g, addBudgetModel.f58785g) && this.f58786h == addBudgetModel.f58786h && this.f58787i == addBudgetModel.f58787i && C41536l.m120484d(this.f58788j, addBudgetModel.f58788j) && this.f58789k == addBudgetModel.f58789k && C41536l.m120484d(this.f58790l, addBudgetModel.f58790l) && C41536l.m120484d(this.f58791m, addBudgetModel.f58791m) && this.f58792n == addBudgetModel.f58792n;
    }

    /* renamed from: f */
    public final int mo54889f() {
        return this.f58787i;
    }

    /* renamed from: g */
    public final String mo54890g() {
        return this.f58785g;
    }

    /* renamed from: h */
    public final String mo54891h() {
        return this.f58790l;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f58782d) * 31) + this.f58783e.hashCode()) * 31) + C7397t.m28148a(this.f58784f)) * 31) + this.f58785g.hashCode()) * 31;
        boolean z = this.f58786h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((a + (z ? 1 : 0)) * 31) + this.f58787i) * 31) + this.f58788j.hashCode()) * 31;
        boolean z3 = this.f58789k;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode + (z3 ? 1 : 0)) * 31;
        String str = this.f58790l;
        int i2 = 0;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f58791m;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z4 = this.f58792n;
        if (!z4) {
            z2 = z4;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final long mo54893i() {
        return this.f58782d;
    }

    /* renamed from: j */
    public final Integer mo54894j() {
        return this.f58791m;
    }

    /* renamed from: k */
    public final BigDecimal mo54895k() {
        return this.f58788j;
    }

    /* renamed from: l */
    public final boolean mo54896l() {
        return this.f58786h;
    }

    /* renamed from: m */
    public final boolean mo54897m() {
        return this.f58789k;
    }

    /* renamed from: p */
    public final boolean mo54898p() {
        return this.f58792n;
    }

    /* renamed from: q */
    public final void mo54899q(boolean z) {
        this.f58789k = z;
    }

    /* renamed from: r */
    public final void mo54900r(boolean z) {
        this.f58792n = z;
    }

    /* renamed from: s */
    public final void mo54901s(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "<set-?>");
        this.f58788j = bigDecimal;
    }

    public String toString() {
        long j = this.f58782d;
        List list = this.f58783e;
        long j2 = this.f58784f;
        String str = this.f58785g;
        boolean z = this.f58786h;
        int i = this.f58787i;
        BigDecimal bigDecimal = this.f58788j;
        boolean z2 = this.f58789k;
        String str2 = this.f58790l;
        Integer num = this.f58791m;
        boolean z3 = this.f58792n;
        return "AddBudgetModel(id=" + j + ", addBudgetModels=" + list + ", catId=" + j2 + ", displayName=" + str + ", isAlreadyCreated=" + z + ", color=" + i + ", value=" + bigDecimal + ", isCurrentlySelected=" + z2 + ", errorText=" + str2 + ", orderNo=" + num + ", isSelected=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f58782d);
        List<AddBudgetModel> list = this.f58783e;
        parcel.writeInt(list.size());
        for (AddBudgetModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f58784f);
        parcel.writeString(this.f58785g);
        parcel.writeInt(this.f58786h ? 1 : 0);
        parcel.writeInt(this.f58787i);
        parcel.writeSerializable(this.f58788j);
        parcel.writeInt(this.f58789k ? 1 : 0);
        parcel.writeString(this.f58790l);
        Integer num = this.f58791m;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f58792n ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddBudgetModel(long r18, java.util.List r20, long r21, java.lang.String r23, boolean r24, int r25, java.math.BigDecimal r26, boolean r27, java.lang.String r28, java.lang.Integer r29, boolean r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r27
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0012
            r1 = 0
            r14 = r1
            goto L_0x0014
        L_0x0012:
            r14 = r28
        L_0x0014:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001b
            r16 = r2
            goto L_0x001d
        L_0x001b:
            r16 = r30
        L_0x001d:
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r15 = r29
            r3.<init>(r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel.<init>(long, java.util.List, long, java.lang.String, boolean, int, java.math.BigDecimal, boolean, java.lang.String, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
