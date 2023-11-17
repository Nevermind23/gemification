package p341ge.bog.designsystem.components.actioncard;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p696zg.C19021a;

/* renamed from: ge.bog.designsystem.components.actioncard.ActionCardData */
public final class ActionCardData implements Parcelable {
    public static final Parcelable.Creator<ActionCardData> CREATOR = new C13146a();

    /* renamed from: d */
    private final String f38707d;

    /* renamed from: e */
    private final Image f38708e;

    /* renamed from: f */
    private final C19021a f38709f;

    /* renamed from: g */
    private final Color f38710g;

    /* renamed from: h */
    private final Color f38711h;

    /* renamed from: i */
    private final Color f38712i;

    /* renamed from: j */
    private final Color f38713j;

    /* renamed from: k */
    private final boolean f38714k;

    /* renamed from: l */
    private final Color f38715l;

    /* renamed from: m */
    private final BadgeData f38716m;

    /* renamed from: n */
    private final String f38717n;

    /* renamed from: o */
    private final String f38718o;

    /* renamed from: p */
    private final Color f38719p;

    /* renamed from: q */
    private final Color f38720q;

    /* renamed from: r */
    private final Color f38721r;

    /* renamed from: s */
    private final boolean f38722s;

    /* renamed from: t */
    private final Integer f38723t;

    /* renamed from: u */
    private final String f38724u;

    /* renamed from: v */
    private final Color f38725v;

