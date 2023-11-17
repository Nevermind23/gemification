package p341ge.bog.designsystem.components.toastnotification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationArguments */
public final class ToastNotificationArguments implements Parcelable {
    public static final Parcelable.Creator<ToastNotificationArguments> CREATOR = new C13559a();

    /* renamed from: d */
    private final String f40520d;

    /* renamed from: e */
    private final String f40521e;

    /* renamed from: f */
    private final String f40522f;

    /* renamed from: g */
    private final boolean f40523g;

    /* renamed from: h */
    private final boolean f40524h;

    /* renamed from: i */
    private final ToastNotificationAppearance f40525i;

    /* renamed from: j */
    private final Long f40526j;

    /* renamed from: k */
    private final Integer f40527k;

    /* renamed from: l */
    private final Integer f40528l;

    /* renamed from: m */
    private final Integer f40529m;

    /* renamed from: ge.bog.designsystem.components.toastnotification.ToastNotificationArguments$a */
    public static final class C13559a implements Parcelable.Creator {
        /* renamed from: a */
        public final ToastNotificationArguments createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ToastNotificationArguments(readString, readString2, readString3, z2, z, (ToastNotificationAppearance) parcel.readParcelable(ToastNotificationArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final ToastNotificationArguments[] newArray(int i) {
            return new ToastNotificationArguments[i];
        }
    }

    public ToastNotificationArguments(String str, String str2, String str3, boolean z, boolean z2, ToastNotificationAppearance toastNotificationAppearance, Long l, Integer num, Integer num2, Integer num3) {
        C41536l.m120489i(str2, "descriptionText");
        C41536l.m120489i(toastNotificationAppearance, "appearance");
        this.f40520d = str;
        this.f40521e = str2;
        this.f40522f = str3;
        this.f40523g = z;
        this.f40524h = z2;
        this.f40525i = toastNotificationAppearance;
        this.f40526j = l;
        this.f40527k = num;
        this.f40528l = num2;
        this.f40529m = num3;
    }

    /* renamed from: a */
    public final ToastNotificationAppearance mo37058a() {
        return this.f40525i;
    }

    /* renamed from: b */
    public final String mo37059b() {
        return this.f40522f;
    }

    /* renamed from: d */
    public final boolean mo37060d() {
        return this.f40524h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo37062e() {
        return this.f40523g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastNotificationArguments)) {
            return false;
        }
        ToastNotificationArguments toastNotificationArguments = (ToastNotificationArguments) obj;
        return C41536l.m120484d(this.f40520d, toastNotificationArguments.f40520d) && C41536l.m120484d(this.f40521e, toastNotificationArguments.f40521e) && C41536l.m120484d(this.f40522f, toastNotificationArguments.f40522f) && this.f40523g == toastNotificationArguments.f40523g && this.f40524h == toastNotificationArguments.f40524h && C41536l.m120484d(this.f40525i, toastNotificationArguments.f40525i) && C41536l.m120484d(this.f40526j, toastNotificationArguments.f40526j) && C41536l.m120484d(this.f40527k, toastNotificationArguments.f40527k) && C41536l.m120484d(this.f40528l, toastNotificationArguments.f40528l) && C41536l.m120484d(this.f40529m, toastNotificationArguments.f40529m);
    }

    /* renamed from: f */
    public final Long mo37064f() {
        return this.f40526j;
    }

    /* renamed from: g */
    public final String mo37065g() {
        return this.f40521e;
    }

    /* renamed from: h */
    public final Integer mo37066h() {
        return this.f40527k;
    }

    public int hashCode() {
        String str = this.f40520d;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f40521e.hashCode()) * 31;
        String str2 = this.f40522f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f40523g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f40524h;
        if (!z3) {
            z2 = z3;
        }
        int hashCode3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.f40525i.hashCode()) * 31;
        Long l = this.f40526j;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f40527k;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f40528l;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f40529m;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final String mo37068i() {
        return this.f40520d;
    }

    /* renamed from: j */
    public final Integer mo37069j() {
        return this.f40528l;
    }

    /* renamed from: k */
    public final Integer mo37070k() {
        return this.f40529m;
    }

    public String toString() {
        String str = this.f40520d;
        String str2 = this.f40521e;
        String str3 = this.f40522f;
        boolean z = this.f40523g;
        boolean z2 = this.f40524h;
        ToastNotificationAppearance toastNotificationAppearance = this.f40525i;
        Long l = this.f40526j;
        Integer num = this.f40527k;
        Integer num2 = this.f40528l;
        Integer num3 = this.f40529m;
        return "ToastNotificationArguments(text=" + str + ", descriptionText=" + str2 + ", applyButtonText=" + str3 + ", closeButtonVisibility=" + z + ", canceledOnTouchOutside=" + z2 + ", appearance=" + toastNotificationAppearance + ", delayToDismiss=" + l + ", gravity=" + num + ", xPosition=" + num2 + ", yPosition=" + num3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f40520d);
        parcel.writeString(this.f40521e);
        parcel.writeString(this.f40522f);
        parcel.writeInt(this.f40523g ? 1 : 0);
        parcel.writeInt(this.f40524h ? 1 : 0);
        parcel.writeParcelable(this.f40525i, i);
        Long l = this.f40526j;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.f40527k;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f40528l;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f40529m;
        if (num3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num3.intValue());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ToastNotificationArguments(java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19, p341ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance r20, java.lang.Long r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
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
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0010
            r6 = r2
            goto L_0x0012
        L_0x0010:
            r6 = r17
        L_0x0012:
            r1 = r0 & 8
            r3 = 1
            if (r1 == 0) goto L_0x0019
            r7 = r3
            goto L_0x001b
        L_0x0019:
            r7 = r18
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r3
            goto L_0x0023
        L_0x0021:
            r8 = r19
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance$Informative r1 = p341ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance.Informative.f40516g
            r9 = r1
            goto L_0x002d
        L_0x002b:
            r9 = r20
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r10 = r2
            goto L_0x0035
        L_0x0033:
            r10 = r21
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r11 = r2
            goto L_0x003d
        L_0x003b:
            r11 = r22
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0043
            r12 = r2
            goto L_0x0045
        L_0x0043:
            r12 = r23
        L_0x0045:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004b
            r13 = r2
            goto L_0x004d
        L_0x004b:
            r13 = r24
        L_0x004d:
            r3 = r14
            r5 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.toastnotification.ToastNotificationArguments.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
