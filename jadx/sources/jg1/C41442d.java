package jg1;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jg1.C41444f;
import kg1.C41512a;

/* renamed from: jg1.d */
public class C41442d {

    /* renamed from: m */
    private static final ExecutorService f97540m = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f97541a = true;

    /* renamed from: b */
    boolean f97542b = true;

    /* renamed from: c */
    boolean f97543c = true;

    /* renamed from: d */
    boolean f97544d = true;

    /* renamed from: e */
    boolean f97545e;

    /* renamed from: f */
    boolean f97546f = true;

    /* renamed from: g */
    boolean f97547g;

    /* renamed from: h */
    boolean f97548h;

    /* renamed from: i */
    ExecutorService f97549i = f97540m;

    /* renamed from: j */
    List f97550j;

    /* renamed from: k */
    C41444f f97551k;

    /* renamed from: l */
    C41447g f97552l;

    C41442d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C41444f mo96190a() {
        C41444f fVar = this.f97551k;
        if (fVar != null) {
            return fVar;
        }
        return C41444f.C41445a.m120261a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C41447g mo96191b() {
        C41447g gVar = this.f97552l;
        if (gVar != null) {
            return gVar;
        }
        if (C41512a.m120415a()) {
            return C41512a.m120416b().f97682b;
        }
        return null;
    }
}
