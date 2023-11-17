package wc0;

import android.database.Cursor;
import android.os.CancellationSignal;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import p267u0.C8438a0;
import p267u0.C8463e0;
import p267u0.C8465f;
import p267u0.C8478k;
import p267u0.C8503w;
import p267u0.C8512x;
import p293w0.C8721a;
import p293w0.C8722b;
import p318y0.C9008m;
import wc0.C29300a;
import xc0.C29739a;
import xc0.C29741c;

/* renamed from: wc0.c */
public final class C29305c implements C29300a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8503w f74377a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8478k f74378b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8478k f74379c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8463e0 f74380d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8463e0 f74381e;

    /* renamed from: wc0.c$a */
    class C29306a implements Callable {

        /* renamed from: d */
        final /* synthetic */ C8438a0 f74382d;

        C29306a(C8438a0 a0Var) {
            this.f74382d = a0Var;
        }

        /* renamed from: a */
        public List call() {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor c = C8722b.m32486c(C29305c.this.f74377a, this.f74382d, false, (CancellationSignal) null);
            try {
                int e = C8721a.m32483e(c, "key");
                int e2 = C8721a.m32483e(c, "segment");
                int e3 = C8721a.m32483e(c, "valueEn");
                int e4 = C8721a.m32483e(c, "valueGe");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    if (c.isNull(e2)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e4);
                    }
                    arrayList.add(new C29741c(str, str2, str3, str4));
                }
                return arrayList;
            } finally {
                c.close();
                this.f74382d.mo23627n();
            }
        }
    }

    /* renamed from: wc0.c$b */
    class C29307b implements Callable {

        /* renamed from: d */
        final /* synthetic */ C8438a0 f74384d;

        C29307b(C8438a0 a0Var) {
            this.f74384d = a0Var;
        }

        /* renamed from: a */
        public String call() {
            String str = null;
            Cursor c = C8722b.m32486c(C29305c.this.f74377a, this.f74384d, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (!c.isNull(0)) {
                        str = c.getString(0);
                    }
                }
                return str;
            } finally {
                c.close();
                this.f74384d.mo23627n();
            }
        }
    }

    /* renamed from: wc0.c$c */
    class C29308c implements Callable {

        /* renamed from: d */
        final /* synthetic */ C8438a0 f74386d;

        C29308c(C8438a0 a0Var) {
            this.f74386d = a0Var;
        }

        /* renamed from: a */
        public String call() {
            String str = null;
            Cursor c = C8722b.m32486c(C29305c.this.f74377a, this.f74386d, false, (CancellationSignal) null);
            try {
                if (c.moveToFirst()) {
                    if (!c.isNull(0)) {
                        str = c.getString(0);
                    }
                }
                return str;
            } finally {
                c.close();
                this.f74386d.mo23627n();
            }
        }
    }

    /* renamed from: wc0.c$d */
    class C29309d extends C8478k {
        C29309d(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `CommonDictionary` (`key`,`segment`,`valueEn`,`valueGe`) VALUES (?,?,?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C29739a aVar) {
            if (aVar.getKey() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, aVar.getKey());
            }
            if (aVar.mo69742a() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, aVar.mo69742a());
            }
            if (aVar.mo69743b() == null) {
                mVar.mo23624j1(3);
            } else {
                mVar.mo23623j(3, aVar.mo69743b());
            }
            if (aVar.mo69744c() == null) {
                mVar.mo23624j1(4);
            } else {
                mVar.mo23623j(4, aVar.mo69744c());
            }
        }
    }

    /* renamed from: wc0.c$e */
    class C29310e extends C8478k {
        C29310e(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `PaymentsDictionary` (`key`,`segment`,`valueEn`,`valueGe`) VALUES (?,?,?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C29741c cVar) {
            if (cVar.getKey() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, cVar.getKey());
            }
            if (cVar.mo69742a() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, cVar.mo69742a());
            }
            if (cVar.mo69743b() == null) {
                mVar.mo23624j1(3);
            } else {
                mVar.mo23623j(3, cVar.mo69743b());
            }
            if (cVar.mo69744c() == null) {
                mVar.mo23624j1(4);
            } else {
                mVar.mo23623j(4, cVar.mo69744c());
            }
        }
    }

    /* renamed from: wc0.c$f */
    class C29311f extends C8463e0 {
        C29311f(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM CommonDictionary";
        }
    }

    /* renamed from: wc0.c$g */
    class C29312g extends C8463e0 {
        C29312g(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM PaymentsDictionary";
        }
    }

    /* renamed from: wc0.c$h */
    class C29313h implements Callable {

        /* renamed from: d */
        final /* synthetic */ List f74392d;

        C29313h(List list) {
            this.f74392d = list;
        }

        /* renamed from: a */
        public C41238w call() {
            C29305c.this.f74377a.mo23807e();
            try {
                C29305c.this.f74378b.mo23747j(this.f74392d);
                C29305c.this.f74377a.mo23804F();
                return C41238w.f97225a;
            } finally {
                C29305c.this.f74377a.mo23809i();
            }
        }
    }

    /* renamed from: wc0.c$i */
    class C29314i implements Callable {

        /* renamed from: d */
        final /* synthetic */ List f74394d;

        C29314i(List list) {
            this.f74394d = list;
        }

        /* renamed from: a */
        public C41238w call() {
            C29305c.this.f74377a.mo23807e();
            try {
                C29305c.this.f74379c.mo23747j(this.f74394d);
                C29305c.this.f74377a.mo23804F();
                return C41238w.f97225a;
            } finally {
                C29305c.this.f74377a.mo23809i();
            }
        }
    }

    /* renamed from: wc0.c$j */
    class C29315j implements Callable {
        C29315j() {
        }

        /* renamed from: a */
        public C41238w call() {
            C9008m b = C29305c.this.f74380d.mo23725b();
            C29305c.this.f74377a.mo23807e();
            try {
                b.mo23676O();
                C29305c.this.f74377a.mo23804F();
                return C41238w.f97225a;
            } finally {
                C29305c.this.f74377a.mo23809i();
                C29305c.this.f74380d.mo23727h(b);
            }
        }
    }

    /* renamed from: wc0.c$k */
    class C29316k implements Callable {
        C29316k() {
        }

        /* renamed from: a */
        public C41238w call() {
            C9008m b = C29305c.this.f74381e.mo23725b();
            C29305c.this.f74377a.mo23807e();
            try {
                b.mo23676O();
                C29305c.this.f74377a.mo23804F();
                return C41238w.f97225a;
            } finally {
                C29305c.this.f74377a.mo23809i();
                C29305c.this.f74381e.mo23727h(b);
            }
        }
    }

    /* renamed from: wc0.c$l */
    class C29317l implements Callable {

        /* renamed from: d */
        final /* synthetic */ C8438a0 f74398d;

        C29317l(C8438a0 a0Var) {
            this.f74398d = a0Var;
        }

        /* renamed from: a */
        public List call() {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor c = C8722b.m32486c(C29305c.this.f74377a, this.f74398d, false, (CancellationSignal) null);
            try {
                int e = C8721a.m32483e(c, "key");
                int e2 = C8721a.m32483e(c, "segment");
                int e3 = C8721a.m32483e(c, "valueEn");
                int e4 = C8721a.m32483e(c, "valueGe");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    if (c.isNull(e2)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e4);
                    }
                    arrayList.add(new C29739a(str, str2, str3, str4));
                }
                return arrayList;
            } finally {
                c.close();
                this.f74398d.mo23627n();
            }
        }
    }

    public C29305c(C8503w wVar) {
        this.f74377a = wVar;
        this.f74378b = new C29309d(wVar);
        this.f74379c = new C29310e(wVar);
        this.f74380d = new C29311f(wVar);
        this.f74381e = new C29312g(wVar);
    }

    /* renamed from: q */
    public static List m89367q() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m89368r(Continuation continuation) {
        return C29300a.C29301a.m89357a(this, continuation);
    }

    /* renamed from: a */
    public Object mo69148a(List list, List list2, Continuation continuation) {
        return C29300a.C29301a.m89358b(this, list, list2, continuation);
    }

    /* renamed from: b */
    public Object mo69149b(Continuation continuation) {
        C8438a0 d = C8438a0.m31651d("SELECT * FROM PaymentsDictionary", 0);
        return C8465f.m31739a(this.f74377a, false, C8722b.m32484a(), new C29306a(d), continuation);
    }

    /* renamed from: c */
    public Object mo69150c(Continuation continuation) {
        return C8512x.m31891d(this.f74377a, new C29304b(this), continuation);
    }

    /* renamed from: d */
    public Object mo69151d(Continuation continuation) {
        C8438a0 d = C8438a0.m31651d("SELECT * FROM CommonDictionary", 0);
        return C8465f.m31739a(this.f74377a, false, C8722b.m32484a(), new C29317l(d), continuation);
    }

    /* renamed from: e */
    public Object mo69152e(Continuation continuation) {
        C8438a0 d = C8438a0.m31651d("SELECT `key` FROM PaymentsDictionary Limit 1", 0);
        return C8465f.m31739a(this.f74377a, false, C8722b.m32484a(), new C29308c(d), continuation);
    }

    /* renamed from: f */
    public Object mo69153f(Continuation continuation) {
        return C8465f.m31740b(this.f74377a, true, new C29316k(), continuation);
    }

    /* renamed from: g */
    public Object mo69154g(Continuation continuation) {
        return C8465f.m31740b(this.f74377a, true, new C29315j(), continuation);
    }

    /* renamed from: h */
    public Object mo69155h(List list, Continuation continuation) {
        return C8465f.m31740b(this.f74377a, true, new C29314i(list), continuation);
    }

    /* renamed from: i */
    public Object mo69156i(List list, Continuation continuation) {
        return C8465f.m31740b(this.f74377a, true, new C29313h(list), continuation);
    }

    /* renamed from: j */
    public Object mo69157j(Continuation continuation) {
        C8438a0 d = C8438a0.m31651d("SELECT `key` FROM CommonDictionary Limit 1", 0);
        return C8465f.m31739a(this.f74377a, false, C8722b.m32484a(), new C29307b(d), continuation);
    }
}
