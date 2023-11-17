package p692zc;

import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: zc.i */
public final class C19008i {

    /* renamed from: a */
    private final C18998b f53079a;

    /* renamed from: b */
    private Integer f53080b;

    /* renamed from: c */
    private Integer f53081c;

    /* renamed from: d */
    private Integer f53082d;

    /* renamed from: e */
    private Integer f53083e;

    /* renamed from: f */
    private Integer f53084f;

    /* renamed from: g */
    private Integer f53085g;

    /* renamed from: h */
    private Integer f53086h;

    /* renamed from: i */
    private Integer f53087i;

    /* renamed from: j */
    private Integer f53088j;

    /* renamed from: k */
    private Integer f53089k;

    /* renamed from: l */
    private Integer f53090l;

    /* renamed from: m */
    private Integer f53091m;

    /* renamed from: n */
    private Integer f53092n;

    /* renamed from: o */
    private Integer f53093o;

    /* renamed from: p */
    private boolean f53094p;

    /* renamed from: q */
    private int f53095q = 1;

    /* renamed from: r */
    private C18999c f53096r = new C18999c();

    /* renamed from: s */
    private String f53097s = "";

    public C19008i(C18998b bVar) {
        C41536l.m120489i(bVar, "flags");
        this.f53079a = bVar;
    }

    /* renamed from: a */
    public final String mo47136a() {
        return this.f53097s;
    }

    /* renamed from: b */
    public final Integer mo47137b() {
        return this.f53092n;
    }

    /* renamed from: c */
    public final Integer mo47138c() {
        return this.f53086h;
    }

    /* renamed from: d */
    public final Integer mo47139d() {
        return this.f53090l;
    }

    /* renamed from: e */
    public final C18999c mo47140e() {
        return this.f53096r;
    }

    /* renamed from: f */
    public final Integer mo47141f() {
        return this.f53080b;
    }

    /* renamed from: g */
    public final Integer mo47142g() {
        return this.f53082d;
    }

    /* renamed from: h */
    public final Integer mo47143h() {
        return this.f53084f;
    }

    /* renamed from: i */
    public final Integer mo47144i() {
        return this.f53088j;
    }

    /* renamed from: j */
    public final Integer mo47145j() {
        return this.f53081c;
    }

    /* renamed from: k */
    public final Integer mo47146k() {
        return this.f53083e;
    }

    /* renamed from: l */
    public final int mo47147l() {
        return this.f53095q;
    }

    /* renamed from: m */
    public final Integer mo47148m() {
        return this.f53093o;
    }

    /* renamed from: n */
    public final Integer mo47149n() {
        return this.f53085g;
    }

    /* renamed from: o */
    public final Integer mo47150o() {
        return this.f53089k;
    }

    /* renamed from: p */
    public final boolean mo47151p() {
        return this.f53094p;
    }

    /* renamed from: q */
    public final Integer mo47152q() {
        return this.f53087i;
    }

    /* renamed from: r */
    public final Integer mo47153r() {
        return this.f53091m;
    }

