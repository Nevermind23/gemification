package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p260t6.C8401c;
import p260t6.C8411m;
import p260t6.C8412n;

public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C4002a {
        /* renamed from: i */
        Object mo12330i(Object obj);
    }

    /* renamed from: g */
    protected static final Object m15203g(Field field, Object obj) {
        if (field.f12773n != null) {
            return field.mo12345F1(obj);
        }
        return obj;
    }

    /* renamed from: h */
    private static final void m15204h(StringBuilder sb, Field field, Object obj) {
        int i = field.f12764e;
        if (i == 11) {
            Class cls = field.f12770k;
            C7264i.m27902k(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C8411m.m31561a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    public abstract Map mo11599a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo11600b(Field field) {
        boolean z;
        String str = field.f12768i;
        if (field.f12770k == null) {
            return mo12342d(str);
        }
        if (mo12342d(str) == null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27907p(z, "Concrete field shouldn't be value object: %s", field.f12768i);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo12342d(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo11601e(Field field) {
        if (field.f12766g != 11) {
            return mo12343f(field.f12768i);
        }
        if (field.f12767h) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo12343f(String str);

    public String toString() {
        Map a = mo11599a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo11601e(field)) {
                Object g = m15203g(field, mo11600b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (g != null) {
                    switch (field.f12766g) {
                        case 8:
                            sb.append("\"");
                            sb.append(C8401c.m31534a((byte[]) g));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C8401c.m31535b((byte[]) g));
                            sb.append("\"");
                            break;
                        case 10:
                            C8412n.m31562a(sb, (HashMap) g);
                            break;
                        default:
                            if (!field.f12765f) {
                                m15204h(sb, field, g);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) g;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m15204h(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C4003a CREATOR = new C4003a();

        /* renamed from: d */
        private final int f12763d;

        /* renamed from: e */
        protected final int f12764e;

        /* renamed from: f */
        protected final boolean f12765f;

        /* renamed from: g */
        protected final int f12766g;

        /* renamed from: h */
        protected final boolean f12767h;

        /* renamed from: i */
        protected final String f12768i;

        /* renamed from: j */
        protected final int f12769j;

        /* renamed from: k */
        protected final Class f12770k;

        /* renamed from: l */
        protected final String f12771l;

        /* renamed from: m */
        private zan f12772m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C4002a f12773n;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f12763d = i;
            this.f12764e = i2;
            this.f12765f = z;
            this.f12766g = i3;
            this.f12767h = z2;
            this.f12768i = str;
            this.f12769j = i4;
            if (str2 == null) {
                this.f12770k = null;
                this.f12771l = null;
            } else {
                this.f12770k = SafeParcelResponse.class;
                this.f12771l = str2;
            }
            if (zaa == null) {
                this.f12773n = null;
            } else {
                this.f12773n = zaa.mo12339w();
            }
        }

        /* renamed from: R */
        public static Field m15210R(String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class) null, (C4002a) null);
        }

        /* renamed from: f0 */
        public static Field m15211f0(String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class) null, (C4002a) null);
        }

        /* renamed from: q0 */
        public static Field m15213q0(String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class) null, (C4002a) null);
        }

        /* renamed from: v */
        public static Field m15214v(String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class) null, (C4002a) null);
        }

        /* renamed from: w */
        public static Field m15215w(String str, int i, Class cls) {
            return new Field(11, false, 11, false, str, i, cls, (C4002a) null);
        }

        /* renamed from: x */
        public static Field m15216x(String str, int i, Class cls) {
            return new Field(11, true, 11, true, str, i, cls, (C4002a) null);
        }

        /* renamed from: F1 */
        public final Object mo12345F1(Object obj) {
            C7264i.m27902k(this.f12773n);
            return this.f12773n.mo12330i(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public final String mo12346G1() {
            String str = this.f12771l;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: H1 */
        public final Map mo12347H1() {
            C7264i.m27902k(this.f12771l);
            C7264i.m27902k(this.f12772m);
            return (Map) C7264i.m27902k(this.f12772m.mo12373w(this.f12771l));
        }

        /* renamed from: I1 */
        public final void mo12348I1(zan zan) {
            this.f12772m = zan;
        }

        /* renamed from: J1 */
        public final boolean mo12349J1() {
            return this.f12773n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public final zaa mo12350f1() {
            C4002a aVar = this.f12773n;
            if (aVar == null) {
                return null;
            }
            return zaa.m15201v(aVar);
        }

        /* renamed from: s0 */
        public int mo12351s0() {
            return this.f12769j;
        }

        public final String toString() {
            C7258g.C7259a a = C7258g.m27882c(this).mo21632a("versionCode", Integer.valueOf(this.f12763d)).mo21632a("typeIn", Integer.valueOf(this.f12764e)).mo21632a("typeInArray", Boolean.valueOf(this.f12765f)).mo21632a("typeOut", Integer.valueOf(this.f12766g)).mo21632a("typeOutArray", Boolean.valueOf(this.f12767h)).mo21632a("outputFieldName", this.f12768i).mo21632a("safeParcelFieldId", Integer.valueOf(this.f12769j)).mo21632a("concreteTypeName", mo12346G1());
            Class cls = this.f12770k;
            if (cls != null) {
                a.mo21632a("concreteType.class", cls.getCanonicalName());
            }
            C4002a aVar = this.f12773n;
            if (aVar != null) {
                a.mo21632a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28383o(parcel, 1, this.f12763d);
            C7461a.m28383o(parcel, 2, this.f12764e);
            C7461a.m28372d(parcel, 3, this.f12765f);
            C7461a.m28383o(parcel, 4, this.f12766g);
            C7461a.m28372d(parcel, 5, this.f12767h);
            C7461a.m28392x(parcel, 6, this.f12768i, false);
            C7461a.m28383o(parcel, 7, mo12351s0());
            C7461a.m28392x(parcel, 8, mo12346G1(), false);
            C7461a.m28390v(parcel, 9, mo12350f1(), i, false);
            C7461a.m28370b(parcel, a);
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, C4002a aVar) {
            this.f12763d = 1;
            this.f12764e = i;
            this.f12765f = z;
            this.f12766g = i2;
            this.f12767h = z2;
            this.f12768i = str;
            this.f12769j = i3;
            this.f12770k = cls;
            if (cls == null) {
                this.f12771l = null;
            } else {
                this.f12771l = cls.getCanonicalName();
            }
            this.f12773n = aVar;
        }
    }
}
