package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.x4 */
final class C11203x4 {

    /* renamed from: b */
    private static C11203x4 f32238b;

    /* renamed from: a */
    protected ArrayList<C11173w4> f32239a = new ArrayList<>();

    C11203x4() {
    }

    /* renamed from: a */
    protected static C11203x4 m41093a() {
        if (f32238b == null) {
            f32238b = new C11203x4();
        }
        return f32238b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ArrayList<C11173w4> mo29194b() {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.MediaFeedback, new Object[0]);
        this.f32239a = c;
        if (c != null) {
            return c;
        }
        return null;
    }
}
