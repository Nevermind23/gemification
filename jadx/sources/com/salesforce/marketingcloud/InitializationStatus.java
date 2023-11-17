package com.salesforce.marketingcloud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@MCKeep
public final class InitializationStatus {
    public static final C11294b Companion = new C11294b((DefaultConstructorMarker) null);
    private final boolean encryptionChanged;
    private final List<String> initializedComponents;
    private final boolean isUsable;
    private final boolean locationsError;
    private final boolean messagingPermissionError;
    private final String playServicesMessage;
    private final int playServicesStatus;
    private final boolean proximityError;
    private final boolean sslProviderEnablementError;
    private final Status status;
    private final boolean storageError;
    private final Throwable unrecoverableException;

    @MCKeep
    public enum Status {
        SUCCESS,
        COMPLETED_WITH_DEGRADED_FUNCTIONALITY,
        FAILED
    }

    /* renamed from: com.salesforce.marketingcloud.InitializationStatus$a */
    public static final class C11293a {

        /* renamed from: a */
        private Throwable f32826a;

        /* renamed from: b */
        private boolean f32827b;

        /* renamed from: c */
        private boolean f32828c;

        /* renamed from: d */
        private boolean f32829d;

        /* renamed from: e */
        private boolean f32830e;

        /* renamed from: f */
        private boolean f32831f;

        /* renamed from: g */
        private String f32832g;

        /* renamed from: h */
        private int f32833h = -1;

        /* renamed from: i */
        private boolean f32834i;

        /* renamed from: j */
        private final List<String> f32835j = new ArrayList();

