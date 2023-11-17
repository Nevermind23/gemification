package p585re;

import android.content.Context;
import com.threatmetrix.TrustDefender.C11893e;
import java.util.concurrent.TimeUnit;

/* renamed from: re.a */
public class C17584a {

    /* renamed from: s */
    public static final int f49136s;

    /* renamed from: t */
    public static final int f49137t;

    /* renamed from: u */
    public static final int f49138u;

    /* renamed from: v */
    private static final int f49139v;

    /* renamed from: w */
    private static final long f49140w;

    /* renamed from: x */
    private static final long f49141x;

    /* renamed from: a */
    private int f49142a;

    /* renamed from: b */
    private boolean f49143b = false;

    /* renamed from: c */
    private int f49144c;

    /* renamed from: d */
    private boolean f49145d;

    /* renamed from: e */
    private int f49146e;

    /* renamed from: f */
    private int f49147f;

    /* renamed from: g */
    private long f49148g;

    /* renamed from: h */
    private long f49149h;

    /* renamed from: i */
    private long f49150i;

    /* renamed from: j */
    private boolean f49151j;

    /* renamed from: k */
    private boolean f49152k;

    /* renamed from: l */
    private boolean f49153l;

    /* renamed from: m */
    private String f49154m;

    /* renamed from: n */
    private String f49155n;

    /* renamed from: o */
    private String f49156o;

    /* renamed from: p */
    private Context f49157p;

    /* renamed from: q */
    private C11893e f49158q;

    /* renamed from: r */
    private int f49159r;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f49136s = (int) timeUnit.toMillis(30);
        f49137t = (int) timeUnit.toMillis(3);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f49138u = (int) timeUnit2.toMillis(30);
        f49139v = (int) timeUnit2.toMillis(30);
        f49140w = timeUnit.toMillis(15);
        f49141x = timeUnit.toMillis(60);
    }

    public C17584a() {
        int i = f49139v;
        this.f49142a = i;
        this.f49144c = i;
        this.f49145d = false;
        this.f49146e = f49137t;
        this.f49147f = 1;
        this.f49148g = 66995442502598142L;
        this.f49149h = f49140w;
        this.f49150i = f49141x;
        this.f49151j = false;
        this.f49152k = false;
        this.f49153l = false;
        this.f49154m = null;
        this.f49155n = "h-sdk.online-metrix.net";
        this.f49156o = null;
        this.f49157p = null;
        this.f49158q = null;
        this.f49159r = f49138u;
    }

    /* renamed from: a */
    public int mo45116a() {
        return this.f49144c;
    }

    /* renamed from: b */
    public boolean mo45117b() {
        return this.f49145d;
    }

    /* renamed from: c */
    public int mo45118c() {
        return this.f49147f;
    }

    /* renamed from: d */
    public boolean mo45119d() {
        return this.f49151j;
    }

    /* renamed from: e */
    public String mo45120e() {
        return this.f49154m;
    }

    /* renamed from: f */
    public long mo45121f() {
        long j = this.f49148g;
        return this.f49153l ? j & -12289 : j;
    }

    /* renamed from: g */
    public boolean mo45122g() {
        return this.f49143b;
    }

    /* renamed from: h */
    public long mo45123h() {
        return this.f49150i;
    }

    /* renamed from: i */
    public C11893e mo45124i() {
        return this.f49158q;
    }

    /* renamed from: j */
    public String mo45125j() {
        return this.f49156o;
    }

    /* renamed from: k */
    public boolean mo45126k() {
        return this.f49152k;
    }

    /* renamed from: l */
    public int mo45127l() {
        return this.f49142a;
    }

    /* renamed from: m */
    public int mo45128m() {
        return this.f49146e;
    }

    /* renamed from: n */
    public long mo45129n() {
        return this.f49149h;
    }

    /* renamed from: o */
    public C17603t mo45130o() {
        Context context = this.f49157p;
        if (context == null) {
            return null;
        }
        return new C17603t(context.getApplicationContext());
    }

    /* renamed from: p */
    public String mo45131p() {
        return this.f49155n;
    }

    /* renamed from: q */
    public int mo45132q() {
        return this.f49159r;
    }

    /* renamed from: r */
    public C17584a mo45133r(Context context) {
        this.f49157p = context;
        return this;
    }

    /* renamed from: s */
    public C17584a mo45134s(String str) {
        this.f49155n = str;
        return this;
    }

    /* renamed from: t */
    public C17584a mo45135t(String str) {
        this.f49156o = str;
        return this;
    }

    /* renamed from: u */
    public C17584a mo45136u(int i, TimeUnit timeUnit) {
        this.f49159r = (int) timeUnit.toMillis((long) i);
        return this;
    }

    /* renamed from: v */
    public C17584a mo45137v(C11893e eVar) {
        this.f49158q = eVar;
        return this;
    }
}
