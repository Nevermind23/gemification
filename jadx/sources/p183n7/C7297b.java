package p183n7;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.location.zzbj;
import p182n6.C7264i;
import p260t6.C8407i;

/* renamed from: n7.b */
public interface C7297b {

    /* renamed from: n7.b$a */
    public static final class C7298a {

        /* renamed from: a */
        private String f21493a = null;

        /* renamed from: b */
        private int f21494b = 0;

        /* renamed from: c */
        private long f21495c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f21496d = -1;

        /* renamed from: e */
        private double f21497e;

        /* renamed from: f */
        private double f21498f;

        /* renamed from: g */
        private float f21499g;

        /* renamed from: h */
        private int f21500h = 0;

        /* renamed from: i */
        private int f21501i = -1;

        /* renamed from: a */
        public C7297b mo21676a() {
            if (this.f21493a != null) {
                int i = this.f21494b;
                if (i == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i & 4) != 0 && this.f21501i < 0) {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                } else if (this.f21495c == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f21496d == -1) {
                    throw new IllegalArgumentException("Geofence region not set.");
                } else if (this.f21500h >= 0) {
                    return new zzbj(this.f21493a, this.f21494b, 1, this.f21497e, this.f21498f, this.f21499g, this.f21495c, this.f21500h, this.f21501i);
                } else {
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        /* renamed from: b */
        public C7298a mo21677b(double d, double d2, float f) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (d < -90.0d || d > 90.0d) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            C7264i.m27893b(z, sb.toString());
            if (d2 < -180.0d || d2 > 180.0d) {
                z2 = false;
            } else {
                z2 = true;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            C7264i.m27893b(z2, sb2.toString());
            if (f > Utils.FLOAT_EPSILON) {
                z3 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            C7264i.m27893b(z3, sb3.toString());
            this.f21496d = 1;
            this.f21497e = d;
            this.f21498f = d2;
            this.f21499g = f;
            return this;
        }

        /* renamed from: c */
        public C7298a mo21678c(long j) {
            if (j < 0) {
                this.f21495c = -1;
            } else {
                this.f21495c = C8407i.m31544d().mo23596c() + j;
            }
            return this;
        }

        /* renamed from: d */
        public C7298a mo21679d(String str) {
            this.f21493a = (String) C7264i.m27903l(str, "Request ID can't be set to null");
            return this;
        }

        /* renamed from: e */
        public C7298a mo21680e(int i) {
            this.f21494b = i;
            return this;
        }
    }

    /* renamed from: k */
    String mo12826k();
}