    /* renamed from: s */
    public final void mo47154s(JSONObject jSONObject) {
        String str;
        C41536l.m120489i(jSONObject, "result");
        if (jSONObject.has(C41536l.m120497q("agreement_", this.f53079a.mo47064m()))) {
            str = jSONObject.getString(C41536l.m120497q("agreement_", this.f53079a.mo47064m()));
            C41536l.m120488h(str, "{\n            result.getString(\"agreement_\" + flags.language)\n        }");
        } else {
            if (jSONObject.has("agreement_en")) {
                str = jSONObject.getString("agreement_en");
            } else {
                str = "";
            }
            C41536l.m120488h(str, "{\n            if (result.has(\"agreement_en\")) {\n                result.getString(\"agreement_en\")\n            } else {\n                \"\"\n            }\n        }");
        }
        this.f53097s = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47155t(java.util.Map r5) {
        /*
            r4 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "liveness_neutral_icon"
            boolean r1 = r5.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0019
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            r4.f53080b = r0
        L_0x001c:
            java.lang.String r0 = "liveness_smile_icon"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x002f
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            r4.f53081c = r0
        L_0x0032:
            java.lang.String r0 = "liveness_neutral_icon_record"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0048
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r4.f53082d = r0
        L_0x0048:
            java.lang.String r0 = "liveness_smile_icon_record"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x005e
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x005b
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            r4.f53083e = r0
        L_0x005e:
            java.lang.Integer r0 = r4.f53082d
            if (r0 != 0) goto L_0x0066
            java.lang.Integer r0 = r4.f53080b
            r4.f53082d = r0
        L_0x0066:
            java.lang.Integer r0 = r4.f53083e
            if (r0 != 0) goto L_0x006e
            java.lang.Integer r0 = r4.f53081c
            r4.f53082d = r0
        L_0x006e:
            java.lang.String r0 = "liveness_retry_icon"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0084
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0081
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0082
        L_0x0081:
            r0 = r2
        L_0x0082:
            r4.f53084f = r0
        L_0x0084:
            java.lang.String r0 = "scan_retry_icon"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x009a
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0097
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0098
        L_0x0097:
            r0 = r2
        L_0x0098:
            r4.f53085g = r0
        L_0x009a:
            java.lang.String r0 = "camera_deny_icon"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x00ad
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = r2
        L_0x00ae:
            r4.f53086h = r0
        L_0x00b0:
            java.lang.String r0 = "upload_retry_icon"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x00c3
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x00c4
        L_0x00c3:
            r0 = r2
        L_0x00c4:
            r4.f53087i = r0
        L_0x00c6:
            java.lang.String r0 = "liveness_retry_icon_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x00d9
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x00da
        L_0x00d9:
            r0 = r2
        L_0x00da:
            r4.f53088j = r0
        L_0x00dc:
            java.lang.String r0 = "scan_retry_icon_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x00ef
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x00f0
        L_0x00ef:
            r0 = r2
        L_0x00f0:
            r4.f53089k = r0
        L_0x00f2:
            java.lang.String r0 = "camera_deny_icon_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0108
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0105
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0106
        L_0x0105:
            r0 = r2
        L_0x0106:
            r4.f53090l = r0
        L_0x0108:
            java.lang.String r0 = "upload_retry_icon_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x011e
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x011b
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x011c
        L_0x011b:
            r0 = r2
        L_0x011c:
            r4.f53091m = r0
        L_0x011e:
            java.lang.String r0 = "skip_liveness_instructions"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x013c
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x0131
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0132
        L_0x0131:
            r0 = r2
        L_0x0132:
            if (r0 != 0) goto L_0x0136
            r0 = 0
            goto L_0x013a
        L_0x0136:
            boolean r0 = r0.booleanValue()
        L_0x013a:
            r4.f53094p = r0
        L_0x013c:
            java.lang.String r0 = "liveness_type"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x015a
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x014f
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0150
        L_0x014f:
            r0 = r2
        L_0x0150:
            if (r0 != 0) goto L_0x0154
            r0 = 1
            goto L_0x0158
        L_0x0154:
            int r0 = r0.intValue()
        L_0x0158:
            r4.f53095q = r0
        L_0x015a:
            java.lang.String r0 = "button_corner_radius"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0170
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x016d
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x016e
        L_0x016d:
            r0 = r2
        L_0x016e:
            r4.f53092n = r0
        L_0x0170:
            java.lang.String r0 = "panel_elevation"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0186
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0183
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0184
        L_0x0183:
            r0 = r2
        L_0x0184:
            r4.f53093o = r0
        L_0x0186:
            java.lang.String r0 = "title_font"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x019f
            zc.c r1 = r4.f53096r
            java.lang.Object r0 = r5.get(r0)
            boolean r3 = r0 instanceof android.graphics.Typeface
            if (r3 == 0) goto L_0x019b
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            goto L_0x019c
        L_0x019b:
            r0 = r2
        L_0x019c:
            r1.mo47084l(r0)
        L_0x019f:
            java.lang.String r0 = "title_font_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x01c5
            zc.c r1 = r4.f53096r
            java.lang.Object r0 = r5.get(r0)
            boolean r3 = r0 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x01b4
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x01b5
        L_0x01b4:
            r0 = r2
        L_0x01b5:
            if (r0 != 0) goto L_0x01be
            zc.c r0 = r4.f53096r
            int r0 = r0.mo47076d()
            goto L_0x01c2
        L_0x01be:
            int r0 = r0.intValue()
        L_0x01c2:
            r1.mo47085m(r0)
        L_0x01c5:
            java.lang.String r0 = "head1_font"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x01de
            zc.c r1 = r4.f53096r
            java.lang.Object r0 = r5.get(r0)
            boolean r3 = r0 instanceof android.graphics.Typeface
            if (r3 == 0) goto L_0x01da
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            goto L_0x01db
        L_0x01da:
            r0 = r2
        L_0x01db:
            r1.mo47080h(r0)
        L_0x01de:
            java.lang.String r0 = "head1_font_size"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x0204
            zc.c r1 = r4.f53096r
            java.lang.Object r0 = r5.get(r0)
            boolean r3 = r0 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x01f3
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x01f4
        L_0x01f3:
            r0 = r2
        L_0x01f4:
            if (r0 != 0) goto L_0x01fd
            zc.c r0 = r4.f53096r
            int r0 = r0.mo47074b()
            goto L_0x0201
        L_0x01fd:
            int r0 = r0.intValue()
        L_0x0201:
            r1.mo47081i(r0)
        L_0x0204:
            java.lang.String r0 = "head2_font"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x021d
            zc.c r1 = r4.f53096r
            java.lang.Object r0 = r5.get(r0)
            boolean r3 = r0 instanceof android.graphics.Typeface
            if (r3 == 0) goto L_0x0219
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            goto L_0x021a
        L_0x0219:
            r0 = r2
        L_0x021a:
            r1.mo47082j(r0)
        L_0x021d:
            java.lang.String r0 = "head2_font_size"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0245
            zc.c r0 = r4.f53096r
            java.lang.String r1 = "head2_font_size"
            java.lang.Object r1 = r5.get(r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0234
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0235
        L_0x0234:
            r1 = r2
        L_0x0235:
            if (r1 != 0) goto L_0x023e
            zc.c r1 = r4.f53096r
            int r1 = r1.mo47075c()
            goto L_0x0242
        L_0x023e:
            int r1 = r1.intValue()
        L_0x0242:
            r0.mo47083k(r1)
        L_0x0245:
            java.lang.String r0 = "body_font"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0260
            zc.c r0 = r4.f53096r
            java.lang.String r1 = "body_font"
            java.lang.Object r1 = r5.get(r1)
            boolean r3 = r1 instanceof android.graphics.Typeface
            if (r3 == 0) goto L_0x025c
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L_0x025d
        L_0x025c:
            r1 = r2
        L_0x025d:
            r0.mo47077e(r1)
        L_0x0260:
            java.lang.String r0 = "body_font_size"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0287
            zc.c r0 = r4.f53096r
            java.lang.String r1 = "body_font_size"
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0277
            r2 = r5
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0277:
            if (r2 != 0) goto L_0x0280
            zc.c r5 = r4.f53096r
            int r5 = r5.mo47073a()
            goto L_0x0284
        L_0x0280:
            int r5 = r2.intValue()
        L_0x0284:
            r0.mo47078f(r5)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p692zc.C19008i.mo47155t(java.util.Map):void");
    }

    public String toString() {
        return "buttonCornerRadius: " + this.f53092n + ", panelElevation: " + this.f53093o + ", skipLivenessInstructions: " + this.f53094p + ", agreement: " + this.f53097s.length() + ", ";
    }
}
