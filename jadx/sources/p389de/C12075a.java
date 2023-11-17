package p389de;

import com.salesforce.marketingcloud.C11398b;

/* renamed from: de.a */
public class C12075a {

    /* renamed from: a */
    public int f35485a;

    /* renamed from: b */
    public int f35486b = 1;

    /* renamed from: c */
    public String f35487c;

    /* renamed from: d */
    public String f35488d = "audio/mp4a-latm";

    /* renamed from: e */
    public int f35489e = 44100;

    /* renamed from: f */
    final int f35490f = 2;

    /* renamed from: g */
    final int f35491g = 2;

    /* renamed from: h */
    final int f35492h = (44100 * 2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32226a() {
        int i = this.f35486b;
        if (i == 1) {
            return 16;
        }
        if (i == 2) {
            return 12;
        }
        throw new RuntimeException("Invalid number of channels: " + this.f35486b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32227b() {
        return 50;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32228c() {
        return 500;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo32229d() {
        return this.f35492h * this.f35486b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C12075a mo32230e() {
        C12075a aVar = new C12075a();
        aVar.f35485a = this.f35485a;
        aVar.f35486b = this.f35486b;
        aVar.f35487c = this.f35487c;
        aVar.f35488d = this.f35488d;
        aVar.f35489e = this.f35489e;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo32231f() {
        return this.f35486b * C11398b.f33141t;
    }
}
