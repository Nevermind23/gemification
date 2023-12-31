package com.google.android.gms.internal.measurement;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ta */
abstract class C4420ta {

    /* renamed from: a */
    private static final char[] f13703a;

    static {
        char[] cArr = new char[80];
        f13703a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m16762a(C4386ra raVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m16765d(raVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m16763b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m16763b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m16763b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m16764c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C4200gb.m15912a(new C4350p8(((String) obj).getBytes(C4470w9.f13782b))));
                sb.append('\"');
            } else if (obj instanceof C4418t8) {
                sb.append(": \"");
                sb.append(C4200gb.m15912a((C4418t8) obj));
                sb.append('\"');
            } else if (obj instanceof C4351p9) {
                sb.append(" {");
                m16765d((C4351p9) obj, sb, i + 2);
                sb.append("\n");
                m16764c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m16763b(sb, i3, "key", entry.getKey());
                m16763b(sb, i3, C11755a.C11756a.f34100b, entry.getValue());
                sb.append("\n");
                m16764c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m16764c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f13703a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m16765d(C4386ra raVar, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C4386ra raVar2 = raVar;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = raVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m16763b(sb2, i3, substring.substring(0, substring.length() - 4), C4351p9.m16440r(method2, raVar2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m16763b(sb2, i3, substring.substring(0, substring.length() - 3), C4351p9.m16440r(method, raVar2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object r = C4351p9.m16440r(method4, raVar2, new Object[0]);
                    if (method5 == null) {
                        if (r instanceof Boolean) {
                            if (!((Boolean) r).booleanValue()) {
                            }
                        } else if (r instanceof Integer) {
                            if (((Integer) r).intValue() == 0) {
                            }
                        } else if (r instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r).floatValue()) == 0) {
                            }
                        } else if (!(r instanceof Double)) {
                            if (r instanceof String) {
                                z = r.equals("");
                            } else if (r instanceof C4418t8) {
                                z = r.equals(C4418t8.f13699e);
                            } else if (r instanceof C4386ra) {
                                if (r == ((C4386ra) r).mo13468d()) {
                                }
                            } else if ((r instanceof Enum) && ((Enum) r).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) r).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C4351p9.m16440r(method5, raVar2, new Object[0])).booleanValue()) {
                    }
                    m16763b(sb2, i3, substring, r);
                }
            }
            i2 = 3;
        }
        C4234ib ibVar = ((C4351p9) raVar2).zzc;
        if (ibVar != null) {
            ibVar.mo13264i(sb2, i3);
        }
    }
}
