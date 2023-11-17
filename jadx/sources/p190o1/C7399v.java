package p190o1;

import android.support.p013v4.media.session.C0125b;
import androidx.work.C1949a;
import androidx.work.C1954c;
import androidx.work.C1959e;
import androidx.work.C2073m;
import androidx.work.C2085q;
import androidx.work.C2093w;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p123j.C6631a;

/* renamed from: o1.v */
public final class C7399v {

    /* renamed from: u */
    public static final C7400a f21627u = new C7400a((DefaultConstructorMarker) null);

    /* renamed from: v */
    private static final String f21628v;

    /* renamed from: w */
    public static final C6631a f21629w = new C7398u();

    /* renamed from: a */
    public final String f21630a;

    /* renamed from: b */
    public C2093w f21631b;

    /* renamed from: c */
    public String f21632c;

    /* renamed from: d */
    public String f21633d;

    /* renamed from: e */
    public C1959e f21634e;

    /* renamed from: f */
    public C1959e f21635f;

    /* renamed from: g */
    public long f21636g;

    /* renamed from: h */
    public long f21637h;

    /* renamed from: i */
    public long f21638i;

    /* renamed from: j */
    public C1954c f21639j;

    /* renamed from: k */
    public int f21640k;

    /* renamed from: l */
    public C1949a f21641l;

    /* renamed from: m */
    public long f21642m;

    /* renamed from: n */
    public long f21643n;

    /* renamed from: o */
    public long f21644o;

    /* renamed from: p */
    public long f21645p;

    /* renamed from: q */
    public boolean f21646q;

    /* renamed from: r */
    public C2085q f21647r;

    /* renamed from: s */
    private int f21648s;

    /* renamed from: t */
    private final int f21649t;

    /* renamed from: o1.v$a */
    public static final class C7400a {
        private C7400a() {
        }

        public /* synthetic */ C7400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o1.v$b */
    public static final class C7401b {

        /* renamed from: a */
        public String f21650a;

        /* renamed from: b */
        public C2093w f21651b;

        public C7401b(String str, C2093w wVar) {
            C41536l.m120489i(str, "id");
            C41536l.m120489i(wVar, "state");
            this.f21650a = str;
            this.f21651b = wVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7401b)) {
                return false;
            }
            C7401b bVar = (C7401b) obj;
            return C41536l.m120484d(this.f21650a, bVar.f21650a) && this.f21651b == bVar.f21651b;
        }

