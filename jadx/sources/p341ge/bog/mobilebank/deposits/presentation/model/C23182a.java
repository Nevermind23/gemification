package p341ge.bog.mobilebank.deposits.presentation.model;

import ec0.C20212d;
import ec0.C20214f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ny0.C37501c;
import zs0.C40253f;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.a */
public final class C23182a {

    /* renamed from: a */
    private final Long f60709a;

    /* renamed from: b */
    private final C20212d f60710b;

    /* renamed from: c */
    private final List f60711c;

    /* renamed from: d */
    private final List f60712d;

    /* renamed from: e */
    private final List f60713e;

    /* renamed from: f */
    private final List f60714f;

    /* renamed from: g */
    private final List f60715g;

    /* renamed from: h */
    private final C37501c f60716h;

    /* renamed from: i */
    private final C40253f f60717i;

    /* renamed from: j */
    private final C20214f f60718j;

    public C23182a(Long l, C20212d dVar, List list, List list2, List list3, List list4, List list5, C37501c cVar, C40253f fVar, C20214f fVar2) {
        C41536l.m120489i(dVar, "header");
        C41536l.m120489i(list, "depositActions");
        C41536l.m120489i(list2, "interestDetails");
        C41536l.m120489i(list3, "additionalFunctions");
        C41536l.m120489i(list4, "depositDetails");
        C41536l.m120489i(list5, "savingGoalProgress");
        C41536l.m120489i(cVar, "sourceItem");
        this.f60709a = l;
        this.f60710b = dVar;
        this.f60711c = list;
        this.f60712d = list2;
        this.f60713e = list3;
        this.f60714f = list4;
        this.f60715g = list5;
        this.f60716h = cVar;
        this.f60717i = fVar;
        this.f60718j = fVar2;
    }

    /* renamed from: a */
    public final List mo57875a() {
        return this.f60713e;
    }

    /* renamed from: b */
    public final C40253f mo57876b() {
        return this.f60717i;
    }

    /* renamed from: c */
    public final List mo57877c() {
        return this.f60711c;
    }

    /* renamed from: d */
    public final List mo57878d() {
        return this.f60714f;
    }

    /* renamed from: e */
    public final C20214f mo57879e() {
        return this.f60718j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23182a)) {
            return false;
        }
        C23182a aVar = (C23182a) obj;
        return C41536l.m120484d(this.f60709a, aVar.f60709a) && C41536l.m120484d(this.f60710b, aVar.f60710b) && C41536l.m120484d(this.f60711c, aVar.f60711c) && C41536l.m120484d(this.f60712d, aVar.f60712d) && C41536l.m120484d(this.f60713e, aVar.f60713e) && C41536l.m120484d(this.f60714f, aVar.f60714f) && C41536l.m120484d(this.f60715g, aVar.f60715g) && C41536l.m120484d(this.f60716h, aVar.f60716h) && C41536l.m120484d(this.f60717i, aVar.f60717i) && C41536l.m120484d(this.f60718j, aVar.f60718j);
    }

    /* renamed from: f */
    public final C20212d mo57881f() {
        return this.f60710b;
    }

    /* renamed from: g */
    public final Long mo57882g() {
        return this.f60709a;
    }

    /* renamed from: h */
    public final List mo57883h() {
        return this.f60712d;
    }

    public int hashCode() {
        Long l = this.f60709a;
        int i = 0;
        int hashCode = (((((((((((((((l == null ? 0 : l.hashCode()) * 31) + this.f60710b.hashCode()) * 31) + this.f60711c.hashCode()) * 31) + this.f60712d.hashCode()) * 31) + this.f60713e.hashCode()) * 31) + this.f60714f.hashCode()) * 31) + this.f60715g.hashCode()) * 31) + this.f60716h.hashCode()) * 31;
        C40253f fVar = this.f60717i;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C20214f fVar2 = this.f60718j;
        if (fVar2 != null) {
            i = fVar2.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final List mo57885i() {
        return this.f60715g;
    }

    /* renamed from: j */
    public final C37501c mo57886j() {
        return this.f60716h;
    }

    public String toString() {
        Long l = this.f60709a;
        C20212d dVar = this.f60710b;
        List list = this.f60711c;
        List list2 = this.f60712d;
        List list3 = this.f60713e;
        List list4 = this.f60714f;
        List list5 = this.f60715g;
        C37501c cVar = this.f60716h;
        C40253f fVar = this.f60717i;
        C20214f fVar2 = this.f60718j;
        return "DepositDetailsUiModel(id=" + l + ", header=" + dVar + ", depositActions=" + list + ", interestDetails=" + list2 + ", additionalFunctions=" + list3 + ", depositDetails=" + list4 + ", savingGoalProgress=" + list5 + ", sourceItem=" + cVar + ", casServiceProduct=" + fVar + ", depositProlongationInfo=" + fVar2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C23182a(java.lang.Long r15, ec0.C20212d r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21, ny0.C37501c r22, zs0.C40253f r23, ec0.C20214f r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r12 = r2
            goto L_0x000b
        L_0x0009:
            r12 = r23
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0011
            r13 = r2
            goto L_0x0013
        L_0x0011:
            r13 = r24
        L_0x0013:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.deposits.presentation.model.C23182a.<init>(java.lang.Long, ec0.d, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, ny0.c, zs0.f, ec0.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
