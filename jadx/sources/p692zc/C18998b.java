package p692zc;

/* renamed from: zc.b */
public final class C18998b {

    /* renamed from: a */
    private final String f53022a = "identomat_";

    /* renamed from: b */
    private String f53023b = "en";

    /* renamed from: c */
    private boolean f53024c = true;

    /* renamed from: d */
    private boolean f53025d = true;

    /* renamed from: e */
    private boolean f53026e;

    /* renamed from: f */
    private boolean f53027f;

    /* renamed from: g */
    private boolean f53028g;

    /* renamed from: h */
    private boolean f53029h;

    /* renamed from: i */
    private boolean f53030i;

    /* renamed from: j */
    private String f53031j = "computer";

    /* renamed from: k */
    private boolean f53032k;

    /* renamed from: l */
    private boolean f53033l;

    /* renamed from: m */
    private boolean f53034m;

    /* renamed from: n */
    private boolean f53035n;

    /* renamed from: o */
    private boolean f53036o;

    /* renamed from: p */
    private boolean f53037p;

    /* renamed from: q */
    private boolean f53038q;

    /* renamed from: r */
    private boolean f53039r;

    /* renamed from: s */
    private boolean f53040s;

    /* renamed from: t */
    private boolean f53041t;

    /* renamed from: a */
    public final boolean mo47052a() {
        return this.f53024c;
    }

    /* renamed from: b */
    public final boolean mo47053b() {
        return this.f53038q;
    }

    /* renamed from: c */
    public final boolean mo47054c() {
        return this.f53039r;
    }

    /* renamed from: d */
    public final boolean mo47055d() {
        return this.f53030i;
    }

    /* renamed from: e */
    public final boolean mo47056e() {
        return this.f53040s;
    }

    /* renamed from: f */
    public final boolean mo47057f() {
        return this.f53041t;
    }

    /* renamed from: g */
    public final boolean mo47058g() {
        return this.f53034m;
    }

    /* renamed from: h */
    public final boolean mo47059h() {
        return this.f53036o;
    }

    /* renamed from: i */
    public final boolean mo47060i() {
        return this.f53032k;
    }

    /* renamed from: j */
    public final boolean mo47061j() {
        return this.f53033l;
    }

    /* renamed from: k */
    public final boolean mo47062k() {
        return this.f53035n;
    }

    /* renamed from: l */
    public final boolean mo47063l() {
        return this.f53037p;
    }

    /* renamed from: m */
    public final String mo47064m() {
        return this.f53023b;
    }

    /* renamed from: n */
    public final boolean mo47065n() {
        return this.f53025d;
    }

    /* renamed from: o */
    public final boolean mo47066o() {
        return this.f53028g;
    }

    /* renamed from: p */
    public final String mo47067p() {
        return this.f53031j;
    }

    /* renamed from: q */
    public final boolean mo47068q() {
        return this.f53029h;
    }

    /* renamed from: r */
    public final boolean mo47069r() {
        return this.f53027f;
    }

