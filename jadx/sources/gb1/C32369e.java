package gb1;

import af1.C40303i;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import he1.C41238w;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: gb1.e */
public final class C32369e {

    /* renamed from: a */
    public static final C32369e f79813a = new C32369e();

    /* renamed from: gb1.e$a */
    public static final class C32370a implements C41555e {

        /* renamed from: a */
        private final String f79814a;

        /* renamed from: b */
        private final boolean f79815b;

        public C32370a(String str, boolean z) {
            C41536l.m120489i(str, "name");
            this.f79814a = str;
            this.f79815b = z;
        }

        /* renamed from: a */
        public Boolean getValue(Object obj, C40303i iVar) {
            C32374f fVar;
            C41536l.m120489i(obj, "thisRef");
            C41536l.m120489i(iVar, "property");
            SharedPreferences sharedPreferences = null;
            if (obj instanceof C32374f) {
                fVar = (C32374f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sharedPreferences = fVar.getSharedPreferences();
            }
            if (sharedPreferences != null) {
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f79814a, this.f79815b));
            }
            throw new IllegalStateException("SharedPreferences not found".toString());
        }

        /* renamed from: b */
        public void mo72869b(Object obj, C40303i iVar, boolean z) {
            C32374f fVar;
            C41536l.m120489i(obj, "thisRef");
            C41536l.m120489i(iVar, "property");
            SharedPreferences sharedPreferences = null;
            if (obj instanceof C32374f) {
                fVar = (C32374f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sharedPreferences = fVar.getSharedPreferences();
            }
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                C41536l.m120488h(edit, "editor");
                edit.putBoolean(this.f79814a, z);
                edit.commit();
                return;
            }
            throw new IllegalStateException("SharedPreferences not found".toString());
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, C40303i iVar, Object obj2) {
            mo72869b(obj, iVar, ((Boolean) obj2).booleanValue());
        }
    }

    /* renamed from: gb1.e$b */
    public static final class C32371b implements C41555e {

        /* renamed from: a */
        private final String f79816a;

        /* renamed from: b */
        private final Object f79817b;

        /* renamed from: c */
        private final Type f79818c;

        /* renamed from: d */
        private final Gson f79819d;

        /* renamed from: e */
        private Object f79820e;

        /* renamed from: gb1.e$b$a */
        private static final class C32372a {

            /* renamed from: a */
            public static final C32372a f79821a = new C32372a();

            private C32372a() {
            }
        }

        public C32371b(String str, Object obj, Type type, Gson gson) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(type, "type");
            C41536l.m120489i(gson, "gson");
            this.f79816a = str;
            this.f79817b = obj;
            this.f79818c = type;
            this.f79819d = gson;
            this.f79820e = obj == null ? C32372a.f79821a : obj;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:18|19|20|21|22|23|24) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object getValue(java.lang.Object r3, af1.C40303i r4) {
            /*
                r2 = this;
                java.lang.String r0 = "thisRef"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "property"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.Object r4 = r2.f79820e
                gb1.e$b$a r0 = gb1.C32369e.C32371b.C32372a.f79821a
                boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r4, r0)
                if (r1 != 0) goto L_0x0015
                return r4
            L_0x0015:
                monitor-enter(r2)
                java.lang.Object r4 = r2.f79820e     // Catch:{ all -> 0x0051 }
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r4, r0)     // Catch:{ all -> 0x0051 }
                if (r0 != 0) goto L_0x0020
                monitor-exit(r2)
                return r4
            L_0x0020:
                boolean r4 = r3 instanceof gb1.C32374f     // Catch:{ all -> 0x0051 }
                r0 = 0
                if (r4 == 0) goto L_0x0028
                gb1.f r3 = (gb1.C32374f) r3     // Catch:{ all -> 0x0051 }
                goto L_0x0029
            L_0x0028:
                r3 = r0
            L_0x0029:
                if (r3 == 0) goto L_0x0030
                android.content.SharedPreferences r3 = r3.getSharedPreferences()     // Catch:{ all -> 0x0051 }
                goto L_0x0031
            L_0x0030:
                r3 = r0
            L_0x0031:
                if (r3 == 0) goto L_0x0045
                java.lang.String r4 = r2.f79816a     // Catch:{ all -> 0x0051 }
                java.lang.String r3 = r3.getString(r4, r0)     // Catch:{ all -> 0x0051 }
                com.google.gson.Gson r4 = r2.f79819d     // Catch:{ all -> 0x0041 }
                java.lang.reflect.Type r1 = r2.f79818c     // Catch:{ all -> 0x0041 }
                java.lang.Object r0 = r4.mo18171m(r3, r1)     // Catch:{ all -> 0x0041 }
            L_0x0041:
                r2.f79820e = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r2)
                return r0
            L_0x0045:
                java.lang.String r3 = "SharedPreferences not found"
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0051 }
                r4.<init>(r3)     // Catch:{ all -> 0x0051 }
                throw r4     // Catch:{ all -> 0x0051 }
            L_0x0051:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: gb1.C32369e.C32371b.getValue(java.lang.Object, af1.i):java.lang.Object");
        }

        public void setValue(Object obj, C40303i iVar, Object obj2) {
            String str;
            C32374f fVar;
            C41536l.m120489i(obj, "thisRef");
            C41536l.m120489i(iVar, "property");
            synchronized (this) {
                SharedPreferences sharedPreferences = null;
                try {
                    str = this.f79819d.mo18182x(obj2, this.f79818c);
                } catch (Throwable unused) {
                    str = null;
                }
                if (obj instanceof C32374f) {
                    fVar = (C32374f) obj;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sharedPreferences = fVar.getSharedPreferences();
                }
                if (sharedPreferences != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    C41536l.m120488h(edit, "editor");
                    edit.putString(this.f79816a, str);
                    edit.commit();
                    this.f79820e = C32372a.f79821a;
                    C41238w wVar = C41238w.f97225a;
                } else {
                    throw new IllegalStateException("SharedPreferences not found".toString());
                }
            }
        }
    }

    /* renamed from: gb1.e$c */
    public static final class C32373c implements C41555e {

        /* renamed from: a */
        private final String f79822a;

        /* renamed from: b */
        private final String f79823b;

        public C32373c(String str, String str2) {
            C41536l.m120489i(str, "name");
            this.f79822a = str;
            this.f79823b = str2;
        }

        /* renamed from: a */
        public String getValue(Object obj, C40303i iVar) {
            C32374f fVar;
            C41536l.m120489i(obj, "thisRef");
            C41536l.m120489i(iVar, "property");
            SharedPreferences sharedPreferences = null;
            if (obj instanceof C32374f) {
                fVar = (C32374f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sharedPreferences = fVar.getSharedPreferences();
            }
            if (sharedPreferences != null) {
                return sharedPreferences.getString(this.f79822a, this.f79823b);
            }
            throw new IllegalStateException("SharedPreferences not found".toString());
        }

        /* renamed from: b */
        public void setValue(Object obj, C40303i iVar, String str) {
            C32374f fVar;
            C41536l.m120489i(obj, "thisRef");
            C41536l.m120489i(iVar, "property");
            SharedPreferences sharedPreferences = null;
            if (obj instanceof C32374f) {
                fVar = (C32374f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sharedPreferences = fVar.getSharedPreferences();
            }
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                C41536l.m120488h(edit, "editor");
                edit.putString(this.f79822a, str);
                edit.commit();
                return;
            }
            throw new IllegalStateException("SharedPreferences not found".toString());
        }
    }

    private C32369e() {
    }

    /* renamed from: a */
    public final C32370a mo72866a(String str, boolean z) {
        C41536l.m120489i(str, "name");
        return new C32370a(str, z);
    }

    /* renamed from: b */
    public final C32373c mo72867b(String str, String str2) {
        C41536l.m120489i(str, "name");
        return new C32373c(str, str2);
    }
}
