package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.C5320e;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C5345n0();

    /* renamed from: d */
    Bundle f16963d;

    /* renamed from: e */
    private Map f16964e;

    /* renamed from: f */
    private C5301b f16965f;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    public static class C5301b {

        /* renamed from: a */
        private final String f16966a;

        /* renamed from: b */
        private final String f16967b;

        /* renamed from: c */
        private final String[] f16968c;

        /* renamed from: d */
        private final String f16969d;

        /* renamed from: e */
        private final String f16970e;

        /* renamed from: f */
        private final String[] f16971f;

        /* renamed from: g */
        private final String f16972g;

        /* renamed from: h */
        private final String f16973h;

        /* renamed from: i */
        private final String f16974i;

        /* renamed from: j */
        private final String f16975j;

        /* renamed from: k */
        private final String f16976k;

        /* renamed from: l */
        private final String f16977l;

        /* renamed from: m */
        private final String f16978m;

        /* renamed from: n */
        private final Uri f16979n;

        /* renamed from: o */
        private final String f16980o;

        /* renamed from: p */
        private final Integer f16981p;

        /* renamed from: q */
        private final Integer f16982q;

        /* renamed from: r */
        private final Integer f16983r;

        /* renamed from: s */
        private final int[] f16984s;

        /* renamed from: t */
        private final Long f16985t;

        /* renamed from: u */
        private final boolean f16986u;

        /* renamed from: v */
        private final boolean f16987v;

        /* renamed from: w */
        private final boolean f16988w;

        /* renamed from: x */
        private final boolean f16989x;

        /* renamed from: y */
        private final boolean f16990y;

        /* renamed from: z */
        private final long[] f16991z;

        /* renamed from: b */
        private static String[] m20964b(C5328g0 g0Var, String str) {
            Object[] g = g0Var.mo17586g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String mo17549a() {
            return this.f16969d;
        }

        /* renamed from: c */
        public String mo17550c() {
            return this.f16966a;
        }

        private C5301b(C5328g0 g0Var) {
            this.f16966a = g0Var.mo17595p("gcm.n.title");
            this.f16967b = g0Var.mo17587h("gcm.n.title");
            this.f16968c = m20964b(g0Var, "gcm.n.title");
            this.f16969d = g0Var.mo17595p("gcm.n.body");
            this.f16970e = g0Var.mo17587h("gcm.n.body");
            this.f16971f = m20964b(g0Var, "gcm.n.body");
            this.f16972g = g0Var.mo17595p("gcm.n.icon");
            this.f16974i = g0Var.mo17594o();
            this.f16975j = g0Var.mo17595p("gcm.n.tag");
            this.f16976k = g0Var.mo17595p("gcm.n.color");
            this.f16977l = g0Var.mo17595p("gcm.n.click_action");
            this.f16978m = g0Var.mo17595p("gcm.n.android_channel_id");
            this.f16979n = g0Var.mo17585f();
            this.f16973h = g0Var.mo17595p("gcm.n.image");
            this.f16980o = g0Var.mo17595p("gcm.n.ticker");
            this.f16981p = g0Var.mo17582b("gcm.n.notification_priority");
            this.f16982q = g0Var.mo17582b("gcm.n.visibility");
            this.f16983r = g0Var.mo17582b("gcm.n.notification_count");
            this.f16986u = g0Var.mo17581a("gcm.n.sticky");
            this.f16987v = g0Var.mo17581a("gcm.n.local_only");
            this.f16988w = g0Var.mo17581a("gcm.n.default_sound");
            this.f16989x = g0Var.mo17581a("gcm.n.default_vibrate_timings");
            this.f16990y = g0Var.mo17581a("gcm.n.default_light_settings");
            this.f16985t = g0Var.mo17589j("gcm.n.event_time");
            this.f16984s = g0Var.mo17584e();
            this.f16991z = g0Var.mo17596q();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f16963d = bundle;
    }

    /* renamed from: v */
    public Map mo17546v() {
        if (this.f16964e == null) {
            this.f16964e = C5320e.C5321a.m21029a(this.f16963d);
        }
        return this.f16964e;
    }

    /* renamed from: w */
    public C5301b mo17547w() {
        if (this.f16965f == null && C5328g0.m21073t(this.f16963d)) {
            this.f16965f = new C5301b(new C5328g0(this.f16963d));
        }
        return this.f16965f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C5345n0.m21146c(this, parcel, i);
    }
}
