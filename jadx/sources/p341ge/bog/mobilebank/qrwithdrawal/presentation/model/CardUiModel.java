package p341ge.bog.mobilebank.qrwithdrawal.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p669xh.C18763a;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel */
public final class CardUiModel implements Parcelable {
    public static final Parcelable.Creator<CardUiModel> CREATOR = new C34429a();

    /* renamed from: d */
    private final String f83430d;

    /* renamed from: e */
    private final String f83431e;

    /* renamed from: f */
    private final boolean f83432f;

    /* renamed from: g */
    private final String f83433g;

    /* renamed from: h */
    private final long f83434h;

    /* renamed from: i */
    private final String f83435i;

    /* renamed from: j */
    private final String f83436j;

    /* renamed from: k */
    private final C18763a f83437k;

    /* renamed from: l */
    private final CardExternalFileData f83438l;

    /* renamed from: m */
    private final CardExternalFileData f83439m;

    /* renamed from: n */
    private final List f83440n;

    /* renamed from: o */
    private final AvailableAmount f83441o;

    /* renamed from: p */
    private final boolean f83442p;

    /* renamed from: q */
    private final boolean f83443q;

    /* renamed from: r */
    private final boolean f83444r;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel$a */
    public static final class C34429a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            long readLong = parcel.readLong();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            C18763a valueOf = C18763a.valueOf(parcel.readString());
            Parcelable.Creator<CardExternalFileData> creator = CardExternalFileData.CREATOR;
            CardExternalFileData createFromParcel = creator.createFromParcel(parcel2);
            CardExternalFileData createFromParcel2 = creator.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AvailableAmount.CREATOR.createFromParcel(parcel2));
            }
            return new CardUiModel(readString, readString2, z, readString3, readLong, readString4, readString5, valueOf, createFromParcel, createFromParcel2, arrayList, AvailableAmount.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardUiModel[] newArray(int i) {
            return new CardUiModel[i];
        }
    }

    public CardUiModel(String str, String str2, boolean z, String str3, long j, String str4, String str5, C18763a aVar, CardExternalFileData cardExternalFileData, CardExternalFileData cardExternalFileData2, List list, AvailableAmount availableAmount, boolean z2, boolean z3, boolean z4) {
        String str6 = str4;
        String str7 = str5;
        C18763a aVar2 = aVar;
        CardExternalFileData cardExternalFileData3 = cardExternalFileData;
        CardExternalFileData cardExternalFileData4 = cardExternalFileData2;
        List list2 = list;
        AvailableAmount availableAmount2 = availableAmount;
        C41536l.m120489i(str, "cardId");
        C41536l.m120489i(str3, "expireDate");
        C41536l.m120489i(str6, "lastFour");
        C41536l.m120489i(str7, "acctNo");
        C41536l.m120489i(aVar2, "cardClassCode");
        C41536l.m120489i(cardExternalFileData3, "cardBackground");
        C41536l.m120489i(cardExternalFileData4, "cardIcon");
        C41536l.m120489i(list2, "availableAmounts");
        C41536l.m120489i(availableAmount2, "currentAmount");
        this.f83430d = str;
        this.f83431e = str2;
        this.f83432f = z;
        this.f83433g = str3;
        this.f83434h = j;
        this.f83435i = str6;
        this.f83436j = str7;
        this.f83437k = aVar2;
        this.f83438l = cardExternalFileData3;
        this.f83439m = cardExternalFileData4;
        this.f83440n = list2;
        this.f83441o = availableAmount2;
        this.f83442p = z2;
        this.f83443q = z3;
        this.f83444r = z4;
    }

    /* renamed from: b */
    public static /* synthetic */ CardUiModel m101236b(CardUiModel cardUiModel, String str, String str2, boolean z, String str3, long j, String str4, String str5, C18763a aVar, CardExternalFileData cardExternalFileData, CardExternalFileData cardExternalFileData2, List list, AvailableAmount availableAmount, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        CardUiModel cardUiModel2 = cardUiModel;
        int i2 = i;
        return cardUiModel.mo82982a((i2 & 1) != 0 ? cardUiModel2.f83430d : str, (i2 & 2) != 0 ? cardUiModel2.f83431e : str2, (i2 & 4) != 0 ? cardUiModel2.f83432f : z, (i2 & 8) != 0 ? cardUiModel2.f83433g : str3, (i2 & 16) != 0 ? cardUiModel2.f83434h : j, (i2 & 32) != 0 ? cardUiModel2.f83435i : str4, (i2 & 64) != 0 ? cardUiModel2.f83436j : str5, (i2 & 128) != 0 ? cardUiModel2.f83437k : aVar, (i2 & C11398b.f33139r) != 0 ? cardUiModel2.f83438l : cardExternalFileData, (i2 & C11398b.f33140s) != 0 ? cardUiModel2.f83439m : cardExternalFileData2, (i2 & C11398b.f33141t) != 0 ? cardUiModel2.f83440n : list, (i2 & C11398b.f33142u) != 0 ? cardUiModel2.f83441o : availableAmount, (i2 & C11398b.f33143v) != 0 ? cardUiModel2.f83442p : z2, (i2 & 8192) != 0 ? cardUiModel2.f83443q : z3, (i2 & 16384) != 0 ? cardUiModel2.f83444r : z4);
    }

    /* renamed from: a */
    public final CardUiModel mo82982a(String str, String str2, boolean z, String str3, long j, String str4, String str5, C18763a aVar, CardExternalFileData cardExternalFileData, CardExternalFileData cardExternalFileData2, List list, AvailableAmount availableAmount, boolean z2, boolean z3, boolean z4) {
        String str6 = str;
        C41536l.m120489i(str6, "cardId");
        C41536l.m120489i(str3, "expireDate");
        C41536l.m120489i(str4, "lastFour");
        C41536l.m120489i(str5, "acctNo");
        C41536l.m120489i(aVar, "cardClassCode");
        C41536l.m120489i(cardExternalFileData, "cardBackground");
        C41536l.m120489i(cardExternalFileData2, "cardIcon");
        C41536l.m120489i(list, "availableAmounts");
        C41536l.m120489i(availableAmount, "currentAmount");
        return new CardUiModel(str6, str2, z, str3, j, str4, str5, aVar, cardExternalFileData, cardExternalFileData2, list, availableAmount, z2, z3, z4);
    }

    /* renamed from: d */
    public final List mo82983d() {
        return this.f83440n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final CardExternalFileData mo82985e() {
        return this.f83438l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUiModel)) {
            return false;
        }
        CardUiModel cardUiModel = (CardUiModel) obj;
        return C41536l.m120484d(this.f83430d, cardUiModel.f83430d) && C41536l.m120484d(this.f83431e, cardUiModel.f83431e) && this.f83432f == cardUiModel.f83432f && C41536l.m120484d(this.f83433g, cardUiModel.f83433g) && this.f83434h == cardUiModel.f83434h && C41536l.m120484d(this.f83435i, cardUiModel.f83435i) && C41536l.m120484d(this.f83436j, cardUiModel.f83436j) && this.f83437k == cardUiModel.f83437k && C41536l.m120484d(this.f83438l, cardUiModel.f83438l) && C41536l.m120484d(this.f83439m, cardUiModel.f83439m) && C41536l.m120484d(this.f83440n, cardUiModel.f83440n) && C41536l.m120484d(this.f83441o, cardUiModel.f83441o) && this.f83442p == cardUiModel.f83442p && this.f83443q == cardUiModel.f83443q && this.f83444r == cardUiModel.f83444r;
    }

    /* renamed from: f */
    public final C18763a mo82987f() {
        return this.f83437k;
    }

    /* renamed from: g */
    public final CardExternalFileData mo82988g() {
        return this.f83439m;
    }

    /* renamed from: h */
    public final String mo82989h() {
        return this.f83430d;
    }

    public int hashCode() {
        int hashCode = this.f83430d.hashCode() * 31;
        String str = this.f83431e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f83432f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode3 = (((((((((((((((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f83433g.hashCode()) * 31) + C7397t.m28148a(this.f83434h)) * 31) + this.f83435i.hashCode()) * 31) + this.f83436j.hashCode()) * 31) + this.f83437k.hashCode()) * 31) + this.f83438l.hashCode()) * 31) + this.f83439m.hashCode()) * 31) + this.f83440n.hashCode()) * 31) + this.f83441o.hashCode()) * 31;
        boolean z3 = this.f83442p;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f83443q;
        if (z4) {
            z4 = true;
        }
        int i2 = (i + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f83444r;
        if (!z5) {
            z2 = z5;
        }
        return i2 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final AvailableAmount mo82991i() {
        return this.f83441o;
    }

    /* renamed from: j */
    public final String mo82992j() {
        return this.f83433g;
    }

    /* renamed from: k */
    public final String mo82993k() {
        return this.f83435i;
    }

    /* renamed from: l */
    public final String mo82994l() {
        return this.f83431e;
    }

    /* renamed from: m */
    public final boolean mo82995m() {
        return this.f83444r;
    }

    /* renamed from: p */
    public final boolean mo82996p() {
        return this.f83432f;
    }

    /* renamed from: q */
    public final boolean mo82997q() {
        return this.f83442p;
    }

    /* renamed from: r */
    public final boolean mo82998r() {
        return this.f83443q;
    }

    public String toString() {
        String str = this.f83430d;
        String str2 = this.f83431e;
        boolean z = this.f83432f;
        String str3 = this.f83433g;
        long j = this.f83434h;
        String str4 = this.f83435i;
        String str5 = this.f83436j;
        C18763a aVar = this.f83437k;
        CardExternalFileData cardExternalFileData = this.f83438l;
        CardExternalFileData cardExternalFileData2 = this.f83439m;
        List list = this.f83440n;
        AvailableAmount availableAmount = this.f83441o;
        boolean z2 = this.f83442p;
        boolean z3 = this.f83443q;
        boolean z4 = this.f83444r;
        return "CardUiModel(cardId=" + str + ", name=" + str2 + ", isDebitCard=" + z + ", expireDate=" + str3 + ", acctKey=" + j + ", lastFour=" + str4 + ", acctNo=" + str5 + ", cardClassCode=" + aVar + ", cardBackground=" + cardExternalFileData + ", cardIcon=" + cardExternalFileData2 + ", availableAmounts=" + list + ", currentAmount=" + availableAmount + ", isDefault=" + z2 + ", isSelected=" + z3 + ", isBlocked=" + z4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83430d);
        parcel.writeString(this.f83431e);
        parcel.writeInt(this.f83432f ? 1 : 0);
        parcel.writeString(this.f83433g);
        parcel.writeLong(this.f83434h);
        parcel.writeString(this.f83435i);
        parcel.writeString(this.f83436j);
        parcel.writeString(this.f83437k.name());
        this.f83438l.writeToParcel(parcel, i);
        this.f83439m.writeToParcel(parcel, i);
        List<AvailableAmount> list = this.f83440n;
        parcel.writeInt(list.size());
        for (AvailableAmount writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        this.f83441o.writeToParcel(parcel, i);
        parcel.writeInt(this.f83442p ? 1 : 0);
        parcel.writeInt(this.f83443q ? 1 : 0);
        parcel.writeInt(this.f83444r ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardUiModel(java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, long r25, java.lang.String r27, java.lang.String r28, p669xh.C18763a r29, p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData r30, p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData r31, java.util.List r32, p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r33, boolean r34, boolean r35, boolean r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r18 = r2
            goto L_0x000c
        L_0x000a:
            r18 = r35
        L_0x000c:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0013
            r19 = r2
            goto L_0x0015
        L_0x0013:
            r19 = r36
        L_0x0015:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            r17 = r34
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, long, java.lang.String, java.lang.String, xh.a, ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData, ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData, java.util.List, ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
