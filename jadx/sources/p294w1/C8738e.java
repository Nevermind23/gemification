package p294w1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: w1.e */
public class C8738e {

    /* renamed from: c */
    public static final C8738e f24593c = new C8738e("COMPOSITION");

    /* renamed from: a */
    private final List f24594a;

    /* renamed from: b */
    private C8739f f24595b;

    public C8738e(String... strArr) {
        this.f24594a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m32520b() {
        List list = this.f24594a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* renamed from: f */
    private boolean m32521f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C8738e mo24135a(String str) {
        C8738e eVar = new C8738e(this);
        eVar.f24594a.add(str);
        return eVar;
    }

    /* renamed from: c */
    public boolean mo24136c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f24594a.size()) {
            return false;
        }
        if (i == this.f24594a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) this.f24594a.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f24594a.size() - 2 && m32520b())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !((String) this.f24594a.get(i + 1)).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f24594a.size() - 2 || (i == this.f24594a.size() - 3 && m32520b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f24594a.size() - 1) {
                return false;
            }
            return ((String) this.f24594a.get(i2)).equals(str);
        }
    }

    /* renamed from: d */
    public C8739f mo24137d() {
        return this.f24595b;
    }

    /* renamed from: e */
    public int mo24138e(String str, int i) {
        if (m32521f(str)) {
            return 0;
        }
        if (!((String) this.f24594a.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f24594a.size() - 1 && ((String) this.f24594a.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8738e eVar = (C8738e) obj;
        if (!this.f24594a.equals(eVar.f24594a)) {
            return false;
        }
        C8739f fVar = this.f24595b;
        C8739f fVar2 = eVar.f24595b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo24140g(String str, int i) {
        if (m32521f(str)) {
            return true;
        }
        if (i >= this.f24594a.size()) {
            return false;
        }
        if (((String) this.f24594a.get(i)).equals(str) || ((String) this.f24594a.get(i)).equals("**") || ((String) this.f24594a.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo24141h(String str, int i) {
        if (!"__container".equals(str) && i >= this.f24594a.size() - 1 && !((String) this.f24594a.get(i)).equals("**")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f24594a.hashCode() * 31;
        C8739f fVar = this.f24595b;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public C8738e mo24143i(C8739f fVar) {
        C8738e eVar = new C8738e(this);
        eVar.f24595b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f24594a);
        sb.append(",resolved=");
        sb.append(this.f24595b != null);
        sb.append('}');
        return sb.toString();
    }

    private C8738e(C8738e eVar) {
        this.f24594a = new ArrayList(eVar.f24594a);
        this.f24595b = eVar.f24595b;
    }
}