        public int hashCode() {
            return (this.f21650a.hashCode() * 31) + this.f21651b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f21650a + ", state=" + this.f21651b + ')';
        }
    }

    static {
        String i = C2073m.m8073i("WorkSpec");
        C41536l.m120488h(i, "tagWithPrefix(\"WorkSpec\")");
        f21628v = i;
    }

    public C7399v(String str, C2093w wVar, String str2, String str3, C1959e eVar, C1959e eVar2, long j, long j2, long j3, C1954c cVar, int i, C1949a aVar, long j4, long j5, long j6, long j7, boolean z, C2085q qVar, int i2, int i3) {
        C1959e eVar3 = eVar2;
        C1954c cVar2 = cVar;
        C1949a aVar2 = aVar;
        C2085q qVar2 = qVar;
        C41536l.m120489i(str, "id");
        C41536l.m120489i(wVar, "state");
        C41536l.m120489i(str2, "workerClassName");
        C41536l.m120489i(eVar, "input");
        C41536l.m120489i(eVar3, "output");
        C41536l.m120489i(cVar2, "constraints");
        C41536l.m120489i(aVar2, "backoffPolicy");
        C41536l.m120489i(qVar2, "outOfQuotaPolicy");
        this.f21630a = str;
        this.f21631b = wVar;
        this.f21632c = str2;
        this.f21633d = str3;
        this.f21634e = eVar;
        this.f21635f = eVar3;
        this.f21636g = j;
        this.f21637h = j2;
        this.f21638i = j3;
        this.f21639j = cVar2;
        this.f21640k = i;
        this.f21641l = aVar2;
        this.f21642m = j4;
        this.f21643n = j5;
        this.f21644o = j6;
        this.f21645p = j7;
        this.f21646q = z;
        this.f21647r = qVar2;
        this.f21648s = i2;
        this.f21649t = i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m28150b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: e */
    public static /* synthetic */ C7399v m28151e(C7399v vVar, String str, C2093w wVar, String str2, String str3, C1959e eVar, C1959e eVar2, long j, long j2, long j3, C1954c cVar, int i, C1949a aVar, long j4, long j5, long j6, long j7, boolean z, C2085q qVar, int i2, int i3, int i4, Object obj) {
        C7399v vVar2 = vVar;
        int i5 = i4;
        return vVar.mo21786d((i5 & 1) != 0 ? vVar2.f21630a : str, (i5 & 2) != 0 ? vVar2.f21631b : wVar, (i5 & 4) != 0 ? vVar2.f21632c : str2, (i5 & 8) != 0 ? vVar2.f21633d : str3, (i5 & 16) != 0 ? vVar2.f21634e : eVar, (i5 & 32) != 0 ? vVar2.f21635f : eVar2, (i5 & 64) != 0 ? vVar2.f21636g : j, (i5 & 128) != 0 ? vVar2.f21637h : j2, (i5 & C11398b.f33139r) != 0 ? vVar2.f21638i : j3, (i5 & C11398b.f33140s) != 0 ? vVar2.f21639j : cVar, (i5 & C11398b.f33141t) != 0 ? vVar2.f21640k : i, (i5 & C11398b.f33142u) != 0 ? vVar2.f21641l : aVar, (i5 & C11398b.f33143v) != 0 ? vVar2.f21642m : j4, (i5 & 8192) != 0 ? vVar2.f21643n : j5, (i5 & 16384) != 0 ? vVar2.f21644o : j6, (i5 & 32768) != 0 ? vVar2.f21645p : j7, (i5 & 65536) != 0 ? vVar2.f21646q : z, (131072 & i5) != 0 ? vVar2.f21647r : qVar, (i5 & 262144) != 0 ? vVar2.f21648s : i2, (i5 & 524288) != 0 ? vVar2.f21649t : i3);
    }

    /* renamed from: c */
    public final long mo21785c() {
        long j;
        boolean z = false;
        if (mo21792i()) {
            if (this.f21641l == C1949a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f21642m * ((long) this.f21640k);
            } else {
                j = (long) Math.scalb((float) this.f21642m, this.f21640k - 1);
            }
            return this.f21643n + C43429k.m124589h(j, 18000000);
        }
        long j2 = 0;
        if (mo21793j()) {
            int i = this.f21648s;
            long j3 = this.f21643n;
            if (i == 0) {
                j3 += this.f21636g;
            }
            long j4 = this.f21638i;
            long j5 = this.f21637h;
            if (j4 != j5) {
                z = true;
            }
            if (z) {
                if (i == 0) {
                    j2 = ((long) -1) * j4;
                }
                j3 += j5;
            } else if (i != 0) {
                j2 = j5;
            }
            return j3 + j2;
        }
        long j6 = this.f21643n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return this.f21636g + j6;
    }

    /* renamed from: d */
    public final C7399v mo21786d(String str, C2093w wVar, String str2, String str3, C1959e eVar, C1959e eVar2, long j, long j2, long j3, C1954c cVar, int i, C1949a aVar, long j4, long j5, long j6, long j7, boolean z, C2085q qVar, int i2, int i3) {
        String str4 = str;
        C41536l.m120489i(str4, "id");
        C41536l.m120489i(wVar, "state");
        C41536l.m120489i(str2, "workerClassName");
        C41536l.m120489i(eVar, "input");
        C41536l.m120489i(eVar2, "output");
        C41536l.m120489i(cVar, "constraints");
        C41536l.m120489i(aVar, "backoffPolicy");
        C41536l.m120489i(qVar, "outOfQuotaPolicy");
        return new C7399v(str4, wVar, str2, str3, eVar, eVar2, j, j2, j3, cVar, i, aVar, j4, j5, j6, j7, z, qVar, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7399v)) {
            return false;
        }
        C7399v vVar = (C7399v) obj;
        return C41536l.m120484d(this.f21630a, vVar.f21630a) && this.f21631b == vVar.f21631b && C41536l.m120484d(this.f21632c, vVar.f21632c) && C41536l.m120484d(this.f21633d, vVar.f21633d) && C41536l.m120484d(this.f21634e, vVar.f21634e) && C41536l.m120484d(this.f21635f, vVar.f21635f) && this.f21636g == vVar.f21636g && this.f21637h == vVar.f21637h && this.f21638i == vVar.f21638i && C41536l.m120484d(this.f21639j, vVar.f21639j) && this.f21640k == vVar.f21640k && this.f21641l == vVar.f21641l && this.f21642m == vVar.f21642m && this.f21643n == vVar.f21643n && this.f21644o == vVar.f21644o && this.f21645p == vVar.f21645p && this.f21646q == vVar.f21646q && this.f21647r == vVar.f21647r && this.f21648s == vVar.f21648s && this.f21649t == vVar.f21649t;
    }

    /* renamed from: f */
    public final int mo21788f() {
        return this.f21649t;
    }

    /* renamed from: g */
    public final int mo21789g() {
        return this.f21648s;
    }

    /* renamed from: h */
    public final boolean mo21790h() {
        return !C41536l.m120484d(C1954c.f5912j, this.f21639j);
    }

    public int hashCode() {
        int hashCode = ((((this.f21630a.hashCode() * 31) + this.f21631b.hashCode()) * 31) + this.f21632c.hashCode()) * 31;
        String str = this.f21633d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21634e.hashCode()) * 31) + this.f21635f.hashCode()) * 31) + C7397t.m28148a(this.f21636g)) * 31) + C7397t.m28148a(this.f21637h)) * 31) + C7397t.m28148a(this.f21638i)) * 31) + this.f21639j.hashCode()) * 31) + this.f21640k) * 31) + this.f21641l.hashCode()) * 31) + C7397t.m28148a(this.f21642m)) * 31) + C7397t.m28148a(this.f21643n)) * 31) + C7397t.m28148a(this.f21644o)) * 31) + C7397t.m28148a(this.f21645p)) * 31;
        boolean z = this.f21646q;
        if (z) {
            z = true;
        }
        return ((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f21647r.hashCode()) * 31) + this.f21648s) * 31) + this.f21649t;
    }

    /* renamed from: i */
    public final boolean mo21792i() {
        return this.f21631b == C2093w.ENQUEUED && this.f21640k > 0;
    }

    /* renamed from: j */
    public final boolean mo21793j() {
        return this.f21637h != 0;
    }

    /* renamed from: k */
    public final void mo21794k(long j) {
        if (j < 900000) {
            C2073m.m8071e().mo6966k(f21628v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        mo21795l(C43429k.m124586e(j, 900000), C43429k.m124586e(j, 900000));
    }

    /* renamed from: l */
    public final void mo21795l(long j, long j2) {
        if (j < 900000) {
            C2073m.m8071e().mo6966k(f21628v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f21637h = C43429k.m124586e(j, 900000);
        if (j2 < 300000) {
            C2073m.m8071e().mo6966k(f21628v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.f21637h) {
            C2073m e = C2073m.m8071e();
            String str = f21628v;
            e.mo6966k(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.f21638i = C43429k.m124591j(j2, 300000, this.f21637h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f21630a + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C7399v(java.lang.String r31, androidx.work.C2093w r32, java.lang.String r33, java.lang.String r34, androidx.work.C1959e r35, androidx.work.C1959e r36, long r37, long r39, long r41, androidx.work.C1954c r43, int r44, androidx.work.C1949a r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.C2085q r55, int r56, int r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            r30 = this;
            r0 = r58
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.w r1 = androidx.work.C2093w.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0022
            androidx.work.e r1 = androidx.work.C1959e.f5932c
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r35
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            androidx.work.e r1 = androidx.work.C1959e.f5932c
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r8 = r1
            goto L_0x0031
        L_0x002f:
            r8 = r36
        L_0x0031:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r9 = r2
            goto L_0x003b
        L_0x0039:
            r9 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r39
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r41
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            androidx.work.c r1 = androidx.work.C1954c.f5912j
            r15 = r1
            goto L_0x0055
        L_0x0053:
            r15 = r43
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005d
            r16 = r5
            goto L_0x005f
        L_0x005d:
            r16 = r44
        L_0x005f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            androidx.work.a r1 = androidx.work.C1949a.EXPONENTIAL
            r17 = r1
            goto L_0x006a
        L_0x0068:
            r17 = r45
        L_0x006a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0071
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0073
        L_0x0071:
            r18 = r46
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r48
        L_0x007c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0083
            r22 = r2
            goto L_0x0085
        L_0x0083:
            r22 = r50
        L_0x0085:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r1 = -1
            r24 = r1
            goto L_0x0092
        L_0x0090:
            r24 = r52
        L_0x0092:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r5
            goto L_0x009c
        L_0x009a:
            r26 = r54
        L_0x009c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            androidx.work.q r1 = androidx.work.C2085q.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r27 = r1
            goto L_0x00a8
        L_0x00a6:
            r27 = r55
        L_0x00a8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b0
            r28 = r5
            goto L_0x00b2
        L_0x00b0:
            r28 = r56
        L_0x00b2:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ba
            r29 = r5
            goto L_0x00bc
        L_0x00ba:
            r29 = r57
        L_0x00bc:
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C7399v.<init>(java.lang.String, androidx.work.w, java.lang.String, java.lang.String, androidx.work.e, androidx.work.e, long, long, long, androidx.work.c, int, androidx.work.a, long, long, long, long, boolean, androidx.work.q, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7399v(String str, String str2) {
        this(str, (C2093w) null, str2, (String) null, (C1959e) null, (C1959e) null, 0, 0, 0, (C1954c) null, 0, (C1949a) null, 0, 0, 0, 0, false, (C2085q) null, 0, 0, 1048570, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7399v(java.lang.String r34, p190o1.C7399v r35) {
        /*
            r33 = this;
            r0 = r35
            r1 = r33
            r2 = r34
            java.lang.String r3 = "newId"
            r4 = r34
            kotlin.jvm.internal.C41536l.m120489i(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.C41536l.m120489i(r0, r3)
            java.lang.String r4 = r0.f21632c
            androidx.work.w r3 = r0.f21631b
            java.lang.String r5 = r0.f21633d
            androidx.work.e r7 = new androidx.work.e
            r6 = r7
            androidx.work.e r8 = r0.f21634e
            r7.<init>((androidx.work.C1959e) r8)
            androidx.work.e r8 = new androidx.work.e
            r7 = r8
            androidx.work.e r9 = r0.f21635f
            r8.<init>((androidx.work.C1959e) r9)
            long r8 = r0.f21636g
            long r10 = r0.f21637h
            long r12 = r0.f21638i
            androidx.work.c r15 = new androidx.work.c
            r14 = r15
            r31 = r1
            androidx.work.c r1 = r0.f21639j
            r15.<init>(r1)
            int r15 = r0.f21640k
            androidx.work.a r1 = r0.f21641l
            r16 = r1
            r32 = r2
            long r1 = r0.f21642m
            r17 = r1
            long r1 = r0.f21643n
            r19 = r1
            long r1 = r0.f21644o
            r21 = r1
            long r1 = r0.f21645p
            r23 = r1
            boolean r1 = r0.f21646q
            r25 = r1
            androidx.work.q r1 = r0.f21647r
            r26 = r1
            int r0 = r0.f21648s
            r27 = r0
            r28 = 0
            r29 = 524288(0x80000, float:7.34684E-40)
            r30 = 0
            r1 = r31
            r2 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C7399v.<init>(java.lang.String, o1.v):void");
    }
}
