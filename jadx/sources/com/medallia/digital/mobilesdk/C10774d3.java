package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.d3 */
enum C10774d3 {
    BANNER,
    ALERT,
    THANK_YOU_PROMPT,
    FORM;

    /* renamed from: a */
    protected static C10774d3 m39308a(String str) {
        C10774d3 d3Var = BANNER;
        if (d3Var.name().equals(str)) {
            return d3Var;
        }
        C10774d3 d3Var2 = ALERT;
        if (d3Var2.name().equals(str)) {
            return d3Var2;
        }
        C10774d3 d3Var3 = THANK_YOU_PROMPT;
        if (d3Var3.name().equals(str)) {
            return d3Var3;
        }
        C10774d3 d3Var4 = FORM;
        if (d3Var4.name().equals(str)) {
            return d3Var4;
        }
        return null;
    }
}
