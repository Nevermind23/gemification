package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult */
public final class OrderCardResult implements Parcelable {
    public static final Parcelable.Creator<OrderCardResult> CREATOR = new C14226a();

    /* renamed from: d */
    private final List f41736d;

    /* renamed from: e */
    private final List f41737e;

    /* renamed from: f */
    private final boolean f41738f;

    /* renamed from: g */
    private final long f41739g;

    /* renamed from: h */
    private final boolean f41740h;

    /* renamed from: i */
    private final FeedbackItem f41741i;

    /* renamed from: j */
    private final FeedbackItem f41742j;

    /* renamed from: k */
    private final Long f41743k;

    /* renamed from: l */
    private final StringSource f41744l;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult$a */
    public static final class C14226a implements Parcelable.Creator {
        /* renamed from: a */
        public final OrderCardResult createFromParcel(Parcel parcel) {
            Class<OrderCardResult> cls;
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                cls = OrderCardResult.class;
                if (i == readInt) {
                    break;
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i++;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
            }
            return new OrderCardResult(arrayList, arrayList2, parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FeedbackItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FeedbackItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (StringSource) parcel.readParcelable(cls.getClassLoader()));
        }

        /* renamed from: b */
        public final OrderCardResult[] newArray(int i) {
            return new OrderCardResult[i];
        }
    }

    public OrderCardResult(List list, List list2, boolean z, long j, boolean z2, FeedbackItem feedbackItem, FeedbackItem feedbackItem2, Long l, StringSource stringSource) {
        C41536l.m120489i(list, "cardDetails");
        C41536l.m120489i(list2, "deliveryDetails");
        this.f41736d = list;
        this.f41737e = list2;
        this.f41738f = z;
        this.f41739g = j;
        this.f41740h = z2;
        this.f41741i = feedbackItem;
        this.f41742j = feedbackItem2;
        this.f41743k = l;
        this.f41744l = stringSource;
    }

    /* renamed from: a */
    public final List mo39751a() {
        return this.f41736d;
    }

    /* renamed from: b */
    public final FeedbackItem mo39752b() {
        return this.f41741i;
    }

    /* renamed from: d */
    public final long mo39753d() {
        return this.f41739g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo39755e() {
        return this.f41737e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCardResult)) {
            return false;
        }
        OrderCardResult orderCardResult = (OrderCardResult) obj;
        return C41536l.m120484d(this.f41736d, orderCardResult.f41736d) && C41536l.m120484d(this.f41737e, orderCardResult.f41737e) && this.f41738f == orderCardResult.f41738f && this.f41739g == orderCardResult.f41739g && this.f41740h == orderCardResult.f41740h && C41536l.m120484d(this.f41741i, orderCardResult.f41741i) && C41536l.m120484d(this.f41742j, orderCardResult.f41742j) && C41536l.m120484d(this.f41743k, orderCardResult.f41743k) && C41536l.m120484d(this.f41744l, orderCardResult.f41744l);
    }

    /* renamed from: f */
    public final FeedbackItem mo39757f() {
        return this.f41742j;
    }

    /* renamed from: g */
    public final Long mo39758g() {
        return this.f41743k;
    }

    /* renamed from: h */
    public final StringSource mo39759h() {
        return this.f41744l;
    }

    public int hashCode() {
        int hashCode = ((this.f41736d.hashCode() * 31) + this.f41737e.hashCode()) * 31;
        boolean z = this.f41738f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a = (((hashCode + (z ? 1 : 0)) * 31) + C7397t.m28148a(this.f41739g)) * 31;
        boolean z3 = this.f41740h;
        if (!z3) {
            z2 = z3;
        }
        int i = (a + (z2 ? 1 : 0)) * 31;
        FeedbackItem feedbackItem = this.f41741i;
        int i2 = 0;
        int hashCode2 = (i + (feedbackItem == null ? 0 : feedbackItem.hashCode())) * 31;
        FeedbackItem feedbackItem2 = this.f41742j;
        int hashCode3 = (hashCode2 + (feedbackItem2 == null ? 0 : feedbackItem2.hashCode())) * 31;
        Long l = this.f41743k;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        StringSource stringSource = this.f41744l;
        if (stringSource != null) {
            i2 = stringSource.hashCode();
        }
        return hashCode4 + i2;
    }

    /* renamed from: i */
    public final boolean mo39761i() {
        return this.f41740h;
    }

    /* renamed from: j */
    public final boolean mo39762j() {
        return this.f41738f;
    }

    public String toString() {
        List list = this.f41736d;
        List list2 = this.f41737e;
        boolean z = this.f41738f;
        long j = this.f41739g;
        boolean z2 = this.f41740h;
        FeedbackItem feedbackItem = this.f41741i;
        FeedbackItem feedbackItem2 = this.f41742j;
        Long l = this.f41743k;
        StringSource stringSource = this.f41744l;
        return "OrderCardResult(cardDetails=" + list + ", deliveryDetails=" + list2 + ", isDigital=" + z + ", cardId=" + j + ", isDelivery=" + z2 + ", cardFeedback=" + feedbackItem + ", deliveryFeedback=" + feedbackItem2 + ", juniorRequestId=" + l + ", successText=" + stringSource + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Parcelable> list = this.f41736d;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<Parcelable> list2 = this.f41737e;
        parcel.writeInt(list2.size());
        for (Parcelable writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        parcel.writeInt(this.f41738f ? 1 : 0);
        parcel.writeLong(this.f41739g);
        parcel.writeInt(this.f41740h ? 1 : 0);
        FeedbackItem feedbackItem = this.f41741i;
        if (feedbackItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackItem.writeToParcel(parcel, i);
        }
        FeedbackItem feedbackItem2 = this.f41742j;
        if (feedbackItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackItem2.writeToParcel(parcel, i);
        }
        Long l = this.f41743k;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.f41744l, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderCardResult(java.util.List r15, java.util.List r16, boolean r17, long r18, boolean r20, p341ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem r21, p341ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem r22, java.lang.Long r23, p341ge.bog.mobilebank.shared.helper.StringSource r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r21
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r22
        L_0x0013:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r24
        L_0x001b:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult.<init>(java.util.List, java.util.List, boolean, long, boolean, ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem, ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem, java.lang.Long, ge.bog.mobilebank.shared.helper.StringSource, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