    /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardData$a */
    public static final class C13146a implements Parcelable.Creator {
        /* renamed from: a */
        public final ActionCardData createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            Class<ActionCardData> cls = ActionCardData.class;
            return new ActionCardData(parcel.readString(), (Image) parcel2.readParcelable(cls.getClassLoader()), C19021a.valueOf(parcel.readString()), (Color) parcel2.readParcelable(cls.getClassLoader()), (Color) parcel2.readParcelable(cls.getClassLoader()), (Color) parcel2.readParcelable(cls.getClassLoader()), (Color) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, (Color) parcel2.readParcelable(cls.getClassLoader()), (BadgeData) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), (Color) parcel2.readParcelable(cls.getClassLoader()), (Color) parcel2.readParcelable(cls.getClassLoader()), (Color) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (Color) parcel2.readParcelable(cls.getClassLoader()));
        }

        /* renamed from: b */
        public final ActionCardData[] newArray(int i) {
            return new ActionCardData[i];
        }
    }

    public ActionCardData() {
        this((String) null, (Image) null, (C19021a) null, (Color) null, (Color) null, (Color) null, (Color) null, false, (Color) null, (BadgeData) null, (String) null, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 524287, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ ActionCardData m49489b(ActionCardData actionCardData, String str, Image image, C19021a aVar, Color color, Color color2, Color color3, Color color4, boolean z, Color color5, BadgeData badgeData, String str2, String str3, Color color6, Color color7, Color color8, boolean z2, Integer num, String str4, Color color9, int i, Object obj) {
        ActionCardData actionCardData2 = actionCardData;
        int i2 = i;
        return actionCardData.mo34694a((i2 & 1) != 0 ? actionCardData2.f38707d : str, (i2 & 2) != 0 ? actionCardData2.f38708e : image, (i2 & 4) != 0 ? actionCardData2.f38709f : aVar, (i2 & 8) != 0 ? actionCardData2.f38710g : color, (i2 & 16) != 0 ? actionCardData2.f38711h : color2, (i2 & 32) != 0 ? actionCardData2.f38712i : color3, (i2 & 64) != 0 ? actionCardData2.f38713j : color4, (i2 & 128) != 0 ? actionCardData2.f38714k : z, (i2 & C11398b.f33139r) != 0 ? actionCardData2.f38715l : color5, (i2 & C11398b.f33140s) != 0 ? actionCardData2.f38716m : badgeData, (i2 & C11398b.f33141t) != 0 ? actionCardData2.f38717n : str2, (i2 & C11398b.f33142u) != 0 ? actionCardData2.f38718o : str3, (i2 & C11398b.f33143v) != 0 ? actionCardData2.f38719p : color6, (i2 & 8192) != 0 ? actionCardData2.f38720q : color7, (i2 & 16384) != 0 ? actionCardData2.f38721r : color8, (i2 & 32768) != 0 ? actionCardData2.f38722s : z2, (i2 & 65536) != 0 ? actionCardData2.f38723t : num, (i2 & 131072) != 0 ? actionCardData2.f38724u : str4, (i2 & 262144) != 0 ? actionCardData2.f38725v : color9);
    }

    /* renamed from: a */
    public final ActionCardData mo34694a(String str, Image image, C19021a aVar, Color color, Color color2, Color color3, Color color4, boolean z, Color color5, BadgeData badgeData, String str2, String str3, Color color6, Color color7, Color color8, boolean z2, Integer num, String str4, Color color9) {
        String str5 = str;
        C41536l.m120489i(aVar, "iconType");
        C41536l.m120489i(color, "background");
        return new ActionCardData(str, image, aVar, color, color2, color3, color4, z, color5, badgeData, str2, str3, color6, color7, color8, z2, num, str4, color9);
    }

    /* renamed from: d */
    public final Color mo34695d() {
        return this.f38710g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BadgeData mo34697e() {
        return this.f38716m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionCardData)) {
            return false;
        }
        ActionCardData actionCardData = (ActionCardData) obj;
        return C41536l.m120484d(this.f38707d, actionCardData.f38707d) && C41536l.m120484d(this.f38708e, actionCardData.f38708e) && this.f38709f == actionCardData.f38709f && C41536l.m120484d(this.f38710g, actionCardData.f38710g) && C41536l.m120484d(this.f38711h, actionCardData.f38711h) && C41536l.m120484d(this.f38712i, actionCardData.f38712i) && C41536l.m120484d(this.f38713j, actionCardData.f38713j) && this.f38714k == actionCardData.f38714k && C41536l.m120484d(this.f38715l, actionCardData.f38715l) && C41536l.m120484d(this.f38716m, actionCardData.f38716m) && C41536l.m120484d(this.f38717n, actionCardData.f38717n) && C41536l.m120484d(this.f38718o, actionCardData.f38718o) && C41536l.m120484d(this.f38719p, actionCardData.f38719p) && C41536l.m120484d(this.f38720q, actionCardData.f38720q) && C41536l.m120484d(this.f38721r, actionCardData.f38721r) && this.f38722s == actionCardData.f38722s && C41536l.m120484d(this.f38723t, actionCardData.f38723t) && C41536l.m120484d(this.f38724u, actionCardData.f38724u) && C41536l.m120484d(this.f38725v, actionCardData.f38725v);
    }

    /* renamed from: f */
    public final Color mo34699f() {
        return this.f38715l;
    }

    /* renamed from: g */
    public final String mo34700g() {
        return this.f38718o;
    }

    /* renamed from: h */
    public final Color mo34701h() {
        return this.f38721r;
    }

    public int hashCode() {
        String str = this.f38707d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f38708e;
        int hashCode2 = (((((hashCode + (image == null ? 0 : image.hashCode())) * 31) + this.f38709f.hashCode()) * 31) + this.f38710g.hashCode()) * 31;
        Color color = this.f38711h;
        int hashCode3 = (hashCode2 + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.f38712i;
        int hashCode4 = (hashCode3 + (color2 == null ? 0 : color2.hashCode())) * 31;
        Color color3 = this.f38713j;
        int hashCode5 = (hashCode4 + (color3 == null ? 0 : color3.hashCode())) * 31;
        boolean z = this.f38714k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        Color color4 = this.f38715l;
        int hashCode6 = (i2 + (color4 == null ? 0 : color4.hashCode())) * 31;
        BadgeData badgeData = this.f38716m;
        int hashCode7 = (hashCode6 + (badgeData == null ? 0 : badgeData.hashCode())) * 31;
        String str2 = this.f38717n;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38718o;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Color color5 = this.f38719p;
        int hashCode10 = (hashCode9 + (color5 == null ? 0 : color5.hashCode())) * 31;
        Color color6 = this.f38720q;
        int hashCode11 = (hashCode10 + (color6 == null ? 0 : color6.hashCode())) * 31;
        Color color7 = this.f38721r;
        int hashCode12 = (hashCode11 + (color7 == null ? 0 : color7.hashCode())) * 31;
        boolean z3 = this.f38722s;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode12 + (z2 ? 1 : 0)) * 31;
        Integer num = this.f38723t;
        int hashCode13 = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f38724u;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Color color8 = this.f38725v;
        if (color8 != null) {
            i = color8.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final Integer mo34703i() {
        return this.f38723t;
    }

    /* renamed from: j */
    public final String mo34704j() {
        return this.f38724u;
    }

    /* renamed from: k */
    public final Color mo34705k() {
        return this.f38725v;
    }

    /* renamed from: l */
    public final boolean mo34706l() {
        return this.f38714k;
    }

    /* renamed from: m */
    public final Image mo34707m() {
        return this.f38708e;
    }

    /* renamed from: p */
    public final C19021a mo34708p() {
        return this.f38709f;
    }

    /* renamed from: q */
    public final Color mo34709q() {
        return this.f38713j;
    }

    /* renamed from: r */
    public final String mo34710r() {
        return this.f38717n;
    }

    /* renamed from: s */
    public final Color mo34711s() {
        return this.f38720q;
    }

    /* renamed from: t */
    public final Color mo34712t() {
        return this.f38712i;
    }

    public String toString() {
        String str = this.f38707d;
        Image image = this.f38708e;
        C19021a aVar = this.f38709f;
        Color color = this.f38710g;
        Color color2 = this.f38711h;
        Color color3 = this.f38712i;
        Color color4 = this.f38713j;
        boolean z = this.f38714k;
        Color color5 = this.f38715l;
        BadgeData badgeData = this.f38716m;
        String str2 = this.f38717n;
        String str3 = this.f38718o;
        Color color6 = this.f38719p;
        Color color7 = this.f38720q;
        Color color8 = this.f38721r;
        boolean z2 = this.f38722s;
        Integer num = this.f38723t;
        String str4 = this.f38724u;
        Color color9 = this.f38725v;
        return "ActionCardData(text=" + str + ", icon=" + image + ", iconType=" + aVar + ", background=" + color + ", ovalIconTint=" + color2 + ", ovalIconBgTint=" + color3 + ", imageTint=" + color4 + ", hasChevron=" + z + ", borderColor=" + color5 + ", badgeData=" + badgeData + ", midText=" + str2 + ", botText=" + str3 + ", textColor=" + color6 + ", midTextColor=" + color7 + ", botTextColor=" + color8 + ", showButton=" + z2 + ", buttonIcon=" + num + ", buttonText=" + str4 + ", chevronColor=" + color9 + ")";
    }

    /* renamed from: u */
    public final Color mo34714u() {
        return this.f38711h;
    }

    /* renamed from: v */
    public final boolean mo34715v() {
        return this.f38722s;
    }

    /* renamed from: w */
    public final String mo34716w() {
        return this.f38707d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f38707d);
        parcel.writeParcelable(this.f38708e, i);
        parcel.writeString(this.f38709f.name());
        parcel.writeParcelable(this.f38710g, i);
        parcel.writeParcelable(this.f38711h, i);
        parcel.writeParcelable(this.f38712i, i);
        parcel.writeParcelable(this.f38713j, i);
        parcel.writeInt(this.f38714k ? 1 : 0);
        parcel.writeParcelable(this.f38715l, i);
        parcel.writeParcelable(this.f38716m, i);
        parcel.writeString(this.f38717n);
        parcel.writeString(this.f38718o);
        parcel.writeParcelable(this.f38719p, i);
        parcel.writeParcelable(this.f38720q, i);
        parcel.writeParcelable(this.f38721r, i);
        parcel.writeInt(this.f38722s ? 1 : 0);
        Integer num = this.f38723t;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f38724u);
        parcel.writeParcelable(this.f38725v, i);
    }

    /* renamed from: x */
    public final Color mo34718x() {
        return this.f38719p;
    }

    public ActionCardData(String str, Image image, C19021a aVar, Color color, Color color2, Color color3, Color color4, boolean z, Color color5, BadgeData badgeData, String str2, String str3, Color color6, Color color7, Color color8, boolean z2, Integer num, String str4, Color color9) {
        C41536l.m120489i(aVar, "iconType");
        C41536l.m120489i(color, "background");
        this.f38707d = str;
        this.f38708e = image;
        this.f38709f = aVar;
        this.f38710g = color;
        this.f38711h = color2;
        this.f38712i = color3;
        this.f38713j = color4;
        this.f38714k = z;
        this.f38715l = color5;
        this.f38716m = badgeData;
        this.f38717n = str2;
        this.f38718o = str3;
        this.f38719p = color6;
        this.f38720q = color7;
        this.f38721r = color8;
        this.f38722s = z2;
        this.f38723t = num;
        this.f38724u = str4;
        this.f38725v = color9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ActionCardData(java.lang.String r21, p341ge.bog.designsystem.components.common.Image r22, p696zg.C19021a r23, p341ge.bog.designsystem.components.common.Color r24, p341ge.bog.designsystem.components.common.Color r25, p341ge.bog.designsystem.components.common.Color r26, p341ge.bog.designsystem.components.common.Color r27, boolean r28, p341ge.bog.designsystem.components.common.Color r29, p341ge.bog.designsystem.components.actioncard.BadgeData r30, java.lang.String r31, java.lang.String r32, p341ge.bog.designsystem.components.common.Color r33, p341ge.bog.designsystem.components.common.Color r34, p341ge.bog.designsystem.components.common.Color r35, boolean r36, java.lang.Integer r37, java.lang.String r38, p341ge.bog.designsystem.components.common.Color r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            zg.a r4 = p696zg.C19021a.ILLUSTRATION
            goto L_0x001b
        L_0x0019:
            r4 = r23
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0027
            ge.bog.designsystem.components.common.Color$Resource r5 = new ge.bog.designsystem.components.common.Color$Resource
            int r6 = p601sg.C17778c.selector_action_card_background
            r5.<init>(r6)
            goto L_0x0029
        L_0x0027:
            r5 = r24
        L_0x0029:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0035
            ge.bog.designsystem.components.common.Color$Attribute r6 = new ge.bog.designsystem.components.common.Color$Attribute
            int r7 = p601sg.C17777b.f49603w
            r6.<init>(r7)
            goto L_0x0037
        L_0x0035:
            r6 = r25
        L_0x0037:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0043
            ge.bog.designsystem.components.common.Color$Attribute r7 = new ge.bog.designsystem.components.common.Color$Attribute
            int r8 = p601sg.C17777b.f49604x
            r7.<init>(r8)
            goto L_0x0045
        L_0x0043:
            r7 = r26
        L_0x0045:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x004b
            r8 = 0
            goto L_0x004d
        L_0x004b:
            r8 = r27
        L_0x004d:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0053
            r9 = 0
            goto L_0x0055
        L_0x0053:
            r9 = r28
        L_0x0055:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005b
            r11 = 0
            goto L_0x005d
        L_0x005b:
            r11 = r29
        L_0x005d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0063
            r12 = 0
            goto L_0x0065
        L_0x0063:
            r12 = r30
        L_0x0065:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006b
            r13 = 0
            goto L_0x006d
        L_0x006b:
            r13 = r31
        L_0x006d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0073
            r14 = 0
            goto L_0x0075
        L_0x0073:
            r14 = r32
        L_0x0075:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x007b
            r15 = 0
            goto L_0x007d
        L_0x007b:
            r15 = r33
        L_0x007d:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0083
            r2 = 0
            goto L_0x0085
        L_0x0083:
            r2 = r34
        L_0x0085:
            r10 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x008b
            r10 = 0
            goto L_0x008d
        L_0x008b:
            r10 = r35
        L_0x008d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0097
            r16 = 0
            goto L_0x0099
        L_0x0097:
            r16 = r36
        L_0x0099:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a2
            r17 = 0
            goto L_0x00a4
        L_0x00a2:
            r17 = r37
        L_0x00a4:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00ad
            r18 = 0
            goto L_0x00af
        L_0x00ad:
            r18 = r38
        L_0x00af:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00b7
            r0 = 0
            goto L_0x00b9
        L_0x00b7:
            r0 = r39
        L_0x00b9:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r10
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.actioncard.ActionCardData.<init>(java.lang.String, ge.bog.designsystem.components.common.Image, zg.a, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, boolean, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.actioncard.BadgeData, java.lang.String, java.lang.String, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, ge.bog.designsystem.components.common.Color, boolean, java.lang.Integer, java.lang.String, ge.bog.designsystem.components.common.Color, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
