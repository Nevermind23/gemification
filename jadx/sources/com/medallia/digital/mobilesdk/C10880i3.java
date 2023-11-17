package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* renamed from: com.medallia.digital.mobilesdk.i3 */
class C10880i3 implements Serializable {

    /* renamed from: a */
    private final String f31219a;

    /* renamed from: b */
    private String f31220b;

    /* renamed from: c */
    private boolean f31221c;

    /* renamed from: d */
    private boolean f31222d;

    /* renamed from: com.medallia.digital.mobilesdk.i3$a */
    enum C10881a {
        swipeUp,
        swipeDown,
        swipeLeft,
        swipeRight,
        buttonClicked
    }

    /* renamed from: com.medallia.digital.mobilesdk.i3$b */
    enum C10882b {
        maybeLater,
        androidBackButton,
        timeoutPassed,
        refreshSession,
        disableIntercept,
        stopApi,
        showForm,
        handleNotification,
        closed
    }

    /* renamed from: com.medallia.digital.mobilesdk.i3$c */
    enum C10883c {
        No,
        StickyByConfiguration,
        StickyByGesture
    }

    C10880i3(C10883c cVar, C10881a aVar, boolean z) {
        this.f31220b = aVar.toString();
        this.f31219a = cVar != null ? cVar.toString() : null;
        this.f31221c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28476a() {
        return this.f31220b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28477b() {
        return this.f31219a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28478c() {
        return this.f31221c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo28479d() {
        return this.f31222d;
    }

    public String toString() {
        return "InvitationReason{stickyMode='" + this.f31219a + '\'' + ", reason='" + this.f31220b + '\'' + ", actionButtonsEnabled='" + this.f31221c + '\'' + ", isDeferred='" + this.f31222d + '\'' + '}';
    }

    C10880i3(C10883c cVar, C10882b bVar, boolean z) {
        this.f31220b = bVar.toString();
        this.f31219a = cVar != null ? cVar.toString() : null;
        this.f31221c = z;
        this.f31222d = true;
    }

    C10880i3(C10883c cVar, boolean z) {
        this.f31219a = cVar != null ? cVar.toString() : null;
        this.f31221c = z;
    }
}
