package p419fg;

import cf1.C40407d;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.chat.domain.model.components.Component;
import p419fg.C12870a;

/* renamed from: fg.g */
public final class C12878g {

    /* renamed from: m */
    public static final C12879a f38038m = new C12879a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f38039a;

    /* renamed from: b */
    private final long f38040b;

    /* renamed from: c */
    private final C12886k f38041c;

    /* renamed from: d */
    private final C12885j f38042d;

    /* renamed from: e */
    private final String f38043e;

    /* renamed from: f */
    private final Long f38044f;

    /* renamed from: g */
    private final C12870a f38045g;

    /* renamed from: h */
    private C12884i f38046h;

    /* renamed from: i */
    private List f38047i;

    /* renamed from: j */
    private boolean f38048j;

    /* renamed from: k */
    private final C12873b f38049k;

    /* renamed from: l */
    private Component f38050l;

    /* renamed from: fg.g$a */
    public static final class C12879a {
        private C12879a() {
        }

        public /* synthetic */ C12879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12878g mo33602a(C12870a.C12871a aVar, String str) {
            C12870a.C12871a aVar2 = aVar;
            C41536l.m120489i(aVar2, "attachment");
            String str2 = str;
            C41536l.m120489i(str2, "senderName");
            String uuid = UUID.randomUUID().toString();
            C41536l.m120488h(uuid, "randomUUID().toString()");
            long currentTimeMillis = System.currentTimeMillis();
            C12886k kVar = new C12886k(C12887l.CLIENT, str2, (Integer) null, 4, (DefaultConstructorMarker) null);
            return new C12878g(uuid, currentTimeMillis, kVar, C12885j.FILE_ATTACHMENT, (String) null, (Long) null, aVar2, C12884i.SENDING, (List) null, false, (C12873b) null, (Component) null, 3888, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C12878g mo33603b(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            C41536l.m120489i(str3, "text");
            C41536l.m120489i(str4, "senderName");
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("-");
            sb.append(str4);
            sb.append("-");
            sb.append(currentTimeMillis);
            sb.append("-");
            C12887l lVar = C12887l.CLIENT;
            sb.append(lVar);
            sb.append("-");
            C12884i iVar = C12884i.SENDING;
            sb.append(iVar);
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "StringBuilder().append(t…              .toString()");
            byte[] bytes = sb2.getBytes(C40407d.f95989b);
            C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
            String uuid = UUID.nameUUIDFromBytes(bytes).toString();
            C41536l.m120488h(uuid, "nameUUIDFromBytes(messag…toByteArray()).toString()");
            C12886k kVar = new C12886k(lVar, str4, (Integer) null, 4, (DefaultConstructorMarker) null);
            return new C12878g(uuid, currentTimeMillis, kVar, C12885j.TEXT, str3, (Long) null, (C12870a) null, iVar, (List) null, false, (C12873b) null, (Component) null, 3936, (DefaultConstructorMarker) null);
        }
    }

    public C12878g(String str, long j, C12886k kVar, C12885j jVar, String str2, Long l, C12870a aVar, C12884i iVar, List list, boolean z, C12873b bVar, Component component) {
        C41536l.m120489i(str, "localId");
        C41536l.m120489i(kVar, "participant");
        C41536l.m120489i(jVar, "messageType");
        C41536l.m120489i(iVar, "status");
        this.f38039a = str;
        this.f38040b = j;
        this.f38041c = kVar;
        this.f38042d = jVar;
        this.f38043e = str2;
        this.f38044f = l;
        this.f38045g = aVar;
        this.f38046h = iVar;
        this.f38047i = list;
        this.f38048j = z;
        this.f38049k = bVar;
        this.f38050l = component;
    }

    /* renamed from: b */
    public static /* synthetic */ C12878g m48709b(C12878g gVar, String str, long j, C12886k kVar, C12885j jVar, String str2, Long l, C12870a aVar, C12884i iVar, List list, boolean z, C12873b bVar, Component component, int i, Object obj) {
        C12878g gVar2 = gVar;
        int i2 = i;
        return gVar.mo33582a((i2 & 1) != 0 ? gVar2.f38039a : str, (i2 & 2) != 0 ? gVar2.f38040b : j, (i2 & 4) != 0 ? gVar2.f38041c : kVar, (i2 & 8) != 0 ? gVar2.f38042d : jVar, (i2 & 16) != 0 ? gVar2.f38043e : str2, (i2 & 32) != 0 ? gVar2.f38044f : l, (i2 & 64) != 0 ? gVar2.f38045g : aVar, (i2 & 128) != 0 ? gVar2.f38046h : iVar, (i2 & C11398b.f33139r) != 0 ? gVar2.f38047i : list, (i2 & C11398b.f33140s) != 0 ? gVar2.f38048j : z, (i2 & C11398b.f33141t) != 0 ? gVar2.f38049k : bVar, (i2 & C11398b.f33142u) != 0 ? gVar2.f38050l : component);
    }

