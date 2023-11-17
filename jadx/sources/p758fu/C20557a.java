package p758fu;

import com.google.gson.C5494h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fu.a */
public final class C20557a {

    /* renamed from: g */
    public static final C20558a f55585g = new C20558a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f55586a;

    /* renamed from: b */
    private final Double f55587b;

    /* renamed from: c */
    private final Boolean f55588c;

    /* renamed from: d */
    private final String f55589d;

    /* renamed from: e */
    private final String f55590e;

    /* renamed from: f */
    private final C5494h f55591f;

    /* renamed from: fu.a$a */
    public static final class C20558a {
        private C20558a() {
        }

        public /* synthetic */ C20558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20557a(String str, Double d, Boolean bool, String str2, String str3, C5494h hVar) {
        this.f55586a = str;
        this.f55587b = d;
        this.f55588c = bool;
        this.f55589d = str2;
        this.f55590e = str3;
        this.f55591f = hVar;
    }

    /* renamed from: a */
    public final Boolean mo49084a() {
        return this.f55588c;
    }

    /* renamed from: b */
    public final C5494h mo49085b() {
        return this.f55591f;
    }

    /* renamed from: c */
    public final Double mo49086c() {
        return this.f55587b;
    }

    /* renamed from: d */
    public final String mo49087d() {
        return this.f55589d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20557a)) {
            return false;
        }
        C20557a aVar = (C20557a) obj;
        return C41536l.m120484d(this.f55586a, aVar.f55586a) && C41536l.m120484d(this.f55587b, aVar.f55587b) && C41536l.m120484d(this.f55588c, aVar.f55588c) && C41536l.m120484d(this.f55589d, aVar.f55589d) && C41536l.m120484d(this.f55590e, aVar.f55590e) && C41536l.m120484d(this.f55591f, aVar.f55591f);
    }

    public int hashCode() {
        String str = this.f55586a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.f55587b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.f55588c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f55589d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55590e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C5494h hVar = this.f55591f;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.f55586a;
        Double d = this.f55587b;
        Boolean bool = this.f55588c;
        String str2 = this.f55589d;
        String str3 = this.f55590e;
        C5494h hVar = this.f55591f;
        return "AppSetting(settingsName=" + str + ", settingsNumberValue=" + d + ", booleanSettings=" + bool + ", settingsValue=" + str2 + ", settingsDesc=" + str3 + ", jsonSettings=" + hVar + ")";
    }
}
