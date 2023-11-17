package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;
import org.json.JSONObject;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: com.medallia.digital.mobilesdk.w7 */
class C11182w7<T> extends C11133u7<T> {

    /* renamed from: h */
    private C11206x7 f32123h;

    /* renamed from: i */
    private C11206x7 f32124i;

    /* renamed from: j */
    private C11209y1.C11212c f32125j;

    /* renamed from: com.medallia.digital.mobilesdk.w7$a */
    static /* synthetic */ class C11183a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.medallia.digital.mobilesdk.y1$i[] r0 = com.medallia.digital.mobilesdk.C11209y1.C11218i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32126a = r0
                com.medallia.digital.mobilesdk.y1$i r1 = com.medallia.digital.mobilesdk.C11209y1.C11218i.INTEGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32126a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.y1$i r1 = com.medallia.digital.mobilesdk.C11209y1.C11218i.DOUBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11182w7.C11183a.<clinit>():void");
        }
    }

    C11182w7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("right") && !jSONObject.isNull("right")) {
                this.f32123h = new C11206x7(jSONObject.getJSONObject("right"));
            }
            if (jSONObject.has("left") && !jSONObject.isNull("left")) {
                this.f32124i = new C11206x7(jSONObject.getJSONObject("left"));
            }
            if (jSONObject.has("condition") && !jSONObject.isNull("condition")) {
                this.f32125j = C11209y1.C11212c.m41112a(jSONObject.getString("condition"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11209y1.C11212c mo29165a() {
        return this.f32125j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11206x7 mo29166b() {
        return this.f32124i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11206x7 mo29167c() {
        return this.f32123h;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"right\":");
            C11206x7 x7Var = this.f32123h;
            String str = "null";
            sb.append(x7Var == null ? str : x7Var.toJsonString());
            sb.append(",\"left\":");
            C11206x7 x7Var2 = this.f32124i;
            if (x7Var2 != null) {
                str = x7Var2.toJsonString();
            }
            sb.append(str);
            sb.append(",\"condition\":");
            C11209y1.C11212c cVar = this.f32125j;
            sb.append(C11051p3.m40518c(cVar != null ? cVar.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    private String m41018c(String str, C11209y1.C11218i iVar) {
        if (str != null || iVar == null) {
            return str;
        }
        int i = C11183a.f32126a[iVar.ordinal()];
        return (i == 1 || i == 2) ? BankApiResponse.SUCCESSFUL_RESPONSE_CODE : str;
    }

    /* renamed from: a */
    public T mo29048a(ArrayList<C10802f0> arrayList, ArrayList<C10802f0> arrayList2, ArrayList<C11204x5> arrayList3) {
        Class cls;
        super.mo29048a(arrayList, arrayList2, arrayList3);
        if ("$USER_JOURNEY.LastDeclineTimestamp.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.InvitationDisplayed.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.LastSubmitTimestamp.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.SessionCalculatedPercentage.VALUE".equals(this.f32124i.mo29201c())) {
            Broadcasts.C10695h.m38952a("TRE child node: leftValue: " + this.f32124i.mo29201c() + " rightValue: " + this.f32123h.mo29201c());
            C10735b4.m39109b("TRE child node: leftValue: " + this.f32124i.mo29201c() + " rightValue: " + this.f32123h.mo29201c());
        }
        String c = m41018c(mo29049a(this.f32124i.mo29201c(), this.f32124i.mo29200b()), this.f32124i.mo29200b());
        String c2 = m41018c(mo29049a(this.f32123h.mo29201c(), this.f32123h.mo29200b()), this.f32123h.mo29200b());
        String a = mo29050a(this.f32124i.mo29199a(), c, this.f32124i.mo29200b());
        String a2 = mo29050a(this.f32123h.mo29199a(), c2, this.f32123h.mo29200b());
        Object a3 = mo29047a(a, a2, this.f32124i.mo29200b(), this.f32125j);
        if ("$USER_JOURNEY.LastDeclineTimestamp.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.InvitationDisplayed.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.LastSubmitTimestamp.VALUE".equals(this.f32124i.mo29201c()) || "$USER_JOURNEY.SessionCalculatedPercentage.VALUE".equals(this.f32124i.mo29201c())) {
            Broadcasts.C10695h.m38952a("TRE child node: leftValue: " + a + " rightValue: " + a2 + " result: " + a3);
            C10735b4.m39109b("TRE child node: leftValue: " + a + " rightValue: " + a2 + " result: " + a3);
        }
        if (a3 == null) {
            return null;
        }
        if (a3 instanceof Long) {
            cls = Long.class;
        } else if (!(a3 instanceof Boolean)) {
            return null;
        } else {
            cls = Boolean.class;
        }
        return mo29046a(a3, cls);
    }
}