        /* renamed from: a */
        public final InitializationStatus mo29527a() {
            Status status = mo29534b() ? (this.f32827b || this.f32829d || this.f32830e || this.f32834i || this.f32831f) ? Status.COMPLETED_WITH_DEGRADED_FUNCTIONALITY : Status.SUCCESS : Status.FAILED;
            Throwable th = this.f32826a;
            boolean z = this.f32827b;
            int i = this.f32833h;
            String str = this.f32832g;
            boolean z2 = this.f32828c;
            boolean z3 = this.f32829d;
            boolean z4 = this.f32834i;
            boolean z5 = this.f32830e;
            boolean z6 = this.f32831f;
            Object[] array = this.f32835j.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return new InitializationStatus(status, th, z, i, str, z2, z3, z4, z5, z6, C41341q.m119910m(Arrays.copyOf(strArr, strArr.length)), false, C11398b.f33142u, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: b */
        public final void mo29533b(boolean z) {
            this.f32827b = z;
        }

        /* renamed from: c */
        public final void mo29535c(boolean z) {
            this.f32830e = z;
        }

        /* renamed from: d */
        public final void mo29536d(boolean z) {
            this.f32834i = z;
        }

        /* renamed from: e */
        public final void mo29537e(boolean z) {
            this.f32831f = z;
        }

        /* renamed from: f */
        public final void mo29538f(boolean z) {
            this.f32829d = z;
        }

        /* renamed from: a */
        public final void mo29528a(int i) {
            this.f32833h = i;
        }

        /* renamed from: b */
        public final boolean mo29534b() {
            return this.f32826a == null;
        }

        /* renamed from: a */
        public final void mo29529a(C11418d dVar) {
            C41536l.m120489i(dVar, "component");
            List<String> list = this.f32835j;
            String componentName = dVar.componentName();
            C41536l.m120488h(componentName, "component.componentName()");
            list.add(componentName);
        }

        /* renamed from: a */
        public final void mo29530a(String str) {
            if (str != null) {
                if (this.f32832g != null) {
                    str = this.f32832g + 10 + str;
                }
                this.f32832g = str;
            }
        }

        /* renamed from: a */
        public final void mo29531a(Throwable th) {
            C41536l.m120489i(th, "throwable");
            this.f32826a = th;
        }

        /* renamed from: a */
        public final void mo29532a(boolean z) {
            this.f32828c = z;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.InitializationStatus$b */
    public static final class C11294b {
        private C11294b() {
        }

        public /* synthetic */ C11294b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InitializationStatus mo29539a() {
            C11293a b = mo29540b();
            b.mo29531a((Throwable) new IllegalStateException("Amazon devices are not supported"));
            return b.mo29527a();
        }

        /* renamed from: b */
        public final C11293a mo29540b() {
            return new C11293a();
        }
    }

    public InitializationStatus(Status status2, Throwable th, boolean z, int i, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list, boolean z7) {
        C41536l.m120489i(status2, "status");
        C41536l.m120489i(list, "initializedComponents");
        this.status = status2;
        this.unrecoverableException = th;
        this.locationsError = z;
        this.playServicesStatus = i;
        this.playServicesMessage = str;
        this.encryptionChanged = z2;
        this.storageError = z3;
        this.proximityError = z4;
        this.messagingPermissionError = z5;
        this.sslProviderEnablementError = z6;
        this.initializedComponents = list;
        this.isUsable = z7;
    }

    /* renamed from: -deprecated_encryptionChanged  reason: not valid java name */
    public final boolean m124814deprecated_encryptionChanged() {
        return this.encryptionChanged;
    }

    /* renamed from: -deprecated_initializedComponents  reason: not valid java name */
    public final List<String> m124815deprecated_initializedComponents() {
        return this.initializedComponents;
    }

    /* renamed from: -deprecated_locationsError  reason: not valid java name */
    public final boolean m124816deprecated_locationsError() {
        return this.locationsError;
    }

    /* renamed from: -deprecated_messagingPermissionError  reason: not valid java name */
    public final boolean m124817deprecated_messagingPermissionError() {
        return this.messagingPermissionError;
    }

    /* renamed from: -deprecated_playServicesMessage  reason: not valid java name */
    public final String m124818deprecated_playServicesMessage() {
        return this.playServicesMessage;
    }

    /* renamed from: -deprecated_playServicesStatus  reason: not valid java name */
    public final int m124819deprecated_playServicesStatus() {
        return this.playServicesStatus;
    }

    /* renamed from: -deprecated_proximityError  reason: not valid java name */
    public final boolean m124820deprecated_proximityError() {
        return this.proximityError;
    }

    /* renamed from: -deprecated_sslProviderEnablementError  reason: not valid java name */
    public final boolean m124821deprecated_sslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    /* renamed from: -deprecated_status  reason: not valid java name */
    public final Status m124822deprecated_status() {
        return this.status;
    }

    /* renamed from: -deprecated_storageError  reason: not valid java name */
    public final boolean m124823deprecated_storageError() {
        return this.storageError;
    }

    /* renamed from: -deprecated_unrecoverableException  reason: not valid java name */
    public final Throwable m124824deprecated_unrecoverableException() {
        return this.unrecoverableException;
    }

    public final boolean encryptionChanged() {
        return this.encryptionChanged;
    }

    public final List<String> initializedComponents() {
        return this.initializedComponents;
    }

    public final boolean isUsable() {
        return this.isUsable;
    }

    public final boolean locationsError() {
        return this.locationsError;
    }

    public final boolean messagingPermissionError() {
        return this.messagingPermissionError;
    }

    public final String playServicesMessage() {
        return this.playServicesMessage;
    }

    public final int playServicesStatus() {
        return this.playServicesStatus;
    }

    public final boolean proximityError() {
        return this.proximityError;
    }

    public final boolean sslProviderEnablementError() {
        return this.sslProviderEnablementError;
    }

    public final Status status() {
        return this.status;
    }

    public final boolean storageError() {
        return this.storageError;
    }

    public String toString() {
        return "InitializationStatus(status=" + this.status + ", unrecoverableException=" + this.unrecoverableException + ", locationsError=" + this.locationsError + ", playServicesStatus=" + this.playServicesStatus + ", playServicesMessage=" + this.playServicesMessage + ", encryptionChanged=" + this.encryptionChanged + ", storageError=" + this.storageError + ", proximityError=" + this.proximityError + ", messagingPermissionError=" + this.messagingPermissionError + ", sslProviderEnablementError=" + this.sslProviderEnablementError + ", initializedComponents=" + this.initializedComponents + ", isUsable=" + this.isUsable + ')';
    }

    public final Throwable unrecoverableException() {
        return this.unrecoverableException;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InitializationStatus(com.salesforce.marketingcloud.InitializationStatus.Status r15, java.lang.Throwable r16, boolean r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, java.util.List r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0010
            com.salesforce.marketingcloud.InitializationStatus$Status r0 = com.salesforce.marketingcloud.InitializationStatus.Status.FAILED
            r2 = r15
            if (r2 == r0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r13 = r0
            goto L_0x0013
        L_0x0010:
            r2 = r15
            r13 = r26
        L_0x0013:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.InitializationStatus.<init>(com.salesforce.marketingcloud.InitializationStatus$Status, java.lang.Throwable, boolean, int, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
