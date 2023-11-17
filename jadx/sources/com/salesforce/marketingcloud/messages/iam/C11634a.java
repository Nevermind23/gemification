package com.salesforce.marketingcloud.messages.iam;

import android.os.CountDownTimer;

/* renamed from: com.salesforce.marketingcloud.messages.iam.a */
abstract class C11634a extends CountDownTimer {

    /* renamed from: a */
    private long f33742a;

    /* renamed from: b */
    private long f33743b;

    C11634a(long j, long j2) {
        super(j - j2, 500);
        this.f33743b = j;
    }

    /* renamed from: a */
    public long mo30670a() {
        return this.f33743b - this.f33742a;
    }

    public void onFinish() {
        this.f33742a = 0;
    }

    public final void onTick(long j) {
        this.f33742a = j;
    }
}
