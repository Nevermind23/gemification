package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import com.medallia.digital.mobilesdk.C10749b8;
import com.salesforce.marketingcloud.storage.C11800j;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.alarms.a */
public abstract class C11307a {

    /* renamed from: a */
    private final String f32918a;

    /* renamed from: b */
    private final long f32919b;

    /* renamed from: c */
    private final double f32920c;

    /* renamed from: d */
    private final long f32921d;

    /* renamed from: e */
    private final String f32922e;

    /* renamed from: f */
    private final int f32923f;

    /* renamed from: g */
    private final boolean f32924g;

    /* renamed from: com.salesforce.marketingcloud.alarms.a$b */
    public enum C11309b {
        REGISTRATION(909100) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11325i(mo29667b());
            }
        },
        ET_ANALYTICS(909102) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11319c(mo29667b());
            }
        },
        FETCH_REGION_MESSAGES_DAILY(909111) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11322f(mo29667b());
            }
        },
        FETCH_PUSH_TOKEN(909108) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11324h(mo29667b());
            }
        },
        UPDATE_INBOX_MESSAGE_STATUS(909110) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11326j(mo29667b());
            }
        },
        SYNC(909112) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11323g(mo29667b());
            }
        },
        IAM_IMAGE_BATCH(909113) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11321e(mo29667b());
            }
        },
        DEVICE_STATS(909114) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C11307a mo29665a() {
                return new C11320d(mo29667b());
            }
        };
        

        /* renamed from: a */
        private final int f32934a;

        /* renamed from: com.salesforce.marketingcloud.alarms.a$b$i */
        static class C11318i {

            /* renamed from: a */
            static final int f32935a = 909114;

            /* renamed from: b */
            static final int f32936b = 909113;

            /* renamed from: c */
            static final int f32937c = 909112;

            /* renamed from: d */
            static final int f32938d = 909110;

            /* renamed from: e */
            static final int f32939e = 909109;

            /* renamed from: f */
            static final int f32940f = 909108;

            /* renamed from: g */
            static final int f32941g = 909111;

            /* renamed from: h */
            static final int f32942h = 909102;

            /* renamed from: i */
            static final int f32943i = 909101;

            /* renamed from: j */
            static final int f32944j = 909100;

            C11318i() {
            }
        }

        private C11309b(int i) {
            this.f32934a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract C11307a mo29665a();

        /* access modifiers changed from: protected */
        @Deprecated
        /* renamed from: a */
        public boolean mo29666a(C11800j jVar) {
            return true;
        }

        /* renamed from: b */
        public int mo29667b() {
            return this.f32934a;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$c */
    private static final class C11319c extends C11307a {
        C11319c(int i) {
            this(i, "et_etanalytic_alarm_created_date", "et_etanalytic_next_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, true);
        }

        private C11319c(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$d */
    private static final class C11320d extends C11307a {
        C11320d(int i) {
            super(i, "et_device_stats_alarm_created_date", "et_device_stats_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, false);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$e */
    private static final class C11321e extends C11307a {
        C11321e(int i) {
            super(i, "et_iam_image_cache_route_alarm_created_date", "et_iam_image_cache_route_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, false);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$f */
    private static final class C11322f extends C11307a {
        C11322f(int i) {
            this(i, "et_fetch_background_beacon_messages_alarm_created_date", "et_fetch_background_beacon_messages_next_alarm_interval", 86400000, 1.0d, 86400000, false);
        }

        private C11322f(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$g */
    private static final class C11323g extends C11307a {
        C11323g(int i) {
            super(i, "et_sync_route_alarm_created_date", "et_sync_route_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, false);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$h */
    private static final class C11324h extends C11307a {
        C11324h(int i) {
            this(i, "et_register_for_remote_notifications_alarm_created_date", "et_register_for_remote_notifications_next_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, false);
        }

        private C11324h(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$i */
    private static final class C11325i extends C11307a {
        C11325i(int i) {
            this(i, "et_registration_alarm_created_date", "et_registration_next_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, false);
        }

        private C11325i(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.a$j */
    private static final class C11326j extends C11307a {
        C11326j(int i) {
            this(i, "et_update_inbox_message_status_alarm_created_date", "et_update_inbox_message_status_next_alarm_interval", C10749b8.C10751b.f30743b, 2.0d, 86400000, true);
        }

        private C11326j(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    C11307a(int i, String str, String str2, long j, double d, long j2, boolean z) {
        this.f32923f = i;
        this.f32922e = str;
        this.f32918a = str2;
        this.f32919b = j;
        this.f32920c = d;
        this.f32921d = j2;
        this.f32924g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo29658a() {
        return this.f32922e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo29659b() {
        return this.f32923f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo29660c() {
        return this.f32918a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo29661d() {
        return this.f32919b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final double mo29662e() {
        return this.f32920c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo29663f() {
        return this.f32921d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo29664g() {
        return this.f32924g;
    }
}
