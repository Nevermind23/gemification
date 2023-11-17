package p341ge.bog.mobilebank.shared.chooser.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig */
public final class ChooserConfig<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ChooserConfig<?>> CREATOR = new C34635a();

    /* renamed from: d */
    private final String f83704d;

    /* renamed from: e */
    private final boolean f83705e;

    /* renamed from: f */
    private final String f83706f;

    /* renamed from: g */
    private final int f83707g;

    /* renamed from: h */
    private final boolean f83708h;

    /* renamed from: i */
    private final boolean f83709i;

    /* renamed from: j */
    private final int f83710j;

    /* renamed from: k */
    private final Integer f83711k;

    /* renamed from: l */
    private final String f83712l;

    /* renamed from: m */
    private final String f83713m;

    /* renamed from: n */
    private final C43075l f83714n;

    /* renamed from: o */
    private final List f83715o;

    /* renamed from: p */
    private final boolean f83716p;

    /* renamed from: ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig$a */
    public static final class C34635a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChooserConfig createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            C43075l lVar = (C43075l) parcel.readSerializable();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i != readInt3; i++) {
                arrayList.add(ChooserItem.CREATOR.createFromParcel(parcel2));
            }
            return new ChooserConfig(readString, z, readString2, readInt, z2, z3, readInt2, valueOf, readString3, readString4, lVar, arrayList);
        }

        /* renamed from: b */
        public final ChooserConfig[] newArray(int i) {
            return new ChooserConfig[i];
        }
    }

    public ChooserConfig() {
        this((String) null, false, (String) null, 0, false, false, 0, (Integer) null, (String) null, (String) null, (C43075l) null, (List) null, C11051p3.f31758b, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo84259a() {
        return this.f83712l;
    }

    /* renamed from: b */
    public final List mo84260b() {
        return this.f83715o;
    }

    /* renamed from: d */
    public final boolean mo84261d() {
        return this.f83716p;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo84263e() {
        return this.f83706f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooserConfig)) {
            return false;
        }
        ChooserConfig chooserConfig = (ChooserConfig) obj;
        return C41536l.m120484d(this.f83704d, chooserConfig.f83704d) && this.f83705e == chooserConfig.f83705e && C41536l.m120484d(this.f83706f, chooserConfig.f83706f) && this.f83707g == chooserConfig.f83707g && this.f83708h == chooserConfig.f83708h && this.f83709i == chooserConfig.f83709i && this.f83710j == chooserConfig.f83710j && C41536l.m120484d(this.f83711k, chooserConfig.f83711k) && C41536l.m120484d(this.f83712l, chooserConfig.f83712l) && C41536l.m120484d(this.f83713m, chooserConfig.f83713m) && C41536l.m120484d(this.f83714n, chooserConfig.f83714n) && C41536l.m120484d(this.f83715o, chooserConfig.f83715o);
    }

    /* renamed from: f */
    public final int mo84265f() {
        return this.f83707g;
    }

    /* renamed from: g */
    public final Integer mo84266g() {
        return this.f83711k;
    }

    /* renamed from: h */
    public final int mo84267h() {
        return this.f83710j;
    }

    public int hashCode() {
        String str = this.f83704d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f83705e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f83706f;
        int hashCode2 = (((i2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f83707g) * 31;
        boolean z3 = this.f83708h;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f83709i;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (((i3 + (z2 ? 1 : 0)) * 31) + this.f83710j) * 31;
        Integer num = this.f83711k;
        int hashCode3 = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f83712l;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f83713m.hashCode()) * 31;
        C43075l lVar = this.f83714n;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.f83715o.hashCode();
    }

    /* renamed from: i */
    public final String mo84269i() {
        return this.f83713m;
    }

    /* renamed from: j */
    public final String mo84270j() {
        return this.f83704d;
    }

    /* renamed from: k */
    public final C43075l mo84271k() {
        return this.f83714n;
    }

    /* renamed from: l */
    public final boolean mo84272l() {
        return this.f83705e;
    }

    public String toString() {
        String str = this.f83704d;
        boolean z = this.f83705e;
        String str2 = this.f83706f;
        int i = this.f83707g;
        boolean z2 = this.f83708h;
        boolean z3 = this.f83709i;
        int i2 = this.f83710j;
        Integer num = this.f83711k;
        String str3 = this.f83712l;
        String str4 = this.f83713m;
        C43075l lVar = this.f83714n;
        List list = this.f83715o;
        return "ChooserConfig(title=" + str + ", withSearch=" + z + ", hintText=" + str2 + ", listMinHeight=" + i + ", multipleChoice=" + z2 + ", withConfirmButton=" + z3 + ", minChoice=" + i2 + ", maxChoice=" + num + ", confirmButtonText=" + str3 + ", requestKey=" + str4 + ", viewCreator=" + lVar + ", data=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83704d);
        parcel.writeInt(this.f83705e ? 1 : 0);
        parcel.writeString(this.f83706f);
        parcel.writeInt(this.f83707g);
        parcel.writeInt(this.f83708h ? 1 : 0);
        parcel.writeInt(this.f83709i ? 1 : 0);
        parcel.writeInt(this.f83710j);
        Integer num = this.f83711k;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f83712l);
        parcel.writeString(this.f83713m);
        parcel.writeSerializable((Serializable) this.f83714n);
        List<ChooserItem> list = this.f83715o;
        parcel.writeInt(list.size());
        for (ChooserItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public ChooserConfig(String str, boolean z, String str2, int i, boolean z2, boolean z3, int i2, Integer num, String str3, String str4, C43075l lVar, List list) {
        C41536l.m120489i(str4, "requestKey");
        C41536l.m120489i(list, "data");
        this.f83704d = str;
        this.f83705e = z;
        this.f83706f = str2;
        this.f83707g = i;
        this.f83708h = z2;
        this.f83709i = z3;
        this.f83710j = i2;
        this.f83711k = num;
        this.f83712l = str3;
        this.f83713m = str4;
        this.f83714n = lVar;
        this.f83715o = list;
        this.f83716p = z3 || z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChooserConfig(java.lang.String r14, boolean r15, java.lang.String r16, int r17, boolean r18, boolean r19, int r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, ue1.C43075l r24, java.util.List r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = r4
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0018
            r5 = r2
            goto L_0x001a
        L_0x0018:
            r5 = r16
        L_0x001a:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0020
            r6 = r4
            goto L_0x0022
        L_0x0020:
            r6 = r17
        L_0x0022:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0028
            r7 = r4
            goto L_0x002a
        L_0x0028:
            r7 = r18
        L_0x002a:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r4 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = 1
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            java.lang.String r11 = "SELECTOR_REQUEST_KEY"
            goto L_0x0052
        L_0x0050:
            r11 = r23
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0062
            java.util.List r0 = ie1.C41341q.m119907j()
            goto L_0x0064
        L_0x0062:
            r0 = r25
        L_0x0064:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r4
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r2
            r26 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig.<init>(java.lang.String, boolean, java.lang.String, int, boolean, boolean, int, java.lang.Integer, java.lang.String, java.lang.String, ue1.l, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
