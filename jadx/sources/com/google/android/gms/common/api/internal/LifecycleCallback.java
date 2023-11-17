package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p156l6.C6940f;
import p156l6.C6942g;
import p156l6.C6963q0;
import p156l6.C6967s0;
import p182n6.C7264i;

public class LifecycleCallback {

    /* renamed from: d */
    protected final C6942g f12316d;

    protected LifecycleCallback(C6942g gVar) {
        this.f12316d = gVar;
    }

    /* renamed from: c */
    public static C6942g m14577c(Activity activity) {
        return m14578d(new C6940f(activity));
    }

    /* renamed from: d */
    protected static C6942g m14578d(C6940f fVar) {
        if (fVar.mo21084d()) {
            return C6967s0.m26986j1(fVar.mo21082b());
        }
        if (fVar.mo21083c()) {
            return C6963q0.m26972c(fVar.mo21081a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C6942g getChimeraLifecycleFragmentImpl(C6940f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo11982a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity mo11983b() {
        Activity D0 = this.f12316d.mo21085D0();
        C7264i.m27902k(D0);
        return D0;
    }

    /* renamed from: e */
    public void mo11984e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo11985f(Bundle bundle) {
    }

    /* renamed from: g */
    public void mo11986g() {
    }

    /* renamed from: h */
    public void mo11987h() {
    }

    /* renamed from: i */
    public void mo11988i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo11989j() {
    }

    /* renamed from: k */
    public void mo11990k() {
    }
}
