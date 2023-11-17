package p200ob;

import java.util.List;

/* renamed from: ob.e */
public final class C7511e {

    /* renamed from: a */
    private final byte[] f21912a;

    /* renamed from: b */
    private int f21913b;

    /* renamed from: c */
    private final String f21914c;

    /* renamed from: d */
    private final List f21915d;

    /* renamed from: e */
    private final String f21916e;

    /* renamed from: f */
    private Integer f21917f;

    /* renamed from: g */
    private Integer f21918g;

    /* renamed from: h */
    private Object f21919h;

    /* renamed from: i */
    private final int f21920i;

    /* renamed from: j */
    private final int f21921j;

    public C7511e(byte[] bArr, String str, List list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List mo21994a() {
        return this.f21915d;
    }

    /* renamed from: b */
    public String mo21995b() {
        return this.f21916e;
    }

    /* renamed from: c */
    public int mo21996c() {
        return this.f21913b;
    }

    /* renamed from: d */
    public Object mo21997d() {
        return this.f21919h;
    }

    /* renamed from: e */
    public byte[] mo21998e() {
        return this.f21912a;
    }

    /* renamed from: f */
    public int mo21999f() {
        return this.f21920i;
    }

    /* renamed from: g */
    public int mo22000g() {
        return this.f21921j;
    }

    /* renamed from: h */
    public String mo22001h() {
        return this.f21914c;
    }

    /* renamed from: i */
    public boolean mo22002i() {
        return this.f21920i >= 0 && this.f21921j >= 0;
    }

    /* renamed from: j */
    public void mo22003j(Integer num) {
        this.f21918g = num;
    }

    /* renamed from: k */
    public void mo22004k(Integer num) {
        this.f21917f = num;
    }

    /* renamed from: l */
    public void mo22005l(int i) {
        this.f21913b = i;
    }

    /* renamed from: m */
    public void mo22006m(Object obj) {
        this.f21919h = obj;
    }

    public C7511e(byte[] bArr, String str, List list, String str2, int i, int i2) {
        int i3;
        this.f21912a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f21913b = i3;
        this.f21914c = str;
        this.f21915d = list;
        this.f21916e = str2;
        this.f21920i = i2;
        this.f21921j = i;
    }
}
