package p272u5;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import p207p5.C7711a;
import p272u5.C8610m0;

/* renamed from: u5.t */
public final /* synthetic */ class C8627t implements C8610m0.C8612b {

    /* renamed from: a */
    public final /* synthetic */ C8610m0 f24383a;

    /* renamed from: b */
    public final /* synthetic */ String f24384b;

    /* renamed from: c */
    public final /* synthetic */ Map f24385c;

    /* renamed from: d */
    public final /* synthetic */ C7711a.C7712a f24386d;

    public /* synthetic */ C8627t(C8610m0 m0Var, String str, Map map, C7711a.C7712a aVar) {
        this.f24383a = m0Var;
        this.f24384b = str;
        this.f24385c = map;
        this.f24386d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f24383a.m32136G1(this.f24384b, this.f24385c, this.f24386d, (SQLiteDatabase) obj);
    }
}