    /* renamed from: s */
    public final boolean mo47070s() {
        return this.f53026e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47071t(org.json.JSONObject r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "cascading_identity_verification"
            java.lang.String r3 = "capture_double_page_passport"
            java.lang.String r4 = "allow_general_document_upload"
            java.lang.String r5 = "allow_general_document_capture"
            java.lang.String r6 = "document_type_residence_license"
            java.lang.String r7 = "document_type_driver_license"
            java.lang.String r8 = "document_type_passport"
            java.lang.String r9 = "document_type_id"
            java.lang.String r10 = "allow_nfc_capture"
            java.lang.String r11 = "server"
            java.lang.String r12 = "skip_agreement"
            java.lang.String r13 = "require_face_document"
            java.lang.String r14 = "skip_document"
            java.lang.String r15 = "skip_face"
            r16 = r2
            java.lang.String r2 = "allow_document_upload"
            r17 = r3
            java.lang.String r3 = "liveness"
            r18 = r4
            java.lang.String r4 = "language"
            r19 = r5
            java.lang.String r5 = "jsonObject"
            kotlin.jvm.internal.C41536l.m120489i(r0, r5)
            java.lang.String r5 = "flags"
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x0249 }
            boolean r5 = r0.has(r4)     // Catch:{ Exception -> 0x0249 }
            r20 = 0
            if (r5 == 0) goto L_0x0054
            java.lang.Object r4 = r0.get(r4)     // Catch:{ Exception -> 0x0249 }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x0249 }
            if (r5 == 0) goto L_0x004c
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0249 }
            goto L_0x004e
        L_0x004c:
            r4 = r20
        L_0x004e:
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = r1.f53023b     // Catch:{ Exception -> 0x0249 }
        L_0x0052:
            r1.f53023b = r4     // Catch:{ Exception -> 0x0249 }
        L_0x0054:
            boolean r4 = r0.has(r3)     // Catch:{ Exception -> 0x0249 }
            if (r4 == 0) goto L_0x0072
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x0249 }
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r4 == 0) goto L_0x0065
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0249 }
            goto L_0x0067
        L_0x0065:
            r3 = r20
        L_0x0067:
            if (r3 != 0) goto L_0x006c
            boolean r3 = r1.f53025d     // Catch:{ Exception -> 0x0249 }
            goto L_0x0070
        L_0x006c:
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0070:
            r1.f53025d = r3     // Catch:{ Exception -> 0x0249 }
        L_0x0072:
            boolean r3 = r0.has(r2)     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0090
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0083
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0085
        L_0x0083:
            r2 = r20
        L_0x0085:
            if (r2 != 0) goto L_0x008a
            boolean r2 = r1.f53024c     // Catch:{ Exception -> 0x0249 }
            goto L_0x008e
        L_0x008a:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x008e:
            r1.f53024c = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0090:
            boolean r2 = r0.has(r15)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r0.get(r15)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x00a1
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x00a3
        L_0x00a1:
            r2 = r20
        L_0x00a3:
            if (r2 != 0) goto L_0x00a8
            boolean r2 = r1.f53026e     // Catch:{ Exception -> 0x0249 }
            goto L_0x00ac
        L_0x00a8:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x00ac:
            r1.f53026e = r2     // Catch:{ Exception -> 0x0249 }
        L_0x00ae:
            boolean r2 = r0.has(r14)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r0.get(r14)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x00bf
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x00c1
        L_0x00bf:
            r2 = r20
        L_0x00c1:
            if (r2 != 0) goto L_0x00c6
            boolean r2 = r1.f53027f     // Catch:{ Exception -> 0x0249 }
            goto L_0x00ca
        L_0x00c6:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x00ca:
            r1.f53027f = r2     // Catch:{ Exception -> 0x0249 }
        L_0x00cc:
            boolean r2 = r0.has(r13)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r2 = r0.get(r13)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x00dd
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x00df
        L_0x00dd:
            r2 = r20
        L_0x00df:
            if (r2 != 0) goto L_0x00e4
            boolean r2 = r1.f53028g     // Catch:{ Exception -> 0x0249 }
            goto L_0x00e8
        L_0x00e4:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x00e8:
            r1.f53028g = r2     // Catch:{ Exception -> 0x0249 }
        L_0x00ea:
            boolean r2 = r0.has(r12)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x0108
            java.lang.Object r2 = r0.get(r12)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x00fb
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x00fd
        L_0x00fb:
            r2 = r20
        L_0x00fd:
            if (r2 != 0) goto L_0x0102
            boolean r2 = r1.f53029h     // Catch:{ Exception -> 0x0249 }
            goto L_0x0106
        L_0x0102:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0106:
            r1.f53029h = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0108:
            boolean r2 = r0.has(r11)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x0122
            java.lang.Object r2 = r0.get(r11)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0119
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x011b
        L_0x0119:
            r2 = r20
        L_0x011b:
            if (r2 != 0) goto L_0x011f
            java.lang.String r2 = r1.f53031j     // Catch:{ Exception -> 0x0249 }
        L_0x011f:
            r1.f53031j = r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0126
        L_0x0122:
            java.lang.String r2 = "computer"
            r1.f53031j = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0126:
            boolean r2 = r0.has(r10)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r0.get(r10)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0137
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0139
        L_0x0137:
            r2 = r20
        L_0x0139:
            if (r2 != 0) goto L_0x013e
            boolean r2 = r1.f53030i     // Catch:{ Exception -> 0x0249 }
            goto L_0x0142
        L_0x013e:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0142:
            r1.f53030i = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0144:
            boolean r2 = r0.has(r9)     // Catch:{ Exception -> 0x0249 }
            r3 = 0
            if (r2 == 0) goto L_0x0164
            java.lang.Object r2 = r0.get(r9)     // Catch:{ Exception -> 0x0249 }
            boolean r4 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r4 == 0) goto L_0x0156
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0158
        L_0x0156:
            r2 = r20
        L_0x0158:
            if (r2 != 0) goto L_0x015d
            boolean r2 = r1.f53032k     // Catch:{ Exception -> 0x0249 }
            goto L_0x0161
        L_0x015d:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0161:
            r1.f53032k = r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0166
        L_0x0164:
            r1.f53032k = r3     // Catch:{ Exception -> 0x0249 }
        L_0x0166:
            boolean r2 = r0.has(r8)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x0185
            java.lang.Object r2 = r0.get(r8)     // Catch:{ Exception -> 0x0249 }
            boolean r4 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r4 == 0) goto L_0x0177
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0179
        L_0x0177:
            r2 = r20
        L_0x0179:
            if (r2 != 0) goto L_0x017e
            boolean r2 = r1.f53033l     // Catch:{ Exception -> 0x0249 }
            goto L_0x0182
        L_0x017e:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0182:
            r1.f53033l = r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x0187
        L_0x0185:
            r1.f53033l = r3     // Catch:{ Exception -> 0x0249 }
        L_0x0187:
            boolean r2 = r0.has(r7)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x01a6
            java.lang.Object r2 = r0.get(r7)     // Catch:{ Exception -> 0x0249 }
            boolean r4 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r4 == 0) goto L_0x0198
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x019a
        L_0x0198:
            r2 = r20
        L_0x019a:
            if (r2 != 0) goto L_0x019f
            boolean r2 = r1.f53034m     // Catch:{ Exception -> 0x0249 }
            goto L_0x01a3
        L_0x019f:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x01a3:
            r1.f53034m = r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x01a8
        L_0x01a6:
            r1.f53034m = r3     // Catch:{ Exception -> 0x0249 }
        L_0x01a8:
            boolean r2 = r0.has(r6)     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x01c7
            java.lang.Object r2 = r0.get(r6)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x01b9
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x01bb
        L_0x01b9:
            r2 = r20
        L_0x01bb:
            if (r2 != 0) goto L_0x01c0
            boolean r2 = r1.f53035n     // Catch:{ Exception -> 0x0249 }
            goto L_0x01c4
        L_0x01c0:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x01c4:
            r1.f53035n = r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x01c9
        L_0x01c7:
            r1.f53035n = r3     // Catch:{ Exception -> 0x0249 }
        L_0x01c9:
            r2 = r19
            boolean r3 = r0.has(r2)     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x01e9
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x01dc
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x01de
        L_0x01dc:
            r2 = r20
        L_0x01de:
            if (r2 != 0) goto L_0x01e3
            boolean r2 = r1.f53038q     // Catch:{ Exception -> 0x0249 }
            goto L_0x01e7
        L_0x01e3:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x01e7:
            r1.f53038q = r2     // Catch:{ Exception -> 0x0249 }
        L_0x01e9:
            r2 = r18
            boolean r3 = r0.has(r2)     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0209
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x01fc
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x01fe
        L_0x01fc:
            r2 = r20
        L_0x01fe:
            if (r2 != 0) goto L_0x0203
            boolean r2 = r1.f53039r     // Catch:{ Exception -> 0x0249 }
            goto L_0x0207
        L_0x0203:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0207:
            r1.f53039r = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0209:
            r2 = r17
            boolean r3 = r0.has(r2)     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0229
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x0249 }
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x021c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0249 }
            goto L_0x021e
        L_0x021c:
            r2 = r20
        L_0x021e:
            if (r2 != 0) goto L_0x0223
            boolean r2 = r1.f53040s     // Catch:{ Exception -> 0x0249 }
            goto L_0x0227
        L_0x0223:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0227:
            r1.f53040s = r2     // Catch:{ Exception -> 0x0249 }
        L_0x0229:
            r2 = r16
            boolean r3 = r0.has(r2)     // Catch:{ Exception -> 0x0249 }
            if (r3 == 0) goto L_0x0248
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0249 }
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0249 }
            if (r2 == 0) goto L_0x023d
            r20 = r0
            java.lang.Boolean r20 = (java.lang.Boolean) r20     // Catch:{ Exception -> 0x0249 }
        L_0x023d:
            if (r20 != 0) goto L_0x0242
            boolean r0 = r1.f53041t     // Catch:{ Exception -> 0x0249 }
            goto L_0x0246
        L_0x0242:
            boolean r0 = r20.booleanValue()     // Catch:{ Exception -> 0x0249 }
        L_0x0246:
            r1.f53041t = r0     // Catch:{ Exception -> 0x0249 }
        L_0x0248:
            return
        L_0x0249:
            r0 = move-exception
            java.lang.String r2 = r1.f53022a
            java.lang.String r3 = "processFlags: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = kotlin.jvm.internal.C41536l.m120497q(r3, r0)
            android.util.Log.i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p692zc.C18998b.mo47071t(org.json.JSONObject):void");
    }

    public String toString() {
        return "language: " + this.f53023b + ", allow_document_upload: " + this.f53024c + ", skip_face: " + this.f53026e + ", skip_document: " + this.f53027f + ", require_face_document: " + this.f53028g + ", skip_agreement: " + this.f53029h + ", language: " + this.f53023b + ", allow_nfc_capture: " + this.f53030i + ", server: " + this.f53031j + ", document_type_id: " + this.f53032k + ", document_type_passport: " + this.f53033l + ", document_type_driver_license: " + this.f53034m + ", document_type_residence_license: " + this.f53035n + ", document_type_driver_license_vis: " + this.f53036o + ", inn: " + this.f53037p + ", allow_general_document_capture: " + this.f53038q + ", allow_general_document_upload: " + this.f53039r + ", capture_double_page_passport: " + this.f53040s + ", ";
    }
}
