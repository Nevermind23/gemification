package com.google.protobuf;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.j0 */
abstract class C5692j0 {

    /* renamed from: a */
    private static final char[] f17948a;

    static {
        char[] cArr = new char[80];
        f17948a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    private static void m22806a(int i, StringBuilder sb) {
        int i2;
        while (i > 0) {
            char[] cArr = f17948a;
            if (i > cArr.length) {
                i2 = cArr.length;
            } else {
                i2 = i;
            }
            sb.append(cArr, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: b */
    private static boolean m22807b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof C5648f) {
                return obj.equals(C5648f.f17856e);
            }
            if (obj instanceof C5677h0) {
                if (obj == ((C5677h0) obj).mo18710f()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum)) {
                return false;
            } else {
                if (((Enum) obj).ordinal() == 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: c */
    private static String m22808c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    static void m22809d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d : (List) obj) {
                m22809d(sb, i, str, d);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d2 : ((Map) obj).entrySet()) {
                m22809d(sb, i, str, d2);
            }
        } else {
            sb.append(10);
            m22806a(i, sb);
            sb.append(m22808c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C5631a1.m22445c((String) obj));
                sb.append('\"');
            } else if (obj instanceof C5648f) {
                sb.append(": \"");
                sb.append(C5631a1.m22443a((C5648f) obj));
                sb.append('\"');
            } else if (obj instanceof C5709q) {
                sb.append(" {");
                m22810e((C5709q) obj, sb, i + 2);
                sb.append("\n");
                m22806a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i2 = i + 2;
                m22809d(sb, i2, "key", entry.getKey());
                m22809d(sb, i2, C11755a.C11756a.f34100b, entry.getValue());
                sb.append("\n");
                m22806a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L_0x0147;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22810e(com.google.protobuf.C5677h0 r16, java.lang.StringBuilder r17, int r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r16.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01b3
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e9
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e9
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e9
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e9
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x00e9
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.C5709q.m22931E(r14, r0, r9)
            m22809d(r1, r2, r7, r9)
            r13 = 3
            goto L_0x0094
        L_0x00e9:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x0131
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x0131
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x0131
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0131
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x0131
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x0131
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.C5709q.m22931E(r13, r0, r9)
            m22809d(r1, r2, r7, r9)
            goto L_0x0147
        L_0x0131:
            r14 = 3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x014a
        L_0x0147:
            r13 = r14
            goto L_0x0094
        L_0x014a:
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x0172
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            int r15 = r9.length()
            int r15 = r15 + -5
            java.lang.String r15 = r9.substring(r8, r15)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 == 0) goto L_0x0172
            goto L_0x0147
        L_0x0172:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x0147
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.protobuf.C5709q.m22931E(r7, r0, r15)
            if (r13 != 0) goto L_0x01a1
            boolean r13 = m22807b(r7)
            if (r13 != 0) goto L_0x019f
            r13 = 1
            goto L_0x01ad
        L_0x019f:
            r13 = r8
            goto L_0x01ad
        L_0x01a1:
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.protobuf.C5709q.m22931E(r13, r0, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
        L_0x01ad:
            if (r13 == 0) goto L_0x0147
            m22809d(r1, r2, r9, r7)
            goto L_0x0147
        L_0x01b3:
            com.google.protobuf.q r0 = (com.google.protobuf.C5709q) r0
            com.google.protobuf.c1 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x01bc
            r0.mo18568l(r1, r2)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5692j0.m22810e(com.google.protobuf.h0, java.lang.StringBuilder, int):void");
    }

    /* renamed from: f */
    static String m22811f(C5677h0 h0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m22810e(h0Var, sb, 0);
        return sb.toString();
    }
}
