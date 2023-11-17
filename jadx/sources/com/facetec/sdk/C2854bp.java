package com.facetec.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facetec.sdk.bp */
public class C2854bp {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: B */
    private static int f9332B = 2;

    /* renamed from: C */
    private static long f9333C = 4030820514184252664L;

    /* renamed from: D */
    private static int f9334D = 0;

    /* renamed from: p */
    public static final Map<Integer, Object> f9335p = new HashMap();

    /* renamed from: u */
    private static Object f9336u;

    /* renamed from: v */
    private static byte[] f9337v;

    /* renamed from: w */
    private static final Map<String, Object> f9338w = new HashMap();

    /* renamed from: x */
    private static byte[] f9339x;

    /* renamed from: y */
    private static Object f9340y;

    /* renamed from: z */
    private static byte[] f9341z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if ((r1 == null) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if ((r1 != null) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r9 = (r0 & 19) + (r0 | 19);
        $11 = r9 % 128;
        r9 = r9 % 2;
        r9 = r10;
        r0 = r11;
        r5 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String $$c(short r9, short r10, short r11) {
        /*
            int r0 = $10
            int r1 = r0 + 29
            int r2 = r1 % 128
            $11 = r2
            int r1 = r1 % 2
            r2 = 20
            if (r1 != 0) goto L_0x0011
            r1 = 23
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0032
            int r11 = ~r11
            int r11 = 59 - r11
            int r11 = r11 - r4
            r1 = r10 & -72
            r10 = r10 | -72
            int r1 = r1 + r10
            r10 = r1 & 94
            r1 = r1 | 94
            int r10 = r10 + r1
            int r9 = r9 * 58
            byte[] r1 = $$a
            byte[] r2 = new byte[r11]
            if (r1 != 0) goto L_0x002e
            r5 = r4
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r5 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0032:
            int r11 = -r11
            int r11 = ~r11
            int r11 = 36 - r11
            int r11 = r11 - r4
            r1 = r10 ^ -19
            r10 = r10 & -19
            int r10 = r10 << r4
            int r1 = r1 + r10
            int r1 = r1 + 24
            int r10 = r1 + -1
            int r9 = -r9
            r1 = r9 ^ 119(0x77, float:1.67E-43)
            r9 = r9 & 119(0x77, float:1.67E-43)
            int r9 = r9 << r4
            int r9 = r9 + r1
            byte[] r1 = $$a
            byte[] r2 = new byte[r11]
            if (r1 != 0) goto L_0x0050
            r5 = r3
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            if (r5 == 0) goto L_0x0057
        L_0x0053:
            r0 = r11
            r5 = r3
            r11 = r9
            goto L_0x0082
        L_0x0057:
            r9 = r0 & 19
            r0 = r0 | 19
            int r9 = r9 + r0
            int r0 = r9 % 128
            $11 = r0
            int r9 = r9 % 2
            r9 = r10
            r0 = r11
            r5 = r3
        L_0x0065:
            int r10 = -r10
            int r10 = -r10
            r6 = r11 | r10
            int r6 = r6 << r4
            r10 = r10 ^ r11
            int r6 = r6 - r10
            r10 = r6 | -3
            int r10 = r10 << r4
            r11 = r6 ^ -3
            int r10 = r10 - r11
            int r11 = $11
            r6 = r11 | 67
            int r6 = r6 << r4
            r11 = r11 ^ 67
            int r6 = r6 - r11
            int r11 = r6 % 128
            $10 = r11
            int r6 = r6 % 2
            r11 = r10
            r10 = r9
        L_0x0082:
            r9 = r5 | 1
            int r9 = r9 << r4
            r6 = r5 ^ 1
            int r9 = r9 - r6
            byte r6 = (byte) r11
            r2[r5] = r6
            r5 = r10 | 1
            int r5 = r5 << r4
            r10 = r10 ^ r4
            int r10 = r5 - r10
            if (r9 != r0) goto L_0x00a7
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2, r3)
            int r10 = $11
            r11 = r10 | 95
            int r11 = r11 << r4
            r10 = r10 ^ 95
            int r11 = r11 - r10
            int r10 = r11 % 128
            $10 = r10
            int r11 = r11 % 2
            return r9
        L_0x00a7:
            byte r5 = r1[r10]
            int r6 = $11
            int r6 = r6 + 7
            int r7 = r6 % 128
            $10 = r7
            int r6 = r6 % 2
            r8 = r5
            r5 = r9
            r9 = r10
            r10 = r8
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2854bp.$$c(short, short, short):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v13, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v14, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v15, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v16, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v17, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v18, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v21, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v78, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v78, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v90, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v155, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v180, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v22, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v23, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v24, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v25, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v26, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v27, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v28, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v29, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v30, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v163, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v31, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v230, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v152, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v14, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v120, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v153, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v238, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v32, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v221, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v239, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v33, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v240, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v34, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v241, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v35, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v242, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v243, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v228, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v102, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v36, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v37, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v212, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v261, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v275, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v171, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v262, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v173, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v263, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v259, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v110, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v38, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v39, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v124, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v40, resolved type: java.lang.Class<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v145, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v150, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v83, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v87, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v271, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: java.lang.Class[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v27, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v28, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v29, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v30, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v46, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v47, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v48, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v81, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v87, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v104, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v105, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v106, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v108, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v110, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v111, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v117, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v118, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v120, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v123, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v124, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v125, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v126, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v127, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v128, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v129, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v130, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v131, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v137, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v139, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v245, resolved type: com.facetec.sdk.ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v141, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v6, resolved type: com.facetec.sdk.ga} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v52, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v54, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v55, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v56, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v57, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v59, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v60, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v61, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v62, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v63, resolved type: boolean[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v141, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v142, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r5v32, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v128 */
    /* JADX WARNING: type inference failed for: r12v129 */
    /* JADX WARNING: type inference failed for: r12v130 */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x1a82, code lost:
        r35 = r35;
        r42 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        if ((r4 != null) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0472, code lost:
        if (((java.lang.Boolean) java.lang.Class.forName($$c((byte) r2[180(0xb4, float:2.52E-43)], r9, (byte) r2[5])).getMethod($$c((byte) r2[500(0x1f4, float:7.0E-43)], (short) 801, (byte) (-r2[268(0x10c, float:3.76E-43)])), (java.lang.Class[]) null).invoke(r14, (java.lang.Object[]) null)).booleanValue() != false) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:?, code lost:
        r2 = r48.getDeclaredConstructor(new java.lang.Class[]{java.lang.Object.class, java.lang.Boolean.TYPE});
        r2.setAccessible(true);
        r4 = new java.lang.Object[2];
        r4[0] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x1699, code lost:
        if (r43 != false) goto L_0x169d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x169b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x169d, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:889:0x169e, code lost:
        r4[1] = java.lang.Boolean.valueOf(r3);
        f9340y = r2.newInstance(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x16ab, code lost:
        r2 = $11 + 47;
        $10 = r2 % 128;
        r2 = r2 % 2;
        r3 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:1000:0x1917 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1030:0x197d A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1031:0x197e A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1041:0x19a6 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1042:0x19a7 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1049:0x19c9 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1050:0x19ca A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1064:0x1a01 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1065:0x1a02 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1072:0x1a1e A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1073:0x1a1f A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1088:0x1a5f A[SYNTHETIC, Splitter:B:1088:0x1a5f] */
    /* JADX WARNING: Removed duplicated region for block: B:1099:0x1a7b A[Catch:{ all -> 0x1b10, all -> 0x1b06, all -> 0x1afc, all -> 0x1af2, all -> 0x1ae7, all -> 0x0272, Exception -> 0x1b1a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:1137:0x1aa0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:1153:0x1a78 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1155:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0399 A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x039d A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a4 A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03a6 A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a9 A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03ad A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ce A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d0 A[Catch:{ ClassNotFoundException -> 0x03d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e8 A[SYNTHETIC, Splitter:B:159:0x03e8] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0486 A[Catch:{ all -> 0x04f4, all -> 0x0515 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0487 A[Catch:{ all -> 0x04f4, all -> 0x0515 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5 A[SYNTHETIC, Splitter:B:23:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x062d A[Catch:{ all -> 0x0af1, all -> 0x0ae7, all -> 0x0826, all -> 0x06c4, all -> 0x0678, all -> 0x08b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x062e A[Catch:{ all -> 0x0af1, all -> 0x0ae7, all -> 0x0826, all -> 0x06c4, all -> 0x0678, all -> 0x08b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e9 A[SYNTHETIC, Splitter:B:31:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010d A[SYNTHETIC, Splitter:B:36:0x010d] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x08b6 A[Catch:{ all -> 0x0af1, all -> 0x0ae7, all -> 0x0826, all -> 0x06c4, all -> 0x0678, all -> 0x08b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x08b7 A[Catch:{ all -> 0x0af1, all -> 0x0ae7, all -> 0x0826, all -> 0x06c4, all -> 0x0678, all -> 0x08b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0e15 A[Catch:{ all -> 0x0dff, all -> 0x0e17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0e16 A[Catch:{ all -> 0x0dff, all -> 0x0e17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:640:0x1063 A[Catch:{ all -> 0x1065, all -> 0x104d, all -> 0x1043, all -> 0x1039, all -> 0x1093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:641:0x1064 A[Catch:{ all -> 0x1065, all -> 0x104d, all -> 0x1043, all -> 0x1039, all -> 0x1093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x1193 A[Catch:{ all -> 0x12f9, all -> 0x102f, all -> 0x1025, all -> 0x101b, all -> 0x11a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:701:0x1194 A[Catch:{ all -> 0x12f9, all -> 0x102f, all -> 0x1025, all -> 0x101b, all -> 0x11a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x11a1 A[Catch:{ all -> 0x12f9, all -> 0x102f, all -> 0x1025, all -> 0x101b, all -> 0x11a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:709:0x11a2 A[Catch:{ all -> 0x12f9, all -> 0x102f, all -> 0x1025, all -> 0x101b, all -> 0x11a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b3 A[SYNTHETIC, Splitter:B:76:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:861:0x1621 A[Catch:{ all -> 0x160a, all -> 0x166a }] */
    /* JADX WARNING: Removed duplicated region for block: B:862:0x1622 A[Catch:{ all -> 0x160a, all -> 0x166a }] */
    /* JADX WARNING: Removed duplicated region for block: B:932:0x1804 A[Catch:{ all -> 0x1817, all -> 0x17f4, all -> 0x17f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:933:0x1805 A[Catch:{ all -> 0x1817, all -> 0x17f4, all -> 0x17f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:940:0x1815 A[Catch:{ all -> 0x1817, all -> 0x17f4, all -> 0x17f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:941:0x1816 A[Catch:{ all -> 0x1817, all -> 0x17f4, all -> 0x17f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:986:0x18ef A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:987:0x18f0 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:999:0x1916 A[Catch:{ all -> 0x1a20, all -> 0x19cb, all -> 0x193f, all -> 0x192a, all -> 0x1918, all -> 0x18f1, all -> 0x18c4, all -> 0x18b5, all -> 0x19e1 }] */
    static {
        /*
            java.lang.Class<byte[]> r1 = byte[].class
            init$0()
            r2 = 4030820514184252664(0x37f059e6c54f4cf8, double:3.003237002848811E-39)
            f9333C = r2
            r2 = 0
            f9334D = r2
            r3 = 2
            f9332B = r3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            f9338w = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            f9335p = r4
            byte[] r4 = $$a     // Catch:{ Exception -> 0x1b1a }
            r5 = 500(0x1f4, float:7.0E-43)
            byte r6 = r4[r5]     // Catch:{ Exception -> 0x1b1a }
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x1b1a }
            r7 = 106(0x6a, float:1.49E-43)
            byte r7 = r4[r7]     // Catch:{ Exception -> 0x1b1a }
            short r7 = (short) r7     // Catch:{ Exception -> 0x1b1a }
            r8 = 16
            byte r9 = r4[r8]     // Catch:{ Exception -> 0x1b1a }
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r6 = $$c(r6, r7, r9)     // Catch:{ Exception -> 0x1b1a }
            java.lang.Object r7 = f9340y     // Catch:{ Exception -> 0x1b1a }
            r9 = 0
            if (r7 != 0) goto L_0x004a
            byte r7 = r4[r5]     // Catch:{ Exception -> 0x1b1a }
            byte r7 = (byte) r7     // Catch:{ Exception -> 0x1b1a }
            r10 = 527(0x20f, float:7.38E-43)
            short r10 = (short) r10     // Catch:{ Exception -> 0x1b1a }
            r11 = 45
            byte r11 = r4[r11]     // Catch:{ Exception -> 0x1b1a }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r7 = $$c(r7, r10, r11)     // Catch:{ Exception -> 0x1b1a }
            goto L_0x004b
        L_0x004a:
            r7 = r9
        L_0x004b:
            r10 = 29
            r11 = 179(0xb3, float:2.51E-43)
            r12 = 58
            byte r14 = r4[r12]     // Catch:{ Exception -> 0x008a }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x008a }
            r15 = r14 ^ 713(0x2c9, float:9.99E-43)
            r13 = r14 & 713(0x2c9, float:9.99E-43)
            r13 = r13 | r15
            short r13 = (short) r13     // Catch:{ Exception -> 0x008a }
            r15 = 93
            byte r15 = r4[r15]     // Catch:{ Exception -> 0x008a }
            byte r15 = (byte) r15     // Catch:{ Exception -> 0x008a }
            java.lang.String r13 = $$c(r14, r13, r15)     // Catch:{ Exception -> 0x008a }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ Exception -> 0x008a }
            byte r14 = r4[r5]     // Catch:{ Exception -> 0x008a }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x008a }
            r15 = 20
            byte r15 = r4[r15]     // Catch:{ Exception -> 0x008a }
            short r15 = (short) r15     // Catch:{ Exception -> 0x008a }
            r17 = 87
            byte r4 = r4[r17]     // Catch:{ Exception -> 0x008a }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = $$c(r14, r15, r4)     // Catch:{ Exception -> 0x008a }
            java.lang.Class[] r14 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x008a }
            java.lang.reflect.Method r4 = r13.getMethod(r4, r14)     // Catch:{ Exception -> 0x008a }
            java.lang.Object r4 = r4.invoke(r9, r9)     // Catch:{ Exception -> 0x008a }
            if (r4 == 0) goto L_0x0086
            r13 = 1
            goto L_0x0087
        L_0x0086:
            r13 = r2
        L_0x0087:
            if (r13 == 0) goto L_0x008b
            goto L_0x00b8
        L_0x008a:
            r4 = r9
        L_0x008b:
            byte[] r13 = $$a     // Catch:{ Exception -> 0x00b8 }
            byte r14 = r13[r12]     // Catch:{ Exception -> 0x00b8 }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x00b8 }
            r15 = 442(0x1ba, float:6.2E-43)
            short r15 = (short) r15     // Catch:{ Exception -> 0x00b8 }
            byte r5 = r13[r11]     // Catch:{ Exception -> 0x00b8 }
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = $$c(r14, r15, r5)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x00b8 }
            byte r14 = r13[r8]     // Catch:{ Exception -> 0x00b8 }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x00b8 }
            r15 = r14 ^ 838(0x346, float:1.174E-42)
            r11 = r14 & 838(0x346, float:1.174E-42)
            r11 = r11 | r15
            short r11 = (short) r11     // Catch:{ Exception -> 0x00b8 }
            byte r13 = r13[r10]     // Catch:{ Exception -> 0x00b8 }
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r11 = $$c(r14, r11, r13)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Class[] r13 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b8 }
            java.lang.reflect.Method r5 = r5.getMethod(r11, r13)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r4 = r5.invoke(r9, r9)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            if (r4 == 0) goto L_0x00bd
            r11 = 25
            goto L_0x00bf
        L_0x00bd:
            r11 = 38
        L_0x00bf:
            r13 = 38
            r14 = 288(0x120, float:4.04E-43)
            if (r11 == r13) goto L_0x00e1
            java.lang.Class r11 = r4.getClass()     // Catch:{ Exception -> 0x00e1 }
            byte[] r13 = $$a     // Catch:{ Exception -> 0x00e1 }
            byte r15 = r13[r8]     // Catch:{ Exception -> 0x00e1 }
            byte r15 = (byte) r15     // Catch:{ Exception -> 0x00e1 }
            r10 = r15 | 200(0xc8, float:2.8E-43)
            short r10 = (short) r10     // Catch:{ Exception -> 0x00e1 }
            byte r13 = r13[r14]     // Catch:{ Exception -> 0x00e1 }
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r10 = $$c(r15, r10, r13)     // Catch:{ Exception -> 0x00e1 }
            java.lang.reflect.Method r10 = r11.getMethod(r10, r9)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r10 = r10.invoke(r4, r9)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e2
        L_0x00e1:
            r10 = r9
        L_0x00e2:
            if (r4 == 0) goto L_0x00e6
            r11 = 1
            goto L_0x00e7
        L_0x00e6:
            r11 = r2
        L_0x00e7:
            if (r11 == 0) goto L_0x010a
            java.lang.Class r11 = r4.getClass()     // Catch:{ Exception -> 0x010a }
            byte[] r13 = $$a     // Catch:{ Exception -> 0x010a }
            byte r15 = r13[r8]     // Catch:{ Exception -> 0x010a }
            byte r15 = (byte) r15     // Catch:{ Exception -> 0x010a }
            r5 = r15 ^ 333(0x14d, float:4.67E-43)
            r12 = r15 & 333(0x14d, float:4.67E-43)
            r5 = r5 | r12
            short r5 = (short) r5     // Catch:{ Exception -> 0x010a }
            r12 = 45
            byte r12 = r13[r12]     // Catch:{ Exception -> 0x010a }
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x010a }
            java.lang.String r5 = $$c(r15, r5, r12)     // Catch:{ Exception -> 0x010a }
            java.lang.reflect.Method r5 = r11.getMethod(r5, r9)     // Catch:{ Exception -> 0x010a }
            java.lang.Object r5 = r5.invoke(r4, r9)     // Catch:{ Exception -> 0x010a }
            goto L_0x010b
        L_0x010a:
            r5 = r9
        L_0x010b:
            if (r4 == 0) goto L_0x0129
            java.lang.Class r11 = r4.getClass()     // Catch:{ Exception -> 0x0129 }
            byte[] r12 = $$a     // Catch:{ Exception -> 0x0129 }
            byte r13 = r12[r8]     // Catch:{ Exception -> 0x0129 }
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x0129 }
            r15 = 236(0xec, float:3.31E-43)
            short r15 = (short) r15     // Catch:{ Exception -> 0x0129 }
            byte r12 = r12[r14]     // Catch:{ Exception -> 0x0129 }
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = $$c(r13, r15, r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r9)     // Catch:{ Exception -> 0x0129 }
            java.lang.Object r4 = r11.invoke(r4, r9)     // Catch:{ Exception -> 0x0129 }
            goto L_0x012a
        L_0x0129:
            r4 = r9
        L_0x012a:
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r12 = 5
            r13 = 180(0xb4, float:2.52E-43)
            if (r10 == 0) goto L_0x014a
            int r7 = $11
            int r7 = r7 + 93
            int r15 = r7 % 128
            $10 = r15
            int r7 = r7 % r3
            if (r7 == 0) goto L_0x013f
            r7 = 74
            goto L_0x0141
        L_0x013f:
            r7 = 23
        L_0x0141:
            r15 = 23
            if (r7 != r15) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            throw r9     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x014a:
            if (r7 != 0) goto L_0x014e
            r10 = 1
            goto L_0x014f
        L_0x014e:
            r10 = r2
        L_0x014f:
            if (r10 == 0) goto L_0x0153
            r10 = r9
            goto L_0x0196
        L_0x0153:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1b1a }
            r10.<init>()     // Catch:{ Exception -> 0x1b1a }
            byte[] r15 = $$a     // Catch:{ Exception -> 0x1b1a }
            r19 = 184(0xb8, float:2.58E-43)
            byte r8 = r15[r19]     // Catch:{ Exception -> 0x1b1a }
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x1b1a }
            r9 = 626(0x272, float:8.77E-43)
            short r9 = (short) r9     // Catch:{ Exception -> 0x1b1a }
            byte r3 = r15[r14]     // Catch:{ Exception -> 0x1b1a }
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r3 = $$c(r8, r9, r3)     // Catch:{ Exception -> 0x1b1a }
            r10.append(r3)     // Catch:{ Exception -> 0x1b1a }
            r10.append(r7)     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x1b1a }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x1b10 }
            r8[r2] = r3     // Catch:{ all -> 0x1b10 }
            byte r3 = r15[r13]     // Catch:{ all -> 0x1b10 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x1b10 }
            r7 = 874(0x36a, float:1.225E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x1b10 }
            byte r9 = r15[r12]     // Catch:{ all -> 0x1b10 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x1b10 }
            java.lang.String r3 = $$c(r3, r7, r9)     // Catch:{ all -> 0x1b10 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x1b10 }
            r7 = 1
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ all -> 0x1b10 }
            r9[r2] = r11     // Catch:{ all -> 0x1b10 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r9)     // Catch:{ all -> 0x1b10 }
            java.lang.Object r10 = r3.newInstance(r8)     // Catch:{ all -> 0x1b10 }
        L_0x0196:
            if (r4 == 0) goto L_0x01b3
            int r3 = $11
            int r3 = r3 + 23
            int r7 = r3 % 128
            $10 = r7
            r7 = 2
            int r3 = r3 % r7
            if (r3 == 0) goto L_0x01a7
            r3 = 86
            goto L_0x01a9
        L_0x01a7:
            r3 = 90
        L_0x01a9:
            r7 = 90
            if (r3 != r7) goto L_0x01ae
            goto L_0x021b
        L_0x01ae:
            r1 = 0
            throw r1     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x01b3:
            byte[] r3 = $$a     // Catch:{ Exception -> 0x1b1a }
            byte r4 = r3[r13]     // Catch:{ Exception -> 0x1b1a }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x1b1a }
            r7 = 698(0x2ba, float:9.78E-43)
            short r7 = (short) r7     // Catch:{ Exception -> 0x1b1a }
            r8 = 58
            byte r9 = r3[r8]     // Catch:{ Exception -> 0x1b1a }
            byte r8 = (byte) r9     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r4 = $$c(r4, r7, r8)     // Catch:{ Exception -> 0x1b1a }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x1b06 }
            r8[r2] = r4     // Catch:{ all -> 0x1b06 }
            byte r4 = r3[r13]     // Catch:{ all -> 0x1b06 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x1b06 }
            byte r7 = r3[r14]     // Catch:{ all -> 0x1b06 }
            short r7 = (short) r7     // Catch:{ all -> 0x1b06 }
            r9 = 500(0x1f4, float:7.0E-43)
            byte r15 = r3[r9]     // Catch:{ all -> 0x1b06 }
            byte r9 = (byte) r15     // Catch:{ all -> 0x1b06 }
            java.lang.String r4 = $$c(r4, r7, r9)     // Catch:{ all -> 0x1b06 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1b06 }
            r7 = 16
            byte r9 = r3[r7]     // Catch:{ all -> 0x1b06 }
            byte r7 = (byte) r9     // Catch:{ all -> 0x1b06 }
            r9 = 711(0x2c7, float:9.96E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x1b06 }
            byte r15 = r3[r14]     // Catch:{ all -> 0x1b06 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x1b06 }
            java.lang.String r7 = $$c(r7, r9, r15)     // Catch:{ all -> 0x1b06 }
            r9 = 1
            java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ all -> 0x1b06 }
            r15[r2] = r11     // Catch:{ all -> 0x1b06 }
            java.lang.reflect.Method r4 = r4.getMethod(r7, r15)     // Catch:{ all -> 0x1b06 }
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r8)     // Catch:{ all -> 0x1b06 }
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x1afc }
            r7[r2] = r4     // Catch:{ all -> 0x1afc }
            byte r4 = r3[r13]     // Catch:{ all -> 0x1afc }
            byte r4 = (byte) r4     // Catch:{ all -> 0x1afc }
            r8 = 874(0x36a, float:1.225E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x1afc }
            byte r3 = r3[r12]     // Catch:{ all -> 0x1afc }
            byte r3 = (byte) r3     // Catch:{ all -> 0x1afc }
            java.lang.String r3 = $$c(r4, r8, r3)     // Catch:{ all -> 0x1afc }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x1afc }
            r4 = 1
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x1afc }
            r8[r2] = r11     // Catch:{ all -> 0x1afc }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r8)     // Catch:{ all -> 0x1afc }
            java.lang.Object r4 = r3.newInstance(r7)     // Catch:{ all -> 0x1afc }
        L_0x021b:
            if (r5 != 0) goto L_0x027c
            if (r10 == 0) goto L_0x0221
            r3 = r12
            goto L_0x0223
        L_0x0221:
            r3 = 61
        L_0x0223:
            r7 = 61
            if (r3 == r7) goto L_0x027c
            byte[] r3 = $$a     // Catch:{ Exception -> 0x1b1a }
            r5 = 500(0x1f4, float:7.0E-43)
            byte r7 = r3[r5]     // Catch:{ Exception -> 0x1b1a }
            byte r5 = (byte) r7     // Catch:{ Exception -> 0x1b1a }
            r7 = 290(0x122, float:4.06E-43)
            short r7 = (short) r7     // Catch:{ Exception -> 0x1b1a }
            r8 = 236(0xec, float:3.31E-43)
            byte r8 = r3[r8]     // Catch:{ Exception -> 0x1b1a }
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch:{ Exception -> 0x1b1a }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0272 }
            r7 = 1
            r8[r7] = r5     // Catch:{ all -> 0x0272 }
            r8[r2] = r10     // Catch:{ all -> 0x0272 }
            byte r5 = r3[r13]     // Catch:{ all -> 0x0272 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0272 }
            r7 = 874(0x36a, float:1.225E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0272 }
            byte r9 = r3[r12]     // Catch:{ all -> 0x0272 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0272 }
            java.lang.String r5 = $$c(r5, r7, r9)     // Catch:{ all -> 0x0272 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0272 }
            r9 = 2
            java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ all -> 0x0272 }
            byte r9 = r3[r13]     // Catch:{ all -> 0x0272 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0272 }
            byte r3 = r3[r12]     // Catch:{ all -> 0x0272 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x0272 }
            java.lang.String r3 = $$c(r9, r7, r3)     // Catch:{ all -> 0x0272 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0272 }
            r15[r2] = r3     // Catch:{ all -> 0x0272 }
            r3 = 1
            r15[r3] = r11     // Catch:{ all -> 0x0272 }
            java.lang.reflect.Constructor r3 = r5.getDeclaredConstructor(r15)     // Catch:{ all -> 0x0272 }
            java.lang.Object r5 = r3.newInstance(r8)     // Catch:{ all -> 0x0272 }
            goto L_0x027c
        L_0x0272:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x027b
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x027b:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x027c:
            byte[] r3 = $$a     // Catch:{ all -> 0x1af2 }
            r7 = 58
            byte r8 = r3[r7]     // Catch:{ all -> 0x1af2 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x1af2 }
            r8 = 569(0x239, float:7.97E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x1af2 }
            r9 = 179(0xb3, float:2.51E-43)
            byte r15 = r3[r9]     // Catch:{ all -> 0x1af2 }
            byte r9 = (byte) r15     // Catch:{ all -> 0x1af2 }
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch:{ all -> 0x1af2 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1af2 }
            r8 = 16
            byte r9 = r3[r8]     // Catch:{ all -> 0x1af2 }
            byte r8 = (byte) r9     // Catch:{ all -> 0x1af2 }
            r9 = r8 ^ 457(0x1c9, float:6.4E-43)
            r15 = r8 & 457(0x1c9, float:6.4E-43)
            r9 = r9 | r15
            short r9 = (short) r9     // Catch:{ all -> 0x1af2 }
            r15 = 9
            byte r14 = r3[r15]     // Catch:{ all -> 0x1af2 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x1af2 }
            java.lang.String r8 = $$c(r8, r9, r14)     // Catch:{ all -> 0x1af2 }
            r9 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ all -> 0x1af2 }
            java.lang.Object r7 = r7.invoke(r9, r9)     // Catch:{ all -> 0x1af2 }
            byte r8 = r3[r13]     // Catch:{ Exception -> 0x1b1a }
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x1b1a }
            r9 = 874(0x36a, float:1.225E-42)
            short r9 = (short) r9     // Catch:{ Exception -> 0x1b1a }
            byte r14 = r3[r12]     // Catch:{ Exception -> 0x1b1a }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r8 = $$c(r8, r9, r14)     // Catch:{ Exception -> 0x1b1a }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x1b1a }
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r15)     // Catch:{ Exception -> 0x1b1a }
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ Exception -> 0x1b1a }
            r14 = 0
            r8[r2] = r14     // Catch:{ Exception -> 0x1b1a }
            r14 = 1
            r8[r14] = r5     // Catch:{ Exception -> 0x1b1a }
            r14 = 2
            r8[r14] = r10     // Catch:{ Exception -> 0x1b1a }
            r14 = 3
            r8[r14] = r4     // Catch:{ Exception -> 0x1b1a }
            r21 = 4
            r8[r21] = r7     // Catch:{ Exception -> 0x1b1a }
            r8[r12] = r5     // Catch:{ Exception -> 0x1b1a }
            r5 = 6
            r8[r5] = r10     // Catch:{ Exception -> 0x1b1a }
            r5 = 7
            r8[r5] = r4     // Catch:{ Exception -> 0x1b1a }
            r4 = 8
            r8[r4] = r7     // Catch:{ Exception -> 0x1b1a }
            boolean[] r4 = new boolean[r15]     // Catch:{ Exception -> 0x1b1a }
            r4[r2] = r2     // Catch:{ Exception -> 0x1b1a }
            r5 = 1
            r4[r5] = r5     // Catch:{ Exception -> 0x1b1a }
            r7 = 2
            r4[r7] = r5     // Catch:{ Exception -> 0x1b1a }
            r4[r14] = r5     // Catch:{ Exception -> 0x1b1a }
            r7 = 4
            r4[r7] = r5     // Catch:{ Exception -> 0x1b1a }
            r4[r12] = r5     // Catch:{ Exception -> 0x1b1a }
            r7 = 6
            r4[r7] = r5     // Catch:{ Exception -> 0x1b1a }
            r7 = 7
            r4[r7] = r5     // Catch:{ Exception -> 0x1b1a }
            r7 = 8
            r4[r7] = r5     // Catch:{ Exception -> 0x1b1a }
            boolean[] r7 = new boolean[r15]     // Catch:{ Exception -> 0x1b1a }
            r7[r2] = r2     // Catch:{ Exception -> 0x1b1a }
            r7[r5] = r2     // Catch:{ Exception -> 0x1b1a }
            r10 = 2
            r7[r10] = r2     // Catch:{ Exception -> 0x1b1a }
            r7[r14] = r2     // Catch:{ Exception -> 0x1b1a }
            r10 = 4
            r7[r10] = r2     // Catch:{ Exception -> 0x1b1a }
            r7[r12] = r5     // Catch:{ Exception -> 0x1b1a }
            r10 = 6
            r7[r10] = r5     // Catch:{ Exception -> 0x1b1a }
            r10 = 7
            r7[r10] = r5     // Catch:{ Exception -> 0x1b1a }
            r10 = 8
            r7[r10] = r5     // Catch:{ Exception -> 0x1b1a }
            boolean[] r10 = new boolean[r15]     // Catch:{ Exception -> 0x1b1a }
            r10[r2] = r2     // Catch:{ Exception -> 0x1b1a }
            r10[r5] = r2     // Catch:{ Exception -> 0x1b1a }
            r16 = 2
            r10[r16] = r5     // Catch:{ Exception -> 0x1b1a }
            r10[r14] = r5     // Catch:{ Exception -> 0x1b1a }
            r16 = 4
            r10[r16] = r2     // Catch:{ Exception -> 0x1b1a }
            r10[r12] = r2     // Catch:{ Exception -> 0x1b1a }
            r16 = 6
            r10[r16] = r5     // Catch:{ Exception -> 0x1b1a }
            r16 = 7
            r10[r16] = r5     // Catch:{ Exception -> 0x1b1a }
            r5 = 8
            r10[r5] = r2     // Catch:{ Exception -> 0x1b1a }
            r5 = 21
            r18 = 58
            byte r13 = r3[r18]     // Catch:{ ClassNotFoundException -> 0x03d6 }
            byte r13 = (byte) r13     // Catch:{ ClassNotFoundException -> 0x03d6 }
            int r22 = $$b     // Catch:{ ClassNotFoundException -> 0x03d6 }
            r23 = r22 ^ 34
            r22 = r22 & 34
            r15 = r23 | r22
            short r15 = (short) r15     // Catch:{ ClassNotFoundException -> 0x03d6 }
            byte r12 = r3[r14]     // Catch:{ ClassNotFoundException -> 0x03d6 }
            byte r12 = (byte) r12     // Catch:{ ClassNotFoundException -> 0x03d6 }
            java.lang.String r12 = $$c(r13, r15, r12)     // Catch:{ ClassNotFoundException -> 0x03d6 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x03d6 }
            r13 = 25
            byte r15 = r3[r13]     // Catch:{ ClassNotFoundException -> 0x03d6 }
            byte r13 = (byte) r15     // Catch:{ ClassNotFoundException -> 0x03d6 }
            r15 = 664(0x298, float:9.3E-43)
            short r15 = (short) r15     // Catch:{ ClassNotFoundException -> 0x03d6 }
            r23 = 529(0x211, float:7.41E-43)
            byte r3 = r3[r23]     // Catch:{ ClassNotFoundException -> 0x03d6 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ ClassNotFoundException -> 0x03d6 }
            java.lang.String r3 = $$c(r13, r15, r3)     // Catch:{ ClassNotFoundException -> 0x03d6 }
            java.lang.reflect.Field r3 = r12.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x03d6 }
            int r3 = r3.getInt(r12)     // Catch:{ ClassNotFoundException -> 0x03d6 }
            r12 = 34
            if (r3 < r12) goto L_0x0371
            r12 = 6
            goto L_0x0373
        L_0x0371:
            r12 = 57
        L_0x0373:
            r13 = 6
            if (r12 == r13) goto L_0x0378
            r12 = r2
            goto L_0x0379
        L_0x0378:
            r12 = 1
        L_0x0379:
            r13 = 29
            if (r3 != r13) goto L_0x038e
            int r13 = $10
            r15 = r13 | 81
            r16 = 1
            int r15 = r15 << 1
            r13 = r13 ^ 81
            int r15 = r15 - r13
            int r13 = r15 % 128
            $11 = r13
            r13 = 2
            int r15 = r15 % r13
        L_0x038e:
            r13 = 26
            if (r3 < r13) goto L_0x0394
            r13 = 1
            goto L_0x0395
        L_0x0394:
            r13 = r2
        L_0x0395:
            r10[r2] = r13     // Catch:{ ClassNotFoundException -> 0x03d7 }
            if (r3 < r5) goto L_0x039d
            r13 = 1
            r16 = 1
            goto L_0x03a0
        L_0x039d:
            r16 = r2
            r13 = 1
        L_0x03a0:
            r10[r13] = r16     // Catch:{ ClassNotFoundException -> 0x03d7 }
            if (r3 < r5) goto L_0x03a6
            r15 = r2
            goto L_0x03a7
        L_0x03a6:
            r15 = r13
        L_0x03a7:
            if (r15 == r13) goto L_0x03ad
            r16 = r13
        L_0x03ab:
            r15 = 5
            goto L_0x03b0
        L_0x03ad:
            r16 = r2
            goto L_0x03ab
        L_0x03b0:
            r10[r15] = r16     // Catch:{ ClassNotFoundException -> 0x03d7 }
            r5 = 16
            if (r3 >= r5) goto L_0x03c6
            int r5 = $10
            r24 = r5 ^ 5
            r5 = r5 & r15
            int r5 = r5 << r13
            int r5 = r24 + r5
            int r13 = r5 % 128
            $11 = r13
            r13 = 2
            int r5 = r5 % r13
            r5 = 1
            goto L_0x03c7
        L_0x03c6:
            r5 = r2
        L_0x03c7:
            r13 = 4
            r10[r13] = r5     // Catch:{ ClassNotFoundException -> 0x03d7 }
            r5 = 16
            if (r3 >= r5) goto L_0x03d0
            r3 = 1
            goto L_0x03d1
        L_0x03d0:
            r3 = r2
        L_0x03d1:
            r5 = 8
            r10[r5] = r3     // Catch:{ ClassNotFoundException -> 0x03d7 }
            goto L_0x03d7
        L_0x03d6:
            r12 = r2
        L_0x03d7:
            r3 = r2
            r5 = r3
        L_0x03d9:
            if (r3 != 0) goto L_0x03de
            r13 = 67
            goto L_0x03e0
        L_0x03de:
            r13 = 76
        L_0x03e0:
            r15 = 76
            if (r13 == r15) goto L_0x1af1
            r13 = 9
            if (r5 >= r13) goto L_0x1af1
            boolean r13 = r10[r5]     // Catch:{ Exception -> 0x1b1a }
            if (r13 == 0) goto L_0x03ef
            r13 = 99
            goto L_0x03f1
        L_0x03ef:
            r13 = 85
        L_0x03f1:
            r15 = 99
            if (r13 == r15) goto L_0x0414
            r29 = r3
            r30 = r4
            r38 = r5
            r32 = r6
            r33 = r7
            r37 = r8
            r35 = r10
            r40 = r11
            r42 = r12
            r2 = 0
            r4 = 9
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            goto L_0x1a80
        L_0x0414:
            boolean r15 = r4[r5]     // Catch:{ all -> 0x1a38 }
            r14 = r8[r5]     // Catch:{ all -> 0x1a38 }
            boolean r25 = r7[r5]     // Catch:{ all -> 0x1a38 }
            if (r15 == 0) goto L_0x0523
            if (r14 == 0) goto L_0x0421
            r27 = 12
            goto L_0x0423
        L_0x0421:
            r27 = 42
        L_0x0423:
            r2 = r27
            r13 = 12
            if (r2 != r13) goto L_0x0488
            int r2 = $10
            r13 = r2 ^ 105(0x69, float:1.47E-43)
            r2 = r2 & 105(0x69, float:1.47E-43)
            r16 = 1
            int r2 = r2 << 1
            int r13 = r13 + r2
            int r2 = r13 % 128
            $11 = r2
            r2 = 2
            int r13 = r13 % r2
            byte[] r2 = $$a     // Catch:{ all -> 0x047a }
            r29 = r3
            r13 = 180(0xb4, float:2.52E-43)
            byte r3 = r2[r13]     // Catch:{ all -> 0x0478 }
            byte r3 = (byte) r3
            r30 = r4
            r13 = 5
            byte r4 = r2[r13]     // Catch:{ all -> 0x0476 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0476 }
            java.lang.String r3 = $$c(r3, r9, r4)     // Catch:{ all -> 0x0476 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0476 }
            r4 = 500(0x1f4, float:7.0E-43)
            byte r13 = r2[r4]     // Catch:{ all -> 0x0476 }
            byte r4 = (byte) r13     // Catch:{ all -> 0x0476 }
            r13 = 801(0x321, float:1.122E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0476 }
            r31 = 268(0x10c, float:3.76E-43)
            byte r2 = r2[r31]     // Catch:{ all -> 0x0476 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0476 }
            java.lang.String r2 = $$c(r4, r13, r2)     // Catch:{ all -> 0x0476 }
            r4 = 0
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch:{ all -> 0x0476 }
            java.lang.Object r2 = r2.invoke(r14, r4)     // Catch:{ all -> 0x0476 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0476 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0476 }
            if (r2 == 0) goto L_0x048c
            goto L_0x0527
        L_0x0476:
            r0 = move-exception
            goto L_0x047f
        L_0x0478:
            r0 = move-exception
            goto L_0x047d
        L_0x047a:
            r0 = move-exception
            r29 = r3
        L_0x047d:
            r30 = r4
        L_0x047f:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0515 }
            if (r3 == 0) goto L_0x0487
            throw r3     // Catch:{ all -> 0x0515 }
        L_0x0487:
            throw r2     // Catch:{ all -> 0x0515 }
        L_0x0488:
            r29 = r3
            r30 = r4
        L_0x048c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0515 }
            r2.<init>()     // Catch:{ all -> 0x0515 }
            byte[] r3 = $$a     // Catch:{ all -> 0x0515 }
            r4 = 52
            byte r4 = r3[r4]     // Catch:{ all -> 0x0515 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0515 }
            r13 = 410(0x19a, float:5.75E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0515 }
            r15 = 926(0x39e, float:1.298E-42)
            byte r15 = r3[r15]     // Catch:{ all -> 0x0515 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0515 }
            java.lang.String r4 = $$c(r4, r13, r15)     // Catch:{ all -> 0x0515 }
            r2.append(r4)     // Catch:{ all -> 0x0515 }
            r2.append(r14)     // Catch:{ all -> 0x0515 }
            r4 = 410(0x19a, float:5.75E-43)
            byte r4 = r3[r4]     // Catch:{ all -> 0x0515 }
            r13 = r4 & -1
            r4 = r4 | -1
            int r13 = r13 + r4
            byte r4 = (byte) r13
            r13 = 270(0x10e, float:3.78E-43)
            short r13 = (short) r13
            r14 = 25
            byte r15 = r3[r14]     // Catch:{ all -> 0x04fe }
            r14 = 1
            int r15 = r15 - r14
            byte r15 = (byte) r15
            java.lang.String r4 = $$c(r4, r13, r15)     // Catch:{ all -> 0x0515 }
            r2.append(r4)     // Catch:{ all -> 0x0515 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0515 }
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x04f4 }
            r13 = 0
            r4[r13] = r2     // Catch:{ all -> 0x04f4 }
            r2 = 180(0xb4, float:2.52E-43)
            byte r13 = r3[r2]     // Catch:{ all -> 0x04f4 }
            byte r2 = (byte) r13     // Catch:{ all -> 0x04f4 }
            r13 = 808(0x328, float:1.132E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x04f4 }
            r14 = 101(0x65, float:1.42E-43)
            byte r3 = r3[r14]     // Catch:{ all -> 0x04f4 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x04f4 }
            java.lang.String r2 = $$c(r2, r13, r3)     // Catch:{ all -> 0x04f4 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x04f4 }
            r3 = 1
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x04f4 }
            r3 = 0
            r13[r3] = r11     // Catch:{ all -> 0x04f4 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r13)     // Catch:{ all -> 0x04f4 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ all -> 0x04f4 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x04f4 }
            throw r2     // Catch:{ all -> 0x04f4 }
        L_0x04f4:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0515 }
            if (r3 == 0) goto L_0x04fd
            throw r3     // Catch:{ all -> 0x0515 }
        L_0x04fd:
            throw r2     // Catch:{ all -> 0x0515 }
        L_0x04fe:
            r0 = move-exception
            r2 = r0
            r38 = r5
            r32 = r6
            r33 = r7
            r37 = r8
            r35 = r10
            r40 = r11
            r42 = r12
            r10 = r14
        L_0x050f:
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x08d0
        L_0x0515:
            r0 = move-exception
            r2 = r0
            r38 = r5
            r32 = r6
            r33 = r7
            r37 = r8
            r35 = r10
            goto L_0x08c6
        L_0x0523:
            r29 = r3
            r30 = r4
        L_0x0527:
            if (r15 == 0) goto L_0x08d4
            java.util.Random r3 = new java.util.Random     // Catch:{ all -> 0x08ba }
            r3.<init>()     // Catch:{ all -> 0x08ba }
            int r4 = $11
            int r4 = r4 + 82
            r13 = 1
            int r4 = r4 - r13
            int r13 = r4 % 128
            $10 = r13
            r13 = 2
            int r4 = r4 % r13
            byte[] r4 = $$a     // Catch:{ all -> 0x08a4 }
            r13 = 180(0xb4, float:2.52E-43)
            byte r2 = r4[r13]     // Catch:{ all -> 0x08a4 }
            byte r2 = (byte) r2
            r32 = r6
            r13 = 288(0x120, float:4.04E-43)
            byte r6 = r4[r13]     // Catch:{ all -> 0x08a0 }
            short r6 = (short) r6
            r33 = r7
            r13 = 500(0x1f4, float:7.0E-43)
            byte r7 = r4[r13]     // Catch:{ all -> 0x089c }
            byte r7 = (byte) r7     // Catch:{ all -> 0x089c }
            java.lang.String r2 = $$c(r2, r6, r7)     // Catch:{ all -> 0x089c }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x089c }
            byte r6 = r4[r13]     // Catch:{ all -> 0x089c }
            byte r6 = (byte) r6     // Catch:{ all -> 0x089c }
            r7 = 910(0x38e, float:1.275E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x089c }
            r13 = 96
            byte r4 = r4[r13]     // Catch:{ all -> 0x089c }
            byte r4 = (byte) r4     // Catch:{ all -> 0x089c }
            java.lang.String r4 = $$c(r6, r7, r4)     // Catch:{ all -> 0x089c }
            r6 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch:{ all -> 0x089c }
            java.lang.Object r2 = r2.invoke(r6, r6)     // Catch:{ all -> 0x089c }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x089c }
            long r6 = r2.longValue()     // Catch:{ all -> 0x089c }
            r34 = 2063014731(0x7af71b4b, double:1.0192647055E-314)
            long r6 = r6 ^ r34
            r3.setSeed(r6)     // Catch:{ all -> 0x0898 }
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x0581:
            if (r2 != 0) goto L_0x0586
            r13 = 81
            goto L_0x0588
        L_0x0586:
            r13 = 28
        L_0x0588:
            r34 = r2
            r2 = 81
            if (r13 == r2) goto L_0x0596
            r38 = r5
            r37 = r8
            r35 = r10
            goto L_0x08e3
        L_0x0596:
            if (r4 != 0) goto L_0x059a
            r2 = 6
            goto L_0x05a3
        L_0x059a:
            if (r6 != 0) goto L_0x059e
            r2 = 5
            goto L_0x05a3
        L_0x059e:
            if (r7 != 0) goto L_0x05a2
            r2 = 4
            goto L_0x05a3
        L_0x05a2:
            r2 = 3
        L_0x05a3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0898 }
            r35 = r2 ^ 1
            r36 = r2 & 1
            r16 = 1
            int r36 = r36 << 1
            r37 = r8
            int r8 = r35 + r36
            r13.<init>(r8)     // Catch:{ all -> 0x0894 }
            r8 = 46
            r13.append(r8)     // Catch:{ all -> 0x0894 }
            r8 = 0
        L_0x05ba:
            if (r8 >= r2) goto L_0x05bf
            r35 = 45
            goto L_0x05c1
        L_0x05bf:
            r35 = 22
        L_0x05c1:
            r36 = r2
            r2 = r35
            r35 = r10
            r10 = 45
            if (r2 == r10) goto L_0x0835
            java.lang.String r2 = r13.toString()     // Catch:{ all -> 0x0830 }
            if (r4 != 0) goto L_0x062f
            int r4 = $10
            r8 = r4 ^ 17
            r4 = r4 & 17
            r10 = 1
            int r4 = r4 << r10
            int r8 = r8 + r4
            int r4 = r8 % 128
            $11 = r4
            r4 = 2
            int r8 = r8 % r4
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0623 }
            r4 = 1
            r8[r4] = r2     // Catch:{ all -> 0x0623 }
            r2 = 0
            r8[r2] = r14     // Catch:{ all -> 0x0623 }
            byte[] r2 = $$a     // Catch:{ all -> 0x0623 }
            r4 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r4]     // Catch:{ all -> 0x0623 }
            byte r4 = (byte) r10     // Catch:{ all -> 0x0623 }
            r10 = 5
            byte r13 = r2[r10]     // Catch:{ all -> 0x0623 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x0623 }
            java.lang.String r4 = $$c(r4, r9, r10)     // Catch:{ all -> 0x0623 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0623 }
            r10 = 2
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x0623 }
            r38 = r5
            r10 = 180(0xb4, float:2.52E-43)
            byte r5 = r2[r10]     // Catch:{ all -> 0x0621 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0621 }
            r10 = 5
            byte r2 = r2[r10]     // Catch:{ all -> 0x0621 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0621 }
            java.lang.String r2 = $$c(r5, r9, r2)     // Catch:{ all -> 0x0621 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0621 }
            r5 = 0
            r13[r5] = r2     // Catch:{ all -> 0x0621 }
            r2 = 1
            r13[r2] = r11     // Catch:{ all -> 0x0621 }
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r13)     // Catch:{ all -> 0x0621 }
            java.lang.Object r2 = r2.newInstance(r8)     // Catch:{ all -> 0x0621 }
            r4 = r2
            goto L_0x0672
        L_0x0621:
            r0 = move-exception
            goto L_0x0626
        L_0x0623:
            r0 = move-exception
            r38 = r5
        L_0x0626:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x062e
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x062e:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x062f:
            r38 = r5
            if (r6 != 0) goto L_0x0682
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0678 }
            r5 = 1
            r6[r5] = r2     // Catch:{ all -> 0x0678 }
            r2 = 0
            r6[r2] = r14     // Catch:{ all -> 0x0678 }
            byte[] r2 = $$a     // Catch:{ all -> 0x0678 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r5]     // Catch:{ all -> 0x0678 }
            byte r5 = (byte) r8     // Catch:{ all -> 0x0678 }
            r8 = 5
            byte r10 = r2[r8]     // Catch:{ all -> 0x0678 }
            byte r8 = (byte) r10     // Catch:{ all -> 0x0678 }
            java.lang.String r5 = $$c(r5, r9, r8)     // Catch:{ all -> 0x0678 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0678 }
            r8 = 2
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0678 }
            r8 = 180(0xb4, float:2.52E-43)
            byte r13 = r2[r8]     // Catch:{ all -> 0x0678 }
            byte r8 = (byte) r13     // Catch:{ all -> 0x0678 }
            r13 = 5
            byte r2 = r2[r13]     // Catch:{ all -> 0x0678 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0678 }
            java.lang.String r2 = $$c(r8, r9, r2)     // Catch:{ all -> 0x0678 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0678 }
            r8 = 0
            r10[r8] = r2     // Catch:{ all -> 0x0678 }
            r2 = 1
            r10[r2] = r11     // Catch:{ all -> 0x0678 }
            java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r10)     // Catch:{ all -> 0x0678 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ all -> 0x0678 }
            r6 = r2
        L_0x0672:
            r42 = r14
            r2 = r34
            goto L_0x0780
        L_0x0678:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x0681
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x0681:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x0682:
            if (r7 != 0) goto L_0x06ce
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x06c4 }
            r5 = 1
            r7[r5] = r2     // Catch:{ all -> 0x06c4 }
            r2 = 0
            r7[r2] = r14     // Catch:{ all -> 0x06c4 }
            byte[] r2 = $$a     // Catch:{ all -> 0x06c4 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r5]     // Catch:{ all -> 0x06c4 }
            byte r5 = (byte) r8     // Catch:{ all -> 0x06c4 }
            r8 = 5
            byte r10 = r2[r8]     // Catch:{ all -> 0x06c4 }
            byte r8 = (byte) r10     // Catch:{ all -> 0x06c4 }
            java.lang.String r5 = $$c(r5, r9, r8)     // Catch:{ all -> 0x06c4 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x06c4 }
            r8 = 2
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x06c4 }
            r8 = 180(0xb4, float:2.52E-43)
            byte r13 = r2[r8]     // Catch:{ all -> 0x06c4 }
            byte r8 = (byte) r13     // Catch:{ all -> 0x06c4 }
            r13 = 5
            byte r2 = r2[r13]     // Catch:{ all -> 0x06c4 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x06c4 }
            java.lang.String r2 = $$c(r8, r9, r2)     // Catch:{ all -> 0x06c4 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x06c4 }
            r8 = 0
            r10[r8] = r2     // Catch:{ all -> 0x06c4 }
            r2 = 1
            r10[r2] = r11     // Catch:{ all -> 0x06c4 }
            java.lang.reflect.Constructor r2 = r5.getDeclaredConstructor(r10)     // Catch:{ all -> 0x06c4 }
            java.lang.Object r2 = r2.newInstance(r7)     // Catch:{ all -> 0x06c4 }
            r7 = r2
            goto L_0x0672
        L_0x06c4:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x06cd
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x06cd:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x06ce:
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0826 }
            r5 = 1
            r8[r5] = r2     // Catch:{ all -> 0x0826 }
            r2 = 0
            r8[r2] = r14     // Catch:{ all -> 0x0826 }
            byte[] r2 = $$a     // Catch:{ all -> 0x0826 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r5]     // Catch:{ all -> 0x0826 }
            byte r5 = (byte) r10     // Catch:{ all -> 0x0826 }
            r10 = 5
            byte r13 = r2[r10]     // Catch:{ all -> 0x0826 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x0826 }
            java.lang.String r5 = $$c(r5, r9, r10)     // Catch:{ all -> 0x0826 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0826 }
            r10 = 2
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x0826 }
            r39 = r4
            r10 = 180(0xb4, float:2.52E-43)
            byte r4 = r2[r10]     // Catch:{ all -> 0x0826 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0826 }
            r40 = r6
            r10 = 5
            byte r6 = r2[r10]     // Catch:{ all -> 0x0826 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0826 }
            java.lang.String r4 = $$c(r4, r9, r6)     // Catch:{ all -> 0x0826 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0826 }
            r6 = 0
            r13[r6] = r4     // Catch:{ all -> 0x0826 }
            r4 = 1
            r13[r4] = r11     // Catch:{ all -> 0x0826 }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r13)     // Catch:{ all -> 0x0826 }
            java.lang.Object r5 = r5.newInstance(r8)     // Catch:{ all -> 0x0826 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0794 }
            r4 = 0
            r6[r4] = r5     // Catch:{ all -> 0x0794 }
            r4 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r4]     // Catch:{ all -> 0x0794 }
            byte r4 = (byte) r8     // Catch:{ all -> 0x0794 }
            r8 = 778(0x30a, float:1.09E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0794 }
            r10 = 3
            byte r13 = r2[r10]     // Catch:{ all -> 0x0794 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x0794 }
            java.lang.String r4 = $$c(r4, r8, r10)     // Catch:{ all -> 0x0794 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0794 }
            r10 = 1
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x0794 }
            r41 = r7
            r10 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r10]     // Catch:{ all -> 0x0794 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0794 }
            r42 = r14
            r10 = 5
            byte r14 = r2[r10]     // Catch:{ all -> 0x0794 }
            byte r10 = (byte) r14     // Catch:{ all -> 0x0794 }
            java.lang.String r7 = $$c(r7, r9, r10)     // Catch:{ all -> 0x0794 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0794 }
            r10 = 0
            r13[r10] = r7     // Catch:{ all -> 0x0794 }
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r13)     // Catch:{ all -> 0x0794 }
            java.lang.Object r4 = r4.newInstance(r6)     // Catch:{ all -> 0x0794 }
            r6 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r6]     // Catch:{ all -> 0x078a }
            byte r6 = (byte) r7     // Catch:{ all -> 0x078a }
            r7 = 3
            byte r10 = r2[r7]     // Catch:{ all -> 0x078a }
            byte r7 = (byte) r10     // Catch:{ all -> 0x078a }
            java.lang.String r6 = $$c(r6, r8, r7)     // Catch:{ all -> 0x078a }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x078a }
            r7 = 500(0x1f4, float:7.0E-43)
            byte r8 = r2[r7]     // Catch:{ all -> 0x078a }
            byte r7 = (byte) r8     // Catch:{ all -> 0x078a }
            r8 = r7 ^ 674(0x2a2, float:9.44E-43)
            r10 = r7 & 674(0x2a2, float:9.44E-43)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch:{ all -> 0x078a }
            r10 = 926(0x39e, float:1.298E-42)
            byte r2 = r2[r10]     // Catch:{ all -> 0x078a }
            byte r2 = (byte) r2     // Catch:{ all -> 0x078a }
            java.lang.String r2 = $$c(r7, r8, r2)     // Catch:{ all -> 0x078a }
            r7 = 0
            java.lang.reflect.Method r2 = r6.getMethod(r2, r7)     // Catch:{ all -> 0x078a }
            r2.invoke(r4, r7)     // Catch:{ all -> 0x078a }
            r2 = r5
            r4 = r39
            r6 = r40
            r7 = r41
        L_0x0780:
            r10 = r35
            r8 = r37
            r5 = r38
            r14 = r42
            goto L_0x0581
        L_0x078a:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ Exception -> 0x079e }
            if (r3 == 0) goto L_0x0793
            throw r3     // Catch:{ Exception -> 0x079e }
        L_0x0793:
            throw r2     // Catch:{ Exception -> 0x079e }
        L_0x0794:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ Exception -> 0x079e }
            if (r3 == 0) goto L_0x079d
            throw r3     // Catch:{ Exception -> 0x079e }
        L_0x079d:
            throw r2     // Catch:{ Exception -> 0x079e }
        L_0x079e:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x08b8 }
            r3.<init>()     // Catch:{ all -> 0x08b8 }
            byte[] r4 = $$a     // Catch:{ all -> 0x08b8 }
            r6 = 52
            byte r6 = r4[r6]     // Catch:{ all -> 0x08b8 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x08b8 }
            r7 = 906(0x38a, float:1.27E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x08b8 }
            r8 = 926(0x39e, float:1.298E-42)
            byte r8 = r4[r8]     // Catch:{ all -> 0x08b8 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x08b8 }
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch:{ all -> 0x08b8 }
            r3.append(r6)     // Catch:{ all -> 0x08b8 }
            r3.append(r5)     // Catch:{ all -> 0x08b8 }
            r5 = 410(0x19a, float:5.75E-43)
            byte r5 = r4[r5]     // Catch:{ all -> 0x08b8 }
            r6 = r5 & -1
            r5 = r5 | -1
            int r6 = r6 + r5
            byte r5 = (byte) r6
            r6 = 270(0x10e, float:3.78E-43)
            short r6 = (short) r6
            r7 = 25
            byte r8 = r4[r7]     // Catch:{ all -> 0x081d }
            r7 = 0
            int r8 = r8 - r7
            r7 = 1
            int r8 = r8 - r7
            byte r7 = (byte) r8
            java.lang.String r5 = $$c(r5, r6, r7)     // Catch:{ all -> 0x08b8 }
            r3.append(r5)     // Catch:{ all -> 0x08b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x08b8 }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0813 }
            r5 = 1
            r6[r5] = r2     // Catch:{ all -> 0x0813 }
            r2 = 0
            r6[r2] = r3     // Catch:{ all -> 0x0813 }
            r2 = 180(0xb4, float:2.52E-43)
            byte r3 = r4[r2]     // Catch:{ all -> 0x0813 }
            byte r2 = (byte) r3     // Catch:{ all -> 0x0813 }
            r3 = 808(0x328, float:1.132E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0813 }
            r5 = 101(0x65, float:1.42E-43)
            byte r4 = r4[r5]     // Catch:{ all -> 0x0813 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0813 }
            java.lang.String r2 = $$c(r2, r3, r4)     // Catch:{ all -> 0x0813 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0813 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0813 }
            r3 = 0
            r4[r3] = r11     // Catch:{ all -> 0x0813 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x0813 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ all -> 0x0813 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ all -> 0x0813 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0813 }
            throw r2     // Catch:{ all -> 0x0813 }
        L_0x0813:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x081c
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x081c:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x081d:
            r0 = move-exception
            r2 = r0
            r10 = r7
            r40 = r11
            r42 = r12
            goto L_0x050f
        L_0x0826:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x082f
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x082f:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x0830:
            r0 = move-exception
            r38 = r5
            goto L_0x08c5
        L_0x0835:
            r39 = r4
            r38 = r5
            r40 = r6
            r41 = r7
            r42 = r14
            if (r25 == 0) goto L_0x086d
            r2 = 26
            int r2 = r3.nextInt(r2)     // Catch:{ all -> 0x08b8 }
            boolean r4 = r3.nextBoolean()     // Catch:{ all -> 0x08b8 }
            if (r4 == 0) goto L_0x0850
            r4 = 84
            goto L_0x0852
        L_0x0850:
            r4 = 92
        L_0x0852:
            r5 = 84
            if (r4 == r5) goto L_0x0861
            int r2 = -r2
            int r2 = -r2
            r4 = r2 ^ 96
            r5 = 96
            r2 = r2 & r5
            r5 = 1
            int r2 = r2 << r5
            int r4 = r4 + r2
            goto L_0x0868
        L_0x0861:
            r5 = 1
            r4 = r2 | 65
            int r4 = r4 << r5
            r2 = r2 ^ 65
            int r4 = r4 - r2
        L_0x0868:
            char r2 = (char) r4     // Catch:{ all -> 0x08b8 }
            r13.append(r2)     // Catch:{ all -> 0x08b8 }
            goto L_0x087e
        L_0x086d:
            r2 = 12
            int r2 = r3.nextInt(r2)     // Catch:{ all -> 0x08b8 }
            r4 = r2 ^ 8192(0x2000, float:1.14794E-41)
            r2 = r2 & 8192(0x2000, float:1.14794E-41)
            r5 = 1
            int r2 = r2 << r5
            int r4 = r4 + r2
            char r2 = (char) r4     // Catch:{ all -> 0x08b8 }
            r13.append(r2)     // Catch:{ all -> 0x08b8 }
        L_0x087e:
            r2 = r8 & 1
            r4 = r8 | 1
            int r8 = r2 + r4
            r10 = r35
            r2 = r36
            r5 = r38
            r4 = r39
            r6 = r40
            r7 = r41
            r14 = r42
            goto L_0x05ba
        L_0x0894:
            r0 = move-exception
            r38 = r5
            goto L_0x08c3
        L_0x0898:
            r0 = move-exception
            r38 = r5
            goto L_0x08c1
        L_0x089c:
            r0 = move-exception
            r38 = r5
            goto L_0x08ab
        L_0x08a0:
            r0 = move-exception
            r38 = r5
            goto L_0x08a9
        L_0x08a4:
            r0 = move-exception
            r38 = r5
            r32 = r6
        L_0x08a9:
            r33 = r7
        L_0x08ab:
            r37 = r8
            r35 = r10
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x08b7
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x08b7:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x08b8:
            r0 = move-exception
            goto L_0x08c5
        L_0x08ba:
            r0 = move-exception
            r38 = r5
            r32 = r6
            r33 = r7
        L_0x08c1:
            r37 = r8
        L_0x08c3:
            r35 = r10
        L_0x08c5:
            r2 = r0
        L_0x08c6:
            r40 = r11
            r42 = r12
        L_0x08ca:
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
        L_0x08d0:
            r15 = 58
            goto L_0x1a54
        L_0x08d4:
            r38 = r5
            r32 = r6
            r33 = r7
            r37 = r8
            r35 = r10
            r4 = 0
            r6 = 0
            r7 = 0
            r34 = 0
        L_0x08e3:
            r2 = 10380(0x288c, float:1.4545E-41)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x1a36 }
            java.lang.Class<com.facetec.sdk.bp> r3 = com.facetec.sdk.C2854bp.class
            byte[] r5 = $$a     // Catch:{ all -> 0x1a36 }
            r8 = 184(0xb8, float:2.58E-43)
            byte r8 = r5[r8]     // Catch:{ all -> 0x1a36 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x1a36 }
            r10 = r8 ^ 688(0x2b0, float:9.64E-43)
            r13 = r8 & 688(0x2b0, float:9.64E-43)
            r10 = r10 | r13
            short r10 = (short) r10     // Catch:{ all -> 0x1a36 }
            r13 = 101(0x65, float:1.42E-43)
            byte r14 = r5[r13]     // Catch:{ all -> 0x1a36 }
            byte r13 = (byte) r14     // Catch:{ all -> 0x1a36 }
            java.lang.String r8 = $$c(r8, r10, r13)     // Catch:{ all -> 0x1a36 }
            java.io.InputStream r3 = r3.getResourceAsStream(r8)     // Catch:{ all -> 0x1a36 }
            int r8 = $11
            r10 = r8 & 5
            r13 = 5
            r8 = r8 | r13
            int r10 = r10 + r8
            int r8 = r10 % 128
            $10 = r8
            r8 = 2
            int r10 = r10 % r8
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x1a20 }
            r8 = 0
            r10[r8] = r3     // Catch:{ all -> 0x1a20 }
            r3 = 180(0xb4, float:2.52E-43)
            byte r8 = r5[r3]     // Catch:{ all -> 0x1a20 }
            byte r3 = (byte) r8     // Catch:{ all -> 0x1a20 }
            r13 = 499(0x1f3, float:6.99E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x1a20 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x1a20 }
            java.lang.String r3 = $$c(r3, r13, r8)     // Catch:{ all -> 0x1a20 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x1a20 }
            r8 = 1
            java.lang.Class[] r14 = new java.lang.Class[r8]     // Catch:{ all -> 0x1a20 }
            r25 = r4
            r8 = 180(0xb4, float:2.52E-43)
            byte r4 = r5[r8]     // Catch:{ all -> 0x1a20 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x1a20 }
            r8 = r4 | 978(0x3d2, float:1.37E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x1a20 }
            r36 = r6
            r26 = 101(0x65, float:1.42E-43)
            byte r6 = r5[r26]     // Catch:{ all -> 0x1a20 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x1a20 }
            java.lang.String r4 = $$c(r4, r8, r6)     // Catch:{ all -> 0x1a20 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1a20 }
            r6 = 0
            r14[r6] = r4     // Catch:{ all -> 0x1a20 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r14)     // Catch:{ all -> 0x1a20 }
            java.lang.Object r3 = r3.newInstance(r10)     // Catch:{ all -> 0x1a20 }
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x1a0a }
            r8[r6] = r2     // Catch:{ all -> 0x1a0a }
            r4 = 180(0xb4, float:2.52E-43)
            byte r6 = r5[r4]     // Catch:{ all -> 0x1a0a }
            byte r4 = (byte) r6     // Catch:{ all -> 0x1a0a }
            byte r6 = (byte) r6     // Catch:{ all -> 0x1a0a }
            java.lang.String r4 = $$c(r4, r13, r6)     // Catch:{ all -> 0x1a0a }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1a0a }
            r6 = 21
            byte r10 = r5[r6]     // Catch:{ all -> 0x1a03 }
            byte r6 = (byte) r10
            r10 = 208(0xd0, float:2.91E-43)
            short r10 = (short) r10
            r14 = 166(0xa6, float:2.33E-43)
            byte r14 = r5[r14]     // Catch:{ all -> 0x1a0a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x1a0a }
            java.lang.String r6 = $$c(r6, r10, r14)     // Catch:{ all -> 0x1a0a }
            r10 = 1
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x1a0a }
            r10 = 0
            r14[r10] = r1     // Catch:{ all -> 0x1a0a }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r14)     // Catch:{ all -> 0x1a0a }
            r4.invoke(r3, r8)     // Catch:{ all -> 0x1a0a }
            r4 = 180(0xb4, float:2.52E-43)
            byte r6 = r5[r4]     // Catch:{ all -> 0x19ed }
            byte r4 = (byte) r6     // Catch:{ all -> 0x19ed }
            byte r6 = (byte) r6     // Catch:{ all -> 0x19ed }
            java.lang.String r4 = $$c(r4, r13, r6)     // Catch:{ all -> 0x19ed }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x19ed }
            r6 = 500(0x1f4, float:7.0E-43)
            byte r8 = r5[r6]     // Catch:{ all -> 0x19e4 }
            byte r6 = (byte) r8
            r8 = r6 ^ 674(0x2a2, float:9.44E-43)
            r10 = r6 & 674(0x2a2, float:9.44E-43)
            r8 = r8 | r10
            short r8 = (short) r8
            r10 = 926(0x39e, float:1.298E-42)
            byte r5 = r5[r10]     // Catch:{ all -> 0x19ed }
            byte r5 = (byte) r5     // Catch:{ all -> 0x19ed }
            java.lang.String r5 = $$c(r6, r8, r5)     // Catch:{ all -> 0x19ed }
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x19ed }
            r4.invoke(r3, r6)     // Catch:{ all -> 0x19ed }
            r3 = 20
            r4 = 10337(0x2861, float:1.4485E-41)
            r6 = r32
            r5 = 0
        L_0x09b0:
            r8 = r3 & 258(0x102, float:3.62E-43)
            r10 = r3 | 258(0x102, float:3.62E-43)
            int r8 = r8 + r10
            r10 = r3 ^ 10359(0x2877, float:1.4516E-41)
            r13 = r3 & 10359(0x2877, float:1.4516E-41)
            r14 = 1
            int r13 = r13 << r14
            int r10 = r10 + r13
            byte r10 = r2[r10]     // Catch:{ all -> 0x1a36 }
            int r10 = r10 + -55
            int r10 = r10 - r14
            byte r10 = (byte) r10     // Catch:{ all -> 0x1a36 }
            r2[r8] = r10     // Catch:{ all -> 0x1a36 }
            int r8 = r2.length     // Catch:{ all -> 0x1a36 }
            int r10 = -r3
            r13 = r8 & r10
            r8 = r8 | r10
            int r13 = r13 + r8
            r8 = 3
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x19cb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x19cb }
            r13 = 2
            r10[r13] = r8     // Catch:{ all -> 0x19cb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x19cb }
            r13 = 1
            r10[r13] = r8     // Catch:{ all -> 0x19cb }
            r8 = 0
            r10[r8] = r2     // Catch:{ all -> 0x19cb }
            byte[] r2 = $$a     // Catch:{ all -> 0x19cb }
            r8 = 180(0xb4, float:2.52E-43)
            byte r13 = r2[r8]     // Catch:{ all -> 0x19cb }
            byte r8 = (byte) r13     // Catch:{ all -> 0x19cb }
            r13 = 146(0x92, float:2.05E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x19cb }
            r14 = 22
            byte r14 = r2[r14]     // Catch:{ all -> 0x19cb }
            byte r14 = (byte) r14     // Catch:{ all -> 0x19cb }
            java.lang.String r8 = $$c(r8, r13, r14)     // Catch:{ all -> 0x19cb }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x19cb }
            r13 = 3
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x19cb }
            r13 = 0
            r14[r13] = r1     // Catch:{ all -> 0x19cb }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x19cb }
            r16 = 1
            r14[r16] = r13     // Catch:{ all -> 0x19cb }
            r20 = 2
            r14[r20] = r13     // Catch:{ all -> 0x19cb }
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r14)     // Catch:{ all -> 0x19cb }
            java.lang.Object r8 = r8.newInstance(r10)     // Catch:{ all -> 0x19cb }
            r40 = r8
            java.io.InputStream r40 = (java.io.InputStream) r40     // Catch:{ all -> 0x19cb }
            java.lang.Object r8 = f9340y     // Catch:{ all -> 0x1a36 }
            if (r8 != 0) goto L_0x0afb
            r8 = 58
            byte r10 = r2[r8]     // Catch:{ all -> 0x0af1 }
            byte r8 = (byte) r10     // Catch:{ all -> 0x0af1 }
            r10 = r8 | 72
            short r10 = (short) r10     // Catch:{ all -> 0x0af1 }
            r13 = 119(0x77, float:1.67E-43)
            byte r13 = r2[r13]     // Catch:{ all -> 0x0af1 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0af1 }
            java.lang.String r8 = $$c(r8, r10, r13)     // Catch:{ all -> 0x0af1 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0af1 }
            r10 = 16
            byte r13 = r2[r10]     // Catch:{ all -> 0x0af1 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x0af1 }
            r13 = r10 ^ 233(0xe9, float:3.27E-43)
            r14 = r10 & 233(0xe9, float:3.27E-43)
            r13 = r13 | r14
            short r13 = (short) r13     // Catch:{ all -> 0x0af1 }
            r46 = r4
            r14 = 179(0xb3, float:2.51E-43)
            byte r4 = r2[r14]     // Catch:{ all -> 0x0af1 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0af1 }
            java.lang.String r4 = $$c(r10, r13, r4)     // Catch:{ all -> 0x0af1 }
            r10 = 0
            java.lang.reflect.Method r4 = r8.getMethod(r4, r10)     // Catch:{ all -> 0x0af1 }
            java.lang.Object r4 = r4.invoke(r10, r10)     // Catch:{ all -> 0x0af1 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0af1 }
            long r13 = r4.longValue()     // Catch:{ all -> 0x0af1 }
            r41 = 0
            int r4 = (r13 > r41 ? 1 : (r13 == r41 ? 0 : -1))
            int r4 = -r4
            int r4 = ~r4
            r8 = -423285277(0xffffffffe6c52de3, float:-4.6557633E23)
            int r8 = r8 - r4
            r4 = 1
            int r8 = r8 - r4
            java.lang.String r10 = ""
            java.lang.String r13 = ""
            r47 = r7
            r14 = 2
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x0ae7 }
            r7[r4] = r13     // Catch:{ all -> 0x0ae7 }
            r4 = 0
            r7[r4] = r10     // Catch:{ all -> 0x0ae7 }
            r4 = 58
            byte r10 = r2[r4]     // Catch:{ all -> 0x0ae7 }
            byte r4 = (byte) r10     // Catch:{ all -> 0x0ae7 }
            r10 = 826(0x33a, float:1.157E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0ae7 }
            r13 = 179(0xb3, float:2.51E-43)
            byte r14 = r2[r13]     // Catch:{ all -> 0x0ae7 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0ae7 }
            java.lang.String r4 = $$c(r4, r10, r14)     // Catch:{ all -> 0x0ae7 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0ae7 }
            byte r10 = r2[r13]     // Catch:{ all -> 0x0ae7 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0ae7 }
            r13 = 226(0xe2, float:3.17E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0ae7 }
            r14 = 529(0x211, float:7.41E-43)
            byte r14 = r2[r14]     // Catch:{ all -> 0x0ae7 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0ae7 }
            java.lang.String r10 = $$c(r10, r13, r14)     // Catch:{ all -> 0x0ae7 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0ae7 }
            java.lang.Class<java.lang.CharSequence> r13 = java.lang.CharSequence.class
            r28 = 0
            r14[r28] = r13     // Catch:{ all -> 0x0ae7 }
            java.lang.Class<java.lang.CharSequence> r13 = java.lang.CharSequence.class
            r16 = 1
            r14[r16] = r13     // Catch:{ all -> 0x0ae7 }
            java.lang.reflect.Method r4 = r4.getMethod(r10, r14)     // Catch:{ all -> 0x0ae7 }
            r10 = 0
            java.lang.Object r4 = r4.invoke(r10, r7)     // Catch:{ all -> 0x0ae7 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0ae7 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0ae7 }
            int r4 = -r4
            r7 = r4 | 5
            r10 = 1
            int r7 = r7 << r10
            r10 = 5
            r4 = r4 ^ r10
            int r7 = r7 - r4
            short r4 = (short) r7
            r7 = 2
            int[] r10 = new int[r7]     // Catch:{ all -> 0x08b8 }
            long r13 = f9333C     // Catch:{ all -> 0x08b8 }
            r7 = 32
            r48 = r5
            r49 = r6
            long r5 = r13 >>> r7
            int r5 = (int) r5     // Catch:{ all -> 0x08b8 }
            int r6 = ~r8     // Catch:{ all -> 0x08b8 }
            r6 = r6 & r5
            int r5 = ~r5     // Catch:{ all -> 0x08b8 }
            r5 = r5 & r8
            r5 = r5 | r6
            r6 = 0
            r10[r6] = r5     // Catch:{ all -> 0x08b8 }
            int r5 = (int) r13     // Catch:{ all -> 0x08b8 }
            r5 = r5 ^ r8
            r6 = 1
            r10[r6] = r5     // Catch:{ all -> 0x08b8 }
            com.facetec.sdk.ga r5 = new com.facetec.sdk.ga     // Catch:{ all -> 0x08b8 }
            int r42 = f9334D     // Catch:{ all -> 0x08b8 }
            byte[] r43 = f9341z     // Catch:{ all -> 0x08b8 }
            int r45 = f9332B     // Catch:{ all -> 0x08b8 }
            r39 = r5
            r41 = r10
            r44 = r4
            r39.<init>(r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x08b8 }
            r39 = r3
            r40 = r11
            goto L_0x0c1e
        L_0x0ae7:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x0af0
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x0af0:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x0af1:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x08b8 }
            if (r3 == 0) goto L_0x0afa
            throw r3     // Catch:{ all -> 0x08b8 }
        L_0x0afa:
            throw r2     // Catch:{ all -> 0x08b8 }
        L_0x0afb:
            r46 = r4
            r48 = r5
            r49 = r6
            r47 = r7
            r4 = 58
            byte r5 = r2[r4]     // Catch:{ all -> 0x19b6 }
            byte r4 = (byte) r5
            r5 = r4 | 72
            short r5 = (short) r5
            r6 = 119(0x77, float:1.67E-43)
            byte r6 = r2[r6]     // Catch:{ all -> 0x19a8 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x19a8 }
            java.lang.String r4 = $$c(r4, r5, r6)     // Catch:{ all -> 0x19a8 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x19a8 }
            r5 = 16
            byte r6 = r2[r5]     // Catch:{ all -> 0x19a8 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x19a8 }
            r6 = 366(0x16e, float:5.13E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x19a8 }
            r7 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r7]     // Catch:{ all -> 0x19a8 }
            byte r7 = (byte) r10     // Catch:{ all -> 0x19a8 }
            java.lang.String r5 = $$c(r5, r6, r7)     // Catch:{ all -> 0x19a8 }
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x19a8 }
            java.lang.Object r4 = r4.invoke(r6, r6)     // Catch:{ all -> 0x19a8 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x19a8 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x19a8 }
            r5 = 16
            int r4 = r4 >> r5
            int r4 = -r4
            int r4 = -r4
            r5 = 1665696580(0x63488344, float:3.6988075E21)
            r6 = r4 & r5
            r4 = r4 | r5
            int r6 = r6 + r4
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x1992 }
            r4 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1992 }
            r10 = 2
            r5[r10] = r7     // Catch:{ all -> 0x1992 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1992 }
            r10 = 1
            r5[r10] = r7     // Catch:{ all -> 0x1992 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1992 }
            r5[r4] = r7     // Catch:{ all -> 0x1992 }
            r4 = 58
            byte r7 = r2[r4]     // Catch:{ all -> 0x1985 }
            byte r4 = (byte) r7
            r7 = 885(0x375, float:1.24E-42)
            short r7 = (short) r7
            r10 = 179(0xb3, float:2.51E-43)
            byte r14 = r2[r10]     // Catch:{ all -> 0x1992 }
            byte r10 = (byte) r14     // Catch:{ all -> 0x1992 }
            java.lang.String r4 = $$c(r4, r7, r10)     // Catch:{ all -> 0x1992 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1992 }
            r7 = 21
            byte r10 = r2[r7]     // Catch:{ all -> 0x197f }
            byte r7 = (byte) r10
            r10 = 624(0x270, float:8.74E-43)
            short r10 = (short) r10
            r39 = r3
            r14 = 0
            byte r3 = r2[r14]     // Catch:{ all -> 0x1992 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x1992 }
            java.lang.String r3 = $$c(r7, r10, r3)     // Catch:{ all -> 0x1992 }
            r7 = 3
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x1992 }
            r10[r14] = r13     // Catch:{ all -> 0x1992 }
            r7 = 1
            r10[r7] = r13     // Catch:{ all -> 0x1992 }
            r7 = 2
            r10[r7] = r13     // Catch:{ all -> 0x1992 }
            java.lang.reflect.Method r3 = r4.getMethod(r3, r10)     // Catch:{ all -> 0x1992 }
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ all -> 0x1992 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x1992 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x1992 }
            int r3 = -r3
            int r3 = ~r3
            r4 = -16777211(0xffffffffff000005, float:-1.7014128E38)
            int r4 = r4 - r3
            r3 = 1
            int r4 = r4 - r3
            short r4 = (short) r4
            r5 = 3
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x1969 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ all -> 0x1969 }
            r5 = 2
            r7[r5] = r4     // Catch:{ all -> 0x1969 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1969 }
            r7[r3] = r4     // Catch:{ all -> 0x1969 }
            r3 = 0
            r7[r3] = r40     // Catch:{ all -> 0x1969 }
            r3 = 500(0x1f4, float:7.0E-43)
            byte r4 = r2[r3]     // Catch:{ all -> 0x1960 }
            byte r3 = (byte) r4
            r4 = 330(0x14a, float:4.62E-43)
            short r4 = (short) r4
            r5 = 16
            byte r6 = r2[r5]     // Catch:{ all -> 0x1969 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x1969 }
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch:{ all -> 0x1969 }
            java.lang.Object r4 = f9336u     // Catch:{ all -> 0x1969 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x1969 }
            r5 = 1
            java.lang.Class r3 = java.lang.Class.forName(r3, r5, r4)     // Catch:{ all -> 0x1969 }
            r4 = 87
            byte r4 = r2[r4]     // Catch:{ all -> 0x1969 }
            byte r4 = (byte) r4
            r5 = 721(0x2d1, float:1.01E-42)
            short r5 = (short) r5
            r6 = 25
            byte r10 = r2[r6]     // Catch:{ all -> 0x1955 }
            r6 = r10 ^ -1
            r10 = r10 & -1
            r14 = 1
            int r10 = r10 << r14
            int r6 = r6 + r10
            byte r6 = (byte) r6
            java.lang.String r4 = $$c(r4, r5, r6)     // Catch:{ all -> 0x1969 }
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x1969 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r5]     // Catch:{ all -> 0x1969 }
            byte r5 = (byte) r10
            r10 = r5 ^ 978(0x3d2, float:1.37E-42)
            r14 = r5 & 978(0x3d2, float:1.37E-42)
            r10 = r10 | r14
            short r10 = (short) r10
            r40 = r11
            r14 = 101(0x65, float:1.42E-43)
            byte r11 = r2[r14]     // Catch:{ all -> 0x1953 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x1953 }
            java.lang.String r5 = $$c(r5, r10, r11)     // Catch:{ all -> 0x1953 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x1953 }
            r10 = 0
            r6[r10] = r5     // Catch:{ all -> 0x1953 }
            r5 = 1
            r6[r5] = r13     // Catch:{ all -> 0x1953 }
            java.lang.Class r5 = java.lang.Short.TYPE     // Catch:{ all -> 0x1953 }
            r10 = 2
            r6[r10] = r5     // Catch:{ all -> 0x1953 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch:{ all -> 0x1953 }
            java.lang.Object r3 = r3.invoke(r8, r7)     // Catch:{ all -> 0x1953 }
            r5 = r3
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ all -> 0x1953 }
        L_0x0c1e:
            r3 = 22
            long r3 = (long) r3
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x193f }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x193f }
            r4 = 0
            r7[r4] = r3     // Catch:{ all -> 0x193f }
            r3 = 180(0xb4, float:2.52E-43)
            byte r4 = r2[r3]     // Catch:{ all -> 0x193f }
            byte r3 = (byte) r4     // Catch:{ all -> 0x193f }
            r4 = r3 ^ 978(0x3d2, float:1.37E-42)
            r6 = r3 & 978(0x3d2, float:1.37E-42)
            r4 = r4 | r6
            short r4 = (short) r4     // Catch:{ all -> 0x193f }
            r6 = 101(0x65, float:1.42E-43)
            byte r8 = r2[r6]     // Catch:{ all -> 0x193f }
            byte r6 = (byte) r8     // Catch:{ all -> 0x193f }
            java.lang.String r3 = $$c(r3, r4, r6)     // Catch:{ all -> 0x193f }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x193f }
            r4 = 42
            byte r4 = r2[r4]     // Catch:{ all -> 0x193f }
            byte r4 = (byte) r4     // Catch:{ all -> 0x193f }
            r6 = 608(0x260, float:8.52E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x193f }
            r8 = 512(0x200, float:7.175E-43)
            byte r8 = r2[r8]     // Catch:{ all -> 0x193f }
            byte r8 = (byte) r8     // Catch:{ all -> 0x193f }
            java.lang.String r4 = $$c(r4, r6, r8)     // Catch:{ all -> 0x193f }
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x193f }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x193f }
            r10 = 0
            r8[r10] = r6     // Catch:{ all -> 0x193f }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r8)     // Catch:{ all -> 0x193f }
            java.lang.Object r3 = r3.invoke(r5, r7)     // Catch:{ all -> 0x193f }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x193f }
            r3.longValue()     // Catch:{ all -> 0x193f }
            if (r15 == 0) goto L_0x11ab
            java.lang.Object r3 = f9340y     // Catch:{ all -> 0x11a5 }
            if (r3 != 0) goto L_0x0c72
            r4 = r25
            goto L_0x0c74
        L_0x0c72:
            r4 = r36
        L_0x0c74:
            if (r3 != 0) goto L_0x0c79
            r3 = 20
            goto L_0x0c7b
        L_0x0c79:
            r3 = 67
        L_0x0c7b:
            r6 = 67
            if (r3 == r6) goto L_0x0c8c
            int r3 = $11
            int r3 = r3 + 79
            int r6 = r3 % 128
            $10 = r6
            r6 = 2
            int r3 = r3 % r6
            r3 = r47
            goto L_0x0c8e
        L_0x0c8c:
            r3 = r34
        L_0x0c8e:
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x1085 }
            r6 = 0
            r7[r6] = r4     // Catch:{ all -> 0x1085 }
            r6 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r6]     // Catch:{ all -> 0x1085 }
            byte r6 = (byte) r8     // Catch:{ all -> 0x1085 }
            r8 = 778(0x30a, float:1.09E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x1085 }
            r10 = 3
            byte r11 = r2[r10]     // Catch:{ all -> 0x1085 }
            byte r10 = (byte) r11     // Catch:{ all -> 0x1085 }
            java.lang.String r6 = $$c(r6, r8, r10)     // Catch:{ all -> 0x1085 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x1085 }
            r10 = 1
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ all -> 0x1085 }
            r10 = 180(0xb4, float:2.52E-43)
            byte r13 = r2[r10]     // Catch:{ all -> 0x1085 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x1085 }
            r13 = 5
            byte r14 = r2[r13]     // Catch:{ all -> 0x1085 }
            byte r13 = (byte) r14     // Catch:{ all -> 0x1085 }
            java.lang.String r10 = $$c(r10, r9, r13)     // Catch:{ all -> 0x1085 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x1085 }
            r13 = 0
            r11[r13] = r10     // Catch:{ all -> 0x1085 }
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r11)     // Catch:{ all -> 0x1085 }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ all -> 0x1085 }
            if (r12 == 0) goto L_0x0ccc
            r7 = 69
            goto L_0x0cce
        L_0x0ccc:
            r7 = 20
        L_0x0cce:
            r10 = 69
            if (r7 == r10) goto L_0x0cd3
            goto L_0x0d0f
        L_0x0cd3:
            int r7 = $10
            int r7 = r7 + 106
            r10 = 1
            int r7 = r7 - r10
            int r10 = r7 % 128
            $11 = r10
            r10 = 2
            int r7 = r7 % r10
            r7 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r7]     // Catch:{ all -> 0x1077 }
            byte r7 = (byte) r10     // Catch:{ all -> 0x1077 }
            r10 = 5
            byte r11 = r2[r10]     // Catch:{ all -> 0x1077 }
            byte r10 = (byte) r11     // Catch:{ all -> 0x1077 }
            java.lang.String r7 = $$c(r7, r9, r10)     // Catch:{ all -> 0x1077 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1077 }
            r10 = 42
            byte r10 = r2[r10]     // Catch:{ all -> 0x1077 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x1077 }
            r11 = r10 | 459(0x1cb, float:6.43E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x1077 }
            r13 = 288(0x120, float:4.04E-43)
            byte r2 = r2[r13]     // Catch:{ all -> 0x1077 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x1077 }
            java.lang.String r2 = $$c(r10, r11, r2)     // Catch:{ all -> 0x1077 }
            r10 = 0
            java.lang.reflect.Method r2 = r7.getMethod(r2, r10)     // Catch:{ all -> 0x1077 }
            java.lang.Object r2 = r2.invoke(r4, r10)     // Catch:{ all -> 0x1077 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x1077 }
            r2.booleanValue()     // Catch:{ all -> 0x1077 }
        L_0x0d0f:
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r2]     // Catch:{ all -> 0x1071 }
            r10 = r46
        L_0x0d15:
            if (r10 <= 0) goto L_0x0d1a
            r11 = 76
            goto L_0x0d1c
        L_0x0d1a:
            r11 = 30
        L_0x0d1c:
            r13 = 30
            if (r11 == r13) goto L_0x0e21
            int r11 = java.lang.Math.min(r2, r10)     // Catch:{ all -> 0x0e19 }
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0e0b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0e0b }
            r13 = 2
            r14[r13] = r11     // Catch:{ all -> 0x0e0b }
            r11 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0e0b }
            r16 = 1
            r14[r16] = r13     // Catch:{ all -> 0x0e0b }
            r14[r11] = r7     // Catch:{ all -> 0x0e0b }
            byte[] r11 = $$a     // Catch:{ all -> 0x0e0b }
            r13 = 180(0xb4, float:2.52E-43)
            byte r2 = r11[r13]     // Catch:{ all -> 0x0e0b }
            byte r2 = (byte) r2
            r13 = r2 ^ 978(0x3d2, float:1.37E-42)
            r42 = r12
            r12 = r2 & 978(0x3d2, float:1.37E-42)
            r12 = r12 | r13
            short r12 = (short) r12
            r43 = r15
            r13 = 101(0x65, float:1.42E-43)
            byte r15 = r11[r13]     // Catch:{ all -> 0x0e09 }
            byte r13 = (byte) r15     // Catch:{ all -> 0x0e09 }
            java.lang.String r2 = $$c(r2, r12, r13)     // Catch:{ all -> 0x0e09 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0e09 }
            r12 = 21
            byte r13 = r11[r12]     // Catch:{ all -> 0x0e09 }
            byte r12 = (byte) r13     // Catch:{ all -> 0x0e09 }
            r13 = 246(0xf6, float:3.45E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x0e09 }
            r15 = 512(0x200, float:7.175E-43)
            byte r15 = r11[r15]     // Catch:{ all -> 0x0e09 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0e09 }
            java.lang.String r12 = $$c(r12, r13, r15)     // Catch:{ all -> 0x0e09 }
            r13 = 3
            java.lang.Class[] r15 = new java.lang.Class[r13]     // Catch:{ all -> 0x0e09 }
            r13 = 0
            r15[r13] = r1     // Catch:{ all -> 0x0e09 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0e09 }
            r16 = 1
            r15[r16] = r13     // Catch:{ all -> 0x0e09 }
            r20 = 2
            r15[r20] = r13     // Catch:{ all -> 0x0e09 }
            java.lang.reflect.Method r2 = r2.getMethod(r12, r15)     // Catch:{ all -> 0x0e09 }
            java.lang.Object r2 = r2.invoke(r5, r14)     // Catch:{ all -> 0x0e09 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0e09 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0e09 }
            r12 = -1
            if (r2 == r12) goto L_0x0e25
            int r12 = $10
            int r12 = r12 + 66
            r14 = 1
            int r12 = r12 - r14
            int r14 = r12 % 128
            $11 = r14
            r15 = 2
            int r12 = r12 % r15
            r12 = r14 | 57
            r15 = 1
            int r12 = r12 << r15
            r14 = r14 ^ 57
            int r12 = r12 - r14
            int r14 = r12 % 128
            $10 = r14
            r14 = 2
            int r12 = r12 % r14
            r12 = 3
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0dff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0dff }
            r15[r14] = r12     // Catch:{ all -> 0x0dff }
            r12 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0dff }
            r16 = 1
            r15[r16] = r14     // Catch:{ all -> 0x0dff }
            r15[r12] = r7     // Catch:{ all -> 0x0dff }
            r12 = 180(0xb4, float:2.52E-43)
            byte r14 = r11[r12]     // Catch:{ all -> 0x0dff }
            byte r12 = (byte) r14     // Catch:{ all -> 0x0dff }
            r44 = r7
            r14 = 3
            byte r7 = r11[r14]     // Catch:{ all -> 0x0dff }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0dff }
            java.lang.String r7 = $$c(r12, r8, r7)     // Catch:{ all -> 0x0dff }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0dff }
            r12 = 46
            byte r12 = r11[r12]     // Catch:{ all -> 0x0dff }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0dff }
            r14 = r12 ^ 232(0xe8, float:3.25E-43)
            r45 = r5
            r5 = r12 & 232(0xe8, float:3.25E-43)
            r5 = r5 | r14
            short r5 = (short) r5     // Catch:{ all -> 0x0dff }
            r14 = 926(0x39e, float:1.298E-42)
            byte r11 = r11[r14]     // Catch:{ all -> 0x0dff }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0dff }
            java.lang.String r5 = $$c(r12, r5, r11)     // Catch:{ all -> 0x0dff }
            r11 = 3
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ all -> 0x0dff }
            r11 = 0
            r12[r11] = r1     // Catch:{ all -> 0x0dff }
            r11 = 1
            r12[r11] = r13     // Catch:{ all -> 0x0dff }
            r11 = 2
            r12[r11] = r13     // Catch:{ all -> 0x0dff }
            java.lang.reflect.Method r5 = r7.getMethod(r5, r12)     // Catch:{ all -> 0x0dff }
            r5.invoke(r6, r15)     // Catch:{ all -> 0x0dff }
            int r10 = r10 - r2
            r12 = r42
            r15 = r43
            r7 = r44
            r5 = r45
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x0d15
        L_0x0dff:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x0e17 }
            if (r5 == 0) goto L_0x0e08
            throw r5     // Catch:{ all -> 0x0e17 }
        L_0x0e08:
            throw r2     // Catch:{ all -> 0x0e17 }
        L_0x0e09:
            r0 = move-exception
            goto L_0x0e0e
        L_0x0e0b:
            r0 = move-exception
            r42 = r12
        L_0x0e0e:
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x0e17 }
            if (r5 == 0) goto L_0x0e16
            throw r5     // Catch:{ all -> 0x0e17 }
        L_0x0e16:
            throw r2     // Catch:{ all -> 0x0e17 }
        L_0x0e17:
            r0 = move-exception
            goto L_0x0e1c
        L_0x0e19:
            r0 = move-exception
            r42 = r12
        L_0x0e1c:
            r2 = r0
            r10 = 179(0xb3, float:2.51E-43)
            goto L_0x111b
        L_0x0e21:
            r42 = r12
            r43 = r15
        L_0x0e25:
            byte[] r2 = $$a     // Catch:{ all -> 0x1065 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r5]     // Catch:{ all -> 0x1065 }
            byte r5 = (byte) r7     // Catch:{ all -> 0x1065 }
            r7 = 3
            byte r10 = r2[r7]     // Catch:{ all -> 0x1065 }
            byte r7 = (byte) r10     // Catch:{ all -> 0x1065 }
            java.lang.String r5 = $$c(r5, r8, r7)     // Catch:{ all -> 0x1065 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x1065 }
            r7 = 16
            byte r10 = r2[r7]     // Catch:{ all -> 0x1065 }
            byte r7 = (byte) r10     // Catch:{ all -> 0x1065 }
            r10 = 641(0x281, float:8.98E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x1065 }
            r11 = 926(0x39e, float:1.298E-42)
            byte r12 = r2[r11]     // Catch:{ all -> 0x1065 }
            byte r11 = (byte) r12     // Catch:{ all -> 0x1065 }
            java.lang.String r7 = $$c(r7, r10, r11)     // Catch:{ all -> 0x1065 }
            r10 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r7, r10)     // Catch:{ all -> 0x1065 }
            java.lang.Object r5 = r5.invoke(r6, r10)     // Catch:{ all -> 0x1065 }
            int r7 = $10
            r10 = r7 | 63
            r11 = 1
            int r10 = r10 << r11
            r7 = r7 ^ 63
            int r10 = r10 - r7
            int r7 = r10 % 128
            $11 = r7
            r7 = 2
            int r10 = r10 % r7
            r7 = 180(0xb4, float:2.52E-43)
            byte r10 = r2[r7]     // Catch:{ all -> 0x1059 }
            byte r7 = (byte) r10
            r10 = 926(0x39e, float:1.298E-42)
            short r11 = (short) r10
            r10 = 179(0xb3, float:2.51E-43)
            byte r12 = r2[r10]     // Catch:{ all -> 0x1057 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x1057 }
            java.lang.String r7 = $$c(r7, r11, r12)     // Catch:{ all -> 0x1057 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1057 }
            r11 = 42
            byte r11 = r2[r11]     // Catch:{ all -> 0x1057 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x1057 }
            r12 = 363(0x16b, float:5.09E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x1057 }
            r13 = 512(0x200, float:7.175E-43)
            byte r13 = r2[r13]     // Catch:{ all -> 0x1057 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x1057 }
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch:{ all -> 0x1057 }
            r12 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r11, r12)     // Catch:{ all -> 0x1057 }
            r7.invoke(r5, r12)     // Catch:{ all -> 0x1057 }
            int r5 = $10
            int r5 = r5 + 103
            int r7 = r5 % 128
            $11 = r7
            r7 = 2
            int r5 = r5 % r7
            r5 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r5]     // Catch:{ all -> 0x104d }
            byte r5 = (byte) r7     // Catch:{ all -> 0x104d }
            r7 = 3
            byte r11 = r2[r7]     // Catch:{ all -> 0x104d }
            byte r7 = (byte) r11     // Catch:{ all -> 0x104d }
            java.lang.String r5 = $$c(r5, r8, r7)     // Catch:{ all -> 0x104d }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x104d }
            r7 = 500(0x1f4, float:7.0E-43)
            byte r8 = r2[r7]     // Catch:{ all -> 0x104d }
            byte r7 = (byte) r8     // Catch:{ all -> 0x104d }
            r8 = r7 | 674(0x2a2, float:9.44E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x104d }
            r11 = 926(0x39e, float:1.298E-42)
            byte r12 = r2[r11]     // Catch:{ all -> 0x104d }
            byte r11 = (byte) r12     // Catch:{ all -> 0x104d }
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch:{ all -> 0x104d }
            r8 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r7, r8)     // Catch:{ all -> 0x104d }
            r5.invoke(r6, r8)     // Catch:{ all -> 0x104d }
            r5 = 96
            byte r6 = r2[r5]     // Catch:{ all -> 0x1093 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x1093 }
            r6 = 270(0x10e, float:3.78E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x1093 }
            r7 = 29
            byte r8 = r2[r7]     // Catch:{ all -> 0x1093 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x1093 }
            java.lang.String r5 = $$c(r5, r6, r7)     // Catch:{ all -> 0x1093 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x1093 }
            r6 = 44
            byte r6 = r2[r6]     // Catch:{ all -> 0x1093 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x1093 }
            r7 = 521(0x209, float:7.3E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x1093 }
            r8 = 529(0x211, float:7.41E-43)
            byte r8 = r2[r8]     // Catch:{ all -> 0x1093 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x1093 }
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch:{ all -> 0x1093 }
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ all -> 0x1093 }
            r7 = 0
            r8[r7] = r40     // Catch:{ all -> 0x1093 }
            r7 = 1
            r8[r7] = r40     // Catch:{ all -> 0x1093 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x1093 }
            r11 = 2
            r8[r11] = r7     // Catch:{ all -> 0x1093 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r8)     // Catch:{ all -> 0x1093 }
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x1093 }
            int r6 = $10
            r8 = r6 | 13
            r11 = 1
            int r8 = r8 << r11
            r6 = r6 ^ 13
            int r8 = r8 - r6
            int r6 = r8 % 128
            $11 = r6
            r6 = 2
            int r8 = r8 % r6
            r6 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r6]     // Catch:{ all -> 0x1043 }
            byte r6 = (byte) r8     // Catch:{ all -> 0x1043 }
            r8 = 5
            byte r11 = r2[r8]     // Catch:{ all -> 0x1043 }
            byte r8 = (byte) r11     // Catch:{ all -> 0x1043 }
            java.lang.String r6 = $$c(r6, r9, r8)     // Catch:{ all -> 0x1043 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x1043 }
            r8 = 16
            byte r11 = r2[r8]     // Catch:{ all -> 0x1043 }
            byte r8 = (byte) r11     // Catch:{ all -> 0x1043 }
            r11 = r8 | 705(0x2c1, float:9.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x1043 }
            r12 = 45
            byte r12 = r2[r12]     // Catch:{ all -> 0x1043 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x1043 }
            java.lang.String r8 = $$c(r8, r11, r12)     // Catch:{ all -> 0x1043 }
            r11 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r8, r11)     // Catch:{ all -> 0x1043 }
            java.lang.Object r6 = r6.invoke(r4, r11)     // Catch:{ all -> 0x1043 }
            r8 = 0
            r7[r8] = r6     // Catch:{ all -> 0x1093 }
            int r6 = $10
            int r6 = r6 + 87
            int r8 = r6 % 128
            $11 = r8
            r8 = 2
            int r6 = r6 % r8
            r6 = 180(0xb4, float:2.52E-43)
            byte r8 = r2[r6]     // Catch:{ all -> 0x1039 }
            byte r6 = (byte) r8     // Catch:{ all -> 0x1039 }
            r8 = 5
            byte r11 = r2[r8]     // Catch:{ all -> 0x1039 }
            byte r8 = (byte) r11     // Catch:{ all -> 0x1039 }
            java.lang.String r6 = $$c(r6, r9, r8)     // Catch:{ all -> 0x1039 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x1039 }
            r8 = 16
            byte r11 = r2[r8]     // Catch:{ all -> 0x1039 }
            byte r8 = (byte) r11     // Catch:{ all -> 0x1039 }
            r11 = r8 | 705(0x2c1, float:9.88E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x1039 }
            r12 = 45
            byte r12 = r2[r12]     // Catch:{ all -> 0x1039 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x1039 }
            java.lang.String r8 = $$c(r8, r11, r12)     // Catch:{ all -> 0x1039 }
            r11 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r8, r11)     // Catch:{ all -> 0x1039 }
            java.lang.Object r6 = r6.invoke(r3, r11)     // Catch:{ all -> 0x1039 }
            r8 = 1
            r7[r8] = r6     // Catch:{ all -> 0x1093 }
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1093 }
            r6 = 2
            r7[r6] = r8     // Catch:{ all -> 0x1093 }
            java.lang.Object r5 = r5.invoke(r11, r7)     // Catch:{ all -> 0x1093 }
            r6 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r6]     // Catch:{ all -> 0x102f }
            byte r6 = (byte) r7     // Catch:{ all -> 0x102f }
            r7 = 5
            byte r8 = r2[r7]     // Catch:{ all -> 0x102f }
            byte r7 = (byte) r8     // Catch:{ all -> 0x102f }
            java.lang.String r6 = $$c(r6, r9, r7)     // Catch:{ all -> 0x102f }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x102f }
            r7 = 96
            byte r8 = r2[r7]     // Catch:{ all -> 0x102f }
            byte r7 = (byte) r8     // Catch:{ all -> 0x102f }
            r8 = 636(0x27c, float:8.91E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x102f }
            r11 = 191(0xbf, float:2.68E-43)
            byte r11 = r2[r11]     // Catch:{ all -> 0x102f }
            byte r11 = (byte) r11     // Catch:{ all -> 0x102f }
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch:{ all -> 0x102f }
            r11 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r7, r11)     // Catch:{ all -> 0x102f }
            java.lang.Object r4 = r6.invoke(r4, r11)     // Catch:{ all -> 0x102f }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x102f }
            r4.booleanValue()     // Catch:{ all -> 0x102f }
            int r4 = $11
            r6 = r4 & 65
            r4 = r4 | 65
            int r6 = r6 + r4
            int r4 = r6 % 128
            $10 = r4
            r4 = 2
            int r6 = r6 % r4
            r4 = 180(0xb4, float:2.52E-43)
            byte r6 = r2[r4]     // Catch:{ all -> 0x1025 }
            byte r4 = (byte) r6     // Catch:{ all -> 0x1025 }
            r6 = 5
            byte r7 = r2[r6]     // Catch:{ all -> 0x1025 }
            byte r6 = (byte) r7     // Catch:{ all -> 0x1025 }
            java.lang.String r4 = $$c(r4, r9, r6)     // Catch:{ all -> 0x1025 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1025 }
            r6 = 96
            byte r7 = r2[r6]     // Catch:{ all -> 0x1025 }
            byte r6 = (byte) r7     // Catch:{ all -> 0x1025 }
            r7 = 191(0xbf, float:2.68E-43)
            byte r7 = r2[r7]     // Catch:{ all -> 0x1025 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x1025 }
            java.lang.String r6 = $$c(r6, r8, r7)     // Catch:{ all -> 0x1025 }
            r7 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch:{ all -> 0x1025 }
            java.lang.Object r3 = r4.invoke(r3, r7)     // Catch:{ all -> 0x1025 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x1025 }
            r3.booleanValue()     // Catch:{ all -> 0x1025 }
            java.lang.Object r3 = f9336u     // Catch:{ all -> 0x11a3 }
            if (r3 != 0) goto L_0x0ff1
            r3 = 57
            goto L_0x0ff3
        L_0x0ff1:
            r3 = 13
        L_0x0ff3:
            r4 = 57
            if (r3 == r4) goto L_0x0ff8
            goto L_0x1018
        L_0x0ff8:
            java.lang.Class<com.facetec.sdk.bp> r3 = com.facetec.sdk.C2854bp.class
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r6 = 16
            byte r7 = r2[r6]     // Catch:{ all -> 0x101b }
            byte r6 = (byte) r7     // Catch:{ all -> 0x101b }
            r7 = 611(0x263, float:8.56E-43)
            short r7 = (short) r7     // Catch:{ all -> 0x101b }
            r8 = 58
            byte r2 = r2[r8]     // Catch:{ all -> 0x101b }
            byte r2 = (byte) r2     // Catch:{ all -> 0x101b }
            java.lang.String r2 = $$c(r6, r7, r2)     // Catch:{ all -> 0x101b }
            r6 = 0
            java.lang.reflect.Method r2 = r4.getMethod(r2, r6)     // Catch:{ all -> 0x101b }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x101b }
            f9336u = r2     // Catch:{ all -> 0x11a3 }
        L_0x1018:
            r13 = 3
            goto L_0x1541
        L_0x101b:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x1024
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x1024:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x1025:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x102e
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x102e:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x102f:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x1038
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x1038:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x1039:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x1042
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x1042:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x1043:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x104c
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x104c:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x104d:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x1056
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x1056:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x1057:
            r0 = move-exception
            goto L_0x105c
        L_0x1059:
            r0 = move-exception
            r10 = 179(0xb3, float:2.51E-43)
        L_0x105c:
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x1064
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x1064:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x1065:
            r0 = move-exception
            r10 = 179(0xb3, float:2.51E-43)
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x1070
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x1070:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x1071:
            r0 = move-exception
            r42 = r12
            r10 = 179(0xb3, float:2.51E-43)
            goto L_0x1094
        L_0x1077:
            r0 = move-exception
            r42 = r12
            r10 = 179(0xb3, float:2.51E-43)
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ Exception -> 0x1097 }
            if (r5 == 0) goto L_0x1084
            throw r5     // Catch:{ Exception -> 0x1097 }
        L_0x1084:
            throw r2     // Catch:{ Exception -> 0x1097 }
        L_0x1085:
            r0 = move-exception
            r42 = r12
            r10 = 179(0xb3, float:2.51E-43)
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ Exception -> 0x1097 }
            if (r5 == 0) goto L_0x1092
            throw r5     // Catch:{ Exception -> 0x1097 }
        L_0x1092:
            throw r2     // Catch:{ Exception -> 0x1097 }
        L_0x1093:
            r0 = move-exception
        L_0x1094:
            r2 = r0
            goto L_0x111b
        L_0x1097:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1093 }
            r5.<init>()     // Catch:{ all -> 0x1093 }
            byte[] r6 = $$a     // Catch:{ all -> 0x1093 }
            r7 = 52
            byte r7 = r6[r7]     // Catch:{ all -> 0x1093 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x1093 }
            r8 = 414(0x19e, float:5.8E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x1093 }
            r11 = 926(0x39e, float:1.298E-42)
            byte r11 = r6[r11]     // Catch:{ all -> 0x1093 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x1093 }
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch:{ all -> 0x1093 }
            r5.append(r7)     // Catch:{ all -> 0x1093 }
            r5.append(r4)     // Catch:{ all -> 0x1093 }
            r7 = 410(0x19a, float:5.75E-43)
            byte r7 = r6[r7]     // Catch:{ all -> 0x1093 }
            r8 = r7 | -1
            r11 = 1
            int r8 = r8 << r11
            r7 = r7 ^ -1
            int r8 = r8 - r7
            byte r7 = (byte) r8     // Catch:{ all -> 0x1093 }
            r8 = 270(0x10e, float:3.78E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x1093 }
            r11 = 25
            byte r12 = r6[r11]     // Catch:{ all -> 0x1093 }
            r11 = r12 ^ -1
            r12 = r12 & -1
            r13 = 1
            int r12 = r12 << r13
            int r11 = r11 + r12
            byte r11 = (byte) r11     // Catch:{ all -> 0x1093 }
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch:{ all -> 0x1093 }
            r5.append(r7)     // Catch:{ all -> 0x1093 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x1093 }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x1111 }
            r7 = 1
            r8[r7] = r2     // Catch:{ all -> 0x1111 }
            r2 = 0
            r8[r2] = r5     // Catch:{ all -> 0x1111 }
            r2 = 180(0xb4, float:2.52E-43)
            byte r5 = r6[r2]     // Catch:{ all -> 0x1111 }
            byte r2 = (byte) r5     // Catch:{ all -> 0x1111 }
            r5 = 808(0x328, float:1.132E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x1111 }
            r7 = 101(0x65, float:1.42E-43)
            byte r6 = r6[r7]     // Catch:{ all -> 0x1111 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x1111 }
            java.lang.String r2 = $$c(r2, r5, r6)     // Catch:{ all -> 0x1111 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x1111 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x1111 }
            r5 = 0
            r6[r5] = r40     // Catch:{ all -> 0x1111 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r7 = 1
            r6[r7] = r5     // Catch:{ all -> 0x1111 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r6)     // Catch:{ all -> 0x1111 }
            java.lang.Object r2 = r2.newInstance(r8)     // Catch:{ all -> 0x1111 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x1111 }
            throw r2     // Catch:{ all -> 0x1111 }
        L_0x1111:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r5 = r2.getCause()     // Catch:{ all -> 0x1093 }
            if (r5 == 0) goto L_0x111a
            throw r5     // Catch:{ all -> 0x1093 }
        L_0x111a:
            throw r2     // Catch:{ all -> 0x1093 }
        L_0x111b:
            byte[] r5 = $$a     // Catch:{ all -> 0x1198 }
            r6 = 180(0xb4, float:2.52E-43)
            byte r7 = r5[r6]     // Catch:{ all -> 0x1198 }
            byte r6 = (byte) r7
            r7 = 5
            byte r8 = r5[r7]     // Catch:{ all -> 0x1195 }
            byte r7 = (byte) r8
            java.lang.String r6 = $$c(r6, r9, r7)     // Catch:{ all -> 0x1198 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x1198 }
            r7 = 96
            byte r8 = r5[r7]     // Catch:{ all -> 0x1198 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x1198 }
            r8 = 636(0x27c, float:8.91E-43)
            short r8 = (short) r8     // Catch:{ all -> 0x1198 }
            r11 = 191(0xbf, float:2.68E-43)
            byte r11 = r5[r11]     // Catch:{ all -> 0x1198 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x1198 }
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch:{ all -> 0x1198 }
            r11 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r7, r11)     // Catch:{ all -> 0x1198 }
            java.lang.Object r4 = r6.invoke(r4, r11)     // Catch:{ all -> 0x1198 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x1198 }
            r4.booleanValue()     // Catch:{ all -> 0x1198 }
            int r4 = $11
            r6 = r4 & 23
            r4 = r4 | 23
            int r6 = r6 + r4
            int r4 = r6 % 128
            $10 = r4
            r4 = 2
            int r6 = r6 % r4
            r4 = 180(0xb4, float:2.52E-43)
            byte r6 = r5[r4]     // Catch:{ all -> 0x118a }
            byte r4 = (byte) r6
            r6 = 5
            byte r7 = r5[r6]     // Catch:{ all -> 0x1188 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x1188 }
            java.lang.String r4 = $$c(r4, r9, r7)     // Catch:{ all -> 0x1188 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1188 }
            r7 = 96
            byte r7 = r5[r7]     // Catch:{ all -> 0x1188 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x1188 }
            r11 = 191(0xbf, float:2.68E-43)
            byte r5 = r5[r11]     // Catch:{ all -> 0x1188 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x1188 }
            java.lang.String r5 = $$c(r7, r8, r5)     // Catch:{ all -> 0x1188 }
            r7 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x1188 }
            java.lang.Object r3 = r4.invoke(r3, r7)     // Catch:{ all -> 0x1188 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x1188 }
            r3.booleanValue()     // Catch:{ all -> 0x1188 }
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x1188:
            r0 = move-exception
            goto L_0x118c
        L_0x118a:
            r0 = move-exception
            r6 = 5
        L_0x118c:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x1194
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x1194:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x1195:
            r0 = move-exception
            r6 = r7
            goto L_0x119a
        L_0x1198:
            r0 = move-exception
            r6 = 5
        L_0x119a:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x11a2
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x11a2:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x11a3:
            r0 = move-exception
            goto L_0x11a8
        L_0x11a5:
            r0 = move-exception
            r42 = r12
        L_0x11a8:
            r2 = r0
            goto L_0x08ca
        L_0x11ab:
            r45 = r5
            r42 = r12
            r43 = r15
            r6 = 5
            r10 = 179(0xb3, float:2.51E-43)
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x193c }
            r5 = r45
            r3.<init>(r5)     // Catch:{ all -> 0x193c }
            java.util.zip.ZipEntry r4 = r3.getNextEntry()     // Catch:{ all -> 0x193c }
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x192a }
            r5 = 0
            r7[r5] = r3     // Catch:{ all -> 0x192a }
            r3 = 180(0xb4, float:2.52E-43)
            byte r5 = r2[r3]     // Catch:{ all -> 0x192a }
            byte r3 = (byte) r5     // Catch:{ all -> 0x192a }
            r5 = 28
            byte r5 = r2[r5]     // Catch:{ all -> 0x192a }
            short r5 = (short) r5     // Catch:{ all -> 0x192a }
            r8 = 9
            byte r11 = r2[r8]     // Catch:{ all -> 0x192a }
            byte r8 = (byte) r11     // Catch:{ all -> 0x192a }
            java.lang.String r3 = $$c(r3, r5, r8)     // Catch:{ all -> 0x192a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x192a }
            r5 = 1
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x192a }
            r5 = 180(0xb4, float:2.52E-43)
            byte r11 = r2[r5]     // Catch:{ all -> 0x192a }
            byte r5 = (byte) r11     // Catch:{ all -> 0x192a }
            r11 = r5 ^ 978(0x3d2, float:1.37E-42)
            r12 = r5 & 978(0x3d2, float:1.37E-42)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch:{ all -> 0x192a }
            r12 = 101(0x65, float:1.42E-43)
            byte r13 = r2[r12]     // Catch:{ all -> 0x192a }
            byte r12 = (byte) r13     // Catch:{ all -> 0x192a }
            java.lang.String r5 = $$c(r5, r11, r12)     // Catch:{ all -> 0x192a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x192a }
            r11 = 0
            r8[r11] = r5     // Catch:{ all -> 0x192a }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r8)     // Catch:{ all -> 0x192a }
            java.lang.Object r3 = r3.newInstance(r7)     // Catch:{ all -> 0x192a }
            r5 = 180(0xb4, float:2.52E-43)
            byte r7 = r2[r5]     // Catch:{ all -> 0x1918 }
            byte r5 = (byte) r7     // Catch:{ all -> 0x1918 }
            r7 = r5 ^ 528(0x210, float:7.4E-43)
            r8 = r5 & 528(0x210, float:7.4E-43)
            r7 = r7 | r8
            short r7 = (short) r7     // Catch:{ all -> 0x1918 }
            r8 = 136(0x88, float:1.9E-43)
            byte r2 = r2[r8]     // Catch:{ all -> 0x1918 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x1918 }
            java.lang.String r2 = $$c(r5, r7, r2)     // Catch:{ all -> 0x1918 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x1918 }
            r5 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r5)     // Catch:{ all -> 0x1918 }
            java.lang.Object r2 = r2.newInstance(r5)     // Catch:{ all -> 0x1918 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x193c }
            r7 = 0
        L_0x1228:
            r8 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x1906 }
            r8 = 0
            r11[r8] = r5     // Catch:{ all -> 0x1906 }
            byte[] r8 = $$a     // Catch:{ all -> 0x1906 }
            r12 = 180(0xb4, float:2.52E-43)
            byte r13 = r8[r12]     // Catch:{ all -> 0x1906 }
            byte r12 = (byte) r13     // Catch:{ all -> 0x1906 }
            r13 = 28
            byte r13 = r8[r13]     // Catch:{ all -> 0x1906 }
            short r13 = (short) r13     // Catch:{ all -> 0x1906 }
            r14 = 9
            byte r15 = r8[r14]     // Catch:{ all -> 0x1906 }
            byte r14 = (byte) r15     // Catch:{ all -> 0x1906 }
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch:{ all -> 0x1906 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x1906 }
            r13 = 21
            byte r14 = r8[r13]     // Catch:{ all -> 0x1903 }
            byte r13 = (byte) r14
            r14 = 246(0xf6, float:3.45E-43)
            short r14 = (short) r14
            r15 = 512(0x200, float:7.175E-43)
            byte r15 = r8[r15]     // Catch:{ all -> 0x1906 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x1906 }
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch:{ all -> 0x1906 }
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ all -> 0x1906 }
            r14 = 0
            r15[r14] = r1     // Catch:{ all -> 0x1906 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r15)     // Catch:{ all -> 0x1906 }
            java.lang.Object r11 = r12.invoke(r3, r11)     // Catch:{ all -> 0x1906 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x1906 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x1906 }
            if (r11 <= 0) goto L_0x1270
            r12 = 0
            goto L_0x1271
        L_0x1270:
            r12 = 1
        L_0x1271:
            r13 = 1
            if (r12 == r13) goto L_0x1303
            int r12 = $11
            int r12 = r12 + 72
            int r12 = r12 - r13
            int r13 = r12 % 128
            $10 = r13
            r13 = 2
            int r12 = r12 % r13
            if (r12 == 0) goto L_0x1294
            long r12 = (long) r7
            long r14 = r4.getSize()     // Catch:{ all -> 0x11a3 }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r13 = 34
            r14 = 0
            int r13 = r13 / r14
            if (r12 >= 0) goto L_0x1290
            r12 = 1
            goto L_0x1291
        L_0x1290:
            r12 = 0
        L_0x1291:
            if (r12 == 0) goto L_0x1303
            goto L_0x129d
        L_0x1294:
            long r12 = (long) r7     // Catch:{ all -> 0x11a3 }
            long r14 = r4.getSize()     // Catch:{ all -> 0x11a3 }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x1303
        L_0x129d:
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x12f9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x12f9 }
            r14 = 2
            r13[r14] = r12     // Catch:{ all -> 0x12f9 }
            r12 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x12f9 }
            r15 = 1
            r13[r15] = r14     // Catch:{ all -> 0x12f9 }
            r13[r12] = r5     // Catch:{ all -> 0x12f9 }
            r12 = 180(0xb4, float:2.52E-43)
            byte r14 = r8[r12]     // Catch:{ all -> 0x12f9 }
            byte r12 = (byte) r14     // Catch:{ all -> 0x12f9 }
            r14 = r12 | 528(0x210, float:7.4E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x12f9 }
            r15 = 136(0x88, float:1.9E-43)
            byte r15 = r8[r15]     // Catch:{ all -> 0x12f9 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x12f9 }
            java.lang.String r12 = $$c(r12, r14, r15)     // Catch:{ all -> 0x12f9 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x12f9 }
            r14 = 46
            byte r14 = r8[r14]     // Catch:{ all -> 0x12f9 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x12f9 }
            r15 = r14 ^ 232(0xe8, float:3.25E-43)
            r6 = r14 & 232(0xe8, float:3.25E-43)
            r6 = r6 | r15
            short r6 = (short) r6     // Catch:{ all -> 0x12f9 }
            r15 = 926(0x39e, float:1.298E-42)
            byte r8 = r8[r15]     // Catch:{ all -> 0x12f9 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x12f9 }
            java.lang.String r6 = $$c(r14, r6, r8)     // Catch:{ all -> 0x12f9 }
            r8 = 3
            java.lang.Class[] r14 = new java.lang.Class[r8]     // Catch:{ all -> 0x12f9 }
            r8 = 0
            r14[r8] = r1     // Catch:{ all -> 0x12f9 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x12f9 }
            r15 = 1
            r14[r15] = r8     // Catch:{ all -> 0x12f9 }
            r15 = 2
            r14[r15] = r8     // Catch:{ all -> 0x12f9 }
            java.lang.reflect.Method r6 = r12.getMethod(r6, r14)     // Catch:{ all -> 0x12f9 }
            r6.invoke(r2, r13)     // Catch:{ all -> 0x12f9 }
            int r6 = -r11
            int r6 = -r6
            r8 = r7 & r6
            r6 = r6 | r7
            int r7 = r8 + r6
            r6 = 5
            goto L_0x1228
        L_0x12f9:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x11a3 }
            if (r3 == 0) goto L_0x1302
            throw r3     // Catch:{ all -> 0x11a3 }
        L_0x1302:
            throw r2     // Catch:{ all -> 0x11a3 }
        L_0x1303:
            r4 = 180(0xb4, float:2.52E-43)
            byte r5 = r8[r4]     // Catch:{ all -> 0x18f1 }
            byte r4 = (byte) r5     // Catch:{ all -> 0x18f1 }
            r5 = r4 ^ 528(0x210, float:7.4E-43)
            r6 = r4 & 528(0x210, float:7.4E-43)
            r5 = r5 | r6
            short r5 = (short) r5     // Catch:{ all -> 0x18f1 }
            r6 = 136(0x88, float:1.9E-43)
            byte r6 = r8[r6]     // Catch:{ all -> 0x18f1 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x18f1 }
            java.lang.String r4 = $$c(r4, r5, r6)     // Catch:{ all -> 0x18f1 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x18f1 }
            r5 = 14
            byte r5 = r8[r5]     // Catch:{ all -> 0x18f1 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x18f1 }
            r6 = r5 ^ 944(0x3b0, float:1.323E-42)
            r7 = r5 & 944(0x3b0, float:1.323E-42)
            r6 = r6 | r7
            short r6 = (short) r6     // Catch:{ all -> 0x18f1 }
            r7 = 288(0x120, float:4.04E-43)
            byte r11 = r8[r7]     // Catch:{ all -> 0x18f1 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x18f1 }
            java.lang.String r5 = $$c(r5, r6, r11)     // Catch:{ all -> 0x18f1 }
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x18f1 }
            java.lang.Object r4 = r4.invoke(r2, r6)     // Catch:{ all -> 0x18f1 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r6 = r8[r5]     // Catch:{ all -> 0x136c }
            byte r5 = (byte) r6     // Catch:{ all -> 0x136c }
            r6 = 28
            byte r6 = r8[r6]     // Catch:{ all -> 0x136c }
            short r6 = (short) r6     // Catch:{ all -> 0x136c }
            r11 = 9
            byte r12 = r8[r11]     // Catch:{ all -> 0x136c }
            byte r11 = (byte) r12     // Catch:{ all -> 0x136c }
            java.lang.String r5 = $$c(r5, r6, r11)     // Catch:{ all -> 0x136c }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x136c }
            r6 = 500(0x1f4, float:7.0E-43)
            byte r11 = r8[r6]     // Catch:{ all -> 0x136c }
            byte r6 = (byte) r11     // Catch:{ all -> 0x136c }
            r11 = r6 ^ 674(0x2a2, float:9.44E-43)
            r12 = r6 & 674(0x2a2, float:9.44E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch:{ all -> 0x136c }
            r12 = 926(0x39e, float:1.298E-42)
            byte r8 = r8[r12]     // Catch:{ all -> 0x136c }
            byte r8 = (byte) r8     // Catch:{ all -> 0x136c }
            java.lang.String r6 = $$c(r6, r11, r8)     // Catch:{ all -> 0x136c }
            r8 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ all -> 0x136c }
            r5.invoke(r3, r8)     // Catch:{ all -> 0x136c }
            goto L_0x1376
        L_0x136c:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r5 = r3.getCause()     // Catch:{ IOException -> 0x1376 }
            if (r5 == 0) goto L_0x1375
            throw r5     // Catch:{ IOException -> 0x1376 }
        L_0x1375:
            throw r3     // Catch:{ IOException -> 0x1376 }
        L_0x1376:
            int r3 = $10
            r5 = r3 & 13
            r3 = r3 | 13
            int r5 = r5 + r3
            int r3 = r5 % 128
            $11 = r3
            r3 = 2
            int r5 = r5 % r3
            byte[] r3 = $$a     // Catch:{ all -> 0x13b7 }
            r5 = 180(0xb4, float:2.52E-43)
            byte r6 = r3[r5]     // Catch:{ all -> 0x13b7 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x13b7 }
            r6 = r5 | 528(0x210, float:7.4E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x13b7 }
            r8 = 136(0x88, float:1.9E-43)
            byte r8 = r3[r8]     // Catch:{ all -> 0x13b7 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x13b7 }
            java.lang.String r5 = $$c(r5, r6, r8)     // Catch:{ all -> 0x13b7 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x13b7 }
            r6 = 500(0x1f4, float:7.0E-43)
            byte r8 = r3[r6]     // Catch:{ all -> 0x13b7 }
            byte r6 = (byte) r8     // Catch:{ all -> 0x13b7 }
            r8 = r6 ^ 674(0x2a2, float:9.44E-43)
            r11 = r6 & 674(0x2a2, float:9.44E-43)
            r8 = r8 | r11
            short r8 = (short) r8     // Catch:{ all -> 0x13b7 }
            r11 = 926(0x39e, float:1.298E-42)
            byte r3 = r3[r11]     // Catch:{ all -> 0x13b7 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x13b7 }
            java.lang.String r3 = $$c(r6, r8, r3)     // Catch:{ all -> 0x13b7 }
            r6 = 0
            java.lang.reflect.Method r3 = r5.getMethod(r3, r6)     // Catch:{ all -> 0x13b7 }
            r3.invoke(r2, r6)     // Catch:{ all -> 0x13b7 }
            goto L_0x13c1
        L_0x13b7:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ IOException -> 0x13c1 }
            if (r3 == 0) goto L_0x13c0
            throw r3     // Catch:{ IOException -> 0x13c1 }
        L_0x13c0:
            throw r2     // Catch:{ IOException -> 0x13c1 }
        L_0x13c1:
            java.lang.Class<com.facetec.sdk.bp> r2 = com.facetec.sdk.C2854bp.class
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            byte[] r5 = $$a     // Catch:{ all -> 0x18df }
            r6 = 16
            byte r8 = r5[r6]     // Catch:{ all -> 0x18df }
            byte r6 = (byte) r8
            r8 = 611(0x263, float:8.56E-43)
            short r8 = (short) r8
            r11 = 58
            byte r12 = r5[r11]     // Catch:{ all -> 0x18d6 }
            byte r11 = (byte) r12
            java.lang.String r6 = $$c(r6, r8, r11)     // Catch:{ all -> 0x18df }
            r8 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r6, r8)     // Catch:{ all -> 0x18df }
            java.lang.Object r2 = r3.invoke(r2, r8)     // Catch:{ all -> 0x18df }
            r3 = 96
            byte r6 = r5[r3]     // Catch:{ all -> 0x193c }
            byte r3 = (byte) r6     // Catch:{ all -> 0x193c }
            r6 = 173(0xad, float:2.42E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x193c }
            r8 = 46
            byte r8 = r5[r8]     // Catch:{ all -> 0x193c }
            byte r8 = (byte) r8     // Catch:{ all -> 0x193c }
            java.lang.String r3 = $$c(r3, r6, r8)     // Catch:{ all -> 0x193c }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x193c }
            r6 = 2
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x193c }
            r6 = 180(0xb4, float:2.52E-43)
            byte r11 = r5[r6]     // Catch:{ all -> 0x193c }
            byte r6 = (byte) r11     // Catch:{ all -> 0x193c }
            r11 = 94
            byte r11 = r5[r11]     // Catch:{ all -> 0x193c }
            int r11 = -r11
            short r11 = (short) r11     // Catch:{ all -> 0x193c }
            r12 = 101(0x65, float:1.42E-43)
            byte r13 = r5[r12]     // Catch:{ all -> 0x193c }
            byte r12 = (byte) r13     // Catch:{ all -> 0x193c }
            java.lang.String r6 = $$c(r6, r11, r12)     // Catch:{ all -> 0x193c }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x193c }
            r11 = 0
            r8[r11] = r6     // Catch:{ all -> 0x193c }
            r6 = 180(0xb4, float:2.52E-43)
            byte r11 = r5[r6]     // Catch:{ all -> 0x193c }
            byte r6 = (byte) r11     // Catch:{ all -> 0x193c }
            r11 = 422(0x1a6, float:5.91E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x193c }
            r12 = 29
            byte r13 = r5[r12]     // Catch:{ all -> 0x193c }
            byte r12 = (byte) r13     // Catch:{ all -> 0x193c }
            java.lang.String r6 = $$c(r6, r11, r12)     // Catch:{ all -> 0x193c }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x193c }
            r11 = 1
            r8[r11] = r6     // Catch:{ all -> 0x193c }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r8)     // Catch:{ all -> 0x193c }
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x193c }
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ all -> 0x18c4 }
            r11 = 0
            r6[r11] = r4     // Catch:{ all -> 0x18c4 }
            r4 = 180(0xb4, float:2.52E-43)
            byte r11 = r5[r4]     // Catch:{ all -> 0x18c4 }
            byte r4 = (byte) r11     // Catch:{ all -> 0x18c4 }
            r11 = 94
            byte r11 = r5[r11]     // Catch:{ all -> 0x18c4 }
            int r11 = -r11
            short r11 = (short) r11     // Catch:{ all -> 0x18c4 }
            r12 = 101(0x65, float:1.42E-43)
            byte r13 = r5[r12]     // Catch:{ all -> 0x18c4 }
            byte r12 = (byte) r13     // Catch:{ all -> 0x18c4 }
            java.lang.String r4 = $$c(r4, r11, r12)     // Catch:{ all -> 0x18c4 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x18c4 }
            r11 = 46
            byte r11 = r5[r11]     // Catch:{ all -> 0x18c4 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x18c4 }
            r12 = r11 ^ 965(0x3c5, float:1.352E-42)
            r13 = r11 & 965(0x3c5, float:1.352E-42)
            r12 = r12 | r13
            short r12 = (short) r12     // Catch:{ all -> 0x18c4 }
            r13 = 512(0x200, float:7.175E-43)
            byte r13 = r5[r13]     // Catch:{ all -> 0x18c4 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x18c4 }
            java.lang.String r11 = $$c(r11, r12, r13)     // Catch:{ all -> 0x18c4 }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ all -> 0x18c4 }
            r14 = 0
            r13[r14] = r1     // Catch:{ all -> 0x18c4 }
            java.lang.reflect.Method r4 = r4.getMethod(r11, r13)     // Catch:{ all -> 0x18c4 }
            r11 = 0
            java.lang.Object r4 = r4.invoke(r11, r6)     // Catch:{ all -> 0x18c4 }
            r8[r14] = r4     // Catch:{ all -> 0x193c }
            r8[r12] = r2     // Catch:{ all -> 0x193c }
            java.lang.Object r3 = r3.newInstance(r8)     // Catch:{ all -> 0x193c }
            r4 = 96
            byte r6 = r5[r4]     // Catch:{ Exception -> 0x183c }
            byte r4 = (byte) r6     // Catch:{ Exception -> 0x183c }
            r6 = 299(0x12b, float:4.19E-43)
            short r6 = (short) r6     // Catch:{ Exception -> 0x183c }
            r8 = 42
            byte r8 = r5[r8]     // Catch:{ Exception -> 0x183c }
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x183c }
            java.lang.String r4 = $$c(r4, r6, r8)     // Catch:{ Exception -> 0x183c }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x183c }
            r6 = 136(0x88, float:1.9E-43)
            byte r6 = r5[r6]     // Catch:{ Exception -> 0x183c }
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x183c }
            r8 = r6 ^ 840(0x348, float:1.177E-42)
            r11 = r6 & 840(0x348, float:1.177E-42)
            r8 = r8 | r11
            short r8 = (short) r8     // Catch:{ Exception -> 0x183c }
            r11 = 268(0x10c, float:3.76E-43)
            byte r11 = r5[r11]     // Catch:{ Exception -> 0x183c }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x183c }
            java.lang.String r6 = $$c(r6, r8, r11)     // Catch:{ Exception -> 0x183c }
            java.lang.reflect.Field r4 = r4.getDeclaredField(r6)     // Catch:{ Exception -> 0x183c }
            r6 = 1
            r4.setAccessible(r6)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r6 = r4.get(r2)     // Catch:{ Exception -> 0x183c }
            java.lang.Class r8 = r6.getClass()     // Catch:{ Exception -> 0x183c }
            r11 = 9
            byte r12 = r5[r11]     // Catch:{ Exception -> 0x183c }
            byte r11 = (byte) r12     // Catch:{ Exception -> 0x183c }
            r12 = 968(0x3c8, float:1.356E-42)
            short r12 = (short) r12     // Catch:{ Exception -> 0x183c }
            r13 = 3
            byte r14 = r5[r13]     // Catch:{ Exception -> 0x183c }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x183c }
            java.lang.String r11 = $$c(r11, r12, r14)     // Catch:{ Exception -> 0x183c }
            java.lang.reflect.Field r11 = r8.getDeclaredField(r11)     // Catch:{ Exception -> 0x183c }
            r12 = 1
            r11.setAccessible(r12)     // Catch:{ Exception -> 0x183c }
            r12 = 9
            byte r14 = r5[r12]     // Catch:{ Exception -> 0x183c }
            byte r12 = (byte) r14     // Catch:{ Exception -> 0x183c }
            r14 = 670(0x29e, float:9.39E-43)
            short r14 = (short) r14     // Catch:{ Exception -> 0x183c }
            r15 = 44
            byte r5 = r5[r15]     // Catch:{ Exception -> 0x183c }
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x183c }
            java.lang.String r5 = $$c(r12, r14, r5)     // Catch:{ Exception -> 0x183c }
            java.lang.reflect.Field r5 = r8.getDeclaredField(r5)     // Catch:{ Exception -> 0x183c }
            r8 = 1
            r5.setAccessible(r8)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r8 = r11.get(r6)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r6 = r5.get(r6)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x183c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x183c }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x183c }
            r12.<init>(r8)     // Catch:{ Exception -> 0x183c }
            java.lang.Class r8 = r6.getClass()     // Catch:{ Exception -> 0x183c }
            java.lang.Class r8 = r8.getComponentType()     // Catch:{ Exception -> 0x183c }
            int r14 = java.lang.reflect.Array.getLength(r6)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r14)     // Catch:{ Exception -> 0x183c }
            r15 = 0
        L_0x150a:
            if (r15 >= r14) goto L_0x152a
            java.lang.Object r7 = java.lang.reflect.Array.get(r6, r15)     // Catch:{ Exception -> 0x1520 }
            java.lang.reflect.Array.set(r8, r15, r7)     // Catch:{ Exception -> 0x1520 }
            r7 = r15 & 124(0x7c, float:1.74E-43)
            r15 = r15 | 124(0x7c, float:1.74E-43)
            int r7 = r7 + r15
            r15 = r7 & -123(0xffffffffffffff85, float:NaN)
            r7 = r7 | -123(0xffffffffffffff85, float:NaN)
            int r15 = r15 + r7
            r7 = 288(0x120, float:4.04E-43)
            goto L_0x150a
        L_0x1520:
            r0 = move-exception
            r3 = r0
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r15 = 58
            goto L_0x1844
        L_0x152a:
            r11.set(r4, r12)     // Catch:{ Exception -> 0x183c }
            r5.set(r4, r8)     // Catch:{ Exception -> 0x183c }
            java.lang.Object r2 = f9336u     // Catch:{ all -> 0x1830 }
            if (r2 != 0) goto L_0x1537
            r2 = 69
            goto L_0x1539
        L_0x1537:
            r2 = 95
        L_0x1539:
            r4 = 69
            if (r2 == r4) goto L_0x153e
            goto L_0x1540
        L_0x153e:
            f9336u = r3     // Catch:{ all -> 0x1830 }
        L_0x1540:
            r5 = r3
        L_0x1541:
            if (r43 == 0) goto L_0x162d
            byte[] r2 = $$a     // Catch:{ all -> 0x1623 }
            r3 = 96
            byte r4 = r2[r3]     // Catch:{ all -> 0x1623 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x1623 }
            r6 = 270(0x10e, float:3.78E-43)
            short r6 = (short) r6     // Catch:{ all -> 0x1623 }
            r7 = 29
            byte r8 = r2[r7]     // Catch:{ all -> 0x1623 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x1623 }
            java.lang.String r4 = $$c(r4, r6, r7)     // Catch:{ all -> 0x1623 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x1623 }
            r6 = 44
            byte r6 = r2[r6]     // Catch:{ all -> 0x1623 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x1623 }
            r7 = 957(0x3bd, float:1.341E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x1623 }
            r8 = 166(0xa6, float:2.33E-43)
            byte r8 = r2[r8]     // Catch:{ all -> 0x1623 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x1623 }
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch:{ all -> 0x1623 }
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ all -> 0x1623 }
            r7 = 0
            r8[r7] = r40     // Catch:{ all -> 0x1623 }
            r7 = 180(0xb4, float:2.52E-43)
            byte r11 = r2[r7]     // Catch:{ all -> 0x1623 }
            byte r7 = (byte) r11     // Catch:{ all -> 0x1623 }
            r11 = 422(0x1a6, float:5.91E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x1623 }
            r12 = 29
            byte r14 = r2[r12]     // Catch:{ all -> 0x1623 }
            byte r12 = (byte) r14     // Catch:{ all -> 0x1623 }
            java.lang.String r7 = $$c(r7, r11, r12)     // Catch:{ all -> 0x1623 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1623 }
            r11 = 1
            r8[r11] = r7     // Catch:{ all -> 0x1623 }
            java.lang.reflect.Method r6 = r4.getDeclaredMethod(r6, r8)     // Catch:{ all -> 0x1623 }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x1623 }
            r7 = 0
            r8[r7] = r49     // Catch:{ all -> 0x1623 }
            java.lang.Class<com.facetec.sdk.bp> r7 = com.facetec.sdk.C2854bp.class
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r12 = 16
            byte r14 = r2[r12]     // Catch:{ all -> 0x1617 }
            byte r12 = (byte) r14
            r14 = 611(0x263, float:8.56E-43)
            short r14 = (short) r14
            r15 = 58
            byte r3 = r2[r15]     // Catch:{ all -> 0x1615 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x1615 }
            java.lang.String r3 = $$c(r12, r14, r3)     // Catch:{ all -> 0x1615 }
            r12 = 0
            java.lang.reflect.Method r3 = r11.getMethod(r3, r12)     // Catch:{ all -> 0x1615 }
            java.lang.Object r3 = r3.invoke(r7, r12)     // Catch:{ all -> 0x1615 }
            r7 = 1
            r8[r7] = r3     // Catch:{ all -> 0x166a }
            java.lang.Object r3 = r6.invoke(r5, r8)     // Catch:{ all -> 0x166a }
            if (r3 == 0) goto L_0x1611
            int r6 = $10
            r8 = r6 | 77
            int r8 = r8 << r7
            r6 = r6 ^ 77
            int r8 = r8 - r6
            int r6 = r8 % 128
            $11 = r6
            r6 = 2
            int r8 = r8 % r6
            if (r8 != 0) goto L_0x15e9
            r6 = 14371(0x3823, float:2.0138E-41)
            byte r6 = r2[r6]     // Catch:{ all -> 0x166a }
            byte r6 = (byte) r6     // Catch:{ all -> 0x166a }
            r7 = r6 & 30344(0x7688, float:4.2521E-41)
            short r7 = (short) r7     // Catch:{ all -> 0x166a }
            r8 = 19822(0x4d6e, float:2.7777E-41)
            byte r2 = r2[r8]     // Catch:{ all -> 0x166a }
            byte r2 = (byte) r2     // Catch:{ all -> 0x166a }
            java.lang.String r2 = $$c(r6, r7, r2)     // Catch:{ all -> 0x166a }
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x166a }
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r2, r7)     // Catch:{ all -> 0x166a }
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x166a }
            r2.invoke(r5, r6)     // Catch:{ all -> 0x166a }
            goto L_0x1611
        L_0x15e9:
            r6 = 500(0x1f4, float:7.0E-43)
            byte r7 = r2[r6]     // Catch:{ all -> 0x160a }
            byte r6 = (byte) r7
            r7 = r6 ^ 674(0x2a2, float:9.44E-43)
            r8 = r6 & 674(0x2a2, float:9.44E-43)
            r7 = r7 | r8
            short r7 = (short) r7
            r8 = 926(0x39e, float:1.298E-42)
            byte r2 = r2[r8]     // Catch:{ all -> 0x166a }
            byte r2 = (byte) r2     // Catch:{ all -> 0x166a }
            java.lang.String r2 = $$c(r6, r7, r2)     // Catch:{ all -> 0x166a }
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x166a }
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r2, r7)     // Catch:{ all -> 0x166a }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x166a }
            r2.invoke(r5, r4)     // Catch:{ all -> 0x166a }
            goto L_0x1611
        L_0x160a:
            r0 = move-exception
            r2 = r0
            r8 = r6
            r7 = 21
            goto L_0x1838
        L_0x1611:
            r2 = r3
            r6 = 29
            goto L_0x1676
        L_0x1615:
            r0 = move-exception
            goto L_0x161a
        L_0x1617:
            r0 = move-exception
            r15 = 58
        L_0x161a:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x166a }
            if (r3 == 0) goto L_0x1622
            throw r3     // Catch:{ all -> 0x166a }
        L_0x1622:
            throw r2     // Catch:{ all -> 0x166a }
        L_0x1623:
            r0 = move-exception
            r15 = 58
        L_0x1626:
            r2 = r0
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x1838
        L_0x162d:
            r15 = 58
            byte[] r2 = $$a     // Catch:{ all -> 0x182a }
            r3 = 180(0xb4, float:2.52E-43)
            byte r4 = r2[r3]     // Catch:{ all -> 0x182a }
            byte r3 = (byte) r4     // Catch:{ all -> 0x182a }
            r4 = 422(0x1a6, float:5.91E-43)
            short r4 = (short) r4     // Catch:{ all -> 0x182a }
            r6 = 29
            byte r7 = r2[r6]     // Catch:{ all -> 0x182a }
            byte r7 = (byte) r7     // Catch:{ all -> 0x182a }
            java.lang.String r3 = $$c(r3, r4, r7)     // Catch:{ all -> 0x182a }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x182a }
            r4 = 44
            byte r4 = r2[r4]     // Catch:{ all -> 0x182a }
            byte r4 = (byte) r4     // Catch:{ all -> 0x182a }
            r7 = 957(0x3bd, float:1.341E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x182a }
            r8 = 166(0xa6, float:2.33E-43)
            byte r2 = r2[r8]     // Catch:{ all -> 0x182a }
            byte r2 = (byte) r2     // Catch:{ all -> 0x182a }
            java.lang.String r2 = $$c(r4, r7, r2)     // Catch:{ all -> 0x182a }
            r4 = 1
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x182a }
            r8 = 0
            r7[r8] = r40     // Catch:{ all -> 0x182a }
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r7)     // Catch:{ all -> 0x182a }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x166c }
            r3[r8] = r49     // Catch:{ InvocationTargetException -> 0x166c }
            java.lang.Object r2 = r2.invoke(r5, r3)     // Catch:{ InvocationTargetException -> 0x166c }
            goto L_0x1676
        L_0x166a:
            r0 = move-exception
            goto L_0x1626
        L_0x166c:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ ClassNotFoundException -> 0x1675 }
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch:{ ClassNotFoundException -> 0x1675 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x1675 }
        L_0x1675:
            r2 = 0
        L_0x1676:
            if (r2 == 0) goto L_0x167a
            r3 = 0
            goto L_0x167b
        L_0x167a:
            r3 = 1
        L_0x167b:
            if (r3 == 0) goto L_0x16c1
            r3 = 2
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x166a }
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x166a }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x166a }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x166a }
            r3 = r48
            java.lang.reflect.Constructor r2 = r3.getDeclaredConstructor(r2)     // Catch:{ all -> 0x166a }
            r2.setAccessible(r4)     // Catch:{ all -> 0x166a }
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x166a }
            r3 = 0
            r4[r3] = r5     // Catch:{ all -> 0x166a }
            if (r43 != 0) goto L_0x169d
            r3 = 1
            goto L_0x169e
        L_0x169d:
            r3 = 0
        L_0x169e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x166a }
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x166a }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ all -> 0x166a }
            f9340y = r2     // Catch:{ all -> 0x166a }
            int r2 = $11
            int r2 = r2 + 47
            int r3 = r2 % 128
            $10 = r3
            r3 = 2
            int r2 = r2 % r3
            r2 = 0
            r3 = 1
            r4 = 9
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            goto L_0x1a82
        L_0x16c1:
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x182a }
            byte[] r3 = $$a     // Catch:{ all -> 0x182a }
            r4 = 500(0x1f4, float:7.0E-43)
            byte r7 = r3[r4]     // Catch:{ all -> 0x1825 }
            byte r4 = (byte) r7
            r7 = 645(0x285, float:9.04E-43)
            short r7 = (short) r7
            r8 = 16
            byte r11 = r3[r8]     // Catch:{ all -> 0x182a }
            byte r11 = (byte) r11     // Catch:{ all -> 0x182a }
            java.lang.String r4 = $$c(r4, r7, r11)     // Catch:{ all -> 0x182a }
            r7 = 2
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x182a }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x182a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x182a }
            r12 = 1
            r11[r12] = r7     // Catch:{ all -> 0x182a }
            java.lang.reflect.Constructor r7 = r2.getDeclaredConstructor(r11)     // Catch:{ all -> 0x182a }
            r7.setAccessible(r12)     // Catch:{ all -> 0x182a }
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x182a }
            r11 = 0
            r12[r11] = r5     // Catch:{ all -> 0x182a }
            if (r43 != 0) goto L_0x16f4
            r5 = 1
            goto L_0x16f5
        L_0x16f4:
            r5 = 0
        L_0x16f5:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x182a }
            r11 = 1
            r12[r11] = r5     // Catch:{ all -> 0x182a }
            java.lang.Object r5 = r7.newInstance(r12)     // Catch:{ all -> 0x182a }
            f9340y = r5     // Catch:{ all -> 0x182a }
            r5 = 103916(0x195ec, float:1.45617E-40)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x182a }
            java.lang.Class<com.facetec.sdk.bp> r7 = com.facetec.sdk.C2854bp.class
            r11 = 184(0xb8, float:2.58E-43)
            byte r11 = r3[r11]     // Catch:{ all -> 0x182a }
            byte r11 = (byte) r11     // Catch:{ all -> 0x182a }
            r12 = r11 ^ 518(0x206, float:7.26E-43)
            r14 = r11 & 518(0x206, float:7.26E-43)
            r12 = r12 | r14
            short r12 = (short) r12     // Catch:{ all -> 0x182a }
            r14 = 101(0x65, float:1.42E-43)
            byte r6 = r3[r14]     // Catch:{ all -> 0x182a }
            byte r6 = (byte) r6     // Catch:{ all -> 0x182a }
            java.lang.String r6 = $$c(r11, r12, r6)     // Catch:{ all -> 0x182a }
            java.io.InputStream r6 = r7.getResourceAsStream(r6)     // Catch:{ all -> 0x182a }
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x1817 }
            r7 = 0
            r11[r7] = r6     // Catch:{ all -> 0x1817 }
            r6 = 180(0xb4, float:2.52E-43)
            byte r7 = r3[r6]     // Catch:{ all -> 0x1817 }
            byte r6 = (byte) r7     // Catch:{ all -> 0x1817 }
            r12 = 499(0x1f3, float:6.99E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x1817 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x1817 }
            java.lang.String r6 = $$c(r6, r12, r7)     // Catch:{ all -> 0x1817 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x1817 }
            r7 = 1
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ all -> 0x1817 }
            r7 = 180(0xb4, float:2.52E-43)
            byte r8 = r3[r7]     // Catch:{ all -> 0x1817 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x1817 }
            r8 = r7 ^ 978(0x3d2, float:1.37E-42)
            r10 = r7 & 978(0x3d2, float:1.37E-42)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch:{ all -> 0x1817 }
            r10 = 101(0x65, float:1.42E-43)
            byte r13 = r3[r10]     // Catch:{ all -> 0x1817 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x1817 }
            java.lang.String r7 = $$c(r7, r8, r10)     // Catch:{ all -> 0x1817 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1817 }
            r8 = 0
            r14[r8] = r7     // Catch:{ all -> 0x1817 }
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r14)     // Catch:{ all -> 0x1817 }
            java.lang.Object r6 = r6.newInstance(r11)     // Catch:{ all -> 0x1817 }
            int r7 = $11
            r8 = r7 & 33
            r7 = r7 | 33
            int r8 = r8 + r7
            int r7 = r8 % 128
            $10 = r7
            r7 = 2
            int r8 = r8 % r7
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x1809 }
            r7 = 0
            r8[r7] = r5     // Catch:{ all -> 0x1809 }
            r7 = 180(0xb4, float:2.52E-43)
            byte r10 = r3[r7]     // Catch:{ all -> 0x1809 }
            byte r7 = (byte) r10     // Catch:{ all -> 0x1809 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x1809 }
            java.lang.String r7 = $$c(r7, r12, r10)     // Catch:{ all -> 0x1809 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x1809 }
            r10 = 21
            byte r11 = r3[r10]     // Catch:{ all -> 0x1806 }
            byte r10 = (byte) r11
            r11 = 208(0xd0, float:2.91E-43)
            short r11 = (short) r11
            r13 = 166(0xa6, float:2.33E-43)
            byte r13 = r3[r13]     // Catch:{ all -> 0x1809 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x1809 }
            java.lang.String r10 = $$c(r10, r11, r13)     // Catch:{ all -> 0x1809 }
            r11 = 1
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ all -> 0x1809 }
            r11 = 0
            r13[r11] = r1     // Catch:{ all -> 0x1809 }
            java.lang.reflect.Method r7 = r7.getMethod(r10, r13)     // Catch:{ all -> 0x1809 }
            r7.invoke(r6, r8)     // Catch:{ all -> 0x1809 }
            r7 = 180(0xb4, float:2.52E-43)
            byte r8 = r3[r7]     // Catch:{ all -> 0x17f8 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x17f8 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x17f8 }
            java.lang.String r7 = $$c(r7, r12, r8)     // Catch:{ all -> 0x17f8 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x17f8 }
            r8 = 500(0x1f4, float:7.0E-43)
            byte r10 = r3[r8]     // Catch:{ all -> 0x17f4 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x17f4 }
            r11 = r10 ^ 674(0x2a2, float:9.44E-43)
            r12 = r10 & 674(0x2a2, float:9.44E-43)
            r11 = r11 | r12
            short r11 = (short) r11     // Catch:{ all -> 0x17f4 }
            r12 = 926(0x39e, float:1.298E-42)
            byte r3 = r3[r12]     // Catch:{ all -> 0x17f4 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x17f4 }
            java.lang.String r3 = $$c(r10, r11, r3)     // Catch:{ all -> 0x17f4 }
            r10 = 0
            java.lang.reflect.Method r3 = r7.getMethod(r3, r10)     // Catch:{ all -> 0x17f4 }
            r3.invoke(r6, r10)     // Catch:{ all -> 0x17f4 }
            int r3 = $10
            r6 = r3 | 21
            r7 = 1
            int r6 = r6 << r7
            r7 = 21
            r3 = r3 ^ r7
            int r6 = r6 - r3
            int r3 = r6 % 128
            $11 = r3
            r3 = 2
            int r6 = r6 % r3
            int r3 = java.lang.Math.abs(r39)     // Catch:{ all -> 0x17f2 }
            r6 = 103869(0x195bd, float:1.45551E-40)
            r11 = r40
            r12 = r42
            r15 = r43
            r7 = r47
            r50 = r5
            r5 = r2
            r2 = r50
            r51 = r6
            r6 = r4
            r4 = r51
            goto L_0x09b0
        L_0x17f2:
            r0 = move-exception
            goto L_0x1837
        L_0x17f4:
            r0 = move-exception
            r7 = 21
            goto L_0x17fd
        L_0x17f8:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
        L_0x17fd:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x17f2 }
            if (r3 == 0) goto L_0x1805
            throw r3     // Catch:{ all -> 0x17f2 }
        L_0x1805:
            throw r2     // Catch:{ all -> 0x17f2 }
        L_0x1806:
            r0 = move-exception
            r7 = r10
            goto L_0x180c
        L_0x1809:
            r0 = move-exception
            r7 = 21
        L_0x180c:
            r8 = 500(0x1f4, float:7.0E-43)
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x17f2 }
            if (r3 == 0) goto L_0x1816
            throw r3     // Catch:{ all -> 0x17f2 }
        L_0x1816:
            throw r2     // Catch:{ all -> 0x17f2 }
        L_0x1817:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x17f2 }
            if (r3 == 0) goto L_0x1824
            throw r3     // Catch:{ all -> 0x17f2 }
        L_0x1824:
            throw r2     // Catch:{ all -> 0x17f2 }
        L_0x1825:
            r0 = move-exception
            r8 = r4
            r7 = 21
            goto L_0x1837
        L_0x182a:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x1837
        L_0x1830:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r15 = 58
        L_0x1837:
            r2 = r0
        L_0x1838:
            r10 = 25
            goto L_0x1a54
        L_0x183c:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r15 = 58
            r3 = r0
        L_0x1844:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x18bf }
            r4.<init>()     // Catch:{ all -> 0x18bf }
            byte[] r5 = $$a     // Catch:{ all -> 0x18bf }
            r6 = 52
            byte r6 = r5[r6]     // Catch:{ all -> 0x18bf }
            byte r6 = (byte) r6     // Catch:{ all -> 0x18bf }
            r10 = 418(0x1a2, float:5.86E-43)
            short r10 = (short) r10     // Catch:{ all -> 0x18bf }
            r11 = 926(0x39e, float:1.298E-42)
            byte r11 = r5[r11]     // Catch:{ all -> 0x18bf }
            byte r11 = (byte) r11     // Catch:{ all -> 0x18bf }
            java.lang.String r6 = $$c(r6, r10, r11)     // Catch:{ all -> 0x18bf }
            r4.append(r6)     // Catch:{ all -> 0x18bf }
            r4.append(r2)     // Catch:{ all -> 0x18bf }
            r2 = 410(0x19a, float:5.75E-43)
            byte r2 = r5[r2]     // Catch:{ all -> 0x18bf }
            r6 = 1
            int r2 = r2 - r6
            byte r2 = (byte) r2
            r6 = 270(0x10e, float:3.78E-43)
            short r6 = (short) r6
            r10 = 25
            byte r11 = r5[r10]     // Catch:{ all -> 0x19e1 }
            r12 = r11 & -1
            r11 = r11 | -1
            int r12 = r12 + r11
            byte r11 = (byte) r12     // Catch:{ all -> 0x19e1 }
            java.lang.String r2 = $$c(r2, r6, r11)     // Catch:{ all -> 0x19e1 }
            r4.append(r2)     // Catch:{ all -> 0x19e1 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x19e1 }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x18b5 }
            r4 = 1
            r6[r4] = r3     // Catch:{ all -> 0x18b5 }
            r3 = 0
            r6[r3] = r2     // Catch:{ all -> 0x18b5 }
            r2 = 180(0xb4, float:2.52E-43)
            byte r3 = r5[r2]     // Catch:{ all -> 0x18b5 }
            byte r2 = (byte) r3     // Catch:{ all -> 0x18b5 }
            r3 = 808(0x328, float:1.132E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x18b5 }
            r4 = 101(0x65, float:1.42E-43)
            byte r5 = r5[r4]     // Catch:{ all -> 0x18b5 }
            byte r4 = (byte) r5     // Catch:{ all -> 0x18b5 }
            java.lang.String r2 = $$c(r2, r3, r4)     // Catch:{ all -> 0x18b5 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x18b5 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x18b5 }
            r3 = 0
            r4[r3] = r40     // Catch:{ all -> 0x18b5 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r5 = 1
            r4[r5] = r3     // Catch:{ all -> 0x18b5 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ all -> 0x18b5 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ all -> 0x18b5 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x18b5 }
            throw r2     // Catch:{ all -> 0x18b5 }
        L_0x18b5:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x18be
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x18be:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x18bf:
            r0 = move-exception
            r10 = 25
            goto L_0x1a53
        L_0x18c4:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x18d5
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x18d5:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x18d6:
            r0 = move-exception
            r15 = r11
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            goto L_0x18e8
        L_0x18df:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
        L_0x18e8:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x18f0
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x18f0:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x18f1:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1902
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1902:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1903:
            r0 = move-exception
            r7 = r13
            goto L_0x1909
        L_0x1906:
            r0 = move-exception
            r7 = 21
        L_0x1909:
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1917
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1917:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1918:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1929
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1929:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x192a:
            r0 = move-exception
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x193b
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x193b:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x193c:
            r0 = move-exception
            goto L_0x1a4b
        L_0x193f:
            r0 = move-exception
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1952
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1952:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1953:
            r0 = move-exception
            goto L_0x196c
        L_0x1955:
            r0 = move-exception
            r10 = r6
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x1974
        L_0x1960:
            r0 = move-exception
            r8 = r3
            r40 = r11
            r42 = r12
            r7 = 21
            goto L_0x1972
        L_0x1969:
            r0 = move-exception
            r40 = r11
        L_0x196c:
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
        L_0x1972:
            r10 = 25
        L_0x1974:
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x197e
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x197e:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x197f:
            r0 = move-exception
            r40 = r11
            r42 = r12
            goto L_0x1999
        L_0x1985:
            r0 = move-exception
            r15 = r4
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            goto L_0x199f
        L_0x1992:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
        L_0x1999:
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
        L_0x199f:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x19a7
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x19a7:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x19a8:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            goto L_0x19c2
        L_0x19b6:
            r0 = move-exception
            r15 = r4
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
        L_0x19c2:
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x19ca
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x19ca:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x19cb:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x19e0
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x19e0:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x19e1:
            r0 = move-exception
            goto L_0x1a53
        L_0x19e4:
            r0 = move-exception
            r8 = r6
            r40 = r11
            r42 = r12
            r7 = 21
            goto L_0x19f6
        L_0x19ed:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
        L_0x19f6:
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1a02
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1a02:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1a03:
            r0 = move-exception
            r7 = r6
            r40 = r11
            r42 = r12
            goto L_0x1a11
        L_0x1a0a:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
        L_0x1a11:
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1a1f
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1a1f:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1a20:
            r0 = move-exception
            r40 = r11
            r42 = r12
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x19e1 }
            if (r3 == 0) goto L_0x1a35
            throw r3     // Catch:{ all -> 0x19e1 }
        L_0x1a35:
            throw r2     // Catch:{ all -> 0x19e1 }
        L_0x1a36:
            r0 = move-exception
            goto L_0x1a47
        L_0x1a38:
            r0 = move-exception
            r29 = r3
            r30 = r4
            r38 = r5
            r32 = r6
            r33 = r7
            r37 = r8
            r35 = r10
        L_0x1a47:
            r40 = r11
            r42 = r12
        L_0x1a4b:
            r7 = 21
            r8 = 500(0x1f4, float:7.0E-43)
            r10 = 25
            r15 = 58
        L_0x1a53:
            r2 = r0
        L_0x1a54:
            r3 = r38 | 1
            r4 = 1
            int r3 = r3 << r4
            r4 = r38 ^ 1
            int r3 = r3 - r4
        L_0x1a5b:
            r4 = 9
            if (r3 >= r4) goto L_0x1a78
            boolean r5 = r35[r3]     // Catch:{ Exception -> 0x1b1a }
            if (r5 == 0) goto L_0x1a65
            r5 = 1
            goto L_0x1a66
        L_0x1a65:
            r5 = 0
        L_0x1a66:
            r6 = 1
            if (r5 == r6) goto L_0x1a76
            r5 = r3 ^ -10
            r3 = r3 & -10
            int r3 = r3 << r6
            int r5 = r5 + r3
            r3 = r5 ^ 11
            r5 = r5 & 11
            int r5 = r5 << r6
            int r3 = r3 + r5
            goto L_0x1a5b
        L_0x1a76:
            r3 = 1
            goto L_0x1a79
        L_0x1a78:
            r3 = 0
        L_0x1a79:
            if (r3 == 0) goto L_0x1aa0
            r2 = 0
            f9340y = r2     // Catch:{ Exception -> 0x1b1a }
            f9336u = r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1a80:
            r3 = r29
        L_0x1a82:
            r5 = r38 | 39
            r6 = 1
            int r5 = r5 << r6
            r6 = r38 ^ 39
            int r5 = r5 - r6
            r6 = r5 & -38
            r5 = r5 | -38
            int r5 = r5 + r6
            r4 = r30
            r6 = r32
            r7 = r33
            r10 = r35
            r8 = r37
            r11 = r40
            r12 = r42
            r2 = 0
            r14 = 3
            goto L_0x03d9
        L_0x1aa0:
            byte[] r1 = $$a     // Catch:{ Exception -> 0x1b1a }
            r3 = 52
            byte r3 = r1[r3]     // Catch:{ Exception -> 0x1b1a }
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x1b1a }
            r4 = 388(0x184, float:5.44E-43)
            short r4 = (short) r4     // Catch:{ Exception -> 0x1b1a }
            r5 = 180(0xb4, float:2.52E-43)
            byte r6 = r1[r5]     // Catch:{ Exception -> 0x1b1a }
            byte r5 = (byte) r6     // Catch:{ Exception -> 0x1b1a }
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch:{ Exception -> 0x1b1a }
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x1ae7 }
            r4 = 1
            r5[r4] = r2     // Catch:{ all -> 0x1ae7 }
            r2 = 0
            r5[r2] = r3     // Catch:{ all -> 0x1ae7 }
            r2 = 180(0xb4, float:2.52E-43)
            byte r2 = r1[r2]     // Catch:{ all -> 0x1ae7 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x1ae7 }
            r3 = 808(0x328, float:1.132E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x1ae7 }
            r4 = 101(0x65, float:1.42E-43)
            byte r1 = r1[r4]     // Catch:{ all -> 0x1ae7 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x1ae7 }
            java.lang.String r1 = $$c(r2, r3, r1)     // Catch:{ all -> 0x1ae7 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x1ae7 }
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x1ae7 }
            r3 = 0
            r2[r3] = r40     // Catch:{ all -> 0x1ae7 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x1ae7 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x1ae7 }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ all -> 0x1ae7 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x1ae7 }
            throw r1     // Catch:{ all -> 0x1ae7 }
        L_0x1ae7:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x1af0
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1af0:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x1af1:
            return
        L_0x1af2:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x1afb
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1afb:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x1afc:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x1b05
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1b05:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x1b06:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x1b0f
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1b0f:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x1b10:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ Exception -> 0x1b1a }
            if (r2 == 0) goto L_0x1b19
            throw r2     // Catch:{ Exception -> 0x1b1a }
        L_0x1b19:
            throw r1     // Catch:{ Exception -> 0x1b1a }
        L_0x1b1a:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2854bp.<clinit>():void");
    }

    private C2854bp() {
    }

    /* renamed from: b */
    public static Object m11559b(char c, int i, int i2) {
        Object obj;
        int i3 = $11;
        int i4 = (i3 & 91) + (i3 | 91);
        $10 = i4 % 128;
        boolean z = false;
        if (!(i4 % 2 != 0)) {
            obj = f9340y;
        } else {
            obj = f9340y;
            int i5 = 57 / 0;
        }
        int i6 = (i3 & 99) + (i3 | 99);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(i);
            objArr[0] = Character.valueOf(c);
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) bArr[500], (short) 330, (byte) bArr[16]), true, (ClassLoader) f9336u);
            String $$c = $$c((byte) bArr[58], (short) 698, (byte) ((bArr[25] - 0) - 1));
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, new Class[]{Character.TYPE, cls2, cls2}).invoke(obj, objArr);
            int i8 = $11 + 27;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
            if (z) {
                return invoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static int m11560c(int i) {
        int i2 = $11;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 == 0) {
            Object obj = f9340y;
            int i5 = (i4 ^ 101) + ((i4 & 101) << 1);
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                byte[] bArr = $$a;
                Class<?> cls = Class.forName($$c((byte) bArr[500], (short) 330, (byte) bArr[16]), true, (ClassLoader) f9336u);
                byte b = bArr[25];
                int intValue = ((Integer) cls.getMethod($$c((byte) bArr[96], (short) 721, (byte) ((b ^ -1) + ((b & -1) << 1))), new Class[]{Integer.TYPE}).invoke(obj, objArr)).intValue();
                int i7 = $10 + 33;
                $11 = i7 % 128;
                if ((i7 % 2 == 0 ? 26 : '>') != 26) {
                    return intValue;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            throw null;
        }
    }

    static void init$0() {
        int i;
        int i2 = $10 + 109;
        $11 = i2 % 128;
        if ((i2 % 2 == 0 ? '-' : 16) != 16) {
            byte[] bArr = new byte[1014];
            System.arraycopy("!î\fú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6\u0013µ\u0003\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015Ï/\u0002û\u0006\u0001\u0011\u0000ò\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\f\bù\u0004\u0016Ú\u001aþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0001\u0012é\u0018\u0003\u0001Ù/\u0002\t\u0001\u0000\u0000\nä\u0018\u0007û\r\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u000f\u0001Ä;þ\u0005\u0005\u0012ô\u0001ÎHô\nÆ7\u0013µ\u0003\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\u0001\u0012ß%ö\u0011\u0003õ\u0002ò$ð\u0016ôâ4\u0000ò\u0016ø\t\u0002î\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\nõ\u0012á\u0016ÿ\u0006î\"\u0001\u0010\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\nú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016\u000f\u0001Ä;þ\u0005\u0005\u0012ô\u0001ÎHô\nú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t7\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6Îû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010øþ8\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6\u0011·Eô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u00067\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ5Ïú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½)\u0014\u0016ÿä\"ø\u0006\nô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006ü\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006î\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1014);
            $$a = bArr;
            i = 3;
        } else {
            byte[] bArr2 = new byte[1014];
            System.arraycopy("!î\fú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6\u0013µ\u0003\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015Ï/\u0002û\u0006\u0001\u0011\u0000ò\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\f\bù\u0004\u0016Ú\u001aþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0001\u0012é\u0018\u0003\u0001Ù/\u0002\t\u0001\u0000\u0000\nä\u0018\u0007û\r\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u000f\u0001Ä;þ\u0005\u0005\u0012ô\u0001ÎHô\nÆ7\u0013µ\u0003\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\u0001\u0012ß%ö\u0011\u0003õ\u0002ò$ð\u0016ôâ4\u0000ò\u0016ø\t\u0002î\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\nõ\u0012á\u0016ÿ\u0006î\"\u0001\u0010\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\nú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016\u000f\u0001Ä;þ\u0005\u0005\u0012ô\u0001ÎHô\nú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t7\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6Îû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010øþ8\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ6\u0011·Eô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u00067\u000f\u0001Å:þ\u0005\u0005\u0012ô\u0001ÏGô\nÇ5Ïú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½)\u0014\u0016ÿä\"ø\u0006\nô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006ü\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006î\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1014);
            $$a = bArr2;
            i = 89;
        }
        $$b = i;
    }

    /* renamed from: c */
    public static int m11561c(Object obj) {
        int i = $11 + 73;
        int i2 = i % 128;
        $10 = i2;
        int i3 = i % 2;
        Object obj2 = f9340y;
        int i4 = ((i2 | 77) << 1) - (i2 ^ 77);
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        int i7 = (i5 & 65) + (i5 | 65);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c((byte) bArr[500], (short) 330, (byte) bArr[16]), true, (ClassLoader) f9336u).getMethod($$c((byte) bArr[96], (short) 721, (byte) (bArr[25] - 1)), new Class[]{Object.class}).invoke(obj2, objArr)).intValue();
            int i9 = $11;
            int i12 = (i9 ^ 17) + ((i9 & 17) << 1);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
