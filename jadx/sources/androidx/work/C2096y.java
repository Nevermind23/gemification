package androidx.work;

import android.os.Build;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7399v;

/* renamed from: androidx.work.y */
public abstract class C2096y {

    /* renamed from: d */
    public static final C2098b f6249d = new C2098b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final UUID f6250a;

    /* renamed from: b */
    private final C7399v f6251b;

    /* renamed from: c */
    private final Set f6252c;

    /* renamed from: androidx.work.y$a */
    public static abstract class C2097a {

        /* renamed from: a */
        private final Class f6253a;

        /* renamed from: b */
        private boolean f6254b;

        /* renamed from: c */
        private UUID f6255c;

        /* renamed from: d */
        private C7399v f6256d;

        /* renamed from: e */
        private final Set f6257e;

        public C2097a(Class cls) {
            C41536l.m120489i(cls, "workerClass");
            this.f6253a = cls;
            UUID randomUUID = UUID.randomUUID();
            C41536l.m120488h(randomUUID, "randomUUID()");
            this.f6255c = randomUUID;
            String uuid = this.f6255c.toString();
            C41536l.m120488h(uuid, "id.toString()");
            String name = cls.getName();
            C41536l.m120488h(name, "workerClass.name");
            this.f6256d = new C7399v(uuid, name);
            String name2 = cls.getName();
            C41536l.m120488h(name2, "workerClass.name");
            this.f6257e = C41357x0.m119987g(name2);
        }

        /* renamed from: a */
        public final C2097a mo6986a(String str) {
            C41536l.m120489i(str, "tag");
            this.f6257e.add(str);
            return mo6969g();
        }

        /* renamed from: b */
        public final C2096y mo6987b() {
            boolean z;
            C2096y c = mo6968c();
            C1954c cVar = this.f6256d.f21639j;
            boolean z2 = false;
            if ((Build.VERSION.SDK_INT < 24 || !cVar.mo6713e()) && !cVar.mo6715f() && !cVar.mo6716g() && !cVar.mo6717h()) {
                z = false;
            } else {
                z = true;
            }
            C7399v vVar = this.f6256d;
            if (vVar.f21646q) {
                if (!z) {
                    if (vVar.f21636g <= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            C41536l.m120488h(randomUUID, "randomUUID()");
            mo6993j(randomUUID);
            return c;
        }

        /* renamed from: c */
        public abstract C2096y mo6968c();

        /* renamed from: d */
        public final boolean mo6988d() {
            return this.f6254b;
        }

        /* renamed from: e */
        public final UUID mo6989e() {
            return this.f6255c;
        }

        /* renamed from: f */
        public final Set mo6990f() {
            return this.f6257e;
        }

        /* renamed from: g */
        public abstract C2097a mo6969g();

        /* renamed from: h */
        public final C7399v mo6991h() {
            return this.f6256d;
        }

        /* renamed from: i */
        public final C2097a mo6992i(C1954c cVar) {
            C41536l.m120489i(cVar, "constraints");
            this.f6256d.f21639j = cVar;
            return mo6969g();
        }

        /* renamed from: j */
        public final C2097a mo6993j(UUID uuid) {
            C41536l.m120489i(uuid, "id");
            this.f6255c = uuid;
            String uuid2 = uuid.toString();
            C41536l.m120488h(uuid2, "id.toString()");
            this.f6256d = new C7399v(uuid2, this.f6256d);
            return mo6969g();
        }

        /* renamed from: k */
        public final C2097a mo6994k(C1959e eVar) {
            C41536l.m120489i(eVar, "inputData");
            this.f6256d.f21634e = eVar;
            return mo6969g();
        }
    }

    /* renamed from: androidx.work.y$b */
    public static final class C2098b {
        private C2098b() {
        }

        public /* synthetic */ C2098b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2096y(UUID uuid, C7399v vVar, Set set) {
        C41536l.m120489i(uuid, "id");
        C41536l.m120489i(vVar, "workSpec");
        C41536l.m120489i(set, C11772k.C11773a.f34175g);
        this.f6250a = uuid;
        this.f6251b = vVar;
        this.f6252c = set;
    }

    /* renamed from: a */
    public UUID mo6982a() {
        return this.f6250a;
    }

    /* renamed from: b */
    public final String mo6983b() {
        String uuid = mo6982a().toString();
        C41536l.m120488h(uuid, "id.toString()");
        return uuid;
    }

    /* renamed from: c */
    public final Set mo6984c() {
        return this.f6252c;
    }

    /* renamed from: d */
    public final C7399v mo6985d() {
        return this.f6251b;
    }
}
