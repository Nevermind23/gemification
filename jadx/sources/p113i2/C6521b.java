package p113i2;

import com.androidnetworking.error.ANError;
import of1.C41880d0;

/* renamed from: i2.b */
public class C6521b {

    /* renamed from: a */
    private final Object f19930a;

    /* renamed from: b */
    private final ANError f19931b;

    /* renamed from: c */
    private C41880d0 f19932c;

    public C6521b(Object obj) {
        this.f19930a = obj;
        this.f19931b = null;
    }

    /* renamed from: a */
    public static C6521b m25786a(ANError aNError) {
        return new C6521b(aNError);
    }

    /* renamed from: f */
    public static C6521b m25787f(Object obj) {
        return new C6521b(obj);
    }

    /* renamed from: b */
    public ANError mo20497b() {
        return this.f19931b;
    }

    /* renamed from: c */
    public Object mo20498c() {
        return this.f19930a;
    }

    /* renamed from: d */
    public boolean mo20499d() {
        return this.f19931b == null;
    }

    /* renamed from: e */
    public void mo20500e(C41880d0 d0Var) {
        this.f19932c = d0Var;
    }

    public C6521b(ANError aNError) {
        this.f19930a = null;
        this.f19931b = aNError;
    }
}
