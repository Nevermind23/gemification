package p256t2;

import com.apollographql.apollo.api.internal.json.JsonDataException;
import dg1.C40677c;
import java.io.Closeable;
import java.io.Flushable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t2.f */
public abstract class C8341f implements Closeable, Flushable {

    /* renamed from: k */
    public static final C8342a f23740k = new C8342a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private int f23741d;

    /* renamed from: e */
    private final int[] f23742e = new int[32];

    /* renamed from: f */
    private final String[] f23743f = new String[32];

    /* renamed from: g */
    private final int[] f23744g = new int[32];

    /* renamed from: h */
    private String f23745h;

    /* renamed from: i */
    private boolean f23746i;

    /* renamed from: j */
    private boolean f23747j;

    /* renamed from: t2.f$a */
    public static final class C8342a {
        private C8342a() {
        }

        public /* synthetic */ C8342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8341f mo23535a(C40677c cVar) {
            C41536l.m120490j(cVar, "sink");
            return new C8339e(cVar);
        }
    }

    /* renamed from: U */
    public static final C8341f m31358U(C40677c cVar) {
        return f23740k.mo23535a(cVar);
    }

    /* renamed from: Q */
    public abstract C8341f mo23508Q(String str);

    /* renamed from: R */
    public abstract C8341f mo23509R();

    /* renamed from: a */
    public abstract C8341f mo23510a();

    /* renamed from: a0 */
    public final int mo23522a0() {
        boolean z;
        int i = this.f23741d;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f23742e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    /* renamed from: e0 */
    public final void mo23523e0(int i) {
        int i2 = this.f23741d;
        int[] iArr = this.f23742e;
        if (i2 != iArr.length) {
            this.f23741d = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new JsonDataException("Nesting too deep at " + mo23534z() + ": circular reference?");
    }

    /* renamed from: f0 */
    public final void mo23524f0(int i) {
        this.f23742e[this.f23741d - 1] = i;
    }

    /* renamed from: h0 */
    public final void mo23525h0(boolean z) {
        this.f23747j = z;
    }

    /* renamed from: k */
    public abstract C8341f mo23513k();

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final void mo23526m0(int i) {
        this.f23741d = i;
    }

    /* renamed from: n */
    public abstract C8341f mo23514n();

    /* renamed from: n0 */
    public abstract C8341f mo23515n0(long j);

    /* renamed from: o */
    public abstract C8341f mo23516o();

    /* renamed from: o0 */
    public abstract C8341f mo23517o0(Boolean bool);

    /* renamed from: p0 */
    public abstract C8341f mo23518p0(Number number);

    /* renamed from: q */
    public final String mo23527q() {
        return this.f23745h;
    }

    /* renamed from: q0 */
    public abstract C8341f mo23519q0(String str);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int[] mo23528s() {
        return this.f23744g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String[] mo23529t() {
        return this.f23743f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int[] mo23530u() {
        return this.f23742e;
    }

    /* renamed from: v */
    public final boolean mo23531v() {
        return this.f23747j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo23532w() {
        return this.f23741d;
    }

    /* renamed from: x */
    public final boolean mo23533x() {
        return this.f23746i;
    }

    /* renamed from: y */
    public abstract C8341f mo23520y(String str);

    /* renamed from: z */
    public final String mo23534z() {
        return C8338d.f23735a.mo23506a(this.f23741d, this.f23742e, this.f23743f, this.f23744g);
    }
}
