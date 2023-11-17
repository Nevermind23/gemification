package p492kj;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;

/* renamed from: kj.h */
public final class C16444h {

    /* renamed from: a */
    private final C16435b f46441a;

    /* renamed from: b */
    private final List f46442b;

    /* renamed from: c */
    private final TextProgressBarView.ProgressModel f46443c;

    /* renamed from: d */
    private final C16434a f46444d;

    /* renamed from: e */
    private final List f46445e;

    public C16444h(C16435b bVar, List list, TextProgressBarView.ProgressModel progressModel, C16434a aVar, List list2) {
        this.f46441a = bVar;
        this.f46442b = list;
        this.f46443c = progressModel;
        this.f46444d = aVar;
        this.f46445e = list2;
    }

    /* renamed from: a */
    public final C16434a mo43595a() {
        return this.f46444d;
    }

    /* renamed from: b */
    public final C16435b mo43596b() {
        return this.f46441a;
    }

    /* renamed from: c */
    public final List mo43597c() {
        return this.f46442b;
    }

    /* renamed from: d */
    public final List mo43598d() {
        return this.f46445e;
    }

    /* renamed from: e */
    public final TextProgressBarView.ProgressModel mo43599e() {
        return this.f46443c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16444h)) {
            return false;
        }
        C16444h hVar = (C16444h) obj;
        return C41536l.m120484d(this.f46441a, hVar.f46441a) && C41536l.m120484d(this.f46442b, hVar.f46442b) && C41536l.m120484d(this.f46443c, hVar.f46443c) && C41536l.m120484d(this.f46444d, hVar.f46444d) && C41536l.m120484d(this.f46445e, hVar.f46445e);
    }

    public int hashCode() {
        C16435b bVar = this.f46441a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List list = this.f46442b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TextProgressBarView.ProgressModel progressModel = this.f46443c;
        int hashCode3 = (hashCode2 + (progressModel == null ? 0 : progressModel.hashCode())) * 31;
        C16434a aVar = this.f46444d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list2 = this.f46445e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        C16435b bVar = this.f46441a;
        List list = this.f46442b;
        TextProgressBarView.ProgressModel progressModel = this.f46443c;
        C16434a aVar = this.f46444d;
        List list2 = this.f46445e;
        return "StatisticsWidgetData(header=" + bVar + ", progressBadges=" + list + ", textProgressData=" + progressModel + ", feedBack=" + aVar + ", statisticsList=" + list2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16444h(p492kj.C16435b r5, java.util.List r6, p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.ProgressModel r7, p492kj.C16434a r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p492kj.C16444h.<init>(kj.b, java.util.List, ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel, kj.a, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
