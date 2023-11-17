package p177n1;

import android.content.Context;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p216q1.C7819c;

/* renamed from: n1.o */
public final class C7215o {

    /* renamed from: a */
    private final C7207h f21380a;

    /* renamed from: b */
    private final C7201c f21381b;

    /* renamed from: c */
    private final C7207h f21382c;

    /* renamed from: d */
    private final C7207h f21383d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7215o(Context context, C7819c cVar) {
        this(context, cVar, (C7207h) null, (C7201c) null, (C7207h) null, (C7207h) null, 60, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
    }

    /* renamed from: a */
    public final C7207h mo21580a() {
        return this.f21380a;
    }

    /* renamed from: b */
    public final C7201c mo21581b() {
        return this.f21381b;
    }

    /* renamed from: c */
    public final C7207h mo21582c() {
        return this.f21382c;
    }

    /* renamed from: d */
    public final C7207h mo21583d() {
        return this.f21383d;
    }

    public C7215o(Context context, C7819c cVar, C7207h hVar, C7201c cVar2, C7207h hVar2, C7207h hVar3) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "taskExecutor");
        C41536l.m120489i(hVar, "batteryChargingTracker");
        C41536l.m120489i(cVar2, "batteryNotLowTracker");
        C41536l.m120489i(hVar2, "networkStateTracker");
        C41536l.m120489i(hVar3, "storageNotLowTracker");
        this.f21380a = hVar;
        this.f21381b = cVar2;
        this.f21382c = hVar2;
        this.f21383d = hVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C7215o(android.content.Context r8, p216q1.C7819c r9, p177n1.C7207h r10, p177n1.C7201c r11, p177n1.C7207h r12, p177n1.C7207h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            n1.a r0 = new n1.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.C41536l.m120488h(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            n1.c r0 = new n1.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.C41536l.m120488h(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            n1.h r0 = p177n1.C7211k.m27764a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            n1.m r0 = new n1.m
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.C41536l.m120488h(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177n1.C7215o.<init>(android.content.Context, q1.c, n1.h, n1.c, n1.h, n1.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
