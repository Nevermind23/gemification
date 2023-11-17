package p341ge.bog.designsystem.components.cardobjective;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;

/* renamed from: ge.bog.designsystem.components.cardobjective.CardObjectiveData */
public final class CardObjectiveData implements Parcelable {
    public static final Parcelable.Creator<CardObjectiveData> CREATOR = new C13213a();

    /* renamed from: d */
    private final TimerViewData f38978d;

    /* renamed from: e */
    private final String f38979e;

    /* renamed from: f */
    private final Image f38980f;

    /* renamed from: g */
    private final Integer f38981g;

    /* renamed from: h */
    private final TextProgressBarView.ProgressModel f38982h;

    /* renamed from: i */
    private final String f38983i;

    /* renamed from: j */
    private final List f38984j;

    /* renamed from: k */
    private final String f38985k;

    /* renamed from: l */
    private final String f38986l;

    /* renamed from: m */
    private final int f38987m;

    /* renamed from: ge.bog.designsystem.components.cardobjective.CardObjectiveData$a */
    public static final class C13213a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardObjectiveData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            ArrayList arrayList = null;
            TimerViewData createFromParcel = parcel.readInt() == 0 ? null : TimerViewData.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Class<CardObjectiveData> cls = CardObjectiveData.class;
            Image image = (Image) parcel.readParcelable(cls.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            TextProgressBarView.ProgressModel progressModel = (TextProgressBarView.ProgressModel) parcel.readParcelable(cls.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(InfoBadgeData.CREATOR.createFromParcel(parcel));
                }
            }
            return new CardObjectiveData(createFromParcel, readString, image, valueOf, progressModel, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final CardObjectiveData[] newArray(int i) {
            return new CardObjectiveData[i];
        }
    }

    public CardObjectiveData(TimerViewData timerViewData, String str, Image image, Integer num, TextProgressBarView.ProgressModel progressModel, String str2, List list, String str3, String str4, int i) {
        C41536l.m120489i(progressModel, "progress");
        this.f38978d = timerViewData;
        this.f38979e = str;
        this.f38980f = image;
        this.f38981g = num;
        this.f38982h = progressModel;
        this.f38983i = str2;
        this.f38984j = list;
        this.f38985k = str3;
        this.f38986l = str4;
        this.f38987m = i;
    }

    /* renamed from: a */
    public final String mo35065a() {
        return this.f38985k;
    }

    /* renamed from: b */
    public final String mo35066b() {
        return this.f38979e;
    }

    /* renamed from: d */
    public final int mo35067d() {
        return this.f38987m;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Image mo35069e() {
        return this.f38980f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardObjectiveData)) {
            return false;
        }
        CardObjectiveData cardObjectiveData = (CardObjectiveData) obj;
        return C41536l.m120484d(this.f38978d, cardObjectiveData.f38978d) && C41536l.m120484d(this.f38979e, cardObjectiveData.f38979e) && C41536l.m120484d(this.f38980f, cardObjectiveData.f38980f) && C41536l.m120484d(this.f38981g, cardObjectiveData.f38981g) && C41536l.m120484d(this.f38982h, cardObjectiveData.f38982h) && C41536l.m120484d(this.f38983i, cardObjectiveData.f38983i) && C41536l.m120484d(this.f38984j, cardObjectiveData.f38984j) && C41536l.m120484d(this.f38985k, cardObjectiveData.f38985k) && C41536l.m120484d(this.f38986l, cardObjectiveData.f38986l) && this.f38987m == cardObjectiveData.f38987m;
    }

    /* renamed from: f */
    public final Integer mo35071f() {
        return this.f38981g;
    }

    /* renamed from: g */
    public final List mo35072g() {
        return this.f38984j;
    }

    /* renamed from: h */
    public final String mo35073h() {
        return this.f38983i;
    }

    public int hashCode() {
        TimerViewData timerViewData = this.f38978d;
        int i = 0;
        int hashCode = (timerViewData == null ? 0 : timerViewData.hashCode()) * 31;
        String str = this.f38979e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f38980f;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.f38981g;
        int hashCode4 = (((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.f38982h.hashCode()) * 31;
        String str2 = this.f38983i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f38984j;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f38985k;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f38986l;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode7 + i) * 31) + this.f38987m;
    }

    /* renamed from: i */
    public final TextProgressBarView.ProgressModel mo35075i() {
        return this.f38982h;
    }

    /* renamed from: j */
    public final TimerViewData mo35076j() {
        return this.f38978d;
    }

    /* renamed from: k */
    public final String mo35077k() {
        return this.f38986l;
    }

    public String toString() {
        TimerViewData timerViewData = this.f38978d;
        String str = this.f38979e;
        Image image = this.f38980f;
        Integer num = this.f38981g;
        TextProgressBarView.ProgressModel progressModel = this.f38982h;
        String str2 = this.f38983i;
        List list = this.f38984j;
        String str3 = this.f38985k;
        String str4 = this.f38986l;
        int i = this.f38987m;
        return "CardObjectiveData(timer=" + timerViewData + ", descriptionText=" + str + ", image=" + image + ", imageTint=" + num + ", progress=" + progressModel + ", infoTitle=" + str2 + ", infoList=" + list + ", amount=" + str3 + ", type=" + str4 + ", iconTextColor=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        TimerViewData timerViewData = this.f38978d;
        if (timerViewData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timerViewData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f38979e);
        parcel.writeParcelable(this.f38980f, i);
        Integer num = this.f38981g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.f38982h, i);
        parcel.writeString(this.f38983i);
        List<InfoBadgeData> list = this.f38984j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (InfoBadgeData writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f38985k);
        parcel.writeString(this.f38986l);
        parcel.writeInt(this.f38987m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardObjectiveData(p341ge.bog.designsystem.components.cardobjective.TimerViewData r15, java.lang.String r16, p341ge.bog.designsystem.components.common.Image r17, java.lang.Integer r18, p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel r19, java.lang.String r20, java.util.List r21, java.lang.String r22, java.lang.String r23, int r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r16
        L_0x0012:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            r6 = r2
            goto L_0x001a
        L_0x0018:
            r6 = r17
        L_0x001a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0020
            r7 = r2
            goto L_0x0022
        L_0x0020:
            r7 = r18
        L_0x0022:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0028
            r9 = r2
            goto L_0x002a
        L_0x0028:
            r9 = r20
        L_0x002a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0030
            r10 = r2
            goto L_0x0032
        L_0x0030:
            r10 = r21
        L_0x0032:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0038
            r11 = r2
            goto L_0x003a
        L_0x0038:
            r11 = r22
        L_0x003a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0040
            r12 = r2
            goto L_0x0042
        L_0x0040:
            r12 = r23
        L_0x0042:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004a
            int r0 = p601sg.C17778c.f49637v
            r13 = r0
            goto L_0x004c
        L_0x004a:
            r13 = r24
        L_0x004c:
            r3 = r14
            r8 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.cardobjective.CardObjectiveData.<init>(ge.bog.designsystem.components.cardobjective.TimerViewData, java.lang.String, ge.bog.designsystem.components.common.Image, java.lang.Integer, ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
