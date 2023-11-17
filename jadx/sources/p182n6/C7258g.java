package p182n6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: n6.g */
public abstract class C7258g {

    /* renamed from: n6.g$a */
    public static final class C7259a {

        /* renamed from: a */
        private final List f21454a = new ArrayList();

        /* renamed from: b */
        private final Object f21455b;

        /* synthetic */ C7259a(Object obj, C7269k0 k0Var) {
            C7264i.m27902k(obj);
            this.f21455b = obj;
        }

        /* renamed from: a */
        public C7259a mo21632a(String str, Object obj) {
            List list = this.f21454a;
            C7264i.m27902k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f21455b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f21454a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f21454a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m27880a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: b */
    public static int m27881b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C7259a m27882c(Object obj) {
        return new C7259a(obj, (C7269k0) null);
    }
}