    /* renamed from: a */
    public final C12878g mo33582a(String str, long j, C12886k kVar, C12885j jVar, String str2, Long l, C12870a aVar, C12884i iVar, List list, boolean z, C12873b bVar, Component component) {
        String str3 = str;
        C41536l.m120489i(str3, "localId");
        C12886k kVar2 = kVar;
        C41536l.m120489i(kVar2, "participant");
        C12885j jVar2 = jVar;
        C41536l.m120489i(jVar2, "messageType");
        C12884i iVar2 = iVar;
        C41536l.m120489i(iVar2, "status");
        return new C12878g(str3, j, kVar2, jVar2, str2, l, aVar, iVar2, list, z, bVar, component);
    }

    /* renamed from: c */
    public final C12870a mo33583c() {
        return this.f38045g;
    }

    /* renamed from: d */
    public final C12873b mo33584d() {
        return this.f38049k;
    }

    /* renamed from: e */
    public final List mo33585e() {
        return this.f38047i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12878g)) {
            return false;
        }
        C12878g gVar = (C12878g) obj;
        return C41536l.m120484d(this.f38039a, gVar.f38039a) && this.f38040b == gVar.f38040b && C41536l.m120484d(this.f38041c, gVar.f38041c) && this.f38042d == gVar.f38042d && C41536l.m120484d(this.f38043e, gVar.f38043e) && C41536l.m120484d(this.f38044f, gVar.f38044f) && C41536l.m120484d(this.f38045g, gVar.f38045g) && this.f38046h == gVar.f38046h && C41536l.m120484d(this.f38047i, gVar.f38047i) && this.f38048j == gVar.f38048j && C41536l.m120484d(this.f38049k, gVar.f38049k) && C41536l.m120484d(this.f38050l, gVar.f38050l);
    }

    /* renamed from: f */
    public final Component mo33587f() {
        return this.f38050l;
    }

    /* renamed from: g */
    public final boolean mo33588g() {
        return this.f38048j;
    }

    /* renamed from: h */
    public final String mo33589h() {
        return this.f38039a;
    }

    public int hashCode() {
        int hashCode = ((((((this.f38039a.hashCode() * 31) + C7397t.m28148a(this.f38040b)) * 31) + this.f38041c.hashCode()) * 31) + this.f38042d.hashCode()) * 31;
        String str = this.f38043e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f38044f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        C12870a aVar = this.f38045g;
        int hashCode4 = (((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f38046h.hashCode()) * 31;
        List list = this.f38047i;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.f38048j;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        C12873b bVar = this.f38049k;
        int hashCode6 = (i2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Component component = this.f38050l;
        if (component != null) {
            i = component.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final C12885j mo33591i() {
        return this.f38042d;
    }

    /* renamed from: j */
    public final C12886k mo33592j() {
        return this.f38041c;
    }

    /* renamed from: k */
    public final Long mo33593k() {
        return this.f38044f;
    }

    /* renamed from: l */
    public final C12884i mo33594l() {
        return this.f38046h;
    }

    /* renamed from: m */
    public final String mo33595m() {
        return this.f38043e;
    }

    /* renamed from: n */
    public final long mo33596n() {
        return this.f38040b;
    }

    /* renamed from: o */
    public final void mo33597o(List list) {
        this.f38047i = list;
    }

    /* renamed from: p */
    public final void mo33598p(Component component) {
        this.f38050l = component;
    }

    /* renamed from: q */
    public final void mo33599q(boolean z) {
        this.f38048j = z;
    }

    /* renamed from: r */
    public final void mo33600r(C12884i iVar) {
        C41536l.m120489i(iVar, "<set-?>");
        this.f38046h = iVar;
    }

    public String toString() {
        String str = this.f38039a;
        long j = this.f38040b;
        C12886k kVar = this.f38041c;
        C12885j jVar = this.f38042d;
        String str2 = this.f38043e;
        Long l = this.f38044f;
        C12870a aVar = this.f38045g;
        C12884i iVar = this.f38046h;
        List list = this.f38047i;
        boolean z = this.f38048j;
        C12873b bVar = this.f38049k;
        Component component = this.f38050l;
        return "Message(localId=" + str + ", time=" + j + ", participant=" + kVar + ", messageType=" + jVar + ", text=" + str2 + ", remoteId=" + l + ", attachment=" + aVar + ", status=" + iVar + ", choices=" + list + ", feedbackRequired=" + z + ", botFile=" + bVar + ", component=" + component + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12878g(java.lang.String r18, long r19, p419fg.C12886k r21, p419fg.C12885j r22, java.lang.String r23, java.lang.Long r24, p419fg.C12870a r25, p419fg.C12884i r26, java.util.List r27, boolean r28, p419fg.C12873b r29, p341ge.bog.chat.domain.model.components.Component r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r23
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r24
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r25
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0023
            fg.i r1 = p419fg.C12884i.DEFAULT
            r12 = r1
            goto L_0x0025
        L_0x0023:
            r12 = r26
        L_0x0025:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r27
        L_0x002d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0034
            r1 = 0
            r14 = r1
            goto L_0x0036
        L_0x0034:
            r14 = r28
        L_0x0036:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x003c
            r15 = r2
            goto L_0x003e
        L_0x003c:
            r15 = r29
        L_0x003e:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0045
            r16 = r2
            goto L_0x0047
        L_0x0045:
            r16 = r30
        L_0x0047:
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p419fg.C12878g.<init>(java.lang.String, long, fg.k, fg.j, java.lang.String, java.lang.Long, fg.a, fg.i, java.util.List, boolean, fg.b, ge.bog.chat.domain.model.components.Component, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
