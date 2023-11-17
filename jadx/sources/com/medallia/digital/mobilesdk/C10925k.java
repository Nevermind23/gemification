package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.k */
class C10925k {

    /* renamed from: f */
    private static final String f31382f = "md_";

    /* renamed from: g */
    private static final String f31383g = "md_android_";

    /* renamed from: h */
    public static final int f31384h = 101;

    /* renamed from: a */
    private C10844h f31385a;

    /* renamed from: b */
    private HashMap<String, Object> f31386b = new HashMap<>();

    /* renamed from: c */
    private boolean f31387c = false;

    /* renamed from: d */
    private boolean f31388d;

    /* renamed from: e */
    private boolean f31389e;

    /* renamed from: com.medallia.digital.mobilesdk.k$a */
    class C10926a extends ArrayList<String> {
        C10926a() {
            add("metadata");
        }
    }

    C10925k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C10874i mo28554A(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28152B())) {
            return null;
        }
        C10733b2 B = this.f31385a.mo28383b().mo28152B();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28152B().mo28111a(), m39880a(jSONObject, B, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C10874i mo28555B(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28154D())) {
            return null;
        }
        C10733b2 D = this.f31385a.mo28383b().mo28154D();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28154D().mo28111a(), m39880a(jSONObject, D, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C10874i mo28556C(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28155E())) {
            return null;
        }
        C10733b2 E = this.f31385a.mo28383b().mo28155E();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28155E().mo28111a(), m39880a(jSONObject, E, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C10874i mo28557D(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28156F())) {
            return null;
        }
        C10733b2 F = this.f31385a.mo28383b().mo28156F();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28156F().mo28111a(), m39880a(jSONObject, F, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C10874i mo28558E(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28157G())) {
            return null;
        }
        C10733b2 G = this.f31385a.mo28383b().mo28157G();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28157G().mo28111a(), m39880a(jSONObject, G, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C10874i mo28559F(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28158H())) {
            return null;
        }
        C10733b2 H = this.f31385a.mo28383b().mo28158H();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28158H().mo28111a(), m39880a(jSONObject, H, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C10874i mo28560G(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28159I())) {
            return null;
        }
        C10733b2 I = this.f31385a.mo28383b().mo28159I();
        GroupType groupType = GroupType.appRating;
        return new C10874i(this.f31385a.mo28383b().mo28159I().mo28111a(), m39880a(jSONObject, I, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C10874i mo28561H(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28160J())) {
            return null;
        }
        C10733b2 J = this.f31385a.mo28383b().mo28160J();
        GroupType groupType = GroupType.appRating;
        return new C10874i(this.f31385a.mo28383b().mo28160J().mo28111a(), m39880a(jSONObject, J, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C10874i mo28562I(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28161K())) {
            return null;
        }
        C10733b2 K = this.f31385a.mo28383b().mo28161K();
        GroupType groupType = GroupType.appRating;
        return new C10874i(this.f31385a.mo28383b().mo28161K().mo28111a(), m39880a(jSONObject, K, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C10874i mo28563J(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28162L())) {
            return null;
        }
        C10733b2 L = this.f31385a.mo28383b().mo28162L();
        GroupType groupType = GroupType.appRating;
        return new C10874i(this.f31385a.mo28383b().mo28162L().mo28111a(), m39880a(jSONObject, L, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C10874i mo28564K(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28163M())) {
            return null;
        }
        C10733b2 M = this.f31385a.mo28383b().mo28163M();
        GroupType groupType = GroupType.appRating;
        return new C10874i(this.f31385a.mo28383b().mo28163M().mo28111a(), m39880a(jSONObject, M, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C10874i mo28565L(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28164N())) {
            return null;
        }
        C10733b2 N = this.f31385a.mo28383b().mo28164N();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28164N().mo28111a(), m39880a(jSONObject, N, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C10874i mo28566M(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28165O())) {
            return null;
        }
        C10733b2 O = this.f31385a.mo28383b().mo28165O();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28165O().mo28111a(), m39880a(jSONObject, O, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C10874i mo28567N(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28166P())) {
            return null;
        }
        C10733b2 P = this.f31385a.mo28383b().mo28166P();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28166P().mo28111a(), m39880a(jSONObject, P, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C10874i mo28568O(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28167Q())) {
            return null;
        }
        C10733b2 Q = this.f31385a.mo28383b().mo28167Q();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28167Q().mo28111a(), m39880a(jSONObject, Q, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public C10874i mo28569P(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28168R())) {
            return null;
        }
        C10733b2 R = this.f31385a.mo28383b().mo28168R();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28168R().mo28111a(), m39880a(jSONObject, R, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C10874i mo28570Q(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28169S())) {
            return null;
        }
        C10733b2 S = this.f31385a.mo28383b().mo28169S();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28169S().mo28111a(), m39880a(jSONObject, S, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public C10874i mo28571R(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28170T())) {
            return null;
        }
        C10733b2 T = this.f31385a.mo28383b().mo28170T();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28170T().mo28111a(), m39880a(jSONObject, T, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C10874i mo28572S(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28171U())) {
            return null;
        }
        C10733b2 U = this.f31385a.mo28383b().mo28171U();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28171U().mo28111a(), m39880a(jSONObject, U, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public C10874i mo28573T(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28173W())) {
            return null;
        }
        C10733b2 W = this.f31385a.mo28383b().mo28173W();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28173W().mo28111a(), m39880a(jSONObject, W, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public C10874i mo28574U(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28174X())) {
            return null;
        }
        C10733b2 X = this.f31385a.mo28383b().mo28174X();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28174X().mo28111a(), m39880a(jSONObject, X, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C10874i mo28575V(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28175Y())) {
            return null;
        }
        C10733b2 Y = this.f31385a.mo28383b().mo28175Y();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28175Y().mo28111a(), m39880a(jSONObject, Y, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public C10874i mo28576W(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28178a0())) {
            return null;
        }
        C10733b2 a0 = this.f31385a.mo28383b().mo28178a0();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28178a0().mo28111a(), m39880a(jSONObject, a0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public C10874i mo28577X(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28182c0())) {
            return null;
        }
        C10733b2 c0 = this.f31385a.mo28383b().mo28182c0();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28182c0().mo28111a(), m39880a(jSONObject, c0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C10874i mo28578Y(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28188f0())) {
            return null;
        }
        C10733b2 f0 = this.f31385a.mo28383b().mo28188f0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28188f0().mo28111a(), m39880a(jSONObject, f0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C10874i mo28579Z(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28192h0())) {
            return null;
        }
        C10733b2 h0 = this.f31385a.mo28383b().mo28192h0();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28192h0().mo28111a(), m39880a(jSONObject, h0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10874i mo28580a() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28191h())) {
            return null;
        }
        return new C10874i(this.f31385a.mo28383b().mo28191h().mo28111a(), m39880a((JSONObject) null, this.f31385a.mo28383b().mo28191h(), GroupType.feedback), GroupType.api, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C10874i mo28585a0(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28190g0())) {
            return null;
        }
        C10733b2 g0 = this.f31385a.mo28383b().mo28190g0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28190g0().mo28111a(), m39880a(jSONObject, g0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10874i mo28586b() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28193i())) {
            return null;
        }
        C10733b2 i = this.f31385a.mo28383b().mo28193i();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28193i().mo28111a(), m39880a((JSONObject) null, i, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C10874i mo28588b0(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28194i0())) {
            return null;
        }
        C10733b2 i0 = this.f31385a.mo28383b().mo28194i0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28194i0().mo28111a(), m39880a(jSONObject, i0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10874i mo28589c() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28172V())) {
            return null;
        }
        C10733b2 V = this.f31385a.mo28383b().mo28172V();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28172V().mo28111a(), m39880a((JSONObject) null, V, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C10874i mo28591c0(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28196j0())) {
            return null;
        }
        C10733b2 j0 = this.f31385a.mo28383b().mo28196j0();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28196j0().mo28111a(), m39880a(jSONObject, j0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C10874i mo28592d() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28176Z())) {
            return null;
        }
        C10733b2 Z = this.f31385a.mo28383b().mo28176Z();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28176Z().mo28111a(), m39880a((JSONObject) null, Z, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C10874i mo28594d0(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28198k0())) {
            return null;
        }
        C10733b2 k0 = this.f31385a.mo28383b().mo28198k0();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28198k0().mo28111a(), m39880a(jSONObject, k0, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C10874i mo28595e() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28180b0())) {
            return null;
        }
        C10733b2 b0 = this.f31385a.mo28383b().mo28180b0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28180b0().mo28111a(), m39880a((JSONObject) null, b0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public C10874i mo28597e0(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28200l0())) {
            return null;
        }
        C10733b2 l0 = this.f31385a.mo28383b().mo28200l0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28200l0().mo28111a(), m39880a(jSONObject, l0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10874i mo28598f() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28184d0())) {
            return null;
        }
        C10733b2 d0 = this.f31385a.mo28383b().mo28184d0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28184d0().mo28111a(), m39880a((JSONObject) null, d0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10874i mo28600g() {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28186e0())) {
            return null;
        }
        C10733b2 e0 = this.f31385a.mo28383b().mo28186e0();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28186e0().mo28111a(), m39880a((JSONObject) null, e0, groupType), groupType, Lifetime.Application);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C10874i mo28602h(JSONObject jSONObject) {
        C10733b2 b2Var = new C10733b2("ExtraDataEvent", true, new C10926a(), false);
        GroupType groupType = GroupType.internalSdk;
        return new C10874i("ExtraDataEvent", m39880a(jSONObject, b2Var, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10874i mo28603i(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28195j())) {
            return null;
        }
        C10733b2 j = this.f31385a.mo28383b().mo28195j();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28195j().mo28111a(), m39880a(jSONObject, j, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10874i mo28604j(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28197k())) {
            return null;
        }
        C10733b2 k = this.f31385a.mo28383b().mo28197k();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28197k().mo28111a(), m39880a(jSONObject, k, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10874i mo28605k(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28199l())) {
            return null;
        }
        C10733b2 l = this.f31385a.mo28383b().mo28199l();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28199l().mo28111a(), m39880a(jSONObject, l, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C10874i mo28606l(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28201m())) {
            return null;
        }
        C10733b2 m = this.f31385a.mo28383b().mo28201m();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28201m().mo28111a(), m39880a(jSONObject, m, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C10874i mo28607m(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28203n())) {
            return null;
        }
        C10733b2 n = this.f31385a.mo28383b().mo28203n();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28203n().mo28111a(), m39880a(jSONObject, n, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C10874i mo28608n(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28204o())) {
            return null;
        }
        C10733b2 o = this.f31385a.mo28383b().mo28204o();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28204o().mo28111a(), m39880a(jSONObject, o, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C10874i mo28609o(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28205p())) {
            return null;
        }
        C10733b2 p = this.f31385a.mo28383b().mo28205p();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28205p().mo28111a(), m39880a(jSONObject, p, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C10874i mo28610p(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28206q())) {
            return null;
        }
        C10733b2 q = this.f31385a.mo28383b().mo28206q();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28206q().mo28111a(), m39880a(jSONObject, q, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C10874i mo28611q(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28207r())) {
            return null;
        }
        C10733b2 r = this.f31385a.mo28383b().mo28207r();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28207r().mo28111a(), m39880a(jSONObject, r, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C10874i mo28612r(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28209t())) {
            return null;
        }
        C10733b2 t = this.f31385a.mo28383b().mo28209t();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28209t().mo28111a(), m39880a(jSONObject, t, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C10874i mo28613s(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28208s())) {
            return null;
        }
        C10733b2 s = this.f31385a.mo28383b().mo28208s();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28208s().mo28111a(), m39880a(jSONObject, s, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C10874i mo28614t(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28210u())) {
            return null;
        }
        C10733b2 u = this.f31385a.mo28383b().mo28210u();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28210u().mo28111a(), m39880a(jSONObject, u, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C10874i mo28615u(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28211v())) {
            return null;
        }
        C10733b2 v = this.f31385a.mo28383b().mo28211v();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28211v().mo28111a(), m39880a(jSONObject, v, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C10874i mo28616v(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28212w())) {
            return null;
        }
        C10733b2 w = this.f31385a.mo28383b().mo28212w();
        GroupType groupType = GroupType.error;
        return new C10874i(this.f31385a.mo28383b().mo28212w().mo28111a(), m39880a(jSONObject, w, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C10874i mo28617w(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28213x())) {
            return null;
        }
        C10733b2 x = this.f31385a.mo28383b().mo28213x();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28213x().mo28111a(), m39880a(jSONObject, x, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C10874i mo28618x(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28214y())) {
            return null;
        }
        C10733b2 y = this.f31385a.mo28383b().mo28214y();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28214y().mo28111a(), m39880a(jSONObject, y, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C10874i mo28619y(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28215z())) {
            return null;
        }
        C10733b2 z = this.f31385a.mo28383b().mo28215z();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28215z().mo28111a(), m39880a(jSONObject, z, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C10874i mo28620z(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28151A())) {
            return null;
        }
        C10733b2 A = this.f31385a.mo28383b().mo28151A();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28151A().mo28111a(), m39880a(jSONObject, A, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10874i mo28581a(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28177a())) {
            return null;
        }
        C10733b2 a = this.f31385a.mo28383b().mo28177a();
        GroupType groupType = GroupType.api;
        return new C10874i(this.f31385a.mo28383b().mo28177a().mo28111a(), m39880a(jSONObject, a, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10874i mo28587b(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28179b())) {
            return null;
        }
        C10733b2 b = this.f31385a.mo28383b().mo28179b();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28179b().mo28111a(), m39880a(jSONObject, b, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10874i mo28590c(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28181c())) {
            return null;
        }
        C10733b2 c = this.f31385a.mo28383b().mo28181c();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28181c().mo28111a(), m39880a(jSONObject, c, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C10874i mo28593d(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28183d())) {
            return null;
        }
        C10733b2 d = this.f31385a.mo28383b().mo28183d();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28183d().mo28111a(), m39880a(jSONObject, d, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C10874i mo28596e(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28185e())) {
            return null;
        }
        C10733b2 e = this.f31385a.mo28383b().mo28185e();
        GroupType groupType = GroupType.feedback;
        return new C10874i(this.f31385a.mo28383b().mo28185e().mo28111a(), m39880a(jSONObject, e, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10874i mo28599f(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28187f())) {
            return null;
        }
        C10733b2 f = this.f31385a.mo28383b().mo28187f();
        GroupType groupType = GroupType.callback;
        return new C10874i(this.f31385a.mo28383b().mo28187f().mo28111a(), m39880a(jSONObject, f, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10874i mo28601g(JSONObject jSONObject) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28189g())) {
            return null;
        }
        C10733b2 g = this.f31385a.mo28383b().mo28189g();
        GroupType groupType = GroupType.internalSdk;
        return new C10874i(this.f31385a.mo28383b().mo28189g().mo28111a(), m39880a(jSONObject, g, groupType), groupType, Lifetime.Session);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10874i mo28582a(JSONObject jSONObject, String str, long j) {
        C10844h hVar = this.f31385a;
        if (hVar == null || hVar.mo28383b() == null || !mo28584a(this.f31385a.mo28383b().mo28153C())) {
            return null;
        }
        C10733b2 C = this.f31385a.mo28383b().mo28153C();
        GroupType groupType = GroupType.error;
        return new C10874i(m39880a(jSONObject, C, groupType), groupType, Lifetime.Session, this.f31385a.mo28383b().mo28153C().mo28111a(), str, j);
    }

    /* renamed from: a */
    private String m39879a(JSONObject jSONObject, String str) {
        try {
            return (!str.contains(f31382f) || jSONObject == null || !jSONObject.has("addOsType") || jSONObject.get("addOsType") == null || !(jSONObject.get("addOsType") instanceof Boolean) || !jSONObject.getBoolean("addOsType")) ? str : str.replace(f31382f, f31383g);
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
            return str;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m39880a(org.json.JSONObject r10, com.medallia.digital.mobilesdk.C10733b2 r11, com.medallia.digital.mobilesdk.GroupType r12) {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.h r2 = r9.f31385a     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r2 = r2.mo28382a()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01cc }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.h r3 = r9.f31385a     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r3 = r3.mo28384c()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01cc }
            r2.<init>(r3)     // Catch:{ Exception -> 0x01cc }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01cc }
        L_0x0027:
            java.util.Iterator r5 = r1.keys()     // Catch:{ Exception -> 0x01cc }
            boolean r5 = r5.hasNext()     // Catch:{ Exception -> 0x01cc }
            if (r5 == 0) goto L_0x0144
            java.util.Iterator r5 = r1.keys()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r5 = r5.next()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x01cc }
            java.lang.String r6 = r1.getString(r5)     // Catch:{ Exception -> 0x01cc }
            r1.remove(r5)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r5 = r9.m39879a((org.json.JSONObject) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x01cc }
            int r7 = r6.hashCode()     // Catch:{ Exception -> 0x01cc }
            switch(r7) {
                case -1482972583: goto L_0x00b7;
                case -765692853: goto L_0x00ad;
                case 3373707: goto L_0x00a3;
                case 31228997: goto L_0x0098;
                case 55126294: goto L_0x008e;
                case 111972721: goto L_0x0084;
                case 130957936: goto L_0x0079;
                case 607796817: goto L_0x006f;
                case 607796829: goto L_0x0065;
                case 1109191185: goto L_0x005b;
                case 1182299953: goto L_0x004f;
                default: goto L_0x004d;
            }     // Catch:{ Exception -> 0x01cc }
        L_0x004d:
            goto L_0x00c1
        L_0x004f:
            java.lang.String r7 = "isSampling"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 10
            goto L_0x00c2
        L_0x005b:
            java.lang.String r7 = "deviceId"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 6
            goto L_0x00c2
        L_0x0065:
            java.lang.String r7 = "sessionIp"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 7
            goto L_0x00c2
        L_0x006f:
            java.lang.String r7 = "sessionId"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 0
            goto L_0x00c2
        L_0x0079:
            java.lang.String r7 = "globalEnvironment"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 9
            goto L_0x00c2
        L_0x0084:
            java.lang.String r7 = "value"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 2
            goto L_0x00c2
        L_0x008e:
            java.lang.String r7 = "timestamp"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 4
            goto L_0x00c2
        L_0x0098:
            java.lang.String r7 = "eventName"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 8
            goto L_0x00c2
        L_0x00a3:
            java.lang.String r7 = "name"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 1
            goto L_0x00c2
        L_0x00ad:
            java.lang.String r7 = "valueType"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 3
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r7 = "groupType"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x01cc }
            if (r7 == 0) goto L_0x00c1
            r7 = 5
            goto L_0x00c2
        L_0x00c1:
            r7 = -1
        L_0x00c2:
            java.lang.String r8 = ""
            switch(r7) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0134;
                case 2: goto L_0x0108;
                case 3: goto L_0x0101;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00d6;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00c9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x0027
        L_0x00c9:
            boolean r6 = r9.f31387c     // Catch:{ Exception -> 0x01cc }
            if (r6 == 0) goto L_0x0027
            boolean r6 = r11.mo28114d()     // Catch:{ Exception -> 0x01cc }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0027
        L_0x00d6:
            java.lang.String r7 = r2.getString(r6)     // Catch:{ Exception -> 0x01cc }
            if (r7 != 0) goto L_0x00e6
            java.lang.String r6 = "Analytics V2 parsing error externalDataJson key is null"
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r6)     // Catch:{ Exception -> 0x01cc }
            r0.put(r5, r8)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0027
        L_0x00e6:
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0103
        L_0x00eb:
            com.medallia.digital.mobilesdk.s6 r6 = com.medallia.digital.mobilesdk.C11089s6.m40668b()     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.s6$a r7 = com.medallia.digital.mobilesdk.C11089s6.C11090a.DEVICE_ID     // Catch:{ Exception -> 0x01cc }
            r8 = 0
            java.lang.String r6 = r6.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0103
        L_0x00f7:
            r0.put(r5, r12)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0027
        L_0x00fc:
            r0.put(r5, r3)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0027
        L_0x0101:
            com.medallia.digital.mobilesdk.ValueType r6 = com.medallia.digital.mobilesdk.ValueType.TypeString     // Catch:{ Exception -> 0x01cc }
        L_0x0103:
            r0.put(r5, r6)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0027
        L_0x0108:
            r0.put(r5, r10)     // Catch:{ Exception -> 0x01cc }
            if (r10 == 0) goto L_0x0027
            org.json.JSONObject r5 = r9.m39881a((org.json.JSONObject) r2, (org.json.JSONObject) r10)     // Catch:{ Exception -> 0x01cc }
            if (r5 != 0) goto L_0x0115
            goto L_0x0027
        L_0x0115:
            java.util.Iterator r6 = r5.keys()     // Catch:{ Exception -> 0x01cc }
            boolean r6 = r6.hasNext()     // Catch:{ Exception -> 0x01cc }
            if (r6 == 0) goto L_0x0027
            java.util.Iterator r6 = r5.keys()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r6 = r6.next()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r7 = r5.get(r6)     // Catch:{ Exception -> 0x01cc }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x01cc }
            r5.remove(r6)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0115
        L_0x0134:
            java.lang.String r6 = r11.mo28111a()     // Catch:{ Exception -> 0x01cc }
            goto L_0x0103
        L_0x0139:
            com.medallia.digital.mobilesdk.s6 r6 = com.medallia.digital.mobilesdk.C11089s6.m40668b()     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.s6$a r7 = com.medallia.digital.mobilesdk.C11089s6.C11090a.SESSION_ID     // Catch:{ Exception -> 0x01cc }
            java.lang.String r6 = r6.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0103
        L_0x0144:
            java.util.ArrayList r10 = r11.mo28112b()     // Catch:{ Exception -> 0x01cc }
            if (r10 == 0) goto L_0x01d4
            java.util.ArrayList r10 = r11.mo28112b()     // Catch:{ Exception -> 0x01cc }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x01cc }
            if (r10 != 0) goto L_0x01d4
            java.util.ArrayList r10 = r11.mo28112b()     // Catch:{ Exception -> 0x01cc }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x01cc }
        L_0x015c:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x01cc }
            if (r11 == 0) goto L_0x01d4
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.h r12 = r9.f31385a     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r12 = r12.mo28385d()     // Catch:{ Exception -> 0x01cc }
            boolean r12 = r12.has(r11)     // Catch:{ Exception -> 0x01cc }
            if (r12 == 0) goto L_0x015c
            com.medallia.digital.mobilesdk.h r12 = r9.f31385a     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r12 = r12.mo28385d()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ Exception -> 0x01cc }
            if (r12 == 0) goto L_0x015c
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.h r1 = r9.f31385a     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r1 = r1.mo28385d()     // Catch:{ Exception -> 0x01cc }
            org.json.JSONObject r11 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cc }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01cc }
        L_0x0193:
            java.util.Iterator r11 = r12.keys()     // Catch:{ Exception -> 0x01cc }
            boolean r11 = r11.hasNext()     // Catch:{ Exception -> 0x01cc }
            if (r11 == 0) goto L_0x015c
            java.util.Iterator r11 = r12.keys()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r11 = r11.next()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01cc }
            java.lang.String r1 = r12.getString(r11)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r1 = r9.m39879a((org.json.JSONObject) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x01cc }
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r3 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r3 = r3.getByName(r11)     // Catch:{ Exception -> 0x01cc }
            if (r3 != 0) goto L_0x01c5
            if (r11 == 0) goto L_0x01c5
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = r9.f31386b     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = r11.toLowerCase()     // Catch:{ Exception -> 0x01cc }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x01cc }
        L_0x01c5:
            r0.put(r1, r3)     // Catch:{ Exception -> 0x01cc }
            r12.remove(r11)     // Catch:{ Exception -> 0x01cc }
            goto L_0x0193
        L_0x01cc:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r10)
        L_0x01d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10925k.m39880a(org.json.JSONObject, com.medallia.digital.mobilesdk.b2, com.medallia.digital.mobilesdk.GroupType):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m39881a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        StringBuilder sb;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.contains(f31382f)) {
                str = m39879a(jSONObject, next);
            } else {
                if (jSONObject != null) {
                    try {
                        if (jSONObject.has("addOsType") && jSONObject.get("addOsType") != null && (jSONObject.get("addOsType") instanceof Boolean) && jSONObject.getBoolean("addOsType")) {
                            sb = new StringBuilder();
                            sb.append(f31383g);
                            sb.append(next);
                            str = sb.toString();
                        }
                    } catch (JSONException e) {
                        C10735b4.m39111c(e.getMessage());
                        str = "";
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f31382f);
                sb2.append(next);
                sb = sb2;
                str = sb.toString();
            }
            try {
                jSONObject3.put(str, jSONObject2.get(next));
            } catch (JSONException e2) {
                C10735b4.m39111c(e2.getMessage());
            }
        }
        return jSONObject3;
    }

    /* renamed from: a */
    private void m39882a(int i) {
        String str;
        boolean z = true;
        if (this.f31387c) {
            C10735b4.m39113e("Sampling events mechanism is enabled");
            if (i == 0) {
                this.f31388d = false;
                str = "Sampling events mechanism shouldCollectEvents:false, samplePercent:0";
            } else {
                int nextInt = new Random().nextInt(101);
                if (i < nextInt) {
                    z = false;
                }
                this.f31388d = z;
                str = "Sampling events mechanism shouldCollectEvents: " + this.f31388d + ", samplePercent: " + i + ", random: " + nextInt;
            }
            C10735b4.m39109b(str);
            CollectorsInfrastructure.getInstance().setIsSessionSampledEventsCollector(this.f31388d);
            CollectorsInfrastructure.getInstance().setSessionPercentageSampledEventsCollector(i);
            return;
        }
        this.f31388d = true;
        C10735b4.m39113e("Sampling events mechanism is disabled");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28583a(C10844h hVar, HashMap<String, Object> hashMap, C10894j jVar) {
        int i;
        this.f31385a = hVar;
        this.f31386b = hashMap;
        if (jVar != null) {
            this.f31389e = jVar.mo28503e();
            this.f31387c = jVar.mo28504f();
            i = jVar.mo28502d();
        } else {
            i = 0;
        }
        m39882a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo28584a(C10733b2 b2Var) {
        if (b2Var == null || !this.f31389e) {
            C10735b4.m39113e("shouldReportAnalyticsV2: false");
            return false;
        } else if (!this.f31387c || !b2Var.mo28114d()) {
            C10735b4.m39113e("shouldReportAnalyticsV2 event: " + b2Var.mo28111a() + " isAnalyticsEnabled: " + b2Var.mo28113c());
            return b2Var.mo28113c();
        } else {
            C10735b4.m39113e("shouldReportAnalyticsV2 event: " + b2Var.mo28111a() + " shouldCollectEvents: " + this.f31388d);
            return this.f31388d;
        }
    }
}
