package p267u0;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C41536l;
import p267u0.C8503w;
import p318y0.C8999j;

/* renamed from: u0.h */
public class C8474h {

    /* renamed from: a */
    public final Context f24074a;

    /* renamed from: b */
    public final String f24075b;

    /* renamed from: c */
    public final C8999j.C9005c f24076c;

    /* renamed from: d */
    public final C8503w.C8508e f24077d;

    /* renamed from: e */
    public final List f24078e;

    /* renamed from: f */
    public final boolean f24079f;

    /* renamed from: g */
    public final C8503w.C8507d f24080g;

    /* renamed from: h */
    public final Executor f24081h;

    /* renamed from: i */
    public final Executor f24082i;

    /* renamed from: j */
    public final Intent f24083j;

    /* renamed from: k */
    public final boolean f24084k;

    /* renamed from: l */
    public final boolean f24085l;

    /* renamed from: m */
    private final Set f24086m;

    /* renamed from: n */
    public final String f24087n;

    /* renamed from: o */
    public final File f24088o;

    /* renamed from: p */
    public final Callable f24089p;

    /* renamed from: q */
    public final List f24090q;

    /* renamed from: r */
    public final List f24091r;

    /* renamed from: s */
    public final boolean f24092s;

    public C8474h(Context context, String str, C8999j.C9005c cVar, C8503w.C8508e eVar, List list, boolean z, C8503w.C8507d dVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, C8503w.C8509f fVar, List list2, List list3) {
        boolean z4;
        C8503w.C8507d dVar2 = dVar;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List list4 = list2;
        List list5 = list3;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "sqliteOpenHelperFactory");
        C41536l.m120489i(eVar, "migrationContainer");
        C41536l.m120489i(dVar2, "journalMode");
        C41536l.m120489i(executor3, "queryExecutor");
        C41536l.m120489i(executor4, "transactionExecutor");
        C41536l.m120489i(list4, "typeConverters");
        C41536l.m120489i(list5, "autoMigrationSpecs");
        this.f24074a = context;
        this.f24075b = str;
        this.f24076c = cVar;
        this.f24077d = eVar;
        this.f24078e = list;
        this.f24079f = z;
        this.f24080g = dVar2;
        this.f24081h = executor3;
        this.f24082i = executor4;
        this.f24083j = intent2;
        this.f24084k = z2;
        this.f24085l = z3;
        this.f24086m = set;
        this.f24087n = str2;
        this.f24088o = file;
        this.f24089p = callable;
        this.f24090q = list4;
        this.f24091r = list5;
        if (intent2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f24092s = z4;
    }

    /* renamed from: a */
    public boolean mo23743a(int i, int i2) {
        boolean z;
        Set set;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f24085l) {
            return false;
        }
        if (!this.f24084k || ((set = this.f24086m) != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }
}
