package p341ge.bog.chat.presentation.activity;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.domain.model.components.Component;
import p419fg.C12870a;
import p419fg.C12884i;
import p573qg.C17499b;
import p573qg.C17500c;
import p573qg.C17501d;

/* renamed from: ge.bog.chat.presentation.activity.j0 */
public final class C13034j0 implements C17499b, C17501d {

    /* renamed from: a */
    private final String f38411a;

    /* renamed from: b */
    private final Date f38412b;

    /* renamed from: c */
    private final C13007a f38413c;

    /* renamed from: d */
    private final String f38414d;

    /* renamed from: e */
    private final C12870a f38415e;

    /* renamed from: f */
    private final C12884i f38416f;

    /* renamed from: g */
    private final C13032i0 f38417g;

    /* renamed from: h */
    private List f38418h;

    /* renamed from: i */
    private boolean f38419i;

    /* renamed from: j */
    private final C13013d f38420j;

    /* renamed from: k */
    private Component f38421k;

    /* renamed from: l */
    private C13027g0 f38422l;

    /* renamed from: ge.bog.chat.presentation.activity.j0$a */
    public /* synthetic */ class C13035a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38423a;

        static {
            int[] iArr = new int[C13032i0.values().length];
            iArr[C13032i0.TYPING.ordinal()] = 1;
            iArr[C13032i0.CHAT_ENDED.ordinal()] = 2;
            f38423a = iArr;
        }
    }

    public C13034j0(String str, Date date, C13007a aVar, String str2, C12870a aVar2, C12884i iVar, C13032i0 i0Var, List list, boolean z, C13013d dVar, Component component) {
        C41536l.m120489i(str, "messageId");
        C41536l.m120489i(date, "date");
        C41536l.m120489i(aVar, "author");
        C41536l.m120489i(iVar, "messageStatus");
        C41536l.m120489i(i0Var, "messageType");
        this.f38411a = str;
        this.f38412b = date;
        this.f38413c = aVar;
        this.f38414d = str2;
        this.f38415e = aVar2;
        this.f38416f = iVar;
        this.f38417g = i0Var;
        this.f38418h = list;
        this.f38419i = z;
        this.f38420j = dVar;
        this.f38421k = component;
    }

    /* renamed from: a */
    public String mo34284a() {
        int i = C13035a.f38423a[this.f38417g.ordinal()];
        if (i == 1) {
            return "ge.bog.mobilebank.cleanarch.presentation.chat.START_TYPING";
        }
        if (i != 2) {
            return this.f38411a;
        }
        return "ge.bog.mobilebank.cleanarch.presentation.chat.CHAT_ENDED";
    }

    /* renamed from: b */
    public String mo34285b() {
        return this.f38414d;
    }

    /* renamed from: c */
    public Date mo34286c() {
        return this.f38412b;
    }

    /* renamed from: d */
    public C17500c mo34287d() {
        return this.f38413c;
    }

    /* renamed from: e */
    public final boolean mo34288e(C13034j0 j0Var) {
        C13032i0 i0Var;
        C13032i0 i0Var2;
        C13032i0 i0Var3;
        C13032i0 i0Var4;
        if (j0Var == null || this.f38413c.mo34236c() != j0Var.f38413c.mo34236c() || !C41536l.m120484d(this.f38413c.getName(), j0Var.f38413c.getName()) || (i0Var = this.f38417g) == (i0Var2 = C13032i0.PARTICIPANT_JOINED) || (i0Var3 = j0Var.f38417g) == i0Var2 || i0Var == (i0Var4 = C13032i0.CHAT_ENDED) || i0Var3 == i0Var4) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13034j0)) {
            return false;
        }
        C13034j0 j0Var = (C13034j0) obj;
        return C41536l.m120484d(this.f38411a, j0Var.f38411a) && C41536l.m120484d(this.f38412b, j0Var.f38412b) && C41536l.m120484d(this.f38413c, j0Var.f38413c) && C41536l.m120484d(this.f38414d, j0Var.f38414d) && C41536l.m120484d(this.f38415e, j0Var.f38415e) && this.f38416f == j0Var.f38416f && this.f38417g == j0Var.f38417g && C41536l.m120484d(this.f38418h, j0Var.f38418h) && this.f38419i == j0Var.f38419i && C41536l.m120484d(this.f38420j, j0Var.f38420j) && C41536l.m120484d(this.f38421k, j0Var.f38421k);
    }

    /* renamed from: f */
    public final C12870a mo34290f() {
        return this.f38415e;
    }

    /* renamed from: g */
    public final C13007a mo34291g() {
        return this.f38413c;
    }

    /* renamed from: h */
    public final C13013d mo34292h() {
        return this.f38420j;
    }

    public int hashCode() {
        int hashCode = ((((this.f38411a.hashCode() * 31) + this.f38412b.hashCode()) * 31) + this.f38413c.hashCode()) * 31;
        String str = this.f38414d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C12870a aVar = this.f38415e;
        int hashCode3 = (((((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f38416f.hashCode()) * 31) + this.f38417g.hashCode()) * 31;
        List list = this.f38418h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.f38419i;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        C13013d dVar = this.f38420j;
        int hashCode5 = (i2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Component component = this.f38421k;
        if (component != null) {
            i = component.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final List mo34294i() {
        return this.f38418h;
    }

    /* renamed from: j */
    public final Component mo34295j() {
        return this.f38421k;
    }

    /* renamed from: k */
    public final Date mo34296k() {
        return this.f38412b;
    }

    /* renamed from: l */
    public final boolean mo34297l() {
        return this.f38419i;
    }

    /* renamed from: m */
    public final C13027g0 mo34298m() {
        return this.f38422l;
    }

    /* renamed from: n */
    public final C12884i mo34299n() {
        return this.f38416f;
    }

    /* renamed from: o */
    public final C13032i0 mo34300o() {
        return this.f38417g;
    }

    /* renamed from: p */
    public final String mo34301p() {
        return this.f38414d;
    }

    /* renamed from: q */
    public final void mo34302q(List list) {
        this.f38418h = list;
    }

    /* renamed from: r */
    public final void mo34303r(Component component) {
        this.f38421k = component;
    }

    /* renamed from: s */
    public final void mo34304s(boolean z) {
        this.f38419i = z;
    }

    /* renamed from: t */
    public final void mo34305t(C13027g0 g0Var) {
        this.f38422l = g0Var;
    }

    public String toString() {
        String str = this.f38411a;
        Date date = this.f38412b;
        C13007a aVar = this.f38413c;
        String str2 = this.f38414d;
        C12870a aVar2 = this.f38415e;
        C12884i iVar = this.f38416f;
        C13032i0 i0Var = this.f38417g;
        List list = this.f38418h;
        boolean z = this.f38419i;
        C13013d dVar = this.f38420j;
        Component component = this.f38421k;
        return "MessageUiModel(messageId=" + str + ", date=" + date + ", author=" + aVar + ", msg=" + str2 + ", attachment=" + aVar2 + ", messageStatus=" + iVar + ", messageType=" + i0Var + ", choices=" + list + ", feedbackRequired=" + z + ", botFile=" + dVar + ", component=" + component + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13034j0(java.lang.String r16, java.util.Date r17, p341ge.bog.chat.presentation.activity.C13007a r18, java.lang.String r19, p419fg.C12870a r20, p419fg.C12884i r21, p341ge.bog.chat.presentation.activity.C13032i0 r22, java.util.List r23, boolean r24, p341ge.bog.chat.presentation.activity.C13013d r25, p341ge.bog.chat.domain.model.components.Component r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r19
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r20
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            fg.i r1 = p419fg.C12884i.DEFAULT
            r9 = r1
            goto L_0x001d
        L_0x001b:
            r9 = r21
        L_0x001d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0023
            r11 = r2
            goto L_0x0025
        L_0x0023:
            r11 = r23
        L_0x0025:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002c
            r1 = 0
            r12 = r1
            goto L_0x002e
        L_0x002c:
            r12 = r24
        L_0x002e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0034
            r13 = r2
            goto L_0x0036
        L_0x0034:
            r13 = r25
        L_0x0036:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003c
            r14 = r2
            goto L_0x003e
        L_0x003c:
            r14 = r26
        L_0x003e:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r10 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chat.presentation.activity.C13034j0.<init>(java.lang.String, java.util.Date, ge.bog.chat.presentation.activity.a, java.lang.String, fg.a, fg.i, ge.bog.chat.presentation.activity.i0, java.util.List, boolean, ge.bog.chat.presentation.activity.d, ge.bog.chat.domain.model.components.Component, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
