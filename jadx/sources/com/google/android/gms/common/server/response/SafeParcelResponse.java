package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p182n6.C7264i;
import p195o6.C7461a;
import p260t6.C8400b;
import p260t6.C8401c;
import p260t6.C8411m;
import p260t6.C8412n;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C4007e();

    /* renamed from: d */
    private final int f12774d;

    /* renamed from: e */
    private final Parcel f12775e;

    /* renamed from: f */
    private final int f12776f = 2;

    /* renamed from: g */
    private final zan f12777g;

    /* renamed from: h */
    private final String f12778h;

    /* renamed from: i */
    private int f12779i;

    /* renamed from: j */
    private int f12780j;

    SafeParcelResponse(int i, Parcel parcel, zan zan) {
        this.f12774d = i;
        this.f12775e = (Parcel) C7264i.m27902k(parcel);
        this.f12777g = zan;
        this.f12778h = zan == null ? null : zan.mo12372v();
        this.f12779i = 2;
    }

    /* renamed from: j */
    private final void m15227j(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).mo12351s0(), entry);
        }
        sb.append('{');
        int O = SafeParcelReader.m15126O(parcel);
        boolean z = false;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m15151w(E));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.mo12349J1()) {
                    int i = field.f12766g;
                    switch (i) {
                        case 0:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, Integer.valueOf(SafeParcelReader.m15118G(parcel, E))));
                            break;
                        case 1:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, SafeParcelReader.m15131c(parcel, E)));
                            break;
                        case 2:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, Long.valueOf(SafeParcelReader.m15121J(parcel, E))));
                            break;
                        case 3:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, Float.valueOf(SafeParcelReader.m15114C(parcel, E))));
                            break;
                        case 4:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, Double.valueOf(SafeParcelReader.m15112A(parcel, E))));
                            break;
                        case 5:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, SafeParcelReader.m15129a(parcel, E)));
                            break;
                        case 6:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, Boolean.valueOf(SafeParcelReader.m15152x(parcel, E))));
                            break;
                        case 7:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, SafeParcelReader.m15144p(parcel, E)));
                            break;
                        case 8:
                        case 9:
                            m15229l(sb, field, FastJsonResponse.m15203g(field, SafeParcelReader.m15135g(parcel, E)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m15134f(parcel, E);
                            HashMap hashMap = new HashMap();
                            for (String next : f.keySet()) {
                                hashMap.put(next, (String) C7264i.m27902k(f.getString(next)));
                            }
                            m15229l(sb, field, FastJsonResponse.m15203g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f12767h) {
                    sb.append("[");
                    switch (field.f12766g) {
                        case 0:
                            C8400b.m31529e(sb, SafeParcelReader.m15139k(parcel, E));
                            break;
                        case 1:
                            C8400b.m31531g(sb, SafeParcelReader.m15132d(parcel, E));
                            break;
                        case 2:
                            C8400b.m31530f(sb, SafeParcelReader.m15140l(parcel, E));
                            break;
                        case 3:
                            C8400b.m31528d(sb, SafeParcelReader.m15138j(parcel, E));
                            break;
                        case 4:
                            C8400b.m31527c(sb, SafeParcelReader.m15137i(parcel, E));
                            break;
                        case 5:
                            C8400b.m31531g(sb, SafeParcelReader.m15130b(parcel, E));
                            break;
                        case 6:
                            C8400b.m31532h(sb, SafeParcelReader.m15133e(parcel, E));
                            break;
                        case 7:
                            C8400b.m31533i(sb, SafeParcelReader.m15145q(parcel, E));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = SafeParcelReader.m15142n(parcel, E);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                n[i2].setDataPosition(0);
                                m15227j(sb, field.mo12347H1(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f12766g) {
                        case 0:
                            sb.append(SafeParcelReader.m15118G(parcel, E));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m15131c(parcel, E));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m15121J(parcel, E));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m15114C(parcel, E));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m15112A(parcel, E));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m15129a(parcel, E));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m15152x(parcel, E));
                            break;
                        case 7:
                            String p = SafeParcelReader.m15144p(parcel, E);
                            sb.append("\"");
                            sb.append(C8411m.m31561a(p));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m15135g(parcel, E);
                            sb.append("\"");
                            sb.append(C8401c.m31534a(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m15135g(parcel, E);
                            sb.append("\"");
                            sb.append(C8401c.m31535b(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m15134f(parcel, E);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String next2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(next2);
                                sb.append("\":\"");
                                sb.append(C8411m.m31561a(f2.getString(next2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = SafeParcelReader.m15141m(parcel, E);
                            m.setDataPosition(0);
                            m15227j(sb, field.mo12347H1(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == O) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(O);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    /* renamed from: k */
    private static final void m15228k(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C8411m.m31561a(C7264i.m27902k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C8401c.m31534a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C8401c.m31535b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C8412n.m31562a(sb, (HashMap) C7264i.m27902k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private static final void m15229l(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f12765f) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m15228k(sb, field.f12764e, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m15228k(sb, field.f12764e, obj);
    }

    /* renamed from: a */
    public final Map mo11599a() {
        zan zan = this.f12777g;
        if (zan == null) {
            return null;
        }
        return zan.mo12373w((String) C7264i.m27902k(this.f12778h));
    }

    /* renamed from: d */
    public final Object mo12342d(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: f */
    public final boolean mo12343f(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: i */
    public final Parcel mo12357i() {
        int i = this.f12779i;
        if (i == 0) {
            int a = C7461a.m28369a(this.f12775e);
            this.f12780j = a;
            C7461a.m28370b(this.f12775e, a);
            this.f12779i = 2;
        } else if (i == 1) {
            C7461a.m28370b(this.f12775e, this.f12780j);
            this.f12779i = 2;
        }
        return this.f12775e;
    }

    public final String toString() {
        C7264i.m27903l(this.f12777g, "Cannot convert to JSON on client side.");
        Parcel i = mo12357i();
        i.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m15227j(sb, (Map) C7264i.m27902k(this.f12777g.mo12373w((String) C7264i.m27902k(this.f12778h))), i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zan zan;
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12774d);
        C7461a.m28389u(parcel, 2, mo12357i(), false);
        int i2 = this.f12776f;
        if (i2 == 0) {
            zan = null;
        } else if (i2 != 1) {
            zan = this.f12777g;
        } else {
            zan = this.f12777g;
        }
        C7461a.m28390v(parcel, 3, zan, i, false);
        C7461a.m28370b(parcel, a);
    }
}
